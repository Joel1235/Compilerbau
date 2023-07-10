package statements;

import Expr.Expression;

public class StmtExprStmt implements Statement {

    private String variableName;
    private Expression expression;

    public StmtExprStmt(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    public String getVariableName() {
        return variableName;
    }

    public Expression getExpression() {
        return expression;
    }
}