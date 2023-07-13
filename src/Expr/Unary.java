package Expr;

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
    public String toString(){
        String result = "";
        result += "Unary: (expr: " + expr.toString() + ") (Operator: " + operator.toString() + ")";
        return result;
    }
}