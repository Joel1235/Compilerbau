package Codegenerierung;


import Expr.*;

import General.AType;
import org.objectweb.asm.*;
import statementExpressions.*;
import statements.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Codegenerierung {

    private MethodVisitor methodvisitor;
    private List<String> localVars;
    private String currentClass;

    //Method to start Codegen
    public void Start(Block block) throws IOException {
        localVars=new ArrayList();
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

        cw.visit(Opcodes.V1_8,                  //Version
                Opcodes.ACC_PUBLIC,            //Access
                "Testcode",                    //Name
                null,                          //Signatur
                "java/lang/Object",            //Superklasse
                null);                         //implemntierte Interfaces

        MethodVisitor constructor =
                cw.visitMethod(Opcodes.ACC_PUBLIC,
                        "<init>",        //Name
                        "()V",           //Typ (Descriptor)
                        null,            //Signatur
                        null);           //Exceptions

        this.methodvisitor =
                cw.visitMethod(Opcodes.ACC_PUBLIC, "m", "()V", null, null);

        //Konstruktor erstellen Start
        constructor.visitCode();               //Start-Initialisierung
        // aload_0
        constructor.visitVarInsn(Opcodes.ALOAD, 0);
        // invokespecial
        constructor.visitMethodInsn(Opcodes.INVOKESPECIAL,  //invoke-Befehl
                "java/lang/Object",     //Owner-Klasse
                "<init>",               //Name
                "()V",                  //Typ (Descriptor)
                false);                 //is interface?
        // return
        constructor.visitInsn(Opcodes.RETURN);

        constructor.visitMaxs(0, 0);          //maximale Anzahl des Stacks bzw. der lokalen Veriablen

        constructor.visitEnd();               //Ende-Initialisierung
        //Konstruktor erstellen Ende

        //Methode m erstellen Start
        methodvisitor.visitCode();

        // Hier dann das eingegebene Objekt abarbeiten

        block.bevisited(this);
        // return
        methodvisitor.visitInsn(Opcodes.RETURN);

        methodvisitor.visitMaxs(0, 0);

        methodvisitor.visitEnd();
        //Methode m erstellen Ende

        cw.visitEnd();
        System.out.println(cw.toByteArray());
        writeClassfile(cw);
        //return cw.toByteArray();
    }


    //Expressions

    public void visit(ACharacter aCharacter) {
        char aCharacterValue = aCharacter.getValue();
        if (aCharacterValue <= Byte.MAX_VALUE) {
            methodvisitor.visitIntInsn(Opcodes.BIPUSH, aCharacterValue);
        } else if (aCharacterValue <= Short.MAX_VALUE) {
            methodvisitor.visitIntInsn(Opcodes.SIPUSH, aCharacterValue);
        } else {
            methodvisitor.visitLdcInsn(aCharacterValue);
        }
    }

    public void visit(AInteger aInteger) {
        int value = aInteger.getValue();

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            methodvisitor.visitIntInsn(Opcodes.BIPUSH, value);
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            methodvisitor.visitIntInsn(Opcodes.SIPUSH, value);
        } else {
            methodvisitor.visitLdcInsn(value);
        }
    }

    public void visit(AString aString) {
        methodvisitor.visitLdcInsn(aString.getValue());
    }

    public void visit(Binary binary) {
        switch (binary.getOperator()) {
            case PLUS, MINUS, MULTIPLY, DIVIDE, MODULUS -> addMathCodes(binary);
            case GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL_TO, LESS_THAN_OR_EQUAL_TO, EQUAL_TO, NOT_EQUAL_TO, AND, OR -> addBooleanCodes(binary);
        }
    }

    private void addMathCodes(Binary binary) {
        binary.getLeft().bevisited(this);
        binary.getRight().bevisited(this);

        switch (binary.getOperator()) {
            case PLUS -> methodvisitor.visitInsn(Opcodes.IADD);
            case MINUS -> methodvisitor.visitInsn(Opcodes.ISUB);
            case MULTIPLY -> methodvisitor.visitInsn(Opcodes.IMUL);
            case DIVIDE -> methodvisitor.visitInsn(Opcodes.IDIV);
            case MODULUS -> methodvisitor.visitInsn(Opcodes.IREM);

        }
    }

    private void addBooleanCodes(Binary binary) {

        Label trueLabel = new Label();
        Label falseLabel = new Label();
        Label end = new Label();

        switch (binary.getOperator()) {
            case AND -> {
                binary.getLeft().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IFEQ, falseLabel); // one false is enough
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IFEQ, falseLabel);
            }
            case OR -> {
                binary.getLeft().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IFNE, trueLabel); // one true is enough
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IFEQ, falseLabel);
            }
            case GREATER_THAN -> {
                binary.getLeft().bevisited(this);
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IF_ICMPLE, falseLabel);
            }
            case LESS_THAN -> {
                binary.getLeft().bevisited(this);
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IF_ICMPGE, falseLabel);
            }
            case GREATER_THAN_OR_EQUAL_TO -> {
                binary.getLeft().bevisited(this);
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IF_ICMPLT, falseLabel);
            }
            case LESS_THAN_OR_EQUAL_TO -> {
                binary.getLeft().bevisited(this);
                binary.getRight().bevisited(this);
                methodvisitor.visitJumpInsn(Opcodes.IF_ICMPGT, falseLabel);
            }

            // case EQUAL_TO and case NOT_EQUAL_TO missing, I didn't know how

        }

        methodvisitor.visitLabel(trueLabel);
        methodvisitor.visitInsn(Opcodes.ICONST_1);
        methodvisitor.visitJumpInsn(Opcodes.GOTO, end);

        methodvisitor.visitLabel(falseLabel);
        methodvisitor.visitInsn(Opcodes.ICONST_0);

        methodvisitor.visitLabel(end);
    }


    public void visit(LocalOrFieldVar localOrFieldVar) {
        int index = localVars.indexOf(localOrFieldVar.getId());
        if (index > -1) { //local var, because found in localvars
            if (localOrFieldVar.getType().getTypeName().equals("int") ||
                    localOrFieldVar.getType().getTypeName().equals("void") ||
                    localOrFieldVar.getType().getTypeName().equals("char") ||
                    localOrFieldVar.getType().getTypeName().equals("boolean")) {
                methodvisitor.visitVarInsn(Opcodes.ILOAD, index);
            } else {
                methodvisitor.visitVarInsn(Opcodes.ALOAD, index);
            }
        } else { // fieldvar, because not found in localvars
            methodvisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodvisitor.visitFieldInsn(Opcodes.GETFIELD, currentClass, localOrFieldVar.getId(),
                    makeDescriptor(localOrFieldVar.getType()));
        }
    }


    public void visit(Unary unary) { //accepts only Not as an unary input

        Label trueLabel = new Label();
        Label falseLabel = new Label();
        Label end = new Label();
        unary.getExpr().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.IFNE, falseLabel); //Jump to falseinsert in case the value is not 0, therefore true

        methodvisitor.visitLabel(trueLabel);
        methodvisitor.visitInsn(Opcodes.ICONST_1);
        methodvisitor.visitJumpInsn(Opcodes.GOTO, end);

        methodvisitor.visitLabel(falseLabel);
        methodvisitor.visitInsn(Opcodes.ICONST_0);

        methodvisitor.visitLabel(end);
    }

    public void visit(InstVar instVar) {
        Expression expression = instVar.getExpr();
        expression.bevisited(this);

        methodvisitor.visitFieldInsn(Opcodes.GETFIELD, this.currentClass, instVar.getId(),
                makeDescriptor(instVar.getType()));

    }

    public void visit(Anull nullExpr) {
        methodvisitor.visitInsn(Opcodes.ACONST_NULL);
    }

//Statements

    public void visit(Block block) {
        block.getStatements().forEach(statement -> {
            statement.bevisited(this);
        });
    }

    public void visit(For forvar) {
        Label forlabel = new Label();
        Label end = new Label();

        forvar.getInitStmt().bevisited(this);
        methodvisitor.visitLabel(forlabel);
        forvar.getCondition().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.IFEQ, end);

        forvar.getBody().bevisited(this);
        forvar.getUpdateStmt().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.GOTO, forlabel);
        methodvisitor.visitLabel(end);
    }

    public void visit(If ifvar) {
        Label falseLabel = new Label();
        Label end = new Label();

        ifvar.getCondition().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.IFEQ, falseLabel); //0 means the condition is false

        ifvar.getIfBlock().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.GOTO, end);

        methodvisitor.visitLabel(falseLabel);
        if (ifvar.getElseBlock() != null) {
            ifvar.getElseBlock().bevisited(this);
        }
        methodvisitor.visitLabel(end);
    }

    public void visit(LocalVarDecl localVarDecl) {
        localVarDecl.getExpr().bevisited(this);
        localVars.add(localVarDecl.getId());
        if (localVarDecl.getType().getTypeName().equals("int") ||
                localVarDecl.getType().getTypeName().equals("void") ||
                localVarDecl.getType().getTypeName().equals("char") ||
                localVarDecl.getType().getTypeName().equals("boolean")) {
            methodvisitor.visitVarInsn(Opcodes.ISTORE, localVars.indexOf(localVarDecl.getId()));
        } else {
            methodvisitor.visitVarInsn(Opcodes.ASTORE, localVars.indexOf(localVarDecl.getId()));
        }
    }

    public void visit(Return returnvar) {
        if (returnvar.getExpr() == null) {
            methodvisitor.visitInsn(Opcodes.RETURN);
        } else {
            returnvar.getExpr().bevisited(this);
            if (returnvar.getExpr().getType().getTypeName().equals("int") ||
                    returnvar.getExpr().getType().getTypeName().equals("void") ||
                    returnvar.getExpr().getType().getTypeName().equals("char") ||
                    returnvar.getExpr().getType().getTypeName().equals("boolean")) {
                methodvisitor.visitInsn(Opcodes.IRETURN);
            } else {
                methodvisitor.visitInsn(Opcodes.ARETURN);
            }
        }
    }


    public void visit(While whilevar) {
        Label whilelabel = new Label();
        Label end = new Label();

        methodvisitor.visitLabel(whilelabel);
        whilevar.getCondition().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.IFEQ, end);

        whilevar.getBlock().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.GOTO, whilelabel);
        methodvisitor.visitLabel(end);
    }

    //StatementExpressions

    public void visit(AssignStmt assignStmt) {
        System.out.println("Not implemented");
    }

    public void visit(DecrementExpr decrementExpr) {
        System.out.println("Not implemented");
    }

    public void visit(IncrementExpr incrementExpr) {
        System.out.println("Not implemented");
    }

    public void visit(Method method) {
        System.out.println("Not implemented");
    }

    public void visit(MethodCall methodCall) {

        methodCall.getExprList().forEach(expression -> expression.bevisited(this));
        methodvisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, this.currentClass,
                methodCall.getId(), makeMethodcallDescriptor(methodCall.getExprList()),
                false);

    }

    public void visit(New newvar) {
        System.out.println("Not implemented");
    }


    //Helpers
    void writeClassfile(ClassWriter cw) throws IOException {
        byte[] bytes = cw.toByteArray();
        String className = new ClassReader(bytes).getClassName();
        File outputFile = new File("./", className + ".class");
        FileOutputStream output = new FileOutputStream(outputFile);
        output.write(bytes);
        output.close();
    }

    public String makeMethodcallDescriptor(List<Expression> expressions) {
        StringBuilder Descriptor = new StringBuilder();
        for (Expression expression :
                expressions) {
            Descriptor.append(makeDescriptor(expression.getType()));
        }
        return Descriptor.toString();
    }

    public String makeDescriptor(AType aType) {
        return switch (aType.getTypeName()) {
            case "void" -> "V";
            case "int" -> "I";
            case "char" -> "C";
            case "boolean" -> "Z";
            default -> "T";
        };
    }

}
