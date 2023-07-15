package Parser;


import AntlrOut.miniJavaParser;
import statements.While;

public class WhileAdapter {
    public static While adapt(miniJavaParser.WhileStatementContext whileStmtContext) {
        return new While(
                ExpressionAdapter.adapt(whileStmtContext.expr()),
                BlockAdapter.adapt(whileStmtContext.block()),
                whileStmtContext.start.getLine(),
                whileStmtContext.start.getCharPositionInLine());
    }
}

