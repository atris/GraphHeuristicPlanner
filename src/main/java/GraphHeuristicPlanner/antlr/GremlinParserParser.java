// $ANTLR 3.4 GremlinParser.g 2018-12-21 23:27:25
package GraphHeuristicPlanner.antlr;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GremlinParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ARGS", "ARR", "BLOCK", "BOOL", "BOOLEAN", "COLLECTION_CALL", "COMMENT", "COND", "CharacterEscapeSequence", "DOUBLE", "DecimalDigit", "DoubleStringCharacter", "ELSE", "EscapeCharacter", "EscapeSequence", "FLOAT", "FOREACH", "FUNC", "FUNC_CALL", "FUNC_NAME", "GPATH", "G_DOUBLE", "G_FLOAT", "G_INT", "G_LONG", "HISTORY", "HexDigit", "HexEscapeSequence", "IDENTIFIER", "IF", "INCLUDE", "INT", "LONG", "NAME", "NEWLINE", "NS", "NULL", "NonEscapeCharacter", "PATH", "PREDICATE", "PREDICATES", "PROPERTY", "PROPERTY_CALL", "RANGE", "REPEAT", "SCRIPT", "SELF", "STEP", "STR", "SingleEscapeCharacter", "SingleStringCharacter", "StringLiteral", "TOKEN", "UnicodeEscapeSequence", "VAR", "VARIABLE", "VARIABLE_CALL", "WHILE", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'..'", "'/'", "':'", "':='", "'<'", "'<='", "'='", "'>'", "'>='", "'['", "']'", "'and'", "'div'", "'else'", "'end'", "'foreach'", "'func'", "'if'", "'in'", "'include'", "'mod'", "'or'", "'path'", "'repeat'", "'script'", "'while'"
    };

    public static final int EOF=-1;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int ARG=4;
    public static final int ARGS=5;
    public static final int ARR=6;
    public static final int BLOCK=7;
    public static final int BOOL=8;
    public static final int BOOLEAN=9;
    public static final int COLLECTION_CALL=10;
    public static final int COMMENT=11;
    public static final int COND=12;
    public static final int CharacterEscapeSequence=13;
    public static final int DOUBLE=14;
    public static final int DecimalDigit=15;
    public static final int DoubleStringCharacter=16;
    public static final int ELSE=17;
    public static final int EscapeCharacter=18;
    public static final int EscapeSequence=19;
    public static final int FLOAT=20;
    public static final int FOREACH=21;
    public static final int FUNC=22;
    public static final int FUNC_CALL=23;
    public static final int FUNC_NAME=24;
    public static final int GPATH=25;
    public static final int G_DOUBLE=26;
    public static final int G_FLOAT=27;
    public static final int G_INT=28;
    public static final int G_LONG=29;
    public static final int HISTORY=30;
    public static final int HexDigit=31;
    public static final int HexEscapeSequence=32;
    public static final int IDENTIFIER=33;
    public static final int IF=34;
    public static final int INCLUDE=35;
    public static final int INT=36;
    public static final int LONG=37;
    public static final int NAME=38;
    public static final int NEWLINE=39;
    public static final int NS=40;
    public static final int NULL=41;
    public static final int NonEscapeCharacter=42;
    public static final int PATH=43;
    public static final int PREDICATE=44;
    public static final int PREDICATES=45;
    public static final int PROPERTY=46;
    public static final int PROPERTY_CALL=47;
    public static final int RANGE=48;
    public static final int REPEAT=49;
    public static final int SCRIPT=50;
    public static final int SELF=51;
    public static final int STEP=52;
    public static final int STR=53;
    public static final int SingleEscapeCharacter=54;
    public static final int SingleStringCharacter=55;
    public static final int StringLiteral=56;
    public static final int TOKEN=57;
    public static final int UnicodeEscapeSequence=58;
    public static final int VAR=59;
    public static final int VARIABLE=60;
    public static final int VARIABLE_CALL=61;
    public static final int WHILE=62;
    public static final int WS=63;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GremlinParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GremlinParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GremlinParserParser.tokenNames; }
    public String getGrammarFileName() { return "GraphHeuristicPlanner/antlr/GremlinParser.g"; }


                /* ANTLR guys by default just print exceptions into System.err, we don't need that */
                public void reportError(RecognitionException e) {
                    throw new RuntimeException("Syntax error at " + e.line + "-" + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames()));
                }
            

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // GremlinParser.g:82:1: program : ( ( COMMENT )+ | ( ( statement )? NEWLINE )+ );
    public final GremlinParserParser.program_return program() throws RecognitionException {
        GremlinParserParser.program_return retval = new GremlinParserParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMENT1=null;
        Token NEWLINE3=null;
        GremlinParserParser.statement_return statement2 =null;


        CommonTree COMMENT1_tree=null;
        CommonTree NEWLINE3_tree=null;

        try {
            // GremlinParser.g:83:5: ( ( COMMENT )+ | ( ( statement )? NEWLINE )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==BOOLEAN||(LA4_0 >= G_DOUBLE && LA4_0 <= G_LONG)||LA4_0==IDENTIFIER||LA4_0==NEWLINE||LA4_0==NULL||LA4_0==PROPERTY||LA4_0==StringLiteral||LA4_0==VARIABLE||LA4_0==65||LA4_0==71||(LA4_0 >= 86 && LA4_0 <= 88)||LA4_0==90||(LA4_0 >= 93 && LA4_0 <= 96)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // GremlinParser.g:83:7: ( COMMENT )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // GremlinParser.g:83:7: ( COMMENT )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // GremlinParser.g:83:7: COMMENT
                    	    {
                    	    COMMENT1=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_program307); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMENT1_tree = 
                    	    (CommonTree)adaptor.create(COMMENT1)
                    	    ;
                    	    adaptor.addChild(root_0, COMMENT1_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // GremlinParser.g:84:9: ( ( statement )? NEWLINE )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // GremlinParser.g:84:9: ( ( statement )? NEWLINE )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==BOOLEAN||(LA3_0 >= G_DOUBLE && LA3_0 <= G_LONG)||LA3_0==IDENTIFIER||LA3_0==NEWLINE||LA3_0==NULL||LA3_0==PROPERTY||LA3_0==StringLiteral||LA3_0==VARIABLE||LA3_0==65||LA3_0==71||(LA3_0 >= 86 && LA3_0 <= 88)||LA3_0==90||(LA3_0 >= 93 && LA3_0 <= 96)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // GremlinParser.g:84:10: ( statement )? NEWLINE
                    	    {
                    	    // GremlinParser.g:84:10: ( statement )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==BOOLEAN||(LA2_0 >= G_DOUBLE && LA2_0 <= G_LONG)||LA2_0==IDENTIFIER||LA2_0==NULL||LA2_0==PROPERTY||LA2_0==StringLiteral||LA2_0==VARIABLE||LA2_0==65||LA2_0==71||(LA2_0 >= 86 && LA2_0 <= 88)||LA2_0==90||(LA2_0 >= 93 && LA2_0 <= 96)) ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // GremlinParser.g:84:10: statement
                    	            {
                    	            pushFollow(FOLLOW_statement_in_program319);
                    	            statement2=statement();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

                    	            }
                    	            break;

                    	    }


                    	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_program322); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NEWLINE3_tree = 
                    	    (CommonTree)adaptor.create(NEWLINE3)
                    	    ;
                    	    adaptor.addChild(root_0, NEWLINE3_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


    public static class gpath_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gpath_statement"
    // GremlinParser.g:92:1: gpath_statement : step ( '/' step )* -> ^( GPATH ( step )+ ) ;
    public final GremlinParserParser.gpath_statement_return gpath_statement() throws RecognitionException {
        GremlinParserParser.gpath_statement_return retval = new GremlinParserParser.gpath_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal5=null;
        GremlinParserParser.step_return step4 =null;

        GremlinParserParser.step_return step6 =null;


        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_step=new RewriteRuleSubtreeStream(adaptor,"rule step");
        try {
            // GremlinParser.g:93:5: ( step ( '/' step )* -> ^( GPATH ( step )+ ) )
            // GremlinParser.g:93:7: step ( '/' step )*
            {
            pushFollow(FOLLOW_step_in_gpath_statement364);
            step4=step();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_step.add(step4.getTree());

            // GremlinParser.g:93:12: ( '/' step )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==72) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // GremlinParser.g:93:13: '/' step
            	    {
            	    char_literal5=(Token)match(input,72,FOLLOW_72_in_gpath_statement367); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_72.add(char_literal5);


            	    pushFollow(FOLLOW_step_in_gpath_statement369);
            	    step6=step();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_step.add(step6.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: step
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 93:24: -> ^( GPATH ( step )+ )
            {
                // GremlinParser.g:93:27: ^( GPATH ( step )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(GPATH, "GPATH")
                , root_1);

                if ( !(stream_step.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_step.hasNext() ) {
                    adaptor.addChild(root_1, stream_step.nextTree());

                }
                stream_step.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "gpath_statement"


    public static class step_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "step"
    // GremlinParser.g:96:1: step : token ( '[' statement ']' )* -> ^( STEP ^( TOKEN token ) ^( PREDICATES ( ^( PREDICATE statement ) )* ) ) ;
    public final GremlinParserParser.step_return step() throws RecognitionException {
        GremlinParserParser.step_return retval = new GremlinParserParser.step_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        GremlinParserParser.token_return token7 =null;

        GremlinParserParser.statement_return statement9 =null;


        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_token=new RewriteRuleSubtreeStream(adaptor,"rule token");
        try {
            // GremlinParser.g:97:5: ( token ( '[' statement ']' )* -> ^( STEP ^( TOKEN token ) ^( PREDICATES ( ^( PREDICATE statement ) )* ) ) )
            // GremlinParser.g:97:7: token ( '[' statement ']' )*
            {
            pushFollow(FOLLOW_token_in_step395);
            token7=token();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token.add(token7.getTree());

            // GremlinParser.g:97:13: ( '[' statement ']' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==80) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // GremlinParser.g:97:14: '[' statement ']'
            	    {
            	    char_literal8=(Token)match(input,80,FOLLOW_80_in_step398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_80.add(char_literal8);


            	    pushFollow(FOLLOW_statement_in_step400);
            	    statement9=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement9.getTree());

            	    char_literal10=(Token)match(input,81,FOLLOW_81_in_step402); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_81.add(char_literal10);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: statement, token
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:34: -> ^( STEP ^( TOKEN token ) ^( PREDICATES ( ^( PREDICATE statement ) )* ) )
            {
                // GremlinParser.g:97:37: ^( STEP ^( TOKEN token ) ^( PREDICATES ( ^( PREDICATE statement ) )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STEP, "STEP")
                , root_1);

                // GremlinParser.g:97:44: ^( TOKEN token )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TOKEN, "TOKEN")
                , root_2);

                adaptor.addChild(root_2, stream_token.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // GremlinParser.g:97:59: ^( PREDICATES ( ^( PREDICATE statement ) )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PREDICATES, "PREDICATES")
                , root_2);

                // GremlinParser.g:97:72: ( ^( PREDICATE statement ) )*
                while ( stream_statement.hasNext() ) {
                    // GremlinParser.g:97:72: ^( PREDICATE statement )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(PREDICATE, "PREDICATE")
                    , root_3);

                    adaptor.addChild(root_3, stream_statement.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "step"


    public static class token_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "token"
    // GremlinParser.g:100:1: token : ( function_call | StringLiteral -> ^( STR StringLiteral ) | PROPERTY -> ^( PROPERTY_CALL PROPERTY ) | VARIABLE -> ^( VARIABLE_CALL VARIABLE ) | IDENTIFIER | '..' );
    public final GremlinParserParser.token_return token() throws RecognitionException {
        GremlinParserParser.token_return retval = new GremlinParserParser.token_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral12=null;
        Token PROPERTY13=null;
        Token VARIABLE14=null;
        Token IDENTIFIER15=null;
        Token string_literal16=null;
        GremlinParserParser.function_call_return function_call11 =null;


        CommonTree StringLiteral12_tree=null;
        CommonTree PROPERTY13_tree=null;
        CommonTree VARIABLE14_tree=null;
        CommonTree IDENTIFIER15_tree=null;
        CommonTree string_literal16_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_PROPERTY=new RewriteRuleTokenStream(adaptor,"token PROPERTY");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

        try {
            // GremlinParser.g:101:2: ( function_call | StringLiteral -> ^( STR StringLiteral ) | PROPERTY -> ^( PROPERTY_CALL PROPERTY ) | VARIABLE -> ^( VARIABLE_CALL VARIABLE ) | IDENTIFIER | '..' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==73) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==BOOLEAN||LA7_1==COMMENT||(LA7_1 >= G_DOUBLE && LA7_1 <= G_LONG)||LA7_1==IDENTIFIER||LA7_1==NEWLINE||LA7_1==NULL||LA7_1==PROPERTY||LA7_1==StringLiteral||LA7_1==VARIABLE||(LA7_1 >= 64 && LA7_1 <= 72)||(LA7_1 >= 74 && LA7_1 <= 88)||(LA7_1 >= 90 && LA7_1 <= 96)) ) {
                    alt7=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                alt7=2;
                }
                break;
            case PROPERTY:
                {
                alt7=3;
                }
                break;
            case VARIABLE:
                {
                alt7=4;
                }
                break;
            case 71:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // GremlinParser.g:101:6: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_token443);
                    function_call11=function_call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call11.getTree());

                    }
                    break;
                case 2 :
                    // GremlinParser.g:102:9: StringLiteral
                    {
                    StringLiteral12=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_token454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral12);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:23: -> ^( STR StringLiteral )
                    {
                        // GremlinParser.g:102:26: ^( STR StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STR, "STR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_StringLiteral.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // GremlinParser.g:103:4: PROPERTY
                    {
                    PROPERTY13=(Token)match(input,PROPERTY,FOLLOW_PROPERTY_in_token467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROPERTY.add(PROPERTY13);


                    // AST REWRITE
                    // elements: PROPERTY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:17: -> ^( PROPERTY_CALL PROPERTY )
                    {
                        // GremlinParser.g:103:20: ^( PROPERTY_CALL PROPERTY )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PROPERTY_CALL, "PROPERTY_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PROPERTY.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // GremlinParser.g:104:4: VARIABLE
                    {
                    VARIABLE14=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_token484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE14);


                    // AST REWRITE
                    // elements: VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 104:20: -> ^( VARIABLE_CALL VARIABLE )
                    {
                        // GremlinParser.g:104:23: ^( VARIABLE_CALL VARIABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VARIABLE_CALL, "VARIABLE_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VARIABLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // GremlinParser.g:105:6: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_token506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER15_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER15)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER15_tree);
                    }

                    }
                    break;
                case 6 :
                    // GremlinParser.g:106:9: '..'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal16=(Token)match(input,71,FOLLOW_71_in_token516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal16_tree = 
                    (CommonTree)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "token"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // GremlinParser.g:110:1: statement : ( if_statement | foreach_statement | while_statement | repeat_statement | path_definition_statement | function_definition_statement | include_statement | script_statement | atom ':=' statement -> ^( VAR atom statement ) | expression ( ( 'and' ^| 'or' ^) expression )* );
    public final GremlinParserParser.statement_return statement() throws RecognitionException {
        GremlinParserParser.statement_return retval = new GremlinParserParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal26=null;
        Token string_literal29=null;
        Token string_literal30=null;
        GremlinParserParser.if_statement_return if_statement17 =null;

        GremlinParserParser.foreach_statement_return foreach_statement18 =null;

        GremlinParserParser.while_statement_return while_statement19 =null;

        GremlinParserParser.repeat_statement_return repeat_statement20 =null;

        GremlinParserParser.path_definition_statement_return path_definition_statement21 =null;

        GremlinParserParser.function_definition_statement_return function_definition_statement22 =null;

        GremlinParserParser.include_statement_return include_statement23 =null;

        GremlinParserParser.script_statement_return script_statement24 =null;

        GremlinParserParser.atom_return atom25 =null;

        GremlinParserParser.statement_return statement27 =null;

        GremlinParserParser.expression_return expression28 =null;

        GremlinParserParser.expression_return expression31 =null;


        CommonTree string_literal26_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // GremlinParser.g:111:5: ( if_statement | foreach_statement | while_statement | repeat_statement | path_definition_statement | function_definition_statement | include_statement | script_statement | atom ':=' statement -> ^( VAR atom statement ) | expression ( ( 'and' ^| 'or' ^) expression )* )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt10=1;
                }
                break;
            case 86:
                {
                alt10=2;
                }
                break;
            case 96:
                {
                alt10=3;
                }
                break;
            case 94:
                {
                alt10=4;
                }
                break;
            case 93:
                {
                alt10=5;
                }
                break;
            case 87:
                {
                alt10=6;
                }
                break;
            case 90:
                {
                alt10=7;
                }
                break;
            case 95:
                {
                alt10=8;
                }
                break;
            case G_INT:
                {
                int LA10_9 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 9, input);

                    throw nvae;

                }
                }
                break;
            case G_LONG:
                {
                int LA10_10 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 10, input);

                    throw nvae;

                }
                }
                break;
            case G_FLOAT:
                {
                int LA10_11 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 11, input);

                    throw nvae;

                }
                }
                break;
            case G_DOUBLE:
                {
                int LA10_12 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA10_13 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 13, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA10_14 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 14, input);

                    throw nvae;

                }
                }
                break;
            case PROPERTY:
                {
                int LA10_15 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 15, input);

                    throw nvae;

                }
                }
                break;
            case VARIABLE:
                {
                int LA10_16 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 16, input);

                    throw nvae;

                }
                }
                break;
            case 71:
                {
                int LA10_17 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 17, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA10_18 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 18, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA10_19 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 19, input);

                    throw nvae;

                }
                }
                break;
            case 65:
                {
                int LA10_20 = input.LA(2);

                if ( (synpred20_GremlinParser()) ) {
                    alt10=9;
                }
                else if ( (true) ) {
                    alt10=10;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 20, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // GremlinParser.g:111:9: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_statement533);
                    if_statement17=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement17.getTree());

                    }
                    break;
                case 2 :
                    // GremlinParser.g:112:4: foreach_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_foreach_statement_in_statement538);
                    foreach_statement18=foreach_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreach_statement18.getTree());

                    }
                    break;
                case 3 :
                    // GremlinParser.g:113:4: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_while_statement_in_statement543);
                    while_statement19=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement19.getTree());

                    }
                    break;
                case 4 :
                    // GremlinParser.g:114:4: repeat_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_repeat_statement_in_statement548);
                    repeat_statement20=repeat_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeat_statement20.getTree());

                    }
                    break;
                case 5 :
                    // GremlinParser.g:115:4: path_definition_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_path_definition_statement_in_statement553);
                    path_definition_statement21=path_definition_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, path_definition_statement21.getTree());

                    }
                    break;
                case 6 :
                    // GremlinParser.g:116:4: function_definition_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_definition_statement_in_statement558);
                    function_definition_statement22=function_definition_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_definition_statement22.getTree());

                    }
                    break;
                case 7 :
                    // GremlinParser.g:117:4: include_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_include_statement_in_statement563);
                    include_statement23=include_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, include_statement23.getTree());

                    }
                    break;
                case 8 :
                    // GremlinParser.g:118:6: script_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_script_statement_in_statement570);
                    script_statement24=script_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, script_statement24.getTree());

                    }
                    break;
                case 9 :
                    // GremlinParser.g:119:9: atom ':=' statement
                    {
                    pushFollow(FOLLOW_atom_in_statement580);
                    atom25=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom25.getTree());

                    string_literal26=(Token)match(input,74,FOLLOW_74_in_statement582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal26);


                    pushFollow(FOLLOW_statement_in_statement584);
                    statement27=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement27.getTree());

                    // AST REWRITE
                    // elements: atom, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:30: -> ^( VAR atom statement )
                    {
                        // GremlinParser.g:119:33: ^( VAR atom statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // GremlinParser.g:120:4: expression ( ( 'and' ^| 'or' ^) expression )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_statement601);
                    expression28=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression28.getTree());

                    // GremlinParser.g:120:15: ( ( 'and' ^| 'or' ^) expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==82||LA9_0==92) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // GremlinParser.g:120:16: ( 'and' ^| 'or' ^) expression
                    	    {
                    	    // GremlinParser.g:120:16: ( 'and' ^| 'or' ^)
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==82) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==92) ) {
                    	        alt8=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // GremlinParser.g:120:17: 'and' ^
                    	            {
                    	            string_literal29=(Token)match(input,82,FOLLOW_82_in_statement605); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            string_literal29_tree = 
                    	            (CommonTree)adaptor.create(string_literal29)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // GremlinParser.g:120:24: 'or' ^
                    	            {
                    	            string_literal30=(Token)match(input,92,FOLLOW_92_in_statement608); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            string_literal30_tree = 
                    	            (CommonTree)adaptor.create(string_literal30)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal30_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_expression_in_statement612);
                    	    expression31=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


    public static class include_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_statement"
    // GremlinParser.g:123:1: include_statement : 'include' StringLiteral -> ^( INCLUDE StringLiteral ) ;
    public final GremlinParserParser.include_statement_return include_statement() throws RecognitionException {
        GremlinParserParser.include_statement_return retval = new GremlinParserParser.include_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        Token StringLiteral33=null;

        CommonTree string_literal32_tree=null;
        CommonTree StringLiteral33_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");

        try {
            // GremlinParser.g:124:2: ( 'include' StringLiteral -> ^( INCLUDE StringLiteral ) )
            // GremlinParser.g:124:4: 'include' StringLiteral
            {
            string_literal32=(Token)match(input,90,FOLLOW_90_in_include_statement625); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(string_literal32);


            StringLiteral33=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_include_statement627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral33);


            // AST REWRITE
            // elements: StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:28: -> ^( INCLUDE StringLiteral )
            {
                // GremlinParser.g:124:31: ^( INCLUDE StringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INCLUDE, "INCLUDE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "include_statement"


    public static class script_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "script_statement"
    // GremlinParser.g:127:1: script_statement : 'script' StringLiteral -> ^( SCRIPT StringLiteral ) ;
    public final GremlinParserParser.script_statement_return script_statement() throws RecognitionException {
        GremlinParserParser.script_statement_return retval = new GremlinParserParser.script_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal34=null;
        Token StringLiteral35=null;

        CommonTree string_literal34_tree=null;
        CommonTree StringLiteral35_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");

        try {
            // GremlinParser.g:128:5: ( 'script' StringLiteral -> ^( SCRIPT StringLiteral ) )
            // GremlinParser.g:128:9: 'script' StringLiteral
            {
            string_literal34=(Token)match(input,95,FOLLOW_95_in_script_statement651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(string_literal34);


            StringLiteral35=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_script_statement653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral35);


            // AST REWRITE
            // elements: StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:32: -> ^( SCRIPT StringLiteral )
            {
                // GremlinParser.g:128:35: ^( SCRIPT StringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SCRIPT, "SCRIPT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "script_statement"


    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // GremlinParser.g:131:1: if_statement : 'if' statement NEWLINE if_block= block ( 'else' else_block= block )? 'end' -> ^( IF ^( COND statement ) $if_block ( ^( ELSE $else_block) )? ) ;
    public final GremlinParserParser.if_statement_return if_statement() throws RecognitionException {
        GremlinParserParser.if_statement_return retval = new GremlinParserParser.if_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal36=null;
        Token NEWLINE38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        GremlinParserParser.block_return if_block =null;

        GremlinParserParser.block_return else_block =null;

        GremlinParserParser.statement_return statement37 =null;


        CommonTree string_literal36_tree=null;
        CommonTree NEWLINE38_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // GremlinParser.g:132:2: ( 'if' statement NEWLINE if_block= block ( 'else' else_block= block )? 'end' -> ^( IF ^( COND statement ) $if_block ( ^( ELSE $else_block) )? ) )
            // GremlinParser.g:132:4: 'if' statement NEWLINE if_block= block ( 'else' else_block= block )? 'end'
            {
            string_literal36=(Token)match(input,88,FOLLOW_88_in_if_statement677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_88.add(string_literal36);


            pushFollow(FOLLOW_statement_in_if_statement679);
            statement37=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement37.getTree());

            NEWLINE38=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_if_statement681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE38);


            pushFollow(FOLLOW_block_in_if_statement697);
            if_block=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(if_block.getTree());

            // GremlinParser.g:134:9: ( 'else' else_block= block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==84) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // GremlinParser.g:134:10: 'else' else_block= block
                    {
                    string_literal39=(Token)match(input,84,FOLLOW_84_in_if_statement708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_84.add(string_literal39);


                    pushFollow(FOLLOW_block_in_if_statement723);
                    else_block=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(else_block.getTree());

                    }
                    break;

            }


            string_literal40=(Token)match(input,85,FOLLOW_85_in_if_statement735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal40);


            // AST REWRITE
            // elements: statement, if_block, else_block
            // token labels: 
            // rule labels: if_block, else_block, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_if_block=new RewriteRuleSubtreeStream(adaptor,"rule if_block",if_block!=null?if_block.tree:null);
            RewriteRuleSubtreeStream stream_else_block=new RewriteRuleSubtreeStream(adaptor,"rule else_block",else_block!=null?else_block.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:15: -> ^( IF ^( COND statement ) $if_block ( ^( ELSE $else_block) )? )
            {
                // GremlinParser.g:136:18: ^( IF ^( COND statement ) $if_block ( ^( ELSE $else_block) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF, "IF")
                , root_1);

                // GremlinParser.g:136:23: ^( COND statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_if_block.nextTree());

                // GremlinParser.g:136:51: ( ^( ELSE $else_block) )?
                if ( stream_else_block.hasNext() ) {
                    // GremlinParser.g:136:51: ^( ELSE $else_block)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(ELSE, "ELSE")
                    , root_2);

                    adaptor.addChild(root_2, stream_else_block.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_else_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "if_statement"


    public static class foreach_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach_statement"
    // GremlinParser.g:139:1: foreach_statement : 'foreach' VARIABLE 'in' statement NEWLINE block 'end' -> ^( FOREACH VARIABLE statement block ) ;
    public final GremlinParserParser.foreach_statement_return foreach_statement() throws RecognitionException {
        GremlinParserParser.foreach_statement_return retval = new GremlinParserParser.foreach_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal41=null;
        Token VARIABLE42=null;
        Token string_literal43=null;
        Token NEWLINE45=null;
        Token string_literal47=null;
        GremlinParserParser.statement_return statement44 =null;

        GremlinParserParser.block_return block46 =null;


        CommonTree string_literal41_tree=null;
        CommonTree VARIABLE42_tree=null;
        CommonTree string_literal43_tree=null;
        CommonTree NEWLINE45_tree=null;
        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // GremlinParser.g:140:2: ( 'foreach' VARIABLE 'in' statement NEWLINE block 'end' -> ^( FOREACH VARIABLE statement block ) )
            // GremlinParser.g:140:4: 'foreach' VARIABLE 'in' statement NEWLINE block 'end'
            {
            string_literal41=(Token)match(input,86,FOLLOW_86_in_foreach_statement769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal41);


            VARIABLE42=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_foreach_statement771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE42);


            string_literal43=(Token)match(input,89,FOLLOW_89_in_foreach_statement773); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(string_literal43);


            pushFollow(FOLLOW_statement_in_foreach_statement775);
            statement44=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement44.getTree());

            NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_foreach_statement777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE45);


            pushFollow(FOLLOW_block_in_foreach_statement788);
            block46=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block46.getTree());

            string_literal47=(Token)match(input,85,FOLLOW_85_in_foreach_statement796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal47);


            // AST REWRITE
            // elements: statement, block, VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:12: -> ^( FOREACH VARIABLE statement block )
            {
                // GremlinParser.g:142:15: ^( FOREACH VARIABLE statement block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOREACH, "FOREACH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VARIABLE.nextNode()
                );

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "foreach_statement"


    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_statement"
    // GremlinParser.g:145:1: while_statement : 'while' statement NEWLINE block 'end' -> ^( WHILE ^( COND statement ) block ) ;
    public final GremlinParserParser.while_statement_return while_statement() throws RecognitionException {
        GremlinParserParser.while_statement_return retval = new GremlinParserParser.while_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal48=null;
        Token NEWLINE50=null;
        Token string_literal52=null;
        GremlinParserParser.statement_return statement49 =null;

        GremlinParserParser.block_return block51 =null;


        CommonTree string_literal48_tree=null;
        CommonTree NEWLINE50_tree=null;
        CommonTree string_literal52_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // GremlinParser.g:146:2: ( 'while' statement NEWLINE block 'end' -> ^( WHILE ^( COND statement ) block ) )
            // GremlinParser.g:146:4: 'while' statement NEWLINE block 'end'
            {
            string_literal48=(Token)match(input,96,FOLLOW_96_in_while_statement820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(string_literal48);


            pushFollow(FOLLOW_statement_in_while_statement822);
            statement49=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement49.getTree());

            NEWLINE50=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_while_statement824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE50);


            pushFollow(FOLLOW_block_in_while_statement835);
            block51=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block51.getTree());

            string_literal52=(Token)match(input,85,FOLLOW_85_in_while_statement843); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal52);


            // AST REWRITE
            // elements: block, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:12: -> ^( WHILE ^( COND statement ) block )
            {
                // GremlinParser.g:148:15: ^( WHILE ^( COND statement ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE, "WHILE")
                , root_1);

                // GremlinParser.g:148:23: ^( COND statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "while_statement"


    public static class repeat_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repeat_statement"
    // GremlinParser.g:151:1: repeat_statement : 'repeat' statement NEWLINE block 'end' -> ^( REPEAT statement block ) ;
    public final GremlinParserParser.repeat_statement_return repeat_statement() throws RecognitionException {
        GremlinParserParser.repeat_statement_return retval = new GremlinParserParser.repeat_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal53=null;
        Token NEWLINE55=null;
        Token string_literal57=null;
        GremlinParserParser.statement_return statement54 =null;

        GremlinParserParser.block_return block56 =null;


        CommonTree string_literal53_tree=null;
        CommonTree NEWLINE55_tree=null;
        CommonTree string_literal57_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // GremlinParser.g:152:2: ( 'repeat' statement NEWLINE block 'end' -> ^( REPEAT statement block ) )
            // GremlinParser.g:152:4: 'repeat' statement NEWLINE block 'end'
            {
            string_literal53=(Token)match(input,94,FOLLOW_94_in_repeat_statement868); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_94.add(string_literal53);


            pushFollow(FOLLOW_statement_in_repeat_statement870);
            statement54=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement54.getTree());

            NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_repeat_statement872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE55);


            pushFollow(FOLLOW_block_in_repeat_statement879);
            block56=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block56.getTree());

            string_literal57=(Token)match(input,85,FOLLOW_85_in_repeat_statement883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal57);


            // AST REWRITE
            // elements: statement, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 154:9: -> ^( REPEAT statement block )
            {
                // GremlinParser.g:154:12: ^( REPEAT statement block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REPEAT, "REPEAT")
                , root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "repeat_statement"


    public static class path_definition_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path_definition_statement"
    // GremlinParser.g:157:1: path_definition_statement : 'path' IDENTIFIER NEWLINE statement NEWLINE 'end' -> ^( PATH IDENTIFIER statement ) ;
    public final GremlinParserParser.path_definition_statement_return path_definition_statement() throws RecognitionException {
        GremlinParserParser.path_definition_statement_return retval = new GremlinParserParser.path_definition_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal58=null;
        Token IDENTIFIER59=null;
        Token NEWLINE60=null;
        Token NEWLINE62=null;
        Token string_literal63=null;
        GremlinParserParser.statement_return statement61 =null;


        CommonTree string_literal58_tree=null;
        CommonTree IDENTIFIER59_tree=null;
        CommonTree NEWLINE60_tree=null;
        CommonTree NEWLINE62_tree=null;
        CommonTree string_literal63_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // GremlinParser.g:158:2: ( 'path' IDENTIFIER NEWLINE statement NEWLINE 'end' -> ^( PATH IDENTIFIER statement ) )
            // GremlinParser.g:158:4: 'path' IDENTIFIER NEWLINE statement NEWLINE 'end'
            {
            string_literal58=(Token)match(input,93,FOLLOW_93_in_path_definition_statement905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(string_literal58);


            IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_path_definition_statement907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER59);


            NEWLINE60=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_path_definition_statement909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE60);


            pushFollow(FOLLOW_statement_in_path_definition_statement916);
            statement61=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement61.getTree());

            NEWLINE62=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_path_definition_statement918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE62);


            string_literal63=(Token)match(input,85,FOLLOW_85_in_path_definition_statement922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal63);


            // AST REWRITE
            // elements: IDENTIFIER, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 160:9: -> ^( PATH IDENTIFIER statement )
            {
                // GremlinParser.g:160:12: ^( PATH IDENTIFIER statement )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PATH, "PATH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "path_definition_statement"


    public static class function_definition_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition_statement"
    // GremlinParser.g:163:1: function_definition_statement : 'func' function_name '(' ( formal_arguments )* ')' NEWLINE block 'end' -> ^( FUNC function_name ^( ARGS ( formal_arguments )* ) block ) ;
    public final GremlinParserParser.function_definition_statement_return function_definition_statement() throws RecognitionException {
        GremlinParserParser.function_definition_statement_return retval = new GremlinParserParser.function_definition_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token NEWLINE69=null;
        Token string_literal71=null;
        GremlinParserParser.function_name_return function_name65 =null;

        GremlinParserParser.formal_arguments_return formal_arguments67 =null;

        GremlinParserParser.block_return block70 =null;


        CommonTree string_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree NEWLINE69_tree=null;
        CommonTree string_literal71_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_formal_arguments=new RewriteRuleSubtreeStream(adaptor,"rule formal_arguments");
        RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // GremlinParser.g:164:2: ( 'func' function_name '(' ( formal_arguments )* ')' NEWLINE block 'end' -> ^( FUNC function_name ^( ARGS ( formal_arguments )* ) block ) )
            // GremlinParser.g:164:4: 'func' function_name '(' ( formal_arguments )* ')' NEWLINE block 'end'
            {
            string_literal64=(Token)match(input,87,FOLLOW_87_in_function_definition_statement944); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(string_literal64);


            pushFollow(FOLLOW_function_name_in_function_definition_statement946);
            function_name65=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_name.add(function_name65.getTree());

            char_literal66=(Token)match(input,65,FOLLOW_65_in_function_definition_statement948); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal66);


            // GremlinParser.g:164:29: ( formal_arguments )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VARIABLE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // GremlinParser.g:164:29: formal_arguments
            	    {
            	    pushFollow(FOLLOW_formal_arguments_in_function_definition_statement950);
            	    formal_arguments67=formal_arguments();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_formal_arguments.add(formal_arguments67.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            char_literal68=(Token)match(input,66,FOLLOW_66_in_function_definition_statement953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal68);


            NEWLINE69=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_function_definition_statement955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE69);


            pushFollow(FOLLOW_block_in_function_definition_statement962);
            block70=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block70.getTree());

            string_literal71=(Token)match(input,85,FOLLOW_85_in_function_definition_statement966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal71);


            // AST REWRITE
            // elements: function_name, block, formal_arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 166:9: -> ^( FUNC function_name ^( ARGS ( formal_arguments )* ) block )
            {
                // GremlinParser.g:166:12: ^( FUNC function_name ^( ARGS ( formal_arguments )* ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC, "FUNC")
                , root_1);

                adaptor.addChild(root_1, stream_function_name.nextTree());

                // GremlinParser.g:166:33: ^( ARGS ( formal_arguments )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGS, "ARGS")
                , root_2);

                // GremlinParser.g:166:40: ( formal_arguments )*
                while ( stream_formal_arguments.hasNext() ) {
                    adaptor.addChild(root_2, stream_formal_arguments.nextTree());

                }
                stream_formal_arguments.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "function_definition_statement"


    public static class formal_arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formal_arguments"
    // GremlinParser.g:169:1: formal_arguments : VARIABLE ( ',' VARIABLE )* -> ( ^( ARG VARIABLE ) )+ ;
    public final GremlinParserParser.formal_arguments_return formal_arguments() throws RecognitionException {
        GremlinParserParser.formal_arguments_return retval = new GremlinParserParser.formal_arguments_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VARIABLE72=null;
        Token char_literal73=null;
        Token VARIABLE74=null;

        CommonTree VARIABLE72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree VARIABLE74_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

        try {
            // GremlinParser.g:170:2: ( VARIABLE ( ',' VARIABLE )* -> ( ^( ARG VARIABLE ) )+ )
            // GremlinParser.g:170:4: VARIABLE ( ',' VARIABLE )*
            {
            VARIABLE72=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_formal_arguments996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE72);


            // GremlinParser.g:170:13: ( ',' VARIABLE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==69) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // GremlinParser.g:170:14: ',' VARIABLE
            	    {
            	    char_literal73=(Token)match(input,69,FOLLOW_69_in_formal_arguments999); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_69.add(char_literal73);


            	    VARIABLE74=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_formal_arguments1001); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE74);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 170:29: -> ( ^( ARG VARIABLE ) )+
            {
                if ( !(stream_VARIABLE.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_VARIABLE.hasNext() ) {
                    // GremlinParser.g:170:32: ^( ARG VARIABLE )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(ARG, "ARG")
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_VARIABLE.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_VARIABLE.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "formal_arguments"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // GremlinParser.g:173:1: block : ( block_body | NEWLINE )* -> ^( BLOCK ( block_body )* ) ;
    public final GremlinParserParser.block_return block() throws RecognitionException {
        GremlinParserParser.block_return retval = new GremlinParserParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE76=null;
        GremlinParserParser.block_body_return block_body75 =null;


        CommonTree NEWLINE76_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_block_body=new RewriteRuleSubtreeStream(adaptor,"rule block_body");
        try {
            // GremlinParser.g:174:5: ( ( block_body | NEWLINE )* -> ^( BLOCK ( block_body )* ) )
            // GremlinParser.g:174:7: ( block_body | NEWLINE )*
            {
            // GremlinParser.g:174:7: ( block_body | NEWLINE )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==BOOLEAN||LA14_0==COMMENT||(LA14_0 >= G_DOUBLE && LA14_0 <= G_LONG)||LA14_0==IDENTIFIER||LA14_0==NULL||LA14_0==PROPERTY||LA14_0==StringLiteral||LA14_0==VARIABLE||LA14_0==65||LA14_0==71||(LA14_0 >= 86 && LA14_0 <= 88)||LA14_0==90||(LA14_0 >= 93 && LA14_0 <= 96)) ) {
                    alt14=1;
                }
                else if ( (LA14_0==NEWLINE) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // GremlinParser.g:174:8: block_body
            	    {
            	    pushFollow(FOLLOW_block_body_in_block1028);
            	    block_body75=block_body();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block_body.add(block_body75.getTree());

            	    }
            	    break;
            	case 2 :
            	    // GremlinParser.g:174:21: NEWLINE
            	    {
            	    NEWLINE76=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block1032); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE76);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // AST REWRITE
            // elements: block_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 174:31: -> ^( BLOCK ( block_body )* )
            {
                // GremlinParser.g:174:34: ^( BLOCK ( block_body )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // GremlinParser.g:174:42: ( block_body )*
                while ( stream_block_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_block_body.nextTree());

                }
                stream_block_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "block"


    public static class block_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_body"
    // GremlinParser.g:177:1: block_body : ( statement | COMMENT NEWLINE );
    public final GremlinParserParser.block_body_return block_body() throws RecognitionException {
        GremlinParserParser.block_body_return retval = new GremlinParserParser.block_body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMENT78=null;
        Token NEWLINE79=null;
        GremlinParserParser.statement_return statement77 =null;


        CommonTree COMMENT78_tree=null;
        CommonTree NEWLINE79_tree=null;

        try {
            // GremlinParser.g:178:5: ( statement | COMMENT NEWLINE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOLEAN||(LA15_0 >= G_DOUBLE && LA15_0 <= G_LONG)||LA15_0==IDENTIFIER||LA15_0==NULL||LA15_0==PROPERTY||LA15_0==StringLiteral||LA15_0==VARIABLE||LA15_0==65||LA15_0==71||(LA15_0 >= 86 && LA15_0 <= 88)||LA15_0==90||(LA15_0 >= 93 && LA15_0 <= 96)) ) {
                alt15=1;
            }
            else if ( (LA15_0==COMMENT) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // GremlinParser.g:178:7: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_block_body1057);
                    statement77=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement77.getTree());

                    }
                    break;
                case 2 :
                    // GremlinParser.g:179:7: COMMENT NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    COMMENT78=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_block_body1065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMENT78_tree = 
                    (CommonTree)adaptor.create(COMMENT78)
                    ;
                    adaptor.addChild(root_0, COMMENT78_tree);
                    }

                    NEWLINE79=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block_body1067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE79_tree = 
                    (CommonTree)adaptor.create(NEWLINE79)
                    ;
                    adaptor.addChild(root_0, NEWLINE79_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "block_body"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // GremlinParser.g:182:1: expression : operation ( ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) operation )* ;
    public final GremlinParserParser.expression_return expression() throws RecognitionException {
        GremlinParserParser.expression_return retval = new GremlinParserParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal81=null;
        Token string_literal82=null;
        Token char_literal83=null;
        Token string_literal84=null;
        Token char_literal85=null;
        Token string_literal86=null;
        GremlinParserParser.operation_return operation80 =null;

        GremlinParserParser.operation_return operation87 =null;


        CommonTree char_literal81_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree char_literal85_tree=null;
        CommonTree string_literal86_tree=null;

        try {
            // GremlinParser.g:183:2: ( operation ( ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) operation )* )
            // GremlinParser.g:183:4: operation ( ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) operation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_operation_in_expression1081);
            operation80=operation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operation80.getTree());

            // GremlinParser.g:183:14: ( ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) operation )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==64||(LA17_0 >= 75 && LA17_0 <= 79)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // GremlinParser.g:183:15: ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) operation
            	    {
            	    // GremlinParser.g:183:15: ( '=' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
            	    int alt16=6;
            	    switch ( input.LA(1) ) {
            	    case 77:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 75:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 76:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 78:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case 79:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // GremlinParser.g:183:16: '=' ^
            	            {
            	            char_literal81=(Token)match(input,77,FOLLOW_77_in_expression1085); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal81_tree = 
            	            (CommonTree)adaptor.create(char_literal81)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal81_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // GremlinParser.g:183:23: '!=' ^
            	            {
            	            string_literal82=(Token)match(input,64,FOLLOW_64_in_expression1090); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal82_tree = 
            	            (CommonTree)adaptor.create(string_literal82)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // GremlinParser.g:183:31: '<' ^
            	            {
            	            char_literal83=(Token)match(input,75,FOLLOW_75_in_expression1095); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal83_tree = 
            	            (CommonTree)adaptor.create(char_literal83)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // GremlinParser.g:183:38: '<=' ^
            	            {
            	            string_literal84=(Token)match(input,76,FOLLOW_76_in_expression1100); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal84_tree = 
            	            (CommonTree)adaptor.create(string_literal84)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal84_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // GremlinParser.g:183:46: '>' ^
            	            {
            	            char_literal85=(Token)match(input,78,FOLLOW_78_in_expression1105); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal85_tree = 
            	            (CommonTree)adaptor.create(char_literal85)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal85_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // GremlinParser.g:183:53: '>=' ^
            	            {
            	            string_literal86=(Token)match(input,79,FOLLOW_79_in_expression1110); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal86_tree = 
            	            (CommonTree)adaptor.create(string_literal86)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal86_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_operation_in_expression1114);
            	    operation87=operation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operation87.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expression"


    public static class operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation"
    // GremlinParser.g:186:1: operation : binary_operation ( ( '+' ^| '-' ^) binary_operation )* ;
    public final GremlinParserParser.operation_return operation() throws RecognitionException {
        GremlinParserParser.operation_return retval = new GremlinParserParser.operation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal89=null;
        Token char_literal90=null;
        GremlinParserParser.binary_operation_return binary_operation88 =null;

        GremlinParserParser.binary_operation_return binary_operation91 =null;


        CommonTree char_literal89_tree=null;
        CommonTree char_literal90_tree=null;

        try {
            // GremlinParser.g:187:2: ( binary_operation ( ( '+' ^| '-' ^) binary_operation )* )
            // GremlinParser.g:187:4: binary_operation ( ( '+' ^| '-' ^) binary_operation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_binary_operation_in_operation1127);
            binary_operation88=binary_operation();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_operation88.getTree());

            // GremlinParser.g:187:21: ( ( '+' ^| '-' ^) binary_operation )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==68||LA19_0==70) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // GremlinParser.g:187:22: ( '+' ^| '-' ^) binary_operation
            	    {
            	    // GremlinParser.g:187:22: ( '+' ^| '-' ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==68) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==70) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // GremlinParser.g:187:23: '+' ^
            	            {
            	            char_literal89=(Token)match(input,68,FOLLOW_68_in_operation1131); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal89_tree = 
            	            (CommonTree)adaptor.create(char_literal89)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // GremlinParser.g:187:28: '-' ^
            	            {
            	            char_literal90=(Token)match(input,70,FOLLOW_70_in_operation1134); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal90_tree = 
            	            (CommonTree)adaptor.create(char_literal90)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal90_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_binary_operation_in_operation1138);
            	    binary_operation91=binary_operation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_operation91.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "operation"


    public static class binary_operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binary_operation"
    // GremlinParser.g:190:1: binary_operation : atom ( ( '*' ^| 'div' ^| 'mod' ^) atom )* ;
    public final GremlinParserParser.binary_operation_return binary_operation() throws RecognitionException {
        GremlinParserParser.binary_operation_return retval = new GremlinParserParser.binary_operation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal93=null;
        Token string_literal94=null;
        Token string_literal95=null;
        GremlinParserParser.atom_return atom92 =null;

        GremlinParserParser.atom_return atom96 =null;


        CommonTree char_literal93_tree=null;
        CommonTree string_literal94_tree=null;
        CommonTree string_literal95_tree=null;

        try {
            // GremlinParser.g:191:2: ( atom ( ( '*' ^| 'div' ^| 'mod' ^) atom )* )
            // GremlinParser.g:191:4: atom ( ( '*' ^| 'div' ^| 'mod' ^) atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_binary_operation1152);
            atom92=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom92.getTree());

            // GremlinParser.g:191:9: ( ( '*' ^| 'div' ^| 'mod' ^) atom )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==67||LA21_0==83||LA21_0==91) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // GremlinParser.g:191:10: ( '*' ^| 'div' ^| 'mod' ^) atom
            	    {
            	    // GremlinParser.g:191:10: ( '*' ^| 'div' ^| 'mod' ^)
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case 67:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 83:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 91:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // GremlinParser.g:191:11: '*' ^
            	            {
            	            char_literal93=(Token)match(input,67,FOLLOW_67_in_binary_operation1156); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal93_tree = 
            	            (CommonTree)adaptor.create(char_literal93)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal93_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // GremlinParser.g:191:16: 'div' ^
            	            {
            	            string_literal94=(Token)match(input,83,FOLLOW_83_in_binary_operation1159); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal94_tree = 
            	            (CommonTree)adaptor.create(string_literal94)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal94_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // GremlinParser.g:191:23: 'mod' ^
            	            {
            	            string_literal95=(Token)match(input,91,FOLLOW_91_in_binary_operation1162); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal95_tree = 
            	            (CommonTree)adaptor.create(string_literal95)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal95_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_atom_in_binary_operation1166);
            	    atom96=atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom96.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "binary_operation"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // GremlinParser.g:194:1: function_call : function_name '(' ( function_call_params )* ')' -> ^( FUNC_CALL function_name ^( ARGS ( function_call_params )* ) ) ;
    public final GremlinParserParser.function_call_return function_call() throws RecognitionException {
        GremlinParserParser.function_call_return retval = new GremlinParserParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal98=null;
        Token char_literal100=null;
        GremlinParserParser.function_name_return function_name97 =null;

        GremlinParserParser.function_call_params_return function_call_params99 =null;


        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_function_call_params=new RewriteRuleSubtreeStream(adaptor,"rule function_call_params");
        RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
        try {
            // GremlinParser.g:195:2: ( function_name '(' ( function_call_params )* ')' -> ^( FUNC_CALL function_name ^( ARGS ( function_call_params )* ) ) )
            // GremlinParser.g:195:4: function_name '(' ( function_call_params )* ')'
            {
            pushFollow(FOLLOW_function_name_in_function_call1180);
            function_name97=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_name.add(function_name97.getTree());

            char_literal98=(Token)match(input,65,FOLLOW_65_in_function_call1182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal98);


            // GremlinParser.g:195:22: ( function_call_params )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BOOLEAN||(LA22_0 >= G_DOUBLE && LA22_0 <= G_LONG)||LA22_0==IDENTIFIER||LA22_0==NULL||LA22_0==PROPERTY||LA22_0==StringLiteral||LA22_0==VARIABLE||LA22_0==65||LA22_0==71||(LA22_0 >= 86 && LA22_0 <= 88)||LA22_0==90||(LA22_0 >= 93 && LA22_0 <= 96)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // GremlinParser.g:195:22: function_call_params
            	    {
            	    pushFollow(FOLLOW_function_call_params_in_function_call1184);
            	    function_call_params99=function_call_params();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_call_params.add(function_call_params99.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            char_literal100=(Token)match(input,66,FOLLOW_66_in_function_call1187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal100);


            // AST REWRITE
            // elements: function_name, function_call_params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 195:48: -> ^( FUNC_CALL function_name ^( ARGS ( function_call_params )* ) )
            {
                // GremlinParser.g:195:51: ^( FUNC_CALL function_name ^( ARGS ( function_call_params )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                , root_1);

                adaptor.addChild(root_1, stream_function_name.nextTree());

                // GremlinParser.g:195:77: ^( ARGS ( function_call_params )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGS, "ARGS")
                , root_2);

                // GremlinParser.g:195:84: ( function_call_params )*
                while ( stream_function_call_params.hasNext() ) {
                    adaptor.addChild(root_2, stream_function_call_params.nextTree());

                }
                stream_function_call_params.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "function_call"


    public static class function_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name"
    // GremlinParser.g:198:1: function_name : ns= IDENTIFIER ':' ln= IDENTIFIER -> ^( FUNC_NAME ^( NS $ns) ^( NAME $ln) ) ;
    public final GremlinParserParser.function_name_return function_name() throws RecognitionException {
        GremlinParserParser.function_name_return retval = new GremlinParserParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ns=null;
        Token ln=null;
        Token char_literal101=null;

        CommonTree ns_tree=null;
        CommonTree ln_tree=null;
        CommonTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // GremlinParser.g:199:2: (ns= IDENTIFIER ':' ln= IDENTIFIER -> ^( FUNC_NAME ^( NS $ns) ^( NAME $ln) ) )
            // GremlinParser.g:199:4: ns= IDENTIFIER ':' ln= IDENTIFIER
            {
            ns=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_name1216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(ns);


            char_literal101=(Token)match(input,73,FOLLOW_73_in_function_name1218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal101);


            ln=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_name1222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(ln);


            // AST REWRITE
            // elements: ns, ln
            // token labels: ln, ns
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_ln=new RewriteRuleTokenStream(adaptor,"token ln",ln);
            RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 199:36: -> ^( FUNC_NAME ^( NS $ns) ^( NAME $ln) )
            {
                // GremlinParser.g:199:39: ^( FUNC_NAME ^( NS $ns) ^( NAME $ln) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_NAME, "FUNC_NAME")
                , root_1);

                // GremlinParser.g:199:51: ^( NS $ns)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NS, "NS")
                , root_2);

                adaptor.addChild(root_2, stream_ns.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // GremlinParser.g:199:61: ^( NAME $ln)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_2);

                adaptor.addChild(root_2, stream_ln.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "function_name"


    public static class function_call_params_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call_params"
    // GremlinParser.g:202:1: function_call_params : function_call_param ( ',' function_call_param )* -> ( ^( ARG function_call_param ) )+ ;
    public final GremlinParserParser.function_call_params_return function_call_params() throws RecognitionException {
        GremlinParserParser.function_call_params_return retval = new GremlinParserParser.function_call_params_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal103=null;
        GremlinParserParser.function_call_param_return function_call_param102 =null;

        GremlinParserParser.function_call_param_return function_call_param104 =null;


        CommonTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_function_call_param=new RewriteRuleSubtreeStream(adaptor,"rule function_call_param");
        try {
            // GremlinParser.g:203:2: ( function_call_param ( ',' function_call_param )* -> ( ^( ARG function_call_param ) )+ )
            // GremlinParser.g:203:4: function_call_param ( ',' function_call_param )*
            {
            pushFollow(FOLLOW_function_call_param_in_function_call_params1257);
            function_call_param102=function_call_param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_call_param.add(function_call_param102.getTree());

            // GremlinParser.g:203:24: ( ',' function_call_param )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==69) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // GremlinParser.g:203:25: ',' function_call_param
            	    {
            	    char_literal103=(Token)match(input,69,FOLLOW_69_in_function_call_params1260); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_69.add(char_literal103);


            	    pushFollow(FOLLOW_function_call_param_in_function_call_params1262);
            	    function_call_param104=function_call_param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_function_call_param.add(function_call_param104.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // AST REWRITE
            // elements: function_call_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 203:51: -> ( ^( ARG function_call_param ) )+
            {
                if ( !(stream_function_call_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_function_call_param.hasNext() ) {
                    // GremlinParser.g:203:54: ^( ARG function_call_param )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(ARG, "ARG")
                    , root_1);

                    adaptor.addChild(root_1, stream_function_call_param.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_function_call_param.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "function_call_params"


    public static class function_call_param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call_param"
    // GremlinParser.g:206:1: function_call_param : statement ;
    public final GremlinParserParser.function_call_param_return function_call_param() throws RecognitionException {
        GremlinParserParser.function_call_param_return retval = new GremlinParserParser.function_call_param_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        GremlinParserParser.statement_return statement105 =null;



        try {
            // GremlinParser.g:207:5: ( statement )
            // GremlinParser.g:207:7: statement
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_statement_in_function_call_param1287);
            statement105=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement105.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "function_call_param"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // GremlinParser.g:210:1: atom : ( G_INT -> ^( INT G_INT ) | G_LONG -> ^( LONG G_LONG ) | G_FLOAT -> ^( FLOAT G_FLOAT ) | G_DOUBLE -> ^( DOUBLE G_DOUBLE ) | range | gpath_statement |b= BOOLEAN -> ^( BOOL $b) | NULL | '(' ! statement ')' !);
    public final GremlinParserParser.atom_return atom() throws RecognitionException {
        GremlinParserParser.atom_return retval = new GremlinParserParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token b=null;
        Token G_INT106=null;
        Token G_LONG107=null;
        Token G_FLOAT108=null;
        Token G_DOUBLE109=null;
        Token NULL112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        GremlinParserParser.range_return range110 =null;

        GremlinParserParser.gpath_statement_return gpath_statement111 =null;

        GremlinParserParser.statement_return statement114 =null;


        CommonTree b_tree=null;
        CommonTree G_INT106_tree=null;
        CommonTree G_LONG107_tree=null;
        CommonTree G_FLOAT108_tree=null;
        CommonTree G_DOUBLE109_tree=null;
        CommonTree NULL112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_G_FLOAT=new RewriteRuleTokenStream(adaptor,"token G_FLOAT");
        RewriteRuleTokenStream stream_G_LONG=new RewriteRuleTokenStream(adaptor,"token G_LONG");
        RewriteRuleTokenStream stream_G_INT=new RewriteRuleTokenStream(adaptor,"token G_INT");
        RewriteRuleTokenStream stream_G_DOUBLE=new RewriteRuleTokenStream(adaptor,"token G_DOUBLE");
        RewriteRuleTokenStream stream_BOOLEAN=new RewriteRuleTokenStream(adaptor,"token BOOLEAN");

        try {
            // GremlinParser.g:211:2: ( G_INT -> ^( INT G_INT ) | G_LONG -> ^( LONG G_LONG ) | G_FLOAT -> ^( FLOAT G_FLOAT ) | G_DOUBLE -> ^( DOUBLE G_DOUBLE ) | range | gpath_statement |b= BOOLEAN -> ^( BOOL $b) | NULL | '(' ! statement ')' !)
            int alt24=9;
            switch ( input.LA(1) ) {
            case G_INT:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==71) ) {
                    int LA24_9 = input.LA(3);

                    if ( (LA24_9==G_INT) ) {
                        int LA24_11 = input.LA(4);

                        if ( (synpred42_GremlinParser()) ) {
                            alt24=1;
                        }
                        else if ( (synpred46_GremlinParser()) ) {
                            alt24=5;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 11, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA24_9==EOF||LA24_9==BOOLEAN||LA24_9==COMMENT||(LA24_9 >= G_DOUBLE && LA24_9 <= G_FLOAT)||LA24_9==G_LONG||LA24_9==IDENTIFIER||LA24_9==NEWLINE||LA24_9==NULL||LA24_9==PROPERTY||LA24_9==StringLiteral||LA24_9==VARIABLE||(LA24_9 >= 64 && LA24_9 <= 72)||(LA24_9 >= 74 && LA24_9 <= 80)||(LA24_9 >= 82 && LA24_9 <= 88)||(LA24_9 >= 90 && LA24_9 <= 96)) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 9, input);

                        throw nvae;

                    }
                }
                else if ( (LA24_1==EOF||LA24_1==BOOLEAN||LA24_1==COMMENT||(LA24_1 >= G_DOUBLE && LA24_1 <= G_LONG)||LA24_1==IDENTIFIER||LA24_1==NEWLINE||LA24_1==NULL||LA24_1==PROPERTY||LA24_1==StringLiteral||LA24_1==VARIABLE||(LA24_1 >= 64 && LA24_1 <= 70)||(LA24_1 >= 74 && LA24_1 <= 79)||(LA24_1 >= 81 && LA24_1 <= 88)||(LA24_1 >= 90 && LA24_1 <= 96)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
                }
                break;
            case G_LONG:
                {
                alt24=2;
                }
                break;
            case G_FLOAT:
                {
                alt24=3;
                }
                break;
            case G_DOUBLE:
                {
                alt24=4;
                }
                break;
            case IDENTIFIER:
            case PROPERTY:
            case StringLiteral:
            case VARIABLE:
            case 71:
                {
                alt24=6;
                }
                break;
            case BOOLEAN:
                {
                alt24=7;
                }
                break;
            case NULL:
                {
                alt24=8;
                }
                break;
            case 65:
                {
                alt24=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // GremlinParser.g:211:6: G_INT
                    {
                    G_INT106=(Token)match(input,G_INT,FOLLOW_G_INT_in_atom1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_G_INT.add(G_INT106);


                    // AST REWRITE
                    // elements: G_INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:22: -> ^( INT G_INT )
                    {
                        // GremlinParser.g:211:25: ^( INT G_INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INT, "INT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_G_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // GremlinParser.g:212:6: G_LONG
                    {
                    G_LONG107=(Token)match(input,G_LONG,FOLLOW_G_LONG_in_atom1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_G_LONG.add(G_LONG107);


                    // AST REWRITE
                    // elements: G_LONG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:22: -> ^( LONG G_LONG )
                    {
                        // GremlinParser.g:212:25: ^( LONG G_LONG )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LONG, "LONG")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_G_LONG.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // GremlinParser.g:213:6: G_FLOAT
                    {
                    G_FLOAT108=(Token)match(input,G_FLOAT,FOLLOW_G_FLOAT_in_atom1353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_G_FLOAT.add(G_FLOAT108);


                    // AST REWRITE
                    // elements: G_FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:22: -> ^( FLOAT G_FLOAT )
                    {
                        // GremlinParser.g:213:25: ^( FLOAT G_FLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FLOAT, "FLOAT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_G_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // GremlinParser.g:214:6: G_DOUBLE
                    {
                    G_DOUBLE109=(Token)match(input,G_DOUBLE,FOLLOW_G_DOUBLE_in_atom1376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_G_DOUBLE.add(G_DOUBLE109);


                    // AST REWRITE
                    // elements: G_DOUBLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:22: -> ^( DOUBLE G_DOUBLE )
                    {
                        // GremlinParser.g:214:25: ^( DOUBLE G_DOUBLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DOUBLE, "DOUBLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_G_DOUBLE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // GremlinParser.g:215:6: range
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_range_in_atom1398);
                    range110=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, range110.getTree());

                    }
                    break;
                case 6 :
                    // GremlinParser.g:216:9: gpath_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gpath_statement_in_atom1408);
                    gpath_statement111=gpath_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gpath_statement111.getTree());

                    }
                    break;
                case 7 :
                    // GremlinParser.g:217:9: b= BOOLEAN
                    {
                    b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BOOLEAN.add(b);


                    // AST REWRITE
                    // elements: b
                    // token labels: b
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 217:25: -> ^( BOOL $b)
                    {
                        // GremlinParser.g:217:28: ^( BOOL $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BOOL, "BOOL")
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // GremlinParser.g:218:9: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NULL112=(Token)match(input,NULL,FOLLOW_NULL_in_atom1445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL112_tree = 
                    (CommonTree)adaptor.create(NULL112)
                    ;
                    adaptor.addChild(root_0, NULL112_tree);
                    }

                    }
                    break;
                case 9 :
                    // GremlinParser.g:219:4: '(' ! statement ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal113=(Token)match(input,65,FOLLOW_65_in_atom1450); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_atom1453);
                    statement114=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement114.getTree());

                    char_literal115=(Token)match(input,66,FOLLOW_66_in_atom1455); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "atom"


    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range"
    // GremlinParser.g:253:1: range : min= G_INT '..' max= G_INT -> ^( RANGE $min $max) ;
    public final GremlinParserParser.range_return range() throws RecognitionException {
        GremlinParserParser.range_return retval = new GremlinParserParser.range_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token min=null;
        Token max=null;
        Token string_literal116=null;

        CommonTree min_tree=null;
        CommonTree max_tree=null;
        CommonTree string_literal116_tree=null;
        RewriteRuleTokenStream stream_G_INT=new RewriteRuleTokenStream(adaptor,"token G_INT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // GremlinParser.g:254:5: (min= G_INT '..' max= G_INT -> ^( RANGE $min $max) )
            // GremlinParser.g:254:9: min= G_INT '..' max= G_INT
            {
            min=(Token)match(input,G_INT,FOLLOW_G_INT_in_range1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_G_INT.add(min);


            string_literal116=(Token)match(input,71,FOLLOW_71_in_range1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(string_literal116);


            max=(Token)match(input,G_INT,FOLLOW_G_INT_in_range1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_G_INT.add(max);


            // AST REWRITE
            // elements: max, min
            // token labels: min, max
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_min=new RewriteRuleTokenStream(adaptor,"token min",min);
            RewriteRuleTokenStream stream_max=new RewriteRuleTokenStream(adaptor,"token max",max);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 254:35: -> ^( RANGE $min $max)
            {
                // GremlinParser.g:254:38: ^( RANGE $min $max)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RANGE, "RANGE")
                , root_1);

                adaptor.addChild(root_1, stream_min.nextNode());

                adaptor.addChild(root_1, stream_max.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "range"

    // $ANTLR start synpred20_GremlinParser
    public final void synpred20_GremlinParser_fragment() throws RecognitionException {
        // GremlinParser.g:119:9: ( atom ':=' statement )
        // GremlinParser.g:119:9: atom ':=' statement
        {
        pushFollow(FOLLOW_atom_in_synpred20_GremlinParser580);
        atom();

        state._fsp--;
        if (state.failed) return ;

        match(input,74,FOLLOW_74_in_synpred20_GremlinParser582); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred20_GremlinParser584);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_GremlinParser

    // $ANTLR start synpred42_GremlinParser
    public final void synpred42_GremlinParser_fragment() throws RecognitionException {
        // GremlinParser.g:211:6: ( G_INT )
        // GremlinParser.g:211:6: G_INT
        {
        match(input,G_INT,FOLLOW_G_INT_in_synpred42_GremlinParser1304); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred42_GremlinParser

    // $ANTLR start synpred46_GremlinParser
    public final void synpred46_GremlinParser_fragment() throws RecognitionException {
        // GremlinParser.g:215:6: ( range )
        // GremlinParser.g:215:6: range
        {
        pushFollow(FOLLOW_range_in_synpred46_GremlinParser1398);
        range();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred46_GremlinParser

    // Delegated rules

    public final boolean synpred20_GremlinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_GremlinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_GremlinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_GremlinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_GremlinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_GremlinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_COMMENT_in_program307 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_statement_in_program319 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_program322 = new BitSet(new long[]{0x110042823C000202L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_step_in_gpath_statement364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_gpath_statement367 = new BitSet(new long[]{0x1100400200000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_step_in_gpath_statement369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_token_in_step395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_step398 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_step400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_step402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_function_call_in_token443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_in_token467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_token484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_token506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_token516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_statement_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_statement_in_statement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_definition_statement_in_statement553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_statement_in_statement558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_statement_in_statement563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_script_statement_in_statement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_statement580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_statement582 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_statement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement601 = new BitSet(new long[]{0x0000000000000002L,0x0000000010040000L});
    public static final BitSet FOLLOW_82_in_statement605 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_92_in_statement608 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_expression_in_statement612 = new BitSet(new long[]{0x0000000000000002L,0x0000000010040000L});
    public static final BitSet FOLLOW_90_in_include_statement625 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_include_statement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_script_statement651 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_script_statement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_if_statement677 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_if_statement679 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_if_statement681 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5F00082L});
    public static final BitSet FOLLOW_block_in_if_statement697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84_in_if_statement708 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5E00082L});
    public static final BitSet FOLLOW_block_in_if_statement723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_statement735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_foreach_statement769 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_foreach_statement771 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_foreach_statement773 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_foreach_statement775 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_foreach_statement777 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5E00082L});
    public static final BitSet FOLLOW_block_in_foreach_statement788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_foreach_statement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_while_statement820 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_while_statement822 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_while_statement824 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5E00082L});
    public static final BitSet FOLLOW_block_in_while_statement835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_statement843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_repeat_statement868 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_repeat_statement870 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_repeat_statement872 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5E00082L});
    public static final BitSet FOLLOW_block_in_repeat_statement879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_repeat_statement883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_path_definition_statement905 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_path_definition_statement907 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_path_definition_statement909 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_path_definition_statement916 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_path_definition_statement918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_path_definition_statement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_function_definition_statement944 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_function_name_in_function_definition_statement946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_function_definition_statement948 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_formal_arguments_in_function_definition_statement950 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_function_definition_statement953 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_function_definition_statement955 = new BitSet(new long[]{0x110042823C000A00L,0x00000001E5E00082L});
    public static final BitSet FOLLOW_block_in_function_definition_statement962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_function_definition_statement966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_formal_arguments996 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_formal_arguments999 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_formal_arguments1001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_body_in_block1028 = new BitSet(new long[]{0x110042823C000A02L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_NEWLINE_in_block1032 = new BitSet(new long[]{0x110042823C000A02L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_block_body1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_block_body1065 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_block_body1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_expression1081 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F801L});
    public static final BitSet FOLLOW_77_in_expression1085 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_64_in_expression1090 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_75_in_expression1095 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_76_in_expression1100 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_78_in_expression1105 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_79_in_expression1110 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_operation_in_expression1114 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F801L});
    public static final BitSet FOLLOW_binary_operation_in_operation1127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_68_in_operation1131 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_70_in_operation1134 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_binary_operation_in_operation1138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_atom_in_binary_operation1152 = new BitSet(new long[]{0x0000000000000002L,0x0000000008080008L});
    public static final BitSet FOLLOW_67_in_binary_operation1156 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_83_in_binary_operation1159 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_91_in_binary_operation1162 = new BitSet(new long[]{0x110042023C000200L,0x0000000000000082L});
    public static final BitSet FOLLOW_atom_in_binary_operation1166 = new BitSet(new long[]{0x0000000000000002L,0x0000000008080008L});
    public static final BitSet FOLLOW_function_name_in_function_call1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_function_call1182 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00086L});
    public static final BitSet FOLLOW_function_call_params_in_function_call1184 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00086L});
    public static final BitSet FOLLOW_66_in_function_call1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_name1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_function_name1218 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_name1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_param_in_function_call_params1257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_function_call_params1260 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_function_call_param_in_function_call_params1262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_statement_in_function_call_param1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_INT_in_atom1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_LONG_in_atom1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_FLOAT_in_atom1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_DOUBLE_in_atom1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_atom1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gpath_statement_in_atom1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_atom1450 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_atom1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_atom1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_INT_in_range1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_range1643 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_G_INT_in_range1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred20_GremlinParser580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_synpred20_GremlinParser582 = new BitSet(new long[]{0x110042023C000200L,0x00000001E5C00082L});
    public static final BitSet FOLLOW_statement_in_synpred20_GremlinParser584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_G_INT_in_synpred42_GremlinParser1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_synpred46_GremlinParser1398 = new BitSet(new long[]{0x0000000000000002L});

}