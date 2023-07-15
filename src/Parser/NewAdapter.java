package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import Helper.ArgumentHelper;
import statementExpressions.New;


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
