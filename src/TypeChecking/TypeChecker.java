package TypeChecking;

import General.*;
import statementExpressions.*;
import java.util.ArrayList;
import java.util.List;

public class TypeChecker {
    public Program check(Program program) throws Exception {
        for (Clazz clazz : program.getClazzes()) {
            List<AField> typeCheckedFields = new ArrayList<>(clazz.getFields().size());
            List<Method> typeCheckedMethods = new ArrayList<>(clazz.getMethods().size());
            // todo: access modifiers?

            ClassChecker classChecker = new ClassChecker(clazz, typeCheckedFields, typeCheckedMethods);
            for (AField field : clazz.getFields()) {
                typeCheckedFields.add(classChecker.check(field));
            }

            for (Method method : clazz.getMethods()) {
                typeCheckedMethods.add(classChecker.check(method));
            }

            clazz.setFields(typeCheckedFields);
            clazz.setMethods(typeCheckedMethods);
        }

        return program;
    }
}
