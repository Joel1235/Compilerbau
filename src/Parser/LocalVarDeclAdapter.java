package Parser;

import Expr.Expression;
import General.AType;
import statements.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(AType type, String identifier, Expression expression) {
        return new LocalVarDecl(type, identifier, expression);
    }
}

