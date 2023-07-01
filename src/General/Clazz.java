package General;

import Expr.LocalOrFieldVar;
import statementExpressions.Method;

import java.util.List;

public class Clazz {
    private AccessModifier accessModifier;
    private String name;
    private List<LocalOrFieldVar> fields;
    private List<Method> methods;

    public Clazz(String name, List<LocalOrFieldVar> fields, List<Method> methods) {
        accessModifier = AccessModifier.PUBLIC; //default
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public Clazz(AccessModifier accessModifier, String name, List<LocalOrFieldVar> fields, List<Method> methods) {
        this.accessModifier = accessModifier;
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public String getName() {
        return name;
    }

    public List<LocalOrFieldVar> getFields() {
        return fields;
    }

    public List<Method> getMethods() {
        return methods;
    }
}
