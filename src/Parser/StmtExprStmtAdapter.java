package Parser;

import Expr.Expression;
import statements.StmtExprStmt;

public class StmtExprStmtAdapter {
    public static StmtExprStmt adapt(Expression expression) {
        return new StmtExprStmt(expression);
    }
}

