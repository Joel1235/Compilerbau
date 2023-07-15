package Parser;

import Expr.Expression;
import statements.StmtExprStmt;

public class StmtExprStmtAdapter{

    public StmtExprStmt adapt(miniJavaParser.AssignStmtContext ctx) {
        String variableName = ctx.ID().getText();
        Expression expression = ExpressionAdapter.adapt(ctx.expr());

        return new StmtExprStmt(variableName, expression);
    }
}


