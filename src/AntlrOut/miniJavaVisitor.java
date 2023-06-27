// Generated from C:/Users/z004b3rk/IdeaProjects/Compilerbau/src/AntlrSrc\miniJava.g4 by ANTLR 4.12.0
package AntlrOut;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(miniJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#constructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(miniJavaParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(miniJavaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(miniJavaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(miniJavaParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(miniJavaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDeclaration(miniJavaParser.LocalVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(miniJavaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(miniJavaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(miniJavaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExpr}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpr(miniJavaParser.StatementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(miniJavaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#localVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDecl(miniJavaParser.LocalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(miniJavaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectCreationStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreationStmt(miniJavaParser.ObjectCreationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStmt(miniJavaParser.MethodCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(miniJavaParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpression(miniJavaParser.DecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#incrementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(miniJavaParser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#decrementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(miniJavaParser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCalls}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCalls(miniJavaParser.MethodCallsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(miniJavaParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpr(miniJavaParser.SuperExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(miniJavaParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(miniJavaParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(miniJavaParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(miniJavaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCreation(miniJavaParser.ObjectCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(miniJavaParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(miniJavaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(miniJavaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(miniJavaParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(miniJavaParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(miniJavaParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(miniJavaParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(miniJavaParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(miniJavaParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(miniJavaParser.IdTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(miniJavaParser.AccessModifierContext ctx);
}