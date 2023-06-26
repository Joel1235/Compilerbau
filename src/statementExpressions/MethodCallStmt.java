package statementExpressions;

import Expr.Expression;

import java.util.List;

public class MethodCallStmt implements StatementExpression {
    private final Expression expr;
    private final String id;
    private final List<Expression> exprList;

    public MethodCallStmt(Expression expr, String id, List<Expression> exprList) {
        this.expr = expr;
        this.id = id;
        this.exprList = exprList;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getId() {
        return this.id;
    }

    public List<Expression> getExprList() {
        return this.exprList;
    }
}
