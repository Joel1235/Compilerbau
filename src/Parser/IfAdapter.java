package Parser;

import Expr.Expression;
import statements.Block;
import statements.If;

public class IfAdapter {
    public static If adapt(Expression condition, Block ifBlock, Block elseBlock) {
        return new If(condition, ifBlock, elseBlock);
    }
}
