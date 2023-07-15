package statementExpressions;

import Codegenerierung.Codegenerierung;
import Expr.Expression;
import General.AType;

public class AssignStmt implements StatementExpression {
    private final Expression lExpr;
    private final Expression rExpr;
    private AType type;
    public int line;
    public int column;

    public AssignStmt(Expression lExpression, Expression rExpression) {
        this.lExpr = lExpression;
        this.rExpr = rExpression;
    }

    public AssignStmt(Expression lExpression, Expression rExpression, int line, int col) {
        this.lExpr = lExpression;
        this.rExpr = rExpression;
        this.line = line;
        this.column = col;
    }

    public AssignStmt(AType type, Expression lExpression, Expression rExpression) {
        this.lExpr = lExpression;
        this.rExpr = rExpression;
        this.type = type;
    }


    public Expression getlExpr() {
        return lExpr;
    }


    public Expression getrExpr() {
        return rExpr;
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
        result += "AssignStmt: (Type: " + type + ") (lexpr: " + lExpr.toString() + ") (rexpr: " + rExpr.toString() + ")";
        return result;
    }

    @Override
    public void bevisited(Codegenerierung codegenerierung) {
        codegenerierung.visit(this);
    }
}