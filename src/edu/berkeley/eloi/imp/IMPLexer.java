// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g 2012-10-05 01:12:13
package edu.berkeley.eloi.imp;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class IMPLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public IMPLexer() {
	}

	public IMPLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public IMPLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String getGrammarFileName() {
		return "/Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g";
	}

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:9:6:
			// ( '(' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:9:8:
			// '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:10:7:
			// ( ')' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:10:9:
			// ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:11:7:
			// ( '*' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:11:9:
			// '*'
			{
				match('*');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:12:7:
			// ( '+' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:12:9:
			// '+'
			{
				match('+');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:13:7:
			// ( '-' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:13:9:
			// '-'
			{
				match('-');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:14:7:
			// ( '/' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:14:9:
			// '/'
			{
				match('/');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:7:
			// ( ':=' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:15:9:
			// ':='
			{
				match(":=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:16:7:
			// ( ';' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:16:9:
			// ';'
			{
				match(';');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:7:
			// ( '<' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:17:9:
			// '<'
			{
				match('<');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:7:
			// ( '=' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:18:9:
			// '='
			{
				match('=');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:7:
			// ( '>' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:19:9:
			// '>'
			{
				match('>');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:20:7:
			// ( 'AND' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:20:9:
			// 'AND'
			{
				match("AND");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:7:
			// ( 'ELSE' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:21:9:
			// 'ELSE'
			{
				match("ELSE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:7:
			// ( 'IF' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:22:9:
			// 'IF'
			{
				match("IF");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:7:
			// ( 'NOT' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:23:9:
			// 'NOT'
			{
				match("NOT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:7:
			// ( 'OR' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:24:9:
			// 'OR'
			{
				match("OR");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:25:7:
			// ( 'PRINT' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:25:9:
			// 'PRINT'
			{
				match("PRINT");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:26:7:
			// ( 'WHILE' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:26:9:
			// 'WHILE'
			{
				match("WHILE");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:27:7:
			// ( '{' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:27:9:
			// '{'
			{
				match('{');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:28:7:
			// ( '}' )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:28:9:
			// '}'
			{
				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__28"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:31:5:
			// ( ( 'T' | 'F' ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:
			{
				if (input.LA(1) == 'F' || input.LA(1) == 'T') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BOOL"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:8:
			// ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:10:
			// ( '0' | '1' .. '9' ( '0' .. '9' )* )
			{
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:10:
				// ( '0' | '1' .. '9' ( '0' .. '9' )* )
				int alt2 = 2;
				int LA2_0 = input.LA(1);

				if ((LA2_0 == '0')) {
					alt2 = 1;
				} else if (((LA2_0 >= '1' && LA2_0 <= '9'))) {
					alt2 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 2,
							0, input);

					throw nvae;

				}
				switch (alt2) {
				case 1:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:11:
				// '0'
				{
					match('0');

				}
					break;
				case 2:
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:17:
				// '1' .. '9' ( '0' .. '9' )*
				{
					matchRange('1', '9');

					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:32:26:
					// ( '0' .. '9' )*
					loop1: do {
						int alt1 = 2;
						int LA1_0 = input.LA(1);

						if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
							alt1 = 1;
						}

						switch (alt1) {
						case 1:
						// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:
						{
							if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}

						}
							break;

						default:
							break loop1;
						}
					} while (true);

				}
					break;

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "INTEGER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:33:6:
			// ( ( 'a' .. 'z' ) ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:33:8:
			// ( 'a' .. 'z' ) ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
				if ((input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:33:18:
				// ( '0' .. '9' )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop3;
					}
				} while (true);

				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:33:29:
				// ( 'a' .. 'z' | 'A' .. 'Z' )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if (((LA4_0 >= 'A' && LA4_0 <= 'Z') || (LA4_0 >= 'a' && LA4_0 <= 'z'))) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:
					{
						if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop4;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "IDENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:34:3:
			// ( ( ' ' | '\\t' | '\\n' )+ )
			// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:34:5:
			// ( ' ' | '\\t' | '\\n' )+
			{
				// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:34:5:
				// ( ' ' | '\\t' | '\\n' )+
				int cnt5 = 0;
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if (((LA5_0 >= '\t' && LA5_0 <= '\n') || LA5_0 == ' ')) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt5 >= 1)
							break loop5;
						EarlyExitException eee = new EarlyExitException(5,
								input);
						throw eee;
					}
					cnt5++;
				} while (true);

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "WS"

	public void mTokens() throws RecognitionException {
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:8:
		// ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 |
		// T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25
		// | T__26 | T__27 | T__28 | BOOL | INTEGER | IDENT | WS )
		int alt6 = 24;
		switch (input.LA(1)) {
		case '(': {
			alt6 = 1;
		}
			break;
		case ')': {
			alt6 = 2;
		}
			break;
		case '*': {
			alt6 = 3;
		}
			break;
		case '+': {
			alt6 = 4;
		}
			break;
		case '-': {
			alt6 = 5;
		}
			break;
		case '/': {
			alt6 = 6;
		}
			break;
		case ':': {
			alt6 = 7;
		}
			break;
		case ';': {
			alt6 = 8;
		}
			break;
		case '<': {
			alt6 = 9;
		}
			break;
		case '=': {
			alt6 = 10;
		}
			break;
		case '>': {
			alt6 = 11;
		}
			break;
		case 'A': {
			alt6 = 12;
		}
			break;
		case 'E': {
			alt6 = 13;
		}
			break;
		case 'I': {
			alt6 = 14;
		}
			break;
		case 'N': {
			alt6 = 15;
		}
			break;
		case 'O': {
			alt6 = 16;
		}
			break;
		case 'P': {
			alt6 = 17;
		}
			break;
		case 'W': {
			alt6 = 18;
		}
			break;
		case '{': {
			alt6 = 19;
		}
			break;
		case '}': {
			alt6 = 20;
		}
			break;
		case 'F':
		case 'T': {
			alt6 = 21;
		}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': {
			alt6 = 22;
		}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z': {
			alt6 = 23;
		}
			break;
		case '\t':
		case '\n':
		case ' ': {
			alt6 = 24;
		}
			break;
		default:
			NoViableAltException nvae = new NoViableAltException("", 6, 0,
					input);

			throw nvae;

		}

		switch (alt6) {
		case 1:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:10:
		// T__9
		{
			mT__9();

		}
			break;
		case 2:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:15:
		// T__10
		{
			mT__10();

		}
			break;
		case 3:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:21:
		// T__11
		{
			mT__11();

		}
			break;
		case 4:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:27:
		// T__12
		{
			mT__12();

		}
			break;
		case 5:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:33:
		// T__13
		{
			mT__13();

		}
			break;
		case 6:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:39:
		// T__14
		{
			mT__14();

		}
			break;
		case 7:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:45:
		// T__15
		{
			mT__15();

		}
			break;
		case 8:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:51:
		// T__16
		{
			mT__16();

		}
			break;
		case 9:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:57:
		// T__17
		{
			mT__17();

		}
			break;
		case 10:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:63:
		// T__18
		{
			mT__18();

		}
			break;
		case 11:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:69:
		// T__19
		{
			mT__19();

		}
			break;
		case 12:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:75:
		// T__20
		{
			mT__20();

		}
			break;
		case 13:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:81:
		// T__21
		{
			mT__21();

		}
			break;
		case 14:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:87:
		// T__22
		{
			mT__22();

		}
			break;
		case 15:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:93:
		// T__23
		{
			mT__23();

		}
			break;
		case 16:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:99:
		// T__24
		{
			mT__24();

		}
			break;
		case 17:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:105:
		// T__25
		{
			mT__25();

		}
			break;
		case 18:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:111:
		// T__26
		{
			mT__26();

		}
			break;
		case 19:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:117:
		// T__27
		{
			mT__27();

		}
			break;
		case 20:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:123:
		// T__28
		{
			mT__28();

		}
			break;
		case 21:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:129:
		// BOOL
		{
			mBOOL();

		}
			break;
		case 22:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:134:
		// INTEGER
		{
			mINTEGER();

		}
			break;
		case 23:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:142:
		// IDENT
		{
			mIDENT();

		}
			break;
		case 24:
		// /Users/eloipereira/Dropbox/workspace/CE290IFall2012/src/edu/berkeley/eloi/antlr/IMP.g:1:148:
		// WS
		{
			mWS();

		}
			break;

		}

	}

}