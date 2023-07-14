package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;
import General.ReturnType;


public class InstVar implements Expression {
    private final Expression expr;
    private final String id;
    private AType Atype;

    public InstVar(Expression expr, String id) {
        this.expr = expr;
        this.id = id;
    }

    public InstVar(Expression expr, String id, AType aType) {
        this.expr = expr;
        this.id = id;
        this.Atype = aType;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getId() {
        return this.id;
    }

    public AType getType() {
        return Atype;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}