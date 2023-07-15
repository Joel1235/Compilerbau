grammar miniJava;

program : classDeclaration* EOF;

classDeclaration: accessModifier? 'class' ID '{' field* constructorDecl* method* '}';

constructorDecl: accessModifier? ID '(' paramList? ')' block;

field: accessModifier? type ID ('=' expr)? ';';

method: accessModifier? (methodtype | 'void') ID '(' paramList? ')' block;

paramList: param (',' param)*;
param: type ID;

block: '{' statement* '}';


statement: returnStatement ';' | localVarDecl ';' | block | whileStatement | forStatement | ifElseStatement | stmtExpr ';';

ifElseStatement: ifStatement elseStatement?;
ifStatement: 'if' '(' expr ')' statement;
elseStatement: 'else' statement;

whileStatement: 'while' '(' expr ')' block;
forStatement: 'for' '(' (stmtExpr | localVarDecl) ';' (expr) ';' (stmtExpr) ')' statement;

returnStatement:'return' expr? ';';

localVarDecl: type ID ('=' expr)?;

stmtExpr: assign | newDecl | methodCall | incDecExpr;
assign: assignableExpr '=' expr;
assignableExpr: ID | instVar;


incDecExpr: incExpr | decExpr;

incExpr: pIncExpr | sIncExpr;

pIncExpr: '++' assignableExpr;
sIncExpr: assignableExpr '++';

decExpr: pDecExpr | sDecExpr;

pDecExpr: '--' assignableExpr;
sDecExpr: assignableExpr '--';





expr: subExpression | binaryExpr;

//subExpression to ssolve left-recusion problem
subExpression: This | ID | instVar  | value | stmtExpr | notExpr | '(' expr ')';
This: 'this';
instVar: This '.' ID | (This '.')? (ID '.')+ ID;
value: INT | BOOLEAN | STRING | CHAR | 'null';
notExpr: '!' expr;

binaryExpr: calcExpr | nonCalcExpr;

calcExpr: calcExpr LineOperator dotExpr | dotExpr;
dotExpr: dotExpr DotOperator dotSubExpr | dotSubExpr;
dotSubExpr: INT | ID | instVar | methodCall | '(' calcExpr ')';
nonCalcExpr: subExpression nonCalcOperator expr;
DotOperator: '*' | '/' | '%';
LineOperator: '+' | '-';
nonCalcOperator: '&&' | '||' | '<' | '<=' | '>' | '>=' | '==' | '!=';


newDecl: 'new' ID '(' exprList ')';
receiver: ((This | instVar | newDecl | ID) '.');
receivingMethod: ID '(' exprList ')' '.';

methodCall: receiver? receivingMethod* ID '(' exprList ')';

exprList: expr (',' expr)*;

methodtype: 'void' | type;

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