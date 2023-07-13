package statementExpressions;

import Expr.Expression;

public class AssignStmt implements StatementExpression {
    private final String id;
    private final Expression expr;

    public AssignStmt(String id, Expression expr) {
        this.id = id;
        this.expr = expr;
    }

    public String getId() {
        return this.id;
    }

    public Expression getExpr() {
        return this.expr;
    }

    @Override
    public String toString(){
        String result = "";
        result += "AssignStmt: (Id: " + id + ") (expr: " + expr.toString() + ")";
        return result;
    }
}