package Parser;

import AntlrOut.miniJavaParser;
import statements.Block;
import statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class BlockAdapter {
    public static Block adapt(miniJavaParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (miniJavaParser.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = StatementAdapter.adapt(stmtCtx);
            statements.add(stmt);
        }
        return new Block(statements);
    }
}
