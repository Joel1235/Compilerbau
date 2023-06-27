package Parser;

import Expr.LocalOrFieldVar;
import General.AType;
import statementExpressions.Method;
import AntlrOut.miniJavaParser;
import statements.Block;

import java.util.List;
import java.util.stream.Collectors;

public class MethodAdapter {
    public static Method adapt(miniJavaParser.MethodContext methodContext) {
        AType returnType = TypeAdapter.adapt(methodContext.type());
        String methodName = methodContext.ID().getText();
        List<LocalOrFieldVar> parameters = null;
        if (methodContext.paramList() != null) {
            parameters = methodContext.paramList().param().stream()
                    .map(paramContext -> new LocalOrFieldVar(
                            TypeAdapter.adapt(paramContext.type()),
                            paramContext.ID().getText()))
                    .collect(Collectors.toList());
        }
        Block block = BlockAdapter.adapt(methodContext.block());
        return new Method(returnType, methodName, parameters, block);
    }
}
