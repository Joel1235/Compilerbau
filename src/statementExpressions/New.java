package statementExpressions;

import Expr.Expression;

import java.util.List;

public class New implements StatementExpression {
    private final String id;
    private final List<Expression> exprList;

    public New(String id, List<Expression> exprList) {
        this.id = id;
        this.exprList = exprList;
    }

    public String getId() {
        return this.id;
    }

    public List<Expression> getExprList() {
        return this.exprList;
    }
}