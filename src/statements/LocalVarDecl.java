package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;

public class LocalVarDecl implements Statement {
    private final AType type;
    private final String id;
    private final Expression expr;

    public LocalVarDecl(AType type, String id, Expression expr) {
        this.type = type;
        this.id = id;
        this.expr = expr;
    }

    public AType getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public Expression getExpr() {
        return this.expr;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}