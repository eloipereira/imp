package com.eloipereira.imp.old;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.eloipereira.imp.IMPLexer;
import com.eloipereira.imp.IMPParser;
import com.eloipereira.imp.IMPWalker;

public class IMPInterpreter {

	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream("true");
		IMPLexer lexer = new IMPLexer(charStream );
		TokenStream tokeStream = new CommonTokenStream(lexer);
		IMPParser parser = new IMPParser(tokeStream);
		//parser.program();
		CommonTree tree = parser.program().tree;
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		IMPWalker walker = new IMPWalker(nodeStream);
		int intResult = walker.expr().intResult;
		System.out.println("result = "+intResult);
		boolean boolResult = walker.expr().boolResult;
		System.out.println("result = "+Boolean.toString(boolResult));
	}

}
