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
	 * Visit a parse tree produced by {@link miniJavaParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(miniJavaParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(miniJavaParser.ElseStatementContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(miniJavaParser.ReturnStatementContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(miniJavaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#assignableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpr(miniJavaParser.AssignableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#incDecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpr(miniJavaParser.IncDecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#incExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncExpr(miniJavaParser.IncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#pIncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPIncExpr(miniJavaParser.PIncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#sIncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIncExpr(miniJavaParser.SIncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#decExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecExpr(miniJavaParser.DecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#pDecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPDecExpr(miniJavaParser.PDecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#sDecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSDecExpr(miniJavaParser.SDecExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(miniJavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(miniJavaParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#instVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstVar(miniJavaParser.InstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(miniJavaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(miniJavaParser.CalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#dotExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(miniJavaParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#dotSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotSubExpr(miniJavaParser.DotSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCalcExpr(miniJavaParser.NonCalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCalcOperator(miniJavaParser.NonCalcOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#newDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDecl(miniJavaParser.NewDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(miniJavaParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniJavaParser#receivingMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceivingMethod(miniJavaParser.ReceivingMethodContext ctx);
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
	 * Visit a parse tree produced by {@link miniJavaParser#methodtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodtype(miniJavaParser.MethodtypeContext ctx);
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