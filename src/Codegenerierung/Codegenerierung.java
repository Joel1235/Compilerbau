package Codegenerierung;


import Expr.*;

import org.antlr.runtime.LegacyCommonTokenStream;
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

    }

    public void visit(IdExpr idExpr){

    }

    public void visit(LocalOrFieldVar localOrFieldVar){

    }

    public void visit(StmtExprExpr stmtExprExpr){

    }

    public void visit(Super superVar){

    }

    public void visit(Unary unary){

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
    private void visitArithmetic(Binary binary) {
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
}
