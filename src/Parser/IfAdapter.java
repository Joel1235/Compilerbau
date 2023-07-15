package Parser;

import statements.If;
import AntlrOut.miniJavaParser;

public class IfAdapter {
    public static If adapt(miniJavaParser.IfElseStatementContext ifElseStmtContext) {
        if (ifElseStmtContext.elseStatement() != null) {
            return new If(
                    ExpressionAdapter.adapt(ifElseStmtContext.ifStatement().expr()),
                    StatementAdapter.adapt(ifElseStmtContext.ifStatement().statement()),
                    StatementAdapter.adapt(ifElseStmtContext.elseStatement().statement()),
                    ifElseStmtContext.start.getLine(),
                    ifElseStmtContext.start.getCharPositionInLine());
        } else {
            return new If(
                    ExpressionAdapter.adapt(ifElseStmtContext.ifStatement().expr()),
                    StatementAdapter.adapt(ifElseStmtContext.ifStatement().statement()),
                    ifElseStmtContext.start.getLine(),
                    ifElseStmtContext.start.getCharPositionInLine());
        }
    }
}