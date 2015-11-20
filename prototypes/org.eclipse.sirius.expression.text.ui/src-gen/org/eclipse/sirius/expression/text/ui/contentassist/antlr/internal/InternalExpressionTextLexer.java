package org.eclipse.sirius.expression.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionTextLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=7;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalExpressionTextLexer() {;} 
    public InternalExpressionTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExpressionTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExpressionText.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionText.g:11:6: ( 'package' )
            // InternalExpressionText.g:11:8: 'package'
            {
            match("package"); 


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
            // InternalExpressionText.g:12:6: ( '{' )
            // InternalExpressionText.g:12:8: '{'
            {
            match('{'); 

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
            // InternalExpressionText.g:13:7: ( '}' )
            // InternalExpressionText.g:13:9: '}'
            {
            match('}'); 

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
            // InternalExpressionText.g:14:7: ( 'class' )
            // InternalExpressionText.g:14:9: 'class'
            {
            match("class"); 


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
            // InternalExpressionText.g:15:7: ( '.' )
            // InternalExpressionText.g:15:9: '.'
            {
            match('.'); 

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
            // InternalExpressionText.g:16:7: ( 'var' )
            // InternalExpressionText.g:16:9: 'var'
            {
            match("var"); 


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
            // InternalExpressionText.g:17:7: ( ':' )
            // InternalExpressionText.g:17:9: ':'
            {
            match(':'); 

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
            // InternalExpressionText.g:18:7: ( 'exp' )
            // InternalExpressionText.g:18:9: 'exp'
            {
            match("exp"); 


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
            // InternalExpressionText.g:19:7: ( '(' )
            // InternalExpressionText.g:19:9: '('
            {
            match('('); 

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
            // InternalExpressionText.g:20:7: ( ')' )
            // InternalExpressionText.g:20:9: ')'
            {
            match(')'); 

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
            // InternalExpressionText.g:21:7: ( '[' )
            // InternalExpressionText.g:21:9: '['
            {
            match('['); 

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
            // InternalExpressionText.g:22:7: ( '..' )
            // InternalExpressionText.g:22:9: '..'
            {
            match(".."); 


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
            // InternalExpressionText.g:23:7: ( ']' )
            // InternalExpressionText.g:23:9: ']'
            {
            match(']'); 

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
            // InternalExpressionText.g:24:7: ( 'userDefinedVariableContainers' )
            // InternalExpressionText.g:24:9: 'userDefinedVariableContainers'
            {
            match("userDefinedVariableContainers"); 


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
            // InternalExpressionText.g:25:7: ( '=' )
            // InternalExpressionText.g:25:9: '='
            {
            match('='); 

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
            // InternalExpressionText.g:26:7: ( ',' )
            // InternalExpressionText.g:26:9: ','
            {
            match(','); 

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
            // InternalExpressionText.g:27:7: ( '-' )
            // InternalExpressionText.g:27:9: '-'
            {
            match('-'); 

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
            // InternalExpressionText.g:28:7: ( 'optional' )
            // InternalExpressionText.g:28:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionText.g:2189:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalExpressionText.g:2189:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalExpressionText.g:2189:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressionText.g:2189:11: '^'
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

            // InternalExpressionText.g:2189:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExpressionText.g:
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
            	    break loop2;
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
            // InternalExpressionText.g:2191:10: ( ( '0' .. '9' )+ )
            // InternalExpressionText.g:2191:12: ( '0' .. '9' )+
            {
            // InternalExpressionText.g:2191:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExpressionText.g:2191:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionText.g:2193:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExpressionText.g:2193:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExpressionText.g:2193:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressionText.g:2193:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExpressionText.g:2195:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExpressionText.g:2195:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExpressionText.g:2195:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExpressionText.g:
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
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalExpressionText.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS )
        int alt6=22;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalExpressionText.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalExpressionText.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalExpressionText.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalExpressionText.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // InternalExpressionText.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // InternalExpressionText.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // InternalExpressionText.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // InternalExpressionText.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // InternalExpressionText.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // InternalExpressionText.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // InternalExpressionText.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // InternalExpressionText.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // InternalExpressionText.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // InternalExpressionText.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // InternalExpressionText.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // InternalExpressionText.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // InternalExpressionText.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // InternalExpressionText.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // InternalExpressionText.g:1:116: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalExpressionText.g:1:124: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalExpressionText.g:1:133: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // InternalExpressionText.g:1:149: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\22\2\uffff\1\22\1\31\1\22\1\uffff\1\22\4\uffff\1\22\3\uffff\1\22\4\uffff\2\22\2\uffff\6\22\1\46\1\47\4\22\2\uffff\3\22\1\57\3\22\1\uffff\2\22\1\65\2\22\1\uffff\1\22\1\71\1\22\1\uffff\23\22\1\116\1\uffff";
    static final String DFA6_eofS =
        "\117\uffff";
    static final String DFA6_minS =
        "\1\11\1\141\2\uffff\1\154\1\56\1\141\1\uffff\1\170\4\uffff\1\163\3\uffff\1\160\4\uffff\1\143\1\141\2\uffff\1\162\1\160\1\145\1\164\1\153\1\163\2\60\1\162\1\151\1\141\1\163\2\uffff\1\104\1\157\1\147\1\60\1\145\1\156\1\145\1\uffff\1\146\1\141\1\60\1\151\1\154\1\uffff\1\156\1\60\1\145\1\uffff\1\144\1\126\1\141\1\162\1\151\1\141\1\142\1\154\1\145\1\103\1\157\1\156\1\164\1\141\1\151\1\156\1\145\1\162\1\163\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\141\2\uffff\1\154\1\56\1\141\1\uffff\1\170\4\uffff\1\163\3\uffff\1\160\4\uffff\1\143\1\141\2\uffff\1\162\1\160\1\145\1\164\1\153\1\163\2\172\1\162\1\151\1\141\1\163\2\uffff\1\104\1\157\1\147\1\172\1\145\1\156\1\145\1\uffff\1\146\1\141\1\172\1\151\1\154\1\uffff\1\156\1\172\1\145\1\uffff\1\144\1\126\1\141\1\162\1\151\1\141\1\142\1\154\1\145\1\103\1\157\1\156\1\164\1\141\1\151\1\156\1\145\1\162\1\163\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\1\uffff\1\11\1\12\1\13\1\15\1\uffff\1\17\1\20\1\21\1\uffff\1\23\1\24\1\25\1\26\2\uffff\1\14\1\5\14\uffff\1\6\1\10\7\uffff\1\4\5\uffff\1\1\3\uffff\1\22\24\uffff\1\16";
    static final String DFA6_specialS =
        "\117\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\7\uffff\1\11\1\12\2\uffff\1\17\1\20\1\5\1\24\12\23\1\7\2\uffff\1\16\3\uffff\32\22\1\13\1\uffff\1\14\2\22\1\uffff\2\22\1\4\1\22\1\10\11\22\1\21\1\1\4\22\1\15\1\6\4\22\1\2\1\uffff\1\3",
            "\1\26",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\32",
            "",
            "\1\33",
            "",
            "",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS );";
        }
    }
 

}