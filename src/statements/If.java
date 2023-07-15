package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;

public class If implements Statement {
    private final Expression condition;
    private final Block ifBlock;
    private final Block elseBlock;

    public If(Expression condition, Block ifBlock, Block elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    public If(Expression condition, Block ifBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = null;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Block getIfBlock() {
        return this.ifBlock;
    }

    public Block getElseBlock() {
        return this.elseBlock;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}