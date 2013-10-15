grammar IMP;

options {language = Java;
	 output = AST;
  	 ASTLabelType=CommonTree;
} 

tokens {
  NEGATION;
}

@header {package edu.berkeley.eloi.imp;} 
@lexer::header {package edu.berkeley.eloi.imp;} 

program: statement+ EOF!;

statement: ((assgnCmd | printCmd | ifCmd | whileCmd) ';'!);	
term: INTEGER | BOOL | IDENT | '('! expr ')'!;
unaryOp: (negation^ | 'NOT'^)* term;
negation: '-' -> NEGATION;
multOp: unaryOp (('*'^ | '/'^) unaryOp)*;
addOp: multOp (('+'^ | '-'^) multOp)*;
comp: addOp (('='^|'<'^|'>'^) addOp)*;
expr: comp (('AND'^ | 'OR'^) comp)*;

assgnCmd: IDENT ':='^ expr;
ifCmd:	'IF'^ '('! expr ')'! '{'! statement '}'! 'ELSE'! '{'! statement  '}'!;
whileCmd: 'WHILE'^ expr '{'! statement  '}'!;
printCmd: 'PRINT'^ '('! (expr) ')'!;

BOOL:('T'|'F');
INTEGER: ('0' | '1'..'9' ('0'..'9')*);
IDENT: ('a'..'z')('0'..'9')*('a'..'z'|'A'..'Z')* ;
WS: (' '|'\t'|'\n')+ {$channel=HIDDEN;};
