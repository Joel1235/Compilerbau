package Parser;

import AntlrOut.miniJavaParser;
import General.AType;

public class TypeAdapter {
    public static AType adapt(miniJavaParser.TypeContext ctx) {
        if (ctx instanceof miniJavaParser.ArrayTypeContext) {
            return AType.ARRAY;
        } else if (ctx instanceof miniJavaParser.BooleanTypeContext) {
            return AType.BOOLEAN;
        } else if (ctx instanceof miniJavaParser.IntTypeContext) {
            return AType.INT;
        } else if (ctx instanceof miniJavaParser.CharTypeContext) {
            return AType.CHAR;
        } else if (ctx instanceof miniJavaParser.VoidTypeContext) {
            return AType.VOID;
        } else if (ctx instanceof miniJavaParser.IdTypeContext) {
            return AType.ID;
        } else {
            throw new RuntimeException("Unsupported type context type");
        }
    }
}
