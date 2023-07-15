package Syntaxcollection;

public enum Operator {

    ASSIGN("="),
    PLUS("+"),
    MINUS("-"),
    MULT("*"),
    DIV("/"),
    GREATER(">"),
    LESS("<"),
    GREATEREQUAL(">="),
    LESSEQUAL("<="),
    EQUAL("=="),
    NOTEQUAL("!="),
    NOT("!"),
    AND("&&"),
    MOD("%"),
    OR("||");

    private String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}

