package Parser;

import Expr.Expression;
import Expr.Unary;

public class UnaryAdapter {
    public static Unary adapt(Expression expression, String operator) {
        return new Unary(expression, operator);
    }
}

