package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class This implements PointableExpression {
    private AType aType;

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public AType getType() {
        return this.aType;
    }

    @Override
    public String toString() {
        String result = "";
        result += "This";
        return result;
    }

}
