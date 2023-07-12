// Generated from C:/DATEN/Git/Compilerbau/src/AntlrSrc\miniJava.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(miniJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(miniJavaParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(miniJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(miniJavaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(miniJavaParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#localVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDecl(miniJavaParser.LocalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(miniJavaParser.StmtExprContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#pointableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointableExpr(miniJavaParser.PointableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(miniJavaParser.ExprContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(miniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(miniJavaParser.AccessModifierContext ctx);
}