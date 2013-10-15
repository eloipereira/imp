package edu.berkeley.eloi.imp;

import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class TestIMP {
	public static void main(String[] args) throws IOException,
			RecognitionException {
		// CharStream input = new ANTLRStringStream("PRINT(1+1 < 2+2);");//test
		// boolean exp
		// CharStream input = new
		// ANTLRStringStream("x:=1; y:=x+1; PRINT(y);");//test assignemnt
		// CharStream input = new
		// ANTLRStringStream("x:=1; y:=0; IF (x<2) {y:=x+1;} ELSE {y:=x-1;}; PRINT(y);");
		// //test if command
		CharStream input = new ANTLRStringStream(
				"x:=1; WHILE (x < 10) {x:=x+1;}; PRINT(x);"); // test while
																// command
		IMPLexer lexer = new IMPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		IMPParser parser = new IMPParser(tokens);
		IMPParser.program_return res = parser.program();
		CommonTree tree = (CommonTree) res.getTree();
		System.out.println("AST of program \"" + input + "\"\n"
				+ tree.toStringTree() + "\n");
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		IMPWalker walker = new IMPWalker(nodeStream);
		System.out.println("Interpreting program \"" + input + "\"");
		walker.program();
	}
}
