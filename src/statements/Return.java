package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;

public class Return implements Statement {
    public int line;
    public int column;
    private Expression expr;
    private AType type;

    public Return(Expression expression) {
        this.expr = expression;
    }

    public Return(Expression expression, int line, int column) {
        this.expr = expression;
        this.line = line;
        this.column = column;
    }

    public Return(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public Return(AType type, Expression expression) {
        this.expr = expression;
        this.type = type;
    }


    public Expression getExpr() {
        return expr;
    }


    public AType getType() {
        return type;
    }


    public void setType(AType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Return: (expr: " + expr.toString() + ")";
        return result;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}
