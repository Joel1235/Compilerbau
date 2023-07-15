package Parser;

import Expr.LocalOrFieldVar;
import General.AType;

public class LocalOrFieldVarAdapter {
    public static LocalOrFieldVar adapt(AType type,String identifier) {
        return new LocalOrFieldVar(type,identifier);
    }
}

