package Parser;

import Expr.Expression;
import statements.StmtExprStmt;
import AntlrOut.miniJavaParser;

public class StmtExprStmtAdapter{

    public StmtExprStmt adapt(miniJavaParser.StmtExprContext ctx) {
        String variableName = ctx.ID().getText();
        Expression expression = ExpressionAdapter.adapt(ctx.expr());

        return new StmtExprStmt(variableName, expression);
    }
}


