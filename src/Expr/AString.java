package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class AString implements Expression {
    private final String value;
    private AType aType;

    public AString(String value) {
        this.value = value;
    }

    public AString(String value, AType aType) {
        this.value = value;
        this.aType = aType;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public AType getType() {
        return this.aType;
    public String toString(){
        String result = "";
        result += "String: " + value;
        return result;
    }
}