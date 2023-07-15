package Parser;

import AntlrOut.miniJavaParser;
import Expr.Expression;
import Expr.InstVar;
import Expr.LocalOrFieldVar;
import Expr.This;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class InstVarAdapter {
       public static InstVar adapt(miniJavaParser.InstVarContext instVarContext) {
            Expression generated = generateInstVar(instVarContext.ID(), null, 0);
            if (generated instanceof LocalOrFieldVar) { // this
                return new InstVar(((LocalOrFieldVar) generated).getId(), new This(),
                        instVarContext.start.getLine(), instVarContext.start.getCharPositionInLine());
            }
            return (InstVar) generated;
        }

        private static Expression generateInstVar(List<TerminalNode> identifiers, Expression previous, int position) {
            var identifier = identifiers.get(position);

            if (previous == null) {
                previous = new LocalOrFieldVar(identifier.getText(), identifier.getSymbol().getLine(),
                        identifier.getSymbol().getCharPositionInLine());
            } else {
                previous = new InstVar(identifier.getText(), previous, identifier.getSymbol().getLine(),
                        identifier.getSymbol().getCharPositionInLine());
            }

            if (position < identifiers.size() - 1) {
                return generateInstVar(identifiers, previous, position + 1);
            }
            return previous;
        }
}
