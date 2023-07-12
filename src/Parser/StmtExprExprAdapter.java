package Parser;

import Expr.LocalOrFieldVar;
import Expr.StmtExprExpr;

public class StmtExprExprAdapter {
    public static StmtExprExpr adapt(LocalOrFieldVar var) {
        return new StmtExprExpr(var.getId(), var);
    }
}

