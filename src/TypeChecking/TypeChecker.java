package TypeChecking;
import Expr.*;
import General.*;
import statementExpressions.*;
import statements.*;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker {
    public Program check(Program program) throws Exception {
        for (Clazz clazz : program.getClazzes()) {
            List<AField> typeCheckedFields = new ArrayList<>(clazz.getFields().size());
            List<Method> typeCheckedMethods = new ArrayList<>(clazz.getMethods().size());
            // access modifiers?

            for (AField field : clazz.getFields()) {
                // check fields
            }

            for (Method method : clazz.getMethods()) {
                // check methods
            }

            clazz.setFields(typeCheckedFields);
            clazz.setMethods(typeCheckedMethods);
        }

        return program; // now with its classes being type checked
    }
}
