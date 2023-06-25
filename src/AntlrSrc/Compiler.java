package AntlrSrc;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Decaf language AntlrSrc.Compiler
 */
public class Compiler {

    public static Progam generateAST(String fromSource){
        CharStream input = CharStreams.fromString(fromSource);
        DecafLexer lexer = new DecafLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecafParser parser = new DecafParser(tokens);
        DecafParser.ProgramContext tree = parser.program(); //Parsen
        return ASTGenerator.generateAST(tree);
    }
}