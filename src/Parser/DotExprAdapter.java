package Parser;

import AntlrOut.miniJavaParser;
import Expr.AInteger;
import Expr.Binary;
import Expr.Expression;
import Expr.LocalOrFieldVar;
import General.Operator;

public class DotExprAdapter {
    public static Expression adapt(miniJavaParser.DotExprContext dotExprContext) {
        if (dotExprContext.dotExpr() != null &&
                dotExprContext.DotOperator() != null &&
                dotExprContext.dotSubExpr() != null) {
            Expression leftExpression = adapt(dotExprContext.dotExpr());
            Operator operator = adaptCalcOperator(dotExprContext);
            Expression rightExpression = adaptDotSubExpression(dotExprContext.dotSubExpr());
            return new Binary(leftExpression, operator, rightExpression);
        } else
            return adaptDotSubExpression(dotExprContext.dotSubExpr());
    }

    private static Expression adaptDotSubExpression(miniJavaParser.DotSubExprContext dotSubExprContext) {
        if (dotSubExprContext.INT() != null)
            return new AInteger(Integer.parseInt(dotSubExprContext.INT().getText()));
        else if (dotSubExprContext.ID() != null)
            return new LocalOrFieldVar(dotSubExprContext.ID().getText());
        else if (dotSubExprContext.instVar() != null)
            return InstVarAdapter.adapt(dotSubExprContext.instVar());
        else if (dotSubExprContext.methodCall() != null)
            return (Expression) MethodCallAdapter.adapt(dotSubExprContext.methodCall());
        else
            return CalcExprAdapter.adapt(dotSubExprContext.calcExpr());
    }

    private static Operator adaptCalcOperator(miniJavaParser.DotExprContext dotExprContext) {
        if (dotExprContext.DotOperator().getText().equals("*"))
            return Operator.MULT;
        else if (dotExprContext.DotOperator().getText().equals("/"))
            return Operator.DIV;
        else
            return Operator.MOD;
    }
}
