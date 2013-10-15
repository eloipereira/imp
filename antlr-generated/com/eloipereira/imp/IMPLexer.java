// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g 2012-08-26 00:18:34

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IMPLexer extends Lexer {
    public static final int INTEGER=5;
    public static final int WS=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int NEGATION=4;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int BOOL=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;

    // delegates
    // delegators

    public IMPLexer() {;} 
    public IMPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IMPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:11:6: ( '(' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:11:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:12:6: ( ')' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:12:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:13:7: ( 'not' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:13:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:14:7: ( '-' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:15:7: ( '*' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:16:7: ( '/' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:17:7: ( 'and' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:17:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:18:7: ( 'or' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:18:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:19:7: ( '+' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:9: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:15: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:15: ( '1' .. '9' )
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:16: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:25: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:48:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:49:6: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:49:8: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:49:17: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:50:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:50:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:50:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||(LA4_0>='\f' && LA4_0<='\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | INTEGER | BOOL | WS )
        int alt5=12;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt5=1;
            }
            break;
        case ')':
            {
            alt5=2;
            }
            break;
        case 'n':
            {
            alt5=3;
            }
            break;
        case '-':
            {
            alt5=4;
            }
            break;
        case '*':
            {
            alt5=5;
            }
            break;
        case '/':
            {
            alt5=6;
            }
            break;
        case 'a':
            {
            alt5=7;
            }
            break;
        case 'o':
            {
            alt5=8;
            }
            break;
        case '+':
            {
            alt5=9;
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
            alt5=10;
            }
            break;
        case 'f':
        case 't':
            {
            alt5=11;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt5=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:62: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 11 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:70: BOOL
                {
                mBOOL(); 

                }
                break;
            case 12 :
                // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:1:75: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}