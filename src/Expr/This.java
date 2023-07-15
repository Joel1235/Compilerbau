package Expr;

public class This implements PointableExpression{

    @Override
    public String toString(){
        String result = "";
        result += "This";
        return result;
    }

}
