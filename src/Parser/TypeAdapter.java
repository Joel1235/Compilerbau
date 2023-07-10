package Parser;

import AntlrOut.miniJavaParser;
import General.AType;

public class TypeAdapter {
    public static AType adapt(miniJavaParser.TypeContext ctx) {
        String typeName = ctx.getText();

        switch (typeName) {
            case "int":
                return AType.INT;
            case "boolean":
                return AType.BOOLEAN;
            case "char":
                return AType.CHAR;
            case "void":
                return AType.VOID;
            default:
                // defined by user
                return new AType(typeName);
        }
    }
}
