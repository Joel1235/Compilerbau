package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import statements.Block;
import statements.Statement;
import statements.StmtExprStmt;

public class ForStatementAdapter {

    public static Statement adapt(miniJavaParser.ForStatementContext forStatementContext) {

        // TODO: fix me

        // StmtExprStmt initStmt = StmtExprStmtAdapter.adapt(forStatementContext.));
        StmtExprStmt initStmt = null;

        Expression condition = ExpressionAdapter.adapt(forStatementContext.condition().expr());

        // StmtExprStmt updateStmt = StmtExprStmtAdapter.adapt(forStatementContext.initialization());
        StmtExprStmt updateStmt = null;

        Block body = BlockAdapter.adapt(forStatementContext.block());

        return ForAdapter.adapt(initStmt, condition, updateStmt, body);
    }
}
