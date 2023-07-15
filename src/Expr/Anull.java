package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public class Anull implements Expression {
    private AType aType;
    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public AType getType() {
        return this.aType;

    @Override
    public String toString(){
        String result = "";
        result += "Null";
        return result;
    }
}
