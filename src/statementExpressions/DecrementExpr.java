package statementExpressions;

import Codegenerierung.Codegenerierung;
import General.AType;

public class DecrementExpr implements StatementExpression {
    private final String id;
    private AType aType;

    public DecrementExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
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
