// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g 2012-10-05 01:12:13
package edu.berkeley.eloi.imp;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class IMPParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "BOOL", "IDENT", "INTEGER", "NEGATION",
			"WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':='", "';'",
			"'<'", "'='", "'>'", "'AND'", "'ELSE'", "'IF'", "'NOT'", "'OR'",
			"'PRINT'", "'WHILE'", "'{'", "'}'" };

	public static final int EOF = -1;
	public static final int T__9 = 9;
	public static final int T__10 = 10;
	public static final int T__11 = 11;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__19 = 19;
	public static final int T__20 = 20;
	public static final int T__21 = 21;
	public static final int T__22 = 22;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__25 = 25;
	public static final int T__26 = 26;
	public static final int T__27 = 27;
	public static final int T__28 = 28;
	public static final int BOOL = 4;
	public static final int IDENT = 5;
	public static final int INTEGER = 6;
	public static final int NEGATION = 7;
	public static final int WS = 8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

	public IMPParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public IMPParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	public String[] getTokenNames() {
		return IMPParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "/Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g";
	}

	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "program"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:1:
	// program : ( statement )+ EOF !;
	public final IMPParser.program_return program() throws RecognitionException {
		IMPParser.program_return retval = new IMPParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2 = null;
		IMPParser.statement_return statement1 = null;

		CommonTree EOF2_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:8:
			// ( ( statement )+ EOF !)
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:10:
			// ( statement )+ EOF !
			{
				root_0 = (CommonTree) adaptor.nil();

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:10:
				// ( statement )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == IDENT || LA1_0 == 22 || (LA1_0 >= 25 && LA1_0 <= 26))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:10:
					// statement
					{
						pushFollow(FOLLOW_statement_in_program65);
						statement1 = statement();

						state._fsp--;

						adaptor.addChild(root_0, statement1.getTree());

					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				} while (true);

				EOF2 = (Token) match(input, EOF, FOLLOW_EOF_in_program68);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "program"

	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "statement"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:1:
	// statement : ( ( assgnCmd | printCmd | ifCmd | whileCmd ) ';' !) ;
	public final IMPParser.statement_return statement()
			throws RecognitionException {
		IMPParser.statement_return retval = new IMPParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal7 = null;
		IMPParser.assgnCmd_return assgnCmd3 = null;

		IMPParser.printCmd_return printCmd4 = null;

		IMPParser.ifCmd_return ifCmd5 = null;

		IMPParser.whileCmd_return whileCmd6 = null;

		CommonTree char_literal7_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:10:
			// ( ( ( assgnCmd | printCmd | ifCmd | whileCmd ) ';' !) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:12:
			// ( ( assgnCmd | printCmd | ifCmd | whileCmd ) ';' !)
			{
				root_0 = (CommonTree) adaptor.nil();

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:12:
				// ( ( assgnCmd | printCmd | ifCmd | whileCmd ) ';' !)
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:13:
				// ( assgnCmd | printCmd | ifCmd | whileCmd ) ';' !
				{
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:13:
					// ( assgnCmd | printCmd | ifCmd | whileCmd )
					int alt2 = 4;
					switch (input.LA(1)) {
					case IDENT: {
						alt2 = 1;
					}
						break;
					case 25: {
						alt2 = 2;
					}
						break;
					case 22: {
						alt2 = 3;
					}
						break;
					case 26: {
						alt2 = 4;
					}
						break;
					default:
						NoViableAltException nvae = new NoViableAltException(
								"", 2, 0, input);

						throw nvae;

					}

					switch (alt2) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:14:
					// assgnCmd
					{
						pushFollow(FOLLOW_assgnCmd_in_statement78);
						assgnCmd3 = assgnCmd();

						state._fsp--;

						adaptor.addChild(root_0, assgnCmd3.getTree());

					}
						break;
					case 2:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:25:
					// printCmd
					{
						pushFollow(FOLLOW_printCmd_in_statement82);
						printCmd4 = printCmd();

						state._fsp--;

						adaptor.addChild(root_0, printCmd4.getTree());

					}
						break;
					case 3:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:36:
					// ifCmd
					{
						pushFollow(FOLLOW_ifCmd_in_statement86);
						ifCmd5 = ifCmd();

						state._fsp--;

						adaptor.addChild(root_0, ifCmd5.getTree());

					}
						break;
					case 4:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:44:
					// whileCmd
					{
						pushFollow(FOLLOW_whileCmd_in_statement90);
						whileCmd6 = whileCmd();

						state._fsp--;

						adaptor.addChild(root_0, whileCmd6.getTree());

					}
						break;

					}

					char_literal7 = (Token) match(input, 16,
							FOLLOW_16_in_statement93);

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "statement"

	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "term"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:1:
	// term : ( INTEGER | BOOL | IDENT | '(' ! expr ')' !);
	public final IMPParser.term_return term() throws RecognitionException {
		IMPParser.term_return retval = new IMPParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER8 = null;
		Token BOOL9 = null;
		Token IDENT10 = null;
		Token char_literal11 = null;
		Token char_literal13 = null;
		IMPParser.expr_return expr12 = null;

		CommonTree INTEGER8_tree = null;
		CommonTree BOOL9_tree = null;
		CommonTree IDENT10_tree = null;
		CommonTree char_literal11_tree = null;
		CommonTree char_literal13_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:5:
			// ( INTEGER | BOOL | IDENT | '(' ! expr ')' !)
			int alt3 = 4;
			switch (input.LA(1)) {
			case INTEGER: {
				alt3 = 1;
			}
				break;
			case BOOL: {
				alt3 = 2;
			}
				break;
			case IDENT: {
				alt3 = 3;
			}
				break;
			case 9: {
				alt3 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;

			}

			switch (alt3) {
			case 1:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:7:
			// INTEGER
			{
				root_0 = (CommonTree) adaptor.nil();

				INTEGER8 = (Token) match(input, INTEGER,
						FOLLOW_INTEGER_in_term102);
				INTEGER8_tree = (CommonTree) adaptor.create(INTEGER8);
				adaptor.addChild(root_0, INTEGER8_tree);

			}
				break;
			case 2:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:17:
			// BOOL
			{
				root_0 = (CommonTree) adaptor.nil();

				BOOL9 = (Token) match(input, BOOL, FOLLOW_BOOL_in_term106);
				BOOL9_tree = (CommonTree) adaptor.create(BOOL9);
				adaptor.addChild(root_0, BOOL9_tree);

			}
				break;
			case 3:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:24:
			// IDENT
			{
				root_0 = (CommonTree) adaptor.nil();

				IDENT10 = (Token) match(input, IDENT, FOLLOW_IDENT_in_term110);
				IDENT10_tree = (CommonTree) adaptor.create(IDENT10);
				adaptor.addChild(root_0, IDENT10_tree);

			}
				break;
			case 4:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:32:
			// '(' ! expr ')' !
			{
				root_0 = (CommonTree) adaptor.nil();

				char_literal11 = (Token) match(input, 9, FOLLOW_9_in_term114);

				pushFollow(FOLLOW_expr_in_term117);
				expr12 = expr();

				state._fsp--;

				adaptor.addChild(root_0, expr12.getTree());

				char_literal13 = (Token) match(input, 10, FOLLOW_10_in_term119);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "term"

	public static class unaryOp_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "unaryOp"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:1:
	// unaryOp : ( negation ^| 'NOT' ^)* term ;
	public final IMPParser.unaryOp_return unaryOp() throws RecognitionException {
		IMPParser.unaryOp_return retval = new IMPParser.unaryOp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15 = null;
		IMPParser.negation_return negation14 = null;

		IMPParser.term_return term16 = null;

		CommonTree string_literal15_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:8:
			// ( ( negation ^| 'NOT' ^)* term )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:10:
			// ( negation ^| 'NOT' ^)* term
			{
				root_0 = (CommonTree) adaptor.nil();

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:10:
				// ( negation ^| 'NOT' ^)*
				loop4: do {
					int alt4 = 3;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == 13)) {
						alt4 = 1;
					} else if ((LA4_0 == 23)) {
						alt4 = 2;
					}

					switch (alt4) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:11:
					// negation ^
					{
						pushFollow(FOLLOW_negation_in_unaryOp127);
						negation14 = negation();

						state._fsp--;

						root_0 = (CommonTree) adaptor.becomeRoot(
								negation14.getTree(), root_0);

					}
						break;
					case 2:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:23:
					// 'NOT' ^
					{
						string_literal15 = (Token) match(input, 23,
								FOLLOW_23_in_unaryOp132);
						string_literal15_tree = (CommonTree) adaptor
								.create(string_literal15);
						root_0 = (CommonTree) adaptor.becomeRoot(
								string_literal15_tree, root_0);

					}
						break;

					default:
						break loop4;
					}
				} while (true);

				pushFollow(FOLLOW_term_in_unaryOp137);
				term16 = term();

				state._fsp--;

				adaptor.addChild(root_0, term16.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "unaryOp"

	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "negation"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:20:1:
	// negation : '-' -> NEGATION ;
	public final IMPParser.negation_return negation()
			throws RecognitionException {
		IMPParser.negation_return retval = new IMPParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal17 = null;

		CommonTree char_literal17_tree = null;
		RewriteRuleTokenStream stream_13 = new RewriteRuleTokenStream(adaptor,
				"token 13");

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:20:9:
			// ( '-' -> NEGATION )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:20:11:
			// '-'
			{
				char_literal17 = (Token) match(input, 13,
						FOLLOW_13_in_negation143);
				stream_13.add(char_literal17);

				// AST REWRITE
				// elements:
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				retval.tree = root_0;
				RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
						adaptor, "rule retval", retval != null ? retval.tree
								: null);

				root_0 = (CommonTree) adaptor.nil();
				// 20:15: -> NEGATION
				{
					adaptor.addChild(root_0,
							(CommonTree) adaptor.create(NEGATION, "NEGATION"));

				}

				retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "negation"

	public static class multOp_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "multOp"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:1:
	// multOp : unaryOp ( ( '*' ^| '/' ^) unaryOp )* ;
	public final IMPParser.multOp_return multOp() throws RecognitionException {
		IMPParser.multOp_return retval = new IMPParser.multOp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal19 = null;
		Token char_literal20 = null;
		IMPParser.unaryOp_return unaryOp18 = null;

		IMPParser.unaryOp_return unaryOp21 = null;

		CommonTree char_literal19_tree = null;
		CommonTree char_literal20_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:7:
			// ( unaryOp ( ( '*' ^| '/' ^) unaryOp )* )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:9:
			// unaryOp ( ( '*' ^| '/' ^) unaryOp )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_unaryOp_in_multOp153);
				unaryOp18 = unaryOp();

				state._fsp--;

				adaptor.addChild(root_0, unaryOp18.getTree());

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:17:
				// ( ( '*' ^| '/' ^) unaryOp )*
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if ((LA6_0 == 11 || LA6_0 == 14)) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:18:
					// ( '*' ^| '/' ^) unaryOp
					{
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:18:
						// ( '*' ^| '/' ^)
						int alt5 = 2;
						int LA5_0 = input.LA(1);

						if ((LA5_0 == 11)) {
							alt5 = 1;
						} else if ((LA5_0 == 14)) {
							alt5 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 5, 0, input);

							throw nvae;

						}
						switch (alt5) {
						case 1:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:19:
						// '*' ^
						{
							char_literal19 = (Token) match(input, 11,
									FOLLOW_11_in_multOp157);
							char_literal19_tree = (CommonTree) adaptor
									.create(char_literal19);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal19_tree, root_0);

						}
							break;
						case 2:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:26:
						// '/' ^
						{
							char_literal20 = (Token) match(input, 14,
									FOLLOW_14_in_multOp162);
							char_literal20_tree = (CommonTree) adaptor
									.create(char_literal20);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal20_tree, root_0);

						}
							break;

						}

						pushFollow(FOLLOW_unaryOp_in_multOp166);
						unaryOp21 = unaryOp();

						state._fsp--;

						adaptor.addChild(root_0, unaryOp21.getTree());

					}
						break;

					default:
						break loop6;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "multOp"

	public static class addOp_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "addOp"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:1:
	// addOp : multOp ( ( '+' ^| '-' ^) multOp )* ;
	public final IMPParser.addOp_return addOp() throws RecognitionException {
		IMPParser.addOp_return retval = new IMPParser.addOp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal23 = null;
		Token char_literal24 = null;
		IMPParser.multOp_return multOp22 = null;

		IMPParser.multOp_return multOp25 = null;

		CommonTree char_literal23_tree = null;
		CommonTree char_literal24_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:6:
			// ( multOp ( ( '+' ^| '-' ^) multOp )* )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:8:
			// multOp ( ( '+' ^| '-' ^) multOp )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_multOp_in_addOp174);
				multOp22 = multOp();

				state._fsp--;

				adaptor.addChild(root_0, multOp22.getTree());

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:15:
				// ( ( '+' ^| '-' ^) multOp )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= 12 && LA8_0 <= 13))) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:16:
					// ( '+' ^| '-' ^) multOp
					{
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:16:
						// ( '+' ^| '-' ^)
						int alt7 = 2;
						int LA7_0 = input.LA(1);

						if ((LA7_0 == 12)) {
							alt7 = 1;
						} else if ((LA7_0 == 13)) {
							alt7 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 7, 0, input);

							throw nvae;

						}
						switch (alt7) {
						case 1:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:17:
						// '+' ^
						{
							char_literal23 = (Token) match(input, 12,
									FOLLOW_12_in_addOp178);
							char_literal23_tree = (CommonTree) adaptor
									.create(char_literal23);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal23_tree, root_0);

						}
							break;
						case 2:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:24:
						// '-' ^
						{
							char_literal24 = (Token) match(input, 13,
									FOLLOW_13_in_addOp183);
							char_literal24_tree = (CommonTree) adaptor
									.create(char_literal24);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal24_tree, root_0);

						}
							break;

						}

						pushFollow(FOLLOW_multOp_in_addOp187);
						multOp25 = multOp();

						state._fsp--;

						adaptor.addChild(root_0, multOp25.getTree());

					}
						break;

					default:
						break loop8;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "addOp"

	public static class comp_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "comp"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:1:
	// comp : addOp ( ( '=' ^| '<' ^| '>' ^) addOp )* ;
	public final IMPParser.comp_return comp() throws RecognitionException {
		IMPParser.comp_return retval = new IMPParser.comp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal27 = null;
		Token char_literal28 = null;
		Token char_literal29 = null;
		IMPParser.addOp_return addOp26 = null;

		IMPParser.addOp_return addOp30 = null;

		CommonTree char_literal27_tree = null;
		CommonTree char_literal28_tree = null;
		CommonTree char_literal29_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:5:
			// ( addOp ( ( '=' ^| '<' ^| '>' ^) addOp )* )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:7:
			// addOp ( ( '=' ^| '<' ^| '>' ^) addOp )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_addOp_in_comp195);
				addOp26 = addOp();

				state._fsp--;

				adaptor.addChild(root_0, addOp26.getTree());

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:13:
				// ( ( '=' ^| '<' ^| '>' ^) addOp )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if (((LA10_0 >= 17 && LA10_0 <= 19))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:14:
					// ( '=' ^| '<' ^| '>' ^) addOp
					{
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:14:
						// ( '=' ^| '<' ^| '>' ^)
						int alt9 = 3;
						switch (input.LA(1)) {
						case 18: {
							alt9 = 1;
						}
							break;
						case 17: {
							alt9 = 2;
						}
							break;
						case 19: {
							alt9 = 3;
						}
							break;
						default:
							NoViableAltException nvae = new NoViableAltException(
									"", 9, 0, input);

							throw nvae;

						}

						switch (alt9) {
						case 1:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:15:
						// '=' ^
						{
							char_literal27 = (Token) match(input, 18,
									FOLLOW_18_in_comp199);
							char_literal27_tree = (CommonTree) adaptor
									.create(char_literal27);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal27_tree, root_0);

						}
							break;
						case 2:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:20:
						// '<' ^
						{
							char_literal28 = (Token) match(input, 17,
									FOLLOW_17_in_comp202);
							char_literal28_tree = (CommonTree) adaptor
									.create(char_literal28);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal28_tree, root_0);

						}
							break;
						case 3:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:25:
						// '>' ^
						{
							char_literal29 = (Token) match(input, 19,
									FOLLOW_19_in_comp205);
							char_literal29_tree = (CommonTree) adaptor
									.create(char_literal29);
							root_0 = (CommonTree) adaptor.becomeRoot(
									char_literal29_tree, root_0);

						}
							break;

						}

						pushFollow(FOLLOW_addOp_in_comp209);
						addOp30 = addOp();

						state._fsp--;

						adaptor.addChild(root_0, addOp30.getTree());

					}
						break;

					default:
						break loop10;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "comp"

	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "expr"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:1:
	// expr : comp ( ( 'AND' ^| 'OR' ^) comp )* ;
	public final IMPParser.expr_return expr() throws RecognitionException {
		IMPParser.expr_return retval = new IMPParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal32 = null;
		Token string_literal33 = null;
		IMPParser.comp_return comp31 = null;

		IMPParser.comp_return comp34 = null;

		CommonTree string_literal32_tree = null;
		CommonTree string_literal33_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:5:
			// ( comp ( ( 'AND' ^| 'OR' ^) comp )* )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:7:
			// comp ( ( 'AND' ^| 'OR' ^) comp )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_comp_in_expr217);
				comp31 = comp();

				state._fsp--;

				adaptor.addChild(root_0, comp31.getTree());

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:12:
				// ( ( 'AND' ^| 'OR' ^) comp )*
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == 20 || LA12_0 == 24)) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:13:
					// ( 'AND' ^| 'OR' ^) comp
					{
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:13:
						// ( 'AND' ^| 'OR' ^)
						int alt11 = 2;
						int LA11_0 = input.LA(1);

						if ((LA11_0 == 20)) {
							alt11 = 1;
						} else if ((LA11_0 == 24)) {
							alt11 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException(
									"", 11, 0, input);

							throw nvae;

						}
						switch (alt11) {
						case 1:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:14:
						// 'AND' ^
						{
							string_literal32 = (Token) match(input, 20,
									FOLLOW_20_in_expr221);
							string_literal32_tree = (CommonTree) adaptor
									.create(string_literal32);
							root_0 = (CommonTree) adaptor.becomeRoot(
									string_literal32_tree, root_0);

						}
							break;
						case 2:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:23:
						// 'OR' ^
						{
							string_literal33 = (Token) match(input, 24,
									FOLLOW_24_in_expr226);
							string_literal33_tree = (CommonTree) adaptor
									.create(string_literal33);
							root_0 = (CommonTree) adaptor.becomeRoot(
									string_literal33_tree, root_0);

						}
							break;

						}

						pushFollow(FOLLOW_comp_in_expr230);
						comp34 = comp();

						state._fsp--;

						adaptor.addChild(root_0, comp34.getTree());

					}
						break;

					default:
						break loop12;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "expr"

	public static class assgnCmd_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "assgnCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:26:1:
	// assgnCmd : IDENT ':=' ^ expr ;
	public final IMPParser.assgnCmd_return assgnCmd()
			throws RecognitionException {
		IMPParser.assgnCmd_return retval = new IMPParser.assgnCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT35 = null;
		Token string_literal36 = null;
		IMPParser.expr_return expr37 = null;

		CommonTree IDENT35_tree = null;
		CommonTree string_literal36_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:26:9:
			// ( IDENT ':=' ^ expr )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:26:11:
			// IDENT ':=' ^ expr
			{
				root_0 = (CommonTree) adaptor.nil();

				IDENT35 = (Token) match(input, IDENT,
						FOLLOW_IDENT_in_assgnCmd239);
				IDENT35_tree = (CommonTree) adaptor.create(IDENT35);
				adaptor.addChild(root_0, IDENT35_tree);

				string_literal36 = (Token) match(input, 15,
						FOLLOW_15_in_assgnCmd241);
				string_literal36_tree = (CommonTree) adaptor
						.create(string_literal36);
				root_0 = (CommonTree) adaptor.becomeRoot(string_literal36_tree,
						root_0);

				pushFollow(FOLLOW_expr_in_assgnCmd244);
				expr37 = expr();

				state._fsp--;

				adaptor.addChild(root_0, expr37.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "assgnCmd"

	public static class ifCmd_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ifCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:27:1:
	// ifCmd : 'IF' ^ '(' ! expr ')' ! '{' ! statement '}' ! 'ELSE' ! '{' !
	// statement '}' !;
	public final IMPParser.ifCmd_return ifCmd() throws RecognitionException {
		IMPParser.ifCmd_return retval = new IMPParser.ifCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal38 = null;
		Token char_literal39 = null;
		Token char_literal41 = null;
		Token char_literal42 = null;
		Token char_literal44 = null;
		Token string_literal45 = null;
		Token char_literal46 = null;
		Token char_literal48 = null;
		IMPParser.expr_return expr40 = null;

		IMPParser.statement_return statement43 = null;

		IMPParser.statement_return statement47 = null;

		CommonTree string_literal38_tree = null;
		CommonTree char_literal39_tree = null;
		CommonTree char_literal41_tree = null;
		CommonTree char_literal42_tree = null;
		CommonTree char_literal44_tree = null;
		CommonTree string_literal45_tree = null;
		CommonTree char_literal46_tree = null;
		CommonTree char_literal48_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:27:6:
			// ( 'IF' ^ '(' ! expr ')' ! '{' ! statement '}' ! 'ELSE' ! '{' !
			// statement '}' !)
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:27:8:
			// 'IF' ^ '(' ! expr ')' ! '{' ! statement '}' ! 'ELSE' ! '{' !
			// statement '}' !
			{
				root_0 = (CommonTree) adaptor.nil();

				string_literal38 = (Token) match(input, 22,
						FOLLOW_22_in_ifCmd250);
				string_literal38_tree = (CommonTree) adaptor
						.create(string_literal38);
				root_0 = (CommonTree) adaptor.becomeRoot(string_literal38_tree,
						root_0);

				char_literal39 = (Token) match(input, 9, FOLLOW_9_in_ifCmd253);

				pushFollow(FOLLOW_expr_in_ifCmd256);
				expr40 = expr();

				state._fsp--;

				adaptor.addChild(root_0, expr40.getTree());

				char_literal41 = (Token) match(input, 10, FOLLOW_10_in_ifCmd258);

				char_literal42 = (Token) match(input, 27, FOLLOW_27_in_ifCmd261);

				pushFollow(FOLLOW_statement_in_ifCmd264);
				statement43 = statement();

				state._fsp--;

				adaptor.addChild(root_0, statement43.getTree());

				char_literal44 = (Token) match(input, 28, FOLLOW_28_in_ifCmd266);

				string_literal45 = (Token) match(input, 21,
						FOLLOW_21_in_ifCmd269);

				char_literal46 = (Token) match(input, 27, FOLLOW_27_in_ifCmd272);

				pushFollow(FOLLOW_statement_in_ifCmd275);
				statement47 = statement();

				state._fsp--;

				adaptor.addChild(root_0, statement47.getTree());

				char_literal48 = (Token) match(input, 28, FOLLOW_28_in_ifCmd278);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "ifCmd"

	public static class whileCmd_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "whileCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:28:1:
	// whileCmd : 'WHILE' ^ expr '{' ! statement '}' !;
	public final IMPParser.whileCmd_return whileCmd()
			throws RecognitionException {
		IMPParser.whileCmd_return retval = new IMPParser.whileCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal49 = null;
		Token char_literal51 = null;
		Token char_literal53 = null;
		IMPParser.expr_return expr50 = null;

		IMPParser.statement_return statement52 = null;

		CommonTree string_literal49_tree = null;
		CommonTree char_literal51_tree = null;
		CommonTree char_literal53_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:28:9:
			// ( 'WHILE' ^ expr '{' ! statement '}' !)
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:28:11:
			// 'WHILE' ^ expr '{' ! statement '}' !
			{
				root_0 = (CommonTree) adaptor.nil();

				string_literal49 = (Token) match(input, 26,
						FOLLOW_26_in_whileCmd285);
				string_literal49_tree = (CommonTree) adaptor
						.create(string_literal49);
				root_0 = (CommonTree) adaptor.becomeRoot(string_literal49_tree,
						root_0);

				pushFollow(FOLLOW_expr_in_whileCmd288);
				expr50 = expr();

				state._fsp--;

				adaptor.addChild(root_0, expr50.getTree());

				char_literal51 = (Token) match(input, 27,
						FOLLOW_27_in_whileCmd290);

				pushFollow(FOLLOW_statement_in_whileCmd293);
				statement52 = statement();

				state._fsp--;

				adaptor.addChild(root_0, statement52.getTree());

				char_literal53 = (Token) match(input, 28,
						FOLLOW_28_in_whileCmd296);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "whileCmd"

	public static class printCmd_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "printCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:29:1:
	// printCmd : 'PRINT' ^ '(' ! ( expr ) ')' !;
	public final IMPParser.printCmd_return printCmd()
			throws RecognitionException {
		IMPParser.printCmd_return retval = new IMPParser.printCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal54 = null;
		Token char_literal55 = null;
		Token char_literal57 = null;
		IMPParser.expr_return expr56 = null;

		CommonTree string_literal54_tree = null;
		CommonTree char_literal55_tree = null;
		CommonTree char_literal57_tree = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:29:9:
			// ( 'PRINT' ^ '(' ! ( expr ) ')' !)
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:29:11:
			// 'PRINT' ^ '(' ! ( expr ) ')' !
			{
				root_0 = (CommonTree) adaptor.nil();

				string_literal54 = (Token) match(input, 25,
						FOLLOW_25_in_printCmd303);
				string_literal54_tree = (CommonTree) adaptor
						.create(string_literal54);
				root_0 = (CommonTree) adaptor.becomeRoot(string_literal54_tree,
						root_0);

				char_literal55 = (Token) match(input, 9,
						FOLLOW_9_in_printCmd306);

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:29:25:
				// ( expr )
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:29:26:
				// expr
				{
					pushFollow(FOLLOW_expr_in_printCmd310);
					expr56 = expr();

					state._fsp--;

					adaptor.addChild(root_0, expr56.getTree());

				}

				char_literal57 = (Token) match(input, 10,
						FOLLOW_10_in_printCmd313);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "printCmd"

	// Delegated rules

	public static final BitSet FOLLOW_statement_in_program65 = new BitSet(
			new long[] { 0x0000000006400020L });
	public static final BitSet FOLLOW_EOF_in_program68 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assgnCmd_in_statement78 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_printCmd_in_statement82 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_ifCmd_in_statement86 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_whileCmd_in_statement90 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_16_in_statement93 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INTEGER_in_term102 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BOOL_in_term106 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENT_in_term110 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_9_in_term114 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_expr_in_term117 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_10_in_term119 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_negation_in_unaryOp127 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_23_in_unaryOp132 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_term_in_unaryOp137 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_13_in_negation143 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryOp_in_multOp153 = new BitSet(
			new long[] { 0x0000000000004802L });
	public static final BitSet FOLLOW_11_in_multOp157 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_14_in_multOp162 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_unaryOp_in_multOp166 = new BitSet(
			new long[] { 0x0000000000004802L });
	public static final BitSet FOLLOW_multOp_in_addOp174 = new BitSet(
			new long[] { 0x0000000000003002L });
	public static final BitSet FOLLOW_12_in_addOp178 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_13_in_addOp183 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_multOp_in_addOp187 = new BitSet(
			new long[] { 0x0000000000003002L });
	public static final BitSet FOLLOW_addOp_in_comp195 = new BitSet(
			new long[] { 0x00000000000E0002L });
	public static final BitSet FOLLOW_18_in_comp199 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_17_in_comp202 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_19_in_comp205 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_addOp_in_comp209 = new BitSet(
			new long[] { 0x00000000000E0002L });
	public static final BitSet FOLLOW_comp_in_expr217 = new BitSet(
			new long[] { 0x0000000001100002L });
	public static final BitSet FOLLOW_20_in_expr221 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_24_in_expr226 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_comp_in_expr230 = new BitSet(
			new long[] { 0x0000000001100002L });
	public static final BitSet FOLLOW_IDENT_in_assgnCmd239 = new BitSet(
			new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_15_in_assgnCmd241 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_expr_in_assgnCmd244 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_ifCmd250 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_ifCmd253 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_expr_in_ifCmd256 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_10_in_ifCmd258 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_ifCmd261 = new BitSet(
			new long[] { 0x0000000006400020L });
	public static final BitSet FOLLOW_statement_in_ifCmd264 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_28_in_ifCmd266 = new BitSet(
			new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_21_in_ifCmd269 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_ifCmd272 = new BitSet(
			new long[] { 0x0000000006400020L });
	public static final BitSet FOLLOW_statement_in_ifCmd275 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_28_in_ifCmd278 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_26_in_whileCmd285 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_expr_in_whileCmd288 = new BitSet(
			new long[] { 0x0000000008000000L });
	public static final BitSet FOLLOW_27_in_whileCmd290 = new BitSet(
			new long[] { 0x0000000006400020L });
	public static final BitSet FOLLOW_statement_in_whileCmd293 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_28_in_whileCmd296 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_25_in_printCmd303 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_9_in_printCmd306 = new BitSet(
			new long[] { 0x0000000000802270L });
	public static final BitSet FOLLOW_expr_in_printCmd310 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_10_in_printCmd313 = new BitSet(
			new long[] { 0x0000000000000002L });

}