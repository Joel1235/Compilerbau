package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.Operator;
import General.AType;

public class CrementStmtExpr implements StatementExpression {

    private final Expression expression;
    private final Operator operator;
    private AType type;
    public int line;
    public int column;

    public CrementStmtExpr(Expression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public CrementStmtExpr(Expression expression, Operator operator, int line, int col) {
        this.expression = expression;
        this.operator = operator;
        this.line = line;
        this.column = col;
    }

    public CrementStmtExpr(AType type, Expression expression, Operator operator) {
        this.expression = expression;
        this.operator = operator;
        this.type = type;
    }


    public Expression getExpression() {
        return expression;
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
    public String toString() {
        switch (operator) {
            case INCPRE:
                return "++" + expression.toString() + " (" + this.type + ")";
            case DECPRE:
                return "--" + expression.toString() + " (" + this.type + ")";
            case INCSUF:
                return expression.toString() + "++" + " (" + this.type + ")";
            case DECSUF:
                return expression.toString() + "--" + " (" + this.type + ")";
            default:
                return "CrementWithWrongOperator???";
        }
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        // TODO: fix this
        //codegenerierung.visit(this);
    }
}
