grammar miniJava;

program : classDeclaration* EOF;

classDeclaration: 'class' ID '{' field* constructorDecl* method* '}';

constructorDecl: accessModifier? ID '(' paramList? ')' block;

field: accessModifier? type ID ';';

method: mainMethodDecl block                  #MainMethod
      | accessModifier? type ID '(' paramList? ')' block #StandardMethod
      ;

mainMethodDecl: 'public static void main(String[] args)';

paramList: param (',' param)*;
param: type ID;

block: '{' statement* '}';

statement: localVarDecl ';'                   #LocalVarDeclaration
         | 'if' '(' expr ')' block ('else' block)? #If
         | 'while' '(' expr ')' block       #WhileStmt
         | 'for' '(' stmtExpr ';' expr ';' stmtExpr ')' block #ForStmt
         | expr ';'                         #StatementExpr
         | 'return' expr? ';'               #Return
         ;

localVarDecl: type ID '=' expr;

stmtExpr: ID '=' expr                       #AssignStmt
        | 'new' ID '(' exprList? ')'        #ObjectCreationStmt
        | methodCall                         #MethodCallStmt
        | incrementExpr                      #IncrementExpression
        | decrementExpr                      #DecrementExpression
        ;

incrementExpr: '++' ID | ID '++';
decrementExpr: '--' ID | ID '--';

expr: expr binaryOp expr                   #BinaryExpr
    | '-' expr                             #UnaryExpr
    | '!' expr                             #NotExpr
    | '(' expr ')'                         #ParenExpr
    | INT                                  #IntLiteral
    | BOOLEAN                              #BooleanLiteral
    | CHAR                                 #CharLiteral
    | STRING                               #StringLiteral
    | 'null'                               #NullLiteral
    | 'this'                               #ThisExpr
    | 'super'                              #SuperExpr
    | ID                                   #IdExpr
    | expr '.' ID                          #FieldAccess
    | expr '.' ID '(' exprList? ')'        #MethodCalls
    | 'new' ID '(' exprList? ')'           #ObjectCreation
    | expr '[' expr ']'                    #ArrayAccess
    ;

methodCall: expr '.' ID '(' exprList? ')';

exprList: expr (',' expr)*;

binaryOp: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';

type: 'int' '[' ']'   #ArrayType
    | 'boolean'       #BooleanType
    | 'int'           #IntType
    | 'char'          #CharType
    | 'void'          #VoidType
    | ID              #IdType
    ;

accessModifier: 'public' | 'private' | 'protected';

BOOLEAN: 'true' | 'false';

CHAR: '\'' ~'\\' '\'';

STRING: '"' ~'"'* '"';

INT: [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n] -> skip;
