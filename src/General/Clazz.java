package General;

import statementExpressions.Method;
import java.util.List;

public class Clazz {
    private AccessModifier accessModifier;
    private String name;
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

    public List<Method> getMethods() {
        return methods;
    }

    @Override
    public String toString(){
        String result = "Clazz: ";
        result += "(Name: " + name + ") (AccesModifier: " + accessModifier.toString() + ") (Fields: ";
        for (AField f: fields ) {
            result += f.toString() + ",";
        }
        result += ") Methods: ";
        for (Method m: methods ) {
            result += m.toString() + ",";
        }
        result += (")");
        return result;
    }
}
