package TypeChecking;

import Expr.*;
import General.*;
import jdk.jshell.spi.ExecutionControl;
import statementExpressions.*;
import statements.*;
public class MethodChecker {
    private String name;
    private StatementChecker statementChecker;
    public MethodChecker(Clazz clazz /*some weird stuff*/){
        this.name = clazz.getName();
        //some weird stuff
    }
    public Method check(Method method) throws Exception {
        throw new ExecutionControl.NotImplementedException("method check not yet implemented"); //todo: implement
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
