grammar miniJava;

program : classDeclaration* EOF;

classDeclaration: 'class' ID '{' field* method* '}';

field: type ID ';';

method: type ID '(' paramList? ')' block;

paramList: param (',' param)*;
param: type ID;

block: '{' statement* '}';

statement: localVarDecl                     #LocalVarDeclaration
         | 'if' '(' expr ')' block ('else' block)? #If
         | 'while' '(' expr ')' block       #WhileStmt
         | expr ';'                         #StatementExpr
         | 'return' expr? ';'               #Return
         ;


localVarDecl: type ID;

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
    | expr '.' ID '(' exprList? ')'        #MethodCall
    | 'new' ID '(' exprList? ')'           #ObjectCreation
    | expr '[' expr ']'                    #ArrayAccess
    ;

exprList: expr (',' expr)*;

binaryOp: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';

type: 'int' '[' ']'   #ArrayType
    | 'boolean'       #BooleanType
    | 'int'           #IntType
    | 'char'          #CharType
    | 'void'          #VoidType
    | ID              #IdType
    ;

BOOLEAN: 'true' | 'false';

CHAR: '\'' ~'\\' '\'';

STRING: '"' ~'"'* '"';

INT: [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n] -> skip;
