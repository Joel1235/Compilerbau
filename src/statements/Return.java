package statements;

import Expr.Expression;

public class Return implements Statement {
    private final Expression expr;

    public Return(Expression expr) {
        this.expr = expr;
    }

    public Expression getExpr() {
        return this.expr;
    }
}
