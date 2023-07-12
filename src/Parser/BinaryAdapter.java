package Parser;

import Expr.Binary;
import Expr.Expression;
import General.BinaryOperator;

public class BinaryAdapter {
    public static Binary adapt(Expression left, Expression right, BinaryOperator op) {
        return new Binary(left, right, op);
    }
}

