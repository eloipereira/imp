tree grammar IMPWalker2;

options {
  language = Java;
  tokenVocab = IMP;
  ASTLabelType = CommonTree;
}

@header {
  package com.eloipereira.imp;
}

program returns [int intResult, boolean boolResult]
	: aE=arithmExpr {intResult = aE;} | bE = boolExpr {boolResult = bE;}
	;

arithmExpr returns [int intResult]
	: ^('+' op1 = arithmExpr op2 = arithmExpr) {intResult = op1 + op2;}
	| ^('-' op1 = arithmExpr op2 = arithmExpr) {intResult = op1 - op2;}
	| ^('*' op1 = arithmExpr op2 = arithmExpr) {intResult = op1 * op2;}
	| ^('/' op1 = arithmExpr op2 = arithmExpr) {intResult = op1 / op2;}
	| ^(NEGATION op1 = arithmExpr) {intResult = -op1;}
	| INTEGER {intResult = Integer.parseInt($INTEGER.text);}
	;

boolExpr returns [boolean boolResult]
	: ^('and' exp1 = boolExpr exp2 = boolExpr) {boolResult = exp1 and exp2;}
	| ^('or' exp1 = boolExpr exp2 = boolExpr) {boolResult = exp1 or exp2;}
	| BOOLEAN {boolResult = Boolean.getBoolean($BOOLEAN.text);}
	;