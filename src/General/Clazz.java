package General;

import Expr.LocalOrFieldVar;
import statementExpressions.Method;

import java.util.List;

public class Clazz {
    String name;
    List<LocalOrFieldVar> fields;
    List<Method> methods;

    public Clazz(String name, List<LocalOrFieldVar> fields, List<Method> methods) {
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public void typeCheck() {
        // Implementation of tzpe check
    }

    public void codeGen() {
        // Implementation of code generation
    }
}
