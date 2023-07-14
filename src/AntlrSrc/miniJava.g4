grammar miniJava;

program : classDeclaration* EOF;

classDeclaration: accessModifier? 'class' ID '{' field* constructorDecl* method* '}';

constructorDecl: accessModifier? ID '(' paramList? ')' block;

field: accessModifier? type ID ('=' expr)? ';';

method: accessModifier? (type | 'void') ID '(' paramList? ')' block;

paramList: param (',' param)*;
param: type ID;

block: '{' statement* '}';

statement: localVarDecl ';'
         |stmtExpr ';'
         | block
         | ifStatement
         | whileStatement
         | forStatement
         | returnStatement
         | methodCall ';'
         ;

ifStatement:'if' '(' condition ')' block ('else' block)?;

whileStatement: 'while' '(' condition ')' block;

forStatement: 'for' '(' initialization? ';' condition? ';' iteration? ')'  block;

initialization: type ID '=' expr | ID '=' expr;

returnStatement:'return' expr? ';';

condition: expr;

iteration: stmtExpr;

localVarDecl: type ID ('=' expr)?;

stmtExpr: ID '=' expr
        | 'new' ID '(' exprList? ')'
        | methodCall
        | incrementExpr
        | decrementExpr
        ;

incrementExpr: '++' ID | ID '++';
decrementExpr: '--' ID | ID '--';

pointableExpr:
    'this'
    | 'super'
    | ID
    | pointableExpr '.' ID
    | pointableExpr '.' ID '(' exprList? ')'
    | 'new' ID '(' exprList? ')'
    ;

expr: expr binaryOp expr
    | pointableExpr
    | '-' expr
    | '!' expr
    | '(' expr ')'
    | INT
    | BOOLEAN
    | CHAR
    | STRING
    | 'null'
    ;

methodCall: (pointableExpr '.')*? ID '(' exprList? ')';

exprList: expr (',' expr)*;

binaryOp: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=' | '&&' | '||';

type: 'int'
    | 'boolean'
    | 'int'
    | 'char'
    | ID ('.' ID)*?
    ;

accessModifier: 'public' | 'private' | 'protected';

BOOLEAN: 'true' | 'false';

CHAR: '\'' ~'\\' '\'';

STRING: '"' ~'"'* '"';

INT: [0-9]+;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n] -> skip;