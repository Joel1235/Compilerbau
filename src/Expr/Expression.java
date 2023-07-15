package Expr;

import Codegenerierung.Codegenerierung;
import General.AType;

public interface Expression {

    void bevisited(Codegenerierung codegenerierung);

    AType getType();
}
