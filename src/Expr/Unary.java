package Expr;

import Codegenerierung.Codegenerierung;

public class Unary implements Expression {
    private final Expression expr;
    private final String operator;

    public Unary(Expression expr, String operator) {
        this.expr = expr;
        this.operator = operator;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {

    }
}