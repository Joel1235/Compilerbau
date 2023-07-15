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
	 * Enter a parse tree produced by {@link miniJavaParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(miniJavaParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(miniJavaParser.IfElseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(miniJavaParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(miniJavaParser.ElseStatementContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(miniJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(miniJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#assignableExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpr(miniJavaParser.AssignableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#assignableExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpr(miniJavaParser.AssignableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#incDecExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpr(miniJavaParser.IncDecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#incDecExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpr(miniJavaParser.IncDecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncExpr(miniJavaParser.IncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#incExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncExpr(miniJavaParser.IncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#pIncExpr}.
	 * @param ctx the parse tree
	 */
	void enterPIncExpr(miniJavaParser.PIncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#pIncExpr}.
	 * @param ctx the parse tree
	 */
	void exitPIncExpr(miniJavaParser.PIncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#sIncExpr}.
	 * @param ctx the parse tree
	 */
	void enterSIncExpr(miniJavaParser.SIncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#sIncExpr}.
	 * @param ctx the parse tree
	 */
	void exitSIncExpr(miniJavaParser.SIncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#decExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecExpr(miniJavaParser.DecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#decExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecExpr(miniJavaParser.DecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#pDecExpr}.
	 * @param ctx the parse tree
	 */
	void enterPDecExpr(miniJavaParser.PDecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#pDecExpr}.
	 * @param ctx the parse tree
	 */
	void exitPDecExpr(miniJavaParser.PDecExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#sDecExpr}.
	 * @param ctx the parse tree
	 */
	void enterSDecExpr(miniJavaParser.SDecExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#sDecExpr}.
	 * @param ctx the parse tree
	 */
	void exitSDecExpr(miniJavaParser.SDecExprContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(miniJavaParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(miniJavaParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#instVar}.
	 * @param ctx the parse tree
	 */
	void enterInstVar(miniJavaParser.InstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#instVar}.
	 * @param ctx the parse tree
	 */
	void exitInstVar(miniJavaParser.InstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(miniJavaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(miniJavaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(miniJavaParser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(miniJavaParser.CalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(miniJavaParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(miniJavaParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#dotSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotSubExpr(miniJavaParser.DotSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#dotSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotSubExpr(miniJavaParser.DotSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 */
	void enterNonCalcExpr(miniJavaParser.NonCalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#nonCalcExpr}.
	 * @param ctx the parse tree
	 */
	void exitNonCalcExpr(miniJavaParser.NonCalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 */
	void enterNonCalcOperator(miniJavaParser.NonCalcOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#nonCalcOperator}.
	 * @param ctx the parse tree
	 */
	void exitNonCalcOperator(miniJavaParser.NonCalcOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#newDecl}.
	 * @param ctx the parse tree
	 */
	void enterNewDecl(miniJavaParser.NewDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#newDecl}.
	 * @param ctx the parse tree
	 */
	void exitNewDecl(miniJavaParser.NewDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(miniJavaParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(miniJavaParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#receivingMethod}.
	 * @param ctx the parse tree
	 */
	void enterReceivingMethod(miniJavaParser.ReceivingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#receivingMethod}.
	 * @param ctx the parse tree
	 */
	void exitReceivingMethod(miniJavaParser.ReceivingMethodContext ctx);
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
	 * Enter a parse tree produced by {@link miniJavaParser#methodtype}.
	 * @param ctx the parse tree
	 */
	void enterMethodtype(miniJavaParser.MethodtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodtype}.
	 * @param ctx the parse tree
	 */
	void exitMethodtype(miniJavaParser.MethodtypeContext ctx);
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