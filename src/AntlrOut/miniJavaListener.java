// Generated from C:/DATEN/Git/Compilerbau/src/AntlrSrc\miniJava.g4 by ANTLR 4.12.0
package AntlrOut;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(miniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(miniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(miniJavaParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(miniJavaParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(miniJavaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(miniJavaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(miniJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(miniJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(miniJavaParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(miniJavaParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(miniJavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(miniJavaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(miniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(miniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(miniJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(miniJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(miniJavaParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(miniJavaParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(miniJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(miniJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(miniJavaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(miniJavaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(miniJavaParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(miniJavaParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDecl(miniJavaParser.LocalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDecl(miniJavaParser.LocalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(miniJavaParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(miniJavaParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(miniJavaParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#incrementExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(miniJavaParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#decrementExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(miniJavaParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#decrementExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(miniJavaParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#pointableExpr}.
	 * @param ctx the parse tree
	 */
	void enterPointableExpr(miniJavaParser.PointableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#pointableExpr}.
	 * @param ctx the parse tree
	 */
	void exitPointableExpr(miniJavaParser.PointableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(miniJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(miniJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(miniJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(miniJavaParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(miniJavaParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(miniJavaParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(miniJavaParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(miniJavaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(miniJavaParser.AccessModifierContext ctx);
}