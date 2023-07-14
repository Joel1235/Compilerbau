package Codegenerierung;

import Expr.AInteger;
import Expr.Binary;
import Expr.LocalOrFieldVar;
import General.AType;
import General.AccessModifier;
import General.BinaryOperator;
import General.ReturnType;
import statementExpressions.AssignStmt;
import statementExpressions.IncrementExpr;
import statementExpressions.Method;
import statements.Block;
import statements.LocalVarDecl;
import statements.Return;
import statements.While;

import java.io.IOException;
import java.util.Arrays;

public class BeispielCodegen {

    public class Main {
        public static void main(String[] args) throws IOException {

        /*Works
        Block testblock=new Block(Arrays.asList(new AssignStmt("test",new AInteger(1,AType.INT),new LocalOrFieldVar(AType.INT,"m")),
                new While(new Binary(new LocalOrFieldVar(AType.INT,"m"),new AInteger(10,AType.INT),BinaryOperator.LESS_THAN),
                        new Block(Arrays.asList(new IncrementExpr("m"))))
                                ,new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b",new AInteger(82,AType.INT))))
               ));*/
       /* Block testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(1,AType.INT)),
                new AssignStmt("test",new AInteger(435345,AType.INT),new LocalOrFieldVar(AType.INT,"i"))
        ,new If(new Binary(new LocalOrFieldVar(AType.INT,"t"),
                        new LocalOrFieldVar(AType.INT,"i"), BinaryOperator.GREATER_THAN),
                        new Block(Arrays.asList(new AssignStmt("test2",new AInteger(1234,AType.INT),new LocalOrFieldVar(AType.INT,"i"))))
                        )));*/
            // visit maxs throws error
            Block testblock =new Block(Arrays.asList(new AssignStmt("test2",new AInteger(12345, AType.INT),new LocalOrFieldVar(AType.INT,"m")),
                    new While(new Binary(new LocalOrFieldVar(AType.INT,"k"),
                            new AInteger(10,AType.INT), BinaryOperator.LESS_THAN),
                            new Block(Arrays.asList(
                                    new IncrementExpr("k")
                                    //new AssignStmt("test2",new AInteger(12345,AType.INT),new LocalOrFieldVar(AType.INT,"m"))

                            )))

                    ,new Return(new LocalOrFieldVar(AType.INT,"k"))
            ));
        /* cant be decompiled
        Block testblock = new Block(Arrays.asList(new If(new AInteger(12345,AType.INT ),
                new Block(Arrays.asList(new AssignStmt("test2",new AInteger(12345,AType.INT),new LocalOrFieldVar(AType.INT,"t")))))));
*/
            // This shows that Binary and AssignStm funktioniert
            Block AssignandBinary = new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b", new AInteger(23446, AType.INT)),
                    new AssignStmt("test",new Binary(new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v"),BinaryOperator.PLUS,AType.INT),
                            new LocalOrFieldVar(AType.INT,"b"))));

        /*
       Block testblock = new Block(Arrays.asList(
               //new LocalVarDecl(AType.INT,"i", new AInteger(45645745,AType.INT)), Throws index out of Bound in visitmaxs
                new AssignStmt("test1",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"u")),
                new While(new Binary(new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v"),BinaryOperator.LESS_THAN,AType.BOOLEAN),
                new Block(Arrays.asList(new AssignStmt("test",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"i"))) ))
       ,new LocalVarDecl(AType.INT,"p",new AInteger(1,AType.INT))
       ,new AssignStmt("test2",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"g"))
       ));*/

            Method testmethod= new Method(AccessModifier.PUBLIC, ReturnType.INT,"Test",Arrays.asList(new LocalOrFieldVar(AType.INT,"k"),
                    new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v")),testblock);

            Codegenerierung Codegen = new Codegenerierung();
            Codegen.Start(testmethod);
        }
    }

}
