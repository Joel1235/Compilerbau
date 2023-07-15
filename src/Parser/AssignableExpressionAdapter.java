package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import Expr.LocalOrFieldVar;

public class AssignableExpressionAdapter {
    public static Expression adapt(miniJavaParser.AssignableExprContext assignableExprContext) {
        if (assignableExprContext.instVar() != null)
            return InstVarAdapter.adapt(assignableExprContext.instVar());
        else //ID
            return new LocalOrFieldVar(assignableExprContext.ID().getText());
    }
}
