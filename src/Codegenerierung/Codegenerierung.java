package Codegenerierung;


import Expr.*;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import statementExpressions.*;
import statements.*;

import java.util.List;

public class Codegenerierung {

    private MethodVisitor methodvisitor;
    private List<LocalOrFieldVar> localVars;
    private String currentClass;


    //Expressions

    public void visit(ACharacter aCharacter){
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

    public void visit(AString aString){

    }

    public void visit(Binary binary){
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


    public void visit(IdExpr idExpr){

    }

    public void visit(LocalOrFieldVar localOrFieldVar){

    }

    public void visit(StmtExprExpr stmtExprExpr){

    }

    public void visit(Super superVar){

    }

    public void visit(Unary unary){ //accepts only Not as an unary input

        Label trueLabel = new Label();
        Label falseLabel = new Label();
        Label end = new Label();
        unary.getExpr().bevisited(this);
        methodvisitor.visitJumpInsn(Opcodes.IFNE, falseLabel); //Jump to falseinsert in case the value is true

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
        //this.lastClass = ((ReferenceType) expression.getType()).getIdentifier();

        methodvisitor.visitFieldInsn(Opcodes.GETFIELD, this.currentClass, instVar.getId(),
                instVar.getAtype().toString());// V I C Z benötigt

    }

    public void visit(Anull nullExpr) {
        methodvisitor.visitInsn(Opcodes.ACONST_NULL);
    }

//Statements

    public void visit(Block block){

    }

    public void visit(For forvar){

    }

    public void visit(If ifvar){

    }

    public void visit(LocalVarDecl localVarDecl){

    }

    public void visit(Return returnvar){

    }

    public void visit(StmtExprStmt stmtExprStmt){

    }

    public void visit(While whilevar){

    }

    //StatementExpressions

    public void visit(AssignStmt assignStmt){

    }

    public void visit(DecrementExpr decrementExpr){

    }

    public void visit(IncrementExpr incrementExpr){

    }

    public void visit(Method method){

    }

    public void visit(MethodCall methodCall){

    }

    public void visit(New newvar){

    }


    //Helpers

}
