//import TreeGeneration.ASTGenerator;

import Codegenerierung.Codegenerierung;
import Expr.AInteger;
import Expr.Anull;
import Expr.Binary;
import Expr.LocalOrFieldVar;
import General.AType;
import General.BinaryOperator;
import statements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String teststring = "class TestKlasse{int i = i;}";
        //System.out.println(ASTGenerator.generateAST(teststring));

        // testblock=new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",new AInteger(1,AType.INT)),
        //        new LocalVarDecl(AType.INT,"test",new AInteger(1,AType.INT)),
        //        new LocalVarDecl(AType.INT,"test2",new AInteger(1,AType.INT))));

       /* Block testblock = new Block(Arrays.asList(new LocalVarDecl(AType.INT,"i",
                new AInteger(1,AType.INT)),
                new While(new AInteger(1,AType.INT),
                new Block(Arrays.asList( new StmtExprStmt("test",new LocalOrFieldVar()))))
               )));
        new Codegenerierung().Start(testblock);*/
    }
}
