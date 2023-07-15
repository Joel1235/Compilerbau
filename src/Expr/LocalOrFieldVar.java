package Expr;


import Codegenerierung.Codegenerierung;
import General.AType;
import General.AccessModifier;

public class LocalOrFieldVar implements Expression {
    private final AccessModifier accessModifier;
    private final AType type;
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
}