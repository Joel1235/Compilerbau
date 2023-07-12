package Parser;

import General.ReturnType;
import AntlrOut.miniJavaParser;

public class ReturnTypeAdapter {
    public static ReturnType adapt(miniJavaParser.TypeContext ctx) {
        String typeName = ctx.getText();

        switch (typeName) {
            case "int":
                return ReturnType.INT;
            case "boolean":
                return ReturnType.BOOLEAN;
            case "char":
                return ReturnType.CHAR;
            default:
                // defined by user
                return new ReturnType(typeName);
        }
    }
}
