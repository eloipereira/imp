// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g 2012-08-26 00:18:30

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IMPWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "INTEGER", "BOOL", "WS", "'('", "')'", "'not'", "'-'", "'*'", "'/'", "'and'", "'or'", "'+'"
    };
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


        public IMPWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IMPWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return IMPWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g"; }


    public static class program_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };

    // $ANTLR start "program"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:13:1: program returns [int intResult, boolean boolResult] : e= expr ;
    public final IMPWalker.program_return program() throws RecognitionException {
        IMPWalker.program_return retval = new IMPWalker.program_return();
        retval.start = input.LT(1);

        IMPWalker.expr_return e = null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:14:2: (e= expr )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:14:4: e= expr
            {
            pushFollow(FOLLOW_expr_in_program57);
            e=expr();

            state._fsp--;

            intResult=(e!=null?e.intResult:0); boolResult=(e!=null?e.boolResult:false);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class expr_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };

    // $ANTLR start "expr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:17:1: expr returns [int intResult, boolean boolResult] : ( ^( '+' op1= expr op2= expr ) | ^( '-' op1= expr op2= expr ) | ^( '*' op1= expr op2= expr ) | ^( '/' op1= expr op2= expr ) | ^( NEGATION op1= expr ) | INTEGER | ^( 'and' op1= expr op2= expr ) | ^( 'or' op1= expr op2= expr ) | ^( 'not' op1= expr ) | BOOL );
    public final IMPWalker.expr_return expr() throws RecognitionException {
        IMPWalker.expr_return retval = new IMPWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree INTEGER1=null;
        CommonTree BOOL2=null;
        IMPWalker.expr_return op1 = null;

        IMPWalker.expr_return op2 = null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:18:2: ( ^( '+' op1= expr op2= expr ) | ^( '-' op1= expr op2= expr ) | ^( '*' op1= expr op2= expr ) | ^( '/' op1= expr op2= expr ) | ^( NEGATION op1= expr ) | INTEGER | ^( 'and' op1= expr op2= expr ) | ^( 'or' op1= expr op2= expr ) | ^( 'not' op1= expr ) | BOOL )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case NEGATION:
                {
                alt1=5;
                }
                break;
            case INTEGER:
                {
                alt1=6;
                }
                break;
            case 14:
                {
                alt1=7;
                }
                break;
            case 15:
                {
                alt1=8;
                }
                break;
            case 10:
                {
                alt1=9;
                }
                break;
            case BOOL:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:18:4: ^( '+' op1= expr op2= expr )
                    {
                    match(input,16,FOLLOW_16_in_expr75); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr81);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr87);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = (op1!=null?op1.intResult:0) + (op2!=null?op2.intResult:0);

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:19:4: ^( '-' op1= expr op2= expr )
                    {
                    match(input,11,FOLLOW_11_in_expr96); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr102);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr108);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = (op1!=null?op1.intResult:0) - (op2!=null?op2.intResult:0);

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:20:4: ^( '*' op1= expr op2= expr )
                    {
                    match(input,12,FOLLOW_12_in_expr117); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr123);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr129);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = (op1!=null?op1.intResult:0) * (op2!=null?op2.intResult:0);

                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:21:4: ^( '/' op1= expr op2= expr )
                    {
                    match(input,13,FOLLOW_13_in_expr138); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr144);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr150);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = (op1!=null?op1.intResult:0) / (op2!=null?op2.intResult:0);

                    }
                    break;
                case 5 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:22:4: ^( NEGATION op1= expr )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expr159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr165);
                    op1=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = -(op1!=null?op1.intResult:0);

                    }
                    break;
                case 6 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:23:4: INTEGER
                    {
                    INTEGER1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr173); 
                    intResult = Integer.parseInt((INTEGER1!=null?INTEGER1.getText():null));

                    }
                    break;
                case 7 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:24:4: ^( 'and' op1= expr op2= expr )
                    {
                    match(input,14,FOLLOW_14_in_expr181); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr187);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr193);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    boolResult = (op1!=null?op1.boolResult:false) && (op2!=null?op2.boolResult:false);

                    }
                    break;
                case 8 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:25:4: ^( 'or' op1= expr op2= expr )
                    {
                    match(input,15,FOLLOW_15_in_expr202); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr208);
                    op1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr214);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    boolResult = (op1!=null?op1.boolResult:false) || (op2!=null?op2.boolResult:false);

                    }
                    break;
                case 9 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:26:4: ^( 'not' op1= expr )
                    {
                    match(input,10,FOLLOW_10_in_expr223); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr229);
                    op1=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    boolResult = -(op1!=null?op1.boolResult:false);

                    }
                    break;
                case 10 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker.g:27:4: BOOL
                    {
                    BOOL2=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expr237); 
                    String b=(BOOL2!=null?BOOL2.getText():null); 
                    	if (b.equals("true")) {boolResult = true;} else if (b.equals("false")) {boolResult = false;};

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_program57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expr75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr81 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expr96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr102 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expr117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr123 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_expr138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr144 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expr159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_expr173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expr181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr187 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_expr202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x000000000001FC70L});
    public static final BitSet FOLLOW_expr_in_expr214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_10_in_expr223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_in_expr237 = new BitSet(new long[]{0x0000000000000002L});

}