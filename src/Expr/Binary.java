package Expr;

import General.BinaryOperator;

public class Binary implements Expression {
    private final Expression left;
    private final Expression right;
    private final BinaryOperator operator;

    public Binary(Expression left, Expression right, BinaryOperator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return this.left;
    }

    public Expression getRight() {
        return this.right;
    }

    public BinaryOperator getOperator() {
        return this.operator;
    }
}
