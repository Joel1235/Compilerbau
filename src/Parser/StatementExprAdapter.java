package Parser;

import Expr.Expression;
import statementExpressions.*;
import AntlrOut.miniJavaParser;

import java.util.ArrayList;
import java.util.List;

public class StatementExprAdapter {
    public static StatementExpression adapt(miniJavaParser.StmtExprContext ctx) {

        //Assign-Statement
        if (ctx.ID() != null && ctx.expr() != null) {
            // Case: ID '=' expr
            String variableName = ctx.ID().getText();
            Expression expression = ExpressionAdapter.adapt(ctx.expr());
            return new AssignStmt(variableName, expression);
        }

        //New Instance
        if (ctx.getChild(0).getText().equals("new")) {
            String name = ctx.ID().getText();
            List<Expression> parameters = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (miniJavaParser.ExprContext exprCtx : ctx.exprList().expr()) {
                    Expression expr = ExpressionAdapter.adapt(exprCtx);
                    parameters.add(expr);
                }
            }
            return new New(name, parameters);
        }


        //Method call
        if (ctx.methodCall() != null) {
            String name = ctx.ID().getText();
            List<Expression> parameters = new ArrayList<>();
            if (ctx.exprList() != null) {
                for (miniJavaParser.ExprContext exprCtx : ctx.exprList().expr()) {
                    Expression expr = ExpressionAdapter.adapt(exprCtx);
                    parameters.add(expr);
                }
            }
            return new MethodCall(name, parameters);
        }

        //Increment expression
        if (ctx.incrementExpr() != null) {
            String id = ctx.ID().getText();
            return new IncrementExpr(id);
        }

        //Decrement expression
        if (ctx.decrementExpr() != null) {
            String id = ctx.ID().getText();
            return new DecrementExpr(id);
        }

        throw new IllegalArgumentException("Unknown statement expression type.");
    }
}
