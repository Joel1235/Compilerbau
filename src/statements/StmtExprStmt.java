package statements;

import statementExpressions.StatementExpression;

public class StmtExprStmt implements Statement {
    private final StatementExpression stmtExpr;

    public StmtExprStmt(StatementExpression stmtExpr) {
        this.stmtExpr = stmtExpr;
    }

    public StatementExpression getStmtExpr() {
        return this.stmtExpr;
    }
}