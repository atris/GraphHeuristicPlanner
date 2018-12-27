// $ANTLR 3.4 GremlinParser.g 2018-12-21 23:27:25
package GraphHeuristicPlanner.antlr;

import org.antlr.runtime.*;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GremlinParserLexer extends Lexer {
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

                /* ANTLR guys by default just print exceptions into System.err, we don't need that */
                public void reportError(RecognitionException e) {
                    throw new RuntimeException("Syntax error at " + e.line + "-" + e.charPositionInLine + ": " + this.getErrorMessage(e, this.getTokenNames()));
                }
            

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GremlinParserLexer() {} 
    public GremlinParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GremlinParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "GraphHeuristicPlanner/antlr/GremlinParser.g"; }

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:10:7: ( '!=' )
            // GremlinParser.g:10:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:11:7: ( '(' )
            // GremlinParser.g:11:9: '('
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:12:7: ( ')' )
            // GremlinParser.g:12:9: ')'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:13:7: ( '*' )
            // GremlinParser.g:13:9: '*'
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:14:7: ( '+' )
            // GremlinParser.g:14:9: '+'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:15:7: ( ',' )
            // GremlinParser.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:16:7: ( '-' )
            // GremlinParser.g:16:9: '-'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:17:7: ( '..' )
            // GremlinParser.g:17:9: '..'
            {
            match(".."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:18:7: ( '/' )
            // GremlinParser.g:18:9: '/'
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:19:7: ( ':' )
            // GremlinParser.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:20:7: ( ':=' )
            // GremlinParser.g:20:9: ':='
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:21:7: ( '<' )
            // GremlinParser.g:21:9: '<'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:22:7: ( '<=' )
            // GremlinParser.g:22:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:23:7: ( '=' )
            // GremlinParser.g:23:9: '='
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:24:7: ( '>' )
            // GremlinParser.g:24:9: '>'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:25:7: ( '>=' )
            // GremlinParser.g:25:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:26:7: ( '[' )
            // GremlinParser.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:27:7: ( ']' )
            // GremlinParser.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:28:7: ( 'and' )
            // GremlinParser.g:28:9: 'and'
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:29:7: ( 'div' )
            // GremlinParser.g:29:9: 'div'
            {
            match("div"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:30:7: ( 'else' )
            // GremlinParser.g:30:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:31:7: ( 'end' )
            // GremlinParser.g:31:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:32:7: ( 'foreach' )
            // GremlinParser.g:32:9: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:33:7: ( 'func' )
            // GremlinParser.g:33:9: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:34:7: ( 'if' )
            // GremlinParser.g:34:9: 'if'
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:35:7: ( 'in' )
            // GremlinParser.g:35:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:36:7: ( 'include' )
            // GremlinParser.g:36:9: 'include'
            {
            match("include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:37:7: ( 'mod' )
            // GremlinParser.g:37:9: 'mod'
            {
            match("mod"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:38:7: ( 'or' )
            // GremlinParser.g:38:9: 'or'
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:39:7: ( 'path' )
            // GremlinParser.g:39:9: 'path'
            {
            match("path"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:40:7: ( 'repeat' )
            // GremlinParser.g:40:9: 'repeat'
            {
            match("repeat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:41:7: ( 'script' )
            // GremlinParser.g:41:9: 'script'
            {
            match("script"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:42:7: ( 'while' )
            // GremlinParser.g:42:9: 'while'
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
    // $ANTLR end "T__96"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:89:5: ( '#' ( . )* NEWLINE )
            // GremlinParser.g:89:7: '#' ( . )* NEWLINE
            {
            match('#'); 

            // GremlinParser.g:89:11: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r'||(LA1_0 >= '\u2028' && LA1_0 <= '\u2029')) ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\u2027')||(LA1_0 >= '\u202A' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // GremlinParser.g:89:11: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            mNEWLINE(); 


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:223:2: ( '\"' ( DoubleStringCharacter )* '\"' | '\\'' ( SingleStringCharacter )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // GremlinParser.g:223:4: '\"' ( DoubleStringCharacter )* '\"'
                    {
                    match('\"'); 

                    // GremlinParser.g:223:8: ( DoubleStringCharacter )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\u2027')||(LA2_0 >= '\u202A' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // GremlinParser.g:223:8: DoubleStringCharacter
                    	    {
                    	    mDoubleStringCharacter(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // GremlinParser.g:224:4: '\\'' ( SingleStringCharacter )* '\\''
                    {
                    match('\''); 

                    // GremlinParser.g:224:9: ( SingleStringCharacter )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\u2027')||(LA3_0 >= '\u202A' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // GremlinParser.g:224:9: SingleStringCharacter
                    	    {
                    	    mSingleStringCharacter(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match('\''); 

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
    // $ANTLR end "StringLiteral"

    // $ANTLR start "G_INT"
    public final void mG_INT() throws RecognitionException {
        try {
            int _type = G_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:229:5: ( ( '-' )? ( '0' .. '9' )+ )
            // GremlinParser.g:229:7: ( '-' )? ( '0' .. '9' )+
            {
            // GremlinParser.g:229:7: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // GremlinParser.g:229:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // GremlinParser.g:229:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // GremlinParser.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G_INT"

    // $ANTLR start "G_LONG"
    public final void mG_LONG() throws RecognitionException {
        try {
            int _type = G_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:233:5: ( ( '-' )? ( '0' .. '9' )+ 'l' )
            // GremlinParser.g:233:7: ( '-' )? ( '0' .. '9' )+ 'l'
            {
            // GremlinParser.g:233:7: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // GremlinParser.g:233:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // GremlinParser.g:233:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // GremlinParser.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G_LONG"

    // $ANTLR start "G_FLOAT"
    public final void mG_FLOAT() throws RecognitionException {
        try {
            int _type = G_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:237:5: ( G_INT '.' G_INT )
            // GremlinParser.g:237:7: G_INT '.' G_INT
            {
            mG_INT(); 


            match('.'); 

            mG_INT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G_FLOAT"

    // $ANTLR start "G_DOUBLE"
    public final void mG_DOUBLE() throws RecognitionException {
        try {
            int _type = G_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:241:5: ( G_FLOAT 'd' )
            // GremlinParser.g:241:7: G_FLOAT 'd'
            {
            mG_FLOAT(); 


            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G_DOUBLE"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:245:5: ( 'true' | 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='t') ) {
                alt9=1;
            }
            else if ( (LA9_0=='f') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // GremlinParser.g:245:7: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // GremlinParser.g:246:7: 'false'
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
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:250:5: ( 'null' )
            // GremlinParser.g:250:7: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:258:5: ( '$' IDENTIFIER )
            // GremlinParser.g:258:9: '$' IDENTIFIER
            {
            match('$'); 

            mIDENTIFIER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:262:2: ( '@' IDENTIFIER )
            // GremlinParser.g:262:4: '@' IDENTIFIER
            {
            match('@'); 

            mIDENTIFIER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROPERTY"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:266:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+ )
            // GremlinParser.g:266:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+
            {
            // GremlinParser.g:266:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '-' && LA10_0 <= '.')||(LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // GremlinParser.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:270:2: ( '\\n' | '\\r' | '\\u2028' | '\\u2029' )
            // GremlinParser.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r'||(input.LA(1) >= '\u2028' && input.LA(1) <= '\u2029') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // GremlinParser.g:277:5: ( ( ' ' | '\\t' )+ )
            // GremlinParser.g:277:7: ( ' ' | '\\t' )+
            {
            // GremlinParser.g:277:7: ( ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // GremlinParser.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DoubleStringCharacter"
    public final void mDoubleStringCharacter() throws RecognitionException {
        try {
            // GremlinParser.g:281:2: (~ ( '\"' | '\\\\' | NEWLINE ) | '\\\\' EscapeSequence )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\u2027')||(LA12_0 >= '\u202A' && LA12_0 <= '\uFFFF')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='\\') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // GremlinParser.g:281:4: ~ ( '\"' | '\\\\' | NEWLINE )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // GremlinParser.g:282:4: '\\\\' EscapeSequence
                    {
                    match('\\'); 

                    mEscapeSequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleStringCharacter"

    // $ANTLR start "SingleStringCharacter"
    public final void mSingleStringCharacter() throws RecognitionException {
        try {
            // GremlinParser.g:286:2: (~ ( '\\'' | '\\\\' | NEWLINE ) | '\\\\' EscapeSequence )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\u2027')||(LA13_0 >= '\u202A' && LA13_0 <= '\uFFFF')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='\\') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // GremlinParser.g:286:4: ~ ( '\\'' | '\\\\' | NEWLINE )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // GremlinParser.g:287:4: '\\\\' EscapeSequence
                    {
                    match('\\'); 

                    mEscapeSequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleStringCharacter"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // GremlinParser.g:291:2: ( CharacterEscapeSequence | '0' | HexEscapeSequence | UnicodeEscapeSequence )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '/')||(LA14_0 >= ':' && LA14_0 <= 't')||(LA14_0 >= 'v' && LA14_0 <= 'w')||(LA14_0 >= 'y' && LA14_0 <= '\u2027')||(LA14_0 >= '\u202A' && LA14_0 <= '\uFFFF')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='0') ) {
                alt14=2;
            }
            else if ( (LA14_0=='x') ) {
                alt14=3;
            }
            else if ( (LA14_0=='u') ) {
                alt14=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // GremlinParser.g:291:4: CharacterEscapeSequence
                    {
                    mCharacterEscapeSequence(); 


                    }
                    break;
                case 2 :
                    // GremlinParser.g:292:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 3 :
                    // GremlinParser.g:293:4: HexEscapeSequence
                    {
                    mHexEscapeSequence(); 


                    }
                    break;
                case 4 :
                    // GremlinParser.g:294:4: UnicodeEscapeSequence
                    {
                    mUnicodeEscapeSequence(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "CharacterEscapeSequence"
    public final void mCharacterEscapeSequence() throws RecognitionException {
        try {
            // GremlinParser.g:298:2: ( SingleEscapeCharacter | NonEscapeCharacter )
            // GremlinParser.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= 't')||(input.LA(1) >= 'v' && input.LA(1) <= 'w')||(input.LA(1) >= 'y' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharacterEscapeSequence"

    // $ANTLR start "NonEscapeCharacter"
    public final void mNonEscapeCharacter() throws RecognitionException {
        try {
            // GremlinParser.g:303:2: (~ ( EscapeCharacter | NEWLINE ) )
            // GremlinParser.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= 'a')||(input.LA(1) >= 'c' && input.LA(1) <= 'e')||(input.LA(1) >= 'g' && input.LA(1) <= 'm')||(input.LA(1) >= 'o' && input.LA(1) <= 'q')||input.LA(1)=='s'||input.LA(1)=='w'||(input.LA(1) >= 'y' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NonEscapeCharacter"

    // $ANTLR start "SingleEscapeCharacter"
    public final void mSingleEscapeCharacter() throws RecognitionException {
        try {
            // GremlinParser.g:307:2: ( '\\'' | '\"' | '\\\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
            // GremlinParser.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleEscapeCharacter"

    // $ANTLR start "EscapeCharacter"
    public final void mEscapeCharacter() throws RecognitionException {
        try {
            // GremlinParser.g:311:2: ( SingleEscapeCharacter | DecimalDigit | 'x' | 'u' )
            // GremlinParser.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1) >= 't' && input.LA(1) <= 'v')||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeCharacter"

    // $ANTLR start "HexEscapeSequence"
    public final void mHexEscapeSequence() throws RecognitionException {
        try {
            // GremlinParser.g:318:2: ( 'x' HexDigit HexDigit )
            // GremlinParser.g:318:4: 'x' HexDigit HexDigit
            {
            match('x'); 

            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexEscapeSequence"

    // $ANTLR start "UnicodeEscapeSequence"
    public final void mUnicodeEscapeSequence() throws RecognitionException {
        try {
            // GremlinParser.g:322:2: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // GremlinParser.g:322:4: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscapeSequence"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // GremlinParser.g:326:2: ( DecimalDigit | ( 'a' .. 'f' ) | ( 'A' .. 'F' ) )
            // GremlinParser.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "DecimalDigit"
    public final void mDecimalDigit() throws RecognitionException {
        try {
            // GremlinParser.g:330:2: ( ( '0' .. '9' ) )
            // GremlinParser.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalDigit"

    public void mTokens() throws RecognitionException {
        // GremlinParser.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | COMMENT | StringLiteral | G_INT | G_LONG | G_FLOAT | G_DOUBLE | BOOLEAN | NULL | VARIABLE | PROPERTY | IDENTIFIER | NEWLINE | WS )
        int alt15=46;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // GremlinParser.g:1:10: T__64
                {
                mT__64(); 


                }
                break;
            case 2 :
                // GremlinParser.g:1:16: T__65
                {
                mT__65(); 


                }
                break;
            case 3 :
                // GremlinParser.g:1:22: T__66
                {
                mT__66(); 


                }
                break;
            case 4 :
                // GremlinParser.g:1:28: T__67
                {
                mT__67(); 


                }
                break;
            case 5 :
                // GremlinParser.g:1:34: T__68
                {
                mT__68(); 


                }
                break;
            case 6 :
                // GremlinParser.g:1:40: T__69
                {
                mT__69(); 


                }
                break;
            case 7 :
                // GremlinParser.g:1:46: T__70
                {
                mT__70(); 


                }
                break;
            case 8 :
                // GremlinParser.g:1:52: T__71
                {
                mT__71(); 


                }
                break;
            case 9 :
                // GremlinParser.g:1:58: T__72
                {
                mT__72(); 


                }
                break;
            case 10 :
                // GremlinParser.g:1:64: T__73
                {
                mT__73(); 


                }
                break;
            case 11 :
                // GremlinParser.g:1:70: T__74
                {
                mT__74(); 


                }
                break;
            case 12 :
                // GremlinParser.g:1:76: T__75
                {
                mT__75(); 


                }
                break;
            case 13 :
                // GremlinParser.g:1:82: T__76
                {
                mT__76(); 


                }
                break;
            case 14 :
                // GremlinParser.g:1:88: T__77
                {
                mT__77(); 


                }
                break;
            case 15 :
                // GremlinParser.g:1:94: T__78
                {
                mT__78(); 


                }
                break;
            case 16 :
                // GremlinParser.g:1:100: T__79
                {
                mT__79(); 


                }
                break;
            case 17 :
                // GremlinParser.g:1:106: T__80
                {
                mT__80(); 


                }
                break;
            case 18 :
                // GremlinParser.g:1:112: T__81
                {
                mT__81(); 


                }
                break;
            case 19 :
                // GremlinParser.g:1:118: T__82
                {
                mT__82(); 


                }
                break;
            case 20 :
                // GremlinParser.g:1:124: T__83
                {
                mT__83(); 


                }
                break;
            case 21 :
                // GremlinParser.g:1:130: T__84
                {
                mT__84(); 


                }
                break;
            case 22 :
                // GremlinParser.g:1:136: T__85
                {
                mT__85(); 


                }
                break;
            case 23 :
                // GremlinParser.g:1:142: T__86
                {
                mT__86(); 


                }
                break;
            case 24 :
                // GremlinParser.g:1:148: T__87
                {
                mT__87(); 


                }
                break;
            case 25 :
                // GremlinParser.g:1:154: T__88
                {
                mT__88(); 


                }
                break;
            case 26 :
                // GremlinParser.g:1:160: T__89
                {
                mT__89(); 


                }
                break;
            case 27 :
                // GremlinParser.g:1:166: T__90
                {
                mT__90(); 


                }
                break;
            case 28 :
                // GremlinParser.g:1:172: T__91
                {
                mT__91(); 


                }
                break;
            case 29 :
                // GremlinParser.g:1:178: T__92
                {
                mT__92(); 


                }
                break;
            case 30 :
                // GremlinParser.g:1:184: T__93
                {
                mT__93(); 


                }
                break;
            case 31 :
                // GremlinParser.g:1:190: T__94
                {
                mT__94(); 


                }
                break;
            case 32 :
                // GremlinParser.g:1:196: T__95
                {
                mT__95(); 


                }
                break;
            case 33 :
                // GremlinParser.g:1:202: T__96
                {
                mT__96(); 


                }
                break;
            case 34 :
                // GremlinParser.g:1:208: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 35 :
                // GremlinParser.g:1:216: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 36 :
                // GremlinParser.g:1:230: G_INT
                {
                mG_INT(); 


                }
                break;
            case 37 :
                // GremlinParser.g:1:236: G_LONG
                {
                mG_LONG(); 


                }
                break;
            case 38 :
                // GremlinParser.g:1:243: G_FLOAT
                {
                mG_FLOAT(); 


                }
                break;
            case 39 :
                // GremlinParser.g:1:251: G_DOUBLE
                {
                mG_DOUBLE(); 


                }
                break;
            case 40 :
                // GremlinParser.g:1:260: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 41 :
                // GremlinParser.g:1:268: NULL
                {
                mNULL(); 


                }
                break;
            case 42 :
                // GremlinParser.g:1:273: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 43 :
                // GremlinParser.g:1:282: PROPERTY
                {
                mPROPERTY(); 


                }
                break;
            case 44 :
                // GremlinParser.g:1:291: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 45 :
                // GremlinParser.g:1:302: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 46 :
                // GremlinParser.g:1:310: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\7\uffff\1\45\1\42\1\uffff\1\50\1\52\1\uffff\1\54\2\uffff\13\42"+
        "\2\uffff\1\74\2\42\6\uffff\1\101\6\uffff\7\42\1\111\1\113\1\42\1"+
        "\115\4\42\1\uffff\1\122\3\42\1\uffff\1\127\1\130\1\42\1\132\3\42"+
        "\1\uffff\1\42\1\uffff\1\137\1\uffff\4\42\1\uffff\1\42\1\144\2\42"+
        "\2\uffff\1\150\1\uffff\1\42\1\152\2\42\1\uffff\1\155\3\42\1\uffff"+
        "\1\161\1\162\1\163\1\uffff\1\42\1\uffff\1\162\1\42\1\uffff\2\42"+
        "\1\170\3\uffff\2\42\1\173\1\174\1\uffff\1\175\1\176\4\uffff";
    static final String DFA15_eofS =
        "\177\uffff";
    static final String DFA15_minS =
        "\1\11\6\uffff\1\55\1\56\1\uffff\2\75\1\uffff\1\75\2\uffff\1\156"+
        "\1\151\1\154\1\141\1\146\1\157\1\162\1\141\1\145\1\143\1\150\2\uffff"+
        "\1\55\1\162\1\165\6\uffff\1\55\6\uffff\1\144\1\166\1\163\1\144\1"+
        "\162\1\156\1\154\2\55\1\144\1\55\1\164\1\160\1\162\1\151\1\uffff"+
        "\2\55\1\165\1\154\1\uffff\2\55\1\145\1\55\1\145\1\143\1\163\1\uffff"+
        "\1\154\1\uffff\1\55\1\uffff\1\150\1\145\1\151\1\154\1\uffff\1\60"+
        "\1\55\1\145\1\154\2\uffff\1\55\1\uffff\1\141\1\55\1\145\1\165\1"+
        "\uffff\1\55\1\141\1\160\1\145\1\uffff\3\55\1\uffff\1\143\1\uffff"+
        "\1\55\1\144\1\uffff\2\164\1\55\3\uffff\1\150\1\145\2\55\1\uffff"+
        "\2\55\4\uffff";
    static final String DFA15_maxS =
        "\1\u2029\6\uffff\1\172\1\56\1\uffff\2\75\1\uffff\1\75\2\uffff\1"+
        "\156\1\151\1\156\1\165\1\156\1\157\1\162\1\141\1\145\1\143\1\150"+
        "\2\uffff\1\172\1\162\1\165\6\uffff\1\172\6\uffff\1\144\1\166\1\163"+
        "\1\144\1\162\1\156\1\154\2\172\1\144\1\172\1\164\1\160\1\162\1\151"+
        "\1\uffff\1\172\1\71\1\165\1\154\1\uffff\2\172\1\145\1\172\1\145"+
        "\1\143\1\163\1\uffff\1\154\1\uffff\1\172\1\uffff\1\150\1\145\1\151"+
        "\1\154\1\uffff\1\71\1\172\1\145\1\154\2\uffff\1\172\1\uffff\1\141"+
        "\1\172\1\145\1\165\1\uffff\1\172\1\141\1\160\1\145\1\uffff\3\172"+
        "\1\uffff\1\143\1\uffff\1\172\1\144\1\uffff\2\164\1\172\3\uffff\1"+
        "\150\1\145\2\172\1\uffff\2\172\4\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\2\uffff\1\16\1\uffff"+
        "\1\21\1\22\13\uffff\1\42\1\43\3\uffff\1\52\1\53\1\54\1\55\1\56\1"+
        "\7\1\uffff\1\13\1\12\1\15\1\14\1\20\1\17\17\uffff\1\44\4\uffff\1"+
        "\10\7\uffff\1\31\1\uffff\1\32\1\uffff\1\35\4\uffff\1\45\4\uffff"+
        "\1\23\1\24\1\uffff\1\26\4\uffff\1\34\4\uffff\1\46\3\uffff\1\25\1"+
        "\uffff\1\30\2\uffff\1\36\3\uffff\1\47\1\50\1\51\4\uffff\1\41\2\uffff"+
        "\1\37\1\40\1\27\1\33";
    static final String DFA15_specialS =
        "\177\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\44\1\43\2\uffff\1\43\22\uffff\1\44\1\1\1\34\1\33\1\40\2\uffff"+
            "\1\34\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\35\1\12\1\uffff\1"+
            "\13\1\14\1\15\1\uffff\1\41\32\42\1\16\1\uffff\1\17\1\uffff\1"+
            "\42\1\uffff\1\20\2\42\1\21\1\22\1\23\2\42\1\24\3\42\1\25\1\37"+
            "\1\26\1\27\1\42\1\30\1\31\1\36\2\42\1\32\3\42\u1fad\uffff\2"+
            "\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\42\1\uffff\12\35\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\46",
            "",
            "\1\47",
            "\1\51",
            "",
            "\1\53",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57\1\uffff\1\60",
            "\1\63\15\uffff\1\61\5\uffff\1\62",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\42\1\76\1\uffff\12\35\7\uffff\32\42\4\uffff\1\42\1\uffff"+
            "\13\42\1\75\16\42",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42"+
            "\1\112\27\42",
            "\1\114",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\123\2\uffff\12\124",
            "\1\125",
            "\1\126",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\131",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\12\124",
            "\2\42\1\uffff\12\124\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42"+
            "\1\145\26\42",
            "\1\146",
            "\1\147",
            "",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\151",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\1\154",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\164",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\2\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | COMMENT | StringLiteral | G_INT | G_LONG | G_FLOAT | G_DOUBLE | BOOLEAN | NULL | VARIABLE | PROPERTY | IDENTIFIER | NEWLINE | WS );";
        }
    }
 

}