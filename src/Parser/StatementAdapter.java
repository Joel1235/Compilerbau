package Parser;

import AntlrOut.miniJavaParser;
import statements.Statement;


public class StatementAdapter {
    public static Statement adapt(miniJavaParser.StatementContext ctx) {

        if (ctx.localVarDecl() != null) {
            return LocalVarDeclAdapter.adapt(ctx.localVarDecl());

            //TODO
        // } else if (ctx.stmtExpr() != null) {
            // return StatementExprAdapter.adapt(ctx.stmtExpr());

        } else if (ctx.block() != null) {
            return BlockAdapter.adapt(ctx.block());
        }

        else if (ctx.ifStatement() != null) {
                return IfStatementAdapter.adapt(ctx);
        }

        else if (ctx.whileStatement() != null) {
            return WhileStatementAdapter.adapt(ctx.whileStatement());

        } else if (ctx.forStatement() != null) {
            return ForStatementAdapter.adapt(ctx.forStatement());

        } else if (ctx.returnStatement() != null) {
            return ReturnStatementAdapter.adapt(ctx.returnStatement());

        } else if (ctx.methodCall() != null) {
            return MethodCallAdapter.adapt(ctx.methodCall());
        }
        throw new RuntimeException("Unknown statement: " + ctx);
    }
}
