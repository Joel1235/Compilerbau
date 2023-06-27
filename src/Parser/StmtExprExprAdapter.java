package Parser;

import Expr.Expression;
import Expr.LocalOrFieldVar;
import Expr.StmtExprExpr;

public class StmtExprExprAdapter {
    public static StmtExprExpr adapt(LocalOrFieldVar var) {
        return new StmtExprExpr(expression);
    }
}

