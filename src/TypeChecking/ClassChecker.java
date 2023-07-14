package TypeChecking;

import Expr.*;
import General.*;
import jdk.jshell.spi.ExecutionControl;
import statementExpressions.*;
import statements.*;

import java.util.List;

public class ClassChecker {
    private String name;
    private List<AField> fields;
    private List<Method> methods;
    private MethodChecker methodChecker;


    public ClassChecker(Clazz clazz, List<AField> fields, List<Method> methods) {
        name = clazz.getName();
        this.fields = fields;
        this.methods = methods;
        this.methodChecker = new MethodChecker(clazz);
    }

    public AField check(AField field) throws Exception {//todo: check if correct, also: fix strings
        String type = field.getType().toString();
        switch (type) {
            case "String" -> /*field.setType(AType.nonexistantapparently)*/ throw(new ExecutionControl.NotImplementedException("string not implemented"));
            case "char" -> field.setType(AType.CHAR);
            case "int" -> field.setType(AType.INT);
            case "bool", "boolean" -> field.setType(AType.BOOLEAN);
            case "void" -> field.setType(AType.VOID);
            default -> throw new Exception();
        }
        fields.add(field);
        return field;
    }

    public Method check(Method method) throws Exception {
        return methodChecker.check(method);
    }

    public Method check(String methodId) throws Exception {
        for (Method method : methods) {
            if (method.getId().equals(methodId)) {
                Method checkedMethod = check(method);
                return checkedMethod;
            }
        }
        throw new Exception();
    }

}
