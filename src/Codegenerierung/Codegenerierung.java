package Codegenerierung;


import Expr.*;

import org.antlr.runtime.LegacyCommonTokenStream;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class Codegenerierung {

    private MethodVisitor methodvisitor;
    private List<LocalOrFieldVar> localVars;
    private String currentClass;

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


}
