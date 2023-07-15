package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class AInteger implements Expression {
    private final int value;
    private AType aType;

    public AInteger(int value) {
        this.value = value;
    }

    public AInteger(int value, AType aType) {
        this.value = value;
        this.aType = aType;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public AType getType() {
        return this.aType;
    }

    public String toString(){
        String result = "";
        result += "Int: " + value;
        return result;
    }
}
