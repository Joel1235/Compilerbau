package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;
import statementExpressions.StatementExpression;

import java.util.List;

public class MethodCall implements StatementExpression {
    private final String id;
    private final List<Expression> exprList;
    private AType aType;

    public MethodCall(String id, List<Expression> exprList) {
        this.id = id;
        this.exprList = exprList;
    }

    public String getId() {
        return this.id;
    }

    public List<Expression> getExprList() {
        return this.exprList;
    }

    @Override
    public AType getType() {
        return aType;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}
