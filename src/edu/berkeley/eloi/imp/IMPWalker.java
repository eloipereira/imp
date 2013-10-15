// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g 2012-10-05 01:19:02

package edu.berkeley.eloi.imp;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class IMPWalker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators

	public IMPWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}

	public IMPWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String[] getTokenNames() {
		return IMPWalker.tokenNames;
	}

	public String getGrammarFileName() {
		return "/Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g";
	}

	private Map<String, Integer> variables = new HashMap<String, Integer>();

	// $ANTLR start "program"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:19:1:
	// program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:19:9:
			// ( ( statement )+ )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:19:11:
			// ( statement )+
			{
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:19:11:
				// ( statement )+
				int cnt1 = 0;
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if ((LA1_0 == 15 || LA1_0 == 22 || (LA1_0 >= 25 && LA1_0 <= 26))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:19:11:
					// statement
					{
						pushFollow(FOLLOW_statement_in_program55);
						statement();

						state._fsp--;

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

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "program"

	// $ANTLR start "statement"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:1:
	// statement : ( assgnCmd | printCmd | ifCmd | whileCmd ) ;
	public final void statement() throws RecognitionException {
		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:10:
			// ( ( assgnCmd | printCmd | ifCmd | whileCmd ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:12:
			// ( assgnCmd | printCmd | ifCmd | whileCmd )
			{
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:12:
				// ( assgnCmd | printCmd | ifCmd | whileCmd )
				int alt2 = 4;
				switch (input.LA(1)) {
				case 15: {
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
					NoViableAltException nvae = new NoViableAltException("", 2,
							0, input);

					throw nvae;

				}

				switch (alt2) {
				case 1:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:13:
				// assgnCmd
				{
					pushFollow(FOLLOW_assgnCmd_in_statement64);
					assgnCmd();

					state._fsp--;

				}
					break;
				case 2:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:24:
				// printCmd
				{
					pushFollow(FOLLOW_printCmd_in_statement68);
					printCmd();

					state._fsp--;

				}
					break;
				case 3:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:35:
				// ifCmd
				{
					pushFollow(FOLLOW_ifCmd_in_statement72);
					ifCmd();

					state._fsp--;

				}
					break;
				case 4:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:21:43:
				// whileCmd
				{
					pushFollow(FOLLOW_whileCmd_in_statement76);
					whileCmd();

					state._fsp--;

				}
					break;

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "statement"

	public static class expr_return extends TreeRuleReturnScope {
		public int intResult;
		public boolean boolResult;
		public boolean boolExp;
	};

	// $ANTLR start "expr"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:24:1:
	// expr returns [int intResult,boolean boolResult, boolean boolExp] : ( ^(
	// NEGATION a= expr ) | ^( '+' a0= expr a1= expr ) | ^( '-' a0= expr a1=
	// expr ) | ^( '*' a0= expr a1= expr ) | ^( '/' a0= expr a1= expr ) | ^(
	// 'NOT' b= expr ) | ^( '=' a0= expr a1= expr ) | ^( '<' a0= expr a1= expr )
	// | ^( '>' a0= expr a1= expr ) | ^( 'AND' b0= expr b1= expr ) | ^( 'OR' b0=
	// expr b1= expr ) | INTEGER | BOOL | IDENT );
	public final IMPWalker.expr_return expr() throws RecognitionException {
		IMPWalker.expr_return retval = new IMPWalker.expr_return();
		retval.start = input.LT(1);

		CommonTree INTEGER1 = null;
		CommonTree BOOL2 = null;
		CommonTree IDENT3 = null;
		IMPWalker.expr_return a = null;

		IMPWalker.expr_return a0 = null;

		IMPWalker.expr_return a1 = null;

		IMPWalker.expr_return b = null;

		IMPWalker.expr_return b0 = null;

		IMPWalker.expr_return b1 = null;

		retval.intResult = 0;
		retval.boolResult = false;
		boolean boolExp = false;
		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:26:2:
			// ( ^( NEGATION a= expr ) | ^( '+' a0= expr a1= expr ) | ^( '-' a0=
			// expr a1= expr ) | ^( '*' a0= expr a1= expr ) | ^( '/' a0= expr
			// a1= expr ) | ^( 'NOT' b= expr ) | ^( '=' a0= expr a1= expr ) | ^(
			// '<' a0= expr a1= expr ) | ^( '>' a0= expr a1= expr ) | ^( 'AND'
			// b0= expr b1= expr ) | ^( 'OR' b0= expr b1= expr ) | INTEGER |
			// BOOL | IDENT )
			int alt3 = 14;
			switch (input.LA(1)) {
			case NEGATION: {
				alt3 = 1;
			}
				break;
			case 12: {
				alt3 = 2;
			}
				break;
			case 13: {
				alt3 = 3;
			}
				break;
			case 11: {
				alt3 = 4;
			}
				break;
			case 14: {
				alt3 = 5;
			}
				break;
			case 23: {
				alt3 = 6;
			}
				break;
			case 18: {
				alt3 = 7;
			}
				break;
			case 17: {
				alt3 = 8;
			}
				break;
			case 19: {
				alt3 = 9;
			}
				break;
			case 20: {
				alt3 = 10;
			}
				break;
			case 24: {
				alt3 = 11;
			}
				break;
			case INTEGER: {
				alt3 = 12;
			}
				break;
			case BOOL: {
				alt3 = 13;
			}
				break;
			case IDENT: {
				alt3 = 14;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;

			}

			switch (alt3) {
			case 1:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:26:4:
			// ^( NEGATION a= expr )
			{
				match(input, NEGATION, FOLLOW_NEGATION_in_expr97);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr103);
				a = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.intResult = -(a != null ? a.intResult : 0);

			}
				break;
			case 2:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:27:4:
			// ^( '+' a0= expr a1= expr )
			{
				match(input, 12, FOLLOW_12_in_expr112);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr118);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr124);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.intResult = (a0 != null ? a0.intResult : 0)
						+ (a1 != null ? a1.intResult : 0);
				retval.boolExp = false;

			}
				break;
			case 3:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:28:4:
			// ^( '-' a0= expr a1= expr )
			{
				match(input, 13, FOLLOW_13_in_expr133);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr139);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr145);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.intResult = (a0 != null ? a0.intResult : 0)
						- (a1 != null ? a1.intResult : 0);
				retval.boolExp = false;

			}
				break;
			case 4:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:29:4:
			// ^( '*' a0= expr a1= expr )
			{
				match(input, 11, FOLLOW_11_in_expr154);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr160);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr166);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.intResult = (a0 != null ? a0.intResult : 0)
						* (a1 != null ? a1.intResult : 0);
				retval.boolExp = false;

			}
				break;
			case 5:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:30:4:
			// ^( '/' a0= expr a1= expr )
			{
				match(input, 14, FOLLOW_14_in_expr175);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr181);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr187);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.intResult = (a0 != null ? a0.intResult : 0)
						/ (a1 != null ? a1.intResult : 0);
				retval.boolExp = false;

			}
				break;
			case 6:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:31:4:
			// ^( 'NOT' b= expr )
			{
				match(input, 23, FOLLOW_23_in_expr196);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr202);
				b = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = !((b != null ? b.boolResult : false));
				retval.boolExp = true;

			}
				break;
			case 7:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:32:4:
			// ^( '=' a0= expr a1= expr )
			{
				match(input, 18, FOLLOW_18_in_expr211);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr217);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr223);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = ((a0 != null ? a0.intResult : 0) == (a1 != null ? a1.intResult
						: 0));
				retval.boolExp = true;

			}
				break;
			case 8:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:33:4:
			// ^( '<' a0= expr a1= expr )
			{
				match(input, 17, FOLLOW_17_in_expr232);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr238);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr244);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = ((a0 != null ? a0.intResult : 0) < (a1 != null ? a1.intResult
						: 0));
				retval.boolExp = true;

			}
				break;
			case 9:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:34:4:
			// ^( '>' a0= expr a1= expr )
			{
				match(input, 19, FOLLOW_19_in_expr253);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr259);
				a0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr265);
				a1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = ((a0 != null ? a0.intResult : 0) > (a1 != null ? a1.intResult
						: 0));
				retval.boolExp = true;

			}
				break;
			case 10:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:35:4:
			// ^( 'AND' b0= expr b1= expr )
			{
				match(input, 20, FOLLOW_20_in_expr274);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr280);
				b0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr286);
				b1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = ((b0 != null ? b0.boolResult : false) && (b1 != null ? b1.boolResult
						: false));
				retval.boolExp = true;

			}
				break;
			case 11:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:36:4:
			// ^( 'OR' b0= expr b1= expr )
			{
				match(input, 24, FOLLOW_24_in_expr295);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_expr301);
				b0 = expr();

				state._fsp--;

				pushFollow(FOLLOW_expr_in_expr307);
				b1 = expr();

				state._fsp--;

				match(input, Token.UP, null);

				retval.boolResult = ((b0 != null ? b0.boolResult : false) || (b1 != null ? b1.boolResult
						: false));
				retval.boolExp = true;

			}
				break;
			case 12:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:37:4:
			// INTEGER
			{
				INTEGER1 = (CommonTree) match(input, INTEGER,
						FOLLOW_INTEGER_in_expr315);

				retval.intResult = Integer
						.parseInt((INTEGER1 != null ? INTEGER1.getText() : null));
				retval.boolExp = false;

			}
				break;
			case 13:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:38:4:
			// BOOL
			{
				BOOL2 = (CommonTree) match(input, BOOL, FOLLOW_BOOL_in_expr322);

				if (((BOOL2 != null ? BOOL2.getText() : null)).equals("T")) {
					retval.boolResult = true;
				} else if (((BOOL2 != null ? BOOL2.getText() : null))
						.equals("F")) {
					retval.boolResult = false;
				}
				;
				retval.boolExp = true;

			}
				break;
			case 14:
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:42:4:
			// IDENT
			{
				IDENT3 = (CommonTree) match(input, IDENT,
						FOLLOW_IDENT_in_expr329);

				retval.intResult = variables.get((IDENT3 != null ? IDENT3
						.getText() : null));
				retval.boolExp = false;

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "expr"

	// $ANTLR start "ifCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:45:1:
	// ifCmd : ^( 'IF' e= . s0= . s1= . ) ;
	public final void ifCmd() throws RecognitionException {
		CommonTree e = null;
		CommonTree s0 = null;
		CommonTree s1 = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:45:8:
			// ( ^( 'IF' e= . s0= . s1= . ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:45:10:
			// ^( 'IF' e= . s0= . s1= . )
			{
				match(input, 22, FOLLOW_22_in_ifCmd342);

				int mark0 = input.mark();

				match(input, Token.DOWN, null);
				e = (CommonTree) input.LT(1);

				matchAny(input);

				int mark1 = input.mark();

				s0 = (CommonTree) input.LT(1);

				matchAny(input);

				int mark2 = input.mark();

				s1 = (CommonTree) input.LT(1);

				matchAny(input);

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

				match(input, Token.UP, null);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "ifCmd"

	// $ANTLR start "whileCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:61:1:
	// whileCmd : ^( 'WHILE' e= . s= . ) ;
	public final void whileCmd() throws RecognitionException {
		CommonTree e = null;
		CommonTree s = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:61:9:
			// ( ^( 'WHILE' e= . s= . ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:61:11:
			// ^( 'WHILE' e= . s= . )
			{
				match(input, 26, FOLLOW_26_in_whileCmd372);

				int mark0 = input.mark();

				match(input, Token.DOWN, null);
				e = (CommonTree) input.LT(1);

				matchAny(input);

				int mark1 = input.mark();

				s = (CommonTree) input.LT(1);

				matchAny(input);

				int end = input.mark();
				input.rewind(mark0);
				input.consume();
				boolean b = expr().boolResult;
				while (b) {
					input.rewind(mark1);
					statement();
					input.rewind(mark0);
					input.consume();
					b = expr().boolResult;
				}
				input.rewind(end);

				match(input, Token.UP, null);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "whileCmd"

	// $ANTLR start "assgnCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:77:1:
	// assgnCmd : ^( ':=' IDENT e= expr ) ;
	public final void assgnCmd() throws RecognitionException {
		CommonTree IDENT4 = null;
		IMPWalker.expr_return e = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:78:2:
			// ( ^( ':=' IDENT e= expr ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:78:4:
			// ^( ':=' IDENT e= expr )
			{
				match(input, 15, FOLLOW_15_in_assgnCmd399);

				match(input, Token.DOWN, null);
				IDENT4 = (CommonTree) match(input, IDENT,
						FOLLOW_IDENT_in_assgnCmd401);

				pushFollow(FOLLOW_expr_in_assgnCmd405);
				e = expr();

				state._fsp--;

				match(input, Token.UP, null);

				variables.put((IDENT4 != null ? IDENT4.getText() : null),
						(e != null ? e.intResult : 0));

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "assgnCmd"

	// $ANTLR start "printCmd"
	// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:81:1:
	// printCmd : ^( 'PRINT' e= expr ) ;
	public final void printCmd() throws RecognitionException {
		IMPWalker.expr_return e = null;

		try {
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:82:2:
			// ( ^( 'PRINT' e= expr ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMPWalker.g:82:4:
			// ^( 'PRINT' e= expr )
			{
				match(input, 25, FOLLOW_25_in_printCmd419);

				match(input, Token.DOWN, null);
				pushFollow(FOLLOW_expr_in_printCmd423);
				e = expr();

				state._fsp--;

				match(input, Token.UP, null);

				if ((e != null ? e.boolExp : false)) {
					System.out.println((e != null ? e.boolResult : false));
				} else {
					System.out.println((e != null ? e.intResult : 0));
				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		}

		finally {
			// do for sure before leaving
		}
		return;
	}

	// $ANTLR end "printCmd"

	// Delegated rules

	public static final BitSet FOLLOW_statement_in_program55 = new BitSet(
			new long[] { 0x0000000006408002L });
	public static final BitSet FOLLOW_assgnCmd_in_statement64 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_printCmd_in_statement68 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ifCmd_in_statement72 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_whileCmd_in_statement76 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NEGATION_in_expr97 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr103 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_12_in_expr112 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr118 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_13_in_expr133 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr139 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr145 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_11_in_expr154 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr166 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_14_in_expr175 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr181 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr187 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_23_in_expr196 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr202 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_18_in_expr211 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr217 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr223 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_17_in_expr232 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr238 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_19_in_expr253 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr259 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr265 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_20_in_expr274 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr280 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr286 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_24_in_expr295 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_expr301 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_expr307 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_INTEGER_in_expr315 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BOOL_in_expr322 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENT_in_expr329 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_22_in_ifCmd342 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_26_in_whileCmd372 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_15_in_assgnCmd399 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_IDENT_in_assgnCmd401 = new BitSet(
			new long[] { 0x00000000019E78F0L });
	public static final BitSet FOLLOW_expr_in_assgnCmd405 = new BitSet(
			new long[] { 0x0000000000000008L });
	public static final BitSet FOLLOW_25_in_printCmd419 = new BitSet(
			new long[] { 0x0000000000000004L });
	public static final BitSet FOLLOW_expr_in_printCmd423 = new BitSet(
			new long[] { 0x0000000000000008L });

}