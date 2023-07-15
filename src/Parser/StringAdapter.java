package Parser;

import Expr.AString;
import AntlrOut.miniJavaParser;

public class StringAdapter {
    public static AString adapt(miniJavaParser.ExprContext ctx) {
        String value = ctx.subExpression().expr().getText();
        return new AString(value);
    }
}

