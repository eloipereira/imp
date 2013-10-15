// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g 2012-09-25 02:22:44

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IMPBLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int BOOL=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int NEGATION=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public IMPBLexer() {} 
    public IMPBLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IMPBLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:11:6: ( '(' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:11:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:12:7: ( ')' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:13:7: ( '*' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:14:7: ( '+' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:15:7: ( '-' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:16:7: ( '/' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:17:7: ( ':=' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:17:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:18:7: ( ';' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:19:7: ( '<' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:20:7: ( '=' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:7: ( '>' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:22:7: ( 'and' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:22:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:7: ( 'if' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:24:7: ( 'not' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:24:9: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:7: ( 'or' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:26:7: ( 'print' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:26:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:7: ( 'skip' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:9: 'skip'
            {
            match("skip"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:28:7: ( 'while' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:28:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:29:7: ( '{' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:30:7: ( '} else {' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:30:9: '} else {'
            {
            match("} else {"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:7: ( '}' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:53:6: ( ( 'A' .. 'Z' ) ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:53:8: ( 'A' .. 'Z' ) ( '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:53:19: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:53:31: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:54:9: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:54:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:54:15: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:54:25: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:55:6: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:55:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:55:17: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:56:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:56:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:56:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | IDENT | INTEGER | BOOL | WS )
        int alt7=25;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt7=1;
            }
            break;
        case ')':
            {
            alt7=2;
            }
            break;
        case '*':
            {
            alt7=3;
            }
            break;
        case '+':
            {
            alt7=4;
            }
            break;
        case '-':
            {
            alt7=5;
            }
            break;
        case '/':
            {
            alt7=6;
            }
            break;
        case ':':
            {
            alt7=7;
            }
            break;
        case ';':
            {
            alt7=8;
            }
            break;
        case '<':
            {
            alt7=9;
            }
            break;
        case '=':
            {
            alt7=10;
            }
            break;
        case '>':
            {
            alt7=11;
            }
            break;
        case 'a':
            {
            alt7=12;
            }
            break;
        case 'i':
            {
            alt7=13;
            }
            break;
        case 'n':
            {
            alt7=14;
            }
            break;
        case 'o':
            {
            alt7=15;
            }
            break;
        case 'p':
            {
            alt7=16;
            }
            break;
        case 's':
            {
            alt7=17;
            }
            break;
        case 'w':
            {
            alt7=18;
            }
            break;
        case '{':
            {
            alt7=19;
            }
            break;
        case '}':
            {
            int LA7_20 = input.LA(2);

            if ( (LA7_20==' ') ) {
                alt7=20;
            }
            else {
                alt7=21;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt7=22;
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
        case '9':
            {
            alt7=23;
            }
            break;
        case 'f':
        case 't':
            {
            alt7=24;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt7=25;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:135: IDENT
                {
                mIDENT(); 


                }
                break;
            case 23 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:141: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 24 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:149: BOOL
                {
                mBOOL(); 


                }
                break;
            case 25 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:1:154: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}