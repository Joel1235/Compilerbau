package statements;

import Expr.Expression;
import General.AType;

public class While implements Statement {
    private AType type;
    public int line;
    public int column;
    private Expression condition;
    private Block block;

    public While(Expression expression, Block block) {
        this.condition = expression;
        this.block = block;
    }

    public While(Expression expression, Block block, int line, int column) {
        this.condition = expression;
        this.block = block;
        this.line = line;
        this.column = column;
    }


    public AType getType() {
        return type;
    }

    public Expression getExpression() {
        return condition;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString(){
        String result = "";
        result += "While: (Condition: " + condition.toString() + ") (Block: " + block.toString() + ")";
        return result;
    }
}