package Expr;

public class AString implements Expression {
    private final String value;

    public AString(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}