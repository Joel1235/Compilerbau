package Expr;

public class ABool implements Expression {
    private final boolean value;

    public ABool(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Boolean: " + value;
        return result;
    }

}
