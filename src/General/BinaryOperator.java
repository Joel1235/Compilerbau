package General;

public enum BinaryOperator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MODULUS("%"),
    EQUAL_TO("=="),
    NOT_EQUAL_TO("!="),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL_TO("<="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL_TO(">="),
    AND("&&"),
    OR("||");

    private final String symbol;

    BinaryOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}

