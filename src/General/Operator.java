package General;

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
    OR("||"),
    INCPRE("++"),
    INCSUF("++"),
    DECPRE("--"),
    DECSUF("--");

    private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
