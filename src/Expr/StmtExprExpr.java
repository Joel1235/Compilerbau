package Expr;

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
    public String toString(){
        String result = "";
        result += "StmtExprExpr: (Id: " + id + ") (Expression:  " + expression.toString() + ")";
        return result;
    }
}
