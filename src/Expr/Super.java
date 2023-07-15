package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class Super implements PointableExpression{
    private AType aType;
    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        System.out.println("Not implemented");
    }

    public AType getType() {
        return this.aType;
    }
}
