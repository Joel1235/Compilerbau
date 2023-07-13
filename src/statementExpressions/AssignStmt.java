package statementExpressions;

import Expr.Expression;

public class AssignStmt implements StatementExpression {
    private final String id;
    private final Expression expr;
    private Expression variable;

    public AssignStmt(String id, Expression expr) {
        this.id = id;
        this.expr = expr;
    }

    public AssignStmt(String id, Expression expr,Expression variable) {
        this.id = id;
        this.expr = expr;
        this.variable = variable;
    }

    public Expression getVariable() {
        return variable;
    }

    public String getId() {
        return this.id;
    }

    public Expression getExpr() {
        return this.expr;
    }
}