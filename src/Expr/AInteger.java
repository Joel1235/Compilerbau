package Expr;

public class AInteger implements Expression {
    private final int value;

    public AInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
