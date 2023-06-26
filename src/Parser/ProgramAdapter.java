package Parser;

import AntlrOut.miniJavaParser;
import General.Clazz;
import General.Program;

import java.util.ArrayList;
import java.util.List;

public class ProgramAdapter {
    public static Program adapt(miniJavaParser.ProgramContext ctx) {
        List<Clazz> classes = new ArrayList<>();

        for (miniJavaParser.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            classes.add(ClazzAdapter.adapt(classCtx));
        }
        return new Program(classes);
    }
}

