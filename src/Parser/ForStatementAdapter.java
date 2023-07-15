package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import statements.Block;
import statements.For;
import statements.Statement;
import statements.StmtExprStmt;

public class ForStatementAdapter {

    public static Statement adapt(miniJavaParser.ForStatementContext forStatementContext) {

            var line = forStatementContext.start.getLine();
            var column = forStatementContext.start.getCharPositionInLine();

            final boolean isStatementExpressionInit = forStatementContext.localVarDecl() == null;
            var init = isStatementExpressionInit ? StatementExprAdapter.adapt(forStatementContext.stmtExpr(0))
                    : LocalVarDeclAdapter.adapt(forStatementContext.localVarDecl());

            var condition = ExpressionAdapter.adapt(forStatementContext.expr());
            var update = StatementExprAdapter.adapt(forStatementContext.stmtExpr(isStatementExpressionInit ? 1 : 0));
            var body = StatementAdapter.adapt(forStatementContext.statement());

            return new For((Statement) init, condition, update, body, line, column);
    }
}
