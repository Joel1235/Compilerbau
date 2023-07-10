package General;

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
}
