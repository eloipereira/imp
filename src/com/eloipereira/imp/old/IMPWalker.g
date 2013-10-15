tree grammar IMPWalker;

options {
  language = Java;
  tokenVocab = IMP;
  ASTLabelType = CommonTree;
}

@header {
  package com.eloipereira.imp;
}

program returns [int intResult, boolean boolResult]
	: e=expr {intResult=$e.intResult; boolResult=$e.boolResult;}
	;

expr returns [int intResult, boolean boolResult]
	: ^('+' op1 = expr op2 = expr) {intResult = $op1.intResult + $op2.intResult;}
	| ^('-' op1 = expr op2 = expr) {intResult = $op1.intResult - $op2.intResult;}
	| ^('*' op1 = expr op2 = expr) {intResult = $op1.intResult * $op2.intResult;}
	| ^('/' op1 = expr op2 = expr) {intResult = $op1.intResult / $op2.intResult;}
	| ^(NEGATION op1 = expr) {intResult = -$op1.intResult;}
	| INTEGER {intResult = Integer.parseInt($INTEGER.text);}
	| ^('and' op1 = expr op2 = expr) {boolResult = $op1.boolResult && $op2.boolResult;}
	| ^('or' op1 = expr op2 = expr) {boolResult = $op1.boolResult || $op2.boolResult;}
	| ^('not' op1 = expr) {boolResult = -$op1.boolResult;}
	| BOOL {String b=$BOOL.text; 
	if (b.equals("true")) {boolResult = true;} else if (b.equals("false")) {boolResult = false;};}
	;

	