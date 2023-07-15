package General;

import statementExpressions.Method;

import java.util.List;

public class Clazz {
    private final AccessModifier accessModifier;
    private final String name;
    private List<AField> fields;
    private List<Method> methods;

    public Clazz(String name, List<AField> fields, List<Method> methods) {
        accessModifier = AccessModifier.PUBLIC; //default
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public Clazz(AccessModifier accessModifier, String name, List<AField> fields, List<Method> methods) {
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

    public List<AField> getFields() {
        return fields;
    }

    public void setFields(List<AField> fields) {
        this.fields = fields;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    @Override
    public String toString() {
        String result = "";
        result += "(Name: " + name + ") (AccesModifier: " + accessModifier.toString() + ") (Fields: ";
        for (AField f : fields) {
            result += f.toString() + ",";
        }
        result += ") (Methods: ";
        for (Method m : methods) {
            result += m.toString() + ",";
        }
        result += (")");
        return result;
    }
}
