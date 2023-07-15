package Parser;

import AntlrOut.miniJavaParser;
import statements.Statement;

public class ReturnStatementAdapter {
    public static Statement adapt(miniJavaParser.ReturnStatementContext returnStatementContext) {
        return ReturnAdapter.adapt(ExpressionAdapter.adapt(returnStatementContext.expr()));
    }
}
