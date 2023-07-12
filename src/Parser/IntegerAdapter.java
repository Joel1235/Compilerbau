package Parser;

import Expr.AInteger;
import AntlrOut.miniJavaParser;

public class IntegerAdapter {
    public static AInteger adapt(miniJavaParser.ExprContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        return new AInteger(value);
    }
}

