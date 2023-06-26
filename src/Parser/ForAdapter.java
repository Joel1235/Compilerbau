package Parser;

import Expr.Expression;
import statements.Block;
import statements.For;
import statements.StmtExprStmt;

public class ForAdapter {
    public static For adapt(StmtExprStmt initStmt, Expression condition, StmtExprStmt updateStmt, Block body) {
        return new For(initStmt, condition, updateStmt, body);
    }
}
