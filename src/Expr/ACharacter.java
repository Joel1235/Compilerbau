package Expr;

import Codegenerierung.Codegenerierung;

public class ACharacter implements Expression {
    private final char value;

    public ACharacter(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {

    }
}