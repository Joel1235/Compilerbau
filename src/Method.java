import General.AType;
import statements.Statement;

import java.lang.reflect.Parameter;
import java.util.List;

public class Method {
    AType type;
    String name;
    List<Parameter> para;
    statements.Statement stmt;

    public Method(AType type, String name, List<Parameter> para, Statement stmt) {
        this.type = type;
        this.name = name;
        this.para = para;
        this.stmt = stmt;
    }

    public AType getType() {
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
