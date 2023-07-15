package Parser;

import Expr.ACharacter;
import Expr.AInteger;
import AntlrOut.miniJavaParser;

public class IntegerAdapter {
    public static AInteger adapt(miniJavaParser.ExprContext ctx) {
        int value = Integer.parseInt(ctx.subExpression().expr().getText());
        return new AInteger(value);
    }
}

