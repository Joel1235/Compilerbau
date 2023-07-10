package Expr;

import Codegenerierung.Codegenerierung;

public class StmtExprExpr implements Expression{
    private String id;
    private Expression expression;

    public StmtExprExpr(String id, Expression expression) {
        this.id = id;
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {

    }
}
