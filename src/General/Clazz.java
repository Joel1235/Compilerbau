package General;

import Expr.LocalOrFieldVar;
import statementExpressions.Method;

import java.lang.reflect.Field;
import java.util.List;

public class Clazz {
    private AccessModifier accessModifier;
    private String name;
    private List<Field> fields;
    private List<Method> methods;

    public Clazz(String name, List<Field> fields, List<Method> methods) {
        accessModifier = AccessModifier.PUBLIC; //default
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public Clazz(AccessModifier accessModifier, String name, List<Field> fields, List<Method> methods) {
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

    public List<Field> getFields() {
        return fields;
    }

    public List<Method> getMethods() {
        return methods;
    }

    @Override
    public String toString(){
        String result = "Clazz: ";
        result += "(Name: " + name + ") (AccesModifier: " + accessModifier.toString() + ") (Fields: ";
        for (Field f: fields ) {
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
