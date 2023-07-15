package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class Unary implements Expression {
    private final Expression expr;
    private final String operator;
    private AType aType;

    public Unary(Expression expr, String operator) {
        this.expr = expr;
        this.operator = operator;
    }

    public Unary(Expression expr, String operator,AType aType) {
        this.expr = expr;
        this.operator = operator;
        this.aType =aType;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getOperator() {
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