package Parser;

import AntlrOut.miniJavaParser;
import Expr.AString;

public class StringAdapter {
    public static AString adapt(miniJavaParser.StringLiteralContext ctx) {
        String value = ctx.STRING().getText();
        return new AString(value);
    }
}

