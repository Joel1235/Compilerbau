package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;

public class ExpressionAdapter {

    public static Expression adapt(miniJavaParser.ExprContext expressionContext) {
        if (expressionContext.binaryExpr() != null)
            return BinaryAdapter.adapt(expressionContext.binaryExpr());
        else
            return SubExpressionAdapter.adapt(expressionContext.subExpression());
    }
}


