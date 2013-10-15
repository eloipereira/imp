// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g 2012-09-25 02:22:44

  package com.eloipereira.imp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class IMPBParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "IDENT", "INTEGER", "NEGATION", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':='", "';'", "'<'", "'='", "'>'", "'and'", "'if'", "'not'", "'or'", "'print'", "'skip'", "'while'", "'{'", "'} else {'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public IMPBParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public IMPBParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return IMPBParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:1: program : ( statement )+ EOF !;
    public final IMPBParser.program_return program() throws RecognitionException {
        IMPBParser.program_return retval = new IMPBParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        IMPBParser.statement_return statement1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:8: ( ( statement )+ EOF !)
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:10: ( statement )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:10: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= BOOL && LA1_0 <= INTEGER)||LA1_0==9||LA1_0==13||(LA1_0 >= 21 && LA1_0 <= 22)||(LA1_0 >= 24 && LA1_0 <= 26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:21:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program64);
            	    statement1=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program67); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:1: statement : ( expr | ifCmd | whileCmd | assgnCmd | skipCmd | printCmd ) ';' !;
    public final IMPBParser.statement_return statement() throws RecognitionException {
        IMPBParser.statement_return retval = new IMPBParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal9=null;
        IMPBParser.expr_return expr3 =null;

        IMPBParser.ifCmd_return ifCmd4 =null;

        IMPBParser.whileCmd_return whileCmd5 =null;

        IMPBParser.assgnCmd_return assgnCmd6 =null;

        IMPBParser.skipCmd_return skipCmd7 =null;

        IMPBParser.printCmd_return printCmd8 =null;


        CommonTree char_literal9_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:10: ( ( expr | ifCmd | whileCmd | assgnCmd | skipCmd | printCmd ) ';' !)
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:12: ( expr | ifCmd | whileCmd | assgnCmd | skipCmd | printCmd ) ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:12: ( expr | ifCmd | whileCmd | assgnCmd | skipCmd | printCmd )
            int alt2=6;
            switch ( input.LA(1) ) {
            case BOOL:
            case INTEGER:
            case 9:
            case 13:
            case 22:
                {
                alt2=1;
                }
                break;
            case IDENT:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2 >= 11 && LA2_2 <= 14)||(LA2_2 >= 16 && LA2_2 <= 20)||LA2_2==23) ) {
                    alt2=1;
                }
                else if ( (LA2_2==15) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 24:
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
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:13: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement76);
                    expr3=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:20: ifCmd
                    {
                    pushFollow(FOLLOW_ifCmd_in_statement80);
                    ifCmd4=ifCmd();

                    state._fsp--;

                    adaptor.addChild(root_0, ifCmd4.getTree());

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:28: whileCmd
                    {
                    pushFollow(FOLLOW_whileCmd_in_statement84);
                    whileCmd5=whileCmd();

                    state._fsp--;

                    adaptor.addChild(root_0, whileCmd5.getTree());

                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:39: assgnCmd
                    {
                    pushFollow(FOLLOW_assgnCmd_in_statement88);
                    assgnCmd6=assgnCmd();

                    state._fsp--;

                    adaptor.addChild(root_0, assgnCmd6.getTree());

                    }
                    break;
                case 5 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:50: skipCmd
                    {
                    pushFollow(FOLLOW_skipCmd_in_statement92);
                    skipCmd7=skipCmd();

                    state._fsp--;

                    adaptor.addChild(root_0, skipCmd7.getTree());

                    }
                    break;
                case 6 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:23:60: printCmd
                    {
                    pushFollow(FOLLOW_printCmd_in_statement96);
                    printCmd8=printCmd();

                    state._fsp--;

                    adaptor.addChild(root_0, printCmd8.getTree());

                    }
                    break;

            }


            char_literal9=(Token)match(input,16,FOLLOW_16_in_statement99); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:1: term : ( INTEGER | BOOL | IDENT | '(' ! expr ')' !);
    public final IMPBParser.term_return term() throws RecognitionException {
        IMPBParser.term_return retval = new IMPBParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INTEGER10=null;
        Token BOOL11=null;
        Token IDENT12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        IMPBParser.expr_return expr14 =null;


        CommonTree INTEGER10_tree=null;
        CommonTree BOOL11_tree=null;
        CommonTree IDENT12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:5: ( INTEGER | BOOL | IDENT | '(' ! expr ')' !)
            int alt3=4;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt3=1;
                }
                break;
            case BOOL:
                {
                alt3=2;
                }
                break;
            case IDENT:
                {
                alt3=3;
                }
                break;
            case 9:
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
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:7: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INTEGER10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term107); 
                    INTEGER10_tree = 
                    (CommonTree)adaptor.create(INTEGER10)
                    ;
                    adaptor.addChild(root_0, INTEGER10_tree);


                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:17: BOOL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOL11=(Token)match(input,BOOL,FOLLOW_BOOL_in_term111); 
                    BOOL11_tree = 
                    (CommonTree)adaptor.create(BOOL11)
                    ;
                    adaptor.addChild(root_0, BOOL11_tree);


                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:24: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_term115); 
                    IDENT12_tree = 
                    (CommonTree)adaptor.create(IDENT12)
                    ;
                    adaptor.addChild(root_0, IDENT12_tree);


                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:25:32: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal13=(Token)match(input,9,FOLLOW_9_in_term119); 

                    pushFollow(FOLLOW_expr_in_term122);
                    expr14=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr14.getTree());

                    char_literal15=(Token)match(input,10,FOLLOW_10_in_term124); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class unaryOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryOp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:1: unaryOp : ( negation ^| 'not' ^)* term ;
    public final IMPBParser.unaryOp_return unaryOp() throws RecognitionException {
        IMPBParser.unaryOp_return retval = new IMPBParser.unaryOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal17=null;
        IMPBParser.negation_return negation16 =null;

        IMPBParser.term_return term18 =null;


        CommonTree string_literal17_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:8: ( ( negation ^| 'not' ^)* term )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:10: ( negation ^| 'not' ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:10: ( negation ^| 'not' ^)*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }
                else if ( (LA4_0==22) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:11: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unaryOp133);
            	    negation16=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation16.getTree(), root_0);

            	    }
            	    break;
            	case 2 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:27:21: 'not' ^
            	    {
            	    string_literal17=(Token)match(input,22,FOLLOW_22_in_unaryOp136); 
            	    string_literal17_tree = 
            	    (CommonTree)adaptor.create(string_literal17)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal17_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_unaryOp141);
            term18=term();

            state._fsp--;

            adaptor.addChild(root_0, term18.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryOp"


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:29:1: negation : '-' -> NEGATION ;
    public final IMPBParser.negation_return negation() throws RecognitionException {
        IMPBParser.negation_return retval = new IMPBParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;

        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:29:9: ( '-' -> NEGATION )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:29:11: '-'
            {
            char_literal19=(Token)match(input,13,FOLLOW_13_in_negation148);  
            stream_13.add(char_literal19);


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
            // 29:15: -> NEGATION
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NEGATION, "NEGATION")
                );

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negation"


    public static class multOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multOp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:1: multOp : unaryOp ( ( '*' ^| '/' ^) unaryOp )* ;
    public final IMPBParser.multOp_return multOp() throws RecognitionException {
        IMPBParser.multOp_return retval = new IMPBParser.multOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal21=null;
        Token char_literal22=null;
        IMPBParser.unaryOp_return unaryOp20 =null;

        IMPBParser.unaryOp_return unaryOp23 =null;


        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:7: ( unaryOp ( ( '*' ^| '/' ^) unaryOp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:9: unaryOp ( ( '*' ^| '/' ^) unaryOp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryOp_in_multOp159);
            unaryOp20=unaryOp();

            state._fsp--;

            adaptor.addChild(root_0, unaryOp20.getTree());

            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:17: ( ( '*' ^| '/' ^) unaryOp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:18: ( '*' ^| '/' ^) unaryOp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:18: ( '*' ^| '/' ^)
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==11) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==14) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:19: '*' ^
            	            {
            	            char_literal21=(Token)match(input,11,FOLLOW_11_in_multOp163); 
            	            char_literal21_tree = 
            	            (CommonTree)adaptor.create(char_literal21)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal21_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:31:26: '/' ^
            	            {
            	            char_literal22=(Token)match(input,14,FOLLOW_14_in_multOp168); 
            	            char_literal22_tree = 
            	            (CommonTree)adaptor.create(char_literal22)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal22_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unaryOp_in_multOp172);
            	    unaryOp23=unaryOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryOp23.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multOp"


    public static class addOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addOp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:1: addOp : multOp ( ( '+' ^| '-' ^) multOp )* ;
    public final IMPBParser.addOp_return addOp() throws RecognitionException {
        IMPBParser.addOp_return retval = new IMPBParser.addOp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal25=null;
        Token char_literal26=null;
        IMPBParser.multOp_return multOp24 =null;

        IMPBParser.multOp_return multOp27 =null;


        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:6: ( multOp ( ( '+' ^| '-' ^) multOp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:8: multOp ( ( '+' ^| '-' ^) multOp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multOp_in_addOp181);
            multOp24=multOp();

            state._fsp--;

            adaptor.addChild(root_0, multOp24.getTree());

            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:15: ( ( '+' ^| '-' ^) multOp )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= 12 && LA8_0 <= 13)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:16: ( '+' ^| '-' ^) multOp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:16: ( '+' ^| '-' ^)
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==12) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==13) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:17: '+' ^
            	            {
            	            char_literal25=(Token)match(input,12,FOLLOW_12_in_addOp185); 
            	            char_literal25_tree = 
            	            (CommonTree)adaptor.create(char_literal25)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:33:24: '-' ^
            	            {
            	            char_literal26=(Token)match(input,13,FOLLOW_13_in_addOp190); 
            	            char_literal26_tree = 
            	            (CommonTree)adaptor.create(char_literal26)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multOp_in_addOp194);
            	    multOp27=multOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multOp27.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addOp"


    public static class comp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comp"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:1: comp : addOp ( ( '=' ^| '<' ^| '>' ^) addOp )* ;
    public final IMPBParser.comp_return comp() throws RecognitionException {
        IMPBParser.comp_return retval = new IMPBParser.comp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        IMPBParser.addOp_return addOp28 =null;

        IMPBParser.addOp_return addOp32 =null;


        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:5: ( addOp ( ( '=' ^| '<' ^| '>' ^) addOp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:7: addOp ( ( '=' ^| '<' ^| '>' ^) addOp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_addOp_in_comp203);
            addOp28=addOp();

            state._fsp--;

            adaptor.addChild(root_0, addOp28.getTree());

            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:13: ( ( '=' ^| '<' ^| '>' ^) addOp )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= 17 && LA10_0 <= 19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:14: ( '=' ^| '<' ^| '>' ^) addOp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:14: ( '=' ^| '<' ^| '>' ^)
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:15: '=' ^
            	            {
            	            char_literal29=(Token)match(input,18,FOLLOW_18_in_comp207); 
            	            char_literal29_tree = 
            	            (CommonTree)adaptor.create(char_literal29)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal29_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:20: '<' ^
            	            {
            	            char_literal30=(Token)match(input,17,FOLLOW_17_in_comp210); 
            	            char_literal30_tree = 
            	            (CommonTree)adaptor.create(char_literal30)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:35:25: '>' ^
            	            {
            	            char_literal31=(Token)match(input,19,FOLLOW_19_in_comp213); 
            	            char_literal31_tree = 
            	            (CommonTree)adaptor.create(char_literal31)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal31_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addOp_in_comp217);
            	    addOp32=addOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addOp32.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comp"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:1: expr : comp ( ( 'and' ^| 'or' ^) comp )* ;
    public final IMPBParser.expr_return expr() throws RecognitionException {
        IMPBParser.expr_return retval = new IMPBParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal34=null;
        Token string_literal35=null;
        IMPBParser.comp_return comp33 =null;

        IMPBParser.comp_return comp36 =null;


        CommonTree string_literal34_tree=null;
        CommonTree string_literal35_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:5: ( comp ( ( 'and' ^| 'or' ^) comp )* )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:7: comp ( ( 'and' ^| 'or' ^) comp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_comp_in_expr226);
            comp33=comp();

            state._fsp--;

            adaptor.addChild(root_0, comp33.getTree());

            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:12: ( ( 'and' ^| 'or' ^) comp )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20||LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:13: ( 'and' ^| 'or' ^) comp
            	    {
            	    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:13: ( 'and' ^| 'or' ^)
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==20) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==23) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:14: 'and' ^
            	            {
            	            string_literal34=(Token)match(input,20,FOLLOW_20_in_expr230); 
            	            string_literal34_tree = 
            	            (CommonTree)adaptor.create(string_literal34)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal34_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:37:23: 'or' ^
            	            {
            	            string_literal35=(Token)match(input,23,FOLLOW_23_in_expr235); 
            	            string_literal35_tree = 
            	            (CommonTree)adaptor.create(string_literal35)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal35_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_comp_in_expr239);
            	    comp36=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp36.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class ifCmd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:39:1: ifCmd : 'if' ^ '(' ! expr ')' ! '{' ! statement '} else {' ! statement '}' !;
    public final IMPBParser.ifCmd_return ifCmd() throws RecognitionException {
        IMPBParser.ifCmd_return retval = new IMPBParser.ifCmd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token string_literal43=null;
        Token char_literal45=null;
        IMPBParser.expr_return expr39 =null;

        IMPBParser.statement_return statement42 =null;

        IMPBParser.statement_return statement44 =null;


        CommonTree string_literal37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:39:6: ( 'if' ^ '(' ! expr ')' ! '{' ! statement '} else {' ! statement '}' !)
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:39:8: 'if' ^ '(' ! expr ')' ! '{' ! statement '} else {' ! statement '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal37=(Token)match(input,21,FOLLOW_21_in_ifCmd248); 
            string_literal37_tree = 
            (CommonTree)adaptor.create(string_literal37)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal37_tree, root_0);


            char_literal38=(Token)match(input,9,FOLLOW_9_in_ifCmd251); 

            pushFollow(FOLLOW_expr_in_ifCmd254);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            char_literal40=(Token)match(input,10,FOLLOW_10_in_ifCmd256); 

            char_literal41=(Token)match(input,27,FOLLOW_27_in_ifCmd259); 

            pushFollow(FOLLOW_statement_in_ifCmd262);
            statement42=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement42.getTree());

            string_literal43=(Token)match(input,28,FOLLOW_28_in_ifCmd264); 

            pushFollow(FOLLOW_statement_in_ifCmd267);
            statement44=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement44.getTree());

            char_literal45=(Token)match(input,29,FOLLOW_29_in_ifCmd269); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifCmd"


    public static class whileCmd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:41:1: whileCmd : 'while' ^ '(' ! expr ')' ! '{' ! statement '}' !;
    public final IMPBParser.whileCmd_return whileCmd() throws RecognitionException {
        IMPBParser.whileCmd_return retval = new IMPBParser.whileCmd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        IMPBParser.expr_return expr48 =null;

        IMPBParser.statement_return statement51 =null;


        CommonTree string_literal46_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal52_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:41:9: ( 'while' ^ '(' ! expr ')' ! '{' ! statement '}' !)
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:41:11: 'while' ^ '(' ! expr ')' ! '{' ! statement '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal46=(Token)match(input,26,FOLLOW_26_in_whileCmd277); 
            string_literal46_tree = 
            (CommonTree)adaptor.create(string_literal46)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);


            char_literal47=(Token)match(input,9,FOLLOW_9_in_whileCmd280); 

            pushFollow(FOLLOW_expr_in_whileCmd283);
            expr48=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr48.getTree());

            char_literal49=(Token)match(input,10,FOLLOW_10_in_whileCmd285); 

            char_literal50=(Token)match(input,27,FOLLOW_27_in_whileCmd288); 

            pushFollow(FOLLOW_statement_in_whileCmd291);
            statement51=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement51.getTree());

            char_literal52=(Token)match(input,29,FOLLOW_29_in_whileCmd293); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileCmd"


    public static class assgnCmd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assgnCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:43:1: assgnCmd : id ':=' ^ expr ;
    public final IMPBParser.assgnCmd_return assgnCmd() throws RecognitionException {
        IMPBParser.assgnCmd_return retval = new IMPBParser.assgnCmd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal54=null;
        IMPBParser.id_return id53 =null;

        IMPBParser.expr_return expr55 =null;


        CommonTree string_literal54_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:43:9: ( id ':=' ^ expr )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:43:11: id ':=' ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_id_in_assgnCmd304);
            id53=id();

            state._fsp--;

            adaptor.addChild(root_0, id53.getTree());

            string_literal54=(Token)match(input,15,FOLLOW_15_in_assgnCmd306); 
            string_literal54_tree = 
            (CommonTree)adaptor.create(string_literal54)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal54_tree, root_0);


            pushFollow(FOLLOW_expr_in_assgnCmd309);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assgnCmd"


    public static class id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:45:1: id : IDENT ;
    public final IMPBParser.id_return id() throws RecognitionException {
        IMPBParser.id_return retval = new IMPBParser.id_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT56=null;

        CommonTree IDENT56_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:45:3: ( IDENT )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:45:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_id316); 
            IDENT56_tree = 
            (CommonTree)adaptor.create(IDENT56)
            ;
            adaptor.addChild(root_0, IDENT56_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class skipCmd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skipCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:47:1: skipCmd : 'skip' ;
    public final IMPBParser.skipCmd_return skipCmd() throws RecognitionException {
        IMPBParser.skipCmd_return retval = new IMPBParser.skipCmd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;

        CommonTree string_literal57_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:47:8: ( 'skip' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:47:10: 'skip'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal57=(Token)match(input,25,FOLLOW_25_in_skipCmd323); 
            string_literal57_tree = 
            (CommonTree)adaptor.create(string_literal57)
            ;
            adaptor.addChild(root_0, string_literal57_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "skipCmd"


    public static class printCmd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:49:1: printCmd : 'print' ^ '(' ! expr ')' !;
    public final IMPBParser.printCmd_return printCmd() throws RecognitionException {
        IMPBParser.printCmd_return retval = new IMPBParser.printCmd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        IMPBParser.expr_return expr60 =null;


        CommonTree string_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal61_tree=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:49:9: ( 'print' ^ '(' ! expr ')' !)
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPB.g:49:11: 'print' ^ '(' ! expr ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal58=(Token)match(input,24,FOLLOW_24_in_printCmd330); 
            string_literal58_tree = 
            (CommonTree)adaptor.create(string_literal58)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);


            char_literal59=(Token)match(input,9,FOLLOW_9_in_printCmd333); 

            pushFollow(FOLLOW_expr_in_printCmd336);
            expr60=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr60.getTree());

            char_literal61=(Token)match(input,10,FOLLOW_10_in_printCmd338); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printCmd"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program64 = new BitSet(new long[]{0x0000000007602270L});
    public static final BitSet FOLLOW_EOF_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement76 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ifCmd_in_statement80 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_whileCmd_in_statement84 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_assgnCmd_in_statement88 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_skipCmd_in_statement92 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_printCmd_in_statement96 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_statement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_term119 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_expr_in_term122 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_term124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negation_in_unaryOp133 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_22_in_unaryOp136 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_term_in_unaryOp141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_negation148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOp_in_multOp159 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_11_in_multOp163 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_14_in_multOp168 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_unaryOp_in_multOp172 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_multOp_in_addOp181 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_addOp185 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_13_in_addOp190 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_multOp_in_addOp194 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_addOp_in_comp203 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_18_in_comp207 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_17_in_comp210 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_19_in_comp213 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_addOp_in_comp217 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_comp_in_expr226 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_20_in_expr230 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_23_in_expr235 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_comp_in_expr239 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_21_in_ifCmd248 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ifCmd251 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_expr_in_ifCmd254 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifCmd256 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ifCmd259 = new BitSet(new long[]{0x0000000007602270L});
    public static final BitSet FOLLOW_statement_in_ifCmd262 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifCmd264 = new BitSet(new long[]{0x0000000007602270L});
    public static final BitSet FOLLOW_statement_in_ifCmd267 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifCmd269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_whileCmd277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_whileCmd280 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_expr_in_whileCmd283 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whileCmd285 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_whileCmd288 = new BitSet(new long[]{0x0000000007602270L});
    public static final BitSet FOLLOW_statement_in_whileCmd291 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_whileCmd293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assgnCmd304 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_assgnCmd306 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_expr_in_assgnCmd309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_id316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_skipCmd323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_printCmd330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_printCmd333 = new BitSet(new long[]{0x0000000000402270L});
    public static final BitSet FOLLOW_expr_in_printCmd336 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_printCmd338 = new BitSet(new long[]{0x0000000000000002L});

}