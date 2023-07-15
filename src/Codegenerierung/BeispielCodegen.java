package Codegenerierung;

import Expr.AInteger;
import Expr.Binary;
import Expr.LocalOrFieldVar;
import General.*;
import Helper.ArgumentHelper;
import statementExpressions.AssignStmt;
import statementExpressions.CrementStmtExpr;
import statementExpressions.Method;
import statementExpressions.MethodCall;
import statements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BeispielCodegen {

    public static void main(String[] args) throws IOException {
        ArgumentHelper test=new ArgumentHelper();
        test.add(new AInteger(432452,AType.INT));
        Block recursiveblock = new Block(Arrays.asList(new MethodCall("Recursive",test)));
        Method recursivemethod = new Method("Recursive", Arrays.asList(new LocalOrFieldVar(AType.INT, "k")
                ), recursiveblock);
        Clazz recursiveclazz = new Clazz("Recursive", new ArrayList<>(), Arrays.asList(recursivemethod));

        Block sillyblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT, "i", new AInteger(1, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "i"), new AInteger(435345, AType.INT))
                , new If(new Binary(new LocalOrFieldVar(AType.INT, "m"), Operator.GREATER,
                        new LocalOrFieldVar(AType.INT, "i")),
                        new Block(Arrays.asList(new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "i"), new AInteger(1234, AType.INT))))
                )));
        Method sillymethod = new Method("Silly", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), sillyblock);
        Clazz sillyclazz = new Clazz("Sillymethod", new ArrayList<>(), Arrays.asList(sillymethod));

        // Shows that while works
        Block Whileblock = new Block(Arrays.asList(
                new While(new Binary(new LocalOrFieldVar(AType.INT, "k"), Operator.LESS,
                        new AInteger(10, AType.INT)),
                        new Block(Arrays.asList(
                                new CrementStmtExpr(AType.INT, new LocalOrFieldVar(AType.INT, "k"), Operator.INCPRE)
                        )))
                    ,new CrementStmtExpr(AType.INT, new LocalOrFieldVar(AType.INT, "k"), Operator.INCPRE)
                , new Return(new LocalOrFieldVar(AType.INT, "k"))
        ));
        Method WhileMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "Whilemethod", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), Whileblock);
        Clazz WhileClazz = new Clazz("Whilemethod", new ArrayList<>(), Arrays.asList(WhileMethod,sillymethod));

        // This shows that Binary and AssignStm funtions
        Block AssignandBinary = new Block(Arrays.asList(
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "k"),
                        new Binary(new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v"), Operator.PLUS, AType.INT)
                )));
        Method AssignAndBinarymethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "Test", Arrays.asList(new LocalOrFieldVar(AType.INT, "k"),
                new LocalOrFieldVar(AType.INT, "m"), new LocalOrFieldVar(AType.INT, "v")), AssignandBinary);
        Clazz AssignAndBinaryclazz = new Clazz("AssignAndBinary", new ArrayList<>(), Arrays.asList(AssignAndBinarymethod));


        // Loop und If-Block Anfang
        Block loopAndIfBlock = new Block(Arrays.asList(
                new LocalVarDecl(AType.INT, "counter", new AInteger(0, AType.INT)),
                new While(new Binary(new LocalOrFieldVar(AType.INT, "counter"), Operator.LESS, new AInteger(5, AType.INT)),
                        new Block(Arrays.asList(
                                new If(new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(2, AType.INT), Operator.EQUAL, AType.BOOLEAN),
                                        new Block(Arrays.asList(
                                                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "c"), new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(10, AType.INT), Operator.MULT, AType.INT))
                                        )),
                                        new Block(Arrays.asList(
                                                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "c"), new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(5, AType.INT), Operator.MULT, AType.INT))
                                        ))
                                ),
                                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "counter"), new Binary(new LocalOrFieldVar(AType.INT, "counter"), new AInteger(1, AType.INT), Operator.PLUS, AType.INT))
                        ))
                )
        ));

        Method loopAndIfMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "LoopAndIfExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "c")), loopAndIfBlock);
        Clazz loopAndIfClazz = new Clazz("LoopAndIfExampleClass", new ArrayList<>(), Arrays.asList(loopAndIfMethod));
        // Loop und If-Block Ende


        // Return-Block Anfang
        Block returnBlock = new Block(Arrays.asList(
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "a"), new AInteger(5, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "b"), new AInteger(10, AType.INT)),
                new AssignStmt(AType.INT, new LocalOrFieldVar(AType.INT, "c"), new Binary(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), Operator.MULT, AType.INT)),
                new Return(new LocalOrFieldVar(AType.INT, "result"))
        ));

        Method returnMethod = new Method(AccessModifier.PUBLIC, ReturnType.INT, "MultiplyExample", Arrays.asList(new LocalOrFieldVar(AType.INT, "a"), new LocalOrFieldVar(AType.INT, "b"), new LocalOrFieldVar(AType.INT, "c")), returnBlock);
        Clazz returnClazz = new Clazz("MultiplyExampleClass", new ArrayList<>(), Arrays.asList(returnMethod));
        // Return-Block Ende


        Codegenerierung codegen = new Codegenerierung();
        codegen.Start(recursiveclazz);
        codegen.Start(sillyclazz);//works
        codegen.Start(AssignAndBinaryclazz);//works
        codegen.Start(WhileClazz);//works
        codegen.Start(loopAndIfClazz);//can't be decompiled
        codegen.Start(returnClazz);//works

    }
}


