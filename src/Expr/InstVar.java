package Expr;

public class InstVar implements Expression {
    private final Expression expr;
    private final String id;

    public InstVar(Expression expr, String id) {
        this.expr = expr;
        this.id = id;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getId() {
        return this.id;
    }
}