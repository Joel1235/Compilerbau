package statementExpressions;

import Expr.Expression;
import Expr.LocalOrFieldVar;
import General.AType;
import statements.Block;

import java.util.List;

public class Method implements StatementExpression {
    private final AType returnType;
    private final String id;
    private final List<LocalOrFieldVar> params;
    private final Block block;
    public Method(AType returnType, String id, List<LocalOrFieldVar> params, Block block) {
        this.block = block;
        this.returnType = returnType;
        this.id = id;
        this.params = params;
    }

    public AType getExpr() {
        return this.returnType;
    }

    public String getId() {
        return this.id;
    }

    public List<LocalOrFieldVar> getParamList() {
        return this.params;
    }

    public Block getBlock() {
        return block;
    }
}
