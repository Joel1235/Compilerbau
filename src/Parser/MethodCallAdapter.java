package Parser;

import java.util.List;

import Helper.ArgumentHelper;
import AntlrOut.miniJavaParser;
import Expr.Expression;
import Expr.LocalOrFieldVar;
import Expr.This;
import statementExpressions.MethodCall;

public class MethodCallAdapter {


    public static MethodCall adapt(miniJavaParser.MethodCallContext methodCallContext) {
        var arguments = new ArgumentHelper<Expression>();
        Expression receiver = new This();
        if (methodCallContext.exprList() != null) {
            methodCallContext.exprList().expr().forEach(
                    a -> arguments.add(ExpressionAdapter.adapt(a)));
        }
        if (methodCallContext.receiver() != null) { // explicit receiver
            if (methodCallContext.receiver().instVar() != null) {
                receiver = InstVarAdapter.adapt(methodCallContext.receiver().instVar());
            } else if (methodCallContext.receiver().newDecl() != null) {
                receiver = (Expression) NewAdapter.adapt(methodCallContext.receiver().newDecl());
            } else if (methodCallContext.receiver().ID() != null) {
                receiver = new LocalOrFieldVar(methodCallContext.receiver().ID().getText());
            }
        }
        if (methodCallContext.receivingMethod() != null && methodCallContext.receivingMethod().size() > 0) { // A.b.m().n()
            receiver = (Expression) recursivelyAdaptRecievingMethods(methodCallContext.receivingMethod(),
                    methodCallContext.receivingMethod().size() - 1, receiver);
        }
        return new MethodCall(
                methodCallContext.ID().getText(),
                receiver,
                arguments,
                methodCallContext.start.getLine(),
                methodCallContext.start.getCharPositionInLine());
    }

    private static MethodCall recursivelyAdaptRecievingMethods(List<miniJavaParser.ReceivingMethodContext> contexts,
                                                               int index, Expression rootReceiver) {
        if (index > 0) {
            var arguments = new ArgumentHelper<Expression>();
            var context = contexts.get(index - 1);
            context.exprList().expr().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    context.ID().getText(),
                    (Expression) recursivelyAdaptRecievingMethods(contexts, index, rootReceiver),
                    arguments,
                    context.start.getLine(),
                    context.start.getCharPositionInLine());

        } else {
            var arguments = new ArgumentHelper<Expression>();
            contexts.get(0).exprList().expr().forEach(a -> arguments.add(ExpressionAdapter.adapt(a)));
            return new MethodCall(
                    contexts.get(0).ID().getText(),
                    rootReceiver,
                    arguments,
                    contexts.get(0).start.getLine(),
                    contexts.get(0).start.getCharPositionInLine());
        }
    }
}