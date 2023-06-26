package Parser;


import AntlrOut.miniJavaLexer;
import AntlrOut.miniJavaParser;
import TreeGeneration.ASTGenerator;
import General.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Decaf language Parser.Compiler
 */
public class Compiler {

    public static Program generateAST(String fromSource){
        CharStream input = CharStreams.fromString(fromSource);
        miniJavaLexer lexer = new miniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniJavaParser parser = new miniJavaParser(tokens);
        miniJavaParser.ProgramContext tree = parser.program(); //Parsen
        return ASTGenerator.generateAST(tree);
    }
}