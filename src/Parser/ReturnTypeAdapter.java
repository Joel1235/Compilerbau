package Parser;

import AntlrOut.miniJavaParser;
import General.ReturnType;

public class ReturnTypeAdapter {
    public static ReturnType adapt(miniJavaParser.MethodtypeContext ctx) {
        String typeName = ctx.getText();

        switch (typeName) {
            case "int":
                return ReturnType.INT;
            case "boolean":
                return ReturnType.BOOLEAN;
            case "char":
                return ReturnType.CHAR;
            case "void":
                return ReturnType.VOID;
            default:
                // defined by user
                return new ReturnType(typeName);
        }
    }
}
