package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;
import General.BinaryOperator;

public class Binary implements Expression {
    private final Expression left;
    private final Expression right;
    private final BinaryOperator operator;
    private AType aType;

    public Binary(Expression left, Expression right, BinaryOperator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Binary(Expression left, Expression right, BinaryOperator operator,AType aType) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.aType = aType;
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

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public AType getType() {
        return this.aType;
    }
}
