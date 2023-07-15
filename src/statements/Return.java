package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;

public class Return implements Statement {
    private final Expression expr;

    public Return(Expression expr) {
        this.expr = expr;
    }
    public Return() {
        this.expr = null;//default
    }

    public Expression getExpr() {
        return this.expr;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}
