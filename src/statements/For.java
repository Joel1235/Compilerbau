package statements;

import Expr.Expression;

public class For implements Statement {
    private final StmtExprStmt initStmt;
    private final Expression condition;
    private final StmtExprStmt updateStmt;
    private final Block body;

    public For(StmtExprStmt initStmt, Expression condition, StmtExprStmt updateStmt, Block body) {
        this.initStmt = initStmt;
        this.condition = condition;
        this.updateStmt = updateStmt;
        this.body = body;
    }

    public StmtExprStmt getInitStmt() {
        return this.initStmt;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public StmtExprStmt getUpdateStmt() {
        return this.updateStmt;
    }

    public Block getBody() {
        return this.body;
    }

}