tree grammar IMPBWalker;

options {
  language = Java;
  tokenVocab = IMPB;
  ASTLabelType = CommonTree;
}

@header {
  package com.eloipereira.imp.generated;
  import java.util.Map;
  import java.util.HashMap;
}

@members{
  private Map<String, Integer> variables = new HashMap<String, Integer>();
  
}

program returns [int intResult, boolean boolResult]
	: (s=statement {retval.intResult=$s.intResult; retval.boolResult=$s.boolResult;})+
;

statement returns [int intResult, boolean boolResult]
	: e=expr {retval.intResult=$e.intResult; retval.boolResult=$e.boolResult;}
	| i=ifCmd {retval.intResult=$i.intResult;}
	| assgnCmd 
	| whileCmd 
	| skip
;


expr returns [int intResult, boolean boolResult]
@init {$intResult=0;$boolResult=false;}
	: ^('and' op1 = expr op2 = expr) {retval.boolResult = $op1.boolResult && $op2.boolResult;}
	| ^('or' op1 = expr op2 = expr) {retval.boolResult = $op1.boolResult || $op2.boolResult;}
	| ^('not' op1 = expr) {retval.boolResult = !$op1.boolResult;}
	| ^(NEGATION op1 = expr) {retval.intResult = -$op1.intResult;}
	| ^('+' op1 = expr op2 = expr) {retval.intResult = $op1.intResult + $op2.intResult;}
	| ^('-' op1 = expr op2 = expr) {retval.intResult = $op1.intResult - $op2.intResult;}
	| ^('*' op1 = expr op2 = expr) {retval.intResult = $op1.intResult * $op2.intResult;}
	| ^('/' op1 = expr op2 = expr) {retval.intResult = $op1.intResult / $op2.intResult;}
	| ^('=' op1 = expr op2 = expr) {retval.boolResult = $op1.intResult == $op2.intResult;}
	| ^('<' op1 = expr op2 = expr) {retval.boolResult = $op1.intResult < $op2.intResult;}
	| ^('>' op1 = expr op2 = expr) {retval.boolResult = $op1.intResult > $op2.intResult;}
	| BOOL {String b=$BOOL.text; 
					if (b.equals("true")) {
						retval.boolResult = true;} 
					else if (b.equals("false")) {
						retval.boolResult = false;};}
	| INTEGER {retval.intResult = Integer.parseInt($INTEGER.text);}
	| IDENT { retval.intResult=variables.get($IDENT.text);}
	;


ifCmd returns [int intResult]
	: ^('if' {
	Map<String, Integer> tempVar = new HashMap<String, Integer>();
	tempVar.putAll(variables);
	} cond=expr imp1=statement {
	Map<String, Integer> tempVar1 = new HashMap<String, Integer>(); 
	tempVar1.putAll(variables);
	variables.putAll(tempVar);
	} imp2=statement) 
					{
					if ($cond.boolResult){
							variables=tempVar1;
							intResult=$imp1.intResult;} 
							else{
							intResult=$imp2.intResult;
							}
							}
; 

whileCmd
	: ^('while' {int mark1 = input.mark();} e=. {int mark2 = input.mark();} s=.) {
	int end = input.mark();
	input.rewind(mark1);
	input.consume();
	Boolean b = expr().boolResult;
	
	while (b){
			input.rewind(mark2);	 
			statement();
			input.rewind(mark1);
			input.consume();
			b = expr().boolResult;
	}
	input.rewind(end);
	}
;

assgnCmd 
	: ^(':=' i=id e=expr) {variables.put($i.strResult, $e.intResult);}
;

id returns [String strResult]
	: IDENT {strResult=$IDENT.text;}
;

skip 
	: 'skip' {;}
;
