package uk.ac.york.simpleregexp.simplereg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.simpleregexp.simplereg.services.SimpleRegGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleRegParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_TSINGLECHARS", "RULE_MULTICHARTERMINAL", "'|'", "'?'", "'*'", "'+'", "'{'", "','", "'}'", "'('", "')'", "'test2'", "'.'"
    };
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


        public InternalSimpleRegParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleRegParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleRegParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleReg.g"; }



     	private SimpleRegGrammarAccess grammarAccess;

        public InternalSimpleRegParser(TokenStream input, SimpleRegGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RegexAlternatives";
       	}

       	@Override
       	protected SimpleRegGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRegexAlternatives"
    // InternalSimpleReg.g:64:1: entryRuleRegexAlternatives returns [EObject current=null] : iv_ruleRegexAlternatives= ruleRegexAlternatives EOF ;
    public final EObject entryRuleRegexAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexAlternatives = null;


        try {
            // InternalSimpleReg.g:64:58: (iv_ruleRegexAlternatives= ruleRegexAlternatives EOF )
            // InternalSimpleReg.g:65:2: iv_ruleRegexAlternatives= ruleRegexAlternatives EOF
            {
             newCompositeNode(grammarAccess.getRegexAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexAlternatives=ruleRegexAlternatives();

            state._fsp--;

             current =iv_ruleRegexAlternatives; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegexAlternatives"


    // $ANTLR start "ruleRegexAlternatives"
    // InternalSimpleReg.g:71:1: ruleRegexAlternatives returns [EObject current=null] : (this_RegexGroup_0= ruleRegexGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )? ) ;
    public final EObject ruleRegexAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RegexGroup_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:77:2: ( (this_RegexGroup_0= ruleRegexGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )? ) )
            // InternalSimpleReg.g:78:2: (this_RegexGroup_0= ruleRegexGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )? )
            {
            // InternalSimpleReg.g:78:2: (this_RegexGroup_0= ruleRegexGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )? )
            // InternalSimpleReg.g:79:3: this_RegexGroup_0= ruleRegexGroup ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getRegexAlternativesAccess().getRegexGroupParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_RegexGroup_0=ruleRegexGroup();

            state._fsp--;


            			current = this_RegexGroup_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleReg.g:87:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==7) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimpleReg.g:88:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+
                    {
                    // InternalSimpleReg.g:88:4: ()
                    // InternalSimpleReg.g:89:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRegexAlternativesAccess().getRegexAlternativesElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSimpleReg.g:95:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==7) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSimpleReg.g:96:5: otherlv_2= '|' ( (lv_elements_3_0= ruleRegexGroup ) )
                    	    {
                    	    otherlv_2=(Token)match(input,7,FOLLOW_4); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getRegexAlternativesAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalSimpleReg.g:100:5: ( (lv_elements_3_0= ruleRegexGroup ) )
                    	    // InternalSimpleReg.g:101:6: (lv_elements_3_0= ruleRegexGroup )
                    	    {
                    	    // InternalSimpleReg.g:101:6: (lv_elements_3_0= ruleRegexGroup )
                    	    // InternalSimpleReg.g:102:7: lv_elements_3_0= ruleRegexGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getRegexAlternativesAccess().getElementsRegexGroupParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_elements_3_0=ruleRegexGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRegexAlternativesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


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
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexAlternatives"


    // $ANTLR start "entryRuleRegexGroup"
    // InternalSimpleReg.g:125:1: entryRuleRegexGroup returns [EObject current=null] : iv_ruleRegexGroup= ruleRegexGroup EOF ;
    public final EObject entryRuleRegexGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexGroup = null;


        try {
            // InternalSimpleReg.g:125:51: (iv_ruleRegexGroup= ruleRegexGroup EOF )
            // InternalSimpleReg.g:126:2: iv_ruleRegexGroup= ruleRegexGroup EOF
            {
             newCompositeNode(grammarAccess.getRegexGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexGroup=ruleRegexGroup();

            state._fsp--;

             current =iv_ruleRegexGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegexGroup"


    // $ANTLR start "ruleRegexGroup"
    // InternalSimpleReg.g:132:1: ruleRegexGroup returns [EObject current=null] : (this_RegexToken_0= ruleRegexToken ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )? ) ;
    public final EObject ruleRegexGroup() throws RecognitionException {
        EObject current = null;

        EObject this_RegexToken_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:138:2: ( (this_RegexToken_0= ruleRegexToken ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )? ) )
            // InternalSimpleReg.g:139:2: (this_RegexToken_0= ruleRegexToken ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )? )
            {
            // InternalSimpleReg.g:139:2: (this_RegexToken_0= ruleRegexToken ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )? )
            // InternalSimpleReg.g:140:3: this_RegexToken_0= ruleRegexToken ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )?
            {

            			newCompositeNode(grammarAccess.getRegexGroupAccess().getRegexTokenParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_RegexToken_0=ruleRegexToken();

            state._fsp--;


            			current = this_RegexToken_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleReg.g:148:3: ( () ( (lv_elements_2_0= ruleRegexToken ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_MULTICHARTERMINAL)||LA4_0==14||LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleReg.g:149:4: () ( (lv_elements_2_0= ruleRegexToken ) )+
                    {
                    // InternalSimpleReg.g:149:4: ()
                    // InternalSimpleReg.g:150:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getRegexGroupAccess().getRegexGroupElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSimpleReg.g:156:4: ( (lv_elements_2_0= ruleRegexToken ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_MULTICHARTERMINAL)||LA3_0==14||LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSimpleReg.g:157:5: (lv_elements_2_0= ruleRegexToken )
                    	    {
                    	    // InternalSimpleReg.g:157:5: (lv_elements_2_0= ruleRegexToken )
                    	    // InternalSimpleReg.g:158:6: lv_elements_2_0= ruleRegexToken
                    	    {

                    	    						newCompositeNode(grammarAccess.getRegexGroupAccess().getElementsRegexTokenParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_elements_2_0=ruleRegexToken();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRegexGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_2_0,
                    	    							"uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexToken");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexGroup"


    // $ANTLR start "entryRuleRegexToken"
    // InternalSimpleReg.g:180:1: entryRuleRegexToken returns [EObject current=null] : iv_ruleRegexToken= ruleRegexToken EOF ;
    public final EObject entryRuleRegexToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexToken = null;


        try {
            // InternalSimpleReg.g:180:51: (iv_ruleRegexToken= ruleRegexToken EOF )
            // InternalSimpleReg.g:181:2: iv_ruleRegexToken= ruleRegexToken EOF
            {
             newCompositeNode(grammarAccess.getRegexTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexToken=ruleRegexToken();

            state._fsp--;

             current =iv_ruleRegexToken; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegexToken"


    // $ANTLR start "ruleRegexToken"
    // InternalSimpleReg.g:187:1: ruleRegexToken returns [EObject current=null] : (this_RegexTokenElement_0= ruleRegexTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )? ) ;
    public final EObject ruleRegexToken() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_1_1=null;
        Token lv_cardinality_1_2=null;
        Token lv_cardinality_1_3=null;
        Token lv_hasMinCard_2_0=null;
        Token lv_hasMaxCard_4_0=null;
        Token otherlv_6=null;
        EObject this_RegexTokenElement_0 = null;

        AntlrDatatypeRuleToken lv_minCardinality_3_0 = null;

        AntlrDatatypeRuleToken lv_maxCardinality_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:193:2: ( (this_RegexTokenElement_0= ruleRegexTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )? ) )
            // InternalSimpleReg.g:194:2: (this_RegexTokenElement_0= ruleRegexTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )? )
            {
            // InternalSimpleReg.g:194:2: (this_RegexTokenElement_0= ruleRegexTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )? )
            // InternalSimpleReg.g:195:3: this_RegexTokenElement_0= ruleRegexTokenElement ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )? ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )?
            {

            			newCompositeNode(grammarAccess.getRegexTokenAccess().getRegexTokenElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_RegexTokenElement_0=ruleRegexTokenElement();

            state._fsp--;


            			current = this_RegexTokenElement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleReg.g:203:3: ( ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=8 && LA6_0<=10)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleReg.g:204:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    {
                    // InternalSimpleReg.g:204:4: ( (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' ) )
                    // InternalSimpleReg.g:205:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    {
                    // InternalSimpleReg.g:205:5: (lv_cardinality_1_1= '?' | lv_cardinality_1_2= '*' | lv_cardinality_1_3= '+' )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case 8:
                        {
                        alt5=1;
                        }
                        break;
                    case 9:
                        {
                        alt5=2;
                        }
                        break;
                    case 10:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // InternalSimpleReg.g:206:6: lv_cardinality_1_1= '?'
                            {
                            lv_cardinality_1_1=(Token)match(input,8,FOLLOW_7); 

                            						newLeafNode(lv_cardinality_1_1, grammarAccess.getRegexTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRegexTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSimpleReg.g:217:6: lv_cardinality_1_2= '*'
                            {
                            lv_cardinality_1_2=(Token)match(input,9,FOLLOW_7); 

                            						newLeafNode(lv_cardinality_1_2, grammarAccess.getRegexTokenAccess().getCardinalityAsteriskKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRegexTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalSimpleReg.g:228:6: lv_cardinality_1_3= '+'
                            {
                            lv_cardinality_1_3=(Token)match(input,10,FOLLOW_7); 

                            						newLeafNode(lv_cardinality_1_3, grammarAccess.getRegexTokenAccess().getCardinalityPlusSignKeyword_1_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRegexTokenRule());
                            						}
                            						setWithLastConsumed(current, "cardinality", lv_cardinality_1_3, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleReg.g:241:3: ( ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleReg.g:242:4: ( (lv_hasMinCard_2_0= '{' ) ) ( (lv_minCardinality_3_0= ruleEINT ) )? ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )? otherlv_6= '}'
                    {
                    // InternalSimpleReg.g:242:4: ( (lv_hasMinCard_2_0= '{' ) )
                    // InternalSimpleReg.g:243:5: (lv_hasMinCard_2_0= '{' )
                    {
                    // InternalSimpleReg.g:243:5: (lv_hasMinCard_2_0= '{' )
                    // InternalSimpleReg.g:244:6: lv_hasMinCard_2_0= '{'
                    {
                    lv_hasMinCard_2_0=(Token)match(input,11,FOLLOW_8); 

                    						newLeafNode(lv_hasMinCard_2_0, grammarAccess.getRegexTokenAccess().getHasMinCardLeftCurlyBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegexTokenRule());
                    						}
                    						setWithLastConsumed(current, "hasMinCard", true, "{");
                    					

                    }


                    }

                    // InternalSimpleReg.g:256:4: ( (lv_minCardinality_3_0= ruleEINT ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT||LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSimpleReg.g:257:5: (lv_minCardinality_3_0= ruleEINT )
                            {
                            // InternalSimpleReg.g:257:5: (lv_minCardinality_3_0= ruleEINT )
                            // InternalSimpleReg.g:258:6: lv_minCardinality_3_0= ruleEINT
                            {

                            						newCompositeNode(grammarAccess.getRegexTokenAccess().getMinCardinalityEINTParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_minCardinality_3_0=ruleEINT();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getRegexTokenRule());
                            						}
                            						set(
                            							current,
                            							"minCardinality",
                            							lv_minCardinality_3_0,
                            							"uk.ac.york.simpleregexp.simplereg.SimpleReg.EINT");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSimpleReg.g:275:4: ( ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )? )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==12) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSimpleReg.g:276:5: ( (lv_hasMaxCard_4_0= ',' ) ) ( (lv_maxCardinality_5_0= ruleEINT ) )?
                            {
                            // InternalSimpleReg.g:276:5: ( (lv_hasMaxCard_4_0= ',' ) )
                            // InternalSimpleReg.g:277:6: (lv_hasMaxCard_4_0= ',' )
                            {
                            // InternalSimpleReg.g:277:6: (lv_hasMaxCard_4_0= ',' )
                            // InternalSimpleReg.g:278:7: lv_hasMaxCard_4_0= ','
                            {
                            lv_hasMaxCard_4_0=(Token)match(input,12,FOLLOW_10); 

                            							newLeafNode(lv_hasMaxCard_4_0, grammarAccess.getRegexTokenAccess().getHasMaxCardCommaKeyword_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRegexTokenRule());
                            							}
                            							setWithLastConsumed(current, "hasMaxCard", true, ",");
                            						

                            }


                            }

                            // InternalSimpleReg.g:290:5: ( (lv_maxCardinality_5_0= ruleEINT ) )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==RULE_INT||LA8_0==16) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // InternalSimpleReg.g:291:6: (lv_maxCardinality_5_0= ruleEINT )
                                    {
                                    // InternalSimpleReg.g:291:6: (lv_maxCardinality_5_0= ruleEINT )
                                    // InternalSimpleReg.g:292:7: lv_maxCardinality_5_0= ruleEINT
                                    {

                                    							newCompositeNode(grammarAccess.getRegexTokenAccess().getMaxCardinalityEINTParserRuleCall_2_2_1_0());
                                    						
                                    pushFollow(FOLLOW_11);
                                    lv_maxCardinality_5_0=ruleEINT();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getRegexTokenRule());
                                    							}
                                    							set(
                                    								current,
                                    								"maxCardinality",
                                    								lv_maxCardinality_5_0,
                                    								"uk.ac.york.simpleregexp.simplereg.SimpleReg.EINT");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRegexTokenAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexToken"


    // $ANTLR start "entryRuleRegexTokenElement"
    // InternalSimpleReg.g:319:1: entryRuleRegexTokenElement returns [EObject current=null] : iv_ruleRegexTokenElement= ruleRegexTokenElement EOF ;
    public final EObject entryRuleRegexTokenElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexTokenElement = null;


        try {
            // InternalSimpleReg.g:319:58: (iv_ruleRegexTokenElement= ruleRegexTokenElement EOF )
            // InternalSimpleReg.g:320:2: iv_ruleRegexTokenElement= ruleRegexTokenElement EOF
            {
             newCompositeNode(grammarAccess.getRegexTokenElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexTokenElement=ruleRegexTokenElement();

            state._fsp--;

             current =iv_ruleRegexTokenElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegexTokenElement"


    // $ANTLR start "ruleRegexTokenElement"
    // InternalSimpleReg.g:326:1: ruleRegexTokenElement returns [EObject current=null] : (this_MultiCharacters_0= ruleMultiCharacters | this_ParenthesizedRegexElement_1= ruleParenthesizedRegexElement | this_Wildcard_2= ruleWildcard | this_SingleChars_3= ruleSingleChars ) ;
    public final EObject ruleRegexTokenElement() throws RecognitionException {
        EObject current = null;

        EObject this_MultiCharacters_0 = null;

        EObject this_ParenthesizedRegexElement_1 = null;

        EObject this_Wildcard_2 = null;

        EObject this_SingleChars_3 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:332:2: ( (this_MultiCharacters_0= ruleMultiCharacters | this_ParenthesizedRegexElement_1= ruleParenthesizedRegexElement | this_Wildcard_2= ruleWildcard | this_SingleChars_3= ruleSingleChars ) )
            // InternalSimpleReg.g:333:2: (this_MultiCharacters_0= ruleMultiCharacters | this_ParenthesizedRegexElement_1= ruleParenthesizedRegexElement | this_Wildcard_2= ruleWildcard | this_SingleChars_3= ruleSingleChars )
            {
            // InternalSimpleReg.g:333:2: (this_MultiCharacters_0= ruleMultiCharacters | this_ParenthesizedRegexElement_1= ruleParenthesizedRegexElement | this_Wildcard_2= ruleWildcard | this_SingleChars_3= ruleSingleChars )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_MULTICHARTERMINAL:
                {
                alt11=1;
                }
                break;
            case 14:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            case RULE_INT:
            case RULE_TSINGLECHARS:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSimpleReg.g:334:3: this_MultiCharacters_0= ruleMultiCharacters
                    {

                    			newCompositeNode(grammarAccess.getRegexTokenElementAccess().getMultiCharactersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiCharacters_0=ruleMultiCharacters();

                    state._fsp--;


                    			current = this_MultiCharacters_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleReg.g:343:3: this_ParenthesizedRegexElement_1= ruleParenthesizedRegexElement
                    {

                    			newCompositeNode(grammarAccess.getRegexTokenElementAccess().getParenthesizedRegexElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedRegexElement_1=ruleParenthesizedRegexElement();

                    state._fsp--;


                    			current = this_ParenthesizedRegexElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleReg.g:352:3: this_Wildcard_2= ruleWildcard
                    {

                    			newCompositeNode(grammarAccess.getRegexTokenElementAccess().getWildcardParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wildcard_2=ruleWildcard();

                    state._fsp--;


                    			current = this_Wildcard_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleReg.g:361:3: this_SingleChars_3= ruleSingleChars
                    {

                    			newCompositeNode(grammarAccess.getRegexTokenElementAccess().getSingleCharsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleChars_3=ruleSingleChars();

                    state._fsp--;


                    			current = this_SingleChars_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexTokenElement"


    // $ANTLR start "entryRuleParenthesizedRegexElement"
    // InternalSimpleReg.g:373:1: entryRuleParenthesizedRegexElement returns [EObject current=null] : iv_ruleParenthesizedRegexElement= ruleParenthesizedRegexElement EOF ;
    public final EObject entryRuleParenthesizedRegexElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedRegexElement = null;


        try {
            // InternalSimpleReg.g:373:66: (iv_ruleParenthesizedRegexElement= ruleParenthesizedRegexElement EOF )
            // InternalSimpleReg.g:374:2: iv_ruleParenthesizedRegexElement= ruleParenthesizedRegexElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedRegexElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedRegexElement=ruleParenthesizedRegexElement();

            state._fsp--;

             current =iv_ruleParenthesizedRegexElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedRegexElement"


    // $ANTLR start "ruleParenthesizedRegexElement"
    // InternalSimpleReg.g:380:1: ruleParenthesizedRegexElement returns [EObject current=null] : (otherlv_0= '(' this_RegexAlternatives_1= ruleRegexAlternatives otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedRegexElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_RegexAlternatives_1 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:386:2: ( (otherlv_0= '(' this_RegexAlternatives_1= ruleRegexAlternatives otherlv_2= ')' ) )
            // InternalSimpleReg.g:387:2: (otherlv_0= '(' this_RegexAlternatives_1= ruleRegexAlternatives otherlv_2= ')' )
            {
            // InternalSimpleReg.g:387:2: (otherlv_0= '(' this_RegexAlternatives_1= ruleRegexAlternatives otherlv_2= ')' )
            // InternalSimpleReg.g:388:3: otherlv_0= '(' this_RegexAlternatives_1= ruleRegexAlternatives otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedRegexElementAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedRegexElementAccess().getRegexAlternativesParserRuleCall_1());
            		
            pushFollow(FOLLOW_12);
            this_RegexAlternatives_1=ruleRegexAlternatives();

            state._fsp--;


            			current = this_RegexAlternatives_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedRegexElementAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedRegexElement"


    // $ANTLR start "entryRuleSingleChars"
    // InternalSimpleReg.g:408:1: entryRuleSingleChars returns [EObject current=null] : iv_ruleSingleChars= ruleSingleChars EOF ;
    public final EObject entryRuleSingleChars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChars = null;


        try {
            // InternalSimpleReg.g:408:52: (iv_ruleSingleChars= ruleSingleChars EOF )
            // InternalSimpleReg.g:409:2: iv_ruleSingleChars= ruleSingleChars EOF
            {
             newCompositeNode(grammarAccess.getSingleCharsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleChars=ruleSingleChars();

            state._fsp--;

             current =iv_ruleSingleChars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleChars"


    // $ANTLR start "ruleSingleChars"
    // InternalSimpleReg.g:415:1: ruleSingleChars returns [EObject current=null] : ( (lv_value_0_0= ruleTSINGLECHARSDT ) ) ;
    public final EObject ruleSingleChars() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:421:2: ( ( (lv_value_0_0= ruleTSINGLECHARSDT ) ) )
            // InternalSimpleReg.g:422:2: ( (lv_value_0_0= ruleTSINGLECHARSDT ) )
            {
            // InternalSimpleReg.g:422:2: ( (lv_value_0_0= ruleTSINGLECHARSDT ) )
            // InternalSimpleReg.g:423:3: (lv_value_0_0= ruleTSINGLECHARSDT )
            {
            // InternalSimpleReg.g:423:3: (lv_value_0_0= ruleTSINGLECHARSDT )
            // InternalSimpleReg.g:424:4: lv_value_0_0= ruleTSINGLECHARSDT
            {

            				newCompositeNode(grammarAccess.getSingleCharsAccess().getValueTSINGLECHARSDTParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleTSINGLECHARSDT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSingleCharsRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"uk.ac.york.simpleregexp.simplereg.SimpleReg.TSINGLECHARSDT");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleChars"


    // $ANTLR start "entryRuleEINT"
    // InternalSimpleReg.g:444:1: entryRuleEINT returns [String current=null] : iv_ruleEINT= ruleEINT EOF ;
    public final String entryRuleEINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEINT = null;


        try {
            // InternalSimpleReg.g:444:44: (iv_ruleEINT= ruleEINT EOF )
            // InternalSimpleReg.g:445:2: iv_ruleEINT= ruleEINT EOF
            {
             newCompositeNode(grammarAccess.getEINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEINT=ruleEINT();

            state._fsp--;

             current =iv_ruleEINT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEINT"


    // $ANTLR start "ruleEINT"
    // InternalSimpleReg.g:451:1: ruleEINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_TEST2_1= ruleTEST2 ) ;
    public final AntlrDatatypeRuleToken ruleEINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_TEST2_1 = null;



        	enterRule();

        try {
            // InternalSimpleReg.g:457:2: ( (this_INT_0= RULE_INT | this_TEST2_1= ruleTEST2 ) )
            // InternalSimpleReg.g:458:2: (this_INT_0= RULE_INT | this_TEST2_1= ruleTEST2 )
            {
            // InternalSimpleReg.g:458:2: (this_INT_0= RULE_INT | this_TEST2_1= ruleTEST2 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleReg.g:459:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getEINTAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleReg.g:467:3: this_TEST2_1= ruleTEST2
                    {

                    			newCompositeNode(grammarAccess.getEINTAccess().getTEST2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TEST2_1=ruleTEST2();

                    state._fsp--;


                    			current.merge(this_TEST2_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEINT"


    // $ANTLR start "entryRuleTEST2"
    // InternalSimpleReg.g:481:1: entryRuleTEST2 returns [String current=null] : iv_ruleTEST2= ruleTEST2 EOF ;
    public final String entryRuleTEST2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEST2 = null;


        try {
            // InternalSimpleReg.g:481:45: (iv_ruleTEST2= ruleTEST2 EOF )
            // InternalSimpleReg.g:482:2: iv_ruleTEST2= ruleTEST2 EOF
            {
             newCompositeNode(grammarAccess.getTEST2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEST2=ruleTEST2();

            state._fsp--;

             current =iv_ruleTEST2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEST2"


    // $ANTLR start "ruleTEST2"
    // InternalSimpleReg.g:488:1: ruleTEST2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'test2' ;
    public final AntlrDatatypeRuleToken ruleTEST2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSimpleReg.g:494:2: (kw= 'test2' )
            // InternalSimpleReg.g:495:2: kw= 'test2'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTEST2Access().getTest2Keyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTEST2"


    // $ANTLR start "entryRuleTSINGLECHARSDT"
    // InternalSimpleReg.g:503:1: entryRuleTSINGLECHARSDT returns [String current=null] : iv_ruleTSINGLECHARSDT= ruleTSINGLECHARSDT EOF ;
    public final String entryRuleTSINGLECHARSDT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTSINGLECHARSDT = null;


        try {
            // InternalSimpleReg.g:503:54: (iv_ruleTSINGLECHARSDT= ruleTSINGLECHARSDT EOF )
            // InternalSimpleReg.g:504:2: iv_ruleTSINGLECHARSDT= ruleTSINGLECHARSDT EOF
            {
             newCompositeNode(grammarAccess.getTSINGLECHARSDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTSINGLECHARSDT=ruleTSINGLECHARSDT();

            state._fsp--;

             current =iv_ruleTSINGLECHARSDT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTSINGLECHARSDT"


    // $ANTLR start "ruleTSINGLECHARSDT"
    // InternalSimpleReg.g:510:1: ruleTSINGLECHARSDT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_TSINGLECHARS_1= RULE_TSINGLECHARS ) ;
    public final AntlrDatatypeRuleToken ruleTSINGLECHARSDT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_TSINGLECHARS_1=null;


        	enterRule();

        try {
            // InternalSimpleReg.g:516:2: ( (this_INT_0= RULE_INT | this_TSINGLECHARS_1= RULE_TSINGLECHARS ) )
            // InternalSimpleReg.g:517:2: (this_INT_0= RULE_INT | this_TSINGLECHARS_1= RULE_TSINGLECHARS )
            {
            // InternalSimpleReg.g:517:2: (this_INT_0= RULE_INT | this_TSINGLECHARS_1= RULE_TSINGLECHARS )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_TSINGLECHARS) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleReg.g:518:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getTSINGLECHARSDTAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleReg.g:526:3: this_TSINGLECHARS_1= RULE_TSINGLECHARS
                    {
                    this_TSINGLECHARS_1=(Token)match(input,RULE_TSINGLECHARS,FOLLOW_2); 

                    			current.merge(this_TSINGLECHARS_1);
                    		

                    			newLeafNode(this_TSINGLECHARS_1, grammarAccess.getTSINGLECHARSDTAccess().getTSINGLECHARSTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTSINGLECHARSDT"


    // $ANTLR start "entryRuleWildcard"
    // InternalSimpleReg.g:537:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // InternalSimpleReg.g:537:49: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalSimpleReg.g:538:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalSimpleReg.g:544:1: ruleWildcard returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSimpleReg.g:550:2: ( ( () otherlv_1= '.' ) )
            // InternalSimpleReg.g:551:2: ( () otherlv_1= '.' )
            {
            // InternalSimpleReg.g:551:2: ( () otherlv_1= '.' )
            // InternalSimpleReg.g:552:3: () otherlv_1= '.'
            {
            // InternalSimpleReg.g:552:3: ()
            // InternalSimpleReg.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWildcardAccess().getWildcardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleMultiCharacters"
    // InternalSimpleReg.g:567:1: entryRuleMultiCharacters returns [EObject current=null] : iv_ruleMultiCharacters= ruleMultiCharacters EOF ;
    public final EObject entryRuleMultiCharacters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiCharacters = null;


        try {
            // InternalSimpleReg.g:567:56: (iv_ruleMultiCharacters= ruleMultiCharacters EOF )
            // InternalSimpleReg.g:568:2: iv_ruleMultiCharacters= ruleMultiCharacters EOF
            {
             newCompositeNode(grammarAccess.getMultiCharactersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiCharacters=ruleMultiCharacters();

            state._fsp--;

             current =iv_ruleMultiCharacters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiCharacters"


    // $ANTLR start "ruleMultiCharacters"
    // InternalSimpleReg.g:574:1: ruleMultiCharacters returns [EObject current=null] : ( (lv_value_0_0= RULE_MULTICHARTERMINAL ) ) ;
    public final EObject ruleMultiCharacters() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSimpleReg.g:580:2: ( ( (lv_value_0_0= RULE_MULTICHARTERMINAL ) ) )
            // InternalSimpleReg.g:581:2: ( (lv_value_0_0= RULE_MULTICHARTERMINAL ) )
            {
            // InternalSimpleReg.g:581:2: ( (lv_value_0_0= RULE_MULTICHARTERMINAL ) )
            // InternalSimpleReg.g:582:3: (lv_value_0_0= RULE_MULTICHARTERMINAL )
            {
            // InternalSimpleReg.g:582:3: (lv_value_0_0= RULE_MULTICHARTERMINAL )
            // InternalSimpleReg.g:583:4: lv_value_0_0= RULE_MULTICHARTERMINAL
            {
            lv_value_0_0=(Token)match(input,RULE_MULTICHARTERMINAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMultiCharactersAccess().getValueMULTICHARTERMINALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMultiCharactersRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"uk.ac.york.simpleregexp.simplereg.SimpleReg.MULTICHARTERMINAL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiCharacters"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000024070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000024072L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000013010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});

}