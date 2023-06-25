grammar miniJava;

program : classDeclaration* EOF;

classDeclaration : 'class' ID '{' fieldDeclaration* methodDeclaration* '}';

fieldDeclaration : type ID ';';

methodDeclaration : type ID '(' params ')' block;

params : (param (',' param)*)? ;

param : type ID;

block : '{' stmt* '}';

stmt : 'return' expr ';'
     | 'while' '(' expr ')' stmt
     | localVarDeclaration ';'
     | 'if' '(' expr ')' stmt ('else' stmt)?
     | stmtExprStmt
     | block;

localVarDeclaration : type ID;

stmtExprStmt : stmtExpr ';';

stmtExpr : ID '=' expr
         | 'new' type '(' expr (',' expr)* ')'
         | expr '.' ID '(' expr (',' expr)* ')';

expr : 'this'
     | 'super'
     | localVar
     | expr '.' ID
     | unaryOp expr
     | expr binaryOp expr
     | INT
     | BOOL
     | CHAR
     | STRING
     | 'null';                  //stmtExprExpr;

localVar : ID;

unaryOp : '-' | '!';

binaryOp : '*' | '/' | '%' | '+' | '-' | '<' | '>' | '==' | '!=' | '&&' | '||';

//stmtExprExpr : stmtExpr;

type : 'int' | 'boolean' | 'char' | 'String' | ID;

ID : [a-zA-Z][a-zA-Z0-9]*;
INT : [0-9]+;
BOOL : 'true' | 'false';
CHAR : '\'' [a-zA-Z] '\'';
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip;
