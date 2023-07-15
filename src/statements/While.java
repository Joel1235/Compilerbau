package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;

public class While implements Statement {
    private final Expression condition;
    private final Block block;

    public While(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Block getBlock() {
        return this.block;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}