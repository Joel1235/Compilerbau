package Parser;

import AntlrOut.miniJavaParser;
import Expr.LocalOrFieldVar;
import General.AType;
import General.AccessModifier;
import General.ReturnType;
import statementExpressions.Method;
import statements.Block;

import java.util.ArrayList;
import java.util.List;

public class MethodAdapter {
    public static Method adapt(miniJavaParser.MethodContext ctx) {
        AccessModifier accessModifier = AccessModifierAdapter.adapt(ctx.accessModifier());

        ReturnType returnType = ReturnTypeAdapter.adapt(ctx.type());

        String name = ctx.ID().getText();

        List<LocalOrFieldVar> parameters = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (miniJavaParser.ParamContext paramCtx : ctx.paramList().param()) {
                AType paramType = TypeAdapter.adapt(paramCtx.type());
                String paramName = paramCtx.ID().getText();
                parameters.add(new LocalOrFieldVar(paramType, paramName));
            }
        }

        Block block = BlockAdapter.adapt(ctx.block());


        return new Method(accessModifier, returnType, name, parameters, block);
    }
}
