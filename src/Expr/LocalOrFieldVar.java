package Expr;


import General.AType;

public class LocalOrFieldVar implements Expression {
    private final AType id;

    public LocalOrFieldVar(AType id) {
        this.id = id;
    }

    public AType getId() {
        return this.id;
    }
}