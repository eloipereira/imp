grammar IMP2;

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

program: boolExpr EOF!| arithmExpr EOF! ;


term
	:INTEGER | '('! arithmExpr ')'! 
;

unaryOp
	: (negation^)* term
;

negation
	: '-' -> NEGATION
;

multOp
	: unaryOp (('*'^ | '/'^) unaryOp)*
;

arithmExpr
	: multOp (('+'^ | '-'^) multOp)*
;

boolTerm
	: BOOL | '('! boolExpr ')'!
;

boolUnaryOp
	: ('not'^)* boolTerm
;

boolAND
	: boolUnaryOp ('and'^ boolUnaryOp)*
;

boolExpr
	: boolAND ('or'^ boolAND)*
;


// Definition of tokens for the Lexer (aka scanner)

INTEGER : '0'|('1'..'9')('0'..'9')*;
BOOL : 'true' | 'false';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};	