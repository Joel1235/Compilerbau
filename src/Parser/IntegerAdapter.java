package Parser;

import Expr.AInteger;

public class IntegerAdapter {
    public static AInteger adapt(miniJavaParser.IntLiteralContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        return new AInteger(value);
    }
}

