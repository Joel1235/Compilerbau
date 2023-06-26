package TreeGeneration;

import AntlrOut.miniJavaLexer;
import AntlrOut.miniJavaParser;
import Expr.*;
import General.AType;
import General.Clazz;
import General.Program;
import Parser.ProgramAdapter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import statementExpressions.AssignStmt;
import statementExpressions.MethodCallStmt;
import statements.*;

import java.util.ArrayList;
import java.util.List;

public class ASTGenerator {

    public static Program generateAST(String fromSource){
        CharStream input = CharStreams.fromString(fromSource);
        miniJavaLexer lexer = new miniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniJavaParser parser = new miniJavaParser(tokens);
        miniJavaParser.ProgramContext tree = parser.program(); //Parsen
        return ProgramAdapter.adapt(tree);
    }
}