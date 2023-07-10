package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;
import General.ReturnType;
import Syntaxcollection.Type;

public class InstVar implements Expression {
    private final Expression expr;
    private final String id;
    private AType Atype;

    public InstVar(Expression expr, String id) {
        this.expr = expr;
        this.id = id;
    }

    public InstVar(Expression expr, String id, ReturnType returnType) {
        this.expr = expr;
        this.id = id;
        this.AType = returnType;
    }

    public Expression getExpr() {
        return this.expr;
    }

    public String getId() {
        return this.id;
    }

    public ReturnType getAtype() {
        return AType;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}