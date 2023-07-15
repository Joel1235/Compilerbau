package Codegenerierung;

import Expr.AInteger;
import Expr.Binary;
import Expr.LocalOrFieldVar;
import General.*;
import statementExpressions.AssignStmt;
import statementExpressions.CrementStmtExpr;
import statementExpressions.Method;
import statements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BeispielCodegen {

    public static void main(String[] args) throws IOException {

        /* this Block works
        Block testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b",new AInteger(82,AType.INT)),
                //new AssignStmt("test",new AInteger(1,AType.INT),new LocalOrFieldVar(AType.INT,"m")),
                new While(new Unary(new Binary(new LocalOrFieldVar(AType.INT,"k"),new AInteger(10,AType.INT),Operator.LESS_THAN),"not"),
                        new Block(Arrays.asList(new IncrementExpr("v"),new AssignStmt("test",new AInteger(243634,AType.INT),new LocalOrFieldVar(AType.INT,"m")))))
                                ,new Block(Arrays.asList(new LocalVarDecl(AType.INT,"b",new AInteger(82,AType.INT)))
               )));*/
        Block testblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT, "i", new AInteger(1, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "i"),new AInteger(435345, AType.INT))
                , new If(new Binary(new LocalOrFieldVar(AType.INT, "t"),Operator.GREATER,
                        new LocalOrFieldVar(AType.INT, "i") ),
                        new Block(Arrays.asList(new AssignStmt(AType.INT,  new LocalOrFieldVar(AType.INT, "i"),new AInteger(1234, AType.INT))))
                )));
        Method testmethod = new Method("Test", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), testblock);
        Clazz testclazz = new Clazz("testmethod", new ArrayList<>(), Arrays.asList(testmethod));

        // Shows that while works
        Block Whileblock = new Block(Arrays.asList(
                new While(new Binary(new LocalOrFieldVar(AType.INT, "k"), Operator.LESS,
                        new AInteger(10, AType.INT)),
                        new Block(Arrays.asList(
                                new CrementStmtExpr(AType.INT,new LocalOrFieldVar(AType.INT,"k"),Operator.INCSUF)
                        )))

                , new Return(new LocalOrFieldVar(AType.INT, "k"))
        ));
        Method WhileMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "Whilemethod", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), Whileblock);
        Clazz WhileClazz = new Clazz("Whilemethod", new ArrayList<>(), Arrays.asList(WhileMethod));
        /* cant be decompiled
        Block testblock = new Block(Arrays.asList(new If(new AInteger(12345,AType.INT ),
                new Block(Arrays.asList(new AssignStmt("test2",new AInteger(12345,AType.INT),new LocalOrFieldVar(AType.INT,"t")))))));
*/
        // This shows that Binary and AssignStm funtions
        Block AssignandBinary = new Block(Arrays.asList(
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "k"),
                        new Binary(new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v"), Operator.PLUS, AType.INT)
                        )));
        Method AssignAndBinarymethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "Test", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), AssignandBinary);
        Clazz AssignAndBinaryclazz = new Clazz("AssignAndBinary", new ArrayList<>(), Arrays.asList(AssignAndBinarymethod));

        /*
       Block testblock = new Block(Arrays.asList(
               //new LocalVarDecl(AType.INT,"i", new AInteger(45645745,AType.INT)), Throws index out of Bound in visitmaxs
                new AssignStmt("test1",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"u")),
                new While(new Binary(new LocalOrFieldVar(AType.INT,"m"),new LocalOrFieldVar(AType.INT,"v"),Operator.LESS_THAN,AType.BOOLEAN),
                new Block(Arrays.asList(new AssignStmt("test",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"i"))) ))
       ,new LocalVarDecl(AType.INT,"p",new AInteger(1,AType.INT))
       ,new AssignStmt("test2",new AInteger(3,AType.INT),new LocalOrFieldVar(AType.INT,"g"))
       ));*/



/*
        // If-Block Anfang
        Block ifBlock = new Block(Arrays.asList(
                new AssignStmt("x", new AInteger(5, AType.INT), new LocalOrFieldVar(AType.INT, "a")),
                new If(new Binary(new LocalOrFieldVar(AType.INT, "a"), new AInteger(10, AType.INT), Operator.GREATER_THAN),
                        new Block(Arrays.asList(
                                new AssignStmt("y", new AInteger(2, AType.INT), new LocalOrFieldVar(AType.INT, "b"))
                                //new AssignStmt("z", new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.MULTIPLY, AType.INT), new LocalOrFieldVar(AType.INT, "c"))
                        ))
                )
        ));

        Method ifMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "IfExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), new LocalOrFieldVar(AType.INT, "c")), ifBlock);
        Clazz ifClazz = new Clazz("IfExampleClass", new ArrayList<>(), Arrays.asList(ifMethod));
        // If-Block Ende
*/
/*
        // Loop-Block Anfang
        Block loopBlock = new Block(Arrays.asList(
                new AssignStmt("i", new AInteger(0, AType.INT), new LocalOrFieldVar(AType.INT, "counter")),
                new While(new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(10, AType.INT), Operator.LESS_THAN),
                        new Block(Arrays.asList(
                                new AssignStmt("i", new Binary(new LocalOrFieldVar(AType.INT, "i"), new AInteger(1, AType.INT), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "i")),
                                new AssignStmt("counter", new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(1, AType.INT), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "counter"))
                        ))
                )
        ));

        Method loopMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "LoopExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "counter")), loopBlock);
        Clazz loopClazz = new Clazz("LoopExampleClass", new ArrayList<>(), Arrays.asList(loopMethod));
        // Loop-Block Ende
*/
/*
        // Berechnungs-Block Anfang
        Block calculationBlock = new Block(Arrays.asList(
                new AssignStmt("x", new AInteger(10, AType.INT), new LocalOrFieldVar(AType.INT, "a")),
                new AssignStmt("y", new AInteger(20, AType.INT), new LocalOrFieldVar(AType.INT, "b")),
                new If(new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.GREATER_THAN),
                        new Block(Arrays.asList(
                                new AssignStmt("result", new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.MINUS, AType.INT), new LocalOrFieldVar(AType.INT, "c"))
                        )),
                        new Block(Arrays.asList(
                                new AssignStmt("result", new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "c"))
                        ))
                )
        ));

        Method calculationMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "CalculationExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), new LocalOrFieldVar(AType.INT, "c")), calculationBlock);
        Clazz calculationClazz = new Clazz("CalculationExampleClass", new ArrayList<>(), Arrays.asList(calculationMethod));
        // Berechnungs-Block Ende
*/
/*
        // Loop und If-Block Anfang
        Block loopAndIfBlock = new Block(Arrays.asList(
                new LocalVarDecl(AType.INT, "counter", new AInteger(0, AType.INT)),
                new While(new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(5, AType.INT), Operator.LESS_THAN),
                        new Block(Arrays.asList(
                                new If(new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(2, AType.INT), Operator.EQUAL_TO, AType.BOOLEAN),
                                        new Block(Arrays.asList(
                                                new AssignStmt("result", new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(10, AType.INT), Operator.MULTIPLY, AType.INT), new LocalOrFieldVar(AType.INT, "c"))
                                        )),
                                        new Block(Arrays.asList(
                                                new AssignStmt("result", new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(5, AType.INT), Operator.MULTIPLY, AType.INT), new LocalOrFieldVar(AType.INT, "c"))
                                        ))
                                ),
                                new AssignStmt("counter", new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(1, AType.INT), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "counter"))
                        ))
                )
        ));

        Method loopAndIfMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "LoopAndIfExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "c")), loopAndIfBlock);
        Clazz loopAndIfClazz = new Clazz("LoopAndIfExampleClass", new ArrayList<>(), Arrays.asList(loopAndIfMethod));
        // Loop und If-Block Ende
*/

        // Return-Block Anfang
        Block returnBlock = new Block(Arrays.asList(
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "a"),new AInteger(5, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "b"),new AInteger(10, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "c"), new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.MULT, AType.INT)),
                new Return(new LocalOrFieldVar(AType.INT, "result"))
        ));

        Method returnMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "MultiplyExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), new LocalOrFieldVar(AType.INT, "c")), returnBlock);
        Clazz returnClazz = new Clazz("MultiplyExampleClass", new ArrayList<>(), Arrays.asList(returnMethod));
        // Return-Block Ende

/*
        // Summen-Block Anfang
        Block sumBlock = new Block(Arrays.asList(
                new LocalVarDecl(AType.INT, "sum", new AInteger(0, AType.INT)),
                new LocalVarDecl(AType.INT, "counter", new AInteger(1, AType.INT)),
                new While(new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(10, AType.INT), Operator.LESS_THAN_OR_EQUAL_TO),
                        new Block(Arrays.asList(
                                new AssignStmt("sum", new Binary(new LocalOrFieldVar(AType.INT, "sum"), new LocalOrFieldVar(AType.INT, "counter"), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "sum")),
                                new AssignStmt("counter", new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(1, AType.INT), Operator.PLUS, AType.INT), new LocalOrFieldVar(AType.INT, "counter"))
                        ))
                ),
                new Return(new LocalOrFieldVar(AType.INT, "sum"))
        ));

        Method sumMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "SumExample", new ArrayList<>(), sumBlock);
        Clazz sumClazz = new Clazz("SumExampleClass", new ArrayList<>(), Arrays.asList(sumMethod));
        // Summen-Block Ende
*/

        Codegenerierung codegen = new Codegenerierung();
        codegen.Start(testclazz);
        codegen.Start(AssignAndBinaryclazz);//works
        codegen.Start(WhileClazz);//works
        //codegen.Start(ifClazz);
        //codegen.Start(loopClazz);
        //codegen.Start(calculationClazz);
        //codegen.Start(loopAndIfClazz);
        codegen.Start(returnClazz);//works
        //codegen.Start(sumClazz);
    }
}


