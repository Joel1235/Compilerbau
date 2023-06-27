package Parser;

import AntlrOut.miniJavaParser;
import Expr.LocalOrFieldVar;
import General.Clazz;
import statementExpressions.Method;

import java.util.ArrayList;
import java.util.List;

public class ClazzAdapter {
    public static Clazz adapt(miniJavaParser.ClassDeclarationContext ctx) {
        String name = ctx.ID().getText();
        List<LocalOrFieldVar> fields = new ArrayList<>();
        List<Method> methods = new ArrayList<>();

        for (miniJavaParser.FieldContext fieldCtx : ctx.field()) {
            fields.add(LocalOrFieldVarAdapter.adapt(TypeAdapter.adapt(fieldCtx.type()), fieldCtx.ID().getText()));
        }
        for (miniJavaParser.MethodContext methodCtx : ctx.method()) {
            methods.add(MethodAdapter.adapt(methodCtx));
        }

        return new Clazz(name, fields, methods);
    }
}
