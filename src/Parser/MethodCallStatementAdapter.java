package Parser;

import Expr.Expression;
import statementExpressions.MethodCallStmt;

import java.util.List;

public class MethodCallStatementAdapter {
    public static MethodCallStmt adapt(Expression expression, String methodName, List<Expression> arguments) {
        return new MethodCallStmt(expression, methodName, arguments);
    }
}

