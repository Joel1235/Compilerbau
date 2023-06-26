package Parser;

import Expr.Binary;
import Expr.Expression;

public class BinaryAdapter {
    public static Binary adapt(Expression left, Expression right, String op) {
        return new Binary(left, right, op);
    }
}

