package Expr;


import General.AType;

public class LocalOrFieldVar implements Expression {
    private final AType type;
    private final String id;

    public LocalOrFieldVar(AType type, String id) {
        this.type = type;
        this.id = id;
    }

    public AType getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}