tree grammar IMPWalker;

options {
  language = Java;
  tokenVocab = IMP;
  ASTLabelType = CommonTree;
}

@header {
  package edu.berkeley.eloi.imp;
  import java.util.HashMap;
  import java.util.Map;
}

@members{
  private Map<String, Integer> variables = new HashMap<String, Integer>(); 
}

program	: statement+;

statement: (assgnCmd | printCmd | ifCmd | whileCmd)
;

expr returns [int intResult,boolean boolResult, boolean boolExp]
@init {retval.intResult=0; retval.boolResult = false; boolean boolExp = false;}
	: ^(NEGATION a = expr) {retval.intResult = -$a.intResult;}
	| ^('+' a0 = expr a1 = expr) {retval.intResult = $a0.intResult + $a1.intResult; retval.boolExp=false;}
	| ^('-' a0 = expr a1 = expr) {retval.intResult = $a0.intResult - $a1.intResult; retval.boolExp=false;}
	| ^('*' a0 = expr a1 = expr) {retval.intResult = $a0.intResult * $a1.intResult; retval.boolExp=false;}
	| ^('/' a0 = expr a1 = expr) {retval.intResult = $a0.intResult / $a1.intResult; retval.boolExp=false;}
	| ^('NOT' b = expr) {retval.boolResult = !($b.boolResult); retval.boolExp=true;}
	| ^('=' a0 = expr a1 = expr) {retval.boolResult = ($a0.intResult == $a1.intResult); retval.boolExp=true;}
	| ^('<' a0 = expr a1 = expr) {retval.boolResult = ($a0.intResult < $a1.intResult); retval.boolExp=true;}
	| ^('>' a0 = expr a1 = expr) {retval.boolResult = ($a0.intResult > $a1.intResult); retval.boolExp=true;}
	| ^('AND' b0 = expr b1 = expr) {retval.boolResult = ($b0.boolResult && $b1.boolResult); retval.boolExp=true;}
	| ^('OR' b0 = expr b1 = expr) {retval.boolResult = ($b0.boolResult || $b1.boolResult); retval.boolExp=true;}
	| INTEGER {retval.intResult = Integer.parseInt($INTEGER.text); retval.boolExp=false;}
	| BOOL {if (($BOOL.text).equals("T")) {
			retval.boolResult = true;} 
		else if (($BOOL.text).equals("F")) {
			retval.boolResult = false;}; retval.boolExp=true;}
	| IDENT {retval.intResult=variables.get($IDENT.text); retval.boolExp=false;}
;

ifCmd 	: ^('IF' {int mark0 = input.mark();} e=. {int mark1 = input.mark();} s0=. {int mark2 = input.mark();} s1=. {
	int end = input.mark();
	input.rewind(mark0);
	input.consume();
	boolean b = expr().boolResult;
	if (b) {
		input.rewind(mark1);
		statement();
	} else {
		input.rewind(mark2);
		statement();
	}
	input.rewind(end);
})
;

whileCmd: ^('WHILE' {int mark0 = input.mark();} e=. {int mark1 = input.mark();} s=. {
	int end = input.mark();
	input.rewind(mark0);
	input.consume();
	boolean b = expr().boolResult;
	while (b){
		input.rewind(mark1);	 
		statement();
		input.rewind(mark0);
		input.consume();
		b = expr().boolResult;
	}
	input.rewind(end);
})
;

assgnCmd 
	: ^(':=' IDENT e=expr) {variables.put($IDENT.text, $e.intResult);}
;

printCmd
	: ^('PRINT' e=expr) {
		if ($e.boolExp){
			System.out.println($e.boolResult);
		} else {
		System.out.println($e.intResult);
		}
	}
;
