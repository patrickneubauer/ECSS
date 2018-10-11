package uk.ac.york.cs.ecss.language.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcssLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_QUALIFIEDNAME=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_TEST3=10;
    public static final int T__31=31;
    public static final int RULE_TEST2=11;
    public static final int T__32=32;
    public static final int RULE_TEST1=9;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalEcssLanguageLexer() {;} 
    public InternalEcssLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEcssLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEcssLanguage.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:11:7: ( 'Config' )
            // InternalEcssLanguage.g:11:9: 'Config'
            {
            match("Config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:12:7: ( '{' )
            // InternalEcssLanguage.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:13:7: ( '}' )
            // InternalEcssLanguage.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:14:7: ( 'import' )
            // InternalEcssLanguage.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:15:7: ( ';' )
            // InternalEcssLanguage.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:16:7: ( 'template' )
            // InternalEcssLanguage.g:16:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:17:7: ( ':' )
            // InternalEcssLanguage.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:18:7: ( 'templateGen' )
            // InternalEcssLanguage.g:18:9: 'templateGen'
            {
            match("templateGen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:19:7: ( 'extends' )
            // InternalEcssLanguage.g:19:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:20:7: ( 'javarule' )
            // InternalEcssLanguage.g:20:9: 'javarule'
            {
            match("javarule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:21:7: ( '::' )
            // InternalEcssLanguage.g:21:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:22:7: ( 'rule' )
            // InternalEcssLanguage.g:22:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:23:7: ( 'with' )
            // InternalEcssLanguage.g:23:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:24:7: ( ',' )
            // InternalEcssLanguage.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:25:7: ( 'id' )
            // InternalEcssLanguage.g:25:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:26:7: ( 'for' )
            // InternalEcssLanguage.g:26:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:27:7: ( 'join' )
            // InternalEcssLanguage.g:27:9: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:28:7: ( 'if' )
            // InternalEcssLanguage.g:28:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:29:7: ( '(' )
            // InternalEcssLanguage.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:30:7: ( ')' )
            // InternalEcssLanguage.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:31:7: ( 'else' )
            // InternalEcssLanguage.g:31:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:32:7: ( '$' )
            // InternalEcssLanguage.g:32:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:33:7: ( '\\u00A7' )
            // InternalEcssLanguage.g:33:9: '\\u00A7'
            {
            match('\u00A7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:34:7: ( '[' )
            // InternalEcssLanguage.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:35:7: ( ']' )
            // InternalEcssLanguage.g:35:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:36:7: ( '..' )
            // InternalEcssLanguage.g:36:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:37:7: ( '$#' )
            // InternalEcssLanguage.g:37:9: '$#'
            {
            match("$#"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:38:7: ( '#' )
            // InternalEcssLanguage.g:38:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:39:7: ( '-' )
            // InternalEcssLanguage.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:40:7: ( 'slot' )
            // InternalEcssLanguage.g:40:9: 'slot'
            {
            match("slot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:41:7: ( 'ocl' )
            // InternalEcssLanguage.g:41:9: 'ocl'
            {
            match("ocl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:42:7: ( 'minImprovement' )
            // InternalEcssLanguage.g:42:9: 'minImprovement'
            {
            match("minImprovement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:43:7: ( 'maxDegression' )
            // InternalEcssLanguage.g:43:9: 'maxDegression'
            {
            match("maxDegression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:44:7: ( 'maxThings' )
            // InternalEcssLanguage.g:44:9: 'maxThings'
            {
            match("maxThings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:45:7: ( '@' )
            // InternalEcssLanguage.g:45:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:46:7: ( '*' )
            // InternalEcssLanguage.g:46:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_QUALIFIEDNAME"
    public final void mRULE_QUALIFIEDNAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIEDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6781:20: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalEcssLanguage.g:6781:22: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalEcssLanguage.g:6781:30: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEcssLanguage.g:6781:31: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIEDNAME"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6783:13: ( RULE_INT '.' ( RULE_INT )? )
            // InternalEcssLanguage.g:6783:15: RULE_INT '.' ( RULE_INT )?
            {
            mRULE_INT(); 
            match('.'); 
            // InternalEcssLanguage.g:6783:28: ( RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEcssLanguage.g:6783:28: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_TEST1"
    public final void mRULE_TEST1() throws RecognitionException {
        try {
            int _type = RULE_TEST1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6785:12: ( 'test1' )
            // InternalEcssLanguage.g:6785:14: 'test1'
            {
            match("test1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEST1"

    // $ANTLR start "RULE_TEST3"
    public final void mRULE_TEST3() throws RecognitionException {
        try {
            int _type = RULE_TEST3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6787:12: ( 'test3' )
            // InternalEcssLanguage.g:6787:14: 'test3'
            {
            match("test3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEST3"

    // $ANTLR start "RULE_TEST2"
    public final void mRULE_TEST2() throws RecognitionException {
        try {
            int _type = RULE_TEST2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6789:12: ( 'test2' )
            // InternalEcssLanguage.g:6789:14: 'test2'
            {
            match("test2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEST2"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6791:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEcssLanguage.g:6791:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEcssLanguage.g:6791:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEcssLanguage.g:6791:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEcssLanguage.g:6791:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEcssLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6793:10: ( ( '0' .. '9' )+ )
            // InternalEcssLanguage.g:6793:12: ( '0' .. '9' )+
            {
            // InternalEcssLanguage.g:6793:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEcssLanguage.g:6793:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6795:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEcssLanguage.g:6795:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEcssLanguage.g:6795:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEcssLanguage.g:6795:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEcssLanguage.g:6795:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:6795:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEcssLanguage.g:6795:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:6795:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEcssLanguage.g:6795:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:6795:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEcssLanguage.g:6795:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6797:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEcssLanguage.g:6797:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEcssLanguage.g:6797:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEcssLanguage.g:6797:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6799:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEcssLanguage.g:6799:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEcssLanguage.g:6799:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEcssLanguage.g:6799:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalEcssLanguage.g:6799:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEcssLanguage.g:6799:41: ( '\\r' )? '\\n'
                    {
                    // InternalEcssLanguage.g:6799:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEcssLanguage.g:6799:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6801:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEcssLanguage.g:6801:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEcssLanguage.g:6801:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEcssLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcssLanguage.g:6803:16: ( . )
            // InternalEcssLanguage.g:6803:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEcssLanguage.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_QUALIFIEDNAME | RULE_NUMBER | RULE_TEST1 | RULE_TEST3 | RULE_TEST2 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=48;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalEcssLanguage.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalEcssLanguage.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalEcssLanguage.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalEcssLanguage.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalEcssLanguage.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalEcssLanguage.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalEcssLanguage.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalEcssLanguage.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalEcssLanguage.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalEcssLanguage.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalEcssLanguage.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalEcssLanguage.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalEcssLanguage.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalEcssLanguage.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalEcssLanguage.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalEcssLanguage.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalEcssLanguage.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalEcssLanguage.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalEcssLanguage.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalEcssLanguage.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalEcssLanguage.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalEcssLanguage.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalEcssLanguage.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalEcssLanguage.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalEcssLanguage.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalEcssLanguage.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalEcssLanguage.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalEcssLanguage.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalEcssLanguage.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalEcssLanguage.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalEcssLanguage.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalEcssLanguage.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalEcssLanguage.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalEcssLanguage.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalEcssLanguage.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalEcssLanguage.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalEcssLanguage.g:1:226: RULE_QUALIFIEDNAME
                {
                mRULE_QUALIFIEDNAME(); 

                }
                break;
            case 38 :
                // InternalEcssLanguage.g:1:245: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 39 :
                // InternalEcssLanguage.g:1:257: RULE_TEST1
                {
                mRULE_TEST1(); 

                }
                break;
            case 40 :
                // InternalEcssLanguage.g:1:268: RULE_TEST3
                {
                mRULE_TEST3(); 

                }
                break;
            case 41 :
                // InternalEcssLanguage.g:1:279: RULE_TEST2
                {
                mRULE_TEST2(); 

                }
                break;
            case 42 :
                // InternalEcssLanguage.g:1:290: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // InternalEcssLanguage.g:1:298: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // InternalEcssLanguage.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalEcssLanguage.g:1:319: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalEcssLanguage.g:1:335: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalEcssLanguage.g:1:351: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalEcssLanguage.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\46\2\uffff\1\46\1\uffff\1\46\1\60\4\46\1\uffff\1\46\2\uffff\1\74\3\uffff\1\43\2\uffff\3\46\2\uffff\1\43\1\46\1\112\3\43\2\uffff\2\46\4\uffff\1\46\1\123\1\124\1\uffff\1\46\2\uffff\6\46\1\uffff\1\46\12\uffff\4\46\2\uffff\1\46\2\uffff\1\112\4\uffff\2\46\2\uffff\10\46\1\154\1\46\1\156\7\46\1\171\1\46\1\173\1\174\1\175\1\uffff\1\176\1\uffff\6\46\1\u0085\1\u0086\1\u0087\1\46\1\uffff\1\46\4\uffff\3\46\1\u008d\1\u008e\1\46\3\uffff\5\46\2\uffff\1\46\1\u0096\4\46\1\u009c\1\uffff\1\u009d\4\46\2\uffff\2\46\1\u00a4\3\46\1\uffff\1\u00a8\2\46\1\uffff\3\46\1\u00ae\1\u00af\2\uffff";
    static final String DFA14_eofS =
        "\u00b0\uffff";
    static final String DFA14_minS =
        "\1\0\1\56\2\uffff\1\56\1\uffff\1\56\1\72\4\56\1\uffff\1\56\2\uffff\1\43\3\uffff\1\56\2\uffff\3\56\2\uffff\1\101\2\56\2\0\1\52\2\uffff\2\56\4\uffff\3\56\1\uffff\1\56\2\uffff\6\56\1\uffff\1\56\12\uffff\4\56\2\uffff\1\56\2\uffff\1\56\4\uffff\2\56\2\uffff\27\56\1\uffff\1\56\1\uffff\12\56\1\uffff\1\56\4\uffff\6\56\3\uffff\5\56\2\uffff\7\56\1\uffff\5\56\2\uffff\6\56\1\uffff\3\56\1\uffff\5\56\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\72\4\172\1\uffff\1\172\2\uffff\1\43\3\uffff\1\56\2\uffff\3\172\2\uffff\2\172\1\71\2\uffff\1\57\2\uffff\2\172\4\uffff\3\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\12\uffff\4\172\2\uffff\1\172\2\uffff\1\71\4\uffff\2\172\2\uffff\27\172\1\uffff\1\172\1\uffff\12\172\1\uffff\1\172\4\uffff\6\172\3\uffff\5\172\2\uffff\7\172\1\uffff\5\172\2\uffff\6\172\1\uffff\3\172\1\uffff\5\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\6\uffff\1\16\1\uffff\1\23\1\24\1\uffff\1\27\1\30\1\31\1\uffff\1\34\1\35\3\uffff\1\43\1\44\6\uffff\1\57\1\60\2\uffff\1\52\1\45\1\2\1\3\3\uffff\1\5\1\uffff\1\13\1\7\6\uffff\1\16\1\uffff\1\23\1\24\1\33\1\26\1\27\1\30\1\31\1\32\1\34\1\35\4\uffff\1\43\1\44\1\uffff\1\53\1\46\1\uffff\1\54\1\55\1\56\1\57\2\uffff\1\17\1\22\27\uffff\1\20\1\uffff\1\37\12\uffff\1\25\1\uffff\1\21\1\14\1\15\1\36\6\uffff\1\47\1\50\1\51\5\uffff\1\1\1\4\7\uffff\1\11\5\uffff\1\6\1\12\6\uffff\1\42\3\uffff\1\10\5\uffff\1\41\1\40";
    static final String DFA14_specialS =
        "\1\1\36\uffff\1\2\1\0\u008f\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\1\25\1\20\2\43\1\40\1\16\1\17\1\33\1\43\1\14\1\26\1\24\1\41\12\36\1\7\1\5\4\43\1\32\2\35\1\1\27\35\1\22\1\43\1\23\1\34\1\35\1\43\4\35\1\10\1\15\2\35\1\4\1\11\2\35\1\31\1\35\1\30\2\35\1\12\1\27\1\6\2\35\1\13\3\35\1\2\1\43\1\3\51\43\1\21\uff58\43",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\44\13\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\53\1\45\1\54\6\45\1\52\15\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\56\25\45",
            "\1\57",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\62\13\45\1\61\2\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\63\15\45\1\64\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\65\5\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\66\21\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\70\13\45",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\103\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45\1\104\27\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\106\7\45\1\105\21\45",
            "",
            "",
            "\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\113\1\uffff\12\114",
            "\0\115",
            "\0\115",
            "\1\116\4\uffff\1\117",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\121\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\122\12\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\125\5\45\1\126\7\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\127\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\130\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\25\45\1\131\4\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\132\21\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\133\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\134\6\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\135\10\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\136\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\137\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\140\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\27\45\1\141\2\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\113\1\uffff\12\114",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\5\45\1\142\24\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\143\13\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\144\12\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\145\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\146\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\147\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\150\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\151\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\152\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\153\22\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\155\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\10\45\1\157\21\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\3\45\1\160\17\45\1\161\6\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\162\21\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\163\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\164\16\45",
            "\1\47\1\uffff\1\45\1\165\1\167\1\166\6\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\170\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\172\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\177\15\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0080\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\u0081\22\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\u0082\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u0083\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u0084\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45\1\u0088\26\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\u0089\5\45",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\u008a\12\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\u008b\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\u008c\21\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u008f\6\45",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u0090\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\u0091\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u0092\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u0093\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u0094\14\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0095\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0097\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\u0098\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0099\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\u009a\23\45",
            "\1\47\1\uffff\12\45\7\uffff\6\45\1\u009b\23\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\25\45\1\u009e\4\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u009f\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00a0\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u00a1\25\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u00a2\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\u00a3\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u00a5\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\u00a6\15\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\u00a7\21\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u00a9\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\u00aa\13\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u00ab\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u00ac\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u00ad\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_QUALIFIEDNAME | RULE_NUMBER | RULE_TEST1 | RULE_TEST3 | RULE_TEST2 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 77;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='C') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='i') ) {s = 4;}

                        else if ( (LA14_0==';') ) {s = 5;}

                        else if ( (LA14_0=='t') ) {s = 6;}

                        else if ( (LA14_0==':') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='j') ) {s = 9;}

                        else if ( (LA14_0=='r') ) {s = 10;}

                        else if ( (LA14_0=='w') ) {s = 11;}

                        else if ( (LA14_0==',') ) {s = 12;}

                        else if ( (LA14_0=='f') ) {s = 13;}

                        else if ( (LA14_0=='(') ) {s = 14;}

                        else if ( (LA14_0==')') ) {s = 15;}

                        else if ( (LA14_0=='$') ) {s = 16;}

                        else if ( (LA14_0=='\u00A7') ) {s = 17;}

                        else if ( (LA14_0=='[') ) {s = 18;}

                        else if ( (LA14_0==']') ) {s = 19;}

                        else if ( (LA14_0=='.') ) {s = 20;}

                        else if ( (LA14_0=='#') ) {s = 21;}

                        else if ( (LA14_0=='-') ) {s = 22;}

                        else if ( (LA14_0=='s') ) {s = 23;}

                        else if ( (LA14_0=='o') ) {s = 24;}

                        else if ( (LA14_0=='m') ) {s = 25;}

                        else if ( (LA14_0=='@') ) {s = 26;}

                        else if ( (LA14_0=='*') ) {s = 27;}

                        else if ( (LA14_0=='^') ) {s = 28;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='k' && LA14_0<='l')||LA14_0=='n'||(LA14_0>='p' && LA14_0<='q')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 29;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 30;}

                        else if ( (LA14_0=='\"') ) {s = 31;}

                        else if ( (LA14_0=='\'') ) {s = 32;}

                        else if ( (LA14_0=='/') ) {s = 33;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 34;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='+'||(LA14_0>='<' && LA14_0<='?')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\u00A6')||(LA14_0>='\u00A8' && LA14_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 77;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}