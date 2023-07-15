package TypeChecking;

import General.AField;
import General.AType;
import General.Clazz;
import jdk.jshell.spi.ExecutionControl;
import statementExpressions.Method;

import java.util.List;

public class ClassChecker {
    private List<AField> fields;
    private List<Method> methods;
    private MethodChecker methodChecker;


    public ClassChecker(Clazz clazz, List<AField> fields, List<Method> methods) {
        this.fields = fields;
        this.methods = methods;
        this.methodChecker = new MethodChecker(clazz);
        //since we don't have constructors, they cannot be type-checked
    }

    public AField check(AField field) throws Exception {//todo: fix strings (currently not implemented as type)
        String type = field.getType().toString();
        switch (type) {
            case "String" -> /*field.setType(AType.nonexistentapparently)*/
                    throw (new ExecutionControl.NotImplementedException("string not implemented"));
            case "char" -> field.setType(AType.CHAR);
            case "int" -> field.setType(AType.INT);
            case "boolean" -> field.setType(AType.BOOLEAN);
            case "void" -> field.setType(AType.VOID);
            default -> throw new Exception();
        }
        fields.add(field);
        return field;
    }

    public Method check(Method method) throws Exception {
        return methodChecker.check(method);
    }

    public Method check(String methodId) throws Exception {// could be used, if only the methodID were available, but currently unused
        for (Method method : methods) {
            if (method.getId().equals(methodId)) {
                return check(method);
            }
        }
        throw new Exception();
    }

}
