package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import Expr.LocalOrFieldVar;
import Expr.This;

public class SubExpressionAdapter {

    public static Expression adapt(miniJavaParser.SubExpressionContext subExpressionContext) {
        if (subExpressionContext.ID() != null)
            return new LocalOrFieldVar(subExpressionContext.ID().getText(),
                    subExpressionContext.start.getLine(),
                    subExpressionContext.start.getCharPositionInLine());
        else if (subExpressionContext.This() != null) {
            return new This();
        } else if (subExpressionContext.instVar() != null)
            return InstVarAdapter.adapt(subExpressionContext.instVar());
        else if (subExpressionContext.value() != null)
            return ValueAdapter.adapt(subExpressionContext.value());
        else if (subExpressionContext.notExpr() != null)
            return UnaryAdapter.adapt(subExpressionContext.notExpr());
        else if (subExpressionContext.stmtExpr() != null)
            return (Expression) StatementExprAdapter.adapt(subExpressionContext.stmtExpr());
        else // expression
            return ExpressionAdapter.adapt(subExpressionContext.expr());
    }
}