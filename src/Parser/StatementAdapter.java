package Parser;

import AntlrOut.miniJavaParser;
import statements.Return;
import statements.Statement;


public class StatementAdapter {
    public static Statement adapt(miniJavaParser.StatementContext statementContext) {
        var line = statementContext.start.getLine();
        var column = statementContext.start.getCharPositionInLine();
        if (statementContext.returnStatement() != null)
            if (statementContext.returnStatement().expr() != null)
                return new Return(ExpressionAdapter.adapt(statementContext.returnStatement().expr()), line,
                        column);
            else
                return new Return(line,
                        column);

        else if (statementContext.localVarDecl() != null)
            return LocalVarDeclAdapter.adapt(statementContext.localVarDecl());
        else if (statementContext.block() != null)
            return BlockAdapter.adapt(statementContext.block());
        else if (statementContext.whileStatement() != null)
            return WhileAdapter.adapt(statementContext.whileStatement());
        else if (statementContext.forStatement() != null)
            return ForStatementAdapter.adapt(statementContext.forStatement());
        else if (statementContext.ifElseStatement() != null)
            return IfAdapter.adapt(statementContext.ifElseStatement());
        else // StatementExpression
            // TODO fix me
            return null;
        // return StatementExprAdapter.adapt(statementContext.stmtExpr());

    }
}