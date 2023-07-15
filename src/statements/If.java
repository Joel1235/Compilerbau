package statements;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;

public class If implements Statement {
    private final Expression condition;
    private final Statement blockIf;
    private final Statement blockElse;
    private AType type;
    public int line;
    public int column;

    public If(Expression condition, Statement blockIf, Statement blockElse) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = blockElse;
    }

    public If(Expression condition, Statement blockIf, Statement blockElse, int line, int column) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = blockElse;
        this.line = line;
        this.column = column;
    }

    public If(Expression condition, Statement blockIf, int line, int column) {
        this.condition = condition;
        this.blockIf = blockIf;
        this.blockElse = null;
        this.line = line;
        this.column = column;
    }


    public AType getType() {
        return type;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
    public void setType(AType type) {
        this.type = type;
    }

}