package Parser;

import AntlrOut.miniJavaParser;
import Expr.Unary;
import General.Operator;

public class UnaryAdapter {
    public static Unary adapt(miniJavaParser.NotExprContext notExprContext) {
        notExprContext.start.getLine();
        notExprContext.start.getCharPositionInLine();
        return new Unary(
                ExpressionAdapter.adapt(notExprContext.expr()),
                Operator.NOT,
                notExprContext.start.getLine(),
                notExprContext.start.getCharPositionInLine());
    }
}

