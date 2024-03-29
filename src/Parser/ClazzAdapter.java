package Parser;

import AntlrOut.miniJavaParser;
import General.AField;
import General.AccessModifier;
import General.Clazz;
import statementExpressions.Method;

import java.util.ArrayList;
import java.util.List;

public class ClazzAdapter {
    public static Clazz adapt(miniJavaParser.ClassDeclarationContext ctx) {
        AccessModifier accessModifier = AccessModifierAdapter.adapt(ctx.accessModifier());//accessModifier

        String name = ctx.ID().getText();//class-name

        //fields
        List<AField> fields = new ArrayList<>();
        for (miniJavaParser.FieldContext fieldCtx : ctx.field()) {
            fields.add(new AField(TypeAdapter.adapt(fieldCtx.type()), fieldCtx.ID().getText()));
        }

        List<Method> methods = new ArrayList<>();
        for (miniJavaParser.MethodContext methodCtx : ctx.method()) {
            methods.add(MethodAdapter.adapt(methodCtx));
        }

        return new Clazz(accessModifier, name, fields, methods);
    }
}