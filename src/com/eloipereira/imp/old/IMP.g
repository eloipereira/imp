grammar IMP;

options {
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

tokens {
  NEGATION;
}

@header {
  package com.eloipereira.imp;
}

@lexer::header {
  package com.eloipereira.imp;
}

program: expr EOF!;


term
	:INTEGER | BOOL | '('! expr ')'! 
;

unaryOp
	: (negation^|'not'^)* term
;

negation
	: '-' -> NEGATION
;

multOp
	: unaryOp (('*'^ | '/'^ | 'and'^ | 'or'^) unaryOp)*
;

expr
	: multOp (('+'^ | '-'^) multOp)*
;



// Definition of tokens for the Lexer (aka scanner)

INTEGER : '0'|('1'..'9')('0'..'9')*;
BOOL : 'true' | 'false';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};	