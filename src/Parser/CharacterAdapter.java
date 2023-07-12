package Parser;

import AntlrOut.miniJavaParser;
import Expr.ACharacter;

public class CharacterAdapter {
    public static ACharacter adapt(miniJavaParser.ExprContext ctx) {
        char value = ctx.CHAR().getText().charAt(1);
        return new ACharacter(value);
    }
}

