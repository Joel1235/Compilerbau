grammar Expression;

namen: (name'\n'?)+;
name : ID ',' ID;

ID: [A-Z][a-z]*;
WS: [ ]+ -> skip;