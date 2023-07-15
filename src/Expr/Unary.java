package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;
import General.Operator;

public class Unary implements Expression {
    private Expression expr;
    private Operator operator;
    private AType type;
    public int line;
    public int column;

    public Unary(Expression expression, Operator operator, int line, int column) {
        this.expr = expression;
        this.operator = operator;
        this.line = line;
        this.column = column;
    }


    public Expression getExpr() {
        return expr;
    }

    public Operator getOperator() {
        return operator;
    }

    public AType getType() {
        return type;
    }


    public void setType(AType type) {
        this.type = type;
    }



    @Override
    public String toString(){
        String result = "";
        result += "Unary: (expr: " + expr.toString() + ") (Operator: " + operator.toString() + ")";
        return result;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}