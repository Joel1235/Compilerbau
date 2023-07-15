package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class StmtExprExpr implements Expression{
    private String id;
    private Expression expression;
    private AType aType;

    public StmtExprExpr(String id, Expression expression) {
        this.id = id;
        this.expression = expression;
    }

    public StmtExprExpr(String id, Expression expression,AType aType) {
        this.id = id;
        this.expression = expression;
        this.aType = aType;
    }

    public String getId() {
        return id;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        System.out.println("Not implemented");
    }

    public AType getType() {
        return this.aType;
    public String toString(){
        String result = "";
        result += "StmtExprExpr: (Id: " + id + ") (Expression:  " + expression.toString() + ")";
        return result;
    }
}
