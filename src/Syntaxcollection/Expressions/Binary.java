package Syntaxcollection.Expressions;

import Syntaxcollection.Operator;
import Syntaxcollection.Type;

public class Binary {

    private IExpression lExpression;
    private IExpression rExpression;

    private Operator operator;
    private Type type;
    public int line;
    public int column;

    public IExpression getlExpression() {
        return lExpression;
    }

    public Operator getOperator() {
        return operator;
    }

    public IExpression getrExpression() {
        return rExpression;
    }
}
