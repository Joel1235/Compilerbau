package Parser;

import Expr.Expression;
import statementExpressions.AssignStmt;

public class AssignStmtAdapter {
    public static AssignStmt adapt(String identifier, Expression expression) {
        return new AssignStmt(identifier, expression);
    }
}

