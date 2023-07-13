package statements;

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
    public String toString(){
        String result = "";
        result += "If: (Condition: " + condition.toString() + ") (ifBlock: " + ifBlock.toString() + ") (elseBlock: " + elseBlock.toString() + ")";
        return result;
    }
}