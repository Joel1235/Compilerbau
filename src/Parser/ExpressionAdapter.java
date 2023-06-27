package Parser;

import AntlrOut.miniJavaParser;
import Expr.*;

public class ExpressionAdapter {

    public static Expression adapt(miniJavaParser.ExprContext exprContext) {
        if (exprContext.binaryExpr() != null)
            return BinaryAdapter.adapt(exprContext.binaryExpr());
        else
            return UnaryAdapter.adapt(exprContext.subExpression());
    }
}


