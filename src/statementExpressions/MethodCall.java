package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;
import Helper.ArgumentHelper;

public class MethodCall implements StatementExpression {
    public String id;
    public Expression receiver;
    public ArgumentHelper<Expression> arguments;
    public AType type;
    public int line;
    public int column;

    public MethodCall(String identifier, Expression receiver, ArgumentHelper<Expression> arguments) {
        this.id = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public MethodCall(String identifier, Expression receiver, ArgumentHelper<Expression> arguments, int line,
                      int column) {
        this.id = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
        this.line = line;
        this.column = column;
    }

    public MethodCall(Expression receiver, String identifier, ArgumentHelper<Expression> arguments) {
        this.id = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
    }

    public MethodCall(AType type, Expression receiver, String identifier, ArgumentHelper<Expression> arguments) {
        this.id = identifier;
        this.receiver = receiver;
        this.arguments = arguments;
        this.type = type;
    }

    public MethodCall(String identifier, ArgumentHelper<Expression> arguments) {
        this.id = identifier;
        this.receiver = null;
        this.arguments = arguments;
    }


    public String getId() {
        return id;
    }


    public Expression getReceiver() {
        return receiver;
    }


    public ArgumentHelper<Expression> getArguments() {
        return arguments;
    }


    public AType getType() {
        return type;
    }


    public void setType(AType type) {
        this.type = type;
    }


    @Override
    public String toString(){
        String result = "";
        result += "MethodCall: (Id: " + id + ") (expr: ";
        for(Expression e: arguments){
            result += arguments.toString() + ",";
        }
        result += ")";
        return result;
    }

    @Override
    public AType getType() {
        return aType;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}
