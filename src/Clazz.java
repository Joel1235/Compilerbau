import java.util.List;

public class Clazz {
    String name;
    List<Field> fields;
    List<Method> methods;

    public Clazz(String name, List<Field> fields, List<Method> methods) {
        this.name = name;
        this.fields = fields;
        this.methods = methods;
    }

    public void typeCheck() {
        // Implementierung der Typüberprüfung
    }

    public void codeGen() {
        // Implementierung der Codegenerierung
    }
}
