grammar IMPB;

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

program: statement+ EOF!;
statement: (expr | ifCmd | whileCmd | assgnCmd | skipCmd | printCmd) ';'!;
term: INTEGER | BOOL | IDENT | '('! expr ')'!;
unaryOp: (negation^|'not'^)* term;
negation: '-' -> NEGATION;
multOp: unaryOp (('*'^ | '/'^) unaryOp)*;
addOp: multOp (('+'^ | '-'^) multOp)*;
comp: addOp (('='^|'<'^|'>'^) addOp)*;
expr: comp (('and'^ | 'or'^) comp)*;
ifCmd: 'if'^ '('! expr ')'! '{'! statement '} else {'! statement '}'!;
whileCmd: 'while'^ '('! expr ')'! '{'! statement '}'!;   
assgnCmd: id ':='^ expr;
id: IDENT;
skipCmd: 'skip';
printCmd: 'print'^ '('! expr ')'!;
// Definition of tokens for the Lexer (aka scanner)

IDENT: ('a'..'z') ('0'..'9')* ('a'..'z'|'A'..'Z')* ;
INTEGER : '0'|('1'..'9')('0'..'9')*;
BOOL : 'true' | 'false';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};	