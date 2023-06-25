import statements.Statement;

import java.lang.reflect.Parameter;
import java.util.List;

public class Method {
    Type type;
    String name;
    List<Parameter> para;
    statements.Statement stmt;

    public Method(Type type, String name, List<Parameter> para, Statement stmt) {
        this.type = type;
        this.name = name;
        this.para = para;
        this.stmt = stmt;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<Parameter> getPara() {
        return para;
    }

    public Statement getStmt() {
        return stmt;
    }
}
