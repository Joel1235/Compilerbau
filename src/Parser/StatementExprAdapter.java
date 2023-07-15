package Parser;

import AntlrOut.miniJavaParser;
import statementExpressions.StatementExpression;

public class StatementExprAdapter {

    public static StatementExpression adapt(miniJavaParser.StmtExprContext stmtExprContext) {
        if (stmtExprContext.assign() != null)
            return AssignAdapter.adapt(stmtExprContext.assign());
        else if (stmtExprContext.newDecl() != null)
            return NewAdapter.adapt(stmtExprContext.newDecl());
        else if (stmtExprContext.incDecExpr() != null)
            return CrementExprAdapter.adapt(stmtExprContext.incDecExpr());
        else // methodCall
            return MethodCallAdapter.adapt(stmtExprContext.methodCall());
    }
}