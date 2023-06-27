package Syntaxcollection.Expressions;

import Codegenerierung.Codegenerierung;

public interface IExpression {
    default void bevisited(Codegenerierung visitor) {
    }
}
