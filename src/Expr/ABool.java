package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class ABool implements Expression {
    private final boolean value;

    public ABool(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Boolean: " + value;
        return result;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        // TODO: implement it in codegenerierung
        // codegenerierung.visit(this);
    }

    @Override
    public AType getType() {
        return null;
    }
}
