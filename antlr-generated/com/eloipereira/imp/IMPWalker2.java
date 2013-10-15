// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g 2012-08-26 00:18:27

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IMPWalker2 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "INTEGER", "BOOL", "WS", "'('", "')'", "'not'", "'-'", "'*'", "'/'", "'and'", "'or'", "'+'", "BOOLEAN"
    };
    public static final int INTEGER=5;
    public static final int BOOLEAN=17;
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


        public IMPWalker2(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IMPWalker2(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return IMPWalker2.tokenNames; }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g"; }


    public static class program_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };

    // $ANTLR start "program"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:13:1: program returns [int intResult, boolean boolResult] : (aE= arithmExpr | bE= boolExpr );
    public final IMPWalker2.program_return program() throws RecognitionException {
        IMPWalker2.program_return retval = new IMPWalker2.program_return();
        retval.start = input.LT(1);

        int aE = 0;

        boolean bE = false;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:14:2: (aE= arithmExpr | bE= boolExpr )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=NEGATION && LA1_0<=INTEGER)||(LA1_0>=11 && LA1_0<=13)||LA1_0==16) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==BOOLEAN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:14:4: aE= arithmExpr
                    {
                    pushFollow(FOLLOW_arithmExpr_in_program57);
                    aE=arithmExpr();

                    state._fsp--;

                    intResult = aE;

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:14:38: bE= boolExpr
                    {
                    pushFollow(FOLLOW_boolExpr_in_program67);
                    bE=boolExpr();

                    state._fsp--;

                    boolResult = bE;

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
    // $ANTLR end "program"


    // $ANTLR start "arithmExpr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:17:1: arithmExpr returns [int intResult] : ( ^( '+' op1= arithmExpr op2= arithmExpr ) | ^( '-' op1= arithmExpr op2= arithmExpr ) | ^( '*' op1= arithmExpr op2= arithmExpr ) | ^( '/' op1= arithmExpr op2= arithmExpr ) | ^( NEGATION op1= arithmExpr ) | INTEGER );
    public final int arithmExpr() throws RecognitionException {
        int intResult = 0;

        CommonTree INTEGER1=null;
        int op1 = 0;

        int op2 = 0;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:18:2: ( ^( '+' op1= arithmExpr op2= arithmExpr ) | ^( '-' op1= arithmExpr op2= arithmExpr ) | ^( '*' op1= arithmExpr op2= arithmExpr ) | ^( '/' op1= arithmExpr op2= arithmExpr ) | ^( NEGATION op1= arithmExpr ) | INTEGER )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case NEGATION:
                {
                alt2=5;
                }
                break;
            case INTEGER:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:18:4: ^( '+' op1= arithmExpr op2= arithmExpr )
                    {
                    match(input,16,FOLLOW_16_in_arithmExpr85); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr91);
                    op1=arithmExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr97);
                    op2=arithmExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = op1 + op2;

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:19:4: ^( '-' op1= arithmExpr op2= arithmExpr )
                    {
                    match(input,11,FOLLOW_11_in_arithmExpr106); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr112);
                    op1=arithmExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr118);
                    op2=arithmExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = op1 - op2;

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:20:4: ^( '*' op1= arithmExpr op2= arithmExpr )
                    {
                    match(input,12,FOLLOW_12_in_arithmExpr127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr133);
                    op1=arithmExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr139);
                    op2=arithmExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = op1 * op2;

                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:21:4: ^( '/' op1= arithmExpr op2= arithmExpr )
                    {
                    match(input,13,FOLLOW_13_in_arithmExpr148); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr154);
                    op1=arithmExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr160);
                    op2=arithmExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = op1 / op2;

                    }
                    break;
                case 5 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:22:4: ^( NEGATION op1= arithmExpr )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_arithmExpr169); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithmExpr_in_arithmExpr175);
                    op1=arithmExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    intResult = -op1;

                    }
                    break;
                case 6 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:23:4: INTEGER
                    {
                    INTEGER1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_arithmExpr183); 
                    intResult = Integer.parseInt((INTEGER1!=null?INTEGER1.getText():null));

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
        return intResult;
    }
    // $ANTLR end "arithmExpr"


    // $ANTLR start "boolExpr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:26:1: boolExpr returns [boolean boolResult] : ( ^( 'and' exp1= boolExpr exp2= boolExpr ) | ^( 'or' exp1= boolExpr exp2= boolExpr ) | BOOLEAN );
    public final boolean boolExpr() throws RecognitionException {
        boolean boolResult = false;

        CommonTree BOOLEAN2=null;
        boolean exp1 = false;

        boolean exp2 = false;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:27:2: ( ^( 'and' exp1= boolExpr exp2= boolExpr ) | ^( 'or' exp1= boolExpr exp2= boolExpr ) | BOOLEAN )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case BOOLEAN:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:27:4: ^( 'and' exp1= boolExpr exp2= boolExpr )
                    {
                    match(input,14,FOLLOW_14_in_boolExpr201); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_boolExpr_in_boolExpr207);
                    exp1=boolExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_boolExpr_in_boolExpr213);
                    exp2=boolExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    boolResult = exp1 and exp2;

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:28:4: ^( 'or' exp1= boolExpr exp2= boolExpr )
                    {
                    match(input,15,FOLLOW_15_in_boolExpr222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_boolExpr_in_boolExpr228);
                    exp1=boolExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_boolExpr_in_boolExpr234);
                    exp2=boolExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    boolResult = exp1 or exp2;

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMPWalker2.g:29:4: BOOLEAN
                    {
                    BOOLEAN2=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolExpr242); 
                    boolResult = Boolean.getBoolean((BOOLEAN2!=null?BOOLEAN2.getText():null));

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
        return boolResult;
    }
    // $ANTLR end "boolExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_arithmExpr_in_program57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpr_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_arithmExpr85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr91 = new BitSet(new long[]{0x0000000000013830L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_arithmExpr106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr112 = new BitSet(new long[]{0x0000000000013830L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_arithmExpr127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr133 = new BitSet(new long[]{0x0000000000013830L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_arithmExpr148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr154 = new BitSet(new long[]{0x0000000000013830L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_arithmExpr169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithmExpr_in_arithmExpr175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_arithmExpr183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_boolExpr201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_boolExpr207 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_boolExpr_in_boolExpr213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_boolExpr222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_boolExpr228 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_boolExpr_in_boolExpr234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolExpr242 = new BitSet(new long[]{0x0000000000000002L});

}