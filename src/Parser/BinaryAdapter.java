package Parser;

import Expr.Binary;
import Expr.Expression;
import AntlrOut.miniJavaParser;
import General.Operator;

public class BinaryAdapter {
    public static Binary adapt(miniJavaParser.BinaryExprContext binaryExprContext) {
        Expression left;
        Expression right;
        if(binaryExprContext.calcExpr() != null)
            return (Binary) CalcExprAdapter.adapt(binaryExprContext.calcExpr());
        else
            left = SubExpressionAdapter.adapt(binaryExprContext.nonCalcExpr().subExpression());
            right = ExpressionAdapter.adapt(binaryExprContext.nonCalcExpr().expr());

            Operator operator = NonCalcOperatorAdapter.adapt(binaryExprContext.nonCalcExpr().nonCalcOperator());
            return new Binary(left, right, operator, binaryExprContext.start.getLine(), binaryExprContext.start.getCharPositionInLine());




    }
}

