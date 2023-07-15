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

    public static Block adapt(List<miniJavaParser.BlockContext> ctxList) {
        List<Statement> statements = new ArrayList<>();

        for (miniJavaParser.BlockContext blockCtx : ctxList) {
            for (miniJavaParser.StatementContext stmtCtx : blockCtx.statement()) {
                Statement stmt = StatementAdapter.adapt(stmtCtx);
                statements.add(stmt);
            }
        }

        return new Block(statements);
    }
}
