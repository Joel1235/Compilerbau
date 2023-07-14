//import TreeGeneration.ASTGenerator;

import Codegenerierung.Codegenerierung;
import Expr.*;
import General.AType;
import General.BinaryOperator;
import statementExpressions.AssignStmt;
import statementExpressions.Method;
import statements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Main {
    public static void main(String[] args) throws IOException {
        String teststring = "class TestKlasse{int i = i;}";
        //System.out.println(ASTGenerator.generateAST(teststring));
        /*Works
        Block testblock=new Block(Arrays.asList(new AssignStmt("test",new AInteger(1,AType.INT),new LocalOrFieldVar(AType.INT,"m")),
                new While(new Binary(new LocalOrFieldVar(AType.INT,"m"),new AInteger(10,AType.INT),BinaryOperator.LESS_THAN),
                        new Block(Arrays.asList()))
                                ,new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b",new AInteger(82,AType.INT))))
               ));*/
       /* Block testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(1,AType.INT)),
                new AssignStmt("test",new AInteger(435345,AType.INT),new LocalOrFieldVar(AType.INT,"i"))
        ,new If(new Binary(new LocalOrFieldVar(AType.INT,"t"),
                        new LocalOrFieldVar(AType.INT,"i"), BinaryOperator.GREATER_THAN),
                        new Block(Arrays.asList(new AssignStmt("test2",new AInteger(1234,AType.INT),new LocalOrFieldVar(AType.INT,"i"))))
                        )));*/
        /* visit maxs throws error
        Block testblock =new Block( Arrays.asList(new While(new Binary(new AInteger(3,AType.INT),
                new AInteger(4,AType.INT), BinaryOperator.GREATER_THAN),
                new Block(Arrays.asList(new AssignStmt("test2",new AInteger(12345,AType.INT),new LocalOrFieldVar(AType.INT,"m"))))
                )));/*
        Block testblock = new Block(Arrays.asList(new If(new AInteger(12345,AType.INT ),
                new Block(Arrays.asList(new AssignStmt("test2",new AInteger(12344,AType.INT),new LocalOrFieldVar(AType.INT,"t")))))));
*/
        // works
        Block testblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b", new AInteger(23446, AType.INT)),
                new AssignStmt("test",new Binary(new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v"),BinaryOperator.PLUS,AType.INT),
                        new LocalOrFieldVar(AType.INT,"b"))));


       //Block testblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",
        //        new AInteger(1,AType.INT)),
         //       new While(new AInteger(1,AType.INT),
         //       new Block(Arrays.asList(new AssignStmt("test",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"i"))) ))));

        Method testmethod= new Method("Test",Arrays.asList(new LocalOrFieldVar(AType.INT,"k"),
                new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v")),testblock);

        new Codegenerierung().Start(testmethod);

    }
}
