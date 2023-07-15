package Parser;

import AntlrOut.miniJavaParser;
import statements.Statement;

public class WhileStatementAdapter
{
    public static Statement adapt(miniJavaParser.WhileStatementContext whileStatementContext) {
        return WhileAdapter.adapt(ExpressionAdapter.adapt(whileStatementContext.condition().expr()), BlockAdapter.adapt(whileStatementContext.block()));
    }
}
