package Parser;

import Expr.*;
import AntlrOut.miniJavaParser;

public class ValueAdapter {

    public static Expression adapt(miniJavaParser.ValueContext valueContext) {
        if (valueContext.INT() != null)
            return new AInteger(Integer.parseInt(valueContext.INT().getText()));
        else if (valueContext.CHAR() != null)
            return new ACharacter(valueContext.CHAR().getText().charAt(1));
        else if (valueContext.BOOLEAN() != null) {
            if (valueContext.BOOLEAN().getText().equals("true"))
                return new ABool(true);
            else
                return new ABool(false);
        } else if (valueContext.STRING() != null) {
            return new AString(valueContext.STRING().getText().substring(1,
                    valueContext.STRING().getText().length() - 1));
        } else
            return new Anull();
    }
}
