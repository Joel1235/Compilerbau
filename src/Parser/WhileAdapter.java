package Parser;

import Expr.Expression;
import statements.Block;
import statements.While;

public class WhileAdapter {
    public static While adapt(Expression condition, Block body) {
        return new While(condition, body);
    }
}

