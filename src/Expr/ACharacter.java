package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class ACharacter implements Expression {
    private final char value;
    private AType aType;

    public ACharacter(char value) {
        this.value = value;
    }

    public ACharacter(char value,AType aType) {
        this.value = value;
        this.aType = aType;
    }

    public char getValue() {
        return this.value;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    @Override
    public AType getType() {
        return this.aType;
    }

    public String toString(){
        String result = "";
        result += "Char: " + value;
        return result;
    }
}