package Parser;

import AntlrOut.miniJavaParser;
import General.Operator;
import statementExpressions.CrementStmtExpr;
import statementExpressions.StatementExpression;


public class CrementExprAdapter {
    public static StatementExpression adapt(miniJavaParser.IncDecExprContext incDecExprContext) {
        int line = incDecExprContext.getStart().getLine();
        int column = incDecExprContext.getStart().getCharPositionInLine();
        if (incDecExprContext.incExpr() != null)
            if (incDecExprContext.incExpr().pIncExpr() != null)
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(incDecExprContext.incExpr().pIncExpr().assignableExpr()),
                        Operator.INCPRE,
                        line,
                        column);
            else
                return new CrementStmtExpr(
                        AssignableExpressionAdapter.adapt(incDecExprContext.incExpr().sIncExpr().assignableExpr()),
                        Operator.INCSUF,
                        line,
                        column);
        else if (incDecExprContext.decExpr().pDecExpr() != null)
            return new CrementStmtExpr(
                    AssignableExpressionAdapter.adapt(incDecExprContext.decExpr().pDecExpr().assignableExpr()),
                    Operator.DECPRE,
                    line,
                    column);
        else
            return new CrementStmtExpr(
                    AssignableExpressionAdapter.adapt(incDecExprContext.decExpr().sDecExpr().assignableExpr()),
                    Operator.DECSUF,
                    line,
                    column);
    }
}
