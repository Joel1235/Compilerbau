package statements;

import Codegenerierung.Codegenerierung;

import java.util.List;

public class Block implements Statement {
    private final List<Statement> statements;

    public Block(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public String toString() {
        String result = "";
        result += "(statements: ";
        for (Statement s : statements) {
            result += s.toString() + ",";
        }
        result += ")";
        return result;
    }
}