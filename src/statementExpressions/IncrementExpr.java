package statementExpressions;

public class IncrementExpr implements StatementExpression {
    private final String id;

    public IncrementExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
