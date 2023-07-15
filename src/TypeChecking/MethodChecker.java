package TypeChecking;

import Expr.*;
import General.*;
import jdk.jshell.spi.ExecutionControl;
import statementExpressions.*;

public class MethodChecker {
    private String name; //todo: unnecessary if we don't have object type

    public MethodChecker(Clazz clazz){
        this.name = clazz.getName();
    }
    public Method check(Method method) throws Exception {
        //since our statements, expressions and statement expressions don#t have a type (exception: LocalOrFieldVar) we can't type-check these
        //therefore we can only type-check the parameters:
        for (LocalOrFieldVar parameter : method.getParams()) {
            parameter.setType(check(parameter).getType());// todo: thing is: since we using a getter, maybe original data not modified
        }
        //since, as said above, our statements do not have types, we also cannot infer the method type from them, meaning we also can't set the method type
        return method;
    }

    public LocalOrFieldVar check(LocalOrFieldVar parameter) throws Exception {
        String parameterName = parameter.getType().getTypeName();
        switch (parameterName) {//todo: fix strings (not currently implemented as type)
            case "String" -> /*parameter.setType(AType.nonexistantapparently)*/ throw(new ExecutionControl.NotImplementedException("string not implemented"));
            case "char" -> parameter.setType(AType.CHAR);
            case "int" -> parameter.setType(AType.INT);
            case "boolean" -> parameter.setType(AType.BOOLEAN);
            case "void" -> parameter.setType(AType.VOID);
            default -> throw new Exception();//todo: if object type implemented also check here, this is what name is needed for
        }
        return parameter;
    }
}