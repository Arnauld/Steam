// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g 2011-04-29 17:51:46

  package steam.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SteamLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int Identifier=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int HexLiteral=8;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ComparisonOp=12;
    public static final int DecimalExpLiteral=10;
    public static final int Digit=11;
    public static final int DecimalLiteral=9;
    public static final int IdentifierFirstChar=13;
    public static final int StringLiteral=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int NEWLINE=15;
    public static final int T__35=35;
    public static final int VARIABLE=4;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int IntegerLiteral=7;

    // delegates
    // delegators

    public SteamLexer() {;} 
    public SteamLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SteamLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:7:7: ( ':' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:7:9: ':'
            {
            match(':'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:8:7: ( 'require' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:8:9: 'require'
            {
            match("require"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:9:7: ( ';' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:9:9: ';'
            {
            match(';'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:10:7: ( 'module' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:10:9: 'module'
            {
            match("module"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:11:7: ( 'public' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:11:9: 'public'
            {
            match("public"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:12:7: ( 'var' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:12:9: 'var'
            {
            match("var"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:13:7: ( 'val' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:13:9: 'val'
            {
            match("val"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:14:7: ( '=' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:14:9: '='
            {
            match('='); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:15:7: ( '<' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:15:9: '<'
            {
            match('<'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:16:7: ( '>' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:16:9: '>'
            {
            match('>'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:17:7: ( '~' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:17:9: '~'
            {
            match('~'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:18:7: ( '+' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:18:9: '+'
            {
            match('+'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:19:7: ( '-' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:19:9: '-'
            {
            match('-'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:20:7: ( '*' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:20:9: '*'
            {
            match('*'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:21:7: ( '/' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:21:9: '/'
            {
            match('/'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:22:7: ( 'a' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:22:9: 'a'
            {
            match('a'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:23:7: ( 'z' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:23:9: 'z'
            {
            match('z'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:24:7: ( 'A' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:24:9: 'A'
            {
            match('A'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:25:7: ( 'Z' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:25:9: 'Z'
            {
            match('Z'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:26:7: ( '_' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:26:9: '_'
            {
            match('_'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:27:7: ( '0' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:27:9: '0'
            {
            match('0'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:28:7: ( '9' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:28:9: '9'
            {
            match('9'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:29:7: ( 'def' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:29:9: 'def'
            {
            match("def"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:30:7: ( '(' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:30:9: '('
            {
            match('('); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:31:7: ( ')' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:31:9: ')'
            {
            match(')'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:32:7: ( ',' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:32:9: ','
            {
            match(','); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:7: ( 'match' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:33:9: 'match'
            {
            match("match"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:34:7: ( '{' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:34:9: '{'
            {
            match('{'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:35:7: ( '}' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:35:9: '}'
            {
            match('}'); 

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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:36:7: ( 'case' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:36:9: 'case'
            {
            match("case"); 


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
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:7: ( '=>' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:37:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:135:2: ( '0' .. '9' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:135:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:137:16: ( ( Digit )+ )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:137:19: ( Digit )+
            {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:137:19: ( Digit )+
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
            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:137:19: Digit
            	    {
            	    mDigit(); 

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
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:138:12: ( '0x' ( Digit | 'A' .. 'F' | 'a' .. 'f' )+ )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:138:14: '0x' ( Digit | 'A' .. 'F' | 'a' .. 'f' )+
            {
            match("0x"); 

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:138:19: ( Digit | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:139:16: ( IntegerLiteral '.' IntegerLiteral )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:139:19: IntegerLiteral '.' IntegerLiteral
            {
            mIntegerLiteral(); 
            match('.'); 
            mIntegerLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "DecimalExpLiteral"
    public final void mDecimalExpLiteral() throws RecognitionException {
        try {
            int _type = DecimalExpLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:20: ( ( IntegerLiteral | DecimalLiteral ) ( 'e' | 'E' ) ( '+' | '-' )? IntegerLiteral )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:22: ( IntegerLiteral | DecimalLiteral ) ( 'e' | 'E' ) ( '+' | '-' )? IntegerLiteral
            {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:22: ( IntegerLiteral | DecimalLiteral )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:23: IntegerLiteral
                    {
                    mIntegerLiteral(); 

                    }
                    break;
                case 2 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:40: DecimalLiteral
                    {
                    mDecimalLiteral(); 

                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:140:68: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mIntegerLiteral(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalExpLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:15: ( '\"\"\"' (~ ( '\"\"\"' ) )* '\"\"\"' | '\"' (~ ( '\"' ) )* '\"' | '\\'' (~ ( '\\'' ) )* '\\'' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='\"') ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3=='\"') ) {
                        alt8=1;
                    }
                    else {
                        alt8=2;}
                }
                else if ( ((LA8_1>='\u0000' && LA8_1<='!')||(LA8_1>='#' && LA8_1<='\uFFFF')) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0=='\'') ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:17: '\"\"\"' (~ ( '\"\"\"' ) )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:23: (~ ( '\"\"\"' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\"') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='\"') ) {
                                int LA5_3 = input.LA(3);

                                if ( (LA5_3=='\"') ) {
                                    int LA5_4 = input.LA(4);

                                    if ( ((LA5_4>='\u0000' && LA5_4<='\uFFFF')) ) {
                                        alt5=1;
                                    }


                                }
                                else if ( ((LA5_3>='\u0000' && LA5_3<='!')||(LA5_3>='#' && LA5_3<='\uFFFF')) ) {
                                    alt5=1;
                                }


                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='!')||(LA5_1>='#' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:23: ~ ( '\"\"\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:41: '\"' (~ ( '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:45: (~ ( '\"' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:45: ~ ( '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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
                case 3 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:59: '\\'' (~ ( '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:64: (~ ( '\\'' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:142:64: ~ ( '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
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
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "ComparisonOp"
    public final void mComparisonOp() throws RecognitionException {
        try {
            int _type = ComparisonOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:14: ( '==' | '<' | '>' | '!=' | '<=' | '>=' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt9=1;
                }
                break;
            case '<':
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2=='=') ) {
                    alt9=5;
                }
                else {
                    alt9=2;}
                }
                break;
            case '>':
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3=='=') ) {
                    alt9=6;
                }
                else {
                    alt9=3;}
                }
                break;
            case '!':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:23: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:29: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:35: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 5 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:144:49: '>='
                    {
                    match(">="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComparisonOp"

    // $ANTLR start "IdentifierFirstChar"
    public final void mIdentifierFirstChar() throws RecognitionException {
        try {
            int _type = IdentifierFirstChar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:147:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IdentifierFirstChar"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:150:2: ( IdentifierFirstChar ( IdentifierFirstChar | '0' .. '9' )* )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:150:4: IdentifierFirstChar ( IdentifierFirstChar | '0' .. '9' )*
            {
            mIdentifierFirstChar(); 
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:150:24: ( IdentifierFirstChar | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:
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
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:152:3: ( ( ' ' | '\\t' | '\\u000C' ) )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:152:5: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:155:9: ( ( '\\r' )? '\\n' )
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:155:11: ( '\\r' )? '\\n'
            {
            // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:155:11: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:155:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | IntegerLiteral | HexLiteral | DecimalLiteral | DecimalExpLiteral | StringLiteral | ComparisonOp | IdentifierFirstChar | Identifier | WS | NEWLINE )
        int alt12=41;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:196: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 33 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:211: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 34 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:222: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 35 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:237: DecimalExpLiteral
                {
                mDecimalExpLiteral(); 

                }
                break;
            case 36 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:255: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 37 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:269: ComparisonOp
                {
                mComparisonOp(); 

                }
                break;
            case 38 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:282: IdentifierFirstChar
                {
                mIdentifierFirstChar(); 

                }
                break;
            case 39 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:302: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 40 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:313: WS
                {
                mWS(); 

                }
                break;
            case 41 :
                // /Users/arnauld/Projects/technbolts-steam/src/main/antlr3/Steam.g:1:316: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA3_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "140:22: ( IntegerLiteral | DecimalLiteral )";
        }
    }
    static final String DFA12_eotS =
        "\2\uffff\1\44\1\uffff\3\44\1\53\1\54\1\55\5\uffff\1\56\1\57\1\60"+
        "\1\61\1\62\1\64\1\67\1\44\5\uffff\1\44\1\72\2\uffff\1\44\2\uffff"+
        "\1\45\2\uffff\4\45\16\uffff\2\45\1\uffff\4\45\1\110\1\111\1\112"+
        "\1\113\5\45\4\uffff\1\121\2\45\1\124\1\45\1\uffff\1\45\1\127\1\uffff"+
        "\1\130\1\131\3\uffff";
    static final String DFA12_eofS =
        "\132\uffff";
    static final String DFA12_minS =
        "\1\11\1\uffff\1\60\1\uffff\3\60\3\75\5\uffff\5\60\2\56\1\60\5\uffff"+
        "\1\60\1\56\2\uffff\1\60\2\uffff\1\161\2\uffff\1\144\1\164\1\142"+
        "\1\154\13\uffff\1\60\2\uffff\1\146\1\163\1\uffff\2\165\1\143\1\154"+
        "\4\60\1\145\1\151\1\154\1\150\1\151\4\uffff\1\60\1\162\1\145\1\60"+
        "\1\143\1\uffff\1\145\1\60\1\uffff\2\60\3\uffff";
    static final String DFA12_maxS =
        "\1\176\1\uffff\1\172\1\uffff\3\172\1\76\2\75\5\uffff\5\172\1\170"+
        "\1\145\1\172\5\uffff\1\172\1\145\2\uffff\1\172\2\uffff\1\161\2\uffff"+
        "\1\144\1\164\1\142\1\162\13\uffff\1\71\2\uffff\1\146\1\163\1\uffff"+
        "\2\165\1\143\1\154\2\172\1\145\1\172\1\145\1\151\1\154\1\150\1\151"+
        "\4\uffff\1\172\1\162\1\145\1\172\1\143\1\uffff\1\145\1\172\1\uffff"+
        "\2\172\3\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\6\uffff\1\13\1\14\1\15\1\16\1\17\10\uffff"+
        "\1\30\1\31\1\32\1\34\1\35\2\uffff\1\44\1\45\1\uffff\1\50\1\51\1"+
        "\uffff\1\46\1\47\4\uffff\1\37\1\10\1\11\1\12\1\20\1\21\1\22\1\23"+
        "\1\24\1\41\1\25\1\uffff\1\43\1\26\2\uffff\1\40\15\uffff\1\6\1\7"+
        "\1\42\1\27\5\uffff\1\36\2\uffff\1\33\2\uffff\1\4\1\5\1\2";
    static final String DFA12_specialS =
        "\132\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\41\1\42\1\uffff\1\41\1\42\22\uffff\1\41\1\37\1\36\4\uffff"+
            "\1\36\1\27\1\30\1\15\1\13\1\31\1\14\1\uffff\1\16\1\24\10\35"+
            "\1\25\1\1\1\3\1\10\1\7\1\11\2\uffff\1\21\30\40\1\22\4\uffff"+
            "\1\23\1\uffff\1\17\1\40\1\34\1\26\10\40\1\4\2\40\1\5\1\40\1"+
            "\2\3\40\1\6\3\40\1\20\1\32\1\uffff\1\33\1\12",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\43\25\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\47\15\45\1\46\13"+
            "\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\50\5\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\51\31\45",
            "\1\37\1\52",
            "\1\37",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\65\1\uffff\12\35\13\uffff\1\66\37\uffff\1\66\22\uffff\1"+
            "\63",
            "\1\65\1\uffff\12\35\13\uffff\1\66\37\uffff\1\66",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\70\25\45",
            "",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\71\31\45",
            "\1\65\1\uffff\12\35\13\uffff\1\66\37\uffff\1\66",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\73",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\5\uffff\1\77",
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
            "",
            "\12\101",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\101\13\uffff\1\66\37\uffff\1\66",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\122",
            "\1\123",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\125",
            "",
            "\1\126",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | IntegerLiteral | HexLiteral | DecimalLiteral | DecimalExpLiteral | StringLiteral | ComparisonOp | IdentifierFirstChar | Identifier | WS | NEWLINE );";
        }
    }
 

}