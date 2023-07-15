package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class InstVar implements Expression {
    private final String id;
    private final Expression expr;
    public int line;
    public int column;
    private AType type;

    public InstVar(String identifier, Expression expression) {
        this.id = identifier;
        this.expr = expression;
    }

    public InstVar(String identifier, Expression expression, int line, int column) {
        this.id = identifier;
        this.expr = expression;
        this.line = line;
        this.column = column;
    }

    public InstVar(Expression expression, String identifier) {
        this.id = identifier;
        this.expr = expression;
    }

    public InstVar(AType type, String identifier, Expression expression) {
        this.id = identifier;
        this.expr = expression;
        this.type = type;
    }

    public InstVar(AType type, Expression expression, String identifier) {
        this.id = identifier;
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
        result += "InstVar: (Id: " + id + ") (expr: " + expr.toString() + ")";
        return result;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}