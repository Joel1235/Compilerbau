package statements;

import Codegenerierung.Codegenerierung;
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

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        System.out.println("Not implemented");
    }

    public String toString() {
        String result = "";
        result += "StmtExprStmt: (varName: " + variableName + ") (expr: " + expression.toString() + ")";
        return result;
    }
}