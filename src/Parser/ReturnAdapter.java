package Parser;

import Expr.Expression;
import statements.Return;

public class ReturnAdapter {
    public static Return adapt(Expression expression) {
        return new Return(expression);
    }
}

