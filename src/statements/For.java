package statements;

import Expr.Expression;
import General.AType;
import statementExpressions.StatementExpression;

public class For implements Statement {
    private AType type;
    private Statement init; // z.B. int i = 0;
    private Expression condition; // z.B. i < 10
    private StatementExpression update; // z.B. i = i + 1;
    private Statement statement;
    public int line;
    public int column;

    public For(
            Statement init, Expression condition, StatementExpression update,
            Statement statement) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
    }

    public For(AType type,
                   Statement init, Expression condition, StatementExpression update,
                   Statement statement) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.type = type;
    }

    public For(
            Statement init, Expression condition, StatementExpression update,
            Statement statement, int line,
            int column) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.line = line;
        this.column = column;
    }

    public For(AType type,
                   Statement init, Expression condition, StatementExpression update,
                   Statement statement, int line, int column) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.statement = statement;
        this.line = line;
        this.column = column;
        this.type = type;
    }


    public AType getType() {
        return type;
    }

    public void setType(AType type) {
        this.type = type;
    }

    public Statement getInit() {
        return init;
    }

    public void setInit(Statement init) {
        this.init = init;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public StatementExpression getUpdate() {
        return update;
    }

    public void setUpdate(StatementExpression update) {
        this.update = update;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }


    @Override
    public String toString(){
        String result = "";
        result += "For: (initStatement: " + init.toString() + ") (condition: " + condition.toString() + ") (updateStatement: " + update.toString() + ") (Statement: " + statement.toString() + ")";
        return result;
    }
}