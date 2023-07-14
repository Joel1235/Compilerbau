package Expr;


import General.AType;
import General.AccessModifier;

public class LocalOrFieldVar implements Expression {
    private final AccessModifier accessModifier;
    private AType type;
    private final String id;
    public LocalOrFieldVar(AType type, String id) {
        this.accessModifier = AccessModifier.PUBLIC;//default
        this.type = type;
        this.id = id;
    }

    public LocalOrFieldVar(AccessModifier accessModifier, AType type, String id) {
        this.accessModifier = accessModifier;
        this.type = type;
        this.id = id;
    }

    public AType getType() {
        return type;
    }

    public void setType(AType type) { this.type = type; }

    public String getId() {
        return id;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    @Override
    public String toString(){
        String result = "";
        result += "LocalOrFieldVar: (Id: " + id + ") (Type: " + type.toString() + ") (AccessModifier: " + accessModifier.toString();
        return result;
    }
}