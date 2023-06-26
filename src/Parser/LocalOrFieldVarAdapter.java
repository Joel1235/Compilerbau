package Parser;

import Expr.LocalOrFieldVar;
import General.AType;

public class LocalOrFieldVarAdapter {
    public static LocalOrFieldVar adapt(AType identifier) {
        return new LocalOrFieldVar(identifier);
    }
}

