package General;

import Expr.LocalOrFieldVar;
import statementExpressions.MethodCallStmt;

import java.util.List;

public class Clazz {
    String name;
    List<LocalOrFieldVar> fields;
    List<MethodCallStmt> methods;

    public Clazz(String name, List<LocalOrFieldVar> fields, List<MethodCallStmt> methods) {
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
