package statementExpressions;

public class IncrementExpr implements StatementExpression {
    private final String id;

    public IncrementExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Increment: (Id: " + id + ")";
        return result;
    }
}
