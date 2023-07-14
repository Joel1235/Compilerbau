package TypeChecking;

import Expr.*;
import General.*;
import jdk.jshell.spi.ExecutionControl;
import statementExpressions.*;

public class MethodChecker {
    private String name; //todo: unnecessary if we don't have object type

    public MethodChecker(Clazz clazz){
        this.name = clazz.getName();
        //todo: here would be the creation of statement and expression checkers, but since they wouldnt work we dont do this here
    }
    public Method check(Method method) throws Exception {
        //first: getting statement by checking method.statement (does not exist)
        //second: check parameters:
        for (LocalOrFieldVar parameter : method.getParams()) {
            parameter.setType(check(parameter).getType());// todo: thing is. since we using a getter, maybe original data not modified
        }
        //third: set method type via statement, not possible, since our statements don't have types
        return method;
    }

    public LocalOrFieldVar check(LocalOrFieldVar parameter) throws Exception {
        String parameterName = parameter.getType().getTypeName();
        switch (parameterName) {//todo fix strings
            case "String" -> /*parameter.setType(AType.nonexistantapparently)*/ throw(new ExecutionControl.NotImplementedException("string not implemented"));
            case "char" -> parameter.setType(AType.CHAR);
            case "int" -> parameter.setType(AType.INT);
            case "boolean" -> parameter.setType(AType.BOOLEAN);
            case "void" -> parameter.setType(AType.VOID);
            default -> throw new Exception();//todo if object type implemented also check here, this is what name is needed for
        }
        return parameter;
    }
}
