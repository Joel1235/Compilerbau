package Expr;


import Codegenerierung.Codegenerierung;
import General.AType;
import General.AccessModifier;

public class LocalOrFieldVar implements Expression {
    private final AccessModifier accessModifier;
    private AType type;
    private final String id;
    public int line;
    public int column;

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

    public LocalOrFieldVar(String id) {
        this.accessModifier = AccessModifier.PUBLIC;//default
        this.id = id;
    }

    public LocalOrFieldVar(String id, int line, int charPositionInLine) {
        this.accessModifier = AccessModifier.PUBLIC;//default
        this.id = id;
        this.line = line;
        this.column = charPositionInLine;
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
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public String toString(){
        String result = "";
        result += "LocalOrFieldVar: (Id: " + id + ") (Type: " + type.toString() + ") (AccessModifier: " + accessModifier.toString() + ")";
        return result;
    }
}