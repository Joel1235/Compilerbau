package Parser;

import Expr.Expression;
import statementExpressions.New;

import java.util.List;

public class NewAdapter {
    public static New adapt(String className, List<Expression> arguments) {
        return new New(className, arguments);
    }
}
