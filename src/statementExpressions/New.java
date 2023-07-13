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

    @Override
    public String toString(){
        String result = "";
        result += "New: (Id: " + id + ") (expr: ";
        for(Expression e: exprList){
            result += exprList.toString() + ",";
        }
        result += ")";
        return result;
    }
}