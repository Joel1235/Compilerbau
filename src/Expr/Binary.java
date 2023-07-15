package Expr;

import General.Operator;

public class Binary implements Expression {
    private final Expression left;
    private final Expression right;
    private final Operator operator;

    private int line;
    private int column;

    public Binary(Expression left, Operator operator, Expression right) {
        this.left = left;
        this.right = right;
        this.operator = operator;

    }

    public Binary(Expression left, Expression right, Operator operator, int line, int col) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.line = line;
        this.column = col;
    }

    public Expression getLeft() {
        return this.left;
    }

    public Expression getRight() {
        return this.right;
    }

    public Operator getOperator() {
        return this.operator;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Binary(left: " + left.toString() + ") (Operator: " + operator.toString() + ") (right: " + right.toString() + ")";
        return result;
    }
}
