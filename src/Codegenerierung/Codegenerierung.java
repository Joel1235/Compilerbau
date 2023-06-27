package Codegenerierung;


import Syntaxcollection.Expressions.Binary;
import Syntaxcollection.Operator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;


public class Codegenerierung {

    private MethodVisitor methodvisitor;

    private void visitArithmetic(Binary binary) {
        binary.getlExpression().bevisited(this);
        binary.getrExpression().bevisited(this);

        switch (binary.getOperator()) {
            case PLUS -> methodvisitor.visitInsn(Opcodes.IADD);
            case MINUS -> methodvisitor.visitInsn(Opcodes.ISUB);
            case MULT -> methodvisitor.visitInsn(Opcodes.IMUL);
            case DIV -> methodvisitor.visitInsn(Opcodes.IDIV);
            case MOD -> methodvisitor.visitInsn(Opcodes.IREM);
            default -> throw new IllegalArgumentException("Unexpected value: " + binary.getOperator());
        }
    }
}
