package Parser;

import Expr.Expression;
import statementExpressions.New;
import AntlrOut.miniJavaParser;
import Helper.ArgumentHelper;


public class NewAdapter {
    public static New adapt(miniJavaParser.NewDeclContext newDeclContext) {
        var arguments = new ArgumentHelper<Expression>();
        if (newDeclContext.exprList() != null) {
            newDeclContext.exprList().expr().forEach(
                    a -> arguments.add(ExpressionAdapter.adapt(a)));
        }
        return new New(
                newDeclContext.ID().getText(),
                arguments,
                newDeclContext.start.getLine(),
                newDeclContext.start.getCharPositionInLine());
    }
}
