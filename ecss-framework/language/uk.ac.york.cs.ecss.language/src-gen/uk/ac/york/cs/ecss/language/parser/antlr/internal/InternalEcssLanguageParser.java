package uk.ac.york.cs.ecss.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.york.cs.ecss.language.services.EcssLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcssLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_QUALIFIEDNAME", "RULE_TEST1", "RULE_TEST3", "RULE_TEST2", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Config'", "'{'", "'minImprovement'", "'maxDegression'", "'maxThings'", "'}'", "'import'", "';'", "'template'", "':'", "'templateGen'", "'extends'", "'javarule'", "'::'", "'rule'", "'with'", "','", "'id'", "'for'", "'join'", "'if'", "'('", "')'", "'else'", "'$'", "'@'", "'\\u00A7'", "'['", "'..'", "']'", "'$#'", "'#'", "'*'", "'-'", "'slot'", "'ocl'"
    };
    public static final int T__50=50;
    public static final int RULE_QUALIFIEDNAME=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int RULE_NUMBER=4;
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


        public InternalEcssLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEcssLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEcssLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEcssLanguage.g"; }



     	private EcssLanguageGrammarAccess grammarAccess;

        public InternalEcssLanguageParser(TokenStream input, EcssLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EcssLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEcssLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEcssLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEcssLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEcssLanguage.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_config_0_0= ruleConfig ) )? ( (lv_importStatement_1_0= ruleImport ) )* ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_config_0_0 = null;

        EObject lv_importStatement_1_0 = null;

        EObject lv_templateDefs_2_0 = null;

        EObject lv_templateGenDefs_3_0 = null;

        EObject lv_templates_4_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:77:2: ( ( ( (lv_config_0_0= ruleConfig ) )? ( (lv_importStatement_1_0= ruleImport ) )* ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )* ) )
            // InternalEcssLanguage.g:78:2: ( ( (lv_config_0_0= ruleConfig ) )? ( (lv_importStatement_1_0= ruleImport ) )* ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )* )
            {
            // InternalEcssLanguage.g:78:2: ( ( (lv_config_0_0= ruleConfig ) )? ( (lv_importStatement_1_0= ruleImport ) )* ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )* )
            // InternalEcssLanguage.g:79:3: ( (lv_config_0_0= ruleConfig ) )? ( (lv_importStatement_1_0= ruleImport ) )* ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )*
            {
            // InternalEcssLanguage.g:79:3: ( (lv_config_0_0= ruleConfig ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEcssLanguage.g:80:4: (lv_config_0_0= ruleConfig )
                    {
                    // InternalEcssLanguage.g:80:4: (lv_config_0_0= ruleConfig )
                    // InternalEcssLanguage.g:81:5: lv_config_0_0= ruleConfig
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getConfigConfigParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_config_0_0=ruleConfig();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"config",
                    						lv_config_0_0,
                    						"uk.ac.york.cs.ecss.language.EcssLanguage.Config");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:98:3: ( (lv_importStatement_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEcssLanguage.g:99:4: (lv_importStatement_1_0= ruleImport )
            	    {
            	    // InternalEcssLanguage.g:99:4: (lv_importStatement_1_0= ruleImport )
            	    // InternalEcssLanguage.g:100:5: lv_importStatement_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportStatementImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_importStatement_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importStatement",
            	    						lv_importStatement_1_0,
            	    						"uk.ac.york.cs.ecss.language.EcssLanguage.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEcssLanguage.g:117:3: ( ( (lv_templateDefs_2_0= ruleTemplateDef ) ) | ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) ) | ( (lv_templates_4_0= ruleTemplateRule ) ) | ( (lv_properties_5_0= rulePropertyRule ) ) )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 28:
                case 30:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_STRING:
                case RULE_ID:
                case 17:
                case 48:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalEcssLanguage.g:118:4: ( (lv_templateDefs_2_0= ruleTemplateDef ) )
            	    {
            	    // InternalEcssLanguage.g:118:4: ( (lv_templateDefs_2_0= ruleTemplateDef ) )
            	    // InternalEcssLanguage.g:119:5: (lv_templateDefs_2_0= ruleTemplateDef )
            	    {
            	    // InternalEcssLanguage.g:119:5: (lv_templateDefs_2_0= ruleTemplateDef )
            	    // InternalEcssLanguage.g:120:6: lv_templateDefs_2_0= ruleTemplateDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getTemplateDefsTemplateDefParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_templateDefs_2_0=ruleTemplateDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"templateDefs",
            	    							lv_templateDefs_2_0,
            	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEcssLanguage.g:138:4: ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) )
            	    {
            	    // InternalEcssLanguage.g:138:4: ( (lv_templateGenDefs_3_0= ruleTemplateGenDef ) )
            	    // InternalEcssLanguage.g:139:5: (lv_templateGenDefs_3_0= ruleTemplateGenDef )
            	    {
            	    // InternalEcssLanguage.g:139:5: (lv_templateGenDefs_3_0= ruleTemplateGenDef )
            	    // InternalEcssLanguage.g:140:6: lv_templateGenDefs_3_0= ruleTemplateGenDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getTemplateGenDefsTemplateGenDefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_templateGenDefs_3_0=ruleTemplateGenDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"templateGenDefs",
            	    							lv_templateGenDefs_3_0,
            	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateGenDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEcssLanguage.g:158:4: ( (lv_templates_4_0= ruleTemplateRule ) )
            	    {
            	    // InternalEcssLanguage.g:158:4: ( (lv_templates_4_0= ruleTemplateRule ) )
            	    // InternalEcssLanguage.g:159:5: (lv_templates_4_0= ruleTemplateRule )
            	    {
            	    // InternalEcssLanguage.g:159:5: (lv_templates_4_0= ruleTemplateRule )
            	    // InternalEcssLanguage.g:160:6: lv_templates_4_0= ruleTemplateRule
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getTemplatesTemplateRuleParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_templates_4_0=ruleTemplateRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"templates",
            	    							lv_templates_4_0,
            	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEcssLanguage.g:178:4: ( (lv_properties_5_0= rulePropertyRule ) )
            	    {
            	    // InternalEcssLanguage.g:178:4: ( (lv_properties_5_0= rulePropertyRule ) )
            	    // InternalEcssLanguage.g:179:5: (lv_properties_5_0= rulePropertyRule )
            	    {
            	    // InternalEcssLanguage.g:179:5: (lv_properties_5_0= rulePropertyRule )
            	    // InternalEcssLanguage.g:180:6: lv_properties_5_0= rulePropertyRule
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPropertiesPropertyRuleParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_properties_5_0=rulePropertyRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_5_0,
            	    							"uk.ac.york.cs.ecss.language.EcssLanguage.PropertyRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfig"
    // InternalEcssLanguage.g:202:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalEcssLanguage.g:202:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalEcssLanguage.g:203:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalEcssLanguage.g:209:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'Config' otherlv_2= '{' ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )? ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )? ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_hasMinImprovement_3_0=null;
        Token lv_minImprovement_4_0=null;
        Token lv_hasMaxDegression_5_0=null;
        Token lv_maxDegression_6_0=null;
        Token lv_haxMaxThings_7_0=null;
        Token lv_maxThings_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:215:2: ( ( () otherlv_1= 'Config' otherlv_2= '{' ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )? ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )? ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )? otherlv_9= '}' ) )
            // InternalEcssLanguage.g:216:2: ( () otherlv_1= 'Config' otherlv_2= '{' ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )? ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )? ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            {
            // InternalEcssLanguage.g:216:2: ( () otherlv_1= 'Config' otherlv_2= '{' ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )? ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )? ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )? otherlv_9= '}' )
            // InternalEcssLanguage.g:217:3: () otherlv_1= 'Config' otherlv_2= '{' ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )? ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )? ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )? otherlv_9= '}'
            {
            // InternalEcssLanguage.g:217:3: ()
            // InternalEcssLanguage.g:218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEcssLanguage.g:232:3: ( ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEcssLanguage.g:233:4: ( (lv_hasMinImprovement_3_0= 'minImprovement' ) ) ( (lv_minImprovement_4_0= RULE_NUMBER ) )
                    {
                    // InternalEcssLanguage.g:233:4: ( (lv_hasMinImprovement_3_0= 'minImprovement' ) )
                    // InternalEcssLanguage.g:234:5: (lv_hasMinImprovement_3_0= 'minImprovement' )
                    {
                    // InternalEcssLanguage.g:234:5: (lv_hasMinImprovement_3_0= 'minImprovement' )
                    // InternalEcssLanguage.g:235:6: lv_hasMinImprovement_3_0= 'minImprovement'
                    {
                    lv_hasMinImprovement_3_0=(Token)match(input,18,FOLLOW_7); 

                    						newLeafNode(lv_hasMinImprovement_3_0, grammarAccess.getConfigAccess().getHasMinImprovementMinImprovementKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(current, "hasMinImprovement", true, "minImprovement");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:247:4: ( (lv_minImprovement_4_0= RULE_NUMBER ) )
                    // InternalEcssLanguage.g:248:5: (lv_minImprovement_4_0= RULE_NUMBER )
                    {
                    // InternalEcssLanguage.g:248:5: (lv_minImprovement_4_0= RULE_NUMBER )
                    // InternalEcssLanguage.g:249:6: lv_minImprovement_4_0= RULE_NUMBER
                    {
                    lv_minImprovement_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_8); 

                    						newLeafNode(lv_minImprovement_4_0, grammarAccess.getConfigAccess().getMinImprovementNUMBERTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minImprovement",
                    							lv_minImprovement_4_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:266:3: ( ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEcssLanguage.g:267:4: ( (lv_hasMaxDegression_5_0= 'maxDegression' ) ) ( (lv_maxDegression_6_0= RULE_NUMBER ) )
                    {
                    // InternalEcssLanguage.g:267:4: ( (lv_hasMaxDegression_5_0= 'maxDegression' ) )
                    // InternalEcssLanguage.g:268:5: (lv_hasMaxDegression_5_0= 'maxDegression' )
                    {
                    // InternalEcssLanguage.g:268:5: (lv_hasMaxDegression_5_0= 'maxDegression' )
                    // InternalEcssLanguage.g:269:6: lv_hasMaxDegression_5_0= 'maxDegression'
                    {
                    lv_hasMaxDegression_5_0=(Token)match(input,19,FOLLOW_7); 

                    						newLeafNode(lv_hasMaxDegression_5_0, grammarAccess.getConfigAccess().getHasMaxDegressionMaxDegressionKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(current, "hasMaxDegression", true, "maxDegression");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:281:4: ( (lv_maxDegression_6_0= RULE_NUMBER ) )
                    // InternalEcssLanguage.g:282:5: (lv_maxDegression_6_0= RULE_NUMBER )
                    {
                    // InternalEcssLanguage.g:282:5: (lv_maxDegression_6_0= RULE_NUMBER )
                    // InternalEcssLanguage.g:283:6: lv_maxDegression_6_0= RULE_NUMBER
                    {
                    lv_maxDegression_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_9); 

                    						newLeafNode(lv_maxDegression_6_0, grammarAccess.getConfigAccess().getMaxDegressionNUMBERTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxDegression",
                    							lv_maxDegression_6_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:300:3: ( ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEcssLanguage.g:301:4: ( (lv_haxMaxThings_7_0= 'maxThings' ) ) ( (lv_maxThings_8_0= RULE_INT ) )
                    {
                    // InternalEcssLanguage.g:301:4: ( (lv_haxMaxThings_7_0= 'maxThings' ) )
                    // InternalEcssLanguage.g:302:5: (lv_haxMaxThings_7_0= 'maxThings' )
                    {
                    // InternalEcssLanguage.g:302:5: (lv_haxMaxThings_7_0= 'maxThings' )
                    // InternalEcssLanguage.g:303:6: lv_haxMaxThings_7_0= 'maxThings'
                    {
                    lv_haxMaxThings_7_0=(Token)match(input,20,FOLLOW_10); 

                    						newLeafNode(lv_haxMaxThings_7_0, grammarAccess.getConfigAccess().getHaxMaxThingsMaxThingsKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(current, "haxMaxThings", true, "maxThings");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:315:4: ( (lv_maxThings_8_0= RULE_INT ) )
                    // InternalEcssLanguage.g:316:5: (lv_maxThings_8_0= RULE_INT )
                    {
                    // InternalEcssLanguage.g:316:5: (lv_maxThings_8_0= RULE_INT )
                    // InternalEcssLanguage.g:317:6: lv_maxThings_8_0= RULE_INT
                    {
                    lv_maxThings_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_maxThings_8_0, grammarAccess.getConfigAccess().getMaxThingsINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxThings",
                    							lv_maxThings_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleImport"
    // InternalEcssLanguage.g:342:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEcssLanguage.g:342:47: (iv_ruleImport= ruleImport EOF )
            // InternalEcssLanguage.g:343:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEcssLanguage.g:349:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:355:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalEcssLanguage.g:356:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalEcssLanguage.g:356:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalEcssLanguage.g:357:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalEcssLanguage.g:361:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalEcssLanguage.g:362:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalEcssLanguage.g:362:4: (lv_name_1_0= RULE_STRING )
            // InternalEcssLanguage.g:363:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTemplateDef"
    // InternalEcssLanguage.g:387:1: entryRuleTemplateDef returns [EObject current=null] : iv_ruleTemplateDef= ruleTemplateDef EOF ;
    public final EObject entryRuleTemplateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDef = null;


        try {
            // InternalEcssLanguage.g:387:52: (iv_ruleTemplateDef= ruleTemplateDef EOF )
            // InternalEcssLanguage.g:388:2: iv_ruleTemplateDef= ruleTemplateDef EOF
            {
             newCompositeNode(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateDef=ruleTemplateDef();

            state._fsp--;

             current =iv_ruleTemplateDef; 
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
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalEcssLanguage.g:394:1: ruleTemplateDef returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) ) otherlv_4= ';' ) ;
    public final EObject ruleTemplateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_javaClass_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:400:2: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) ) otherlv_4= ';' ) )
            // InternalEcssLanguage.g:401:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) ) otherlv_4= ';' )
            {
            // InternalEcssLanguage.g:401:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) ) otherlv_4= ';' )
            // InternalEcssLanguage.g:402:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateDefAccess().getTemplateKeyword_0());
            		
            // InternalEcssLanguage.g:406:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEcssLanguage.g:407:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEcssLanguage.g:407:4: (lv_name_1_0= RULE_ID )
            // InternalEcssLanguage.g:408:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTemplateDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTemplateDefAccess().getColonKeyword_2());
            		
            // InternalEcssLanguage.g:428:3: ( (lv_javaClass_3_0= RULE_QUALIFIEDNAME ) )
            // InternalEcssLanguage.g:429:4: (lv_javaClass_3_0= RULE_QUALIFIEDNAME )
            {
            // InternalEcssLanguage.g:429:4: (lv_javaClass_3_0= RULE_QUALIFIEDNAME )
            // InternalEcssLanguage.g:430:5: lv_javaClass_3_0= RULE_QUALIFIEDNAME
            {
            lv_javaClass_3_0=(Token)match(input,RULE_QUALIFIEDNAME,FOLLOW_13); 

            					newLeafNode(lv_javaClass_3_0, grammarAccess.getTemplateDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"javaClass",
            						lv_javaClass_3_0,
            						"uk.ac.york.cs.ecss.language.EcssLanguage.QUALIFIEDNAME");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTemplateDefAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleTemplateGenDef"
    // InternalEcssLanguage.g:454:1: entryRuleTemplateGenDef returns [EObject current=null] : iv_ruleTemplateGenDef= ruleTemplateGenDef EOF ;
    public final EObject entryRuleTemplateGenDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateGenDef = null;


        try {
            // InternalEcssLanguage.g:454:55: (iv_ruleTemplateGenDef= ruleTemplateGenDef EOF )
            // InternalEcssLanguage.g:455:2: iv_ruleTemplateGenDef= ruleTemplateGenDef EOF
            {
             newCompositeNode(grammarAccess.getTemplateGenDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateGenDef=ruleTemplateGenDef();

            state._fsp--;

             current =iv_ruleTemplateGenDef; 
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
    // $ANTLR end "entryRuleTemplateGenDef"


    // $ANTLR start "ruleTemplateGenDef"
    // InternalEcssLanguage.g:461:1: ruleTemplateGenDef returns [EObject current=null] : (otherlv_0= 'templateGen' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleTemplateGenDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_javaClass_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:467:2: ( (otherlv_0= 'templateGen' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )? otherlv_6= ';' ) )
            // InternalEcssLanguage.g:468:2: (otherlv_0= 'templateGen' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )? otherlv_6= ';' )
            {
            // InternalEcssLanguage.g:468:2: (otherlv_0= 'templateGen' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )? otherlv_6= ';' )
            // InternalEcssLanguage.g:469:3: otherlv_0= 'templateGen' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateGenDefAccess().getTemplateGenKeyword_0());
            		
            // InternalEcssLanguage.g:473:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEcssLanguage.g:474:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEcssLanguage.g:474:4: (lv_name_1_0= RULE_ID )
            // InternalEcssLanguage.g:475:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTemplateGenDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateGenDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEcssLanguage.g:491:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEcssLanguage.g:492:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTemplateGenDefAccess().getExtendsKeyword_2_0());
                    			
                    // InternalEcssLanguage.g:496:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEcssLanguage.g:497:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEcssLanguage.g:497:5: (otherlv_3= RULE_ID )
                    // InternalEcssLanguage.g:498:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemplateGenDefRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_3, grammarAccess.getTemplateGenDefAccess().getSuperRuleTemplateRuleOrDefCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:510:3: (otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEcssLanguage.g:511:4: otherlv_4= ':' ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getTemplateGenDefAccess().getColonKeyword_3_0());
                    			
                    // InternalEcssLanguage.g:515:4: ( (lv_javaClass_5_0= RULE_QUALIFIEDNAME ) )
                    // InternalEcssLanguage.g:516:5: (lv_javaClass_5_0= RULE_QUALIFIEDNAME )
                    {
                    // InternalEcssLanguage.g:516:5: (lv_javaClass_5_0= RULE_QUALIFIEDNAME )
                    // InternalEcssLanguage.g:517:6: lv_javaClass_5_0= RULE_QUALIFIEDNAME
                    {
                    lv_javaClass_5_0=(Token)match(input,RULE_QUALIFIEDNAME,FOLLOW_13); 

                    						newLeafNode(lv_javaClass_5_0, grammarAccess.getTemplateGenDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemplateGenDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"javaClass",
                    							lv_javaClass_5_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.QUALIFIEDNAME");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTemplateGenDefAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTemplateGenDef"


    // $ANTLR start "entryRuleTemplateRule"
    // InternalEcssLanguage.g:542:1: entryRuleTemplateRule returns [EObject current=null] : iv_ruleTemplateRule= ruleTemplateRule EOF ;
    public final EObject entryRuleTemplateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateRule = null;


        try {
            // InternalEcssLanguage.g:542:53: (iv_ruleTemplateRule= ruleTemplateRule EOF )
            // InternalEcssLanguage.g:543:2: iv_ruleTemplateRule= ruleTemplateRule EOF
            {
             newCompositeNode(grammarAccess.getTemplateRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateRule=ruleTemplateRule();

            state._fsp--;

             current =iv_ruleTemplateRule; 
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
    // $ANTLR end "entryRuleTemplateRule"


    // $ANTLR start "ruleTemplateRule"
    // InternalEcssLanguage.g:549:1: ruleTemplateRule returns [EObject current=null] : (this_BasicTemplateRule_0= ruleBasicTemplateRule | this_TemplateGeneratorRule_1= ruleTemplateGeneratorRule ) ;
    public final EObject ruleTemplateRule() throws RecognitionException {
        EObject current = null;

        EObject this_BasicTemplateRule_0 = null;

        EObject this_TemplateGeneratorRule_1 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:555:2: ( (this_BasicTemplateRule_0= ruleBasicTemplateRule | this_TemplateGeneratorRule_1= ruleTemplateGeneratorRule ) )
            // InternalEcssLanguage.g:556:2: (this_BasicTemplateRule_0= ruleBasicTemplateRule | this_TemplateGeneratorRule_1= ruleTemplateGeneratorRule )
            {
            // InternalEcssLanguage.g:556:2: (this_BasicTemplateRule_0= ruleBasicTemplateRule | this_TemplateGeneratorRule_1= ruleTemplateGeneratorRule )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEcssLanguage.g:557:3: this_BasicTemplateRule_0= ruleBasicTemplateRule
                    {

                    			newCompositeNode(grammarAccess.getTemplateRuleAccess().getBasicTemplateRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicTemplateRule_0=ruleBasicTemplateRule();

                    state._fsp--;


                    			current = this_BasicTemplateRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:566:3: this_TemplateGeneratorRule_1= ruleTemplateGeneratorRule
                    {

                    			newCompositeNode(grammarAccess.getTemplateRuleAccess().getTemplateGeneratorRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemplateGeneratorRule_1=ruleTemplateGeneratorRule();

                    state._fsp--;


                    			current = this_TemplateGeneratorRule_1;
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
    // $ANTLR end "ruleTemplateRule"


    // $ANTLR start "entryRuleBasicTemplateRule"
    // InternalEcssLanguage.g:578:1: entryRuleBasicTemplateRule returns [EObject current=null] : iv_ruleBasicTemplateRule= ruleBasicTemplateRule EOF ;
    public final EObject entryRuleBasicTemplateRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicTemplateRule = null;


        try {
            // InternalEcssLanguage.g:578:58: (iv_ruleBasicTemplateRule= ruleBasicTemplateRule EOF )
            // InternalEcssLanguage.g:579:2: iv_ruleBasicTemplateRule= ruleBasicTemplateRule EOF
            {
             newCompositeNode(grammarAccess.getBasicTemplateRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicTemplateRule=ruleBasicTemplateRule();

            state._fsp--;

             current =iv_ruleBasicTemplateRule; 
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
    // $ANTLR end "entryRuleBasicTemplateRule"


    // $ANTLR start "ruleBasicTemplateRule"
    // InternalEcssLanguage.g:585:1: ruleBasicTemplateRule returns [EObject current=null] : (otherlv_0= 'javarule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? otherlv_5= ';' ) ;
    public final EObject ruleBasicTemplateRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_groups_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:591:2: ( (otherlv_0= 'javarule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? otherlv_5= ';' ) )
            // InternalEcssLanguage.g:592:2: (otherlv_0= 'javarule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? otherlv_5= ';' )
            {
            // InternalEcssLanguage.g:592:2: (otherlv_0= 'javarule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? otherlv_5= ';' )
            // InternalEcssLanguage.g:593:3: otherlv_0= 'javarule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicTemplateRuleAccess().getJavaruleKeyword_0());
            		
            // InternalEcssLanguage.g:597:3: ( (otherlv_1= RULE_ID ) )
            // InternalEcssLanguage.g:598:4: (otherlv_1= RULE_ID )
            {
            // InternalEcssLanguage.g:598:4: (otherlv_1= RULE_ID )
            // InternalEcssLanguage.g:599:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicTemplateRuleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getBasicTemplateRuleAccess().getTypeTemplateDefCrossReference_1_0());
            				

            }


            }

            // InternalEcssLanguage.g:610:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEcssLanguage.g:611:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEcssLanguage.g:611:4: (lv_name_2_0= RULE_ID )
            // InternalEcssLanguage.g:612:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBasicTemplateRuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicTemplateRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEcssLanguage.g:628:3: (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEcssLanguage.g:629:4: otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicTemplateRuleAccess().getColonColonKeyword_3_0());
                    			
                    // InternalEcssLanguage.g:633:4: ( (lv_groups_4_0= RULE_ID ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:634:5: (lv_groups_4_0= RULE_ID )
                    	    {
                    	    // InternalEcssLanguage.g:634:5: (lv_groups_4_0= RULE_ID )
                    	    // InternalEcssLanguage.g:635:6: lv_groups_4_0= RULE_ID
                    	    {
                    	    lv_groups_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    	    						newLeafNode(lv_groups_4_0, grammarAccess.getBasicTemplateRuleAccess().getGroupsIDTerminalRuleCall_3_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getBasicTemplateRuleRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"groups",
                    	    							lv_groups_4_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

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
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBasicTemplateRuleAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleBasicTemplateRule"


    // $ANTLR start "entryRuleTemplateGeneratorRule"
    // InternalEcssLanguage.g:660:1: entryRuleTemplateGeneratorRule returns [EObject current=null] : iv_ruleTemplateGeneratorRule= ruleTemplateGeneratorRule EOF ;
    public final EObject entryRuleTemplateGeneratorRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateGeneratorRule = null;


        try {
            // InternalEcssLanguage.g:660:62: (iv_ruleTemplateGeneratorRule= ruleTemplateGeneratorRule EOF )
            // InternalEcssLanguage.g:661:2: iv_ruleTemplateGeneratorRule= ruleTemplateGeneratorRule EOF
            {
             newCompositeNode(grammarAccess.getTemplateGeneratorRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateGeneratorRule=ruleTemplateGeneratorRule();

            state._fsp--;

             current =iv_ruleTemplateGeneratorRule; 
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
    // $ANTLR end "entryRuleTemplateGeneratorRule"


    // $ANTLR start "ruleTemplateGeneratorRule"
    // InternalEcssLanguage.g:667:1: ruleTemplateGeneratorRule returns [EObject current=null] : (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )? ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )? (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )? otherlv_16= ';' ) ;
    public final EObject ruleTemplateGeneratorRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_groups_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_typeDef_6_0 = null;

        EObject lv_typeDef_8_0 = null;

        EObject lv_idPart_10_0 = null;

        EObject lv_idPart_12_0 = null;

        EObject lv_templateRulePart_15_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:673:2: ( (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )? ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )? (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )? otherlv_16= ';' ) )
            // InternalEcssLanguage.g:674:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )? ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )? (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )? otherlv_16= ';' )
            {
            // InternalEcssLanguage.g:674:2: (otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )? ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )? (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )? otherlv_16= ';' )
            // InternalEcssLanguage.g:675:3: otherlv_0= 'rule' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )? (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )? ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )? (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateGeneratorRuleAccess().getRuleKeyword_0());
            		
            // InternalEcssLanguage.g:679:3: ( (otherlv_1= RULE_ID ) )
            // InternalEcssLanguage.g:680:4: (otherlv_1= RULE_ID )
            {
            // InternalEcssLanguage.g:680:4: (otherlv_1= RULE_ID )
            // InternalEcssLanguage.g:681:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateGeneratorRuleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getTemplateGeneratorRuleAccess().getTypeTemplateGenDefCrossReference_1_0());
            				

            }


            }

            // InternalEcssLanguage.g:692:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEcssLanguage.g:693:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEcssLanguage.g:693:4: (lv_name_2_0= RULE_ID )
            // InternalEcssLanguage.g:694:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTemplateGeneratorRuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateGeneratorRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEcssLanguage.g:710:3: (otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEcssLanguage.g:711:4: otherlv_3= '::' ( (lv_groups_4_0= RULE_ID ) )+
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemplateGeneratorRuleAccess().getColonColonKeyword_3_0());
                    			
                    // InternalEcssLanguage.g:715:4: ( (lv_groups_4_0= RULE_ID ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:716:5: (lv_groups_4_0= RULE_ID )
                    	    {
                    	    // InternalEcssLanguage.g:716:5: (lv_groups_4_0= RULE_ID )
                    	    // InternalEcssLanguage.g:717:6: lv_groups_4_0= RULE_ID
                    	    {
                    	    lv_groups_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    						newLeafNode(lv_groups_4_0, grammarAccess.getTemplateGeneratorRuleAccess().getGroupsIDTerminalRuleCall_3_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTemplateGeneratorRuleRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"groups",
                    	    							lv_groups_4_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // InternalEcssLanguage.g:734:3: (otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEcssLanguage.g:735:4: otherlv_5= 'with' ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getTemplateGeneratorRuleAccess().getWithKeyword_4_0());
                    			
                    // InternalEcssLanguage.g:739:4: ( ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )* )
                    // InternalEcssLanguage.g:740:5: ( (lv_typeDef_6_0= ruleTypeDef ) ) (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )*
                    {
                    // InternalEcssLanguage.g:740:5: ( (lv_typeDef_6_0= ruleTypeDef ) )
                    // InternalEcssLanguage.g:741:6: (lv_typeDef_6_0= ruleTypeDef )
                    {
                    // InternalEcssLanguage.g:741:6: (lv_typeDef_6_0= ruleTypeDef )
                    // InternalEcssLanguage.g:742:7: lv_typeDef_6_0= ruleTypeDef
                    {

                    							newCompositeNode(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_typeDef_6_0=ruleTypeDef();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTemplateGeneratorRuleRule());
                    							}
                    							add(
                    								current,
                    								"typeDef",
                    								lv_typeDef_6_0,
                    								"uk.ac.york.cs.ecss.language.EcssLanguage.TypeDef");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalEcssLanguage.g:759:5: (otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==32) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:760:6: otherlv_7= ',' ( (lv_typeDef_8_0= ruleTypeDef ) )
                    	    {
                    	    otherlv_7=(Token)match(input,32,FOLLOW_14); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getTemplateGeneratorRuleAccess().getCommaKeyword_4_1_1_0());
                    	    					
                    	    // InternalEcssLanguage.g:764:6: ( (lv_typeDef_8_0= ruleTypeDef ) )
                    	    // InternalEcssLanguage.g:765:7: (lv_typeDef_8_0= ruleTypeDef )
                    	    {
                    	    // InternalEcssLanguage.g:765:7: (lv_typeDef_8_0= ruleTypeDef )
                    	    // InternalEcssLanguage.g:766:8: lv_typeDef_8_0= ruleTypeDef
                    	    {

                    	    								newCompositeNode(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_23);
                    	    lv_typeDef_8_0=ruleTypeDef();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTemplateGeneratorRuleRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"typeDef",
                    	    									lv_typeDef_8_0,
                    	    									"uk.ac.york.cs.ecss.language.EcssLanguage.TypeDef");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:786:3: ( (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) ) | (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==17) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalEcssLanguage.g:787:4: (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) )
                    {
                    // InternalEcssLanguage.g:787:4: (otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) ) )
                    // InternalEcssLanguage.g:788:5: otherlv_9= 'id' ( (lv_idPart_10_0= ruleTemplateRulePart ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_9, grammarAccess.getTemplateGeneratorRuleAccess().getIdKeyword_5_0_0());
                    				
                    // InternalEcssLanguage.g:792:5: ( (lv_idPart_10_0= ruleTemplateRulePart ) )
                    // InternalEcssLanguage.g:793:6: (lv_idPart_10_0= ruleTemplateRulePart )
                    {
                    // InternalEcssLanguage.g:793:6: (lv_idPart_10_0= ruleTemplateRulePart )
                    // InternalEcssLanguage.g:794:7: lv_idPart_10_0= ruleTemplateRulePart
                    {

                    							newCompositeNode(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_0_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_idPart_10_0=ruleTemplateRulePart();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTemplateGeneratorRuleRule());
                    							}
                    							add(
                    								current,
                    								"idPart",
                    								lv_idPart_10_0,
                    								"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:813:4: (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' )
                    {
                    // InternalEcssLanguage.g:813:4: (otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}' )
                    // InternalEcssLanguage.g:814:5: otherlv_11= '{' ( (lv_idPart_12_0= ruleTemplateRulePart ) )+ otherlv_13= '}'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_24); 

                    					newLeafNode(otherlv_11, grammarAccess.getTemplateGeneratorRuleAccess().getLeftCurlyBracketKeyword_5_1_0());
                    				
                    // InternalEcssLanguage.g:818:5: ( (lv_idPart_12_0= ruleTemplateRulePart ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING||LA16_0==34||LA16_0==36||LA16_0==40||LA16_0==42||(LA16_0>=46 && LA16_0<=47)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:819:6: (lv_idPart_12_0= ruleTemplateRulePart )
                    	    {
                    	    // InternalEcssLanguage.g:819:6: (lv_idPart_12_0= ruleTemplateRulePart )
                    	    // InternalEcssLanguage.g:820:7: lv_idPart_12_0= ruleTemplateRulePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_idPart_12_0=ruleTemplateRulePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateGeneratorRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"idPart",
                    	    								lv_idPart_12_0,
                    	    								"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_13=(Token)match(input,21,FOLLOW_18); 

                    					newLeafNode(otherlv_13, grammarAccess.getTemplateGeneratorRuleAccess().getRightCurlyBracketKeyword_5_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:843:3: (otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEcssLanguage.g:844:4: otherlv_14= ':' ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getTemplateGeneratorRuleAccess().getColonKeyword_6_0());
                    			
                    // InternalEcssLanguage.g:848:4: ( (lv_templateRulePart_15_0= ruleTemplateRulePart ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_STRING||LA18_0==34||LA18_0==36||LA18_0==40||LA18_0==42||(LA18_0>=46 && LA18_0<=47)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:849:5: (lv_templateRulePart_15_0= ruleTemplateRulePart )
                    	    {
                    	    // InternalEcssLanguage.g:849:5: (lv_templateRulePart_15_0= ruleTemplateRulePart )
                    	    // InternalEcssLanguage.g:850:6: lv_templateRulePart_15_0= ruleTemplateRulePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartTemplateRulePartParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_templateRulePart_15_0=ruleTemplateRulePart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTemplateGeneratorRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"templateRulePart",
                    	    							lv_templateRulePart_15_0,
                    	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTemplateGeneratorRuleAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleTemplateGeneratorRule"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEcssLanguage.g:876:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalEcssLanguage.g:876:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalEcssLanguage.g:877:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEcssLanguage.g:883:1: ruleTypeDef returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:889:2: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEcssLanguage.g:890:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEcssLanguage.g:890:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEcssLanguage.g:891:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEcssLanguage.g:891:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalEcssLanguage.g:892:4: (lv_type_0_0= RULE_ID )
            {
            // InternalEcssLanguage.g:892:4: (lv_type_0_0= RULE_ID )
            // InternalEcssLanguage.g:893:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_type_0_0, grammarAccess.getTypeDefAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEcssLanguage.g:909:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEcssLanguage.g:910:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEcssLanguage.g:910:4: (lv_name_1_0= RULE_ID )
            // InternalEcssLanguage.g:911:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTemplateRulePart"
    // InternalEcssLanguage.g:931:1: entryRuleTemplateRulePart returns [EObject current=null] : iv_ruleTemplateRulePart= ruleTemplateRulePart EOF ;
    public final EObject entryRuleTemplateRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateRulePart = null;


        try {
            // InternalEcssLanguage.g:931:57: (iv_ruleTemplateRulePart= ruleTemplateRulePart EOF )
            // InternalEcssLanguage.g:932:2: iv_ruleTemplateRulePart= ruleTemplateRulePart EOF
            {
             newCompositeNode(grammarAccess.getTemplateRulePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateRulePart=ruleTemplateRulePart();

            state._fsp--;

             current =iv_ruleTemplateRulePart; 
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
    // $ANTLR end "entryRuleTemplateRulePart"


    // $ANTLR start "ruleTemplateRulePart"
    // InternalEcssLanguage.g:938:1: ruleTemplateRulePart returns [EObject current=null] : (this_TemplateFunctionCall_0= ruleTemplateFunctionCall | this_LocalEvaluationCall_1= ruleLocalEvaluationCall | this_LocalOrValueCall_2= ruleLocalOrValueCall | this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart | this_EvaluationCall_4= ruleEvaluationCall | this_SlotCall_5= ruleSlotCall | this_ForEachExpression_6= ruleForEachExpression | this_IfExpression_7= ruleIfExpression ) ;
    public final EObject ruleTemplateRulePart() throws RecognitionException {
        EObject current = null;

        EObject this_TemplateFunctionCall_0 = null;

        EObject this_LocalEvaluationCall_1 = null;

        EObject this_LocalOrValueCall_2 = null;

        EObject this_StaticTemplateRulePart_3 = null;

        EObject this_EvaluationCall_4 = null;

        EObject this_SlotCall_5 = null;

        EObject this_ForEachExpression_6 = null;

        EObject this_IfExpression_7 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:944:2: ( (this_TemplateFunctionCall_0= ruleTemplateFunctionCall | this_LocalEvaluationCall_1= ruleLocalEvaluationCall | this_LocalOrValueCall_2= ruleLocalOrValueCall | this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart | this_EvaluationCall_4= ruleEvaluationCall | this_SlotCall_5= ruleSlotCall | this_ForEachExpression_6= ruleForEachExpression | this_IfExpression_7= ruleIfExpression ) )
            // InternalEcssLanguage.g:945:2: (this_TemplateFunctionCall_0= ruleTemplateFunctionCall | this_LocalEvaluationCall_1= ruleLocalEvaluationCall | this_LocalOrValueCall_2= ruleLocalOrValueCall | this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart | this_EvaluationCall_4= ruleEvaluationCall | this_SlotCall_5= ruleSlotCall | this_ForEachExpression_6= ruleForEachExpression | this_IfExpression_7= ruleIfExpression )
            {
            // InternalEcssLanguage.g:945:2: (this_TemplateFunctionCall_0= ruleTemplateFunctionCall | this_LocalEvaluationCall_1= ruleLocalEvaluationCall | this_LocalOrValueCall_2= ruleLocalOrValueCall | this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart | this_EvaluationCall_4= ruleEvaluationCall | this_SlotCall_5= ruleSlotCall | this_ForEachExpression_6= ruleForEachExpression | this_IfExpression_7= ruleIfExpression )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalEcssLanguage.g:946:3: this_TemplateFunctionCall_0= ruleTemplateFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getTemplateFunctionCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemplateFunctionCall_0=ruleTemplateFunctionCall();

                    state._fsp--;


                    			current = this_TemplateFunctionCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:955:3: this_LocalEvaluationCall_1= ruleLocalEvaluationCall
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getLocalEvaluationCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalEvaluationCall_1=ruleLocalEvaluationCall();

                    state._fsp--;


                    			current = this_LocalEvaluationCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:964:3: this_LocalOrValueCall_2= ruleLocalOrValueCall
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getLocalOrValueCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalOrValueCall_2=ruleLocalOrValueCall();

                    state._fsp--;


                    			current = this_LocalOrValueCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:973:3: this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getStaticTemplateRulePartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticTemplateRulePart_3=ruleStaticTemplateRulePart();

                    state._fsp--;


                    			current = this_StaticTemplateRulePart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEcssLanguage.g:982:3: this_EvaluationCall_4= ruleEvaluationCall
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getEvaluationCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvaluationCall_4=ruleEvaluationCall();

                    state._fsp--;


                    			current = this_EvaluationCall_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEcssLanguage.g:991:3: this_SlotCall_5= ruleSlotCall
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getSlotCallParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SlotCall_5=ruleSlotCall();

                    state._fsp--;


                    			current = this_SlotCall_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEcssLanguage.g:1000:3: this_ForEachExpression_6= ruleForEachExpression
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getForEachExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForEachExpression_6=ruleForEachExpression();

                    state._fsp--;


                    			current = this_ForEachExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEcssLanguage.g:1009:3: this_IfExpression_7= ruleIfExpression
                    {

                    			newCompositeNode(grammarAccess.getTemplateRulePartAccess().getIfExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfExpression_7=ruleIfExpression();

                    state._fsp--;


                    			current = this_IfExpression_7;
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
    // $ANTLR end "ruleTemplateRulePart"


    // $ANTLR start "entryRuleForEachExpression"
    // InternalEcssLanguage.g:1021:1: entryRuleForEachExpression returns [EObject current=null] : iv_ruleForEachExpression= ruleForEachExpression EOF ;
    public final EObject entryRuleForEachExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEachExpression = null;


        try {
            // InternalEcssLanguage.g:1021:58: (iv_ruleForEachExpression= ruleForEachExpression EOF )
            // InternalEcssLanguage.g:1022:2: iv_ruleForEachExpression= ruleForEachExpression EOF
            {
             newCompositeNode(grammarAccess.getForEachExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForEachExpression=ruleForEachExpression();

            state._fsp--;

             current =iv_ruleForEachExpression; 
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
    // $ANTLR end "entryRuleForEachExpression"


    // $ANTLR start "ruleForEachExpression"
    // InternalEcssLanguage.g:1028:1: ruleForEachExpression returns [EObject current=null] : (otherlv_0= 'for' ( (lv_type_1_0= RULE_ID ) )? ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) ) (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )? otherlv_8= '{' ( (lv_body_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' ) ;
    public final EObject ruleForEachExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token lv_exprVar_4_0=null;
        Token lv_completeExpr_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_join_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1034:2: ( (otherlv_0= 'for' ( (lv_type_1_0= RULE_ID ) )? ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) ) (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )? otherlv_8= '{' ( (lv_body_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' ) )
            // InternalEcssLanguage.g:1035:2: (otherlv_0= 'for' ( (lv_type_1_0= RULE_ID ) )? ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) ) (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )? otherlv_8= '{' ( (lv_body_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )
            {
            // InternalEcssLanguage.g:1035:2: (otherlv_0= 'for' ( (lv_type_1_0= RULE_ID ) )? ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) ) (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )? otherlv_8= '{' ( (lv_body_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )
            // InternalEcssLanguage.g:1036:3: otherlv_0= 'for' ( (lv_type_1_0= RULE_ID ) )? ( (lv_variable_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) ) (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )? otherlv_8= '{' ( (lv_body_9_0= ruleTemplateRulePart ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForEachExpressionAccess().getForKeyword_0());
            		
            // InternalEcssLanguage.g:1040:3: ( (lv_type_1_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalEcssLanguage.g:1041:4: (lv_type_1_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1041:4: (lv_type_1_0= RULE_ID )
                    // InternalEcssLanguage.g:1042:5: lv_type_1_0= RULE_ID
                    {
                    lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getForEachExpressionAccess().getTypeIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getForEachExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:1058:3: ( (lv_variable_2_0= RULE_ID ) )
            // InternalEcssLanguage.g:1059:4: (lv_variable_2_0= RULE_ID )
            {
            // InternalEcssLanguage.g:1059:4: (lv_variable_2_0= RULE_ID )
            // InternalEcssLanguage.g:1060:5: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_variable_2_0, grammarAccess.getForEachExpressionAccess().getVariableIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForEachExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getForEachExpressionAccess().getColonKeyword_3());
            		
            // InternalEcssLanguage.g:1080:3: ( ( (lv_exprVar_4_0= RULE_ID ) ) | ( (lv_completeExpr_5_0= RULE_STRING ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEcssLanguage.g:1081:4: ( (lv_exprVar_4_0= RULE_ID ) )
                    {
                    // InternalEcssLanguage.g:1081:4: ( (lv_exprVar_4_0= RULE_ID ) )
                    // InternalEcssLanguage.g:1082:5: (lv_exprVar_4_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1082:5: (lv_exprVar_4_0= RULE_ID )
                    // InternalEcssLanguage.g:1083:6: lv_exprVar_4_0= RULE_ID
                    {
                    lv_exprVar_4_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_exprVar_4_0, grammarAccess.getForEachExpressionAccess().getExprVarIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"exprVar",
                    							lv_exprVar_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1100:4: ( (lv_completeExpr_5_0= RULE_STRING ) )
                    {
                    // InternalEcssLanguage.g:1100:4: ( (lv_completeExpr_5_0= RULE_STRING ) )
                    // InternalEcssLanguage.g:1101:5: (lv_completeExpr_5_0= RULE_STRING )
                    {
                    // InternalEcssLanguage.g:1101:5: (lv_completeExpr_5_0= RULE_STRING )
                    // InternalEcssLanguage.g:1102:6: lv_completeExpr_5_0= RULE_STRING
                    {
                    lv_completeExpr_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_completeExpr_5_0, grammarAccess.getForEachExpressionAccess().getCompleteExprSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForEachExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completeExpr",
                    							lv_completeExpr_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:1119:3: (otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEcssLanguage.g:1120:4: otherlv_6= 'join' ( (lv_join_7_0= ruleTemplateRulePart ) )+
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getForEachExpressionAccess().getJoinKeyword_5_0());
                    			
                    // InternalEcssLanguage.g:1124:4: ( (lv_join_7_0= ruleTemplateRulePart ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_STRING||LA23_0==34||LA23_0==36||LA23_0==40||LA23_0==42||(LA23_0>=46 && LA23_0<=47)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:1125:5: (lv_join_7_0= ruleTemplateRulePart )
                    	    {
                    	    // InternalEcssLanguage.g:1125:5: (lv_join_7_0= ruleTemplateRulePart )
                    	    // InternalEcssLanguage.g:1126:6: lv_join_7_0= ruleTemplateRulePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getForEachExpressionAccess().getJoinTemplateRulePartParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_join_7_0=ruleTemplateRulePart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getForEachExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"join",
                    	    							lv_join_7_0,
                    	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getForEachExpressionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalEcssLanguage.g:1148:3: ( (lv_body_9_0= ruleTemplateRulePart ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING||LA25_0==34||LA25_0==36||LA25_0==40||LA25_0==42||(LA25_0>=46 && LA25_0<=47)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEcssLanguage.g:1149:4: (lv_body_9_0= ruleTemplateRulePart )
            	    {
            	    // InternalEcssLanguage.g:1149:4: (lv_body_9_0= ruleTemplateRulePart )
            	    // InternalEcssLanguage.g:1150:5: lv_body_9_0= ruleTemplateRulePart
            	    {

            	    					newCompositeNode(grammarAccess.getForEachExpressionAccess().getBodyTemplateRulePartParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_body_9_0=ruleTemplateRulePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForEachExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_9_0,
            	    						"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getForEachExpressionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleForEachExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalEcssLanguage.g:1175:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalEcssLanguage.g:1175:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalEcssLanguage.g:1176:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
             newCompositeNode(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;

             current =iv_ruleIfExpression; 
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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalEcssLanguage.g:1182:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_val_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleTemplateRulePart ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_then_5_0 = null;

        EObject lv_else_9_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1188:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_val_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleTemplateRulePart ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )? ) )
            // InternalEcssLanguage.g:1189:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_val_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleTemplateRulePart ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )? )
            {
            // InternalEcssLanguage.g:1189:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_val_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleTemplateRulePart ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )? )
            // InternalEcssLanguage.g:1190:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_val_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_then_5_0= ruleTemplateRulePart ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEcssLanguage.g:1198:3: ( (lv_val_2_0= RULE_ID ) )
            // InternalEcssLanguage.g:1199:4: (lv_val_2_0= RULE_ID )
            {
            // InternalEcssLanguage.g:1199:4: (lv_val_2_0= RULE_ID )
            // InternalEcssLanguage.g:1200:5: lv_val_2_0= RULE_ID
            {
            lv_val_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_val_2_0, grammarAccess.getIfExpressionAccess().getValIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEcssLanguage.g:1224:3: ( (lv_then_5_0= ruleTemplateRulePart ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING||LA26_0==34||LA26_0==36||LA26_0==40||LA26_0==42||(LA26_0>=46 && LA26_0<=47)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEcssLanguage.g:1225:4: (lv_then_5_0= ruleTemplateRulePart )
            	    {
            	    // InternalEcssLanguage.g:1225:4: (lv_then_5_0= ruleTemplateRulePart )
            	    // InternalEcssLanguage.g:1226:5: lv_then_5_0= ruleTemplateRulePart
            	    {

            	    					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenTemplateRulePartParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_then_5_0=ruleTemplateRulePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"then",
            	    						lv_then_5_0,
            	    						"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalEcssLanguage.g:1247:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEcssLanguage.g:1248:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_else_9_0= ruleTemplateRulePart ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalEcssLanguage.g:1256:4: ( (lv_else_9_0= ruleTemplateRulePart ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_STRING||LA27_0==34||LA27_0==36||LA27_0==40||LA27_0==42||(LA27_0>=46 && LA27_0<=47)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:1257:5: (lv_else_9_0= ruleTemplateRulePart )
                    	    {
                    	    // InternalEcssLanguage.g:1257:5: (lv_else_9_0= ruleTemplateRulePart )
                    	    // InternalEcssLanguage.g:1258:6: lv_else_9_0= ruleTemplateRulePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseTemplateRulePartParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_else_9_0=ruleTemplateRulePart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"else",
                    	    							lv_else_9_0,
                    	    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateRulePart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleStaticTemplateRulePart"
    // InternalEcssLanguage.g:1284:1: entryRuleStaticTemplateRulePart returns [EObject current=null] : iv_ruleStaticTemplateRulePart= ruleStaticTemplateRulePart EOF ;
    public final EObject entryRuleStaticTemplateRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticTemplateRulePart = null;


        try {
            // InternalEcssLanguage.g:1284:63: (iv_ruleStaticTemplateRulePart= ruleStaticTemplateRulePart EOF )
            // InternalEcssLanguage.g:1285:2: iv_ruleStaticTemplateRulePart= ruleStaticTemplateRulePart EOF
            {
             newCompositeNode(grammarAccess.getStaticTemplateRulePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticTemplateRulePart=ruleStaticTemplateRulePart();

            state._fsp--;

             current =iv_ruleStaticTemplateRulePart; 
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
    // $ANTLR end "entryRuleStaticTemplateRulePart"


    // $ANTLR start "ruleStaticTemplateRulePart"
    // InternalEcssLanguage.g:1291:1: ruleStaticTemplateRulePart returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStaticTemplateRulePart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1297:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalEcssLanguage.g:1298:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalEcssLanguage.g:1298:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalEcssLanguage.g:1299:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalEcssLanguage.g:1299:3: (lv_value_0_0= RULE_STRING )
            // InternalEcssLanguage.g:1300:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStaticTemplateRulePartAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStaticTemplateRulePartRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStaticTemplateRulePart"


    // $ANTLR start "entryRuleTemplateFunctionCall"
    // InternalEcssLanguage.g:1319:1: entryRuleTemplateFunctionCall returns [EObject current=null] : iv_ruleTemplateFunctionCall= ruleTemplateFunctionCall EOF ;
    public final EObject entryRuleTemplateFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFunctionCall = null;


        try {
            // InternalEcssLanguage.g:1319:61: (iv_ruleTemplateFunctionCall= ruleTemplateFunctionCall EOF )
            // InternalEcssLanguage.g:1320:2: iv_ruleTemplateFunctionCall= ruleTemplateFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getTemplateFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateFunctionCall=ruleTemplateFunctionCall();

            state._fsp--;

             current =iv_ruleTemplateFunctionCall; 
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
    // $ANTLR end "entryRuleTemplateFunctionCall"


    // $ANTLR start "ruleTemplateFunctionCall"
    // InternalEcssLanguage.g:1326:1: ruleTemplateFunctionCall returns [EObject current=null] : (otherlv_0= '$' ( (lv_isReference_1_0= '@' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleTemplateFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isReference_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parValue_4_0 = null;

        EObject lv_parValue_6_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1332:2: ( (otherlv_0= '$' ( (lv_isReference_1_0= '@' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )? otherlv_7= ')' ) )
            // InternalEcssLanguage.g:1333:2: (otherlv_0= '$' ( (lv_isReference_1_0= '@' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )? otherlv_7= ')' )
            {
            // InternalEcssLanguage.g:1333:2: (otherlv_0= '$' ( (lv_isReference_1_0= '@' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )? otherlv_7= ')' )
            // InternalEcssLanguage.g:1334:3: otherlv_0= '$' ( (lv_isReference_1_0= '@' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateFunctionCallAccess().getDollarSignKeyword_0());
            		
            // InternalEcssLanguage.g:1338:3: ( (lv_isReference_1_0= '@' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEcssLanguage.g:1339:4: (lv_isReference_1_0= '@' )
                    {
                    // InternalEcssLanguage.g:1339:4: (lv_isReference_1_0= '@' )
                    // InternalEcssLanguage.g:1340:5: lv_isReference_1_0= '@'
                    {
                    lv_isReference_1_0=(Token)match(input,41,FOLLOW_14); 

                    					newLeafNode(lv_isReference_1_0, grammarAccess.getTemplateFunctionCallAccess().getIsReferenceCommercialAtKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTemplateFunctionCallRule());
                    					}
                    					setWithLastConsumed(current, "isReference", true, "@");
                    				

                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:1352:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEcssLanguage.g:1353:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEcssLanguage.g:1353:4: (lv_name_2_0= RULE_ID )
            // InternalEcssLanguage.g:1354:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTemplateFunctionCallAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateFunctionCallAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEcssLanguage.g:1374:3: ( ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||LA31_0==40||LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEcssLanguage.g:1375:4: ( (lv_parValue_4_0= ruleTemplateParameterValue ) ) (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )*
                    {
                    // InternalEcssLanguage.g:1375:4: ( (lv_parValue_4_0= ruleTemplateParameterValue ) )
                    // InternalEcssLanguage.g:1376:5: (lv_parValue_4_0= ruleTemplateParameterValue )
                    {
                    // InternalEcssLanguage.g:1376:5: (lv_parValue_4_0= ruleTemplateParameterValue )
                    // InternalEcssLanguage.g:1377:6: lv_parValue_4_0= ruleTemplateParameterValue
                    {

                    						newCompositeNode(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_parValue_4_0=ruleTemplateParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateFunctionCallRule());
                    						}
                    						add(
                    							current,
                    							"parValue",
                    							lv_parValue_4_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEcssLanguage.g:1394:4: (otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==32) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalEcssLanguage.g:1395:5: otherlv_5= ',' ( (lv_parValue_6_0= ruleTemplateParameterValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_36); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTemplateFunctionCallAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalEcssLanguage.g:1399:5: ( (lv_parValue_6_0= ruleTemplateParameterValue ) )
                    	    // InternalEcssLanguage.g:1400:6: (lv_parValue_6_0= ruleTemplateParameterValue )
                    	    {
                    	    // InternalEcssLanguage.g:1400:6: (lv_parValue_6_0= ruleTemplateParameterValue )
                    	    // InternalEcssLanguage.g:1401:7: lv_parValue_6_0= ruleTemplateParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_parValue_6_0=ruleTemplateParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateFunctionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parValue",
                    	    								lv_parValue_6_0,
                    	    								"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTemplateFunctionCallAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleTemplateFunctionCall"


    // $ANTLR start "entryRuleSlotCall"
    // InternalEcssLanguage.g:1428:1: entryRuleSlotCall returns [EObject current=null] : iv_ruleSlotCall= ruleSlotCall EOF ;
    public final EObject entryRuleSlotCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotCall = null;


        try {
            // InternalEcssLanguage.g:1428:49: (iv_ruleSlotCall= ruleSlotCall EOF )
            // InternalEcssLanguage.g:1429:2: iv_ruleSlotCall= ruleSlotCall EOF
            {
             newCompositeNode(grammarAccess.getSlotCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlotCall=ruleSlotCall();

            state._fsp--;

             current =iv_ruleSlotCall; 
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
    // $ANTLR end "entryRuleSlotCall"


    // $ANTLR start "ruleSlotCall"
    // InternalEcssLanguage.g:1435:1: ruleSlotCall returns [EObject current=null] : (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleSlotCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_minValue_3_0=null;
        Token otherlv_4=null;
        Token lv_maxValue_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1441:2: ( (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )? ) )
            // InternalEcssLanguage.g:1442:2: (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )? )
            {
            // InternalEcssLanguage.g:1442:2: (otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )? )
            // InternalEcssLanguage.g:1443:3: otherlv_0= '\\u00A7' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSlotCallAccess().getSectionSignKeyword_0());
            		
            // InternalEcssLanguage.g:1447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEcssLanguage.g:1448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEcssLanguage.g:1448:4: (lv_name_1_0= RULE_ID )
            // InternalEcssLanguage.g:1449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSlotCallAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlotCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEcssLanguage.g:1465:3: (otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEcssLanguage.g:1466:4: otherlv_2= '[' ( (lv_minValue_3_0= RULE_INT ) ) (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSlotCallAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalEcssLanguage.g:1470:4: ( (lv_minValue_3_0= RULE_INT ) )
                    // InternalEcssLanguage.g:1471:5: (lv_minValue_3_0= RULE_INT )
                    {
                    // InternalEcssLanguage.g:1471:5: (lv_minValue_3_0= RULE_INT )
                    // InternalEcssLanguage.g:1472:6: lv_minValue_3_0= RULE_INT
                    {
                    lv_minValue_3_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_minValue_3_0, grammarAccess.getSlotCallAccess().getMinValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSlotCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minValue",
                    							lv_minValue_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:1488:4: (otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) ) )
                    // InternalEcssLanguage.g:1489:5: otherlv_4= '..' ( (lv_maxValue_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getSlotCallAccess().getFullStopFullStopKeyword_2_2_0());
                    				
                    // InternalEcssLanguage.g:1493:5: ( (lv_maxValue_5_0= RULE_INT ) )
                    // InternalEcssLanguage.g:1494:6: (lv_maxValue_5_0= RULE_INT )
                    {
                    // InternalEcssLanguage.g:1494:6: (lv_maxValue_5_0= RULE_INT )
                    // InternalEcssLanguage.g:1495:7: lv_maxValue_5_0= RULE_INT
                    {
                    lv_maxValue_5_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                    							newLeafNode(lv_maxValue_5_0, grammarAccess.getSlotCallAccess().getMaxValueINTTerminalRuleCall_2_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSlotCallRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"maxValue",
                    								lv_maxValue_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSlotCallAccess().getRightSquareBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleSlotCall"


    // $ANTLR start "entryRuleLocalOrValueCall"
    // InternalEcssLanguage.g:1521:1: entryRuleLocalOrValueCall returns [EObject current=null] : iv_ruleLocalOrValueCall= ruleLocalOrValueCall EOF ;
    public final EObject entryRuleLocalOrValueCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalOrValueCall = null;


        try {
            // InternalEcssLanguage.g:1521:57: (iv_ruleLocalOrValueCall= ruleLocalOrValueCall EOF )
            // InternalEcssLanguage.g:1522:2: iv_ruleLocalOrValueCall= ruleLocalOrValueCall EOF
            {
             newCompositeNode(grammarAccess.getLocalOrValueCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalOrValueCall=ruleLocalOrValueCall();

            state._fsp--;

             current =iv_ruleLocalOrValueCall; 
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
    // $ANTLR end "entryRuleLocalOrValueCall"


    // $ANTLR start "ruleLocalOrValueCall"
    // InternalEcssLanguage.g:1528:1: ruleLocalOrValueCall returns [EObject current=null] : (otherlv_0= '$' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) ) ) ;
    public final EObject ruleLocalOrValueCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1534:2: ( (otherlv_0= '$' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) ) ) )
            // InternalEcssLanguage.g:1535:2: (otherlv_0= '$' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) ) )
            {
            // InternalEcssLanguage.g:1535:2: (otherlv_0= '$' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) ) )
            // InternalEcssLanguage.g:1536:3: otherlv_0= '$' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalOrValueCallAccess().getDollarSignKeyword_0());
            		
            // InternalEcssLanguage.g:1540:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_name_2_0= RULE_QUALIFIEDNAME ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_QUALIFIEDNAME) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalEcssLanguage.g:1541:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalEcssLanguage.g:1541:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalEcssLanguage.g:1542:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1542:5: (lv_name_1_0= RULE_ID )
                    // InternalEcssLanguage.g:1543:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getLocalOrValueCallAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalOrValueCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1560:4: ( (lv_name_2_0= RULE_QUALIFIEDNAME ) )
                    {
                    // InternalEcssLanguage.g:1560:4: ( (lv_name_2_0= RULE_QUALIFIEDNAME ) )
                    // InternalEcssLanguage.g:1561:5: (lv_name_2_0= RULE_QUALIFIEDNAME )
                    {
                    // InternalEcssLanguage.g:1561:5: (lv_name_2_0= RULE_QUALIFIEDNAME )
                    // InternalEcssLanguage.g:1562:6: lv_name_2_0= RULE_QUALIFIEDNAME
                    {
                    lv_name_2_0=(Token)match(input,RULE_QUALIFIEDNAME,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getLocalOrValueCallAccess().getNameQUALIFIEDNAMETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalOrValueCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.QUALIFIEDNAME");
                    					

                    }


                    }


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
    // $ANTLR end "ruleLocalOrValueCall"


    // $ANTLR start "entryRuleLocalEvaluationCall"
    // InternalEcssLanguage.g:1583:1: entryRuleLocalEvaluationCall returns [EObject current=null] : iv_ruleLocalEvaluationCall= ruleLocalEvaluationCall EOF ;
    public final EObject entryRuleLocalEvaluationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalEvaluationCall = null;


        try {
            // InternalEcssLanguage.g:1583:60: (iv_ruleLocalEvaluationCall= ruleLocalEvaluationCall EOF )
            // InternalEcssLanguage.g:1584:2: iv_ruleLocalEvaluationCall= ruleLocalEvaluationCall EOF
            {
             newCompositeNode(grammarAccess.getLocalEvaluationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalEvaluationCall=ruleLocalEvaluationCall();

            state._fsp--;

             current =iv_ruleLocalEvaluationCall; 
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
    // $ANTLR end "entryRuleLocalEvaluationCall"


    // $ANTLR start "ruleLocalEvaluationCall"
    // InternalEcssLanguage.g:1590:1: ruleLocalEvaluationCall returns [EObject current=null] : (otherlv_0= '$#' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLocalEvaluationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1596:2: ( (otherlv_0= '$#' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEcssLanguage.g:1597:2: (otherlv_0= '$#' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEcssLanguage.g:1597:2: (otherlv_0= '$#' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEcssLanguage.g:1598:3: otherlv_0= '$#' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalEvaluationCallAccess().getDollarSignNumberSignKeyword_0());
            		
            // InternalEcssLanguage.g:1602:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEcssLanguage.g:1603:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEcssLanguage.g:1603:4: (lv_value_1_0= RULE_STRING )
            // InternalEcssLanguage.g:1604:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getLocalEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalEvaluationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleLocalEvaluationCall"


    // $ANTLR start "entryRuleTemplateParameterValue"
    // InternalEcssLanguage.g:1624:1: entryRuleTemplateParameterValue returns [EObject current=null] : iv_ruleTemplateParameterValue= ruleTemplateParameterValue EOF ;
    public final EObject entryRuleTemplateParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterValue = null;


        try {
            // InternalEcssLanguage.g:1624:63: (iv_ruleTemplateParameterValue= ruleTemplateParameterValue EOF )
            // InternalEcssLanguage.g:1625:2: iv_ruleTemplateParameterValue= ruleTemplateParameterValue EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateParameterValue=ruleTemplateParameterValue();

            state._fsp--;

             current =iv_ruleTemplateParameterValue; 
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
    // $ANTLR end "entryRuleTemplateParameterValue"


    // $ANTLR start "ruleTemplateParameterValue"
    // InternalEcssLanguage.g:1631:1: ruleTemplateParameterValue returns [EObject current=null] : ( (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) ) | ( (lv_varName_2_0= RULE_ID ) ) | (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? ) | ( (lv_direct_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleTemplateParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_propName_1_0=null;
        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        Token lv_slotName_4_0=null;
        Token otherlv_5=null;
        Token lv_minValue_6_0=null;
        Token otherlv_7=null;
        Token lv_maxValue_8_0=null;
        Token otherlv_9=null;
        Token lv_direct_10_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1637:2: ( ( (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) ) | ( (lv_varName_2_0= RULE_ID ) ) | (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? ) | ( (lv_direct_10_0= RULE_STRING ) ) ) )
            // InternalEcssLanguage.g:1638:2: ( (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) ) | ( (lv_varName_2_0= RULE_ID ) ) | (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? ) | ( (lv_direct_10_0= RULE_STRING ) ) )
            {
            // InternalEcssLanguage.g:1638:2: ( (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) ) | ( (lv_varName_2_0= RULE_ID ) ) | (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? ) | ( (lv_direct_10_0= RULE_STRING ) ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                alt35=2;
                }
                break;
            case 42:
                {
                alt35=3;
                }
                break;
            case RULE_STRING:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEcssLanguage.g:1639:3: (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) )
                    {
                    // InternalEcssLanguage.g:1639:3: (otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) ) )
                    // InternalEcssLanguage.g:1640:4: otherlv_0= '$' ( (lv_propName_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getTemplateParameterValueAccess().getDollarSignKeyword_0_0());
                    			
                    // InternalEcssLanguage.g:1644:4: ( (lv_propName_1_0= RULE_ID ) )
                    // InternalEcssLanguage.g:1645:5: (lv_propName_1_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1645:5: (lv_propName_1_0= RULE_ID )
                    // InternalEcssLanguage.g:1646:6: lv_propName_1_0= RULE_ID
                    {
                    lv_propName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_propName_1_0, grammarAccess.getTemplateParameterValueAccess().getPropNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"propName",
                    							lv_propName_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1664:3: ( (lv_varName_2_0= RULE_ID ) )
                    {
                    // InternalEcssLanguage.g:1664:3: ( (lv_varName_2_0= RULE_ID ) )
                    // InternalEcssLanguage.g:1665:4: (lv_varName_2_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1665:4: (lv_varName_2_0= RULE_ID )
                    // InternalEcssLanguage.g:1666:5: lv_varName_2_0= RULE_ID
                    {
                    lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_varName_2_0, grammarAccess.getTemplateParameterValueAccess().getVarNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"varName",
                    						lv_varName_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:1683:3: (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? )
                    {
                    // InternalEcssLanguage.g:1683:3: (otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )? )
                    // InternalEcssLanguage.g:1684:4: otherlv_3= '\\u00A7' ( (lv_slotName_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )?
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTemplateParameterValueAccess().getSectionSignKeyword_2_0());
                    			
                    // InternalEcssLanguage.g:1688:4: ( (lv_slotName_4_0= RULE_ID ) )
                    // InternalEcssLanguage.g:1689:5: (lv_slotName_4_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:1689:5: (lv_slotName_4_0= RULE_ID )
                    // InternalEcssLanguage.g:1690:6: lv_slotName_4_0= RULE_ID
                    {
                    lv_slotName_4_0=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(lv_slotName_4_0, grammarAccess.getTemplateParameterValueAccess().getSlotNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"slotName",
                    							lv_slotName_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:1706:4: (otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==43) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEcssLanguage.g:1707:5: otherlv_5= '[' ( (lv_minValue_6_0= RULE_INT ) ) (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) ) otherlv_9= ']'
                            {
                            otherlv_5=(Token)match(input,43,FOLLOW_10); 

                            					newLeafNode(otherlv_5, grammarAccess.getTemplateParameterValueAccess().getLeftSquareBracketKeyword_2_2_0());
                            				
                            // InternalEcssLanguage.g:1711:5: ( (lv_minValue_6_0= RULE_INT ) )
                            // InternalEcssLanguage.g:1712:6: (lv_minValue_6_0= RULE_INT )
                            {
                            // InternalEcssLanguage.g:1712:6: (lv_minValue_6_0= RULE_INT )
                            // InternalEcssLanguage.g:1713:7: lv_minValue_6_0= RULE_INT
                            {
                            lv_minValue_6_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                            							newLeafNode(lv_minValue_6_0, grammarAccess.getTemplateParameterValueAccess().getMinValueINTTerminalRuleCall_2_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"minValue",
                            								lv_minValue_6_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            // InternalEcssLanguage.g:1729:5: (otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) ) )
                            // InternalEcssLanguage.g:1730:6: otherlv_7= '..' ( (lv_maxValue_8_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_10); 

                            						newLeafNode(otherlv_7, grammarAccess.getTemplateParameterValueAccess().getFullStopFullStopKeyword_2_2_2_0());
                            					
                            // InternalEcssLanguage.g:1734:6: ( (lv_maxValue_8_0= RULE_INT ) )
                            // InternalEcssLanguage.g:1735:7: (lv_maxValue_8_0= RULE_INT )
                            {
                            // InternalEcssLanguage.g:1735:7: (lv_maxValue_8_0= RULE_INT )
                            // InternalEcssLanguage.g:1736:8: lv_maxValue_8_0= RULE_INT
                            {
                            lv_maxValue_8_0=(Token)match(input,RULE_INT,FOLLOW_39); 

                            								newLeafNode(lv_maxValue_8_0, grammarAccess.getTemplateParameterValueAccess().getMaxValueINTTerminalRuleCall_2_2_2_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"maxValue",
                            									lv_maxValue_8_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }


                            }

                            otherlv_9=(Token)match(input,45,FOLLOW_2); 

                            					newLeafNode(otherlv_9, grammarAccess.getTemplateParameterValueAccess().getRightSquareBracketKeyword_2_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:1760:3: ( (lv_direct_10_0= RULE_STRING ) )
                    {
                    // InternalEcssLanguage.g:1760:3: ( (lv_direct_10_0= RULE_STRING ) )
                    // InternalEcssLanguage.g:1761:4: (lv_direct_10_0= RULE_STRING )
                    {
                    // InternalEcssLanguage.g:1761:4: (lv_direct_10_0= RULE_STRING )
                    // InternalEcssLanguage.g:1762:5: lv_direct_10_0= RULE_STRING
                    {
                    lv_direct_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_direct_10_0, grammarAccess.getTemplateParameterValueAccess().getDirectSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTemplateParameterValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"direct",
                    						lv_direct_10_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleTemplateParameterValue"


    // $ANTLR start "entryRuleEvaluationCall"
    // InternalEcssLanguage.g:1782:1: entryRuleEvaluationCall returns [EObject current=null] : iv_ruleEvaluationCall= ruleEvaluationCall EOF ;
    public final EObject entryRuleEvaluationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationCall = null;


        try {
            // InternalEcssLanguage.g:1782:55: (iv_ruleEvaluationCall= ruleEvaluationCall EOF )
            // InternalEcssLanguage.g:1783:2: iv_ruleEvaluationCall= ruleEvaluationCall EOF
            {
             newCompositeNode(grammarAccess.getEvaluationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluationCall=ruleEvaluationCall();

            state._fsp--;

             current =iv_ruleEvaluationCall; 
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
    // $ANTLR end "entryRuleEvaluationCall"


    // $ANTLR start "ruleEvaluationCall"
    // InternalEcssLanguage.g:1789:1: ruleEvaluationCall returns [EObject current=null] : (otherlv_0= '#' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvaluationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:1795:2: ( (otherlv_0= '#' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEcssLanguage.g:1796:2: (otherlv_0= '#' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEcssLanguage.g:1796:2: (otherlv_0= '#' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEcssLanguage.g:1797:3: otherlv_0= '#' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEvaluationCallAccess().getNumberSignKeyword_0());
            		
            // InternalEcssLanguage.g:1801:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEcssLanguage.g:1802:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEcssLanguage.g:1802:4: (lv_value_1_0= RULE_STRING )
            // InternalEcssLanguage.g:1803:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvaluationCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleEvaluationCall"


    // $ANTLR start "entryRulePropertyRule"
    // InternalEcssLanguage.g:1823:1: entryRulePropertyRule returns [EObject current=null] : iv_rulePropertyRule= rulePropertyRule EOF ;
    public final EObject entryRulePropertyRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRule = null;


        try {
            // InternalEcssLanguage.g:1823:53: (iv_rulePropertyRule= rulePropertyRule EOF )
            // InternalEcssLanguage.g:1824:2: iv_rulePropertyRule= rulePropertyRule EOF
            {
             newCompositeNode(grammarAccess.getPropertyRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyRule=rulePropertyRule();

            state._fsp--;

             current =iv_rulePropertyRule; 
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
    // $ANTLR end "entryRulePropertyRule"


    // $ANTLR start "rulePropertyRule"
    // InternalEcssLanguage.g:1830:1: rulePropertyRule returns [EObject current=null] : ( () ( (lv_selector_1_0= ruleSelector ) )? otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject rulePropertyRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_selector_1_0 = null;

        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1836:2: ( ( () ( (lv_selector_1_0= ruleSelector ) )? otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalEcssLanguage.g:1837:2: ( () ( (lv_selector_1_0= ruleSelector ) )? otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalEcssLanguage.g:1837:2: ( () ( (lv_selector_1_0= ruleSelector ) )? otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalEcssLanguage.g:1838:3: () ( (lv_selector_1_0= ruleSelector ) )? otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalEcssLanguage.g:1838:3: ()
            // InternalEcssLanguage.g:1839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyRuleAccess().getPropertyRuleAction_0(),
            					current);
            			

            }

            // InternalEcssLanguage.g:1845:3: ( (lv_selector_1_0= ruleSelector ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEcssLanguage.g:1846:4: (lv_selector_1_0= ruleSelector )
                    {
                    // InternalEcssLanguage.g:1846:4: (lv_selector_1_0= ruleSelector )
                    // InternalEcssLanguage.g:1847:5: lv_selector_1_0= ruleSelector
                    {

                    					newCompositeNode(grammarAccess.getPropertyRuleAccess().getSelectorSelectorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_selector_1_0=ruleSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
                    					}
                    					set(
                    						current,
                    						"selector",
                    						lv_selector_1_0,
                    						"uk.ac.york.cs.ecss.language.EcssLanguage.Selector");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEcssLanguage.g:1868:3: ( (lv_property_3_0= ruleProperty ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==24||LA37_0==50) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEcssLanguage.g:1869:4: (lv_property_3_0= ruleProperty )
            	    {
            	    // InternalEcssLanguage.g:1869:4: (lv_property_3_0= ruleProperty )
            	    // InternalEcssLanguage.g:1870:5: lv_property_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyRuleAccess().getPropertyPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_property_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"property",
            	    						lv_property_3_0,
            	    						"uk.ac.york.cs.ecss.language.EcssLanguage.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePropertyRule"


    // $ANTLR start "entryRuleSelector"
    // InternalEcssLanguage.g:1895:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalEcssLanguage.g:1895:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalEcssLanguage.g:1896:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalEcssLanguage.g:1902:1: ruleSelector returns [EObject current=null] : ( (lv_selectors_0_0= ruleSingleSelector ) )+ ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_selectors_0_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1908:2: ( ( (lv_selectors_0_0= ruleSingleSelector ) )+ )
            // InternalEcssLanguage.g:1909:2: ( (lv_selectors_0_0= ruleSingleSelector ) )+
            {
            // InternalEcssLanguage.g:1909:2: ( (lv_selectors_0_0= ruleSingleSelector ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==48) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEcssLanguage.g:1910:3: (lv_selectors_0_0= ruleSingleSelector )
            	    {
            	    // InternalEcssLanguage.g:1910:3: (lv_selectors_0_0= ruleSingleSelector )
            	    // InternalEcssLanguage.g:1911:4: lv_selectors_0_0= ruleSingleSelector
            	    {

            	    				newCompositeNode(grammarAccess.getSelectorAccess().getSelectorsSingleSelectorParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_42);
            	    lv_selectors_0_0=ruleSingleSelector();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSelectorRule());
            	    				}
            	    				add(
            	    					current,
            	    					"selectors",
            	    					lv_selectors_0_0,
            	    					"uk.ac.york.cs.ecss.language.EcssLanguage.SingleSelector");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSingleSelector"
    // InternalEcssLanguage.g:1931:1: entryRuleSingleSelector returns [EObject current=null] : iv_ruleSingleSelector= ruleSingleSelector EOF ;
    public final EObject entryRuleSingleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSelector = null;


        try {
            // InternalEcssLanguage.g:1931:55: (iv_ruleSingleSelector= ruleSingleSelector EOF )
            // InternalEcssLanguage.g:1932:2: iv_ruleSingleSelector= ruleSingleSelector EOF
            {
             newCompositeNode(grammarAccess.getSingleSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleSelector=ruleSingleSelector();

            state._fsp--;

             current =iv_ruleSingleSelector; 
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
    // $ANTLR end "entryRuleSingleSelector"


    // $ANTLR start "ruleSingleSelector"
    // InternalEcssLanguage.g:1938:1: ruleSingleSelector returns [EObject current=null] : ( ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) ) ( (lv_condition_2_0= ruleCondition ) )? ) ;
    public final EObject ruleSingleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_allTypes_0_0=null;
        Token lv_referredName_1_1=null;
        Token lv_referredName_1_2=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:1944:2: ( ( ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) ) ( (lv_condition_2_0= ruleCondition ) )? ) )
            // InternalEcssLanguage.g:1945:2: ( ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) ) ( (lv_condition_2_0= ruleCondition ) )? )
            {
            // InternalEcssLanguage.g:1945:2: ( ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) ) ( (lv_condition_2_0= ruleCondition ) )? )
            // InternalEcssLanguage.g:1946:3: ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) ) ( (lv_condition_2_0= ruleCondition ) )?
            {
            // InternalEcssLanguage.g:1946:3: ( ( (lv_allTypes_0_0= '*' ) ) | ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalEcssLanguage.g:1947:4: ( (lv_allTypes_0_0= '*' ) )
                    {
                    // InternalEcssLanguage.g:1947:4: ( (lv_allTypes_0_0= '*' ) )
                    // InternalEcssLanguage.g:1948:5: (lv_allTypes_0_0= '*' )
                    {
                    // InternalEcssLanguage.g:1948:5: (lv_allTypes_0_0= '*' )
                    // InternalEcssLanguage.g:1949:6: lv_allTypes_0_0= '*'
                    {
                    lv_allTypes_0_0=(Token)match(input,48,FOLLOW_37); 

                    						newLeafNode(lv_allTypes_0_0, grammarAccess.getSingleSelectorAccess().getAllTypesAsteriskKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleSelectorRule());
                    						}
                    						setWithLastConsumed(current, "allTypes", true, "*");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1962:4: ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) )
                    {
                    // InternalEcssLanguage.g:1962:4: ( ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) ) )
                    // InternalEcssLanguage.g:1963:5: ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) )
                    {
                    // InternalEcssLanguage.g:1963:5: ( (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING ) )
                    // InternalEcssLanguage.g:1964:6: (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING )
                    {
                    // InternalEcssLanguage.g:1964:6: (lv_referredName_1_1= RULE_ID | lv_referredName_1_2= RULE_STRING )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_STRING) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalEcssLanguage.g:1965:7: lv_referredName_1_1= RULE_ID
                            {
                            lv_referredName_1_1=(Token)match(input,RULE_ID,FOLLOW_37); 

                            							newLeafNode(lv_referredName_1_1, grammarAccess.getSingleSelectorAccess().getReferredNameIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSingleSelectorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"referredName",
                            								lv_referredName_1_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalEcssLanguage.g:1980:7: lv_referredName_1_2= RULE_STRING
                            {
                            lv_referredName_1_2=(Token)match(input,RULE_STRING,FOLLOW_37); 

                            							newLeafNode(lv_referredName_1_2, grammarAccess.getSingleSelectorAccess().getReferredNameSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSingleSelectorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"referredName",
                            								lv_referredName_1_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:1998:3: ( (lv_condition_2_0= ruleCondition ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEcssLanguage.g:1999:4: (lv_condition_2_0= ruleCondition )
                    {
                    // InternalEcssLanguage.g:1999:4: (lv_condition_2_0= ruleCondition )
                    // InternalEcssLanguage.g:2000:5: lv_condition_2_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getSingleSelectorAccess().getConditionConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_2_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleSelectorRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_2_0,
                    						"uk.ac.york.cs.ecss.language.EcssLanguage.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleSingleSelector"


    // $ANTLR start "entryRulePossiblySignedNumber"
    // InternalEcssLanguage.g:2021:1: entryRulePossiblySignedNumber returns [String current=null] : iv_rulePossiblySignedNumber= rulePossiblySignedNumber EOF ;
    public final String entryRulePossiblySignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePossiblySignedNumber = null;


        try {
            // InternalEcssLanguage.g:2021:60: (iv_rulePossiblySignedNumber= rulePossiblySignedNumber EOF )
            // InternalEcssLanguage.g:2022:2: iv_rulePossiblySignedNumber= rulePossiblySignedNumber EOF
            {
             newCompositeNode(grammarAccess.getPossiblySignedNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePossiblySignedNumber=rulePossiblySignedNumber();

            state._fsp--;

             current =iv_rulePossiblySignedNumber.getText(); 
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
    // $ANTLR end "entryRulePossiblySignedNumber"


    // $ANTLR start "rulePossiblySignedNumber"
    // InternalEcssLanguage.g:2028:1: rulePossiblySignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken rulePossiblySignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:2034:2: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // InternalEcssLanguage.g:2035:2: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // InternalEcssLanguage.g:2035:2: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // InternalEcssLanguage.g:2036:3: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // InternalEcssLanguage.g:2036:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEcssLanguage.g:2037:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPossiblySignedNumberAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

            			current.merge(this_NUMBER_1);
            		

            			newLeafNode(this_NUMBER_1, grammarAccess.getPossiblySignedNumberAccess().getNUMBERTerminalRuleCall_1());
            		

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
    // $ANTLR end "rulePossiblySignedNumber"


    // $ANTLR start "entryRuleProperty"
    // InternalEcssLanguage.g:2054:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalEcssLanguage.g:2054:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalEcssLanguage.g:2055:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalEcssLanguage.g:2061:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ':' ( (lv_value_5_0= rulePropertyValue ) )+ otherlv_6= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_templateMatch_0_0 = null;

        EObject lv_slotMatch_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:2067:2: ( ( ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ':' ( (lv_value_5_0= rulePropertyValue ) )+ otherlv_6= ';' ) )
            // InternalEcssLanguage.g:2068:2: ( ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ':' ( (lv_value_5_0= rulePropertyValue ) )+ otherlv_6= ';' )
            {
            // InternalEcssLanguage.g:2068:2: ( ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ':' ( (lv_value_5_0= rulePropertyValue ) )+ otherlv_6= ';' )
            // InternalEcssLanguage.g:2069:3: ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ) ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ':' ( (lv_value_5_0= rulePropertyValue ) )+ otherlv_6= ';'
            {
            // InternalEcssLanguage.g:2069:3: ( ( (lv_templateMatch_0_0= ruleTemplateMatch ) ) | ( (lv_slotMatch_1_0= ruleSlotMatch ) ) | ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt44=1;
                }
                break;
            case 50:
                {
                alt44=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalEcssLanguage.g:2070:4: ( (lv_templateMatch_0_0= ruleTemplateMatch ) )
                    {
                    // InternalEcssLanguage.g:2070:4: ( (lv_templateMatch_0_0= ruleTemplateMatch ) )
                    // InternalEcssLanguage.g:2071:5: (lv_templateMatch_0_0= ruleTemplateMatch )
                    {
                    // InternalEcssLanguage.g:2071:5: (lv_templateMatch_0_0= ruleTemplateMatch )
                    // InternalEcssLanguage.g:2072:6: lv_templateMatch_0_0= ruleTemplateMatch
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTemplateMatchTemplateMatchParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_templateMatch_0_0=ruleTemplateMatch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"templateMatch",
                    							lv_templateMatch_0_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.TemplateMatch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:2090:4: ( (lv_slotMatch_1_0= ruleSlotMatch ) )
                    {
                    // InternalEcssLanguage.g:2090:4: ( (lv_slotMatch_1_0= ruleSlotMatch ) )
                    // InternalEcssLanguage.g:2091:5: (lv_slotMatch_1_0= ruleSlotMatch )
                    {
                    // InternalEcssLanguage.g:2091:5: (lv_slotMatch_1_0= ruleSlotMatch )
                    // InternalEcssLanguage.g:2092:6: lv_slotMatch_1_0= ruleSlotMatch
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getSlotMatchSlotMatchParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_slotMatch_1_0=ruleSlotMatch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"slotMatch",
                    							lv_slotMatch_1_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.SlotMatch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:2110:4: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
                    {
                    // InternalEcssLanguage.g:2110:4: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
                    // InternalEcssLanguage.g:2111:5: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
                    {
                    // InternalEcssLanguage.g:2111:5: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
                    // InternalEcssLanguage.g:2112:6: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
                    {
                    // InternalEcssLanguage.g:2112:6: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_STRING) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalEcssLanguage.g:2113:7: lv_name_2_1= RULE_ID
                            {
                            lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_43); 

                            							newLeafNode(lv_name_2_1, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPropertyRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_2_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalEcssLanguage.g:2128:7: lv_name_2_2= RULE_STRING
                            {
                            lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_43); 

                            							newLeafNode(lv_name_2_2, grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_0_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPropertyRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_2_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:2146:3: ( (lv_condition_3_0= ruleCondition ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEcssLanguage.g:2147:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalEcssLanguage.g:2147:4: (lv_condition_3_0= ruleCondition )
                    // InternalEcssLanguage.g:2148:5: lv_condition_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getConditionConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_3_0,
                    						"uk.ac.york.cs.ecss.language.EcssLanguage.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalEcssLanguage.g:2169:3: ( (lv_value_5_0= rulePropertyValue ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_NUMBER||(LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||LA46_0==49||LA46_0==51) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalEcssLanguage.g:2170:4: (lv_value_5_0= rulePropertyValue )
            	    {
            	    // InternalEcssLanguage.g:2170:4: (lv_value_5_0= rulePropertyValue )
            	    // InternalEcssLanguage.g:2171:5: lv_value_5_0= rulePropertyValue
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_value_5_0=rulePropertyValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_5_0,
            	    						"uk.ac.york.cs.ecss.language.EcssLanguage.PropertyValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTemplateMatch"
    // InternalEcssLanguage.g:2196:1: entryRuleTemplateMatch returns [EObject current=null] : iv_ruleTemplateMatch= ruleTemplateMatch EOF ;
    public final EObject entryRuleTemplateMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateMatch = null;


        try {
            // InternalEcssLanguage.g:2196:54: (iv_ruleTemplateMatch= ruleTemplateMatch EOF )
            // InternalEcssLanguage.g:2197:2: iv_ruleTemplateMatch= ruleTemplateMatch EOF
            {
             newCompositeNode(grammarAccess.getTemplateMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateMatch=ruleTemplateMatch();

            state._fsp--;

             current =iv_ruleTemplateMatch; 
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
    // $ANTLR end "entryRuleTemplateMatch"


    // $ANTLR start "ruleTemplateMatch"
    // InternalEcssLanguage.g:2203:1: ruleTemplateMatch returns [EObject current=null] : (otherlv_0= 'template' otherlv_1= '(' ( (lv_selector_2_0= ruleSingleSelector ) ) otherlv_3= ')' ) ;
    public final EObject ruleTemplateMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selector_2_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:2209:2: ( (otherlv_0= 'template' otherlv_1= '(' ( (lv_selector_2_0= ruleSingleSelector ) ) otherlv_3= ')' ) )
            // InternalEcssLanguage.g:2210:2: (otherlv_0= 'template' otherlv_1= '(' ( (lv_selector_2_0= ruleSingleSelector ) ) otherlv_3= ')' )
            {
            // InternalEcssLanguage.g:2210:2: (otherlv_0= 'template' otherlv_1= '(' ( (lv_selector_2_0= ruleSingleSelector ) ) otherlv_3= ')' )
            // InternalEcssLanguage.g:2211:3: otherlv_0= 'template' otherlv_1= '(' ( (lv_selector_2_0= ruleSingleSelector ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateMatchAccess().getTemplateKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateMatchAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEcssLanguage.g:2219:3: ( (lv_selector_2_0= ruleSingleSelector ) )
            // InternalEcssLanguage.g:2220:4: (lv_selector_2_0= ruleSingleSelector )
            {
            // InternalEcssLanguage.g:2220:4: (lv_selector_2_0= ruleSingleSelector )
            // InternalEcssLanguage.g:2221:5: lv_selector_2_0= ruleSingleSelector
            {

            					newCompositeNode(grammarAccess.getTemplateMatchAccess().getSelectorSingleSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_selector_2_0=ruleSingleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemplateMatchRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_2_0,
            						"uk.ac.york.cs.ecss.language.EcssLanguage.SingleSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateMatchAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTemplateMatch"


    // $ANTLR start "entryRuleSlotMatch"
    // InternalEcssLanguage.g:2246:1: entryRuleSlotMatch returns [EObject current=null] : iv_ruleSlotMatch= ruleSlotMatch EOF ;
    public final EObject entryRuleSlotMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlotMatch = null;


        try {
            // InternalEcssLanguage.g:2246:50: (iv_ruleSlotMatch= ruleSlotMatch EOF )
            // InternalEcssLanguage.g:2247:2: iv_ruleSlotMatch= ruleSlotMatch EOF
            {
             newCompositeNode(grammarAccess.getSlotMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlotMatch=ruleSlotMatch();

            state._fsp--;

             current =iv_ruleSlotMatch; 
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
    // $ANTLR end "entryRuleSlotMatch"


    // $ANTLR start "ruleSlotMatch"
    // InternalEcssLanguage.g:2253:1: ruleSlotMatch returns [EObject current=null] : (otherlv_0= 'slot' otherlv_1= '(' ( (lv_first_2_0= ruleSingleSelector ) ) otherlv_3= ',' ( (lv_second_4_0= ruleSingleSelector ) ) otherlv_5= ')' ) ;
    public final EObject ruleSlotMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_first_2_0 = null;

        EObject lv_second_4_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:2259:2: ( (otherlv_0= 'slot' otherlv_1= '(' ( (lv_first_2_0= ruleSingleSelector ) ) otherlv_3= ',' ( (lv_second_4_0= ruleSingleSelector ) ) otherlv_5= ')' ) )
            // InternalEcssLanguage.g:2260:2: (otherlv_0= 'slot' otherlv_1= '(' ( (lv_first_2_0= ruleSingleSelector ) ) otherlv_3= ',' ( (lv_second_4_0= ruleSingleSelector ) ) otherlv_5= ')' )
            {
            // InternalEcssLanguage.g:2260:2: (otherlv_0= 'slot' otherlv_1= '(' ( (lv_first_2_0= ruleSingleSelector ) ) otherlv_3= ',' ( (lv_second_4_0= ruleSingleSelector ) ) otherlv_5= ')' )
            // InternalEcssLanguage.g:2261:3: otherlv_0= 'slot' otherlv_1= '(' ( (lv_first_2_0= ruleSingleSelector ) ) otherlv_3= ',' ( (lv_second_4_0= ruleSingleSelector ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSlotMatchAccess().getSlotKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getSlotMatchAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEcssLanguage.g:2269:3: ( (lv_first_2_0= ruleSingleSelector ) )
            // InternalEcssLanguage.g:2270:4: (lv_first_2_0= ruleSingleSelector )
            {
            // InternalEcssLanguage.g:2270:4: (lv_first_2_0= ruleSingleSelector )
            // InternalEcssLanguage.g:2271:5: lv_first_2_0= ruleSingleSelector
            {

            					newCompositeNode(grammarAccess.getSlotMatchAccess().getFirstSingleSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_first_2_0=ruleSingleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlotMatchRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_2_0,
            						"uk.ac.york.cs.ecss.language.EcssLanguage.SingleSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getSlotMatchAccess().getCommaKeyword_3());
            		
            // InternalEcssLanguage.g:2292:3: ( (lv_second_4_0= ruleSingleSelector ) )
            // InternalEcssLanguage.g:2293:4: (lv_second_4_0= ruleSingleSelector )
            {
            // InternalEcssLanguage.g:2293:4: (lv_second_4_0= ruleSingleSelector )
            // InternalEcssLanguage.g:2294:5: lv_second_4_0= ruleSingleSelector
            {

            					newCompositeNode(grammarAccess.getSlotMatchAccess().getSecondSingleSelectorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_second_4_0=ruleSingleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlotMatchRule());
            					}
            					set(
            						current,
            						"second",
            						lv_second_4_0,
            						"uk.ac.york.cs.ecss.language.EcssLanguage.SingleSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSlotMatchAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSlotMatch"


    // $ANTLR start "entryRulePropertyValue"
    // InternalEcssLanguage.g:2319:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalEcssLanguage.g:2319:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalEcssLanguage.g:2320:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalEcssLanguage.g:2326:1: rulePropertyValue returns [EObject current=null] : ( ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) ) ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )? ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token lv_hasProperty_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_valueNumb_2_0 = null;

        EObject lv_oclvalue_4_0 = null;

        EObject lv_argument_6_0 = null;

        EObject lv_argument_8_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:2332:2: ( ( ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) ) ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )? ) )
            // InternalEcssLanguage.g:2333:2: ( ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) ) ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )? )
            {
            // InternalEcssLanguage.g:2333:2: ( ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) ) ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )? )
            // InternalEcssLanguage.g:2334:3: ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) ) ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )?
            {
            // InternalEcssLanguage.g:2334:3: ( ( (lv_value_0_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) ) | (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt47=1;
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_NUMBER:
            case 49:
                {
                alt47=3;
                }
                break;
            case 51:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalEcssLanguage.g:2335:4: ( (lv_value_0_0= RULE_ID ) )
                    {
                    // InternalEcssLanguage.g:2335:4: ( (lv_value_0_0= RULE_ID ) )
                    // InternalEcssLanguage.g:2336:5: (lv_value_0_0= RULE_ID )
                    {
                    // InternalEcssLanguage.g:2336:5: (lv_value_0_0= RULE_ID )
                    // InternalEcssLanguage.g:2337:6: lv_value_0_0= RULE_ID
                    {
                    lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_48); 

                    						newLeafNode(lv_value_0_0, grammarAccess.getPropertyValueAccess().getValueIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:2354:4: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalEcssLanguage.g:2354:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalEcssLanguage.g:2355:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalEcssLanguage.g:2355:5: (lv_value_1_0= RULE_STRING )
                    // InternalEcssLanguage.g:2356:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPropertyValueAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:2373:4: ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) )
                    {
                    // InternalEcssLanguage.g:2373:4: ( (lv_valueNumb_2_0= rulePossiblySignedNumber ) )
                    // InternalEcssLanguage.g:2374:5: (lv_valueNumb_2_0= rulePossiblySignedNumber )
                    {
                    // InternalEcssLanguage.g:2374:5: (lv_valueNumb_2_0= rulePossiblySignedNumber )
                    // InternalEcssLanguage.g:2375:6: lv_valueNumb_2_0= rulePossiblySignedNumber
                    {

                    						newCompositeNode(grammarAccess.getPropertyValueAccess().getValueNumbPossiblySignedNumberParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_valueNumb_2_0=rulePossiblySignedNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                    						}
                    						set(
                    							current,
                    							"valueNumb",
                    							lv_valueNumb_2_0,
                    							"uk.ac.york.cs.ecss.language.EcssLanguage.PossiblySignedNumber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:2393:4: (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) )
                    {
                    // InternalEcssLanguage.g:2393:4: (otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) ) )
                    // InternalEcssLanguage.g:2394:5: otherlv_3= 'ocl' ( (lv_oclvalue_4_0= ruleSpecificationCS ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_12); 

                    					newLeafNode(otherlv_3, grammarAccess.getPropertyValueAccess().getOclKeyword_0_3_0());
                    				
                    // InternalEcssLanguage.g:2398:5: ( (lv_oclvalue_4_0= ruleSpecificationCS ) )
                    // InternalEcssLanguage.g:2399:6: (lv_oclvalue_4_0= ruleSpecificationCS )
                    {
                    // InternalEcssLanguage.g:2399:6: (lv_oclvalue_4_0= ruleSpecificationCS )
                    // InternalEcssLanguage.g:2400:7: lv_oclvalue_4_0= ruleSpecificationCS
                    {

                    							newCompositeNode(grammarAccess.getPropertyValueAccess().getOclvalueSpecificationCSParserRuleCall_0_3_1_0());
                    						
                    pushFollow(FOLLOW_48);
                    lv_oclvalue_4_0=ruleSpecificationCS();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                    							}
                    							set(
                    								current,
                    								"oclvalue",
                    								lv_oclvalue_4_0,
                    								"uk.ac.york.cs.ecss.language.EcssLanguage.SpecificationCS");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEcssLanguage.g:2419:3: ( ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEcssLanguage.g:2420:4: ( (lv_hasProperty_5_0= '(' ) ) ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )? otherlv_9= ')'
                    {
                    // InternalEcssLanguage.g:2420:4: ( (lv_hasProperty_5_0= '(' ) )
                    // InternalEcssLanguage.g:2421:5: (lv_hasProperty_5_0= '(' )
                    {
                    // InternalEcssLanguage.g:2421:5: (lv_hasProperty_5_0= '(' )
                    // InternalEcssLanguage.g:2422:6: lv_hasProperty_5_0= '('
                    {
                    lv_hasProperty_5_0=(Token)match(input,37,FOLLOW_49); 

                    						newLeafNode(lv_hasProperty_5_0, grammarAccess.getPropertyValueAccess().getHasPropertyLeftParenthesisKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyValueRule());
                    						}
                    						setWithLastConsumed(current, "hasProperty", true, "(");
                    					

                    }


                    }

                    // InternalEcssLanguage.g:2434:4: ( ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_NUMBER||(LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==49||LA49_0==51) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEcssLanguage.g:2435:5: ( (lv_argument_6_0= rulePropertyValue ) ) (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )*
                            {
                            // InternalEcssLanguage.g:2435:5: ( (lv_argument_6_0= rulePropertyValue ) )
                            // InternalEcssLanguage.g:2436:6: (lv_argument_6_0= rulePropertyValue )
                            {
                            // InternalEcssLanguage.g:2436:6: (lv_argument_6_0= rulePropertyValue )
                            // InternalEcssLanguage.g:2437:7: lv_argument_6_0= rulePropertyValue
                            {

                            							newCompositeNode(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_35);
                            lv_argument_6_0=rulePropertyValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                            							}
                            							add(
                            								current,
                            								"argument",
                            								lv_argument_6_0,
                            								"uk.ac.york.cs.ecss.language.EcssLanguage.PropertyValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalEcssLanguage.g:2454:5: (otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==32) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalEcssLanguage.g:2455:6: otherlv_7= ',' ( (lv_argument_8_0= rulePropertyValue ) )
                            	    {
                            	    otherlv_7=(Token)match(input,32,FOLLOW_44); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getPropertyValueAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalEcssLanguage.g:2459:6: ( (lv_argument_8_0= rulePropertyValue ) )
                            	    // InternalEcssLanguage.g:2460:7: (lv_argument_8_0= rulePropertyValue )
                            	    {
                            	    // InternalEcssLanguage.g:2460:7: (lv_argument_8_0= rulePropertyValue )
                            	    // InternalEcssLanguage.g:2461:8: lv_argument_8_0= rulePropertyValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_35);
                            	    lv_argument_8_0=rulePropertyValue();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"argument",
                            	    									lv_argument_8_0,
                            	    									"uk.ac.york.cs.ecss.language.EcssLanguage.PropertyValue");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyValueAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleCondition"
    // InternalEcssLanguage.g:2489:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEcssLanguage.g:2489:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEcssLanguage.g:2490:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalEcssLanguage.g:2496:1: ruleCondition returns [EObject current=null] : (otherlv_0= '[' ( (lv_expression_1_0= ruleSpecificationCS ) ) otherlv_2= ']' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalEcssLanguage.g:2502:2: ( (otherlv_0= '[' ( (lv_expression_1_0= ruleSpecificationCS ) ) otherlv_2= ']' ) )
            // InternalEcssLanguage.g:2503:2: (otherlv_0= '[' ( (lv_expression_1_0= ruleSpecificationCS ) ) otherlv_2= ']' )
            {
            // InternalEcssLanguage.g:2503:2: (otherlv_0= '[' ( (lv_expression_1_0= ruleSpecificationCS ) ) otherlv_2= ']' )
            // InternalEcssLanguage.g:2504:3: otherlv_0= '[' ( (lv_expression_1_0= ruleSpecificationCS ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEcssLanguage.g:2508:3: ( (lv_expression_1_0= ruleSpecificationCS ) )
            // InternalEcssLanguage.g:2509:4: (lv_expression_1_0= ruleSpecificationCS )
            {
            // InternalEcssLanguage.g:2509:4: (lv_expression_1_0= ruleSpecificationCS )
            // InternalEcssLanguage.g:2510:5: lv_expression_1_0= ruleSpecificationCS
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getExpressionSpecificationCSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_expression_1_0=ruleSpecificationCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"uk.ac.york.cs.ecss.language.EcssLanguage.SpecificationCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSpecificationCS"
    // InternalEcssLanguage.g:2535:1: entryRuleSpecificationCS returns [EObject current=null] : iv_ruleSpecificationCS= ruleSpecificationCS EOF ;
    public final EObject entryRuleSpecificationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationCS = null;


        try {
            // InternalEcssLanguage.g:2535:56: (iv_ruleSpecificationCS= ruleSpecificationCS EOF )
            // InternalEcssLanguage.g:2536:2: iv_ruleSpecificationCS= ruleSpecificationCS EOF
            {
             newCompositeNode(grammarAccess.getSpecificationCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificationCS=ruleSpecificationCS();

            state._fsp--;

             current =iv_ruleSpecificationCS; 
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
    // $ANTLR end "entryRuleSpecificationCS"


    // $ANTLR start "ruleSpecificationCS"
    // InternalEcssLanguage.g:2542:1: ruleSpecificationCS returns [EObject current=null] : ( (lv_ownedExpression_0_0= RULE_STRING ) ) ;
    public final EObject ruleSpecificationCS() throws RecognitionException {
        EObject current = null;

        Token lv_ownedExpression_0_0=null;


        	enterRule();

        try {
            // InternalEcssLanguage.g:2548:2: ( ( (lv_ownedExpression_0_0= RULE_STRING ) ) )
            // InternalEcssLanguage.g:2549:2: ( (lv_ownedExpression_0_0= RULE_STRING ) )
            {
            // InternalEcssLanguage.g:2549:2: ( (lv_ownedExpression_0_0= RULE_STRING ) )
            // InternalEcssLanguage.g:2550:3: (lv_ownedExpression_0_0= RULE_STRING )
            {
            // InternalEcssLanguage.g:2550:3: (lv_ownedExpression_0_0= RULE_STRING )
            // InternalEcssLanguage.g:2551:4: lv_ownedExpression_0_0= RULE_STRING
            {
            lv_ownedExpression_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_ownedExpression_0_0, grammarAccess.getSpecificationCSAccess().getOwnedExpressionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpecificationCSRule());
            				}
            				setWithLastConsumed(
            					current,
            					"ownedExpression",
            					lv_ownedExpression_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleSpecificationCS"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\10\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\6\1\7\6\uffff\1\6\2\uffff";
    static final String dfa_4s = "\1\57\1\51\6\uffff\1\57\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\33\uffff\1\6\1\uffff\1\7\3\uffff\1\1\1\uffff\1\5\3\uffff\1\2\1\4",
            "\1\10\1\11\40\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\12\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\uffff\1\11\10\uffff\1\11\1\uffff\1\11\1\12\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "945:2: (this_TemplateFunctionCall_0= ruleTemplateFunctionCall | this_LocalEvaluationCall_1= ruleLocalEvaluationCall | this_LocalOrValueCall_2= ruleLocalOrValueCall | this_StaticTemplateRulePart_3= ruleStaticTemplateRulePart | this_EvaluationCall_4= ruleEvaluationCall | this_SlotCall_5= ruleSlotCall | this_ForEachExpression_6= ruleForEachExpression | this_IfExpression_7= ruleIfExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00010000554200C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00010000550200C2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000A800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000002A2820000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000282820080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000302820000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000C51400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C51400200040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000C51400800040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000C51400020040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000540000000C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000500000000C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00040000012000C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00010000000000C2L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000A0000000000D0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000A0000008000D0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00010000000000C0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000A0040000000D0L});

}