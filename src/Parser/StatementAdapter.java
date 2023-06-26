package Parser;

import AntlrOut.miniJavaParser;

public class StatementAdapter {
    public static Statement adapt(miniJavaParser.StatementContext ctx) {
        if (ctx instanceof miniJavaParser.LocalVarDeclarationContext) {
            return LocalVarDeclAdapter.adapt((miniJavaParser.LocalVarDeclarationContext) ctx);
        } else if (ctx instanceof miniJavaParser.IfContext) {
            return IfAdapter.adapt((miniJavaParser.IfContext) ctx);
        } else if (ctx instanceof miniJavaParser.WhileStmtContext) {
            return WhileAdapter.adapt((miniJavaParser.WhileStmtContext) ctx);
        } else if (ctx instanceof miniJavaParser.ForStmtContext) {
            return ForAdapter.adapt((miniJavaParser.ForStmtContext) ctx);
        } else if (ctx instanceof miniJavaParser.StatementExprContext) {
            return StatementExpressionAdapter.adapt(ExpressionAdapter.adapt(((miniJavaParser.StatementExprContext) ctx).expr()));
        } else if (ctx instanceof miniJavaParser.ReturnContext) {
            return ReturnAdapter.adapt(((miniJavaParser.ReturnContext) ctx).expr());
        } else {
            throw new RuntimeException("Unsupported statement context type");
        }
    }
}
