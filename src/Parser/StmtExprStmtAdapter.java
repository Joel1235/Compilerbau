package Parser;

import AntlrOut.miniJavaParser;
import AntlrOut.miniJavaVisitor;
import Expr.Expression;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import statements.StmtExprStmt;

public class StmtExprStmtAdapter{

    public StmtExprStmt adapt(miniJavaParser.AssignStmtContext ctx) {
        String variableName = ctx.ID().getText();
        Expression expression = ExpressionAdapter.adapt(ctx.expr());

        return new StmtExprStmt(variableName, expression);
    }
}


