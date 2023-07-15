package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class IdExpr implements PointableExpression{
    private final String id;
    private AType aType;

    public IdExpr(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        System.out.println("Not Implemented");
    }

    public AType getType() {
        return this.aType;
    public String toString(){
        String result = "";
        result += "Id: " + id;
        return result;
    }
}
