// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g 2012-08-26 00:18:34

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class IMPParser extends Parser {
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

    public String[] getTokenNames() { return IMPParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:21:1: program : expr EOF ;
    public final IMPParser.program_return program() throws RecognitionException {
        IMPParser.program_return retval = new IMPParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        IMPParser.expr_return expr1 = null;


        CommonTree EOF2_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:21:8: ( expr EOF )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:21:10: expr EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_program64);
            expr1=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program66); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:24:1: term : ( INTEGER | BOOL | '(' expr ')' );
    public final IMPParser.term_return term() throws RecognitionException {
        IMPParser.term_return retval = new IMPParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER3=null;
        Token BOOL4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        IMPParser.expr_return expr6 = null;


        CommonTree INTEGER3_tree=null;
        CommonTree BOOL4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal7_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:25:2: ( INTEGER | BOOL | '(' expr ')' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt1=1;
                }
                break;
            case BOOL:
                {
                alt1=2;
                }
                break;
            case 8:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:25:3: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term76); 
                    INTEGER3_tree = (CommonTree)adaptor.create(INTEGER3);
                    adaptor.addChild(root_0, INTEGER3_tree);


                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:25:13: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOL4=(Token)match(input,BOOL,FOLLOW_BOOL_in_term80); 
                    BOOL4_tree = (CommonTree)adaptor.create(BOOL4);
                    adaptor.addChild(root_0, BOOL4_tree);


                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:25:20: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal5=(Token)match(input,8,FOLLOW_8_in_term84); 
                    pushFollow(FOLLOW_expr_in_term87);
                    expr6=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr6.getTree());
                    char_literal7=(Token)match(input,9,FOLLOW_9_in_term89); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class unaryOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:28:1: unaryOp : ( negation | 'not' )* term ;
    public final IMPParser.unaryOp_return unaryOp() throws RecognitionException {
        IMPParser.unaryOp_return retval = new IMPParser.unaryOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal9=null;
        IMPParser.negation_return negation8 = null;

        IMPParser.term_return term10 = null;


        CommonTree string_literal9_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:29:2: ( ( negation | 'not' )* term )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:29:4: ( negation | 'not' )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:29:4: ( negation | 'not' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }
                else if ( (LA2_0==10) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:29:5: negation
            	    {
            	    pushFollow(FOLLOW_negation_in_unaryOp102);
            	    negation8=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation8.getTree(), root_0);

            	    }
            	    break;
            	case 2 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:29:15: 'not'
            	    {
            	    string_literal9=(Token)match(input,10,FOLLOW_10_in_unaryOp105); 
            	    string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unaryOp110);
            term10=term();

            state._fsp--;

            adaptor.addChild(root_0, term10.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOp"

    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:32:1: negation : '-' -> NEGATION ;
    public final IMPParser.negation_return negation() throws RecognitionException {
        IMPParser.negation_return retval = new IMPParser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal11=null;

        CommonTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:33:2: ( '-' -> NEGATION )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:33:4: '-'
            {
            char_literal11=(Token)match(input,11,FOLLOW_11_in_negation120);  
            stream_11.add(char_literal11);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 33:8: -> NEGATION
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negation"

    public static class multOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multOp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:36:1: multOp : unaryOp ( ( '*' | '/' | 'and' | 'or' ) unaryOp )* ;
    public final IMPParser.multOp_return multOp() throws RecognitionException {
        IMPParser.multOp_return retval = new IMPParser.multOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        IMPParser.unaryOp_return unaryOp12 = null;

        IMPParser.unaryOp_return unaryOp17 = null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree string_literal16_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:2: ( unaryOp ( ( '*' | '/' | 'and' | 'or' ) unaryOp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:4: unaryOp ( ( '*' | '/' | 'and' | 'or' ) unaryOp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryOp_in_multOp134);
            unaryOp12=unaryOp();

            state._fsp--;

            adaptor.addChild(root_0, unaryOp12.getTree());
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:12: ( ( '*' | '/' | 'and' | 'or' ) unaryOp )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:13: ( '*' | '/' | 'and' | 'or' ) unaryOp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:13: ( '*' | '/' | 'and' | 'or' )
            	    int alt3=4;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:14: '*'
            	            {
            	            char_literal13=(Token)match(input,12,FOLLOW_12_in_multOp138); 
            	            char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:21: '/'
            	            {
            	            char_literal14=(Token)match(input,13,FOLLOW_13_in_multOp143); 
            	            char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:28: 'and'
            	            {
            	            string_literal15=(Token)match(input,14,FOLLOW_14_in_multOp148); 
            	            string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:37:37: 'or'
            	            {
            	            string_literal16=(Token)match(input,15,FOLLOW_15_in_multOp153); 
            	            string_literal16_tree = (CommonTree)adaptor.create(string_literal16);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal16_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryOp_in_multOp157);
            	    unaryOp17=unaryOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryOp17.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multOp"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:40:1: expr : multOp ( ( '+' | '-' ) multOp )* ;
    public final IMPParser.expr_return expr() throws RecognitionException {
        IMPParser.expr_return retval = new IMPParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal19=null;
        Token char_literal20=null;
        IMPParser.multOp_return multOp18 = null;

        IMPParser.multOp_return multOp21 = null;


        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:2: ( multOp ( ( '+' | '-' ) multOp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:4: multOp ( ( '+' | '-' ) multOp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multOp_in_expr169);
            multOp18=multOp();

            state._fsp--;

            adaptor.addChild(root_0, multOp18.getTree());
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:11: ( ( '+' | '-' ) multOp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11||LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:12: ( '+' | '-' ) multOp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:12: ( '+' | '-' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==16) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==11) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:13: '+'
            	            {
            	            char_literal19=(Token)match(input,16,FOLLOW_16_in_expr173); 
            	            char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal19_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/old/IMP.g:41:20: '-'
            	            {
            	            char_literal20=(Token)match(input,11,FOLLOW_11_in_expr178); 
            	            char_literal20_tree = (CommonTree)adaptor.create(char_literal20);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multOp_in_expr182);
            	    multOp21=multOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multOp21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_program64 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_term84 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_expr_in_term87 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_term89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negation_in_unaryOp102 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_10_in_unaryOp105 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_term_in_unaryOp110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_negation120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOp_in_multOp134 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_12_in_multOp138 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_13_in_multOp143 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_14_in_multOp148 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_15_in_multOp153 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_unaryOp_in_multOp157 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_multOp_in_expr169 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_16_in_expr173 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_11_in_expr178 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_multOp_in_expr182 = new BitSet(new long[]{0x0000000000010802L});

}