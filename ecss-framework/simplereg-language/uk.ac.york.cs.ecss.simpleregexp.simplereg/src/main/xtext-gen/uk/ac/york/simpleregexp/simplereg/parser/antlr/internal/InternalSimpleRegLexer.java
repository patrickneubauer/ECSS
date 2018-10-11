package uk.ac.york.simpleregexp.simplereg.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleRegLexer extends Lexer {
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int RULE_MULTICHARTERMINAL=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TSINGLECHARS=5;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalSimpleRegLexer() {;} 
    public InternalSimpleRegLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSimpleRegLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSimpleReg.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleReg.g:11:6: ( '|' )
            // InternalSimpleReg.g:11:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleReg.g:12:6: ( '?' )
            // InternalSimpleReg.g:12:8: '?'
            {
            match('?'); 

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
            // InternalSimpleReg.g:13:6: ( '*' )
            // InternalSimpleReg.g:13:8: '*'
            {
            match('*'); 

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
            // InternalSimpleReg.g:14:7: ( '+' )
            // InternalSimpleReg.g:14:9: '+'
            {
            match('+'); 

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
            // InternalSimpleReg.g:15:7: ( '{' )
            // InternalSimpleReg.g:15:9: '{'
            {
            match('{'); 

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
            // InternalSimpleReg.g:16:7: ( ',' )
            // InternalSimpleReg.g:16:9: ','
            {
            match(','); 

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
            // InternalSimpleReg.g:17:7: ( '}' )
            // InternalSimpleReg.g:17:9: '}'
            {
            match('}'); 

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
            // InternalSimpleReg.g:18:7: ( '(' )
            // InternalSimpleReg.g:18:9: '('
            {
            match('('); 

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
            // InternalSimpleReg.g:19:7: ( ')' )
            // InternalSimpleReg.g:19:9: ')'
            {
            match(')'); 

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
            // InternalSimpleReg.g:20:7: ( 'test2' )
            // InternalSimpleReg.g:20:9: 'test2'
            {
            match("test2"); 


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
            // InternalSimpleReg.g:21:7: ( '.' )
            // InternalSimpleReg.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleReg.g:601:10: ( ( '0' .. '9' )+ )
            // InternalSimpleReg.g:601:12: ( '0' .. '9' )+
            {
            // InternalSimpleReg.g:601:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleReg.g:601:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_MULTICHARTERMINAL"
    public final void mRULE_MULTICHARTERMINAL() throws RecognitionException {
        try {
            int _type = RULE_MULTICHARTERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleReg.g:603:24: ( '[' ( options {greedy=false; } : . )* ']' )
            // InternalSimpleReg.g:603:26: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 
            // InternalSimpleReg.g:603:30: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==']') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\\')||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimpleReg.g:603:58: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTICHARTERMINAL"

    // $ANTLR start "RULE_TSINGLECHARS"
    public final void mRULE_TSINGLECHARS() throws RecognitionException {
        try {
            int _type = RULE_TSINGLECHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSimpleReg.g:605:19: ( ( '\\\\' . | ~ ( ( '[' | ')' | '{' | '}' | ']' | '\\\\' | '(' | '|' | '.' ) ) )+ )
            // InternalSimpleReg.g:605:21: ( '\\\\' . | ~ ( ( '[' | ')' | '{' | '}' | ']' | '\\\\' | '(' | '|' | '.' ) ) )+
            {
            // InternalSimpleReg.g:605:21: ( '\\\\' . | ~ ( ( '[' | ')' | '{' | '}' | ']' | '\\\\' | '(' | '|' | '.' ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\'')||(LA3_0>='*' && LA3_0<='-')||(LA3_0>='/' && LA3_0<='Z')||(LA3_0>='^' && LA3_0<='z')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleReg.g:605:22: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSimpleReg.g:605:29: ~ ( ( '[' | ')' | '{' | '}' | ']' | '\\\\' | '(' | '|' | '.' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TSINGLECHARS"

    public void mTokens() throws RecognitionException {
        // InternalSimpleReg.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_INT | RULE_MULTICHARTERMINAL | RULE_TSINGLECHARS )
        int alt4=14;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // InternalSimpleReg.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // InternalSimpleReg.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // InternalSimpleReg.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // InternalSimpleReg.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // InternalSimpleReg.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // InternalSimpleReg.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // InternalSimpleReg.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // InternalSimpleReg.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // InternalSimpleReg.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // InternalSimpleReg.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // InternalSimpleReg.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // InternalSimpleReg.g:1:73: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalSimpleReg.g:1:82: RULE_MULTICHARTERMINAL
                {
                mRULE_MULTICHARTERMINAL(); 

                }
                break;
            case 14 :
                // InternalSimpleReg.g:1:105: RULE_TSINGLECHARS
                {
                mRULE_TSINGLECHARS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\1\17\1\20\1\21\1\uffff\1\22\3\uffff\1\16\1\uffff\1\24\6\uffff\1\16\1\uffff\2\16\1\30\1\uffff";
    static final String DFA4_eofS =
        "\31\uffff";
    static final String DFA4_minS =
        "\1\0\1\uffff\3\0\1\uffff\1\0\3\uffff\1\145\1\uffff\1\0\6\uffff\1\163\1\uffff\1\164\1\62\1\0\1\uffff";
    static final String DFA4_maxS =
        "\1\uffff\1\uffff\3\uffff\1\uffff\1\uffff\3\uffff\1\145\1\uffff\1\uffff\6\uffff\1\163\1\uffff\1\164\1\62\1\uffff\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\13\1\uffff\1\15\1\16\1\2\1\3\1\4\1\6\1\uffff\1\14\3\uffff\1\12";
    static final String DFA4_specialS =
        "\1\5\1\uffff\1\1\1\2\1\3\1\uffff\1\0\5\uffff\1\6\12\uffff\1\4\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\50\16\1\10\1\11\1\3\1\4\1\6\1\16\1\13\1\16\12\14\5\16\1\2\33\16\1\15\1\16\1\uffff\26\16\1\12\6\16\1\5\1\1\1\7\uff82\16",
            "",
            "\50\16\2\uffff\4\16\1\uffff\54\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            "\50\16\2\uffff\4\16\1\uffff\54\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            "\50\16\2\uffff\4\16\1\uffff\54\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            "",
            "\50\16\2\uffff\4\16\1\uffff\54\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            "",
            "",
            "",
            "\1\23",
            "",
            "\50\16\2\uffff\4\16\1\uffff\1\16\12\14\41\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "",
            "\1\26",
            "\1\27",
            "\50\16\2\uffff\4\16\1\uffff\54\16\1\uffff\1\16\1\uffff\35\16\3\uffff\uff82\16",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_INT | RULE_MULTICHARTERMINAL | RULE_TSINGLECHARS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_6 = input.LA(1);

                        s = -1;
                        if ( ((LA4_6>='\u0000' && LA4_6<='\'')||(LA4_6>='*' && LA4_6<='-')||(LA4_6>='/' && LA4_6<='Z')||LA4_6=='\\'||(LA4_6>='^' && LA4_6<='z')||(LA4_6>='~' && LA4_6<='\uFFFF')) ) {s = 14;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                        s = -1;
                        if ( ((LA4_2>='\u0000' && LA4_2<='\'')||(LA4_2>='*' && LA4_2<='-')||(LA4_2>='/' && LA4_2<='Z')||LA4_2=='\\'||(LA4_2>='^' && LA4_2<='z')||(LA4_2>='~' && LA4_2<='\uFFFF')) ) {s = 14;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_3 = input.LA(1);

                        s = -1;
                        if ( ((LA4_3>='\u0000' && LA4_3<='\'')||(LA4_3>='*' && LA4_3<='-')||(LA4_3>='/' && LA4_3<='Z')||LA4_3=='\\'||(LA4_3>='^' && LA4_3<='z')||(LA4_3>='~' && LA4_3<='\uFFFF')) ) {s = 14;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_4 = input.LA(1);

                        s = -1;
                        if ( ((LA4_4>='\u0000' && LA4_4<='\'')||(LA4_4>='*' && LA4_4<='-')||(LA4_4>='/' && LA4_4<='Z')||LA4_4=='\\'||(LA4_4>='^' && LA4_4<='z')||(LA4_4>='~' && LA4_4<='\uFFFF')) ) {s = 14;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_23 = input.LA(1);

                        s = -1;
                        if ( ((LA4_23>='\u0000' && LA4_23<='\'')||(LA4_23>='*' && LA4_23<='-')||(LA4_23>='/' && LA4_23<='Z')||LA4_23=='\\'||(LA4_23>='^' && LA4_23<='z')||(LA4_23>='~' && LA4_23<='\uFFFF')) ) {s = 14;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='|') ) {s = 1;}

                        else if ( (LA4_0=='?') ) {s = 2;}

                        else if ( (LA4_0=='*') ) {s = 3;}

                        else if ( (LA4_0=='+') ) {s = 4;}

                        else if ( (LA4_0=='{') ) {s = 5;}

                        else if ( (LA4_0==',') ) {s = 6;}

                        else if ( (LA4_0=='}') ) {s = 7;}

                        else if ( (LA4_0=='(') ) {s = 8;}

                        else if ( (LA4_0==')') ) {s = 9;}

                        else if ( (LA4_0=='t') ) {s = 10;}

                        else if ( (LA4_0=='.') ) {s = 11;}

                        else if ( ((LA4_0>='0' && LA4_0<='9')) ) {s = 12;}

                        else if ( (LA4_0=='[') ) {s = 13;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\'')||LA4_0=='-'||LA4_0=='/'||(LA4_0>=':' && LA4_0<='>')||(LA4_0>='@' && LA4_0<='Z')||LA4_0=='\\'||(LA4_0>='^' && LA4_0<='s')||(LA4_0>='u' && LA4_0<='z')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_12 = input.LA(1);

                        s = -1;
                        if ( ((LA4_12>='\u0000' && LA4_12<='\'')||(LA4_12>='*' && LA4_12<='-')||LA4_12=='/'||(LA4_12>=':' && LA4_12<='Z')||LA4_12=='\\'||(LA4_12>='^' && LA4_12<='z')||(LA4_12>='~' && LA4_12<='\uFFFF')) ) {s = 14;}

                        else if ( ((LA4_12>='0' && LA4_12<='9')) ) {s = 12;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}