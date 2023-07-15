package Parser;

import statementExpressions.AssignStmt;
import AntlrOut.miniJavaParser;

public class AssignAdapter {
    public static AssignStmt adapt(miniJavaParser.AssignContext assignContext) {
        var rExpression = ExpressionAdapter.adapt(assignContext.expr());
        var lExpression = AssignableExpressionAdapter.adapt(assignContext.assignableExpr());
        return new AssignStmt(lExpression, rExpression, assignContext.start.getLine(),
                assignContext.start.getCharPositionInLine());
    }
}
