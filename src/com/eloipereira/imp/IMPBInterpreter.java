package com.eloipereira.imp;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class IMPBInterpreter {

	public static void main(String[] args) throws RecognitionException {
	//CharStream charStream = new ANTLRStringStream("if (1>3) then 1+1; else 1+2;;");
	        //CharStream charStream = new ANTLRStringStream("X:=1; if (X>0) { X:=X+5; } else { X:=X-1; }; X;");
		//CharStream charStream = new ANTLRStringStream("X:=1; while (X<5) { X:=X+1 }; X:=X+2;X;");
		CharStream charStream = new ANTLRStringStream("X:=1;X:=X+1;X:=X+1;print(X);");
	        //CharStream charStream = new ANTLRStringStream("while (1>0) { 1+1;};");
		//CharStream charStream = new ANTLRStringStream("1");
		
		IMPBLexer lexer = new IMPBLexer(charStream );
		TokenStream tokenStream = new CommonTokenStream(lexer);
		IMPBParser parser = new IMPBParser(tokenStream);
		//parser.program();
		IMPBParser.program_return res = parser.program();
		CommonTree tree = (CommonTree) res.getTree();
		System.out.println("AST:\n" + tree.toStringTree() + "\n");
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		IMPBWalker walker = new IMPBWalker(nodeStream);
		walker.program();
		boolean boolResult = walker.program().boolResult;
		System.out.println("boolResult = "+Boolean.toString(boolResult));
		int intResult = walker.program().intResult;
		System.out.println("Result = "+Integer.toString(intResult));
	}

}
