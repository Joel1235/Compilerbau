package Parser;

import Expr.Expression;
import Expr.StmtExprExpr;

public class StmtExprExprAdapter {
    public static StmtExprExpr adapt(Expression expression) {
        return new StmtExprExpr(expression);
    }
}

