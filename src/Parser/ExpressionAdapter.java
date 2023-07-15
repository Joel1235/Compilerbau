package Parser;

import AntlrOut.miniJavaParser;
import Expr.*;
import General.BinaryOperator;



public class ExpressionAdapter {

    public static Expression adapt(miniJavaParser.ExprContext exprContext) {
        if (exprContext.binaryOp() != null)
            return BinaryAdapter.adapt(ExpressionAdapter.adapt(exprContext.expr(0)), ExpressionAdapter.adapt(exprContext.expr(1)), BinaryOperator.valueOf(exprContext.binaryOp().getText()));
        else
            return UnaryAdapter.adapt(ExpressionAdapter.adapt(exprContext.expr(0)), exprContext.binaryOp().getText());
    }
}


