package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import statements.Block;
import statements.If;
import statements.Statement;

public class IfStatementAdapter {
    public static If adapt(miniJavaParser.StatementContext ctx) {
        Expression condition = ExpressionAdapter.adapt(ctx.ifStatement().condition().expr());
        Block thenBranch = BlockAdapter.adapt(ctx.block());
        Block elseBranch = BlockAdapter.adapt(ctx.block());

        return new If(condition, thenBranch, elseBranch);
    }
}
