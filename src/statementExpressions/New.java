package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;

import java.util.List;

public class New implements StatementExpression {
    private final String id;
    private final List<Expression> exprList;
    public int line;
    public int column;
    private AType aType;

    public New(String id, List<Expression> exprList) {
        this.id = id;
        this.exprList = exprList;
    }

    public New(String id, List<Expression> exprList, int line, int column) {
        this.id = id;
        this.exprList = exprList;
        this.line = line;
        this.column = column;
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

    public String toString() {
        String result = "";
        result += "New: (Id: " + id + ") (expr: ";
        for (Expression e : exprList) {
            result += exprList.toString() + ",";
        }
        result += ")";
        return result;
    }
}