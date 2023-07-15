package General;

import Expr.Expression;

import java.util.ArrayList;
import java.util.List;

public class Program{
    private List<Clazz> clazzes;
    public Program(List<Clazz> classes) {
        clazzes = classes;
    }

    public List<Clazz> getClazzes() {
        return clazzes;
    }

    @Override
    public String toString(){
        String result = "Clazz: ";
        for(Clazz c : clazzes) {
            result += c.toString();
        }
        return result;
    }
}
