package statementExpressions;

public class DecrementExpr implements StatementExpression {
    private final String id;

    public DecrementExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Decrement: (Id: " + id + ")";
        return result;
    }
}
