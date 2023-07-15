package Parser;

import AntlrOut.miniJavaParser;
import Expr.Binary;
import Expr.Expression;
import General.Operator;

public class CalcExprAdapter {
    public static Expression adapt(miniJavaParser.CalcExprContext calcExprContext) {
        Expression leftExpression;
        Operator operator;
        Expression rightExpression;
        if (calcExprContext.calcExpr() != null &&
                calcExprContext.LineOperator() != null &&
                calcExprContext.dotExpr() != null) {
            leftExpression = CalcExprAdapter.adapt(calcExprContext.calcExpr());
            operator = adaptCalcOperator(calcExprContext);
            rightExpression = DotExprAdapter.adapt(calcExprContext.dotExpr());
            return new Binary(leftExpression, operator, rightExpression);
        } else {
            return DotExprAdapter.adapt(calcExprContext.dotExpr());
        }
    }

    private static Operator adaptCalcOperator(miniJavaParser.CalcExprContext calcExprContext) {
        if (calcExprContext.LineOperator().getText().equals("+"))
            return Operator.PLUS;
        else
            return Operator.MINUS;

    }
}
