package Expr;

public class IdExpr implements PointableExpression{
    private final String id;

    public IdExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}