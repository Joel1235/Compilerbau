package Parser;

import AntlrOut.miniJavaParser;
import General.AccessModifier;

public class AccessModifierAdapter {
    public static AccessModifier adapt(miniJavaParser.AccessModifierContext ctx) {
        if (ctx == null) {
            return AccessModifier.PUBLIC; //default
        }

        String accessMod = ctx.getText();

        switch (accessMod) {
            case "public":
                return AccessModifier.PUBLIC;
            case "protected":
                return AccessModifier.PROTECTED;
            case "private":
                return AccessModifier.PRIVATE;
            default:
                throw new IllegalArgumentException("Unknown access modifier: " + accessMod);
        }
    }
}
