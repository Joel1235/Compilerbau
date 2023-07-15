package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.LocalOrFieldVar;
import General.AType;
import General.AccessModifier;
import General.ReturnType;
import statements.Block;

import java.util.List;

public class Method implements StatementExpression {
    private final AccessModifier accessModifier;
    private final ReturnType returnType;
    private final String id;
    private final List<LocalOrFieldVar> params;
    private final Block block;
    private AType aType;

    //constructor
    public Method(String id, List<LocalOrFieldVar> params, Block block) {
        this.accessModifier = AccessModifier.PUBLIC; //default
        this.block = block;
        this.returnType = null; //default
        this.id = id;
        this.params = params;
    }

    //normal method
    public Method(AccessModifier accessModifier, ReturnType returnType, String id, List<LocalOrFieldVar> params, Block block) {
        this.accessModifier = accessModifier;
        this.block = block;
        this.returnType = returnType;
        this.id = id;
        this.params = params;
    }

    public Method(ReturnType returnType, String id, List<LocalOrFieldVar> params, Block block) {
        this.accessModifier = AccessModifier.PROTECTED; //default
        this.block = block;
        this.returnType = returnType;
        this.id = id;
        this.params = params;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public String getId() {
        return id;
    }

    public List<LocalOrFieldVar> getParams() {
        return params;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public AType getType() {
        return aType;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }

    public String toString() {
        String result = "";
        result += "Method: (Id: " + id + ") (AccesModifier: " + accessModifier.toString() + ") (ReturnType: " + returnType.toString() + ") (Parameters: ";
        for (LocalOrFieldVar p : params) {
            result += p.toString() + ",";
        }
        result += ") Block: ";
        result += block.toString();
        return result;
    }
}
