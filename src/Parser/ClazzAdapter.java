package Parser;

import Expr.LocalOrFieldVar;
import General.Clazz;
import General.AccessModifier;
import statementExpressions.Method;
import AntlrOut.miniJavaParser;

import java.util.ArrayList;
import java.util.List;

public class ClazzAdapter {
    public static Clazz adapt(miniJavaParser.ClassDeclarationContext ctx) {
        AccessModifier accessModifier = AccessModifierAdapter.adapt(ctx.accessModifier());//accessModifier

        String name = ctx.ID().getText();//class-name

        //fields
        List<LocalOrFieldVar> fields = new ArrayList<>();
        for (miniJavaParser.FieldContext fieldCtx : ctx.field()) {
            fields.add(new LocalOrFieldVar(TypeAdapter.adapt(fieldCtx.type()), fieldCtx.ID().getText()));
        }

        List<Method> methods = new ArrayList<>();
        for (miniJavaParser.MethodContext methodCtx : ctx.method()) {
            methods.add(MethodAdapter.adapt(methodCtx));
        }

        return new Clazz(accessModifier, name, fields, methods);
    }
}
