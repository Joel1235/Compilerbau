// Generated from C:/Users/z004b3rk/IdeaProjects/Compilerbau/src/AntlrSrc\miniJava.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclaration(miniJavaParser.LocalVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVarDeclaration}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclaration(miniJavaParser.LocalVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(miniJavaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(miniJavaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(miniJavaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(miniJavaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(miniJavaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(miniJavaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpr}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpr(miniJavaParser.StatementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpr}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpr(miniJavaParser.StatementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(miniJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link miniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(miniJavaParser.ReturnContext ctx);
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
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(miniJavaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(miniJavaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCreationStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreationStmt(miniJavaParser.ObjectCreationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCreationStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreationStmt(miniJavaParser.ObjectCreationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStmt(miniJavaParser.MethodCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallStmt}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStmt(miniJavaParser.MethodCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(miniJavaParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(miniJavaParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpression(miniJavaParser.DecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link miniJavaParser#stmtExpr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpression(miniJavaParser.DecrementExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code MethodCalls}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCalls(miniJavaParser.MethodCallsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCalls}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCalls(miniJavaParser.MethodCallsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(miniJavaParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(miniJavaParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpr(miniJavaParser.SuperExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpr(miniJavaParser.SuperExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(miniJavaParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(miniJavaParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(miniJavaParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(miniJavaParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(miniJavaParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(miniJavaParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(miniJavaParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(miniJavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(miniJavaParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(miniJavaParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectCreation(miniJavaParser.ObjectCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectCreation}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectCreation(miniJavaParser.ObjectCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(miniJavaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(miniJavaParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(miniJavaParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(miniJavaParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(miniJavaParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(miniJavaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(miniJavaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(miniJavaParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(miniJavaParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(miniJavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link miniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(miniJavaParser.ThisExprContext ctx);
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
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(miniJavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(miniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(miniJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(miniJavaParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(miniJavaParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(miniJavaParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(miniJavaParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdType(miniJavaParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdType}
	 * labeled alternative in {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdType(miniJavaParser.IdTypeContext ctx);
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