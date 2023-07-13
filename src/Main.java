//import TreeGeneration.ASTGenerator;

import Codegenerierung.Codegenerierung;
import Expr.*;
import General.AType;
import General.BinaryOperator;
import statementExpressions.AssignStmt;
import statements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String teststring = "class TestKlasse{int i = i;}";
        //System.out.println(ASTGenerator.generateAST(teststring));

       /* Block testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(1,AType.INT)),
                new If(new Binary(new LocalOrFieldVar(AType.INT,"i"),new AInteger(2,AType.INT),BinaryOperator.GREATER_THAN),
                        new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(45,AType.INT))))
                                ,new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(82,AType.INT)))
               ))));*/
        Block testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(1,AType.INT)),
                new AssignStmt("test",new AInteger(435345,AType.INT),new LocalOrFieldVar(AType.INT,"i"))));

       //Block testblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",
        //        new AInteger(1,AType.INT)),
         //       new While(new AInteger(1,AType.INT),
         //       new Block(Arrays.asList(new AssignStmt("test",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"i"))) ))));
        new Codegenerierung().Start(testblock);
    }
}
