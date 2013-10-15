// $ANTLR 3.4 /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g 2012-09-25 02:19:04

  package com.eloipereira.imp;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IMPBWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public IMPBWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IMPBWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return IMPBWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g"; }


      private Map<String, Integer> variables = new HashMap<String, Integer>();
      


    public static class program_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };


    // $ANTLR start "program"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:20:1: program returns [int intResult, boolean boolResult] : (s= statement ) ;
    public final IMPBWalker.program_return program() throws RecognitionException {
        IMPBWalker.program_return retval = new IMPBWalker.program_return();
        retval.start = input.LT(1);


        IMPBWalker.statement_return s =null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:21:2: ( (s= statement ) )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:21:4: (s= statement )
            {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:21:4: (s= statement )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:21:5: s= statement
            {
            pushFollow(FOLLOW_statement_in_program63);
            s=statement();

            state._fsp--;


            retval.intResult=(s!=null?s.intResult:0); retval.boolResult=(s!=null?s.boolResult:false);

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class statement_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };


    // $ANTLR start "statement"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:24:1: statement returns [int intResult, boolean boolResult] : (e= expr |i= ifCmd | assgnCmd | whileCmd | skipCmd | printCmd );
    public final IMPBWalker.statement_return statement() throws RecognitionException {
        IMPBWalker.statement_return retval = new IMPBWalker.statement_return();
        retval.start = input.LT(1);


        IMPBWalker.expr_return e =null;

        int i =0;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:25:2: (e= expr |i= ifCmd | assgnCmd | whileCmd | skipCmd | printCmd )
            int alt1=6;
            switch ( input.LA(1) ) {
            case BOOL:
            case IDENT:
            case INTEGER:
            case NEGATION:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:25:4: e= expr
                    {
                    pushFollow(FOLLOW_expr_in_statement82);
                    e=expr();

                    state._fsp--;


                    retval.intResult=(e!=null?e.intResult:0); retval.boolResult=(e!=null?e.boolResult:false);

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:26:4: i= ifCmd
                    {
                    pushFollow(FOLLOW_ifCmd_in_statement91);
                    i=ifCmd();

                    state._fsp--;


                    retval.intResult=i;

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:27:4: assgnCmd
                    {
                    pushFollow(FOLLOW_assgnCmd_in_statement98);
                    assgnCmd();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:28:4: whileCmd
                    {
                    pushFollow(FOLLOW_whileCmd_in_statement104);
                    whileCmd();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:29:4: skipCmd
                    {
                    pushFollow(FOLLOW_skipCmd_in_statement110);
                    skipCmd();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:30:4: printCmd
                    {
                    pushFollow(FOLLOW_printCmd_in_statement115);
                    printCmd();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class expr_return extends TreeRuleReturnScope {
        public int intResult;
        public boolean boolResult;
    };


    // $ANTLR start "expr"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:34:1: expr returns [int intResult, boolean boolResult] : ( ^( 'and' op1= expr op2= expr ) | ^( 'or' op1= expr op2= expr ) | ^( 'not' op1= expr ) | ^( NEGATION op1= expr ) | ^( '+' op1= expr op2= expr ) | ^( '-' op1= expr op2= expr ) | ^( '*' op1= expr op2= expr ) | ^( '/' op1= expr op2= expr ) | ^( '=' op1= expr op2= expr ) | ^( '<' op1= expr op2= expr ) | ^( '>' op1= expr op2= expr ) | BOOL | INTEGER | IDENT );
    public final IMPBWalker.expr_return expr() throws RecognitionException {
        IMPBWalker.expr_return retval = new IMPBWalker.expr_return();
        retval.start = input.LT(1);


        CommonTree BOOL1=null;
        CommonTree INTEGER2=null;
        CommonTree IDENT3=null;
        IMPBWalker.expr_return op1 =null;

        IMPBWalker.expr_return op2 =null;


        retval.intResult =0;retval.boolResult =false;
        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:36:2: ( ^( 'and' op1= expr op2= expr ) | ^( 'or' op1= expr op2= expr ) | ^( 'not' op1= expr ) | ^( NEGATION op1= expr ) | ^( '+' op1= expr op2= expr ) | ^( '-' op1= expr op2= expr ) | ^( '*' op1= expr op2= expr ) | ^( '/' op1= expr op2= expr ) | ^( '=' op1= expr op2= expr ) | ^( '<' op1= expr op2= expr ) | ^( '>' op1= expr op2= expr ) | BOOL | INTEGER | IDENT )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case NEGATION:
                {
                alt2=4;
                }
                break;
            case 12:
                {
                alt2=5;
                }
                break;
            case 13:
                {
                alt2=6;
                }
                break;
            case 11:
                {
                alt2=7;
                }
                break;
            case 14:
                {
                alt2=8;
                }
                break;
            case 18:
                {
                alt2=9;
                }
                break;
            case 17:
                {
                alt2=10;
                }
                break;
            case 19:
                {
                alt2=11;
                }
                break;
            case BOOL:
                {
                alt2=12;
                }
                break;
            case INTEGER:
                {
                alt2=13;
                }
                break;
            case IDENT:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:36:4: ^( 'and' op1= expr op2= expr )
                    {
                    match(input,20,FOLLOW_20_in_expr136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr142);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr148);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = (op1!=null?op1.boolResult:false) && (op2!=null?op2.boolResult:false);

                    }
                    break;
                case 2 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:37:4: ^( 'or' op1= expr op2= expr )
                    {
                    match(input,23,FOLLOW_23_in_expr157); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr163);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr169);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = (op1!=null?op1.boolResult:false) || (op2!=null?op2.boolResult:false);

                    }
                    break;
                case 3 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:38:4: ^( 'not' op1= expr )
                    {
                    match(input,22,FOLLOW_22_in_expr178); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr184);
                    op1=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = !(op1!=null?op1.boolResult:false);

                    }
                    break;
                case 4 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:39:4: ^( NEGATION op1= expr )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expr193); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr199);
                    op1=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.intResult = -(op1!=null?op1.intResult:0);

                    }
                    break;
                case 5 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:40:4: ^( '+' op1= expr op2= expr )
                    {
                    match(input,12,FOLLOW_12_in_expr208); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr214);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr220);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.intResult = (op1!=null?op1.intResult:0) + (op2!=null?op2.intResult:0);

                    }
                    break;
                case 6 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:41:4: ^( '-' op1= expr op2= expr )
                    {
                    match(input,13,FOLLOW_13_in_expr229); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr235);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr241);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.intResult = (op1!=null?op1.intResult:0) - (op2!=null?op2.intResult:0);

                    }
                    break;
                case 7 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:42:4: ^( '*' op1= expr op2= expr )
                    {
                    match(input,11,FOLLOW_11_in_expr250); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr256);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr262);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.intResult = (op1!=null?op1.intResult:0) * (op2!=null?op2.intResult:0);

                    }
                    break;
                case 8 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:43:4: ^( '/' op1= expr op2= expr )
                    {
                    match(input,14,FOLLOW_14_in_expr271); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr277);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr283);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.intResult = (op1!=null?op1.intResult:0) / (op2!=null?op2.intResult:0);

                    }
                    break;
                case 9 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:44:4: ^( '=' op1= expr op2= expr )
                    {
                    match(input,18,FOLLOW_18_in_expr292); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr298);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr304);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = (op1!=null?op1.intResult:0) == (op2!=null?op2.intResult:0);

                    }
                    break;
                case 10 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:45:4: ^( '<' op1= expr op2= expr )
                    {
                    match(input,17,FOLLOW_17_in_expr313); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr319);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr325);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = (op1!=null?op1.intResult:0) < (op2!=null?op2.intResult:0);

                    }
                    break;
                case 11 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:46:4: ^( '>' op1= expr op2= expr )
                    {
                    match(input,19,FOLLOW_19_in_expr334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr340);
                    op1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr346);
                    op2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.boolResult = (op1!=null?op1.intResult:0) > (op2!=null?op2.intResult:0);

                    }
                    break;
                case 12 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:47:4: BOOL
                    {
                    BOOL1=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expr354); 

                    String b=(BOOL1!=null?BOOL1.getText():null); 
                    					if (b.equals("true")) {
                    						retval.boolResult = true;} 
                    					else if (b.equals("false")) {
                    						retval.boolResult = false;};

                    }
                    break;
                case 13 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:52:4: INTEGER
                    {
                    INTEGER2=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr361); 

                    retval.intResult = Integer.parseInt((INTEGER2!=null?INTEGER2.getText():null));

                    }
                    break;
                case 14 :
                    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:53:4: IDENT
                    {
                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expr368); 

                     retval.intResult=variables.get((IDENT3!=null?IDENT3.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"



    // $ANTLR start "ifCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:57:1: ifCmd returns [int intResult] : ^( 'if' cond= expr imp1= statement imp2= statement ) ;
    public final int ifCmd() throws RecognitionException {
        int intResult = 0;


        IMPBWalker.expr_return cond =null;

        IMPBWalker.statement_return imp1 =null;

        IMPBWalker.statement_return imp2 =null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:58:2: ( ^( 'if' cond= expr imp1= statement imp2= statement ) )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:58:4: ^( 'if' cond= expr imp1= statement imp2= statement )
            {
            match(input,21,FOLLOW_21_in_ifCmd387); 


            	Map<String, Integer> tempVar = new HashMap<String, Integer>();
            	tempVar.putAll(variables);
            	

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifCmd393);
            cond=expr();

            state._fsp--;


            pushFollow(FOLLOW_statement_in_ifCmd397);
            imp1=statement();

            state._fsp--;



            	Map<String, Integer> tempVar1 = new HashMap<String, Integer>(); 
            	tempVar1.putAll(variables);
            	variables.putAll(tempVar);
            	

            pushFollow(FOLLOW_statement_in_ifCmd403);
            imp2=statement();

            state._fsp--;


            match(input, Token.UP, null); 



            					if ((cond!=null?cond.boolResult:false)){
            							variables=tempVar1;
            							intResult=(imp1!=null?imp1.intResult:0);} 
            							else{
            							intResult=(imp2!=null?imp2.intResult:0);
            							}
            							

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return intResult;
    }
    // $ANTLR end "ifCmd"



    // $ANTLR start "whileCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:76:1: whileCmd : ^( 'while' e= . s= . ) ;
    public final void whileCmd() throws RecognitionException {
        CommonTree e=null;
        CommonTree s=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:77:2: ( ^( 'while' e= . s= . ) )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:77:4: ^( 'while' e= . s= . )
            {
            match(input,26,FOLLOW_26_in_whileCmd424); 

            int mark1 = input.mark();

            match(input, Token.DOWN, null); 
            e=(CommonTree)input.LT(1);

            matchAny(input); 

            int mark2 = input.mark();

            s=(CommonTree)input.LT(1);

            matchAny(input); 

            match(input, Token.UP, null); 



            	int end = input.mark();
            	input.rewind(mark1);
            	input.consume();
            	Boolean b = expr().boolResult;
            	
            	while (b){
            			input.rewind(mark2);	 
            			statement();
            			input.rewind(mark1);
            			input.consume();
            			b = expr().boolResult;
            	}
            	input.rewind(end);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileCmd"



    // $ANTLR start "assgnCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:94:1: assgnCmd : ^( ':=' i= id e= expr ) ;
    public final void assgnCmd() throws RecognitionException {
        String i =null;

        IMPBWalker.expr_return e =null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:95:2: ( ^( ':=' i= id e= expr ) )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:95:4: ^( ':=' i= id e= expr )
            {
            match(input,15,FOLLOW_15_in_assgnCmd451); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_id_in_assgnCmd455);
            i=id();

            state._fsp--;


            pushFollow(FOLLOW_expr_in_assgnCmd459);
            e=expr();

            state._fsp--;


            match(input, Token.UP, null); 


            variables.put(i, (e!=null?e.intResult:0));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assgnCmd"



    // $ANTLR start "id"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:98:1: id returns [String strResult] : IDENT ;
    public final String id() throws RecognitionException {
        String strResult = null;


        CommonTree IDENT4=null;

        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:99:2: ( IDENT )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:99:4: IDENT
            {
            IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_id476); 

            strResult=(IDENT4!=null?IDENT4.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return strResult;
    }
    // $ANTLR end "id"



    // $ANTLR start "skipCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:102:1: skipCmd : 'skip' ;
    public final void skipCmd() throws RecognitionException {
        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:103:2: ( 'skip' )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:103:4: 'skip'
            {
            match(input,25,FOLLOW_25_in_skipCmd489); 

            ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "skipCmd"



    // $ANTLR start "printCmd"
    // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:106:1: printCmd : ^( 'print' e= expr ) ;
    public final void printCmd() throws RecognitionException {
        IMPBWalker.expr_return e =null;


        try {
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:107:2: ( ^( 'print' e= expr ) )
            // /Users/eloipereira/Dropbox/workspace/IMP/src/com/eloipereira/imp/IMPBWalker.g:107:4: ^( 'print' e= expr )
            {
            match(input,24,FOLLOW_24_in_printCmd503); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_printCmd507);
            e=expr();

            state._fsp--;


            match(input, Token.UP, null); 


            System.out.println((e!=null?e.intResult:0));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "printCmd"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifCmd_in_statement91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgnCmd_in_statement98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileCmd_in_statement104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_skipCmd_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printCmd_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expr136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr142 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expr157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr163 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expr178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expr193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expr208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr214 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_13_in_expr229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr235 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expr250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_14_in_expr271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr277 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_18_in_expr292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_expr313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr319 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_19_in_expr334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr340 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_expr346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_in_expr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expr361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ifCmd387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifCmd393 = new BitSet(new long[]{0x0000000007FEF8F0L});
    public static final BitSet FOLLOW_statement_in_ifCmd397 = new BitSet(new long[]{0x0000000007FEF8F0L});
    public static final BitSet FOLLOW_statement_in_ifCmd403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_whileCmd424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_15_in_assgnCmd451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_assgnCmd455 = new BitSet(new long[]{0x0000000000DE78F0L});
    public static final BitSet FOLLOW_expr_in_assgnCmd459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_id476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_skipCmd489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_printCmd503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printCmd507 = new BitSet(new long[]{0x0000000000000008L});

}