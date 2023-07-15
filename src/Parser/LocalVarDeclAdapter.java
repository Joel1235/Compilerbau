package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import General.AType;
import statements.LocalVarDecl;

public class LocalVarDeclAdapter {
    public static LocalVarDecl adapt(AType type, String identifier, Expression expression) {
        return new LocalVarDecl(type, identifier, expression);
    }

    public static LocalVarDecl adapt(miniJavaParser.LocalVarDeclContext lvdCtx) {

        AType type = TypeAdapter.adapt(lvdCtx.type());
        String identifier = lvdCtx.ID().toString();
        Expression expression = ExpressionAdapter.adapt(lvdCtx.expr());

        return new LocalVarDecl(type, identifier, expression);
    }
}

