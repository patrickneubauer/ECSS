package uk.ac.york.cs.ecss.language.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.york.cs.ecss.language.services.EcssLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcssLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_QUALIFIEDNAME", "RULE_TEST1", "RULE_TEST3", "RULE_TEST2", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Config'", "'{'", "'}'", "'import'", "';'", "'template'", "':'", "'templateGen'", "'extends'", "'javarule'", "'::'", "'rule'", "'with'", "','", "'id'", "'for'", "'join'", "'if'", "'('", "')'", "'else'", "'$'", "'\\u00A7'", "'['", "']'", "'..'", "'$#'", "'#'", "'-'", "'slot'", "'ocl'", "'minImprovement'", "'maxDegression'", "'maxThings'", "'@'", "'*'"
    };
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


        public InternalEcssLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEcssLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEcssLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEcssLanguage.g"; }


    	private EcssLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(EcssLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalEcssLanguage.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:54:1: ( ruleModel EOF )
            // InternalEcssLanguage.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEcssLanguage.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalEcssLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalEcssLanguage.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalEcssLanguage.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalEcssLanguage.g:69:3: ( rule__Model__Group__0 )
            // InternalEcssLanguage.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfig"
    // InternalEcssLanguage.g:78:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:79:1: ( ruleConfig EOF )
            // InternalEcssLanguage.g:80:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalEcssLanguage.g:87:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:91:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalEcssLanguage.g:92:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalEcssLanguage.g:92:2: ( ( rule__Config__Group__0 ) )
            // InternalEcssLanguage.g:93:3: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // InternalEcssLanguage.g:94:3: ( rule__Config__Group__0 )
            // InternalEcssLanguage.g:94:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleImport"
    // InternalEcssLanguage.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:104:1: ( ruleImport EOF )
            // InternalEcssLanguage.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEcssLanguage.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEcssLanguage.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEcssLanguage.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalEcssLanguage.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEcssLanguage.g:119:3: ( rule__Import__Group__0 )
            // InternalEcssLanguage.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTemplateDef"
    // InternalEcssLanguage.g:128:1: entryRuleTemplateDef : ruleTemplateDef EOF ;
    public final void entryRuleTemplateDef() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:129:1: ( ruleTemplateDef EOF )
            // InternalEcssLanguage.g:130:1: ruleTemplateDef EOF
            {
             before(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getTemplateDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalEcssLanguage.g:137:1: ruleTemplateDef : ( ( rule__TemplateDef__Group__0 ) ) ;
    public final void ruleTemplateDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:141:2: ( ( ( rule__TemplateDef__Group__0 ) ) )
            // InternalEcssLanguage.g:142:2: ( ( rule__TemplateDef__Group__0 ) )
            {
            // InternalEcssLanguage.g:142:2: ( ( rule__TemplateDef__Group__0 ) )
            // InternalEcssLanguage.g:143:3: ( rule__TemplateDef__Group__0 )
            {
             before(grammarAccess.getTemplateDefAccess().getGroup()); 
            // InternalEcssLanguage.g:144:3: ( rule__TemplateDef__Group__0 )
            // InternalEcssLanguage.g:144:4: rule__TemplateDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleTemplateGenDef"
    // InternalEcssLanguage.g:153:1: entryRuleTemplateGenDef : ruleTemplateGenDef EOF ;
    public final void entryRuleTemplateGenDef() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:154:1: ( ruleTemplateGenDef EOF )
            // InternalEcssLanguage.g:155:1: ruleTemplateGenDef EOF
            {
             before(grammarAccess.getTemplateGenDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateGenDef();

            state._fsp--;

             after(grammarAccess.getTemplateGenDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateGenDef"


    // $ANTLR start "ruleTemplateGenDef"
    // InternalEcssLanguage.g:162:1: ruleTemplateGenDef : ( ( rule__TemplateGenDef__Group__0 ) ) ;
    public final void ruleTemplateGenDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:166:2: ( ( ( rule__TemplateGenDef__Group__0 ) ) )
            // InternalEcssLanguage.g:167:2: ( ( rule__TemplateGenDef__Group__0 ) )
            {
            // InternalEcssLanguage.g:167:2: ( ( rule__TemplateGenDef__Group__0 ) )
            // InternalEcssLanguage.g:168:3: ( rule__TemplateGenDef__Group__0 )
            {
             before(grammarAccess.getTemplateGenDefAccess().getGroup()); 
            // InternalEcssLanguage.g:169:3: ( rule__TemplateGenDef__Group__0 )
            // InternalEcssLanguage.g:169:4: rule__TemplateGenDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGenDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateGenDef"


    // $ANTLR start "entryRuleTemplateRule"
    // InternalEcssLanguage.g:178:1: entryRuleTemplateRule : ruleTemplateRule EOF ;
    public final void entryRuleTemplateRule() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:179:1: ( ruleTemplateRule EOF )
            // InternalEcssLanguage.g:180:1: ruleTemplateRule EOF
            {
             before(grammarAccess.getTemplateRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateRule();

            state._fsp--;

             after(grammarAccess.getTemplateRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateRule"


    // $ANTLR start "ruleTemplateRule"
    // InternalEcssLanguage.g:187:1: ruleTemplateRule : ( ( rule__TemplateRule__Alternatives ) ) ;
    public final void ruleTemplateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:191:2: ( ( ( rule__TemplateRule__Alternatives ) ) )
            // InternalEcssLanguage.g:192:2: ( ( rule__TemplateRule__Alternatives ) )
            {
            // InternalEcssLanguage.g:192:2: ( ( rule__TemplateRule__Alternatives ) )
            // InternalEcssLanguage.g:193:3: ( rule__TemplateRule__Alternatives )
            {
             before(grammarAccess.getTemplateRuleAccess().getAlternatives()); 
            // InternalEcssLanguage.g:194:3: ( rule__TemplateRule__Alternatives )
            // InternalEcssLanguage.g:194:4: rule__TemplateRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemplateRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateRule"


    // $ANTLR start "entryRuleBasicTemplateRule"
    // InternalEcssLanguage.g:203:1: entryRuleBasicTemplateRule : ruleBasicTemplateRule EOF ;
    public final void entryRuleBasicTemplateRule() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:204:1: ( ruleBasicTemplateRule EOF )
            // InternalEcssLanguage.g:205:1: ruleBasicTemplateRule EOF
            {
             before(grammarAccess.getBasicTemplateRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicTemplateRule();

            state._fsp--;

             after(grammarAccess.getBasicTemplateRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicTemplateRule"


    // $ANTLR start "ruleBasicTemplateRule"
    // InternalEcssLanguage.g:212:1: ruleBasicTemplateRule : ( ( rule__BasicTemplateRule__Group__0 ) ) ;
    public final void ruleBasicTemplateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:216:2: ( ( ( rule__BasicTemplateRule__Group__0 ) ) )
            // InternalEcssLanguage.g:217:2: ( ( rule__BasicTemplateRule__Group__0 ) )
            {
            // InternalEcssLanguage.g:217:2: ( ( rule__BasicTemplateRule__Group__0 ) )
            // InternalEcssLanguage.g:218:3: ( rule__BasicTemplateRule__Group__0 )
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getGroup()); 
            // InternalEcssLanguage.g:219:3: ( rule__BasicTemplateRule__Group__0 )
            // InternalEcssLanguage.g:219:4: rule__BasicTemplateRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTemplateRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicTemplateRule"


    // $ANTLR start "entryRuleTemplateGeneratorRule"
    // InternalEcssLanguage.g:228:1: entryRuleTemplateGeneratorRule : ruleTemplateGeneratorRule EOF ;
    public final void entryRuleTemplateGeneratorRule() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:229:1: ( ruleTemplateGeneratorRule EOF )
            // InternalEcssLanguage.g:230:1: ruleTemplateGeneratorRule EOF
            {
             before(grammarAccess.getTemplateGeneratorRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateGeneratorRule();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateGeneratorRule"


    // $ANTLR start "ruleTemplateGeneratorRule"
    // InternalEcssLanguage.g:237:1: ruleTemplateGeneratorRule : ( ( rule__TemplateGeneratorRule__Group__0 ) ) ;
    public final void ruleTemplateGeneratorRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:241:2: ( ( ( rule__TemplateGeneratorRule__Group__0 ) ) )
            // InternalEcssLanguage.g:242:2: ( ( rule__TemplateGeneratorRule__Group__0 ) )
            {
            // InternalEcssLanguage.g:242:2: ( ( rule__TemplateGeneratorRule__Group__0 ) )
            // InternalEcssLanguage.g:243:3: ( rule__TemplateGeneratorRule__Group__0 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup()); 
            // InternalEcssLanguage.g:244:3: ( rule__TemplateGeneratorRule__Group__0 )
            // InternalEcssLanguage.g:244:4: rule__TemplateGeneratorRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateGeneratorRule"


    // $ANTLR start "entryRuleTypeDef"
    // InternalEcssLanguage.g:253:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:254:1: ( ruleTypeDef EOF )
            // InternalEcssLanguage.g:255:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalEcssLanguage.g:262:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:266:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalEcssLanguage.g:267:2: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalEcssLanguage.g:267:2: ( ( rule__TypeDef__Group__0 ) )
            // InternalEcssLanguage.g:268:3: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // InternalEcssLanguage.g:269:3: ( rule__TypeDef__Group__0 )
            // InternalEcssLanguage.g:269:4: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTemplateRulePart"
    // InternalEcssLanguage.g:278:1: entryRuleTemplateRulePart : ruleTemplateRulePart EOF ;
    public final void entryRuleTemplateRulePart() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:279:1: ( ruleTemplateRulePart EOF )
            // InternalEcssLanguage.g:280:1: ruleTemplateRulePart EOF
            {
             before(grammarAccess.getTemplateRulePartRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getTemplateRulePartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateRulePart"


    // $ANTLR start "ruleTemplateRulePart"
    // InternalEcssLanguage.g:287:1: ruleTemplateRulePart : ( ( rule__TemplateRulePart__Alternatives ) ) ;
    public final void ruleTemplateRulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:291:2: ( ( ( rule__TemplateRulePart__Alternatives ) ) )
            // InternalEcssLanguage.g:292:2: ( ( rule__TemplateRulePart__Alternatives ) )
            {
            // InternalEcssLanguage.g:292:2: ( ( rule__TemplateRulePart__Alternatives ) )
            // InternalEcssLanguage.g:293:3: ( rule__TemplateRulePart__Alternatives )
            {
             before(grammarAccess.getTemplateRulePartAccess().getAlternatives()); 
            // InternalEcssLanguage.g:294:3: ( rule__TemplateRulePart__Alternatives )
            // InternalEcssLanguage.g:294:4: rule__TemplateRulePart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemplateRulePart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateRulePartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateRulePart"


    // $ANTLR start "entryRuleForEachExpression"
    // InternalEcssLanguage.g:303:1: entryRuleForEachExpression : ruleForEachExpression EOF ;
    public final void entryRuleForEachExpression() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:304:1: ( ruleForEachExpression EOF )
            // InternalEcssLanguage.g:305:1: ruleForEachExpression EOF
            {
             before(grammarAccess.getForEachExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleForEachExpression();

            state._fsp--;

             after(grammarAccess.getForEachExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForEachExpression"


    // $ANTLR start "ruleForEachExpression"
    // InternalEcssLanguage.g:312:1: ruleForEachExpression : ( ( rule__ForEachExpression__Group__0 ) ) ;
    public final void ruleForEachExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:316:2: ( ( ( rule__ForEachExpression__Group__0 ) ) )
            // InternalEcssLanguage.g:317:2: ( ( rule__ForEachExpression__Group__0 ) )
            {
            // InternalEcssLanguage.g:317:2: ( ( rule__ForEachExpression__Group__0 ) )
            // InternalEcssLanguage.g:318:3: ( rule__ForEachExpression__Group__0 )
            {
             before(grammarAccess.getForEachExpressionAccess().getGroup()); 
            // InternalEcssLanguage.g:319:3: ( rule__ForEachExpression__Group__0 )
            // InternalEcssLanguage.g:319:4: rule__ForEachExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForEachExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForEachExpression"


    // $ANTLR start "entryRuleIfExpression"
    // InternalEcssLanguage.g:328:1: entryRuleIfExpression : ruleIfExpression EOF ;
    public final void entryRuleIfExpression() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:329:1: ( ruleIfExpression EOF )
            // InternalEcssLanguage.g:330:1: ruleIfExpression EOF
            {
             before(grammarAccess.getIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIfExpression();

            state._fsp--;

             after(grammarAccess.getIfExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalEcssLanguage.g:337:1: ruleIfExpression : ( ( rule__IfExpression__Group__0 ) ) ;
    public final void ruleIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:341:2: ( ( ( rule__IfExpression__Group__0 ) ) )
            // InternalEcssLanguage.g:342:2: ( ( rule__IfExpression__Group__0 ) )
            {
            // InternalEcssLanguage.g:342:2: ( ( rule__IfExpression__Group__0 ) )
            // InternalEcssLanguage.g:343:3: ( rule__IfExpression__Group__0 )
            {
             before(grammarAccess.getIfExpressionAccess().getGroup()); 
            // InternalEcssLanguage.g:344:3: ( rule__IfExpression__Group__0 )
            // InternalEcssLanguage.g:344:4: rule__IfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleStaticTemplateRulePart"
    // InternalEcssLanguage.g:353:1: entryRuleStaticTemplateRulePart : ruleStaticTemplateRulePart EOF ;
    public final void entryRuleStaticTemplateRulePart() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:354:1: ( ruleStaticTemplateRulePart EOF )
            // InternalEcssLanguage.g:355:1: ruleStaticTemplateRulePart EOF
            {
             before(grammarAccess.getStaticTemplateRulePartRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getStaticTemplateRulePartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticTemplateRulePart"


    // $ANTLR start "ruleStaticTemplateRulePart"
    // InternalEcssLanguage.g:362:1: ruleStaticTemplateRulePart : ( ( rule__StaticTemplateRulePart__ValueAssignment ) ) ;
    public final void ruleStaticTemplateRulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:366:2: ( ( ( rule__StaticTemplateRulePart__ValueAssignment ) ) )
            // InternalEcssLanguage.g:367:2: ( ( rule__StaticTemplateRulePart__ValueAssignment ) )
            {
            // InternalEcssLanguage.g:367:2: ( ( rule__StaticTemplateRulePart__ValueAssignment ) )
            // InternalEcssLanguage.g:368:3: ( rule__StaticTemplateRulePart__ValueAssignment )
            {
             before(grammarAccess.getStaticTemplateRulePartAccess().getValueAssignment()); 
            // InternalEcssLanguage.g:369:3: ( rule__StaticTemplateRulePart__ValueAssignment )
            // InternalEcssLanguage.g:369:4: rule__StaticTemplateRulePart__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StaticTemplateRulePart__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStaticTemplateRulePartAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticTemplateRulePart"


    // $ANTLR start "entryRuleTemplateFunctionCall"
    // InternalEcssLanguage.g:378:1: entryRuleTemplateFunctionCall : ruleTemplateFunctionCall EOF ;
    public final void entryRuleTemplateFunctionCall() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:379:1: ( ruleTemplateFunctionCall EOF )
            // InternalEcssLanguage.g:380:1: ruleTemplateFunctionCall EOF
            {
             before(grammarAccess.getTemplateFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateFunctionCall();

            state._fsp--;

             after(grammarAccess.getTemplateFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateFunctionCall"


    // $ANTLR start "ruleTemplateFunctionCall"
    // InternalEcssLanguage.g:387:1: ruleTemplateFunctionCall : ( ( rule__TemplateFunctionCall__Group__0 ) ) ;
    public final void ruleTemplateFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:391:2: ( ( ( rule__TemplateFunctionCall__Group__0 ) ) )
            // InternalEcssLanguage.g:392:2: ( ( rule__TemplateFunctionCall__Group__0 ) )
            {
            // InternalEcssLanguage.g:392:2: ( ( rule__TemplateFunctionCall__Group__0 ) )
            // InternalEcssLanguage.g:393:3: ( rule__TemplateFunctionCall__Group__0 )
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getGroup()); 
            // InternalEcssLanguage.g:394:3: ( rule__TemplateFunctionCall__Group__0 )
            // InternalEcssLanguage.g:394:4: rule__TemplateFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateFunctionCall"


    // $ANTLR start "entryRuleSlotCall"
    // InternalEcssLanguage.g:403:1: entryRuleSlotCall : ruleSlotCall EOF ;
    public final void entryRuleSlotCall() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:404:1: ( ruleSlotCall EOF )
            // InternalEcssLanguage.g:405:1: ruleSlotCall EOF
            {
             before(grammarAccess.getSlotCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSlotCall();

            state._fsp--;

             after(grammarAccess.getSlotCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlotCall"


    // $ANTLR start "ruleSlotCall"
    // InternalEcssLanguage.g:412:1: ruleSlotCall : ( ( rule__SlotCall__Group__0 ) ) ;
    public final void ruleSlotCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:416:2: ( ( ( rule__SlotCall__Group__0 ) ) )
            // InternalEcssLanguage.g:417:2: ( ( rule__SlotCall__Group__0 ) )
            {
            // InternalEcssLanguage.g:417:2: ( ( rule__SlotCall__Group__0 ) )
            // InternalEcssLanguage.g:418:3: ( rule__SlotCall__Group__0 )
            {
             before(grammarAccess.getSlotCallAccess().getGroup()); 
            // InternalEcssLanguage.g:419:3: ( rule__SlotCall__Group__0 )
            // InternalEcssLanguage.g:419:4: rule__SlotCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlotCall"


    // $ANTLR start "entryRuleLocalOrValueCall"
    // InternalEcssLanguage.g:428:1: entryRuleLocalOrValueCall : ruleLocalOrValueCall EOF ;
    public final void entryRuleLocalOrValueCall() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:429:1: ( ruleLocalOrValueCall EOF )
            // InternalEcssLanguage.g:430:1: ruleLocalOrValueCall EOF
            {
             before(grammarAccess.getLocalOrValueCallRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalOrValueCall();

            state._fsp--;

             after(grammarAccess.getLocalOrValueCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalOrValueCall"


    // $ANTLR start "ruleLocalOrValueCall"
    // InternalEcssLanguage.g:437:1: ruleLocalOrValueCall : ( ( rule__LocalOrValueCall__Group__0 ) ) ;
    public final void ruleLocalOrValueCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:441:2: ( ( ( rule__LocalOrValueCall__Group__0 ) ) )
            // InternalEcssLanguage.g:442:2: ( ( rule__LocalOrValueCall__Group__0 ) )
            {
            // InternalEcssLanguage.g:442:2: ( ( rule__LocalOrValueCall__Group__0 ) )
            // InternalEcssLanguage.g:443:3: ( rule__LocalOrValueCall__Group__0 )
            {
             before(grammarAccess.getLocalOrValueCallAccess().getGroup()); 
            // InternalEcssLanguage.g:444:3: ( rule__LocalOrValueCall__Group__0 )
            // InternalEcssLanguage.g:444:4: rule__LocalOrValueCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalOrValueCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalOrValueCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalOrValueCall"


    // $ANTLR start "entryRuleLocalEvaluationCall"
    // InternalEcssLanguage.g:453:1: entryRuleLocalEvaluationCall : ruleLocalEvaluationCall EOF ;
    public final void entryRuleLocalEvaluationCall() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:454:1: ( ruleLocalEvaluationCall EOF )
            // InternalEcssLanguage.g:455:1: ruleLocalEvaluationCall EOF
            {
             before(grammarAccess.getLocalEvaluationCallRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalEvaluationCall();

            state._fsp--;

             after(grammarAccess.getLocalEvaluationCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalEvaluationCall"


    // $ANTLR start "ruleLocalEvaluationCall"
    // InternalEcssLanguage.g:462:1: ruleLocalEvaluationCall : ( ( rule__LocalEvaluationCall__Group__0 ) ) ;
    public final void ruleLocalEvaluationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:466:2: ( ( ( rule__LocalEvaluationCall__Group__0 ) ) )
            // InternalEcssLanguage.g:467:2: ( ( rule__LocalEvaluationCall__Group__0 ) )
            {
            // InternalEcssLanguage.g:467:2: ( ( rule__LocalEvaluationCall__Group__0 ) )
            // InternalEcssLanguage.g:468:3: ( rule__LocalEvaluationCall__Group__0 )
            {
             before(grammarAccess.getLocalEvaluationCallAccess().getGroup()); 
            // InternalEcssLanguage.g:469:3: ( rule__LocalEvaluationCall__Group__0 )
            // InternalEcssLanguage.g:469:4: rule__LocalEvaluationCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalEvaluationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalEvaluationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalEvaluationCall"


    // $ANTLR start "entryRuleTemplateParameterValue"
    // InternalEcssLanguage.g:478:1: entryRuleTemplateParameterValue : ruleTemplateParameterValue EOF ;
    public final void entryRuleTemplateParameterValue() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:479:1: ( ruleTemplateParameterValue EOF )
            // InternalEcssLanguage.g:480:1: ruleTemplateParameterValue EOF
            {
             before(grammarAccess.getTemplateParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateParameterValue();

            state._fsp--;

             after(grammarAccess.getTemplateParameterValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateParameterValue"


    // $ANTLR start "ruleTemplateParameterValue"
    // InternalEcssLanguage.g:487:1: ruleTemplateParameterValue : ( ( rule__TemplateParameterValue__Alternatives ) ) ;
    public final void ruleTemplateParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:491:2: ( ( ( rule__TemplateParameterValue__Alternatives ) ) )
            // InternalEcssLanguage.g:492:2: ( ( rule__TemplateParameterValue__Alternatives ) )
            {
            // InternalEcssLanguage.g:492:2: ( ( rule__TemplateParameterValue__Alternatives ) )
            // InternalEcssLanguage.g:493:3: ( rule__TemplateParameterValue__Alternatives )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getAlternatives()); 
            // InternalEcssLanguage.g:494:3: ( rule__TemplateParameterValue__Alternatives )
            // InternalEcssLanguage.g:494:4: rule__TemplateParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateParameterValue"


    // $ANTLR start "entryRuleEvaluationCall"
    // InternalEcssLanguage.g:503:1: entryRuleEvaluationCall : ruleEvaluationCall EOF ;
    public final void entryRuleEvaluationCall() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:504:1: ( ruleEvaluationCall EOF )
            // InternalEcssLanguage.g:505:1: ruleEvaluationCall EOF
            {
             before(grammarAccess.getEvaluationCallRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationCall();

            state._fsp--;

             after(grammarAccess.getEvaluationCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluationCall"


    // $ANTLR start "ruleEvaluationCall"
    // InternalEcssLanguage.g:512:1: ruleEvaluationCall : ( ( rule__EvaluationCall__Group__0 ) ) ;
    public final void ruleEvaluationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:516:2: ( ( ( rule__EvaluationCall__Group__0 ) ) )
            // InternalEcssLanguage.g:517:2: ( ( rule__EvaluationCall__Group__0 ) )
            {
            // InternalEcssLanguage.g:517:2: ( ( rule__EvaluationCall__Group__0 ) )
            // InternalEcssLanguage.g:518:3: ( rule__EvaluationCall__Group__0 )
            {
             before(grammarAccess.getEvaluationCallAccess().getGroup()); 
            // InternalEcssLanguage.g:519:3: ( rule__EvaluationCall__Group__0 )
            // InternalEcssLanguage.g:519:4: rule__EvaluationCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationCall"


    // $ANTLR start "entryRulePropertyRule"
    // InternalEcssLanguage.g:528:1: entryRulePropertyRule : rulePropertyRule EOF ;
    public final void entryRulePropertyRule() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:529:1: ( rulePropertyRule EOF )
            // InternalEcssLanguage.g:530:1: rulePropertyRule EOF
            {
             before(grammarAccess.getPropertyRuleRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyRule();

            state._fsp--;

             after(grammarAccess.getPropertyRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyRule"


    // $ANTLR start "rulePropertyRule"
    // InternalEcssLanguage.g:537:1: rulePropertyRule : ( ( rule__PropertyRule__Group__0 ) ) ;
    public final void rulePropertyRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:541:2: ( ( ( rule__PropertyRule__Group__0 ) ) )
            // InternalEcssLanguage.g:542:2: ( ( rule__PropertyRule__Group__0 ) )
            {
            // InternalEcssLanguage.g:542:2: ( ( rule__PropertyRule__Group__0 ) )
            // InternalEcssLanguage.g:543:3: ( rule__PropertyRule__Group__0 )
            {
             before(grammarAccess.getPropertyRuleAccess().getGroup()); 
            // InternalEcssLanguage.g:544:3: ( rule__PropertyRule__Group__0 )
            // InternalEcssLanguage.g:544:4: rule__PropertyRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyRule"


    // $ANTLR start "entryRuleSelector"
    // InternalEcssLanguage.g:553:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:554:1: ( ruleSelector EOF )
            // InternalEcssLanguage.g:555:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalEcssLanguage.g:562:1: ruleSelector : ( ( ( rule__Selector__SelectorsAssignment ) ) ( ( rule__Selector__SelectorsAssignment )* ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:566:2: ( ( ( ( rule__Selector__SelectorsAssignment ) ) ( ( rule__Selector__SelectorsAssignment )* ) ) )
            // InternalEcssLanguage.g:567:2: ( ( ( rule__Selector__SelectorsAssignment ) ) ( ( rule__Selector__SelectorsAssignment )* ) )
            {
            // InternalEcssLanguage.g:567:2: ( ( ( rule__Selector__SelectorsAssignment ) ) ( ( rule__Selector__SelectorsAssignment )* ) )
            // InternalEcssLanguage.g:568:3: ( ( rule__Selector__SelectorsAssignment ) ) ( ( rule__Selector__SelectorsAssignment )* )
            {
            // InternalEcssLanguage.g:568:3: ( ( rule__Selector__SelectorsAssignment ) )
            // InternalEcssLanguage.g:569:4: ( rule__Selector__SelectorsAssignment )
            {
             before(grammarAccess.getSelectorAccess().getSelectorsAssignment()); 
            // InternalEcssLanguage.g:570:4: ( rule__Selector__SelectorsAssignment )
            // InternalEcssLanguage.g:570:5: rule__Selector__SelectorsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Selector__SelectorsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorsAssignment()); 

            }

            // InternalEcssLanguage.g:573:3: ( ( rule__Selector__SelectorsAssignment )* )
            // InternalEcssLanguage.g:574:4: ( rule__Selector__SelectorsAssignment )*
            {
             before(grammarAccess.getSelectorAccess().getSelectorsAssignment()); 
            // InternalEcssLanguage.g:575:4: ( rule__Selector__SelectorsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEcssLanguage.g:575:5: rule__Selector__SelectorsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Selector__SelectorsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getSelectorsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSingleSelector"
    // InternalEcssLanguage.g:585:1: entryRuleSingleSelector : ruleSingleSelector EOF ;
    public final void entryRuleSingleSelector() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:586:1: ( ruleSingleSelector EOF )
            // InternalEcssLanguage.g:587:1: ruleSingleSelector EOF
            {
             before(grammarAccess.getSingleSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleSelector();

            state._fsp--;

             after(grammarAccess.getSingleSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleSelector"


    // $ANTLR start "ruleSingleSelector"
    // InternalEcssLanguage.g:594:1: ruleSingleSelector : ( ( rule__SingleSelector__Group__0 ) ) ;
    public final void ruleSingleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:598:2: ( ( ( rule__SingleSelector__Group__0 ) ) )
            // InternalEcssLanguage.g:599:2: ( ( rule__SingleSelector__Group__0 ) )
            {
            // InternalEcssLanguage.g:599:2: ( ( rule__SingleSelector__Group__0 ) )
            // InternalEcssLanguage.g:600:3: ( rule__SingleSelector__Group__0 )
            {
             before(grammarAccess.getSingleSelectorAccess().getGroup()); 
            // InternalEcssLanguage.g:601:3: ( rule__SingleSelector__Group__0 )
            // InternalEcssLanguage.g:601:4: rule__SingleSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleSelector"


    // $ANTLR start "entryRulePossiblySignedNumber"
    // InternalEcssLanguage.g:610:1: entryRulePossiblySignedNumber : rulePossiblySignedNumber EOF ;
    public final void entryRulePossiblySignedNumber() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:611:1: ( rulePossiblySignedNumber EOF )
            // InternalEcssLanguage.g:612:1: rulePossiblySignedNumber EOF
            {
             before(grammarAccess.getPossiblySignedNumberRule()); 
            pushFollow(FOLLOW_1);
            rulePossiblySignedNumber();

            state._fsp--;

             after(grammarAccess.getPossiblySignedNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePossiblySignedNumber"


    // $ANTLR start "rulePossiblySignedNumber"
    // InternalEcssLanguage.g:619:1: rulePossiblySignedNumber : ( ( rule__PossiblySignedNumber__Group__0 ) ) ;
    public final void rulePossiblySignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:623:2: ( ( ( rule__PossiblySignedNumber__Group__0 ) ) )
            // InternalEcssLanguage.g:624:2: ( ( rule__PossiblySignedNumber__Group__0 ) )
            {
            // InternalEcssLanguage.g:624:2: ( ( rule__PossiblySignedNumber__Group__0 ) )
            // InternalEcssLanguage.g:625:3: ( rule__PossiblySignedNumber__Group__0 )
            {
             before(grammarAccess.getPossiblySignedNumberAccess().getGroup()); 
            // InternalEcssLanguage.g:626:3: ( rule__PossiblySignedNumber__Group__0 )
            // InternalEcssLanguage.g:626:4: rule__PossiblySignedNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PossiblySignedNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPossiblySignedNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePossiblySignedNumber"


    // $ANTLR start "entryRuleProperty"
    // InternalEcssLanguage.g:635:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:636:1: ( ruleProperty EOF )
            // InternalEcssLanguage.g:637:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalEcssLanguage.g:644:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:648:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalEcssLanguage.g:649:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalEcssLanguage.g:649:2: ( ( rule__Property__Group__0 ) )
            // InternalEcssLanguage.g:650:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalEcssLanguage.g:651:3: ( rule__Property__Group__0 )
            // InternalEcssLanguage.g:651:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTemplateMatch"
    // InternalEcssLanguage.g:660:1: entryRuleTemplateMatch : ruleTemplateMatch EOF ;
    public final void entryRuleTemplateMatch() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:661:1: ( ruleTemplateMatch EOF )
            // InternalEcssLanguage.g:662:1: ruleTemplateMatch EOF
            {
             before(grammarAccess.getTemplateMatchRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateMatch();

            state._fsp--;

             after(grammarAccess.getTemplateMatchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateMatch"


    // $ANTLR start "ruleTemplateMatch"
    // InternalEcssLanguage.g:669:1: ruleTemplateMatch : ( ( rule__TemplateMatch__Group__0 ) ) ;
    public final void ruleTemplateMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:673:2: ( ( ( rule__TemplateMatch__Group__0 ) ) )
            // InternalEcssLanguage.g:674:2: ( ( rule__TemplateMatch__Group__0 ) )
            {
            // InternalEcssLanguage.g:674:2: ( ( rule__TemplateMatch__Group__0 ) )
            // InternalEcssLanguage.g:675:3: ( rule__TemplateMatch__Group__0 )
            {
             before(grammarAccess.getTemplateMatchAccess().getGroup()); 
            // InternalEcssLanguage.g:676:3: ( rule__TemplateMatch__Group__0 )
            // InternalEcssLanguage.g:676:4: rule__TemplateMatch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateMatch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateMatch"


    // $ANTLR start "entryRuleSlotMatch"
    // InternalEcssLanguage.g:685:1: entryRuleSlotMatch : ruleSlotMatch EOF ;
    public final void entryRuleSlotMatch() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:686:1: ( ruleSlotMatch EOF )
            // InternalEcssLanguage.g:687:1: ruleSlotMatch EOF
            {
             before(grammarAccess.getSlotMatchRule()); 
            pushFollow(FOLLOW_1);
            ruleSlotMatch();

            state._fsp--;

             after(grammarAccess.getSlotMatchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlotMatch"


    // $ANTLR start "ruleSlotMatch"
    // InternalEcssLanguage.g:694:1: ruleSlotMatch : ( ( rule__SlotMatch__Group__0 ) ) ;
    public final void ruleSlotMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:698:2: ( ( ( rule__SlotMatch__Group__0 ) ) )
            // InternalEcssLanguage.g:699:2: ( ( rule__SlotMatch__Group__0 ) )
            {
            // InternalEcssLanguage.g:699:2: ( ( rule__SlotMatch__Group__0 ) )
            // InternalEcssLanguage.g:700:3: ( rule__SlotMatch__Group__0 )
            {
             before(grammarAccess.getSlotMatchAccess().getGroup()); 
            // InternalEcssLanguage.g:701:3: ( rule__SlotMatch__Group__0 )
            // InternalEcssLanguage.g:701:4: rule__SlotMatch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlotMatch"


    // $ANTLR start "entryRulePropertyValue"
    // InternalEcssLanguage.g:710:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:711:1: ( rulePropertyValue EOF )
            // InternalEcssLanguage.g:712:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalEcssLanguage.g:719:1: rulePropertyValue : ( ( rule__PropertyValue__Group__0 ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:723:2: ( ( ( rule__PropertyValue__Group__0 ) ) )
            // InternalEcssLanguage.g:724:2: ( ( rule__PropertyValue__Group__0 ) )
            {
            // InternalEcssLanguage.g:724:2: ( ( rule__PropertyValue__Group__0 ) )
            // InternalEcssLanguage.g:725:3: ( rule__PropertyValue__Group__0 )
            {
             before(grammarAccess.getPropertyValueAccess().getGroup()); 
            // InternalEcssLanguage.g:726:3: ( rule__PropertyValue__Group__0 )
            // InternalEcssLanguage.g:726:4: rule__PropertyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleCondition"
    // InternalEcssLanguage.g:735:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:736:1: ( ruleCondition EOF )
            // InternalEcssLanguage.g:737:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalEcssLanguage.g:744:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:748:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalEcssLanguage.g:749:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalEcssLanguage.g:749:2: ( ( rule__Condition__Group__0 ) )
            // InternalEcssLanguage.g:750:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalEcssLanguage.g:751:3: ( rule__Condition__Group__0 )
            // InternalEcssLanguage.g:751:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSpecificationCS"
    // InternalEcssLanguage.g:760:1: entryRuleSpecificationCS : ruleSpecificationCS EOF ;
    public final void entryRuleSpecificationCS() throws RecognitionException {
        try {
            // InternalEcssLanguage.g:761:1: ( ruleSpecificationCS EOF )
            // InternalEcssLanguage.g:762:1: ruleSpecificationCS EOF
            {
             before(grammarAccess.getSpecificationCSRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecificationCS();

            state._fsp--;

             after(grammarAccess.getSpecificationCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecificationCS"


    // $ANTLR start "ruleSpecificationCS"
    // InternalEcssLanguage.g:769:1: ruleSpecificationCS : ( ( rule__SpecificationCS__OwnedExpressionAssignment ) ) ;
    public final void ruleSpecificationCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:773:2: ( ( ( rule__SpecificationCS__OwnedExpressionAssignment ) ) )
            // InternalEcssLanguage.g:774:2: ( ( rule__SpecificationCS__OwnedExpressionAssignment ) )
            {
            // InternalEcssLanguage.g:774:2: ( ( rule__SpecificationCS__OwnedExpressionAssignment ) )
            // InternalEcssLanguage.g:775:3: ( rule__SpecificationCS__OwnedExpressionAssignment )
            {
             before(grammarAccess.getSpecificationCSAccess().getOwnedExpressionAssignment()); 
            // InternalEcssLanguage.g:776:3: ( rule__SpecificationCS__OwnedExpressionAssignment )
            // InternalEcssLanguage.g:776:4: rule__SpecificationCS__OwnedExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SpecificationCS__OwnedExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationCSAccess().getOwnedExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecificationCS"


    // $ANTLR start "rule__Model__Alternatives_2"
    // InternalEcssLanguage.g:784:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__TemplateDefsAssignment_2_0 ) ) | ( ( rule__Model__TemplateGenDefsAssignment_2_1 ) ) | ( ( rule__Model__TemplatesAssignment_2_2 ) ) | ( ( rule__Model__PropertiesAssignment_2_3 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:788:1: ( ( ( rule__Model__TemplateDefsAssignment_2_0 ) ) | ( ( rule__Model__TemplateGenDefsAssignment_2_1 ) ) | ( ( rule__Model__TemplatesAssignment_2_2 ) ) | ( ( rule__Model__PropertiesAssignment_2_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 25:
            case 27:
                {
                alt2=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 17:
            case 51:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEcssLanguage.g:789:2: ( ( rule__Model__TemplateDefsAssignment_2_0 ) )
                    {
                    // InternalEcssLanguage.g:789:2: ( ( rule__Model__TemplateDefsAssignment_2_0 ) )
                    // InternalEcssLanguage.g:790:3: ( rule__Model__TemplateDefsAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getTemplateDefsAssignment_2_0()); 
                    // InternalEcssLanguage.g:791:3: ( rule__Model__TemplateDefsAssignment_2_0 )
                    // InternalEcssLanguage.g:791:4: rule__Model__TemplateDefsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TemplateDefsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getTemplateDefsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:795:2: ( ( rule__Model__TemplateGenDefsAssignment_2_1 ) )
                    {
                    // InternalEcssLanguage.g:795:2: ( ( rule__Model__TemplateGenDefsAssignment_2_1 ) )
                    // InternalEcssLanguage.g:796:3: ( rule__Model__TemplateGenDefsAssignment_2_1 )
                    {
                     before(grammarAccess.getModelAccess().getTemplateGenDefsAssignment_2_1()); 
                    // InternalEcssLanguage.g:797:3: ( rule__Model__TemplateGenDefsAssignment_2_1 )
                    // InternalEcssLanguage.g:797:4: rule__Model__TemplateGenDefsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TemplateGenDefsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getTemplateGenDefsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:801:2: ( ( rule__Model__TemplatesAssignment_2_2 ) )
                    {
                    // InternalEcssLanguage.g:801:2: ( ( rule__Model__TemplatesAssignment_2_2 ) )
                    // InternalEcssLanguage.g:802:3: ( rule__Model__TemplatesAssignment_2_2 )
                    {
                     before(grammarAccess.getModelAccess().getTemplatesAssignment_2_2()); 
                    // InternalEcssLanguage.g:803:3: ( rule__Model__TemplatesAssignment_2_2 )
                    // InternalEcssLanguage.g:803:4: rule__Model__TemplatesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TemplatesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getTemplatesAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:807:2: ( ( rule__Model__PropertiesAssignment_2_3 ) )
                    {
                    // InternalEcssLanguage.g:807:2: ( ( rule__Model__PropertiesAssignment_2_3 ) )
                    // InternalEcssLanguage.g:808:3: ( rule__Model__PropertiesAssignment_2_3 )
                    {
                     before(grammarAccess.getModelAccess().getPropertiesAssignment_2_3()); 
                    // InternalEcssLanguage.g:809:3: ( rule__Model__PropertiesAssignment_2_3 )
                    // InternalEcssLanguage.g:809:4: rule__Model__PropertiesAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PropertiesAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPropertiesAssignment_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_2"


    // $ANTLR start "rule__TemplateRule__Alternatives"
    // InternalEcssLanguage.g:817:1: rule__TemplateRule__Alternatives : ( ( ruleBasicTemplateRule ) | ( ruleTemplateGeneratorRule ) );
    public final void rule__TemplateRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:821:1: ( ( ruleBasicTemplateRule ) | ( ruleTemplateGeneratorRule ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEcssLanguage.g:822:2: ( ruleBasicTemplateRule )
                    {
                    // InternalEcssLanguage.g:822:2: ( ruleBasicTemplateRule )
                    // InternalEcssLanguage.g:823:3: ruleBasicTemplateRule
                    {
                     before(grammarAccess.getTemplateRuleAccess().getBasicTemplateRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicTemplateRule();

                    state._fsp--;

                     after(grammarAccess.getTemplateRuleAccess().getBasicTemplateRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:828:2: ( ruleTemplateGeneratorRule )
                    {
                    // InternalEcssLanguage.g:828:2: ( ruleTemplateGeneratorRule )
                    // InternalEcssLanguage.g:829:3: ruleTemplateGeneratorRule
                    {
                     before(grammarAccess.getTemplateRuleAccess().getTemplateGeneratorRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplateGeneratorRule();

                    state._fsp--;

                     after(grammarAccess.getTemplateRuleAccess().getTemplateGeneratorRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateRule__Alternatives"


    // $ANTLR start "rule__TemplateGeneratorRule__Alternatives_5"
    // InternalEcssLanguage.g:838:1: rule__TemplateGeneratorRule__Alternatives_5 : ( ( ( rule__TemplateGeneratorRule__Group_5_0__0 ) ) | ( ( rule__TemplateGeneratorRule__Group_5_1__0 ) ) );
    public final void rule__TemplateGeneratorRule__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:842:1: ( ( ( rule__TemplateGeneratorRule__Group_5_0__0 ) ) | ( ( rule__TemplateGeneratorRule__Group_5_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEcssLanguage.g:843:2: ( ( rule__TemplateGeneratorRule__Group_5_0__0 ) )
                    {
                    // InternalEcssLanguage.g:843:2: ( ( rule__TemplateGeneratorRule__Group_5_0__0 ) )
                    // InternalEcssLanguage.g:844:3: ( rule__TemplateGeneratorRule__Group_5_0__0 )
                    {
                     before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_5_0()); 
                    // InternalEcssLanguage.g:845:3: ( rule__TemplateGeneratorRule__Group_5_0__0 )
                    // InternalEcssLanguage.g:845:4: rule__TemplateGeneratorRule__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:849:2: ( ( rule__TemplateGeneratorRule__Group_5_1__0 ) )
                    {
                    // InternalEcssLanguage.g:849:2: ( ( rule__TemplateGeneratorRule__Group_5_1__0 ) )
                    // InternalEcssLanguage.g:850:3: ( rule__TemplateGeneratorRule__Group_5_1__0 )
                    {
                     before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_5_1()); 
                    // InternalEcssLanguage.g:851:3: ( rule__TemplateGeneratorRule__Group_5_1__0 )
                    // InternalEcssLanguage.g:851:4: rule__TemplateGeneratorRule__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Alternatives_5"


    // $ANTLR start "rule__TemplateRulePart__Alternatives"
    // InternalEcssLanguage.g:859:1: rule__TemplateRulePart__Alternatives : ( ( ruleTemplateFunctionCall ) | ( ruleLocalEvaluationCall ) | ( ruleLocalOrValueCall ) | ( ruleStaticTemplateRulePart ) | ( ruleEvaluationCall ) | ( ruleSlotCall ) | ( ruleForEachExpression ) | ( ruleIfExpression ) );
    public final void rule__TemplateRulePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:863:1: ( ( ruleTemplateFunctionCall ) | ( ruleLocalEvaluationCall ) | ( ruleLocalOrValueCall ) | ( ruleStaticTemplateRulePart ) | ( ruleEvaluationCall ) | ( ruleSlotCall ) | ( ruleForEachExpression ) | ( ruleIfExpression ) )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEcssLanguage.g:864:2: ( ruleTemplateFunctionCall )
                    {
                    // InternalEcssLanguage.g:864:2: ( ruleTemplateFunctionCall )
                    // InternalEcssLanguage.g:865:3: ruleTemplateFunctionCall
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getTemplateFunctionCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplateFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getTemplateFunctionCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:870:2: ( ruleLocalEvaluationCall )
                    {
                    // InternalEcssLanguage.g:870:2: ( ruleLocalEvaluationCall )
                    // InternalEcssLanguage.g:871:3: ruleLocalEvaluationCall
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getLocalEvaluationCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalEvaluationCall();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getLocalEvaluationCallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:876:2: ( ruleLocalOrValueCall )
                    {
                    // InternalEcssLanguage.g:876:2: ( ruleLocalOrValueCall )
                    // InternalEcssLanguage.g:877:3: ruleLocalOrValueCall
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getLocalOrValueCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalOrValueCall();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getLocalOrValueCallParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:882:2: ( ruleStaticTemplateRulePart )
                    {
                    // InternalEcssLanguage.g:882:2: ( ruleStaticTemplateRulePart )
                    // InternalEcssLanguage.g:883:3: ruleStaticTemplateRulePart
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getStaticTemplateRulePartParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStaticTemplateRulePart();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getStaticTemplateRulePartParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEcssLanguage.g:888:2: ( ruleEvaluationCall )
                    {
                    // InternalEcssLanguage.g:888:2: ( ruleEvaluationCall )
                    // InternalEcssLanguage.g:889:3: ruleEvaluationCall
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getEvaluationCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluationCall();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getEvaluationCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEcssLanguage.g:894:2: ( ruleSlotCall )
                    {
                    // InternalEcssLanguage.g:894:2: ( ruleSlotCall )
                    // InternalEcssLanguage.g:895:3: ruleSlotCall
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getSlotCallParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSlotCall();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getSlotCallParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEcssLanguage.g:900:2: ( ruleForEachExpression )
                    {
                    // InternalEcssLanguage.g:900:2: ( ruleForEachExpression )
                    // InternalEcssLanguage.g:901:3: ruleForEachExpression
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getForEachExpressionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleForEachExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getForEachExpressionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEcssLanguage.g:906:2: ( ruleIfExpression )
                    {
                    // InternalEcssLanguage.g:906:2: ( ruleIfExpression )
                    // InternalEcssLanguage.g:907:3: ruleIfExpression
                    {
                     before(grammarAccess.getTemplateRulePartAccess().getIfExpressionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleIfExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateRulePartAccess().getIfExpressionParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateRulePart__Alternatives"


    // $ANTLR start "rule__ForEachExpression__Alternatives_4"
    // InternalEcssLanguage.g:916:1: rule__ForEachExpression__Alternatives_4 : ( ( ( rule__ForEachExpression__ExprVarAssignment_4_0 ) ) | ( ( rule__ForEachExpression__CompleteExprAssignment_4_1 ) ) );
    public final void rule__ForEachExpression__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:920:1: ( ( ( rule__ForEachExpression__ExprVarAssignment_4_0 ) ) | ( ( rule__ForEachExpression__CompleteExprAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEcssLanguage.g:921:2: ( ( rule__ForEachExpression__ExprVarAssignment_4_0 ) )
                    {
                    // InternalEcssLanguage.g:921:2: ( ( rule__ForEachExpression__ExprVarAssignment_4_0 ) )
                    // InternalEcssLanguage.g:922:3: ( rule__ForEachExpression__ExprVarAssignment_4_0 )
                    {
                     before(grammarAccess.getForEachExpressionAccess().getExprVarAssignment_4_0()); 
                    // InternalEcssLanguage.g:923:3: ( rule__ForEachExpression__ExprVarAssignment_4_0 )
                    // InternalEcssLanguage.g:923:4: rule__ForEachExpression__ExprVarAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEachExpression__ExprVarAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachExpressionAccess().getExprVarAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:927:2: ( ( rule__ForEachExpression__CompleteExprAssignment_4_1 ) )
                    {
                    // InternalEcssLanguage.g:927:2: ( ( rule__ForEachExpression__CompleteExprAssignment_4_1 ) )
                    // InternalEcssLanguage.g:928:3: ( rule__ForEachExpression__CompleteExprAssignment_4_1 )
                    {
                     before(grammarAccess.getForEachExpressionAccess().getCompleteExprAssignment_4_1()); 
                    // InternalEcssLanguage.g:929:3: ( rule__ForEachExpression__CompleteExprAssignment_4_1 )
                    // InternalEcssLanguage.g:929:4: rule__ForEachExpression__CompleteExprAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEachExpression__CompleteExprAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getForEachExpressionAccess().getCompleteExprAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Alternatives_4"


    // $ANTLR start "rule__LocalOrValueCall__Alternatives_1"
    // InternalEcssLanguage.g:937:1: rule__LocalOrValueCall__Alternatives_1 : ( ( ( rule__LocalOrValueCall__NameAssignment_1_0 ) ) | ( ( rule__LocalOrValueCall__NameAssignment_1_1 ) ) );
    public final void rule__LocalOrValueCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:941:1: ( ( ( rule__LocalOrValueCall__NameAssignment_1_0 ) ) | ( ( rule__LocalOrValueCall__NameAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_QUALIFIEDNAME) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEcssLanguage.g:942:2: ( ( rule__LocalOrValueCall__NameAssignment_1_0 ) )
                    {
                    // InternalEcssLanguage.g:942:2: ( ( rule__LocalOrValueCall__NameAssignment_1_0 ) )
                    // InternalEcssLanguage.g:943:3: ( rule__LocalOrValueCall__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getLocalOrValueCallAccess().getNameAssignment_1_0()); 
                    // InternalEcssLanguage.g:944:3: ( rule__LocalOrValueCall__NameAssignment_1_0 )
                    // InternalEcssLanguage.g:944:4: rule__LocalOrValueCall__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalOrValueCall__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalOrValueCallAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:948:2: ( ( rule__LocalOrValueCall__NameAssignment_1_1 ) )
                    {
                    // InternalEcssLanguage.g:948:2: ( ( rule__LocalOrValueCall__NameAssignment_1_1 ) )
                    // InternalEcssLanguage.g:949:3: ( rule__LocalOrValueCall__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getLocalOrValueCallAccess().getNameAssignment_1_1()); 
                    // InternalEcssLanguage.g:950:3: ( rule__LocalOrValueCall__NameAssignment_1_1 )
                    // InternalEcssLanguage.g:950:4: rule__LocalOrValueCall__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalOrValueCall__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalOrValueCallAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__Alternatives_1"


    // $ANTLR start "rule__TemplateParameterValue__Alternatives"
    // InternalEcssLanguage.g:958:1: rule__TemplateParameterValue__Alternatives : ( ( ( rule__TemplateParameterValue__Group_0__0 ) ) | ( ( rule__TemplateParameterValue__VarNameAssignment_1 ) ) | ( ( rule__TemplateParameterValue__Group_2__0 ) ) | ( ( rule__TemplateParameterValue__DirectAssignment_3 ) ) );
    public final void rule__TemplateParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:962:1: ( ( ( rule__TemplateParameterValue__Group_0__0 ) ) | ( ( rule__TemplateParameterValue__VarNameAssignment_1 ) ) | ( ( rule__TemplateParameterValue__Group_2__0 ) ) | ( ( rule__TemplateParameterValue__DirectAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEcssLanguage.g:963:2: ( ( rule__TemplateParameterValue__Group_0__0 ) )
                    {
                    // InternalEcssLanguage.g:963:2: ( ( rule__TemplateParameterValue__Group_0__0 ) )
                    // InternalEcssLanguage.g:964:3: ( rule__TemplateParameterValue__Group_0__0 )
                    {
                     before(grammarAccess.getTemplateParameterValueAccess().getGroup_0()); 
                    // InternalEcssLanguage.g:965:3: ( rule__TemplateParameterValue__Group_0__0 )
                    // InternalEcssLanguage.g:965:4: rule__TemplateParameterValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateParameterValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateParameterValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:969:2: ( ( rule__TemplateParameterValue__VarNameAssignment_1 ) )
                    {
                    // InternalEcssLanguage.g:969:2: ( ( rule__TemplateParameterValue__VarNameAssignment_1 ) )
                    // InternalEcssLanguage.g:970:3: ( rule__TemplateParameterValue__VarNameAssignment_1 )
                    {
                     before(grammarAccess.getTemplateParameterValueAccess().getVarNameAssignment_1()); 
                    // InternalEcssLanguage.g:971:3: ( rule__TemplateParameterValue__VarNameAssignment_1 )
                    // InternalEcssLanguage.g:971:4: rule__TemplateParameterValue__VarNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateParameterValue__VarNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateParameterValueAccess().getVarNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:975:2: ( ( rule__TemplateParameterValue__Group_2__0 ) )
                    {
                    // InternalEcssLanguage.g:975:2: ( ( rule__TemplateParameterValue__Group_2__0 ) )
                    // InternalEcssLanguage.g:976:3: ( rule__TemplateParameterValue__Group_2__0 )
                    {
                     before(grammarAccess.getTemplateParameterValueAccess().getGroup_2()); 
                    // InternalEcssLanguage.g:977:3: ( rule__TemplateParameterValue__Group_2__0 )
                    // InternalEcssLanguage.g:977:4: rule__TemplateParameterValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateParameterValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateParameterValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:981:2: ( ( rule__TemplateParameterValue__DirectAssignment_3 ) )
                    {
                    // InternalEcssLanguage.g:981:2: ( ( rule__TemplateParameterValue__DirectAssignment_3 ) )
                    // InternalEcssLanguage.g:982:3: ( rule__TemplateParameterValue__DirectAssignment_3 )
                    {
                     before(grammarAccess.getTemplateParameterValueAccess().getDirectAssignment_3()); 
                    // InternalEcssLanguage.g:983:3: ( rule__TemplateParameterValue__DirectAssignment_3 )
                    // InternalEcssLanguage.g:983:4: rule__TemplateParameterValue__DirectAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateParameterValue__DirectAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemplateParameterValueAccess().getDirectAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Alternatives"


    // $ANTLR start "rule__SingleSelector__Alternatives_0"
    // InternalEcssLanguage.g:991:1: rule__SingleSelector__Alternatives_0 : ( ( ( rule__SingleSelector__AllTypesAssignment_0_0 ) ) | ( ( rule__SingleSelector__ReferredNameAssignment_0_1 ) ) );
    public final void rule__SingleSelector__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:995:1: ( ( ( rule__SingleSelector__AllTypesAssignment_0_0 ) ) | ( ( rule__SingleSelector__ReferredNameAssignment_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==51) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEcssLanguage.g:996:2: ( ( rule__SingleSelector__AllTypesAssignment_0_0 ) )
                    {
                    // InternalEcssLanguage.g:996:2: ( ( rule__SingleSelector__AllTypesAssignment_0_0 ) )
                    // InternalEcssLanguage.g:997:3: ( rule__SingleSelector__AllTypesAssignment_0_0 )
                    {
                     before(grammarAccess.getSingleSelectorAccess().getAllTypesAssignment_0_0()); 
                    // InternalEcssLanguage.g:998:3: ( rule__SingleSelector__AllTypesAssignment_0_0 )
                    // InternalEcssLanguage.g:998:4: rule__SingleSelector__AllTypesAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleSelector__AllTypesAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleSelectorAccess().getAllTypesAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1002:2: ( ( rule__SingleSelector__ReferredNameAssignment_0_1 ) )
                    {
                    // InternalEcssLanguage.g:1002:2: ( ( rule__SingleSelector__ReferredNameAssignment_0_1 ) )
                    // InternalEcssLanguage.g:1003:3: ( rule__SingleSelector__ReferredNameAssignment_0_1 )
                    {
                     before(grammarAccess.getSingleSelectorAccess().getReferredNameAssignment_0_1()); 
                    // InternalEcssLanguage.g:1004:3: ( rule__SingleSelector__ReferredNameAssignment_0_1 )
                    // InternalEcssLanguage.g:1004:4: rule__SingleSelector__ReferredNameAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleSelector__ReferredNameAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleSelectorAccess().getReferredNameAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__Alternatives_0"


    // $ANTLR start "rule__SingleSelector__ReferredNameAlternatives_0_1_0"
    // InternalEcssLanguage.g:1012:1: rule__SingleSelector__ReferredNameAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SingleSelector__ReferredNameAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1016:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEcssLanguage.g:1017:2: ( RULE_ID )
                    {
                    // InternalEcssLanguage.g:1017:2: ( RULE_ID )
                    // InternalEcssLanguage.g:1018:3: RULE_ID
                    {
                     before(grammarAccess.getSingleSelectorAccess().getReferredNameIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getSingleSelectorAccess().getReferredNameIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1023:2: ( RULE_STRING )
                    {
                    // InternalEcssLanguage.g:1023:2: ( RULE_STRING )
                    // InternalEcssLanguage.g:1024:3: RULE_STRING
                    {
                     before(grammarAccess.getSingleSelectorAccess().getReferredNameSTRINGTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSingleSelectorAccess().getReferredNameSTRINGTerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__ReferredNameAlternatives_0_1_0"


    // $ANTLR start "rule__Property__Alternatives_0"
    // InternalEcssLanguage.g:1033:1: rule__Property__Alternatives_0 : ( ( ( rule__Property__TemplateMatchAssignment_0_0 ) ) | ( ( rule__Property__SlotMatchAssignment_0_1 ) ) | ( ( rule__Property__NameAssignment_0_2 ) ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1037:1: ( ( ( rule__Property__TemplateMatchAssignment_0_0 ) ) | ( ( rule__Property__SlotMatchAssignment_0_1 ) ) | ( ( rule__Property__NameAssignment_0_2 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEcssLanguage.g:1038:2: ( ( rule__Property__TemplateMatchAssignment_0_0 ) )
                    {
                    // InternalEcssLanguage.g:1038:2: ( ( rule__Property__TemplateMatchAssignment_0_0 ) )
                    // InternalEcssLanguage.g:1039:3: ( rule__Property__TemplateMatchAssignment_0_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getTemplateMatchAssignment_0_0()); 
                    // InternalEcssLanguage.g:1040:3: ( rule__Property__TemplateMatchAssignment_0_0 )
                    // InternalEcssLanguage.g:1040:4: rule__Property__TemplateMatchAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__TemplateMatchAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getTemplateMatchAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1044:2: ( ( rule__Property__SlotMatchAssignment_0_1 ) )
                    {
                    // InternalEcssLanguage.g:1044:2: ( ( rule__Property__SlotMatchAssignment_0_1 ) )
                    // InternalEcssLanguage.g:1045:3: ( rule__Property__SlotMatchAssignment_0_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getSlotMatchAssignment_0_1()); 
                    // InternalEcssLanguage.g:1046:3: ( rule__Property__SlotMatchAssignment_0_1 )
                    // InternalEcssLanguage.g:1046:4: rule__Property__SlotMatchAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__SlotMatchAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getSlotMatchAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:1050:2: ( ( rule__Property__NameAssignment_0_2 ) )
                    {
                    // InternalEcssLanguage.g:1050:2: ( ( rule__Property__NameAssignment_0_2 ) )
                    // InternalEcssLanguage.g:1051:3: ( rule__Property__NameAssignment_0_2 )
                    {
                     before(grammarAccess.getPropertyAccess().getNameAssignment_0_2()); 
                    // InternalEcssLanguage.g:1052:3: ( rule__Property__NameAssignment_0_2 )
                    // InternalEcssLanguage.g:1052:4: rule__Property__NameAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__NameAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getNameAssignment_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives_0"


    // $ANTLR start "rule__Property__NameAlternatives_0_2_0"
    // InternalEcssLanguage.g:1060:1: rule__Property__NameAlternatives_0_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Property__NameAlternatives_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1064:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEcssLanguage.g:1065:2: ( RULE_ID )
                    {
                    // InternalEcssLanguage.g:1065:2: ( RULE_ID )
                    // InternalEcssLanguage.g:1066:3: RULE_ID
                    {
                     before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1071:2: ( RULE_STRING )
                    {
                    // InternalEcssLanguage.g:1071:2: ( RULE_STRING )
                    // InternalEcssLanguage.g:1072:3: RULE_STRING
                    {
                     before(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_0_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_0_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAlternatives_0_2_0"


    // $ANTLR start "rule__PropertyValue__Alternatives_0"
    // InternalEcssLanguage.g:1081:1: rule__PropertyValue__Alternatives_0 : ( ( ( rule__PropertyValue__ValueAssignment_0_0 ) ) | ( ( rule__PropertyValue__ValueAssignment_0_1 ) ) | ( ( rule__PropertyValue__ValueNumbAssignment_0_2 ) ) | ( ( rule__PropertyValue__Group_0_3__0 ) ) );
    public final void rule__PropertyValue__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1085:1: ( ( ( rule__PropertyValue__ValueAssignment_0_0 ) ) | ( ( rule__PropertyValue__ValueAssignment_0_1 ) ) | ( ( rule__PropertyValue__ValueNumbAssignment_0_2 ) ) | ( ( rule__PropertyValue__Group_0_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_NUMBER:
            case 44:
                {
                alt13=3;
                }
                break;
            case 46:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEcssLanguage.g:1086:2: ( ( rule__PropertyValue__ValueAssignment_0_0 ) )
                    {
                    // InternalEcssLanguage.g:1086:2: ( ( rule__PropertyValue__ValueAssignment_0_0 ) )
                    // InternalEcssLanguage.g:1087:3: ( rule__PropertyValue__ValueAssignment_0_0 )
                    {
                     before(grammarAccess.getPropertyValueAccess().getValueAssignment_0_0()); 
                    // InternalEcssLanguage.g:1088:3: ( rule__PropertyValue__ValueAssignment_0_0 )
                    // InternalEcssLanguage.g:1088:4: rule__PropertyValue__ValueAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__ValueAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValueAccess().getValueAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEcssLanguage.g:1092:2: ( ( rule__PropertyValue__ValueAssignment_0_1 ) )
                    {
                    // InternalEcssLanguage.g:1092:2: ( ( rule__PropertyValue__ValueAssignment_0_1 ) )
                    // InternalEcssLanguage.g:1093:3: ( rule__PropertyValue__ValueAssignment_0_1 )
                    {
                     before(grammarAccess.getPropertyValueAccess().getValueAssignment_0_1()); 
                    // InternalEcssLanguage.g:1094:3: ( rule__PropertyValue__ValueAssignment_0_1 )
                    // InternalEcssLanguage.g:1094:4: rule__PropertyValue__ValueAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__ValueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValueAccess().getValueAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEcssLanguage.g:1098:2: ( ( rule__PropertyValue__ValueNumbAssignment_0_2 ) )
                    {
                    // InternalEcssLanguage.g:1098:2: ( ( rule__PropertyValue__ValueNumbAssignment_0_2 ) )
                    // InternalEcssLanguage.g:1099:3: ( rule__PropertyValue__ValueNumbAssignment_0_2 )
                    {
                     before(grammarAccess.getPropertyValueAccess().getValueNumbAssignment_0_2()); 
                    // InternalEcssLanguage.g:1100:3: ( rule__PropertyValue__ValueNumbAssignment_0_2 )
                    // InternalEcssLanguage.g:1100:4: rule__PropertyValue__ValueNumbAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__ValueNumbAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValueAccess().getValueNumbAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEcssLanguage.g:1104:2: ( ( rule__PropertyValue__Group_0_3__0 ) )
                    {
                    // InternalEcssLanguage.g:1104:2: ( ( rule__PropertyValue__Group_0_3__0 ) )
                    // InternalEcssLanguage.g:1105:3: ( rule__PropertyValue__Group_0_3__0 )
                    {
                     before(grammarAccess.getPropertyValueAccess().getGroup_0_3()); 
                    // InternalEcssLanguage.g:1106:3: ( rule__PropertyValue__Group_0_3__0 )
                    // InternalEcssLanguage.g:1106:4: rule__PropertyValue__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyValueAccess().getGroup_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalEcssLanguage.g:1114:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1118:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalEcssLanguage.g:1119:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalEcssLanguage.g:1126:1: rule__Model__Group__0__Impl : ( ( rule__Model__ConfigAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1130:1: ( ( ( rule__Model__ConfigAssignment_0 )? ) )
            // InternalEcssLanguage.g:1131:1: ( ( rule__Model__ConfigAssignment_0 )? )
            {
            // InternalEcssLanguage.g:1131:1: ( ( rule__Model__ConfigAssignment_0 )? )
            // InternalEcssLanguage.g:1132:2: ( rule__Model__ConfigAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getConfigAssignment_0()); 
            // InternalEcssLanguage.g:1133:2: ( rule__Model__ConfigAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEcssLanguage.g:1133:3: rule__Model__ConfigAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConfigAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getConfigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalEcssLanguage.g:1141:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1145:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalEcssLanguage.g:1146:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalEcssLanguage.g:1153:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportStatementAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1157:1: ( ( ( rule__Model__ImportStatementAssignment_1 )* ) )
            // InternalEcssLanguage.g:1158:1: ( ( rule__Model__ImportStatementAssignment_1 )* )
            {
            // InternalEcssLanguage.g:1158:1: ( ( rule__Model__ImportStatementAssignment_1 )* )
            // InternalEcssLanguage.g:1159:2: ( rule__Model__ImportStatementAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportStatementAssignment_1()); 
            // InternalEcssLanguage.g:1160:2: ( rule__Model__ImportStatementAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEcssLanguage.g:1160:3: rule__Model__ImportStatementAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ImportStatementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportStatementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalEcssLanguage.g:1168:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1172:1: ( rule__Model__Group__2__Impl )
            // InternalEcssLanguage.g:1173:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalEcssLanguage.g:1179:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1183:1: ( ( ( rule__Model__Alternatives_2 )* ) )
            // InternalEcssLanguage.g:1184:1: ( ( rule__Model__Alternatives_2 )* )
            {
            // InternalEcssLanguage.g:1184:1: ( ( rule__Model__Alternatives_2 )* )
            // InternalEcssLanguage.g:1185:2: ( rule__Model__Alternatives_2 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // InternalEcssLanguage.g:1186:2: ( rule__Model__Alternatives_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==17||LA16_0==21||LA16_0==23||LA16_0==25||LA16_0==27||LA16_0==51) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEcssLanguage.g:1186:3: rule__Model__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__0"
    // InternalEcssLanguage.g:1195:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1199:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalEcssLanguage.g:1200:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalEcssLanguage.g:1207:1: rule__Config__Group__0__Impl : ( () ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1211:1: ( ( () ) )
            // InternalEcssLanguage.g:1212:1: ( () )
            {
            // InternalEcssLanguage.g:1212:1: ( () )
            // InternalEcssLanguage.g:1213:2: ()
            {
             before(grammarAccess.getConfigAccess().getConfigAction_0()); 
            // InternalEcssLanguage.g:1214:2: ()
            // InternalEcssLanguage.g:1214:3: 
            {
            }

             after(grammarAccess.getConfigAccess().getConfigAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalEcssLanguage.g:1222:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1226:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalEcssLanguage.g:1227:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalEcssLanguage.g:1234:1: rule__Config__Group__1__Impl : ( 'Config' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1238:1: ( ( 'Config' ) )
            // InternalEcssLanguage.g:1239:1: ( 'Config' )
            {
            // InternalEcssLanguage.g:1239:1: ( 'Config' )
            // InternalEcssLanguage.g:1240:2: 'Config'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalEcssLanguage.g:1249:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1253:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalEcssLanguage.g:1254:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalEcssLanguage.g:1261:1: rule__Config__Group__2__Impl : ( '{' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1265:1: ( ( '{' ) )
            // InternalEcssLanguage.g:1266:1: ( '{' )
            {
            // InternalEcssLanguage.g:1266:1: ( '{' )
            // InternalEcssLanguage.g:1267:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalEcssLanguage.g:1276:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1280:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalEcssLanguage.g:1281:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalEcssLanguage.g:1288:1: rule__Config__Group__3__Impl : ( ( rule__Config__Group_3__0 )? ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1292:1: ( ( ( rule__Config__Group_3__0 )? ) )
            // InternalEcssLanguage.g:1293:1: ( ( rule__Config__Group_3__0 )? )
            {
            // InternalEcssLanguage.g:1293:1: ( ( rule__Config__Group_3__0 )? )
            // InternalEcssLanguage.g:1294:2: ( rule__Config__Group_3__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_3()); 
            // InternalEcssLanguage.g:1295:2: ( rule__Config__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEcssLanguage.g:1295:3: rule__Config__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // InternalEcssLanguage.g:1303:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1307:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalEcssLanguage.g:1308:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // InternalEcssLanguage.g:1315:1: rule__Config__Group__4__Impl : ( ( rule__Config__Group_4__0 )? ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1319:1: ( ( ( rule__Config__Group_4__0 )? ) )
            // InternalEcssLanguage.g:1320:1: ( ( rule__Config__Group_4__0 )? )
            {
            // InternalEcssLanguage.g:1320:1: ( ( rule__Config__Group_4__0 )? )
            // InternalEcssLanguage.g:1321:2: ( rule__Config__Group_4__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_4()); 
            // InternalEcssLanguage.g:1322:2: ( rule__Config__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEcssLanguage.g:1322:3: rule__Config__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // InternalEcssLanguage.g:1330:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1334:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalEcssLanguage.g:1335:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // InternalEcssLanguage.g:1342:1: rule__Config__Group__5__Impl : ( ( rule__Config__Group_5__0 )? ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1346:1: ( ( ( rule__Config__Group_5__0 )? ) )
            // InternalEcssLanguage.g:1347:1: ( ( rule__Config__Group_5__0 )? )
            {
            // InternalEcssLanguage.g:1347:1: ( ( rule__Config__Group_5__0 )? )
            // InternalEcssLanguage.g:1348:2: ( rule__Config__Group_5__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_5()); 
            // InternalEcssLanguage.g:1349:2: ( rule__Config__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEcssLanguage.g:1349:3: rule__Config__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // InternalEcssLanguage.g:1357:1: rule__Config__Group__6 : rule__Config__Group__6__Impl ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1361:1: ( rule__Config__Group__6__Impl )
            // InternalEcssLanguage.g:1362:2: rule__Config__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // InternalEcssLanguage.g:1368:1: rule__Config__Group__6__Impl : ( '}' ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1372:1: ( ( '}' ) )
            // InternalEcssLanguage.g:1373:1: ( '}' )
            {
            // InternalEcssLanguage.g:1373:1: ( '}' )
            // InternalEcssLanguage.g:1374:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group_3__0"
    // InternalEcssLanguage.g:1384:1: rule__Config__Group_3__0 : rule__Config__Group_3__0__Impl rule__Config__Group_3__1 ;
    public final void rule__Config__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1388:1: ( rule__Config__Group_3__0__Impl rule__Config__Group_3__1 )
            // InternalEcssLanguage.g:1389:2: rule__Config__Group_3__0__Impl rule__Config__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_3__0"


    // $ANTLR start "rule__Config__Group_3__0__Impl"
    // InternalEcssLanguage.g:1396:1: rule__Config__Group_3__0__Impl : ( ( rule__Config__HasMinImprovementAssignment_3_0 ) ) ;
    public final void rule__Config__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1400:1: ( ( ( rule__Config__HasMinImprovementAssignment_3_0 ) ) )
            // InternalEcssLanguage.g:1401:1: ( ( rule__Config__HasMinImprovementAssignment_3_0 ) )
            {
            // InternalEcssLanguage.g:1401:1: ( ( rule__Config__HasMinImprovementAssignment_3_0 ) )
            // InternalEcssLanguage.g:1402:2: ( rule__Config__HasMinImprovementAssignment_3_0 )
            {
             before(grammarAccess.getConfigAccess().getHasMinImprovementAssignment_3_0()); 
            // InternalEcssLanguage.g:1403:2: ( rule__Config__HasMinImprovementAssignment_3_0 )
            // InternalEcssLanguage.g:1403:3: rule__Config__HasMinImprovementAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Config__HasMinImprovementAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getHasMinImprovementAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_3__0__Impl"


    // $ANTLR start "rule__Config__Group_3__1"
    // InternalEcssLanguage.g:1411:1: rule__Config__Group_3__1 : rule__Config__Group_3__1__Impl ;
    public final void rule__Config__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1415:1: ( rule__Config__Group_3__1__Impl )
            // InternalEcssLanguage.g:1416:2: rule__Config__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_3__1"


    // $ANTLR start "rule__Config__Group_3__1__Impl"
    // InternalEcssLanguage.g:1422:1: rule__Config__Group_3__1__Impl : ( ( rule__Config__MinImprovementAssignment_3_1 ) ) ;
    public final void rule__Config__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1426:1: ( ( ( rule__Config__MinImprovementAssignment_3_1 ) ) )
            // InternalEcssLanguage.g:1427:1: ( ( rule__Config__MinImprovementAssignment_3_1 ) )
            {
            // InternalEcssLanguage.g:1427:1: ( ( rule__Config__MinImprovementAssignment_3_1 ) )
            // InternalEcssLanguage.g:1428:2: ( rule__Config__MinImprovementAssignment_3_1 )
            {
             before(grammarAccess.getConfigAccess().getMinImprovementAssignment_3_1()); 
            // InternalEcssLanguage.g:1429:2: ( rule__Config__MinImprovementAssignment_3_1 )
            // InternalEcssLanguage.g:1429:3: rule__Config__MinImprovementAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__MinImprovementAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMinImprovementAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_3__1__Impl"


    // $ANTLR start "rule__Config__Group_4__0"
    // InternalEcssLanguage.g:1438:1: rule__Config__Group_4__0 : rule__Config__Group_4__0__Impl rule__Config__Group_4__1 ;
    public final void rule__Config__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1442:1: ( rule__Config__Group_4__0__Impl rule__Config__Group_4__1 )
            // InternalEcssLanguage.g:1443:2: rule__Config__Group_4__0__Impl rule__Config__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_4__0"


    // $ANTLR start "rule__Config__Group_4__0__Impl"
    // InternalEcssLanguage.g:1450:1: rule__Config__Group_4__0__Impl : ( ( rule__Config__HasMaxDegressionAssignment_4_0 ) ) ;
    public final void rule__Config__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1454:1: ( ( ( rule__Config__HasMaxDegressionAssignment_4_0 ) ) )
            // InternalEcssLanguage.g:1455:1: ( ( rule__Config__HasMaxDegressionAssignment_4_0 ) )
            {
            // InternalEcssLanguage.g:1455:1: ( ( rule__Config__HasMaxDegressionAssignment_4_0 ) )
            // InternalEcssLanguage.g:1456:2: ( rule__Config__HasMaxDegressionAssignment_4_0 )
            {
             before(grammarAccess.getConfigAccess().getHasMaxDegressionAssignment_4_0()); 
            // InternalEcssLanguage.g:1457:2: ( rule__Config__HasMaxDegressionAssignment_4_0 )
            // InternalEcssLanguage.g:1457:3: rule__Config__HasMaxDegressionAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Config__HasMaxDegressionAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getHasMaxDegressionAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_4__0__Impl"


    // $ANTLR start "rule__Config__Group_4__1"
    // InternalEcssLanguage.g:1465:1: rule__Config__Group_4__1 : rule__Config__Group_4__1__Impl ;
    public final void rule__Config__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1469:1: ( rule__Config__Group_4__1__Impl )
            // InternalEcssLanguage.g:1470:2: rule__Config__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_4__1"


    // $ANTLR start "rule__Config__Group_4__1__Impl"
    // InternalEcssLanguage.g:1476:1: rule__Config__Group_4__1__Impl : ( ( rule__Config__MaxDegressionAssignment_4_1 ) ) ;
    public final void rule__Config__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1480:1: ( ( ( rule__Config__MaxDegressionAssignment_4_1 ) ) )
            // InternalEcssLanguage.g:1481:1: ( ( rule__Config__MaxDegressionAssignment_4_1 ) )
            {
            // InternalEcssLanguage.g:1481:1: ( ( rule__Config__MaxDegressionAssignment_4_1 ) )
            // InternalEcssLanguage.g:1482:2: ( rule__Config__MaxDegressionAssignment_4_1 )
            {
             before(grammarAccess.getConfigAccess().getMaxDegressionAssignment_4_1()); 
            // InternalEcssLanguage.g:1483:2: ( rule__Config__MaxDegressionAssignment_4_1 )
            // InternalEcssLanguage.g:1483:3: rule__Config__MaxDegressionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__MaxDegressionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMaxDegressionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_4__1__Impl"


    // $ANTLR start "rule__Config__Group_5__0"
    // InternalEcssLanguage.g:1492:1: rule__Config__Group_5__0 : rule__Config__Group_5__0__Impl rule__Config__Group_5__1 ;
    public final void rule__Config__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1496:1: ( rule__Config__Group_5__0__Impl rule__Config__Group_5__1 )
            // InternalEcssLanguage.g:1497:2: rule__Config__Group_5__0__Impl rule__Config__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_5__0"


    // $ANTLR start "rule__Config__Group_5__0__Impl"
    // InternalEcssLanguage.g:1504:1: rule__Config__Group_5__0__Impl : ( ( rule__Config__HaxMaxThingsAssignment_5_0 ) ) ;
    public final void rule__Config__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1508:1: ( ( ( rule__Config__HaxMaxThingsAssignment_5_0 ) ) )
            // InternalEcssLanguage.g:1509:1: ( ( rule__Config__HaxMaxThingsAssignment_5_0 ) )
            {
            // InternalEcssLanguage.g:1509:1: ( ( rule__Config__HaxMaxThingsAssignment_5_0 ) )
            // InternalEcssLanguage.g:1510:2: ( rule__Config__HaxMaxThingsAssignment_5_0 )
            {
             before(grammarAccess.getConfigAccess().getHaxMaxThingsAssignment_5_0()); 
            // InternalEcssLanguage.g:1511:2: ( rule__Config__HaxMaxThingsAssignment_5_0 )
            // InternalEcssLanguage.g:1511:3: rule__Config__HaxMaxThingsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Config__HaxMaxThingsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getHaxMaxThingsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_5__0__Impl"


    // $ANTLR start "rule__Config__Group_5__1"
    // InternalEcssLanguage.g:1519:1: rule__Config__Group_5__1 : rule__Config__Group_5__1__Impl ;
    public final void rule__Config__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1523:1: ( rule__Config__Group_5__1__Impl )
            // InternalEcssLanguage.g:1524:2: rule__Config__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_5__1"


    // $ANTLR start "rule__Config__Group_5__1__Impl"
    // InternalEcssLanguage.g:1530:1: rule__Config__Group_5__1__Impl : ( ( rule__Config__MaxThingsAssignment_5_1 ) ) ;
    public final void rule__Config__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1534:1: ( ( ( rule__Config__MaxThingsAssignment_5_1 ) ) )
            // InternalEcssLanguage.g:1535:1: ( ( rule__Config__MaxThingsAssignment_5_1 ) )
            {
            // InternalEcssLanguage.g:1535:1: ( ( rule__Config__MaxThingsAssignment_5_1 ) )
            // InternalEcssLanguage.g:1536:2: ( rule__Config__MaxThingsAssignment_5_1 )
            {
             before(grammarAccess.getConfigAccess().getMaxThingsAssignment_5_1()); 
            // InternalEcssLanguage.g:1537:2: ( rule__Config__MaxThingsAssignment_5_1 )
            // InternalEcssLanguage.g:1537:3: rule__Config__MaxThingsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__MaxThingsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getMaxThingsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_5__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEcssLanguage.g:1546:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1550:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEcssLanguage.g:1551:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEcssLanguage.g:1558:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1562:1: ( ( 'import' ) )
            // InternalEcssLanguage.g:1563:1: ( 'import' )
            {
            // InternalEcssLanguage.g:1563:1: ( 'import' )
            // InternalEcssLanguage.g:1564:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEcssLanguage.g:1573:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1577:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalEcssLanguage.g:1578:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEcssLanguage.g:1585:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1589:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalEcssLanguage.g:1590:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalEcssLanguage.g:1590:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalEcssLanguage.g:1591:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalEcssLanguage.g:1592:2: ( rule__Import__NameAssignment_1 )
            // InternalEcssLanguage.g:1592:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalEcssLanguage.g:1600:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1604:1: ( rule__Import__Group__2__Impl )
            // InternalEcssLanguage.g:1605:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalEcssLanguage.g:1611:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1615:1: ( ( ';' ) )
            // InternalEcssLanguage.g:1616:1: ( ';' )
            {
            // InternalEcssLanguage.g:1616:1: ( ';' )
            // InternalEcssLanguage.g:1617:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__TemplateDef__Group__0"
    // InternalEcssLanguage.g:1627:1: rule__TemplateDef__Group__0 : rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 ;
    public final void rule__TemplateDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1631:1: ( rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 )
            // InternalEcssLanguage.g:1632:2: rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__0"


    // $ANTLR start "rule__TemplateDef__Group__0__Impl"
    // InternalEcssLanguage.g:1639:1: rule__TemplateDef__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1643:1: ( ( 'template' ) )
            // InternalEcssLanguage.g:1644:1: ( 'template' )
            {
            // InternalEcssLanguage.g:1644:1: ( 'template' )
            // InternalEcssLanguage.g:1645:2: 'template'
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getTemplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group__1"
    // InternalEcssLanguage.g:1654:1: rule__TemplateDef__Group__1 : rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 ;
    public final void rule__TemplateDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1658:1: ( rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 )
            // InternalEcssLanguage.g:1659:2: rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TemplateDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__1"


    // $ANTLR start "rule__TemplateDef__Group__1__Impl"
    // InternalEcssLanguage.g:1666:1: rule__TemplateDef__Group__1__Impl : ( ( rule__TemplateDef__NameAssignment_1 ) ) ;
    public final void rule__TemplateDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1670:1: ( ( ( rule__TemplateDef__NameAssignment_1 ) ) )
            // InternalEcssLanguage.g:1671:1: ( ( rule__TemplateDef__NameAssignment_1 ) )
            {
            // InternalEcssLanguage.g:1671:1: ( ( rule__TemplateDef__NameAssignment_1 ) )
            // InternalEcssLanguage.g:1672:2: ( rule__TemplateDef__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateDefAccess().getNameAssignment_1()); 
            // InternalEcssLanguage.g:1673:2: ( rule__TemplateDef__NameAssignment_1 )
            // InternalEcssLanguage.g:1673:3: rule__TemplateDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group__2"
    // InternalEcssLanguage.g:1681:1: rule__TemplateDef__Group__2 : rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 ;
    public final void rule__TemplateDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1685:1: ( rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 )
            // InternalEcssLanguage.g:1686:2: rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TemplateDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__2"


    // $ANTLR start "rule__TemplateDef__Group__2__Impl"
    // InternalEcssLanguage.g:1693:1: rule__TemplateDef__Group__2__Impl : ( ':' ) ;
    public final void rule__TemplateDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1697:1: ( ( ':' ) )
            // InternalEcssLanguage.g:1698:1: ( ':' )
            {
            // InternalEcssLanguage.g:1698:1: ( ':' )
            // InternalEcssLanguage.g:1699:2: ':'
            {
             before(grammarAccess.getTemplateDefAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__2__Impl"


    // $ANTLR start "rule__TemplateDef__Group__3"
    // InternalEcssLanguage.g:1708:1: rule__TemplateDef__Group__3 : rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 ;
    public final void rule__TemplateDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1712:1: ( rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 )
            // InternalEcssLanguage.g:1713:2: rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__TemplateDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__3"


    // $ANTLR start "rule__TemplateDef__Group__3__Impl"
    // InternalEcssLanguage.g:1720:1: rule__TemplateDef__Group__3__Impl : ( ( rule__TemplateDef__JavaClassAssignment_3 ) ) ;
    public final void rule__TemplateDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1724:1: ( ( ( rule__TemplateDef__JavaClassAssignment_3 ) ) )
            // InternalEcssLanguage.g:1725:1: ( ( rule__TemplateDef__JavaClassAssignment_3 ) )
            {
            // InternalEcssLanguage.g:1725:1: ( ( rule__TemplateDef__JavaClassAssignment_3 ) )
            // InternalEcssLanguage.g:1726:2: ( rule__TemplateDef__JavaClassAssignment_3 )
            {
             before(grammarAccess.getTemplateDefAccess().getJavaClassAssignment_3()); 
            // InternalEcssLanguage.g:1727:2: ( rule__TemplateDef__JavaClassAssignment_3 )
            // InternalEcssLanguage.g:1727:3: rule__TemplateDef__JavaClassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__JavaClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getJavaClassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__3__Impl"


    // $ANTLR start "rule__TemplateDef__Group__4"
    // InternalEcssLanguage.g:1735:1: rule__TemplateDef__Group__4 : rule__TemplateDef__Group__4__Impl ;
    public final void rule__TemplateDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1739:1: ( rule__TemplateDef__Group__4__Impl )
            // InternalEcssLanguage.g:1740:2: rule__TemplateDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__4"


    // $ANTLR start "rule__TemplateDef__Group__4__Impl"
    // InternalEcssLanguage.g:1746:1: rule__TemplateDef__Group__4__Impl : ( ';' ) ;
    public final void rule__TemplateDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1750:1: ( ( ';' ) )
            // InternalEcssLanguage.g:1751:1: ( ';' )
            {
            // InternalEcssLanguage.g:1751:1: ( ';' )
            // InternalEcssLanguage.g:1752:2: ';'
            {
             before(grammarAccess.getTemplateDefAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__4__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group__0"
    // InternalEcssLanguage.g:1762:1: rule__TemplateGenDef__Group__0 : rule__TemplateGenDef__Group__0__Impl rule__TemplateGenDef__Group__1 ;
    public final void rule__TemplateGenDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1766:1: ( rule__TemplateGenDef__Group__0__Impl rule__TemplateGenDef__Group__1 )
            // InternalEcssLanguage.g:1767:2: rule__TemplateGenDef__Group__0__Impl rule__TemplateGenDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGenDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__0"


    // $ANTLR start "rule__TemplateGenDef__Group__0__Impl"
    // InternalEcssLanguage.g:1774:1: rule__TemplateGenDef__Group__0__Impl : ( 'templateGen' ) ;
    public final void rule__TemplateGenDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1778:1: ( ( 'templateGen' ) )
            // InternalEcssLanguage.g:1779:1: ( 'templateGen' )
            {
            // InternalEcssLanguage.g:1779:1: ( 'templateGen' )
            // InternalEcssLanguage.g:1780:2: 'templateGen'
            {
             before(grammarAccess.getTemplateGenDefAccess().getTemplateGenKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getTemplateGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__0__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group__1"
    // InternalEcssLanguage.g:1789:1: rule__TemplateGenDef__Group__1 : rule__TemplateGenDef__Group__1__Impl rule__TemplateGenDef__Group__2 ;
    public final void rule__TemplateGenDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1793:1: ( rule__TemplateGenDef__Group__1__Impl rule__TemplateGenDef__Group__2 )
            // InternalEcssLanguage.g:1794:2: rule__TemplateGenDef__Group__1__Impl rule__TemplateGenDef__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TemplateGenDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__1"


    // $ANTLR start "rule__TemplateGenDef__Group__1__Impl"
    // InternalEcssLanguage.g:1801:1: rule__TemplateGenDef__Group__1__Impl : ( ( rule__TemplateGenDef__NameAssignment_1 ) ) ;
    public final void rule__TemplateGenDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1805:1: ( ( ( rule__TemplateGenDef__NameAssignment_1 ) ) )
            // InternalEcssLanguage.g:1806:1: ( ( rule__TemplateGenDef__NameAssignment_1 ) )
            {
            // InternalEcssLanguage.g:1806:1: ( ( rule__TemplateGenDef__NameAssignment_1 ) )
            // InternalEcssLanguage.g:1807:2: ( rule__TemplateGenDef__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateGenDefAccess().getNameAssignment_1()); 
            // InternalEcssLanguage.g:1808:2: ( rule__TemplateGenDef__NameAssignment_1 )
            // InternalEcssLanguage.g:1808:3: rule__TemplateGenDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGenDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__1__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group__2"
    // InternalEcssLanguage.g:1816:1: rule__TemplateGenDef__Group__2 : rule__TemplateGenDef__Group__2__Impl rule__TemplateGenDef__Group__3 ;
    public final void rule__TemplateGenDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1820:1: ( rule__TemplateGenDef__Group__2__Impl rule__TemplateGenDef__Group__3 )
            // InternalEcssLanguage.g:1821:2: rule__TemplateGenDef__Group__2__Impl rule__TemplateGenDef__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__TemplateGenDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__2"


    // $ANTLR start "rule__TemplateGenDef__Group__2__Impl"
    // InternalEcssLanguage.g:1828:1: rule__TemplateGenDef__Group__2__Impl : ( ( rule__TemplateGenDef__Group_2__0 )? ) ;
    public final void rule__TemplateGenDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1832:1: ( ( ( rule__TemplateGenDef__Group_2__0 )? ) )
            // InternalEcssLanguage.g:1833:1: ( ( rule__TemplateGenDef__Group_2__0 )? )
            {
            // InternalEcssLanguage.g:1833:1: ( ( rule__TemplateGenDef__Group_2__0 )? )
            // InternalEcssLanguage.g:1834:2: ( rule__TemplateGenDef__Group_2__0 )?
            {
             before(grammarAccess.getTemplateGenDefAccess().getGroup_2()); 
            // InternalEcssLanguage.g:1835:2: ( rule__TemplateGenDef__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEcssLanguage.g:1835:3: rule__TemplateGenDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGenDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGenDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__2__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group__3"
    // InternalEcssLanguage.g:1843:1: rule__TemplateGenDef__Group__3 : rule__TemplateGenDef__Group__3__Impl rule__TemplateGenDef__Group__4 ;
    public final void rule__TemplateGenDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1847:1: ( rule__TemplateGenDef__Group__3__Impl rule__TemplateGenDef__Group__4 )
            // InternalEcssLanguage.g:1848:2: rule__TemplateGenDef__Group__3__Impl rule__TemplateGenDef__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__TemplateGenDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__3"


    // $ANTLR start "rule__TemplateGenDef__Group__3__Impl"
    // InternalEcssLanguage.g:1855:1: rule__TemplateGenDef__Group__3__Impl : ( ( rule__TemplateGenDef__Group_3__0 )? ) ;
    public final void rule__TemplateGenDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1859:1: ( ( ( rule__TemplateGenDef__Group_3__0 )? ) )
            // InternalEcssLanguage.g:1860:1: ( ( rule__TemplateGenDef__Group_3__0 )? )
            {
            // InternalEcssLanguage.g:1860:1: ( ( rule__TemplateGenDef__Group_3__0 )? )
            // InternalEcssLanguage.g:1861:2: ( rule__TemplateGenDef__Group_3__0 )?
            {
             before(grammarAccess.getTemplateGenDefAccess().getGroup_3()); 
            // InternalEcssLanguage.g:1862:2: ( rule__TemplateGenDef__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEcssLanguage.g:1862:3: rule__TemplateGenDef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGenDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGenDefAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__3__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group__4"
    // InternalEcssLanguage.g:1870:1: rule__TemplateGenDef__Group__4 : rule__TemplateGenDef__Group__4__Impl ;
    public final void rule__TemplateGenDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1874:1: ( rule__TemplateGenDef__Group__4__Impl )
            // InternalEcssLanguage.g:1875:2: rule__TemplateGenDef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__4"


    // $ANTLR start "rule__TemplateGenDef__Group__4__Impl"
    // InternalEcssLanguage.g:1881:1: rule__TemplateGenDef__Group__4__Impl : ( ';' ) ;
    public final void rule__TemplateGenDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1885:1: ( ( ';' ) )
            // InternalEcssLanguage.g:1886:1: ( ';' )
            {
            // InternalEcssLanguage.g:1886:1: ( ';' )
            // InternalEcssLanguage.g:1887:2: ';'
            {
             before(grammarAccess.getTemplateGenDefAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group__4__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group_2__0"
    // InternalEcssLanguage.g:1897:1: rule__TemplateGenDef__Group_2__0 : rule__TemplateGenDef__Group_2__0__Impl rule__TemplateGenDef__Group_2__1 ;
    public final void rule__TemplateGenDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1901:1: ( rule__TemplateGenDef__Group_2__0__Impl rule__TemplateGenDef__Group_2__1 )
            // InternalEcssLanguage.g:1902:2: rule__TemplateGenDef__Group_2__0__Impl rule__TemplateGenDef__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGenDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_2__0"


    // $ANTLR start "rule__TemplateGenDef__Group_2__0__Impl"
    // InternalEcssLanguage.g:1909:1: rule__TemplateGenDef__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__TemplateGenDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1913:1: ( ( 'extends' ) )
            // InternalEcssLanguage.g:1914:1: ( 'extends' )
            {
            // InternalEcssLanguage.g:1914:1: ( 'extends' )
            // InternalEcssLanguage.g:1915:2: 'extends'
            {
             before(grammarAccess.getTemplateGenDefAccess().getExtendsKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_2__0__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group_2__1"
    // InternalEcssLanguage.g:1924:1: rule__TemplateGenDef__Group_2__1 : rule__TemplateGenDef__Group_2__1__Impl ;
    public final void rule__TemplateGenDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1928:1: ( rule__TemplateGenDef__Group_2__1__Impl )
            // InternalEcssLanguage.g:1929:2: rule__TemplateGenDef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_2__1"


    // $ANTLR start "rule__TemplateGenDef__Group_2__1__Impl"
    // InternalEcssLanguage.g:1935:1: rule__TemplateGenDef__Group_2__1__Impl : ( ( rule__TemplateGenDef__SuperRuleAssignment_2_1 ) ) ;
    public final void rule__TemplateGenDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1939:1: ( ( ( rule__TemplateGenDef__SuperRuleAssignment_2_1 ) ) )
            // InternalEcssLanguage.g:1940:1: ( ( rule__TemplateGenDef__SuperRuleAssignment_2_1 ) )
            {
            // InternalEcssLanguage.g:1940:1: ( ( rule__TemplateGenDef__SuperRuleAssignment_2_1 ) )
            // InternalEcssLanguage.g:1941:2: ( rule__TemplateGenDef__SuperRuleAssignment_2_1 )
            {
             before(grammarAccess.getTemplateGenDefAccess().getSuperRuleAssignment_2_1()); 
            // InternalEcssLanguage.g:1942:2: ( rule__TemplateGenDef__SuperRuleAssignment_2_1 )
            // InternalEcssLanguage.g:1942:3: rule__TemplateGenDef__SuperRuleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__SuperRuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGenDefAccess().getSuperRuleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_2__1__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group_3__0"
    // InternalEcssLanguage.g:1951:1: rule__TemplateGenDef__Group_3__0 : rule__TemplateGenDef__Group_3__0__Impl rule__TemplateGenDef__Group_3__1 ;
    public final void rule__TemplateGenDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1955:1: ( rule__TemplateGenDef__Group_3__0__Impl rule__TemplateGenDef__Group_3__1 )
            // InternalEcssLanguage.g:1956:2: rule__TemplateGenDef__Group_3__0__Impl rule__TemplateGenDef__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__TemplateGenDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_3__0"


    // $ANTLR start "rule__TemplateGenDef__Group_3__0__Impl"
    // InternalEcssLanguage.g:1963:1: rule__TemplateGenDef__Group_3__0__Impl : ( ':' ) ;
    public final void rule__TemplateGenDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1967:1: ( ( ':' ) )
            // InternalEcssLanguage.g:1968:1: ( ':' )
            {
            // InternalEcssLanguage.g:1968:1: ( ':' )
            // InternalEcssLanguage.g:1969:2: ':'
            {
             before(grammarAccess.getTemplateGenDefAccess().getColonKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_3__0__Impl"


    // $ANTLR start "rule__TemplateGenDef__Group_3__1"
    // InternalEcssLanguage.g:1978:1: rule__TemplateGenDef__Group_3__1 : rule__TemplateGenDef__Group_3__1__Impl ;
    public final void rule__TemplateGenDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1982:1: ( rule__TemplateGenDef__Group_3__1__Impl )
            // InternalEcssLanguage.g:1983:2: rule__TemplateGenDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_3__1"


    // $ANTLR start "rule__TemplateGenDef__Group_3__1__Impl"
    // InternalEcssLanguage.g:1989:1: rule__TemplateGenDef__Group_3__1__Impl : ( ( rule__TemplateGenDef__JavaClassAssignment_3_1 ) ) ;
    public final void rule__TemplateGenDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:1993:1: ( ( ( rule__TemplateGenDef__JavaClassAssignment_3_1 ) ) )
            // InternalEcssLanguage.g:1994:1: ( ( rule__TemplateGenDef__JavaClassAssignment_3_1 ) )
            {
            // InternalEcssLanguage.g:1994:1: ( ( rule__TemplateGenDef__JavaClassAssignment_3_1 ) )
            // InternalEcssLanguage.g:1995:2: ( rule__TemplateGenDef__JavaClassAssignment_3_1 )
            {
             before(grammarAccess.getTemplateGenDefAccess().getJavaClassAssignment_3_1()); 
            // InternalEcssLanguage.g:1996:2: ( rule__TemplateGenDef__JavaClassAssignment_3_1 )
            // InternalEcssLanguage.g:1996:3: rule__TemplateGenDef__JavaClassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGenDef__JavaClassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGenDefAccess().getJavaClassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__Group_3__1__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group__0"
    // InternalEcssLanguage.g:2005:1: rule__BasicTemplateRule__Group__0 : rule__BasicTemplateRule__Group__0__Impl rule__BasicTemplateRule__Group__1 ;
    public final void rule__BasicTemplateRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2009:1: ( rule__BasicTemplateRule__Group__0__Impl rule__BasicTemplateRule__Group__1 )
            // InternalEcssLanguage.g:2010:2: rule__BasicTemplateRule__Group__0__Impl rule__BasicTemplateRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BasicTemplateRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__0"


    // $ANTLR start "rule__BasicTemplateRule__Group__0__Impl"
    // InternalEcssLanguage.g:2017:1: rule__BasicTemplateRule__Group__0__Impl : ( 'javarule' ) ;
    public final void rule__BasicTemplateRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2021:1: ( ( 'javarule' ) )
            // InternalEcssLanguage.g:2022:1: ( 'javarule' )
            {
            // InternalEcssLanguage.g:2022:1: ( 'javarule' )
            // InternalEcssLanguage.g:2023:2: 'javarule'
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getJavaruleKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getJavaruleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__0__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group__1"
    // InternalEcssLanguage.g:2032:1: rule__BasicTemplateRule__Group__1 : rule__BasicTemplateRule__Group__1__Impl rule__BasicTemplateRule__Group__2 ;
    public final void rule__BasicTemplateRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2036:1: ( rule__BasicTemplateRule__Group__1__Impl rule__BasicTemplateRule__Group__2 )
            // InternalEcssLanguage.g:2037:2: rule__BasicTemplateRule__Group__1__Impl rule__BasicTemplateRule__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BasicTemplateRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__1"


    // $ANTLR start "rule__BasicTemplateRule__Group__1__Impl"
    // InternalEcssLanguage.g:2044:1: rule__BasicTemplateRule__Group__1__Impl : ( ( rule__BasicTemplateRule__TypeAssignment_1 ) ) ;
    public final void rule__BasicTemplateRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2048:1: ( ( ( rule__BasicTemplateRule__TypeAssignment_1 ) ) )
            // InternalEcssLanguage.g:2049:1: ( ( rule__BasicTemplateRule__TypeAssignment_1 ) )
            {
            // InternalEcssLanguage.g:2049:1: ( ( rule__BasicTemplateRule__TypeAssignment_1 ) )
            // InternalEcssLanguage.g:2050:2: ( rule__BasicTemplateRule__TypeAssignment_1 )
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getTypeAssignment_1()); 
            // InternalEcssLanguage.g:2051:2: ( rule__BasicTemplateRule__TypeAssignment_1 )
            // InternalEcssLanguage.g:2051:3: rule__BasicTemplateRule__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTemplateRuleAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__1__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group__2"
    // InternalEcssLanguage.g:2059:1: rule__BasicTemplateRule__Group__2 : rule__BasicTemplateRule__Group__2__Impl rule__BasicTemplateRule__Group__3 ;
    public final void rule__BasicTemplateRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2063:1: ( rule__BasicTemplateRule__Group__2__Impl rule__BasicTemplateRule__Group__3 )
            // InternalEcssLanguage.g:2064:2: rule__BasicTemplateRule__Group__2__Impl rule__BasicTemplateRule__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__BasicTemplateRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__2"


    // $ANTLR start "rule__BasicTemplateRule__Group__2__Impl"
    // InternalEcssLanguage.g:2071:1: rule__BasicTemplateRule__Group__2__Impl : ( ( rule__BasicTemplateRule__NameAssignment_2 ) ) ;
    public final void rule__BasicTemplateRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2075:1: ( ( ( rule__BasicTemplateRule__NameAssignment_2 ) ) )
            // InternalEcssLanguage.g:2076:1: ( ( rule__BasicTemplateRule__NameAssignment_2 ) )
            {
            // InternalEcssLanguage.g:2076:1: ( ( rule__BasicTemplateRule__NameAssignment_2 ) )
            // InternalEcssLanguage.g:2077:2: ( rule__BasicTemplateRule__NameAssignment_2 )
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getNameAssignment_2()); 
            // InternalEcssLanguage.g:2078:2: ( rule__BasicTemplateRule__NameAssignment_2 )
            // InternalEcssLanguage.g:2078:3: rule__BasicTemplateRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicTemplateRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__2__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group__3"
    // InternalEcssLanguage.g:2086:1: rule__BasicTemplateRule__Group__3 : rule__BasicTemplateRule__Group__3__Impl rule__BasicTemplateRule__Group__4 ;
    public final void rule__BasicTemplateRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2090:1: ( rule__BasicTemplateRule__Group__3__Impl rule__BasicTemplateRule__Group__4 )
            // InternalEcssLanguage.g:2091:2: rule__BasicTemplateRule__Group__3__Impl rule__BasicTemplateRule__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__BasicTemplateRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__3"


    // $ANTLR start "rule__BasicTemplateRule__Group__3__Impl"
    // InternalEcssLanguage.g:2098:1: rule__BasicTemplateRule__Group__3__Impl : ( ( rule__BasicTemplateRule__Group_3__0 )? ) ;
    public final void rule__BasicTemplateRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2102:1: ( ( ( rule__BasicTemplateRule__Group_3__0 )? ) )
            // InternalEcssLanguage.g:2103:1: ( ( rule__BasicTemplateRule__Group_3__0 )? )
            {
            // InternalEcssLanguage.g:2103:1: ( ( rule__BasicTemplateRule__Group_3__0 )? )
            // InternalEcssLanguage.g:2104:2: ( rule__BasicTemplateRule__Group_3__0 )?
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getGroup_3()); 
            // InternalEcssLanguage.g:2105:2: ( rule__BasicTemplateRule__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEcssLanguage.g:2105:3: rule__BasicTemplateRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicTemplateRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicTemplateRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__3__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group__4"
    // InternalEcssLanguage.g:2113:1: rule__BasicTemplateRule__Group__4 : rule__BasicTemplateRule__Group__4__Impl ;
    public final void rule__BasicTemplateRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2117:1: ( rule__BasicTemplateRule__Group__4__Impl )
            // InternalEcssLanguage.g:2118:2: rule__BasicTemplateRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__4"


    // $ANTLR start "rule__BasicTemplateRule__Group__4__Impl"
    // InternalEcssLanguage.g:2124:1: rule__BasicTemplateRule__Group__4__Impl : ( ';' ) ;
    public final void rule__BasicTemplateRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2128:1: ( ( ';' ) )
            // InternalEcssLanguage.g:2129:1: ( ';' )
            {
            // InternalEcssLanguage.g:2129:1: ( ';' )
            // InternalEcssLanguage.g:2130:2: ';'
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group__4__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group_3__0"
    // InternalEcssLanguage.g:2140:1: rule__BasicTemplateRule__Group_3__0 : rule__BasicTemplateRule__Group_3__0__Impl rule__BasicTemplateRule__Group_3__1 ;
    public final void rule__BasicTemplateRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2144:1: ( rule__BasicTemplateRule__Group_3__0__Impl rule__BasicTemplateRule__Group_3__1 )
            // InternalEcssLanguage.g:2145:2: rule__BasicTemplateRule__Group_3__0__Impl rule__BasicTemplateRule__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__BasicTemplateRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group_3__0"


    // $ANTLR start "rule__BasicTemplateRule__Group_3__0__Impl"
    // InternalEcssLanguage.g:2152:1: rule__BasicTemplateRule__Group_3__0__Impl : ( '::' ) ;
    public final void rule__BasicTemplateRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2156:1: ( ( '::' ) )
            // InternalEcssLanguage.g:2157:1: ( '::' )
            {
            // InternalEcssLanguage.g:2157:1: ( '::' )
            // InternalEcssLanguage.g:2158:2: '::'
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getColonColonKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getColonColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group_3__0__Impl"


    // $ANTLR start "rule__BasicTemplateRule__Group_3__1"
    // InternalEcssLanguage.g:2167:1: rule__BasicTemplateRule__Group_3__1 : rule__BasicTemplateRule__Group_3__1__Impl ;
    public final void rule__BasicTemplateRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2171:1: ( rule__BasicTemplateRule__Group_3__1__Impl )
            // InternalEcssLanguage.g:2172:2: rule__BasicTemplateRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicTemplateRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group_3__1"


    // $ANTLR start "rule__BasicTemplateRule__Group_3__1__Impl"
    // InternalEcssLanguage.g:2178:1: rule__BasicTemplateRule__Group_3__1__Impl : ( ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) ) ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* ) ) ;
    public final void rule__BasicTemplateRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2182:1: ( ( ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) ) ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* ) ) )
            // InternalEcssLanguage.g:2183:1: ( ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) ) ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* ) )
            {
            // InternalEcssLanguage.g:2183:1: ( ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) ) ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* ) )
            // InternalEcssLanguage.g:2184:2: ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) ) ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* )
            {
            // InternalEcssLanguage.g:2184:2: ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 ) )
            // InternalEcssLanguage.g:2185:3: ( rule__BasicTemplateRule__GroupsAssignment_3_1 )
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getGroupsAssignment_3_1()); 
            // InternalEcssLanguage.g:2186:3: ( rule__BasicTemplateRule__GroupsAssignment_3_1 )
            // InternalEcssLanguage.g:2186:4: rule__BasicTemplateRule__GroupsAssignment_3_1
            {
            pushFollow(FOLLOW_19);
            rule__BasicTemplateRule__GroupsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTemplateRuleAccess().getGroupsAssignment_3_1()); 

            }

            // InternalEcssLanguage.g:2189:2: ( ( rule__BasicTemplateRule__GroupsAssignment_3_1 )* )
            // InternalEcssLanguage.g:2190:3: ( rule__BasicTemplateRule__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getGroupsAssignment_3_1()); 
            // InternalEcssLanguage.g:2191:3: ( rule__BasicTemplateRule__GroupsAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEcssLanguage.g:2191:4: rule__BasicTemplateRule__GroupsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BasicTemplateRule__GroupsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBasicTemplateRuleAccess().getGroupsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__Group_3__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__0"
    // InternalEcssLanguage.g:2201:1: rule__TemplateGeneratorRule__Group__0 : rule__TemplateGeneratorRule__Group__0__Impl rule__TemplateGeneratorRule__Group__1 ;
    public final void rule__TemplateGeneratorRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2205:1: ( rule__TemplateGeneratorRule__Group__0__Impl rule__TemplateGeneratorRule__Group__1 )
            // InternalEcssLanguage.g:2206:2: rule__TemplateGeneratorRule__Group__0__Impl rule__TemplateGeneratorRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGeneratorRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__0__Impl"
    // InternalEcssLanguage.g:2213:1: rule__TemplateGeneratorRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__TemplateGeneratorRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2217:1: ( ( 'rule' ) )
            // InternalEcssLanguage.g:2218:1: ( 'rule' )
            {
            // InternalEcssLanguage.g:2218:1: ( 'rule' )
            // InternalEcssLanguage.g:2219:2: 'rule'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__1"
    // InternalEcssLanguage.g:2228:1: rule__TemplateGeneratorRule__Group__1 : rule__TemplateGeneratorRule__Group__1__Impl rule__TemplateGeneratorRule__Group__2 ;
    public final void rule__TemplateGeneratorRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2232:1: ( rule__TemplateGeneratorRule__Group__1__Impl rule__TemplateGeneratorRule__Group__2 )
            // InternalEcssLanguage.g:2233:2: rule__TemplateGeneratorRule__Group__1__Impl rule__TemplateGeneratorRule__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGeneratorRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__1__Impl"
    // InternalEcssLanguage.g:2240:1: rule__TemplateGeneratorRule__Group__1__Impl : ( ( rule__TemplateGeneratorRule__TypeAssignment_1 ) ) ;
    public final void rule__TemplateGeneratorRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2244:1: ( ( ( rule__TemplateGeneratorRule__TypeAssignment_1 ) ) )
            // InternalEcssLanguage.g:2245:1: ( ( rule__TemplateGeneratorRule__TypeAssignment_1 ) )
            {
            // InternalEcssLanguage.g:2245:1: ( ( rule__TemplateGeneratorRule__TypeAssignment_1 ) )
            // InternalEcssLanguage.g:2246:2: ( rule__TemplateGeneratorRule__TypeAssignment_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeAssignment_1()); 
            // InternalEcssLanguage.g:2247:2: ( rule__TemplateGeneratorRule__TypeAssignment_1 )
            // InternalEcssLanguage.g:2247:3: rule__TemplateGeneratorRule__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__2"
    // InternalEcssLanguage.g:2255:1: rule__TemplateGeneratorRule__Group__2 : rule__TemplateGeneratorRule__Group__2__Impl rule__TemplateGeneratorRule__Group__3 ;
    public final void rule__TemplateGeneratorRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2259:1: ( rule__TemplateGeneratorRule__Group__2__Impl rule__TemplateGeneratorRule__Group__3 )
            // InternalEcssLanguage.g:2260:2: rule__TemplateGeneratorRule__Group__2__Impl rule__TemplateGeneratorRule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TemplateGeneratorRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__2"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__2__Impl"
    // InternalEcssLanguage.g:2267:1: rule__TemplateGeneratorRule__Group__2__Impl : ( ( rule__TemplateGeneratorRule__NameAssignment_2 ) ) ;
    public final void rule__TemplateGeneratorRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2271:1: ( ( ( rule__TemplateGeneratorRule__NameAssignment_2 ) ) )
            // InternalEcssLanguage.g:2272:1: ( ( rule__TemplateGeneratorRule__NameAssignment_2 ) )
            {
            // InternalEcssLanguage.g:2272:1: ( ( rule__TemplateGeneratorRule__NameAssignment_2 ) )
            // InternalEcssLanguage.g:2273:2: ( rule__TemplateGeneratorRule__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getNameAssignment_2()); 
            // InternalEcssLanguage.g:2274:2: ( rule__TemplateGeneratorRule__NameAssignment_2 )
            // InternalEcssLanguage.g:2274:3: rule__TemplateGeneratorRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__2__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__3"
    // InternalEcssLanguage.g:2282:1: rule__TemplateGeneratorRule__Group__3 : rule__TemplateGeneratorRule__Group__3__Impl rule__TemplateGeneratorRule__Group__4 ;
    public final void rule__TemplateGeneratorRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2286:1: ( rule__TemplateGeneratorRule__Group__3__Impl rule__TemplateGeneratorRule__Group__4 )
            // InternalEcssLanguage.g:2287:2: rule__TemplateGeneratorRule__Group__3__Impl rule__TemplateGeneratorRule__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__TemplateGeneratorRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__3"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__3__Impl"
    // InternalEcssLanguage.g:2294:1: rule__TemplateGeneratorRule__Group__3__Impl : ( ( rule__TemplateGeneratorRule__Group_3__0 )? ) ;
    public final void rule__TemplateGeneratorRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2298:1: ( ( ( rule__TemplateGeneratorRule__Group_3__0 )? ) )
            // InternalEcssLanguage.g:2299:1: ( ( rule__TemplateGeneratorRule__Group_3__0 )? )
            {
            // InternalEcssLanguage.g:2299:1: ( ( rule__TemplateGeneratorRule__Group_3__0 )? )
            // InternalEcssLanguage.g:2300:2: ( rule__TemplateGeneratorRule__Group_3__0 )?
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_3()); 
            // InternalEcssLanguage.g:2301:2: ( rule__TemplateGeneratorRule__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEcssLanguage.g:2301:3: rule__TemplateGeneratorRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__3__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__4"
    // InternalEcssLanguage.g:2309:1: rule__TemplateGeneratorRule__Group__4 : rule__TemplateGeneratorRule__Group__4__Impl rule__TemplateGeneratorRule__Group__5 ;
    public final void rule__TemplateGeneratorRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2313:1: ( rule__TemplateGeneratorRule__Group__4__Impl rule__TemplateGeneratorRule__Group__5 )
            // InternalEcssLanguage.g:2314:2: rule__TemplateGeneratorRule__Group__4__Impl rule__TemplateGeneratorRule__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__TemplateGeneratorRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__4"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__4__Impl"
    // InternalEcssLanguage.g:2321:1: rule__TemplateGeneratorRule__Group__4__Impl : ( ( rule__TemplateGeneratorRule__Group_4__0 )? ) ;
    public final void rule__TemplateGeneratorRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2325:1: ( ( ( rule__TemplateGeneratorRule__Group_4__0 )? ) )
            // InternalEcssLanguage.g:2326:1: ( ( rule__TemplateGeneratorRule__Group_4__0 )? )
            {
            // InternalEcssLanguage.g:2326:1: ( ( rule__TemplateGeneratorRule__Group_4__0 )? )
            // InternalEcssLanguage.g:2327:2: ( rule__TemplateGeneratorRule__Group_4__0 )?
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4()); 
            // InternalEcssLanguage.g:2328:2: ( rule__TemplateGeneratorRule__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEcssLanguage.g:2328:3: rule__TemplateGeneratorRule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__4__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__5"
    // InternalEcssLanguage.g:2336:1: rule__TemplateGeneratorRule__Group__5 : rule__TemplateGeneratorRule__Group__5__Impl rule__TemplateGeneratorRule__Group__6 ;
    public final void rule__TemplateGeneratorRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2340:1: ( rule__TemplateGeneratorRule__Group__5__Impl rule__TemplateGeneratorRule__Group__6 )
            // InternalEcssLanguage.g:2341:2: rule__TemplateGeneratorRule__Group__5__Impl rule__TemplateGeneratorRule__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__TemplateGeneratorRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__5"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__5__Impl"
    // InternalEcssLanguage.g:2348:1: rule__TemplateGeneratorRule__Group__5__Impl : ( ( rule__TemplateGeneratorRule__Alternatives_5 )? ) ;
    public final void rule__TemplateGeneratorRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2352:1: ( ( ( rule__TemplateGeneratorRule__Alternatives_5 )? ) )
            // InternalEcssLanguage.g:2353:1: ( ( rule__TemplateGeneratorRule__Alternatives_5 )? )
            {
            // InternalEcssLanguage.g:2353:1: ( ( rule__TemplateGeneratorRule__Alternatives_5 )? )
            // InternalEcssLanguage.g:2354:2: ( rule__TemplateGeneratorRule__Alternatives_5 )?
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getAlternatives_5()); 
            // InternalEcssLanguage.g:2355:2: ( rule__TemplateGeneratorRule__Alternatives_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17||LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEcssLanguage.g:2355:3: rule__TemplateGeneratorRule__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__5__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__6"
    // InternalEcssLanguage.g:2363:1: rule__TemplateGeneratorRule__Group__6 : rule__TemplateGeneratorRule__Group__6__Impl rule__TemplateGeneratorRule__Group__7 ;
    public final void rule__TemplateGeneratorRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2367:1: ( rule__TemplateGeneratorRule__Group__6__Impl rule__TemplateGeneratorRule__Group__7 )
            // InternalEcssLanguage.g:2368:2: rule__TemplateGeneratorRule__Group__6__Impl rule__TemplateGeneratorRule__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__TemplateGeneratorRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__6"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__6__Impl"
    // InternalEcssLanguage.g:2375:1: rule__TemplateGeneratorRule__Group__6__Impl : ( ( rule__TemplateGeneratorRule__Group_6__0 )? ) ;
    public final void rule__TemplateGeneratorRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2379:1: ( ( ( rule__TemplateGeneratorRule__Group_6__0 )? ) )
            // InternalEcssLanguage.g:2380:1: ( ( rule__TemplateGeneratorRule__Group_6__0 )? )
            {
            // InternalEcssLanguage.g:2380:1: ( ( rule__TemplateGeneratorRule__Group_6__0 )? )
            // InternalEcssLanguage.g:2381:2: ( rule__TemplateGeneratorRule__Group_6__0 )?
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_6()); 
            // InternalEcssLanguage.g:2382:2: ( rule__TemplateGeneratorRule__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEcssLanguage.g:2382:3: rule__TemplateGeneratorRule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateGeneratorRule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__6__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__7"
    // InternalEcssLanguage.g:2390:1: rule__TemplateGeneratorRule__Group__7 : rule__TemplateGeneratorRule__Group__7__Impl ;
    public final void rule__TemplateGeneratorRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2394:1: ( rule__TemplateGeneratorRule__Group__7__Impl )
            // InternalEcssLanguage.g:2395:2: rule__TemplateGeneratorRule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__7"


    // $ANTLR start "rule__TemplateGeneratorRule__Group__7__Impl"
    // InternalEcssLanguage.g:2401:1: rule__TemplateGeneratorRule__Group__7__Impl : ( ';' ) ;
    public final void rule__TemplateGeneratorRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2405:1: ( ( ';' ) )
            // InternalEcssLanguage.g:2406:1: ( ';' )
            {
            // InternalEcssLanguage.g:2406:1: ( ';' )
            // InternalEcssLanguage.g:2407:2: ';'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getSemicolonKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group__7__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_3__0"
    // InternalEcssLanguage.g:2417:1: rule__TemplateGeneratorRule__Group_3__0 : rule__TemplateGeneratorRule__Group_3__0__Impl rule__TemplateGeneratorRule__Group_3__1 ;
    public final void rule__TemplateGeneratorRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2421:1: ( rule__TemplateGeneratorRule__Group_3__0__Impl rule__TemplateGeneratorRule__Group_3__1 )
            // InternalEcssLanguage.g:2422:2: rule__TemplateGeneratorRule__Group_3__0__Impl rule__TemplateGeneratorRule__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGeneratorRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_3__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_3__0__Impl"
    // InternalEcssLanguage.g:2429:1: rule__TemplateGeneratorRule__Group_3__0__Impl : ( '::' ) ;
    public final void rule__TemplateGeneratorRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2433:1: ( ( '::' ) )
            // InternalEcssLanguage.g:2434:1: ( '::' )
            {
            // InternalEcssLanguage.g:2434:1: ( '::' )
            // InternalEcssLanguage.g:2435:2: '::'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getColonColonKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getColonColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_3__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_3__1"
    // InternalEcssLanguage.g:2444:1: rule__TemplateGeneratorRule__Group_3__1 : rule__TemplateGeneratorRule__Group_3__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2448:1: ( rule__TemplateGeneratorRule__Group_3__1__Impl )
            // InternalEcssLanguage.g:2449:2: rule__TemplateGeneratorRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_3__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_3__1__Impl"
    // InternalEcssLanguage.g:2455:1: rule__TemplateGeneratorRule__Group_3__1__Impl : ( ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) ) ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* ) ) ;
    public final void rule__TemplateGeneratorRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2459:1: ( ( ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) ) ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* ) ) )
            // InternalEcssLanguage.g:2460:1: ( ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) ) ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* ) )
            {
            // InternalEcssLanguage.g:2460:1: ( ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) ) ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* ) )
            // InternalEcssLanguage.g:2461:2: ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) ) ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* )
            {
            // InternalEcssLanguage.g:2461:2: ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 ) )
            // InternalEcssLanguage.g:2462:3: ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsAssignment_3_1()); 
            // InternalEcssLanguage.g:2463:3: ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )
            // InternalEcssLanguage.g:2463:4: rule__TemplateGeneratorRule__GroupsAssignment_3_1
            {
            pushFollow(FOLLOW_19);
            rule__TemplateGeneratorRule__GroupsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsAssignment_3_1()); 

            }

            // InternalEcssLanguage.g:2466:2: ( ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )* )
            // InternalEcssLanguage.g:2467:3: ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsAssignment_3_1()); 
            // InternalEcssLanguage.g:2468:3: ( rule__TemplateGeneratorRule__GroupsAssignment_3_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEcssLanguage.g:2468:4: rule__TemplateGeneratorRule__GroupsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__TemplateGeneratorRule__GroupsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_3__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4__0"
    // InternalEcssLanguage.g:2478:1: rule__TemplateGeneratorRule__Group_4__0 : rule__TemplateGeneratorRule__Group_4__0__Impl rule__TemplateGeneratorRule__Group_4__1 ;
    public final void rule__TemplateGeneratorRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2482:1: ( rule__TemplateGeneratorRule__Group_4__0__Impl rule__TemplateGeneratorRule__Group_4__1 )
            // InternalEcssLanguage.g:2483:2: rule__TemplateGeneratorRule__Group_4__0__Impl rule__TemplateGeneratorRule__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGeneratorRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4__0__Impl"
    // InternalEcssLanguage.g:2490:1: rule__TemplateGeneratorRule__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__TemplateGeneratorRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2494:1: ( ( 'with' ) )
            // InternalEcssLanguage.g:2495:1: ( 'with' )
            {
            // InternalEcssLanguage.g:2495:1: ( 'with' )
            // InternalEcssLanguage.g:2496:2: 'with'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getWithKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getWithKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4__1"
    // InternalEcssLanguage.g:2505:1: rule__TemplateGeneratorRule__Group_4__1 : rule__TemplateGeneratorRule__Group_4__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2509:1: ( rule__TemplateGeneratorRule__Group_4__1__Impl )
            // InternalEcssLanguage.g:2510:2: rule__TemplateGeneratorRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4__1__Impl"
    // InternalEcssLanguage.g:2516:1: rule__TemplateGeneratorRule__Group_4__1__Impl : ( ( rule__TemplateGeneratorRule__Group_4_1__0 ) ) ;
    public final void rule__TemplateGeneratorRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2520:1: ( ( ( rule__TemplateGeneratorRule__Group_4_1__0 ) ) )
            // InternalEcssLanguage.g:2521:1: ( ( rule__TemplateGeneratorRule__Group_4_1__0 ) )
            {
            // InternalEcssLanguage.g:2521:1: ( ( rule__TemplateGeneratorRule__Group_4_1__0 ) )
            // InternalEcssLanguage.g:2522:2: ( rule__TemplateGeneratorRule__Group_4_1__0 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4_1()); 
            // InternalEcssLanguage.g:2523:2: ( rule__TemplateGeneratorRule__Group_4_1__0 )
            // InternalEcssLanguage.g:2523:3: rule__TemplateGeneratorRule__Group_4_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1__0"
    // InternalEcssLanguage.g:2532:1: rule__TemplateGeneratorRule__Group_4_1__0 : rule__TemplateGeneratorRule__Group_4_1__0__Impl rule__TemplateGeneratorRule__Group_4_1__1 ;
    public final void rule__TemplateGeneratorRule__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2536:1: ( rule__TemplateGeneratorRule__Group_4_1__0__Impl rule__TemplateGeneratorRule__Group_4_1__1 )
            // InternalEcssLanguage.g:2537:2: rule__TemplateGeneratorRule__Group_4_1__0__Impl rule__TemplateGeneratorRule__Group_4_1__1
            {
            pushFollow(FOLLOW_21);
            rule__TemplateGeneratorRule__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1__0__Impl"
    // InternalEcssLanguage.g:2544:1: rule__TemplateGeneratorRule__Group_4_1__0__Impl : ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 ) ) ;
    public final void rule__TemplateGeneratorRule__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2548:1: ( ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 ) ) )
            // InternalEcssLanguage.g:2549:1: ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 ) )
            {
            // InternalEcssLanguage.g:2549:1: ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 ) )
            // InternalEcssLanguage.g:2550:2: ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefAssignment_4_1_0()); 
            // InternalEcssLanguage.g:2551:2: ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 )
            // InternalEcssLanguage.g:2551:3: rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1__1"
    // InternalEcssLanguage.g:2559:1: rule__TemplateGeneratorRule__Group_4_1__1 : rule__TemplateGeneratorRule__Group_4_1__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2563:1: ( rule__TemplateGeneratorRule__Group_4_1__1__Impl )
            // InternalEcssLanguage.g:2564:2: rule__TemplateGeneratorRule__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1__1__Impl"
    // InternalEcssLanguage.g:2570:1: rule__TemplateGeneratorRule__Group_4_1__1__Impl : ( ( rule__TemplateGeneratorRule__Group_4_1_1__0 )* ) ;
    public final void rule__TemplateGeneratorRule__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2574:1: ( ( ( rule__TemplateGeneratorRule__Group_4_1_1__0 )* ) )
            // InternalEcssLanguage.g:2575:1: ( ( rule__TemplateGeneratorRule__Group_4_1_1__0 )* )
            {
            // InternalEcssLanguage.g:2575:1: ( ( rule__TemplateGeneratorRule__Group_4_1_1__0 )* )
            // InternalEcssLanguage.g:2576:2: ( rule__TemplateGeneratorRule__Group_4_1_1__0 )*
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4_1_1()); 
            // InternalEcssLanguage.g:2577:2: ( rule__TemplateGeneratorRule__Group_4_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEcssLanguage.g:2577:3: rule__TemplateGeneratorRule__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TemplateGeneratorRule__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroup_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1_1__0"
    // InternalEcssLanguage.g:2586:1: rule__TemplateGeneratorRule__Group_4_1_1__0 : rule__TemplateGeneratorRule__Group_4_1_1__0__Impl rule__TemplateGeneratorRule__Group_4_1_1__1 ;
    public final void rule__TemplateGeneratorRule__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2590:1: ( rule__TemplateGeneratorRule__Group_4_1_1__0__Impl rule__TemplateGeneratorRule__Group_4_1_1__1 )
            // InternalEcssLanguage.g:2591:2: rule__TemplateGeneratorRule__Group_4_1_1__0__Impl rule__TemplateGeneratorRule__Group_4_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateGeneratorRule__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1_1__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1_1__0__Impl"
    // InternalEcssLanguage.g:2598:1: rule__TemplateGeneratorRule__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateGeneratorRule__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2602:1: ( ( ',' ) )
            // InternalEcssLanguage.g:2603:1: ( ',' )
            {
            // InternalEcssLanguage.g:2603:1: ( ',' )
            // InternalEcssLanguage.g:2604:2: ','
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getCommaKeyword_4_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getCommaKeyword_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1_1__1"
    // InternalEcssLanguage.g:2613:1: rule__TemplateGeneratorRule__Group_4_1_1__1 : rule__TemplateGeneratorRule__Group_4_1_1__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2617:1: ( rule__TemplateGeneratorRule__Group_4_1_1__1__Impl )
            // InternalEcssLanguage.g:2618:2: rule__TemplateGeneratorRule__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_4_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1_1__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_4_1_1__1__Impl"
    // InternalEcssLanguage.g:2624:1: rule__TemplateGeneratorRule__Group_4_1_1__1__Impl : ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 ) ) ;
    public final void rule__TemplateGeneratorRule__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2628:1: ( ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 ) ) )
            // InternalEcssLanguage.g:2629:1: ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 ) )
            {
            // InternalEcssLanguage.g:2629:1: ( ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 ) )
            // InternalEcssLanguage.g:2630:2: ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefAssignment_4_1_1_1()); 
            // InternalEcssLanguage.g:2631:2: ( rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 )
            // InternalEcssLanguage.g:2631:3: rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefAssignment_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_0__0"
    // InternalEcssLanguage.g:2640:1: rule__TemplateGeneratorRule__Group_5_0__0 : rule__TemplateGeneratorRule__Group_5_0__0__Impl rule__TemplateGeneratorRule__Group_5_0__1 ;
    public final void rule__TemplateGeneratorRule__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2644:1: ( rule__TemplateGeneratorRule__Group_5_0__0__Impl rule__TemplateGeneratorRule__Group_5_0__1 )
            // InternalEcssLanguage.g:2645:2: rule__TemplateGeneratorRule__Group_5_0__0__Impl rule__TemplateGeneratorRule__Group_5_0__1
            {
            pushFollow(FOLLOW_23);
            rule__TemplateGeneratorRule__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_0__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_0__0__Impl"
    // InternalEcssLanguage.g:2652:1: rule__TemplateGeneratorRule__Group_5_0__0__Impl : ( 'id' ) ;
    public final void rule__TemplateGeneratorRule__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2656:1: ( ( 'id' ) )
            // InternalEcssLanguage.g:2657:1: ( 'id' )
            {
            // InternalEcssLanguage.g:2657:1: ( 'id' )
            // InternalEcssLanguage.g:2658:2: 'id'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdKeyword_5_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_0__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_0__1"
    // InternalEcssLanguage.g:2667:1: rule__TemplateGeneratorRule__Group_5_0__1 : rule__TemplateGeneratorRule__Group_5_0__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2671:1: ( rule__TemplateGeneratorRule__Group_5_0__1__Impl )
            // InternalEcssLanguage.g:2672:2: rule__TemplateGeneratorRule__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_0__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_0__1__Impl"
    // InternalEcssLanguage.g:2678:1: rule__TemplateGeneratorRule__Group_5_0__1__Impl : ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 ) ) ;
    public final void rule__TemplateGeneratorRule__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2682:1: ( ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 ) ) )
            // InternalEcssLanguage.g:2683:1: ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 ) )
            {
            // InternalEcssLanguage.g:2683:1: ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 ) )
            // InternalEcssLanguage.g:2684:2: ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_0_1()); 
            // InternalEcssLanguage.g:2685:2: ( rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 )
            // InternalEcssLanguage.g:2685:3: rule__TemplateGeneratorRule__IdPartAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__IdPartAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_0__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__0"
    // InternalEcssLanguage.g:2694:1: rule__TemplateGeneratorRule__Group_5_1__0 : rule__TemplateGeneratorRule__Group_5_1__0__Impl rule__TemplateGeneratorRule__Group_5_1__1 ;
    public final void rule__TemplateGeneratorRule__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2698:1: ( rule__TemplateGeneratorRule__Group_5_1__0__Impl rule__TemplateGeneratorRule__Group_5_1__1 )
            // InternalEcssLanguage.g:2699:2: rule__TemplateGeneratorRule__Group_5_1__0__Impl rule__TemplateGeneratorRule__Group_5_1__1
            {
            pushFollow(FOLLOW_23);
            rule__TemplateGeneratorRule__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__0__Impl"
    // InternalEcssLanguage.g:2706:1: rule__TemplateGeneratorRule__Group_5_1__0__Impl : ( '{' ) ;
    public final void rule__TemplateGeneratorRule__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2710:1: ( ( '{' ) )
            // InternalEcssLanguage.g:2711:1: ( '{' )
            {
            // InternalEcssLanguage.g:2711:1: ( '{' )
            // InternalEcssLanguage.g:2712:2: '{'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getLeftCurlyBracketKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getLeftCurlyBracketKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__1"
    // InternalEcssLanguage.g:2721:1: rule__TemplateGeneratorRule__Group_5_1__1 : rule__TemplateGeneratorRule__Group_5_1__1__Impl rule__TemplateGeneratorRule__Group_5_1__2 ;
    public final void rule__TemplateGeneratorRule__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2725:1: ( rule__TemplateGeneratorRule__Group_5_1__1__Impl rule__TemplateGeneratorRule__Group_5_1__2 )
            // InternalEcssLanguage.g:2726:2: rule__TemplateGeneratorRule__Group_5_1__1__Impl rule__TemplateGeneratorRule__Group_5_1__2
            {
            pushFollow(FOLLOW_24);
            rule__TemplateGeneratorRule__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__1__Impl"
    // InternalEcssLanguage.g:2733:1: rule__TemplateGeneratorRule__Group_5_1__1__Impl : ( ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) ) ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* ) ) ;
    public final void rule__TemplateGeneratorRule__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2737:1: ( ( ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) ) ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* ) ) )
            // InternalEcssLanguage.g:2738:1: ( ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) ) ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* ) )
            {
            // InternalEcssLanguage.g:2738:1: ( ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) ) ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* ) )
            // InternalEcssLanguage.g:2739:2: ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) ) ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* )
            {
            // InternalEcssLanguage.g:2739:2: ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 ) )
            // InternalEcssLanguage.g:2740:3: ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_1_1()); 
            // InternalEcssLanguage.g:2741:3: ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )
            // InternalEcssLanguage.g:2741:4: rule__TemplateGeneratorRule__IdPartAssignment_5_1_1
            {
            pushFollow(FOLLOW_25);
            rule__TemplateGeneratorRule__IdPartAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_1_1()); 

            }

            // InternalEcssLanguage.g:2744:2: ( ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )* )
            // InternalEcssLanguage.g:2745:3: ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )*
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_1_1()); 
            // InternalEcssLanguage.g:2746:3: ( rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING||LA30_0==31||LA30_0==33||(LA30_0>=37 && LA30_0<=38)||(LA30_0>=42 && LA30_0<=43)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEcssLanguage.g:2746:4: rule__TemplateGeneratorRule__IdPartAssignment_5_1_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__TemplateGeneratorRule__IdPartAssignment_5_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartAssignment_5_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__1__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__2"
    // InternalEcssLanguage.g:2755:1: rule__TemplateGeneratorRule__Group_5_1__2 : rule__TemplateGeneratorRule__Group_5_1__2__Impl ;
    public final void rule__TemplateGeneratorRule__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2759:1: ( rule__TemplateGeneratorRule__Group_5_1__2__Impl )
            // InternalEcssLanguage.g:2760:2: rule__TemplateGeneratorRule__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__2"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_5_1__2__Impl"
    // InternalEcssLanguage.g:2766:1: rule__TemplateGeneratorRule__Group_5_1__2__Impl : ( '}' ) ;
    public final void rule__TemplateGeneratorRule__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2770:1: ( ( '}' ) )
            // InternalEcssLanguage.g:2771:1: ( '}' )
            {
            // InternalEcssLanguage.g:2771:1: ( '}' )
            // InternalEcssLanguage.g:2772:2: '}'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getRightCurlyBracketKeyword_5_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getRightCurlyBracketKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_5_1__2__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_6__0"
    // InternalEcssLanguage.g:2782:1: rule__TemplateGeneratorRule__Group_6__0 : rule__TemplateGeneratorRule__Group_6__0__Impl rule__TemplateGeneratorRule__Group_6__1 ;
    public final void rule__TemplateGeneratorRule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2786:1: ( rule__TemplateGeneratorRule__Group_6__0__Impl rule__TemplateGeneratorRule__Group_6__1 )
            // InternalEcssLanguage.g:2787:2: rule__TemplateGeneratorRule__Group_6__0__Impl rule__TemplateGeneratorRule__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__TemplateGeneratorRule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_6__0"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_6__0__Impl"
    // InternalEcssLanguage.g:2794:1: rule__TemplateGeneratorRule__Group_6__0__Impl : ( ':' ) ;
    public final void rule__TemplateGeneratorRule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2798:1: ( ( ':' ) )
            // InternalEcssLanguage.g:2799:1: ( ':' )
            {
            // InternalEcssLanguage.g:2799:1: ( ':' )
            // InternalEcssLanguage.g:2800:2: ':'
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getColonKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_6__0__Impl"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_6__1"
    // InternalEcssLanguage.g:2809:1: rule__TemplateGeneratorRule__Group_6__1 : rule__TemplateGeneratorRule__Group_6__1__Impl ;
    public final void rule__TemplateGeneratorRule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2813:1: ( rule__TemplateGeneratorRule__Group_6__1__Impl )
            // InternalEcssLanguage.g:2814:2: rule__TemplateGeneratorRule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateGeneratorRule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_6__1"


    // $ANTLR start "rule__TemplateGeneratorRule__Group_6__1__Impl"
    // InternalEcssLanguage.g:2820:1: rule__TemplateGeneratorRule__Group_6__1__Impl : ( ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) ) ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* ) ) ;
    public final void rule__TemplateGeneratorRule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2824:1: ( ( ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) ) ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* ) ) )
            // InternalEcssLanguage.g:2825:1: ( ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) ) ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* ) )
            {
            // InternalEcssLanguage.g:2825:1: ( ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) ) ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* ) )
            // InternalEcssLanguage.g:2826:2: ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) ) ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* )
            {
            // InternalEcssLanguage.g:2826:2: ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 ) )
            // InternalEcssLanguage.g:2827:3: ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartAssignment_6_1()); 
            // InternalEcssLanguage.g:2828:3: ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )
            // InternalEcssLanguage.g:2828:4: rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1
            {
            pushFollow(FOLLOW_25);
            rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartAssignment_6_1()); 

            }

            // InternalEcssLanguage.g:2831:2: ( ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )* )
            // InternalEcssLanguage.g:2832:3: ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )*
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartAssignment_6_1()); 
            // InternalEcssLanguage.g:2833:3: ( rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING||LA31_0==31||LA31_0==33||(LA31_0>=37 && LA31_0<=38)||(LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEcssLanguage.g:2833:4: rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartAssignment_6_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__Group_6__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalEcssLanguage.g:2843:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2847:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalEcssLanguage.g:2848:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalEcssLanguage.g:2855:1: rule__TypeDef__Group__0__Impl : ( ( rule__TypeDef__TypeAssignment_0 ) ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2859:1: ( ( ( rule__TypeDef__TypeAssignment_0 ) ) )
            // InternalEcssLanguage.g:2860:1: ( ( rule__TypeDef__TypeAssignment_0 ) )
            {
            // InternalEcssLanguage.g:2860:1: ( ( rule__TypeDef__TypeAssignment_0 ) )
            // InternalEcssLanguage.g:2861:2: ( rule__TypeDef__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeDefAccess().getTypeAssignment_0()); 
            // InternalEcssLanguage.g:2862:2: ( rule__TypeDef__TypeAssignment_0 )
            // InternalEcssLanguage.g:2862:3: rule__TypeDef__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalEcssLanguage.g:2870:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2874:1: ( rule__TypeDef__Group__1__Impl )
            // InternalEcssLanguage.g:2875:2: rule__TypeDef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalEcssLanguage.g:2881:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__NameAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2885:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) )
            // InternalEcssLanguage.g:2886:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            {
            // InternalEcssLanguage.g:2886:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // InternalEcssLanguage.g:2887:2: ( rule__TypeDef__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            // InternalEcssLanguage.g:2888:2: ( rule__TypeDef__NameAssignment_1 )
            // InternalEcssLanguage.g:2888:3: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__0"
    // InternalEcssLanguage.g:2897:1: rule__ForEachExpression__Group__0 : rule__ForEachExpression__Group__0__Impl rule__ForEachExpression__Group__1 ;
    public final void rule__ForEachExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2901:1: ( rule__ForEachExpression__Group__0__Impl rule__ForEachExpression__Group__1 )
            // InternalEcssLanguage.g:2902:2: rule__ForEachExpression__Group__0__Impl rule__ForEachExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ForEachExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__0"


    // $ANTLR start "rule__ForEachExpression__Group__0__Impl"
    // InternalEcssLanguage.g:2909:1: rule__ForEachExpression__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForEachExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2913:1: ( ( 'for' ) )
            // InternalEcssLanguage.g:2914:1: ( 'for' )
            {
            // InternalEcssLanguage.g:2914:1: ( 'for' )
            // InternalEcssLanguage.g:2915:2: 'for'
            {
             before(grammarAccess.getForEachExpressionAccess().getForKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__0__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__1"
    // InternalEcssLanguage.g:2924:1: rule__ForEachExpression__Group__1 : rule__ForEachExpression__Group__1__Impl rule__ForEachExpression__Group__2 ;
    public final void rule__ForEachExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2928:1: ( rule__ForEachExpression__Group__1__Impl rule__ForEachExpression__Group__2 )
            // InternalEcssLanguage.g:2929:2: rule__ForEachExpression__Group__1__Impl rule__ForEachExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ForEachExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__1"


    // $ANTLR start "rule__ForEachExpression__Group__1__Impl"
    // InternalEcssLanguage.g:2936:1: rule__ForEachExpression__Group__1__Impl : ( ( rule__ForEachExpression__TypeAssignment_1 )? ) ;
    public final void rule__ForEachExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2940:1: ( ( ( rule__ForEachExpression__TypeAssignment_1 )? ) )
            // InternalEcssLanguage.g:2941:1: ( ( rule__ForEachExpression__TypeAssignment_1 )? )
            {
            // InternalEcssLanguage.g:2941:1: ( ( rule__ForEachExpression__TypeAssignment_1 )? )
            // InternalEcssLanguage.g:2942:2: ( rule__ForEachExpression__TypeAssignment_1 )?
            {
             before(grammarAccess.getForEachExpressionAccess().getTypeAssignment_1()); 
            // InternalEcssLanguage.g:2943:2: ( rule__ForEachExpression__TypeAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_ID) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalEcssLanguage.g:2943:3: rule__ForEachExpression__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEachExpression__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForEachExpressionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__1__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__2"
    // InternalEcssLanguage.g:2951:1: rule__ForEachExpression__Group__2 : rule__ForEachExpression__Group__2__Impl rule__ForEachExpression__Group__3 ;
    public final void rule__ForEachExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2955:1: ( rule__ForEachExpression__Group__2__Impl rule__ForEachExpression__Group__3 )
            // InternalEcssLanguage.g:2956:2: rule__ForEachExpression__Group__2__Impl rule__ForEachExpression__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ForEachExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__2"


    // $ANTLR start "rule__ForEachExpression__Group__2__Impl"
    // InternalEcssLanguage.g:2963:1: rule__ForEachExpression__Group__2__Impl : ( ( rule__ForEachExpression__VariableAssignment_2 ) ) ;
    public final void rule__ForEachExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2967:1: ( ( ( rule__ForEachExpression__VariableAssignment_2 ) ) )
            // InternalEcssLanguage.g:2968:1: ( ( rule__ForEachExpression__VariableAssignment_2 ) )
            {
            // InternalEcssLanguage.g:2968:1: ( ( rule__ForEachExpression__VariableAssignment_2 ) )
            // InternalEcssLanguage.g:2969:2: ( rule__ForEachExpression__VariableAssignment_2 )
            {
             before(grammarAccess.getForEachExpressionAccess().getVariableAssignment_2()); 
            // InternalEcssLanguage.g:2970:2: ( rule__ForEachExpression__VariableAssignment_2 )
            // InternalEcssLanguage.g:2970:3: rule__ForEachExpression__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForEachExpression__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForEachExpressionAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__2__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__3"
    // InternalEcssLanguage.g:2978:1: rule__ForEachExpression__Group__3 : rule__ForEachExpression__Group__3__Impl rule__ForEachExpression__Group__4 ;
    public final void rule__ForEachExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2982:1: ( rule__ForEachExpression__Group__3__Impl rule__ForEachExpression__Group__4 )
            // InternalEcssLanguage.g:2983:2: rule__ForEachExpression__Group__3__Impl rule__ForEachExpression__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__ForEachExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__3"


    // $ANTLR start "rule__ForEachExpression__Group__3__Impl"
    // InternalEcssLanguage.g:2990:1: rule__ForEachExpression__Group__3__Impl : ( ':' ) ;
    public final void rule__ForEachExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:2994:1: ( ( ':' ) )
            // InternalEcssLanguage.g:2995:1: ( ':' )
            {
            // InternalEcssLanguage.g:2995:1: ( ':' )
            // InternalEcssLanguage.g:2996:2: ':'
            {
             before(grammarAccess.getForEachExpressionAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__3__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__4"
    // InternalEcssLanguage.g:3005:1: rule__ForEachExpression__Group__4 : rule__ForEachExpression__Group__4__Impl rule__ForEachExpression__Group__5 ;
    public final void rule__ForEachExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3009:1: ( rule__ForEachExpression__Group__4__Impl rule__ForEachExpression__Group__5 )
            // InternalEcssLanguage.g:3010:2: rule__ForEachExpression__Group__4__Impl rule__ForEachExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__ForEachExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__4"


    // $ANTLR start "rule__ForEachExpression__Group__4__Impl"
    // InternalEcssLanguage.g:3017:1: rule__ForEachExpression__Group__4__Impl : ( ( rule__ForEachExpression__Alternatives_4 ) ) ;
    public final void rule__ForEachExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3021:1: ( ( ( rule__ForEachExpression__Alternatives_4 ) ) )
            // InternalEcssLanguage.g:3022:1: ( ( rule__ForEachExpression__Alternatives_4 ) )
            {
            // InternalEcssLanguage.g:3022:1: ( ( rule__ForEachExpression__Alternatives_4 ) )
            // InternalEcssLanguage.g:3023:2: ( rule__ForEachExpression__Alternatives_4 )
            {
             before(grammarAccess.getForEachExpressionAccess().getAlternatives_4()); 
            // InternalEcssLanguage.g:3024:2: ( rule__ForEachExpression__Alternatives_4 )
            // InternalEcssLanguage.g:3024:3: rule__ForEachExpression__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getForEachExpressionAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__4__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__5"
    // InternalEcssLanguage.g:3032:1: rule__ForEachExpression__Group__5 : rule__ForEachExpression__Group__5__Impl rule__ForEachExpression__Group__6 ;
    public final void rule__ForEachExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3036:1: ( rule__ForEachExpression__Group__5__Impl rule__ForEachExpression__Group__6 )
            // InternalEcssLanguage.g:3037:2: rule__ForEachExpression__Group__5__Impl rule__ForEachExpression__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ForEachExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__5"


    // $ANTLR start "rule__ForEachExpression__Group__5__Impl"
    // InternalEcssLanguage.g:3044:1: rule__ForEachExpression__Group__5__Impl : ( ( rule__ForEachExpression__Group_5__0 )? ) ;
    public final void rule__ForEachExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3048:1: ( ( ( rule__ForEachExpression__Group_5__0 )? ) )
            // InternalEcssLanguage.g:3049:1: ( ( rule__ForEachExpression__Group_5__0 )? )
            {
            // InternalEcssLanguage.g:3049:1: ( ( rule__ForEachExpression__Group_5__0 )? )
            // InternalEcssLanguage.g:3050:2: ( rule__ForEachExpression__Group_5__0 )?
            {
             before(grammarAccess.getForEachExpressionAccess().getGroup_5()); 
            // InternalEcssLanguage.g:3051:2: ( rule__ForEachExpression__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEcssLanguage.g:3051:3: rule__ForEachExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForEachExpression__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForEachExpressionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__5__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__6"
    // InternalEcssLanguage.g:3059:1: rule__ForEachExpression__Group__6 : rule__ForEachExpression__Group__6__Impl rule__ForEachExpression__Group__7 ;
    public final void rule__ForEachExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3063:1: ( rule__ForEachExpression__Group__6__Impl rule__ForEachExpression__Group__7 )
            // InternalEcssLanguage.g:3064:2: rule__ForEachExpression__Group__6__Impl rule__ForEachExpression__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__ForEachExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__6"


    // $ANTLR start "rule__ForEachExpression__Group__6__Impl"
    // InternalEcssLanguage.g:3071:1: rule__ForEachExpression__Group__6__Impl : ( '{' ) ;
    public final void rule__ForEachExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3075:1: ( ( '{' ) )
            // InternalEcssLanguage.g:3076:1: ( '{' )
            {
            // InternalEcssLanguage.g:3076:1: ( '{' )
            // InternalEcssLanguage.g:3077:2: '{'
            {
             before(grammarAccess.getForEachExpressionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__6__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__7"
    // InternalEcssLanguage.g:3086:1: rule__ForEachExpression__Group__7 : rule__ForEachExpression__Group__7__Impl rule__ForEachExpression__Group__8 ;
    public final void rule__ForEachExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3090:1: ( rule__ForEachExpression__Group__7__Impl rule__ForEachExpression__Group__8 )
            // InternalEcssLanguage.g:3091:2: rule__ForEachExpression__Group__7__Impl rule__ForEachExpression__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__ForEachExpression__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__7"


    // $ANTLR start "rule__ForEachExpression__Group__7__Impl"
    // InternalEcssLanguage.g:3098:1: rule__ForEachExpression__Group__7__Impl : ( ( rule__ForEachExpression__BodyAssignment_7 )* ) ;
    public final void rule__ForEachExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3102:1: ( ( ( rule__ForEachExpression__BodyAssignment_7 )* ) )
            // InternalEcssLanguage.g:3103:1: ( ( rule__ForEachExpression__BodyAssignment_7 )* )
            {
            // InternalEcssLanguage.g:3103:1: ( ( rule__ForEachExpression__BodyAssignment_7 )* )
            // InternalEcssLanguage.g:3104:2: ( rule__ForEachExpression__BodyAssignment_7 )*
            {
             before(grammarAccess.getForEachExpressionAccess().getBodyAssignment_7()); 
            // InternalEcssLanguage.g:3105:2: ( rule__ForEachExpression__BodyAssignment_7 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_STRING||LA34_0==31||LA34_0==33||(LA34_0>=37 && LA34_0<=38)||(LA34_0>=42 && LA34_0<=43)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEcssLanguage.g:3105:3: rule__ForEachExpression__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ForEachExpression__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getForEachExpressionAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__7__Impl"


    // $ANTLR start "rule__ForEachExpression__Group__8"
    // InternalEcssLanguage.g:3113:1: rule__ForEachExpression__Group__8 : rule__ForEachExpression__Group__8__Impl ;
    public final void rule__ForEachExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3117:1: ( rule__ForEachExpression__Group__8__Impl )
            // InternalEcssLanguage.g:3118:2: rule__ForEachExpression__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__8"


    // $ANTLR start "rule__ForEachExpression__Group__8__Impl"
    // InternalEcssLanguage.g:3124:1: rule__ForEachExpression__Group__8__Impl : ( '}' ) ;
    public final void rule__ForEachExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3128:1: ( ( '}' ) )
            // InternalEcssLanguage.g:3129:1: ( '}' )
            {
            // InternalEcssLanguage.g:3129:1: ( '}' )
            // InternalEcssLanguage.g:3130:2: '}'
            {
             before(grammarAccess.getForEachExpressionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group__8__Impl"


    // $ANTLR start "rule__ForEachExpression__Group_5__0"
    // InternalEcssLanguage.g:3140:1: rule__ForEachExpression__Group_5__0 : rule__ForEachExpression__Group_5__0__Impl rule__ForEachExpression__Group_5__1 ;
    public final void rule__ForEachExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3144:1: ( rule__ForEachExpression__Group_5__0__Impl rule__ForEachExpression__Group_5__1 )
            // InternalEcssLanguage.g:3145:2: rule__ForEachExpression__Group_5__0__Impl rule__ForEachExpression__Group_5__1
            {
            pushFollow(FOLLOW_23);
            rule__ForEachExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group_5__0"


    // $ANTLR start "rule__ForEachExpression__Group_5__0__Impl"
    // InternalEcssLanguage.g:3152:1: rule__ForEachExpression__Group_5__0__Impl : ( 'join' ) ;
    public final void rule__ForEachExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3156:1: ( ( 'join' ) )
            // InternalEcssLanguage.g:3157:1: ( 'join' )
            {
            // InternalEcssLanguage.g:3157:1: ( 'join' )
            // InternalEcssLanguage.g:3158:2: 'join'
            {
             before(grammarAccess.getForEachExpressionAccess().getJoinKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getJoinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group_5__0__Impl"


    // $ANTLR start "rule__ForEachExpression__Group_5__1"
    // InternalEcssLanguage.g:3167:1: rule__ForEachExpression__Group_5__1 : rule__ForEachExpression__Group_5__1__Impl ;
    public final void rule__ForEachExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3171:1: ( rule__ForEachExpression__Group_5__1__Impl )
            // InternalEcssLanguage.g:3172:2: rule__ForEachExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForEachExpression__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group_5__1"


    // $ANTLR start "rule__ForEachExpression__Group_5__1__Impl"
    // InternalEcssLanguage.g:3178:1: rule__ForEachExpression__Group_5__1__Impl : ( ( ( rule__ForEachExpression__JoinAssignment_5_1 ) ) ( ( rule__ForEachExpression__JoinAssignment_5_1 )* ) ) ;
    public final void rule__ForEachExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3182:1: ( ( ( ( rule__ForEachExpression__JoinAssignment_5_1 ) ) ( ( rule__ForEachExpression__JoinAssignment_5_1 )* ) ) )
            // InternalEcssLanguage.g:3183:1: ( ( ( rule__ForEachExpression__JoinAssignment_5_1 ) ) ( ( rule__ForEachExpression__JoinAssignment_5_1 )* ) )
            {
            // InternalEcssLanguage.g:3183:1: ( ( ( rule__ForEachExpression__JoinAssignment_5_1 ) ) ( ( rule__ForEachExpression__JoinAssignment_5_1 )* ) )
            // InternalEcssLanguage.g:3184:2: ( ( rule__ForEachExpression__JoinAssignment_5_1 ) ) ( ( rule__ForEachExpression__JoinAssignment_5_1 )* )
            {
            // InternalEcssLanguage.g:3184:2: ( ( rule__ForEachExpression__JoinAssignment_5_1 ) )
            // InternalEcssLanguage.g:3185:3: ( rule__ForEachExpression__JoinAssignment_5_1 )
            {
             before(grammarAccess.getForEachExpressionAccess().getJoinAssignment_5_1()); 
            // InternalEcssLanguage.g:3186:3: ( rule__ForEachExpression__JoinAssignment_5_1 )
            // InternalEcssLanguage.g:3186:4: rule__ForEachExpression__JoinAssignment_5_1
            {
            pushFollow(FOLLOW_25);
            rule__ForEachExpression__JoinAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getForEachExpressionAccess().getJoinAssignment_5_1()); 

            }

            // InternalEcssLanguage.g:3189:2: ( ( rule__ForEachExpression__JoinAssignment_5_1 )* )
            // InternalEcssLanguage.g:3190:3: ( rule__ForEachExpression__JoinAssignment_5_1 )*
            {
             before(grammarAccess.getForEachExpressionAccess().getJoinAssignment_5_1()); 
            // InternalEcssLanguage.g:3191:3: ( rule__ForEachExpression__JoinAssignment_5_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING||LA35_0==31||LA35_0==33||(LA35_0>=37 && LA35_0<=38)||(LA35_0>=42 && LA35_0<=43)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEcssLanguage.g:3191:4: rule__ForEachExpression__JoinAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ForEachExpression__JoinAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getForEachExpressionAccess().getJoinAssignment_5_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__Group_5__1__Impl"


    // $ANTLR start "rule__IfExpression__Group__0"
    // InternalEcssLanguage.g:3201:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3205:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalEcssLanguage.g:3206:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__IfExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0"


    // $ANTLR start "rule__IfExpression__Group__0__Impl"
    // InternalEcssLanguage.g:3213:1: rule__IfExpression__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3217:1: ( ( 'if' ) )
            // InternalEcssLanguage.g:3218:1: ( 'if' )
            {
            // InternalEcssLanguage.g:3218:1: ( 'if' )
            // InternalEcssLanguage.g:3219:2: 'if'
            {
             before(grammarAccess.getIfExpressionAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0__Impl"


    // $ANTLR start "rule__IfExpression__Group__1"
    // InternalEcssLanguage.g:3228:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3232:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalEcssLanguage.g:3233:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__IfExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__1"


    // $ANTLR start "rule__IfExpression__Group__1__Impl"
    // InternalEcssLanguage.g:3240:1: rule__IfExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3244:1: ( ( '(' ) )
            // InternalEcssLanguage.g:3245:1: ( '(' )
            {
            // InternalEcssLanguage.g:3245:1: ( '(' )
            // InternalEcssLanguage.g:3246:2: '('
            {
             before(grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__1__Impl"


    // $ANTLR start "rule__IfExpression__Group__2"
    // InternalEcssLanguage.g:3255:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3259:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalEcssLanguage.g:3260:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__IfExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__2"


    // $ANTLR start "rule__IfExpression__Group__2__Impl"
    // InternalEcssLanguage.g:3267:1: rule__IfExpression__Group__2__Impl : ( ( rule__IfExpression__ValAssignment_2 ) ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3271:1: ( ( ( rule__IfExpression__ValAssignment_2 ) ) )
            // InternalEcssLanguage.g:3272:1: ( ( rule__IfExpression__ValAssignment_2 ) )
            {
            // InternalEcssLanguage.g:3272:1: ( ( rule__IfExpression__ValAssignment_2 ) )
            // InternalEcssLanguage.g:3273:2: ( rule__IfExpression__ValAssignment_2 )
            {
             before(grammarAccess.getIfExpressionAccess().getValAssignment_2()); 
            // InternalEcssLanguage.g:3274:2: ( rule__IfExpression__ValAssignment_2 )
            // InternalEcssLanguage.g:3274:3: rule__IfExpression__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfExpressionAccess().getValAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__2__Impl"


    // $ANTLR start "rule__IfExpression__Group__3"
    // InternalEcssLanguage.g:3282:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3286:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalEcssLanguage.g:3287:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IfExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__3"


    // $ANTLR start "rule__IfExpression__Group__3__Impl"
    // InternalEcssLanguage.g:3294:1: rule__IfExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3298:1: ( ( ')' ) )
            // InternalEcssLanguage.g:3299:1: ( ')' )
            {
            // InternalEcssLanguage.g:3299:1: ( ')' )
            // InternalEcssLanguage.g:3300:2: ')'
            {
             before(grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__3__Impl"


    // $ANTLR start "rule__IfExpression__Group__4"
    // InternalEcssLanguage.g:3309:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3313:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalEcssLanguage.g:3314:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__4"


    // $ANTLR start "rule__IfExpression__Group__4__Impl"
    // InternalEcssLanguage.g:3321:1: rule__IfExpression__Group__4__Impl : ( '{' ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3325:1: ( ( '{' ) )
            // InternalEcssLanguage.g:3326:1: ( '{' )
            {
            // InternalEcssLanguage.g:3326:1: ( '{' )
            // InternalEcssLanguage.g:3327:2: '{'
            {
             before(grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__4__Impl"


    // $ANTLR start "rule__IfExpression__Group__5"
    // InternalEcssLanguage.g:3336:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3340:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalEcssLanguage.g:3341:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__5"


    // $ANTLR start "rule__IfExpression__Group__5__Impl"
    // InternalEcssLanguage.g:3348:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__ThenAssignment_5 )* ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3352:1: ( ( ( rule__IfExpression__ThenAssignment_5 )* ) )
            // InternalEcssLanguage.g:3353:1: ( ( rule__IfExpression__ThenAssignment_5 )* )
            {
            // InternalEcssLanguage.g:3353:1: ( ( rule__IfExpression__ThenAssignment_5 )* )
            // InternalEcssLanguage.g:3354:2: ( rule__IfExpression__ThenAssignment_5 )*
            {
             before(grammarAccess.getIfExpressionAccess().getThenAssignment_5()); 
            // InternalEcssLanguage.g:3355:2: ( rule__IfExpression__ThenAssignment_5 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING||LA36_0==31||LA36_0==33||(LA36_0>=37 && LA36_0<=38)||(LA36_0>=42 && LA36_0<=43)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEcssLanguage.g:3355:3: rule__IfExpression__ThenAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__IfExpression__ThenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getIfExpressionAccess().getThenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__5__Impl"


    // $ANTLR start "rule__IfExpression__Group__6"
    // InternalEcssLanguage.g:3363:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7 ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3367:1: ( rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7 )
            // InternalEcssLanguage.g:3368:2: rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__IfExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__6"


    // $ANTLR start "rule__IfExpression__Group__6__Impl"
    // InternalEcssLanguage.g:3375:1: rule__IfExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3379:1: ( ( '}' ) )
            // InternalEcssLanguage.g:3380:1: ( '}' )
            {
            // InternalEcssLanguage.g:3380:1: ( '}' )
            // InternalEcssLanguage.g:3381:2: '}'
            {
             before(grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__6__Impl"


    // $ANTLR start "rule__IfExpression__Group__7"
    // InternalEcssLanguage.g:3390:1: rule__IfExpression__Group__7 : rule__IfExpression__Group__7__Impl ;
    public final void rule__IfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3394:1: ( rule__IfExpression__Group__7__Impl )
            // InternalEcssLanguage.g:3395:2: rule__IfExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__7"


    // $ANTLR start "rule__IfExpression__Group__7__Impl"
    // InternalEcssLanguage.g:3401:1: rule__IfExpression__Group__7__Impl : ( ( rule__IfExpression__Group_7__0 )? ) ;
    public final void rule__IfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3405:1: ( ( ( rule__IfExpression__Group_7__0 )? ) )
            // InternalEcssLanguage.g:3406:1: ( ( rule__IfExpression__Group_7__0 )? )
            {
            // InternalEcssLanguage.g:3406:1: ( ( rule__IfExpression__Group_7__0 )? )
            // InternalEcssLanguage.g:3407:2: ( rule__IfExpression__Group_7__0 )?
            {
             before(grammarAccess.getIfExpressionAccess().getGroup_7()); 
            // InternalEcssLanguage.g:3408:2: ( rule__IfExpression__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEcssLanguage.g:3408:3: rule__IfExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfExpression__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfExpressionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__7__Impl"


    // $ANTLR start "rule__IfExpression__Group_7__0"
    // InternalEcssLanguage.g:3417:1: rule__IfExpression__Group_7__0 : rule__IfExpression__Group_7__0__Impl rule__IfExpression__Group_7__1 ;
    public final void rule__IfExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3421:1: ( rule__IfExpression__Group_7__0__Impl rule__IfExpression__Group_7__1 )
            // InternalEcssLanguage.g:3422:2: rule__IfExpression__Group_7__0__Impl rule__IfExpression__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__IfExpression__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__0"


    // $ANTLR start "rule__IfExpression__Group_7__0__Impl"
    // InternalEcssLanguage.g:3429:1: rule__IfExpression__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__IfExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3433:1: ( ( 'else' ) )
            // InternalEcssLanguage.g:3434:1: ( 'else' )
            {
            // InternalEcssLanguage.g:3434:1: ( 'else' )
            // InternalEcssLanguage.g:3435:2: 'else'
            {
             before(grammarAccess.getIfExpressionAccess().getElseKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getElseKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__0__Impl"


    // $ANTLR start "rule__IfExpression__Group_7__1"
    // InternalEcssLanguage.g:3444:1: rule__IfExpression__Group_7__1 : rule__IfExpression__Group_7__1__Impl rule__IfExpression__Group_7__2 ;
    public final void rule__IfExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3448:1: ( rule__IfExpression__Group_7__1__Impl rule__IfExpression__Group_7__2 )
            // InternalEcssLanguage.g:3449:2: rule__IfExpression__Group_7__1__Impl rule__IfExpression__Group_7__2
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__1"


    // $ANTLR start "rule__IfExpression__Group_7__1__Impl"
    // InternalEcssLanguage.g:3456:1: rule__IfExpression__Group_7__1__Impl : ( '{' ) ;
    public final void rule__IfExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3460:1: ( ( '{' ) )
            // InternalEcssLanguage.g:3461:1: ( '{' )
            {
            // InternalEcssLanguage.g:3461:1: ( '{' )
            // InternalEcssLanguage.g:3462:2: '{'
            {
             before(grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__1__Impl"


    // $ANTLR start "rule__IfExpression__Group_7__2"
    // InternalEcssLanguage.g:3471:1: rule__IfExpression__Group_7__2 : rule__IfExpression__Group_7__2__Impl rule__IfExpression__Group_7__3 ;
    public final void rule__IfExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3475:1: ( rule__IfExpression__Group_7__2__Impl rule__IfExpression__Group_7__3 )
            // InternalEcssLanguage.g:3476:2: rule__IfExpression__Group_7__2__Impl rule__IfExpression__Group_7__3
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__2"


    // $ANTLR start "rule__IfExpression__Group_7__2__Impl"
    // InternalEcssLanguage.g:3483:1: rule__IfExpression__Group_7__2__Impl : ( ( rule__IfExpression__ElseAssignment_7_2 )* ) ;
    public final void rule__IfExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3487:1: ( ( ( rule__IfExpression__ElseAssignment_7_2 )* ) )
            // InternalEcssLanguage.g:3488:1: ( ( rule__IfExpression__ElseAssignment_7_2 )* )
            {
            // InternalEcssLanguage.g:3488:1: ( ( rule__IfExpression__ElseAssignment_7_2 )* )
            // InternalEcssLanguage.g:3489:2: ( rule__IfExpression__ElseAssignment_7_2 )*
            {
             before(grammarAccess.getIfExpressionAccess().getElseAssignment_7_2()); 
            // InternalEcssLanguage.g:3490:2: ( rule__IfExpression__ElseAssignment_7_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_STRING||LA38_0==31||LA38_0==33||(LA38_0>=37 && LA38_0<=38)||(LA38_0>=42 && LA38_0<=43)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEcssLanguage.g:3490:3: rule__IfExpression__ElseAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__IfExpression__ElseAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getIfExpressionAccess().getElseAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__2__Impl"


    // $ANTLR start "rule__IfExpression__Group_7__3"
    // InternalEcssLanguage.g:3498:1: rule__IfExpression__Group_7__3 : rule__IfExpression__Group_7__3__Impl ;
    public final void rule__IfExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3502:1: ( rule__IfExpression__Group_7__3__Impl )
            // InternalEcssLanguage.g:3503:2: rule__IfExpression__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__3"


    // $ANTLR start "rule__IfExpression__Group_7__3__Impl"
    // InternalEcssLanguage.g:3509:1: rule__IfExpression__Group_7__3__Impl : ( '}' ) ;
    public final void rule__IfExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3513:1: ( ( '}' ) )
            // InternalEcssLanguage.g:3514:1: ( '}' )
            {
            // InternalEcssLanguage.g:3514:1: ( '}' )
            // InternalEcssLanguage.g:3515:2: '}'
            {
             before(grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_7__3__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__0"
    // InternalEcssLanguage.g:3525:1: rule__TemplateFunctionCall__Group__0 : rule__TemplateFunctionCall__Group__0__Impl rule__TemplateFunctionCall__Group__1 ;
    public final void rule__TemplateFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3529:1: ( rule__TemplateFunctionCall__Group__0__Impl rule__TemplateFunctionCall__Group__1 )
            // InternalEcssLanguage.g:3530:2: rule__TemplateFunctionCall__Group__0__Impl rule__TemplateFunctionCall__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TemplateFunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__0"


    // $ANTLR start "rule__TemplateFunctionCall__Group__0__Impl"
    // InternalEcssLanguage.g:3537:1: rule__TemplateFunctionCall__Group__0__Impl : ( '$' ) ;
    public final void rule__TemplateFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3541:1: ( ( '$' ) )
            // InternalEcssLanguage.g:3542:1: ( '$' )
            {
            // InternalEcssLanguage.g:3542:1: ( '$' )
            // InternalEcssLanguage.g:3543:2: '$'
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getDollarSignKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__1"
    // InternalEcssLanguage.g:3552:1: rule__TemplateFunctionCall__Group__1 : rule__TemplateFunctionCall__Group__1__Impl rule__TemplateFunctionCall__Group__2 ;
    public final void rule__TemplateFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3556:1: ( rule__TemplateFunctionCall__Group__1__Impl rule__TemplateFunctionCall__Group__2 )
            // InternalEcssLanguage.g:3557:2: rule__TemplateFunctionCall__Group__1__Impl rule__TemplateFunctionCall__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__TemplateFunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__1"


    // $ANTLR start "rule__TemplateFunctionCall__Group__1__Impl"
    // InternalEcssLanguage.g:3564:1: rule__TemplateFunctionCall__Group__1__Impl : ( ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )? ) ;
    public final void rule__TemplateFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3568:1: ( ( ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )? ) )
            // InternalEcssLanguage.g:3569:1: ( ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )? )
            {
            // InternalEcssLanguage.g:3569:1: ( ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )? )
            // InternalEcssLanguage.g:3570:2: ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )?
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceAssignment_1()); 
            // InternalEcssLanguage.g:3571:2: ( rule__TemplateFunctionCall__IsReferenceAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalEcssLanguage.g:3571:3: rule__TemplateFunctionCall__IsReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateFunctionCall__IsReferenceAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__2"
    // InternalEcssLanguage.g:3579:1: rule__TemplateFunctionCall__Group__2 : rule__TemplateFunctionCall__Group__2__Impl rule__TemplateFunctionCall__Group__3 ;
    public final void rule__TemplateFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3583:1: ( rule__TemplateFunctionCall__Group__2__Impl rule__TemplateFunctionCall__Group__3 )
            // InternalEcssLanguage.g:3584:2: rule__TemplateFunctionCall__Group__2__Impl rule__TemplateFunctionCall__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__TemplateFunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__2"


    // $ANTLR start "rule__TemplateFunctionCall__Group__2__Impl"
    // InternalEcssLanguage.g:3591:1: rule__TemplateFunctionCall__Group__2__Impl : ( ( rule__TemplateFunctionCall__NameAssignment_2 ) ) ;
    public final void rule__TemplateFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3595:1: ( ( ( rule__TemplateFunctionCall__NameAssignment_2 ) ) )
            // InternalEcssLanguage.g:3596:1: ( ( rule__TemplateFunctionCall__NameAssignment_2 ) )
            {
            // InternalEcssLanguage.g:3596:1: ( ( rule__TemplateFunctionCall__NameAssignment_2 ) )
            // InternalEcssLanguage.g:3597:2: ( rule__TemplateFunctionCall__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getNameAssignment_2()); 
            // InternalEcssLanguage.g:3598:2: ( rule__TemplateFunctionCall__NameAssignment_2 )
            // InternalEcssLanguage.g:3598:3: rule__TemplateFunctionCall__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateFunctionCallAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__3"
    // InternalEcssLanguage.g:3606:1: rule__TemplateFunctionCall__Group__3 : rule__TemplateFunctionCall__Group__3__Impl rule__TemplateFunctionCall__Group__4 ;
    public final void rule__TemplateFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3610:1: ( rule__TemplateFunctionCall__Group__3__Impl rule__TemplateFunctionCall__Group__4 )
            // InternalEcssLanguage.g:3611:2: rule__TemplateFunctionCall__Group__3__Impl rule__TemplateFunctionCall__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__TemplateFunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__3"


    // $ANTLR start "rule__TemplateFunctionCall__Group__3__Impl"
    // InternalEcssLanguage.g:3618:1: rule__TemplateFunctionCall__Group__3__Impl : ( '(' ) ;
    public final void rule__TemplateFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3622:1: ( ( '(' ) )
            // InternalEcssLanguage.g:3623:1: ( '(' )
            {
            // InternalEcssLanguage.g:3623:1: ( '(' )
            // InternalEcssLanguage.g:3624:2: '('
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getLeftParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__4"
    // InternalEcssLanguage.g:3633:1: rule__TemplateFunctionCall__Group__4 : rule__TemplateFunctionCall__Group__4__Impl rule__TemplateFunctionCall__Group__5 ;
    public final void rule__TemplateFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3637:1: ( rule__TemplateFunctionCall__Group__4__Impl rule__TemplateFunctionCall__Group__5 )
            // InternalEcssLanguage.g:3638:2: rule__TemplateFunctionCall__Group__4__Impl rule__TemplateFunctionCall__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__TemplateFunctionCall__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__4"


    // $ANTLR start "rule__TemplateFunctionCall__Group__4__Impl"
    // InternalEcssLanguage.g:3645:1: rule__TemplateFunctionCall__Group__4__Impl : ( ( rule__TemplateFunctionCall__Group_4__0 )? ) ;
    public final void rule__TemplateFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3649:1: ( ( ( rule__TemplateFunctionCall__Group_4__0 )? ) )
            // InternalEcssLanguage.g:3650:1: ( ( rule__TemplateFunctionCall__Group_4__0 )? )
            {
            // InternalEcssLanguage.g:3650:1: ( ( rule__TemplateFunctionCall__Group_4__0 )? )
            // InternalEcssLanguage.g:3651:2: ( rule__TemplateFunctionCall__Group_4__0 )?
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getGroup_4()); 
            // InternalEcssLanguage.g:3652:2: ( rule__TemplateFunctionCall__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||(LA40_0>=37 && LA40_0<=38)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEcssLanguage.g:3652:3: rule__TemplateFunctionCall__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateFunctionCall__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateFunctionCallAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group__5"
    // InternalEcssLanguage.g:3660:1: rule__TemplateFunctionCall__Group__5 : rule__TemplateFunctionCall__Group__5__Impl ;
    public final void rule__TemplateFunctionCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3664:1: ( rule__TemplateFunctionCall__Group__5__Impl )
            // InternalEcssLanguage.g:3665:2: rule__TemplateFunctionCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__5"


    // $ANTLR start "rule__TemplateFunctionCall__Group__5__Impl"
    // InternalEcssLanguage.g:3671:1: rule__TemplateFunctionCall__Group__5__Impl : ( ')' ) ;
    public final void rule__TemplateFunctionCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3675:1: ( ( ')' ) )
            // InternalEcssLanguage.g:3676:1: ( ')' )
            {
            // InternalEcssLanguage.g:3676:1: ( ')' )
            // InternalEcssLanguage.g:3677:2: ')'
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group__5__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4__0"
    // InternalEcssLanguage.g:3687:1: rule__TemplateFunctionCall__Group_4__0 : rule__TemplateFunctionCall__Group_4__0__Impl rule__TemplateFunctionCall__Group_4__1 ;
    public final void rule__TemplateFunctionCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3691:1: ( rule__TemplateFunctionCall__Group_4__0__Impl rule__TemplateFunctionCall__Group_4__1 )
            // InternalEcssLanguage.g:3692:2: rule__TemplateFunctionCall__Group_4__0__Impl rule__TemplateFunctionCall__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__TemplateFunctionCall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4__0"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4__0__Impl"
    // InternalEcssLanguage.g:3699:1: rule__TemplateFunctionCall__Group_4__0__Impl : ( ( rule__TemplateFunctionCall__ParValueAssignment_4_0 ) ) ;
    public final void rule__TemplateFunctionCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3703:1: ( ( ( rule__TemplateFunctionCall__ParValueAssignment_4_0 ) ) )
            // InternalEcssLanguage.g:3704:1: ( ( rule__TemplateFunctionCall__ParValueAssignment_4_0 ) )
            {
            // InternalEcssLanguage.g:3704:1: ( ( rule__TemplateFunctionCall__ParValueAssignment_4_0 ) )
            // InternalEcssLanguage.g:3705:2: ( rule__TemplateFunctionCall__ParValueAssignment_4_0 )
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getParValueAssignment_4_0()); 
            // InternalEcssLanguage.g:3706:2: ( rule__TemplateFunctionCall__ParValueAssignment_4_0 )
            // InternalEcssLanguage.g:3706:3: rule__TemplateFunctionCall__ParValueAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__ParValueAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateFunctionCallAccess().getParValueAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4__0__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4__1"
    // InternalEcssLanguage.g:3714:1: rule__TemplateFunctionCall__Group_4__1 : rule__TemplateFunctionCall__Group_4__1__Impl ;
    public final void rule__TemplateFunctionCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3718:1: ( rule__TemplateFunctionCall__Group_4__1__Impl )
            // InternalEcssLanguage.g:3719:2: rule__TemplateFunctionCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4__1"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4__1__Impl"
    // InternalEcssLanguage.g:3725:1: rule__TemplateFunctionCall__Group_4__1__Impl : ( ( rule__TemplateFunctionCall__Group_4_1__0 )* ) ;
    public final void rule__TemplateFunctionCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3729:1: ( ( ( rule__TemplateFunctionCall__Group_4_1__0 )* ) )
            // InternalEcssLanguage.g:3730:1: ( ( rule__TemplateFunctionCall__Group_4_1__0 )* )
            {
            // InternalEcssLanguage.g:3730:1: ( ( rule__TemplateFunctionCall__Group_4_1__0 )* )
            // InternalEcssLanguage.g:3731:2: ( rule__TemplateFunctionCall__Group_4_1__0 )*
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getGroup_4_1()); 
            // InternalEcssLanguage.g:3732:2: ( rule__TemplateFunctionCall__Group_4_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalEcssLanguage.g:3732:3: rule__TemplateFunctionCall__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TemplateFunctionCall__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getTemplateFunctionCallAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4__1__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4_1__0"
    // InternalEcssLanguage.g:3741:1: rule__TemplateFunctionCall__Group_4_1__0 : rule__TemplateFunctionCall__Group_4_1__0__Impl rule__TemplateFunctionCall__Group_4_1__1 ;
    public final void rule__TemplateFunctionCall__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3745:1: ( rule__TemplateFunctionCall__Group_4_1__0__Impl rule__TemplateFunctionCall__Group_4_1__1 )
            // InternalEcssLanguage.g:3746:2: rule__TemplateFunctionCall__Group_4_1__0__Impl rule__TemplateFunctionCall__Group_4_1__1
            {
            pushFollow(FOLLOW_34);
            rule__TemplateFunctionCall__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4_1__0"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4_1__0__Impl"
    // InternalEcssLanguage.g:3753:1: rule__TemplateFunctionCall__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateFunctionCall__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3757:1: ( ( ',' ) )
            // InternalEcssLanguage.g:3758:1: ( ',' )
            {
            // InternalEcssLanguage.g:3758:1: ( ',' )
            // InternalEcssLanguage.g:3759:2: ','
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getCommaKeyword_4_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4_1__0__Impl"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4_1__1"
    // InternalEcssLanguage.g:3768:1: rule__TemplateFunctionCall__Group_4_1__1 : rule__TemplateFunctionCall__Group_4_1__1__Impl ;
    public final void rule__TemplateFunctionCall__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3772:1: ( rule__TemplateFunctionCall__Group_4_1__1__Impl )
            // InternalEcssLanguage.g:3773:2: rule__TemplateFunctionCall__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4_1__1"


    // $ANTLR start "rule__TemplateFunctionCall__Group_4_1__1__Impl"
    // InternalEcssLanguage.g:3779:1: rule__TemplateFunctionCall__Group_4_1__1__Impl : ( ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 ) ) ;
    public final void rule__TemplateFunctionCall__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3783:1: ( ( ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 ) ) )
            // InternalEcssLanguage.g:3784:1: ( ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 ) )
            {
            // InternalEcssLanguage.g:3784:1: ( ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 ) )
            // InternalEcssLanguage.g:3785:2: ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 )
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getParValueAssignment_4_1_1()); 
            // InternalEcssLanguage.g:3786:2: ( rule__TemplateFunctionCall__ParValueAssignment_4_1_1 )
            // InternalEcssLanguage.g:3786:3: rule__TemplateFunctionCall__ParValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateFunctionCall__ParValueAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateFunctionCallAccess().getParValueAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__Group_4_1__1__Impl"


    // $ANTLR start "rule__SlotCall__Group__0"
    // InternalEcssLanguage.g:3795:1: rule__SlotCall__Group__0 : rule__SlotCall__Group__0__Impl rule__SlotCall__Group__1 ;
    public final void rule__SlotCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3799:1: ( rule__SlotCall__Group__0__Impl rule__SlotCall__Group__1 )
            // InternalEcssLanguage.g:3800:2: rule__SlotCall__Group__0__Impl rule__SlotCall__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SlotCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__0"


    // $ANTLR start "rule__SlotCall__Group__0__Impl"
    // InternalEcssLanguage.g:3807:1: rule__SlotCall__Group__0__Impl : ( '\\u00A7' ) ;
    public final void rule__SlotCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3811:1: ( ( '\\u00A7' ) )
            // InternalEcssLanguage.g:3812:1: ( '\\u00A7' )
            {
            // InternalEcssLanguage.g:3812:1: ( '\\u00A7' )
            // InternalEcssLanguage.g:3813:2: '\\u00A7'
            {
             before(grammarAccess.getSlotCallAccess().getSectionSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getSectionSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__0__Impl"


    // $ANTLR start "rule__SlotCall__Group__1"
    // InternalEcssLanguage.g:3822:1: rule__SlotCall__Group__1 : rule__SlotCall__Group__1__Impl rule__SlotCall__Group__2 ;
    public final void rule__SlotCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3826:1: ( rule__SlotCall__Group__1__Impl rule__SlotCall__Group__2 )
            // InternalEcssLanguage.g:3827:2: rule__SlotCall__Group__1__Impl rule__SlotCall__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SlotCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__1"


    // $ANTLR start "rule__SlotCall__Group__1__Impl"
    // InternalEcssLanguage.g:3834:1: rule__SlotCall__Group__1__Impl : ( ( rule__SlotCall__NameAssignment_1 ) ) ;
    public final void rule__SlotCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3838:1: ( ( ( rule__SlotCall__NameAssignment_1 ) ) )
            // InternalEcssLanguage.g:3839:1: ( ( rule__SlotCall__NameAssignment_1 ) )
            {
            // InternalEcssLanguage.g:3839:1: ( ( rule__SlotCall__NameAssignment_1 ) )
            // InternalEcssLanguage.g:3840:2: ( rule__SlotCall__NameAssignment_1 )
            {
             before(grammarAccess.getSlotCallAccess().getNameAssignment_1()); 
            // InternalEcssLanguage.g:3841:2: ( rule__SlotCall__NameAssignment_1 )
            // InternalEcssLanguage.g:3841:3: rule__SlotCall__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotCallAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__1__Impl"


    // $ANTLR start "rule__SlotCall__Group__2"
    // InternalEcssLanguage.g:3849:1: rule__SlotCall__Group__2 : rule__SlotCall__Group__2__Impl ;
    public final void rule__SlotCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3853:1: ( rule__SlotCall__Group__2__Impl )
            // InternalEcssLanguage.g:3854:2: rule__SlotCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__2"


    // $ANTLR start "rule__SlotCall__Group__2__Impl"
    // InternalEcssLanguage.g:3860:1: rule__SlotCall__Group__2__Impl : ( ( rule__SlotCall__Group_2__0 )? ) ;
    public final void rule__SlotCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3864:1: ( ( ( rule__SlotCall__Group_2__0 )? ) )
            // InternalEcssLanguage.g:3865:1: ( ( rule__SlotCall__Group_2__0 )? )
            {
            // InternalEcssLanguage.g:3865:1: ( ( rule__SlotCall__Group_2__0 )? )
            // InternalEcssLanguage.g:3866:2: ( rule__SlotCall__Group_2__0 )?
            {
             before(grammarAccess.getSlotCallAccess().getGroup_2()); 
            // InternalEcssLanguage.g:3867:2: ( rule__SlotCall__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEcssLanguage.g:3867:3: rule__SlotCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SlotCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlotCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group__2__Impl"


    // $ANTLR start "rule__SlotCall__Group_2__0"
    // InternalEcssLanguage.g:3876:1: rule__SlotCall__Group_2__0 : rule__SlotCall__Group_2__0__Impl rule__SlotCall__Group_2__1 ;
    public final void rule__SlotCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3880:1: ( rule__SlotCall__Group_2__0__Impl rule__SlotCall__Group_2__1 )
            // InternalEcssLanguage.g:3881:2: rule__SlotCall__Group_2__0__Impl rule__SlotCall__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__SlotCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__0"


    // $ANTLR start "rule__SlotCall__Group_2__0__Impl"
    // InternalEcssLanguage.g:3888:1: rule__SlotCall__Group_2__0__Impl : ( '[' ) ;
    public final void rule__SlotCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3892:1: ( ( '[' ) )
            // InternalEcssLanguage.g:3893:1: ( '[' )
            {
            // InternalEcssLanguage.g:3893:1: ( '[' )
            // InternalEcssLanguage.g:3894:2: '['
            {
             before(grammarAccess.getSlotCallAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__0__Impl"


    // $ANTLR start "rule__SlotCall__Group_2__1"
    // InternalEcssLanguage.g:3903:1: rule__SlotCall__Group_2__1 : rule__SlotCall__Group_2__1__Impl rule__SlotCall__Group_2__2 ;
    public final void rule__SlotCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3907:1: ( rule__SlotCall__Group_2__1__Impl rule__SlotCall__Group_2__2 )
            // InternalEcssLanguage.g:3908:2: rule__SlotCall__Group_2__1__Impl rule__SlotCall__Group_2__2
            {
            pushFollow(FOLLOW_36);
            rule__SlotCall__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__1"


    // $ANTLR start "rule__SlotCall__Group_2__1__Impl"
    // InternalEcssLanguage.g:3915:1: rule__SlotCall__Group_2__1__Impl : ( ( rule__SlotCall__MinValueAssignment_2_1 ) ) ;
    public final void rule__SlotCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3919:1: ( ( ( rule__SlotCall__MinValueAssignment_2_1 ) ) )
            // InternalEcssLanguage.g:3920:1: ( ( rule__SlotCall__MinValueAssignment_2_1 ) )
            {
            // InternalEcssLanguage.g:3920:1: ( ( rule__SlotCall__MinValueAssignment_2_1 ) )
            // InternalEcssLanguage.g:3921:2: ( rule__SlotCall__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getSlotCallAccess().getMinValueAssignment_2_1()); 
            // InternalEcssLanguage.g:3922:2: ( rule__SlotCall__MinValueAssignment_2_1 )
            // InternalEcssLanguage.g:3922:3: rule__SlotCall__MinValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__MinValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotCallAccess().getMinValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__1__Impl"


    // $ANTLR start "rule__SlotCall__Group_2__2"
    // InternalEcssLanguage.g:3930:1: rule__SlotCall__Group_2__2 : rule__SlotCall__Group_2__2__Impl rule__SlotCall__Group_2__3 ;
    public final void rule__SlotCall__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3934:1: ( rule__SlotCall__Group_2__2__Impl rule__SlotCall__Group_2__3 )
            // InternalEcssLanguage.g:3935:2: rule__SlotCall__Group_2__2__Impl rule__SlotCall__Group_2__3
            {
            pushFollow(FOLLOW_37);
            rule__SlotCall__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__2"


    // $ANTLR start "rule__SlotCall__Group_2__2__Impl"
    // InternalEcssLanguage.g:3942:1: rule__SlotCall__Group_2__2__Impl : ( ( rule__SlotCall__Group_2_2__0 ) ) ;
    public final void rule__SlotCall__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3946:1: ( ( ( rule__SlotCall__Group_2_2__0 ) ) )
            // InternalEcssLanguage.g:3947:1: ( ( rule__SlotCall__Group_2_2__0 ) )
            {
            // InternalEcssLanguage.g:3947:1: ( ( rule__SlotCall__Group_2_2__0 ) )
            // InternalEcssLanguage.g:3948:2: ( rule__SlotCall__Group_2_2__0 )
            {
             before(grammarAccess.getSlotCallAccess().getGroup_2_2()); 
            // InternalEcssLanguage.g:3949:2: ( rule__SlotCall__Group_2_2__0 )
            // InternalEcssLanguage.g:3949:3: rule__SlotCall__Group_2_2__0
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSlotCallAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__2__Impl"


    // $ANTLR start "rule__SlotCall__Group_2__3"
    // InternalEcssLanguage.g:3957:1: rule__SlotCall__Group_2__3 : rule__SlotCall__Group_2__3__Impl ;
    public final void rule__SlotCall__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3961:1: ( rule__SlotCall__Group_2__3__Impl )
            // InternalEcssLanguage.g:3962:2: rule__SlotCall__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__3"


    // $ANTLR start "rule__SlotCall__Group_2__3__Impl"
    // InternalEcssLanguage.g:3968:1: rule__SlotCall__Group_2__3__Impl : ( ']' ) ;
    public final void rule__SlotCall__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3972:1: ( ( ']' ) )
            // InternalEcssLanguage.g:3973:1: ( ']' )
            {
            // InternalEcssLanguage.g:3973:1: ( ']' )
            // InternalEcssLanguage.g:3974:2: ']'
            {
             before(grammarAccess.getSlotCallAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2__3__Impl"


    // $ANTLR start "rule__SlotCall__Group_2_2__0"
    // InternalEcssLanguage.g:3984:1: rule__SlotCall__Group_2_2__0 : rule__SlotCall__Group_2_2__0__Impl rule__SlotCall__Group_2_2__1 ;
    public final void rule__SlotCall__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:3988:1: ( rule__SlotCall__Group_2_2__0__Impl rule__SlotCall__Group_2_2__1 )
            // InternalEcssLanguage.g:3989:2: rule__SlotCall__Group_2_2__0__Impl rule__SlotCall__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__SlotCall__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2_2__0"


    // $ANTLR start "rule__SlotCall__Group_2_2__0__Impl"
    // InternalEcssLanguage.g:3996:1: rule__SlotCall__Group_2_2__0__Impl : ( '..' ) ;
    public final void rule__SlotCall__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4000:1: ( ( '..' ) )
            // InternalEcssLanguage.g:4001:1: ( '..' )
            {
            // InternalEcssLanguage.g:4001:1: ( '..' )
            // InternalEcssLanguage.g:4002:2: '..'
            {
             before(grammarAccess.getSlotCallAccess().getFullStopFullStopKeyword_2_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getFullStopFullStopKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2_2__0__Impl"


    // $ANTLR start "rule__SlotCall__Group_2_2__1"
    // InternalEcssLanguage.g:4011:1: rule__SlotCall__Group_2_2__1 : rule__SlotCall__Group_2_2__1__Impl ;
    public final void rule__SlotCall__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4015:1: ( rule__SlotCall__Group_2_2__1__Impl )
            // InternalEcssLanguage.g:4016:2: rule__SlotCall__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2_2__1"


    // $ANTLR start "rule__SlotCall__Group_2_2__1__Impl"
    // InternalEcssLanguage.g:4022:1: rule__SlotCall__Group_2_2__1__Impl : ( ( rule__SlotCall__MaxValueAssignment_2_2_1 ) ) ;
    public final void rule__SlotCall__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4026:1: ( ( ( rule__SlotCall__MaxValueAssignment_2_2_1 ) ) )
            // InternalEcssLanguage.g:4027:1: ( ( rule__SlotCall__MaxValueAssignment_2_2_1 ) )
            {
            // InternalEcssLanguage.g:4027:1: ( ( rule__SlotCall__MaxValueAssignment_2_2_1 ) )
            // InternalEcssLanguage.g:4028:2: ( rule__SlotCall__MaxValueAssignment_2_2_1 )
            {
             before(grammarAccess.getSlotCallAccess().getMaxValueAssignment_2_2_1()); 
            // InternalEcssLanguage.g:4029:2: ( rule__SlotCall__MaxValueAssignment_2_2_1 )
            // InternalEcssLanguage.g:4029:3: rule__SlotCall__MaxValueAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SlotCall__MaxValueAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSlotCallAccess().getMaxValueAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__Group_2_2__1__Impl"


    // $ANTLR start "rule__LocalOrValueCall__Group__0"
    // InternalEcssLanguage.g:4038:1: rule__LocalOrValueCall__Group__0 : rule__LocalOrValueCall__Group__0__Impl rule__LocalOrValueCall__Group__1 ;
    public final void rule__LocalOrValueCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4042:1: ( rule__LocalOrValueCall__Group__0__Impl rule__LocalOrValueCall__Group__1 )
            // InternalEcssLanguage.g:4043:2: rule__LocalOrValueCall__Group__0__Impl rule__LocalOrValueCall__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__LocalOrValueCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalOrValueCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__Group__0"


    // $ANTLR start "rule__LocalOrValueCall__Group__0__Impl"
    // InternalEcssLanguage.g:4050:1: rule__LocalOrValueCall__Group__0__Impl : ( '$' ) ;
    public final void rule__LocalOrValueCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4054:1: ( ( '$' ) )
            // InternalEcssLanguage.g:4055:1: ( '$' )
            {
            // InternalEcssLanguage.g:4055:1: ( '$' )
            // InternalEcssLanguage.g:4056:2: '$'
            {
             before(grammarAccess.getLocalOrValueCallAccess().getDollarSignKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLocalOrValueCallAccess().getDollarSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__Group__0__Impl"


    // $ANTLR start "rule__LocalOrValueCall__Group__1"
    // InternalEcssLanguage.g:4065:1: rule__LocalOrValueCall__Group__1 : rule__LocalOrValueCall__Group__1__Impl ;
    public final void rule__LocalOrValueCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4069:1: ( rule__LocalOrValueCall__Group__1__Impl )
            // InternalEcssLanguage.g:4070:2: rule__LocalOrValueCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalOrValueCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__Group__1"


    // $ANTLR start "rule__LocalOrValueCall__Group__1__Impl"
    // InternalEcssLanguage.g:4076:1: rule__LocalOrValueCall__Group__1__Impl : ( ( rule__LocalOrValueCall__Alternatives_1 ) ) ;
    public final void rule__LocalOrValueCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4080:1: ( ( ( rule__LocalOrValueCall__Alternatives_1 ) ) )
            // InternalEcssLanguage.g:4081:1: ( ( rule__LocalOrValueCall__Alternatives_1 ) )
            {
            // InternalEcssLanguage.g:4081:1: ( ( rule__LocalOrValueCall__Alternatives_1 ) )
            // InternalEcssLanguage.g:4082:2: ( rule__LocalOrValueCall__Alternatives_1 )
            {
             before(grammarAccess.getLocalOrValueCallAccess().getAlternatives_1()); 
            // InternalEcssLanguage.g:4083:2: ( rule__LocalOrValueCall__Alternatives_1 )
            // InternalEcssLanguage.g:4083:3: rule__LocalOrValueCall__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalOrValueCall__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalOrValueCallAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__Group__1__Impl"


    // $ANTLR start "rule__LocalEvaluationCall__Group__0"
    // InternalEcssLanguage.g:4092:1: rule__LocalEvaluationCall__Group__0 : rule__LocalEvaluationCall__Group__0__Impl rule__LocalEvaluationCall__Group__1 ;
    public final void rule__LocalEvaluationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4096:1: ( rule__LocalEvaluationCall__Group__0__Impl rule__LocalEvaluationCall__Group__1 )
            // InternalEcssLanguage.g:4097:2: rule__LocalEvaluationCall__Group__0__Impl rule__LocalEvaluationCall__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LocalEvaluationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalEvaluationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalEvaluationCall__Group__0"


    // $ANTLR start "rule__LocalEvaluationCall__Group__0__Impl"
    // InternalEcssLanguage.g:4104:1: rule__LocalEvaluationCall__Group__0__Impl : ( '$#' ) ;
    public final void rule__LocalEvaluationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4108:1: ( ( '$#' ) )
            // InternalEcssLanguage.g:4109:1: ( '$#' )
            {
            // InternalEcssLanguage.g:4109:1: ( '$#' )
            // InternalEcssLanguage.g:4110:2: '$#'
            {
             before(grammarAccess.getLocalEvaluationCallAccess().getDollarSignNumberSignKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLocalEvaluationCallAccess().getDollarSignNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalEvaluationCall__Group__0__Impl"


    // $ANTLR start "rule__LocalEvaluationCall__Group__1"
    // InternalEcssLanguage.g:4119:1: rule__LocalEvaluationCall__Group__1 : rule__LocalEvaluationCall__Group__1__Impl ;
    public final void rule__LocalEvaluationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4123:1: ( rule__LocalEvaluationCall__Group__1__Impl )
            // InternalEcssLanguage.g:4124:2: rule__LocalEvaluationCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalEvaluationCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalEvaluationCall__Group__1"


    // $ANTLR start "rule__LocalEvaluationCall__Group__1__Impl"
    // InternalEcssLanguage.g:4130:1: rule__LocalEvaluationCall__Group__1__Impl : ( ( rule__LocalEvaluationCall__ValueAssignment_1 ) ) ;
    public final void rule__LocalEvaluationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4134:1: ( ( ( rule__LocalEvaluationCall__ValueAssignment_1 ) ) )
            // InternalEcssLanguage.g:4135:1: ( ( rule__LocalEvaluationCall__ValueAssignment_1 ) )
            {
            // InternalEcssLanguage.g:4135:1: ( ( rule__LocalEvaluationCall__ValueAssignment_1 ) )
            // InternalEcssLanguage.g:4136:2: ( rule__LocalEvaluationCall__ValueAssignment_1 )
            {
             before(grammarAccess.getLocalEvaluationCallAccess().getValueAssignment_1()); 
            // InternalEcssLanguage.g:4137:2: ( rule__LocalEvaluationCall__ValueAssignment_1 )
            // InternalEcssLanguage.g:4137:3: rule__LocalEvaluationCall__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalEvaluationCall__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalEvaluationCallAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalEvaluationCall__Group__1__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_0__0"
    // InternalEcssLanguage.g:4146:1: rule__TemplateParameterValue__Group_0__0 : rule__TemplateParameterValue__Group_0__0__Impl rule__TemplateParameterValue__Group_0__1 ;
    public final void rule__TemplateParameterValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4150:1: ( rule__TemplateParameterValue__Group_0__0__Impl rule__TemplateParameterValue__Group_0__1 )
            // InternalEcssLanguage.g:4151:2: rule__TemplateParameterValue__Group_0__0__Impl rule__TemplateParameterValue__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateParameterValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_0__0"


    // $ANTLR start "rule__TemplateParameterValue__Group_0__0__Impl"
    // InternalEcssLanguage.g:4158:1: rule__TemplateParameterValue__Group_0__0__Impl : ( '$' ) ;
    public final void rule__TemplateParameterValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4162:1: ( ( '$' ) )
            // InternalEcssLanguage.g:4163:1: ( '$' )
            {
            // InternalEcssLanguage.g:4163:1: ( '$' )
            // InternalEcssLanguage.g:4164:2: '$'
            {
             before(grammarAccess.getTemplateParameterValueAccess().getDollarSignKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getDollarSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_0__0__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_0__1"
    // InternalEcssLanguage.g:4173:1: rule__TemplateParameterValue__Group_0__1 : rule__TemplateParameterValue__Group_0__1__Impl ;
    public final void rule__TemplateParameterValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4177:1: ( rule__TemplateParameterValue__Group_0__1__Impl )
            // InternalEcssLanguage.g:4178:2: rule__TemplateParameterValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_0__1"


    // $ANTLR start "rule__TemplateParameterValue__Group_0__1__Impl"
    // InternalEcssLanguage.g:4184:1: rule__TemplateParameterValue__Group_0__1__Impl : ( ( rule__TemplateParameterValue__PropNameAssignment_0_1 ) ) ;
    public final void rule__TemplateParameterValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4188:1: ( ( ( rule__TemplateParameterValue__PropNameAssignment_0_1 ) ) )
            // InternalEcssLanguage.g:4189:1: ( ( rule__TemplateParameterValue__PropNameAssignment_0_1 ) )
            {
            // InternalEcssLanguage.g:4189:1: ( ( rule__TemplateParameterValue__PropNameAssignment_0_1 ) )
            // InternalEcssLanguage.g:4190:2: ( rule__TemplateParameterValue__PropNameAssignment_0_1 )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getPropNameAssignment_0_1()); 
            // InternalEcssLanguage.g:4191:2: ( rule__TemplateParameterValue__PropNameAssignment_0_1 )
            // InternalEcssLanguage.g:4191:3: rule__TemplateParameterValue__PropNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__PropNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getPropNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_0__1__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__0"
    // InternalEcssLanguage.g:4200:1: rule__TemplateParameterValue__Group_2__0 : rule__TemplateParameterValue__Group_2__0__Impl rule__TemplateParameterValue__Group_2__1 ;
    public final void rule__TemplateParameterValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4204:1: ( rule__TemplateParameterValue__Group_2__0__Impl rule__TemplateParameterValue__Group_2__1 )
            // InternalEcssLanguage.g:4205:2: rule__TemplateParameterValue__Group_2__0__Impl rule__TemplateParameterValue__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateParameterValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__0"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__0__Impl"
    // InternalEcssLanguage.g:4212:1: rule__TemplateParameterValue__Group_2__0__Impl : ( '\\u00A7' ) ;
    public final void rule__TemplateParameterValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4216:1: ( ( '\\u00A7' ) )
            // InternalEcssLanguage.g:4217:1: ( '\\u00A7' )
            {
            // InternalEcssLanguage.g:4217:1: ( '\\u00A7' )
            // InternalEcssLanguage.g:4218:2: '\\u00A7'
            {
             before(grammarAccess.getTemplateParameterValueAccess().getSectionSignKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getSectionSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__0__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__1"
    // InternalEcssLanguage.g:4227:1: rule__TemplateParameterValue__Group_2__1 : rule__TemplateParameterValue__Group_2__1__Impl rule__TemplateParameterValue__Group_2__2 ;
    public final void rule__TemplateParameterValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4231:1: ( rule__TemplateParameterValue__Group_2__1__Impl rule__TemplateParameterValue__Group_2__2 )
            // InternalEcssLanguage.g:4232:2: rule__TemplateParameterValue__Group_2__1__Impl rule__TemplateParameterValue__Group_2__2
            {
            pushFollow(FOLLOW_35);
            rule__TemplateParameterValue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__1"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__1__Impl"
    // InternalEcssLanguage.g:4239:1: rule__TemplateParameterValue__Group_2__1__Impl : ( ( rule__TemplateParameterValue__SlotNameAssignment_2_1 ) ) ;
    public final void rule__TemplateParameterValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4243:1: ( ( ( rule__TemplateParameterValue__SlotNameAssignment_2_1 ) ) )
            // InternalEcssLanguage.g:4244:1: ( ( rule__TemplateParameterValue__SlotNameAssignment_2_1 ) )
            {
            // InternalEcssLanguage.g:4244:1: ( ( rule__TemplateParameterValue__SlotNameAssignment_2_1 ) )
            // InternalEcssLanguage.g:4245:2: ( rule__TemplateParameterValue__SlotNameAssignment_2_1 )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getSlotNameAssignment_2_1()); 
            // InternalEcssLanguage.g:4246:2: ( rule__TemplateParameterValue__SlotNameAssignment_2_1 )
            // InternalEcssLanguage.g:4246:3: rule__TemplateParameterValue__SlotNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__SlotNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getSlotNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__1__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__2"
    // InternalEcssLanguage.g:4254:1: rule__TemplateParameterValue__Group_2__2 : rule__TemplateParameterValue__Group_2__2__Impl ;
    public final void rule__TemplateParameterValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4258:1: ( rule__TemplateParameterValue__Group_2__2__Impl )
            // InternalEcssLanguage.g:4259:2: rule__TemplateParameterValue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__2"


    // $ANTLR start "rule__TemplateParameterValue__Group_2__2__Impl"
    // InternalEcssLanguage.g:4265:1: rule__TemplateParameterValue__Group_2__2__Impl : ( ( rule__TemplateParameterValue__Group_2_2__0 )? ) ;
    public final void rule__TemplateParameterValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4269:1: ( ( ( rule__TemplateParameterValue__Group_2_2__0 )? ) )
            // InternalEcssLanguage.g:4270:1: ( ( rule__TemplateParameterValue__Group_2_2__0 )? )
            {
            // InternalEcssLanguage.g:4270:1: ( ( rule__TemplateParameterValue__Group_2_2__0 )? )
            // InternalEcssLanguage.g:4271:2: ( rule__TemplateParameterValue__Group_2_2__0 )?
            {
             before(grammarAccess.getTemplateParameterValueAccess().getGroup_2_2()); 
            // InternalEcssLanguage.g:4272:2: ( rule__TemplateParameterValue__Group_2_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEcssLanguage.g:4272:3: rule__TemplateParameterValue__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateParameterValue__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateParameterValueAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2__2__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__0"
    // InternalEcssLanguage.g:4281:1: rule__TemplateParameterValue__Group_2_2__0 : rule__TemplateParameterValue__Group_2_2__0__Impl rule__TemplateParameterValue__Group_2_2__1 ;
    public final void rule__TemplateParameterValue__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4285:1: ( rule__TemplateParameterValue__Group_2_2__0__Impl rule__TemplateParameterValue__Group_2_2__1 )
            // InternalEcssLanguage.g:4286:2: rule__TemplateParameterValue__Group_2_2__0__Impl rule__TemplateParameterValue__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__TemplateParameterValue__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__0"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__0__Impl"
    // InternalEcssLanguage.g:4293:1: rule__TemplateParameterValue__Group_2_2__0__Impl : ( '[' ) ;
    public final void rule__TemplateParameterValue__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4297:1: ( ( '[' ) )
            // InternalEcssLanguage.g:4298:1: ( '[' )
            {
            // InternalEcssLanguage.g:4298:1: ( '[' )
            // InternalEcssLanguage.g:4299:2: '['
            {
             before(grammarAccess.getTemplateParameterValueAccess().getLeftSquareBracketKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getLeftSquareBracketKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__0__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__1"
    // InternalEcssLanguage.g:4308:1: rule__TemplateParameterValue__Group_2_2__1 : rule__TemplateParameterValue__Group_2_2__1__Impl rule__TemplateParameterValue__Group_2_2__2 ;
    public final void rule__TemplateParameterValue__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4312:1: ( rule__TemplateParameterValue__Group_2_2__1__Impl rule__TemplateParameterValue__Group_2_2__2 )
            // InternalEcssLanguage.g:4313:2: rule__TemplateParameterValue__Group_2_2__1__Impl rule__TemplateParameterValue__Group_2_2__2
            {
            pushFollow(FOLLOW_36);
            rule__TemplateParameterValue__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__1"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__1__Impl"
    // InternalEcssLanguage.g:4320:1: rule__TemplateParameterValue__Group_2_2__1__Impl : ( ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 ) ) ;
    public final void rule__TemplateParameterValue__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4324:1: ( ( ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 ) ) )
            // InternalEcssLanguage.g:4325:1: ( ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 ) )
            {
            // InternalEcssLanguage.g:4325:1: ( ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 ) )
            // InternalEcssLanguage.g:4326:2: ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getMinValueAssignment_2_2_1()); 
            // InternalEcssLanguage.g:4327:2: ( rule__TemplateParameterValue__MinValueAssignment_2_2_1 )
            // InternalEcssLanguage.g:4327:3: rule__TemplateParameterValue__MinValueAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__MinValueAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getMinValueAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__1__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__2"
    // InternalEcssLanguage.g:4335:1: rule__TemplateParameterValue__Group_2_2__2 : rule__TemplateParameterValue__Group_2_2__2__Impl rule__TemplateParameterValue__Group_2_2__3 ;
    public final void rule__TemplateParameterValue__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4339:1: ( rule__TemplateParameterValue__Group_2_2__2__Impl rule__TemplateParameterValue__Group_2_2__3 )
            // InternalEcssLanguage.g:4340:2: rule__TemplateParameterValue__Group_2_2__2__Impl rule__TemplateParameterValue__Group_2_2__3
            {
            pushFollow(FOLLOW_37);
            rule__TemplateParameterValue__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__2"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__2__Impl"
    // InternalEcssLanguage.g:4347:1: rule__TemplateParameterValue__Group_2_2__2__Impl : ( ( rule__TemplateParameterValue__Group_2_2_2__0 ) ) ;
    public final void rule__TemplateParameterValue__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4351:1: ( ( ( rule__TemplateParameterValue__Group_2_2_2__0 ) ) )
            // InternalEcssLanguage.g:4352:1: ( ( rule__TemplateParameterValue__Group_2_2_2__0 ) )
            {
            // InternalEcssLanguage.g:4352:1: ( ( rule__TemplateParameterValue__Group_2_2_2__0 ) )
            // InternalEcssLanguage.g:4353:2: ( rule__TemplateParameterValue__Group_2_2_2__0 )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getGroup_2_2_2()); 
            // InternalEcssLanguage.g:4354:2: ( rule__TemplateParameterValue__Group_2_2_2__0 )
            // InternalEcssLanguage.g:4354:3: rule__TemplateParameterValue__Group_2_2_2__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getGroup_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__2__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__3"
    // InternalEcssLanguage.g:4362:1: rule__TemplateParameterValue__Group_2_2__3 : rule__TemplateParameterValue__Group_2_2__3__Impl ;
    public final void rule__TemplateParameterValue__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4366:1: ( rule__TemplateParameterValue__Group_2_2__3__Impl )
            // InternalEcssLanguage.g:4367:2: rule__TemplateParameterValue__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__3"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2__3__Impl"
    // InternalEcssLanguage.g:4373:1: rule__TemplateParameterValue__Group_2_2__3__Impl : ( ']' ) ;
    public final void rule__TemplateParameterValue__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4377:1: ( ( ']' ) )
            // InternalEcssLanguage.g:4378:1: ( ']' )
            {
            // InternalEcssLanguage.g:4378:1: ( ']' )
            // InternalEcssLanguage.g:4379:2: ']'
            {
             before(grammarAccess.getTemplateParameterValueAccess().getRightSquareBracketKeyword_2_2_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getRightSquareBracketKeyword_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2__3__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2_2__0"
    // InternalEcssLanguage.g:4389:1: rule__TemplateParameterValue__Group_2_2_2__0 : rule__TemplateParameterValue__Group_2_2_2__0__Impl rule__TemplateParameterValue__Group_2_2_2__1 ;
    public final void rule__TemplateParameterValue__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4393:1: ( rule__TemplateParameterValue__Group_2_2_2__0__Impl rule__TemplateParameterValue__Group_2_2_2__1 )
            // InternalEcssLanguage.g:4394:2: rule__TemplateParameterValue__Group_2_2_2__0__Impl rule__TemplateParameterValue__Group_2_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__TemplateParameterValue__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2_2__0"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2_2__0__Impl"
    // InternalEcssLanguage.g:4401:1: rule__TemplateParameterValue__Group_2_2_2__0__Impl : ( '..' ) ;
    public final void rule__TemplateParameterValue__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4405:1: ( ( '..' ) )
            // InternalEcssLanguage.g:4406:1: ( '..' )
            {
            // InternalEcssLanguage.g:4406:1: ( '..' )
            // InternalEcssLanguage.g:4407:2: '..'
            {
             before(grammarAccess.getTemplateParameterValueAccess().getFullStopFullStopKeyword_2_2_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getFullStopFullStopKeyword_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2_2__1"
    // InternalEcssLanguage.g:4416:1: rule__TemplateParameterValue__Group_2_2_2__1 : rule__TemplateParameterValue__Group_2_2_2__1__Impl ;
    public final void rule__TemplateParameterValue__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4420:1: ( rule__TemplateParameterValue__Group_2_2_2__1__Impl )
            // InternalEcssLanguage.g:4421:2: rule__TemplateParameterValue__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__Group_2_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2_2__1"


    // $ANTLR start "rule__TemplateParameterValue__Group_2_2_2__1__Impl"
    // InternalEcssLanguage.g:4427:1: rule__TemplateParameterValue__Group_2_2_2__1__Impl : ( ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 ) ) ;
    public final void rule__TemplateParameterValue__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4431:1: ( ( ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 ) ) )
            // InternalEcssLanguage.g:4432:1: ( ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 ) )
            {
            // InternalEcssLanguage.g:4432:1: ( ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 ) )
            // InternalEcssLanguage.g:4433:2: ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 )
            {
             before(grammarAccess.getTemplateParameterValueAccess().getMaxValueAssignment_2_2_2_1()); 
            // InternalEcssLanguage.g:4434:2: ( rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 )
            // InternalEcssLanguage.g:4434:3: rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterValueAccess().getMaxValueAssignment_2_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__EvaluationCall__Group__0"
    // InternalEcssLanguage.g:4443:1: rule__EvaluationCall__Group__0 : rule__EvaluationCall__Group__0__Impl rule__EvaluationCall__Group__1 ;
    public final void rule__EvaluationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4447:1: ( rule__EvaluationCall__Group__0__Impl rule__EvaluationCall__Group__1 )
            // InternalEcssLanguage.g:4448:2: rule__EvaluationCall__Group__0__Impl rule__EvaluationCall__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EvaluationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationCall__Group__0"


    // $ANTLR start "rule__EvaluationCall__Group__0__Impl"
    // InternalEcssLanguage.g:4455:1: rule__EvaluationCall__Group__0__Impl : ( '#' ) ;
    public final void rule__EvaluationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4459:1: ( ( '#' ) )
            // InternalEcssLanguage.g:4460:1: ( '#' )
            {
            // InternalEcssLanguage.g:4460:1: ( '#' )
            // InternalEcssLanguage.g:4461:2: '#'
            {
             before(grammarAccess.getEvaluationCallAccess().getNumberSignKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEvaluationCallAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationCall__Group__0__Impl"


    // $ANTLR start "rule__EvaluationCall__Group__1"
    // InternalEcssLanguage.g:4470:1: rule__EvaluationCall__Group__1 : rule__EvaluationCall__Group__1__Impl ;
    public final void rule__EvaluationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4474:1: ( rule__EvaluationCall__Group__1__Impl )
            // InternalEcssLanguage.g:4475:2: rule__EvaluationCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationCall__Group__1"


    // $ANTLR start "rule__EvaluationCall__Group__1__Impl"
    // InternalEcssLanguage.g:4481:1: rule__EvaluationCall__Group__1__Impl : ( ( rule__EvaluationCall__ValueAssignment_1 ) ) ;
    public final void rule__EvaluationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4485:1: ( ( ( rule__EvaluationCall__ValueAssignment_1 ) ) )
            // InternalEcssLanguage.g:4486:1: ( ( rule__EvaluationCall__ValueAssignment_1 ) )
            {
            // InternalEcssLanguage.g:4486:1: ( ( rule__EvaluationCall__ValueAssignment_1 ) )
            // InternalEcssLanguage.g:4487:2: ( rule__EvaluationCall__ValueAssignment_1 )
            {
             before(grammarAccess.getEvaluationCallAccess().getValueAssignment_1()); 
            // InternalEcssLanguage.g:4488:2: ( rule__EvaluationCall__ValueAssignment_1 )
            // InternalEcssLanguage.g:4488:3: rule__EvaluationCall__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationCall__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationCallAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationCall__Group__1__Impl"


    // $ANTLR start "rule__PropertyRule__Group__0"
    // InternalEcssLanguage.g:4497:1: rule__PropertyRule__Group__0 : rule__PropertyRule__Group__0__Impl rule__PropertyRule__Group__1 ;
    public final void rule__PropertyRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4501:1: ( rule__PropertyRule__Group__0__Impl rule__PropertyRule__Group__1 )
            // InternalEcssLanguage.g:4502:2: rule__PropertyRule__Group__0__Impl rule__PropertyRule__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__PropertyRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__0"


    // $ANTLR start "rule__PropertyRule__Group__0__Impl"
    // InternalEcssLanguage.g:4509:1: rule__PropertyRule__Group__0__Impl : ( () ) ;
    public final void rule__PropertyRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4513:1: ( ( () ) )
            // InternalEcssLanguage.g:4514:1: ( () )
            {
            // InternalEcssLanguage.g:4514:1: ( () )
            // InternalEcssLanguage.g:4515:2: ()
            {
             before(grammarAccess.getPropertyRuleAccess().getPropertyRuleAction_0()); 
            // InternalEcssLanguage.g:4516:2: ()
            // InternalEcssLanguage.g:4516:3: 
            {
            }

             after(grammarAccess.getPropertyRuleAccess().getPropertyRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__0__Impl"


    // $ANTLR start "rule__PropertyRule__Group__1"
    // InternalEcssLanguage.g:4524:1: rule__PropertyRule__Group__1 : rule__PropertyRule__Group__1__Impl rule__PropertyRule__Group__2 ;
    public final void rule__PropertyRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4528:1: ( rule__PropertyRule__Group__1__Impl rule__PropertyRule__Group__2 )
            // InternalEcssLanguage.g:4529:2: rule__PropertyRule__Group__1__Impl rule__PropertyRule__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__PropertyRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__1"


    // $ANTLR start "rule__PropertyRule__Group__1__Impl"
    // InternalEcssLanguage.g:4536:1: rule__PropertyRule__Group__1__Impl : ( ( rule__PropertyRule__SelectorAssignment_1 )? ) ;
    public final void rule__PropertyRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4540:1: ( ( ( rule__PropertyRule__SelectorAssignment_1 )? ) )
            // InternalEcssLanguage.g:4541:1: ( ( rule__PropertyRule__SelectorAssignment_1 )? )
            {
            // InternalEcssLanguage.g:4541:1: ( ( rule__PropertyRule__SelectorAssignment_1 )? )
            // InternalEcssLanguage.g:4542:2: ( rule__PropertyRule__SelectorAssignment_1 )?
            {
             before(grammarAccess.getPropertyRuleAccess().getSelectorAssignment_1()); 
            // InternalEcssLanguage.g:4543:2: ( rule__PropertyRule__SelectorAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEcssLanguage.g:4543:3: rule__PropertyRule__SelectorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyRule__SelectorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyRuleAccess().getSelectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__1__Impl"


    // $ANTLR start "rule__PropertyRule__Group__2"
    // InternalEcssLanguage.g:4551:1: rule__PropertyRule__Group__2 : rule__PropertyRule__Group__2__Impl rule__PropertyRule__Group__3 ;
    public final void rule__PropertyRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4555:1: ( rule__PropertyRule__Group__2__Impl rule__PropertyRule__Group__3 )
            // InternalEcssLanguage.g:4556:2: rule__PropertyRule__Group__2__Impl rule__PropertyRule__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__PropertyRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__2"


    // $ANTLR start "rule__PropertyRule__Group__2__Impl"
    // InternalEcssLanguage.g:4563:1: rule__PropertyRule__Group__2__Impl : ( '{' ) ;
    public final void rule__PropertyRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4567:1: ( ( '{' ) )
            // InternalEcssLanguage.g:4568:1: ( '{' )
            {
            // InternalEcssLanguage.g:4568:1: ( '{' )
            // InternalEcssLanguage.g:4569:2: '{'
            {
             before(grammarAccess.getPropertyRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPropertyRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__2__Impl"


    // $ANTLR start "rule__PropertyRule__Group__3"
    // InternalEcssLanguage.g:4578:1: rule__PropertyRule__Group__3 : rule__PropertyRule__Group__3__Impl rule__PropertyRule__Group__4 ;
    public final void rule__PropertyRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4582:1: ( rule__PropertyRule__Group__3__Impl rule__PropertyRule__Group__4 )
            // InternalEcssLanguage.g:4583:2: rule__PropertyRule__Group__3__Impl rule__PropertyRule__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__PropertyRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__3"


    // $ANTLR start "rule__PropertyRule__Group__3__Impl"
    // InternalEcssLanguage.g:4590:1: rule__PropertyRule__Group__3__Impl : ( ( rule__PropertyRule__PropertyAssignment_3 )* ) ;
    public final void rule__PropertyRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4594:1: ( ( ( rule__PropertyRule__PropertyAssignment_3 )* ) )
            // InternalEcssLanguage.g:4595:1: ( ( rule__PropertyRule__PropertyAssignment_3 )* )
            {
            // InternalEcssLanguage.g:4595:1: ( ( rule__PropertyRule__PropertyAssignment_3 )* )
            // InternalEcssLanguage.g:4596:2: ( rule__PropertyRule__PropertyAssignment_3 )*
            {
             before(grammarAccess.getPropertyRuleAccess().getPropertyAssignment_3()); 
            // InternalEcssLanguage.g:4597:2: ( rule__PropertyRule__PropertyAssignment_3 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==21||LA45_0==45) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalEcssLanguage.g:4597:3: rule__PropertyRule__PropertyAssignment_3
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__PropertyRule__PropertyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getPropertyRuleAccess().getPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__3__Impl"


    // $ANTLR start "rule__PropertyRule__Group__4"
    // InternalEcssLanguage.g:4605:1: rule__PropertyRule__Group__4 : rule__PropertyRule__Group__4__Impl ;
    public final void rule__PropertyRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4609:1: ( rule__PropertyRule__Group__4__Impl )
            // InternalEcssLanguage.g:4610:2: rule__PropertyRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__4"


    // $ANTLR start "rule__PropertyRule__Group__4__Impl"
    // InternalEcssLanguage.g:4616:1: rule__PropertyRule__Group__4__Impl : ( '}' ) ;
    public final void rule__PropertyRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4620:1: ( ( '}' ) )
            // InternalEcssLanguage.g:4621:1: ( '}' )
            {
            // InternalEcssLanguage.g:4621:1: ( '}' )
            // InternalEcssLanguage.g:4622:2: '}'
            {
             before(grammarAccess.getPropertyRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPropertyRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__Group__4__Impl"


    // $ANTLR start "rule__SingleSelector__Group__0"
    // InternalEcssLanguage.g:4632:1: rule__SingleSelector__Group__0 : rule__SingleSelector__Group__0__Impl rule__SingleSelector__Group__1 ;
    public final void rule__SingleSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4636:1: ( rule__SingleSelector__Group__0__Impl rule__SingleSelector__Group__1 )
            // InternalEcssLanguage.g:4637:2: rule__SingleSelector__Group__0__Impl rule__SingleSelector__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SingleSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__Group__0"


    // $ANTLR start "rule__SingleSelector__Group__0__Impl"
    // InternalEcssLanguage.g:4644:1: rule__SingleSelector__Group__0__Impl : ( ( rule__SingleSelector__Alternatives_0 ) ) ;
    public final void rule__SingleSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4648:1: ( ( ( rule__SingleSelector__Alternatives_0 ) ) )
            // InternalEcssLanguage.g:4649:1: ( ( rule__SingleSelector__Alternatives_0 ) )
            {
            // InternalEcssLanguage.g:4649:1: ( ( rule__SingleSelector__Alternatives_0 ) )
            // InternalEcssLanguage.g:4650:2: ( rule__SingleSelector__Alternatives_0 )
            {
             before(grammarAccess.getSingleSelectorAccess().getAlternatives_0()); 
            // InternalEcssLanguage.g:4651:2: ( rule__SingleSelector__Alternatives_0 )
            // InternalEcssLanguage.g:4651:3: rule__SingleSelector__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelector__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__Group__0__Impl"


    // $ANTLR start "rule__SingleSelector__Group__1"
    // InternalEcssLanguage.g:4659:1: rule__SingleSelector__Group__1 : rule__SingleSelector__Group__1__Impl ;
    public final void rule__SingleSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4663:1: ( rule__SingleSelector__Group__1__Impl )
            // InternalEcssLanguage.g:4664:2: rule__SingleSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__Group__1"


    // $ANTLR start "rule__SingleSelector__Group__1__Impl"
    // InternalEcssLanguage.g:4670:1: rule__SingleSelector__Group__1__Impl : ( ( rule__SingleSelector__ConditionAssignment_1 )? ) ;
    public final void rule__SingleSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4674:1: ( ( ( rule__SingleSelector__ConditionAssignment_1 )? ) )
            // InternalEcssLanguage.g:4675:1: ( ( rule__SingleSelector__ConditionAssignment_1 )? )
            {
            // InternalEcssLanguage.g:4675:1: ( ( rule__SingleSelector__ConditionAssignment_1 )? )
            // InternalEcssLanguage.g:4676:2: ( rule__SingleSelector__ConditionAssignment_1 )?
            {
             before(grammarAccess.getSingleSelectorAccess().getConditionAssignment_1()); 
            // InternalEcssLanguage.g:4677:2: ( rule__SingleSelector__ConditionAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEcssLanguage.g:4677:3: rule__SingleSelector__ConditionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleSelector__ConditionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleSelectorAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__Group__1__Impl"


    // $ANTLR start "rule__PossiblySignedNumber__Group__0"
    // InternalEcssLanguage.g:4686:1: rule__PossiblySignedNumber__Group__0 : rule__PossiblySignedNumber__Group__0__Impl rule__PossiblySignedNumber__Group__1 ;
    public final void rule__PossiblySignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4690:1: ( rule__PossiblySignedNumber__Group__0__Impl rule__PossiblySignedNumber__Group__1 )
            // InternalEcssLanguage.g:4691:2: rule__PossiblySignedNumber__Group__0__Impl rule__PossiblySignedNumber__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PossiblySignedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PossiblySignedNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedNumber__Group__0"


    // $ANTLR start "rule__PossiblySignedNumber__Group__0__Impl"
    // InternalEcssLanguage.g:4698:1: rule__PossiblySignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__PossiblySignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4702:1: ( ( ( '-' )? ) )
            // InternalEcssLanguage.g:4703:1: ( ( '-' )? )
            {
            // InternalEcssLanguage.g:4703:1: ( ( '-' )? )
            // InternalEcssLanguage.g:4704:2: ( '-' )?
            {
             before(grammarAccess.getPossiblySignedNumberAccess().getHyphenMinusKeyword_0()); 
            // InternalEcssLanguage.g:4705:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEcssLanguage.g:4705:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPossiblySignedNumberAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedNumber__Group__0__Impl"


    // $ANTLR start "rule__PossiblySignedNumber__Group__1"
    // InternalEcssLanguage.g:4713:1: rule__PossiblySignedNumber__Group__1 : rule__PossiblySignedNumber__Group__1__Impl ;
    public final void rule__PossiblySignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4717:1: ( rule__PossiblySignedNumber__Group__1__Impl )
            // InternalEcssLanguage.g:4718:2: rule__PossiblySignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PossiblySignedNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedNumber__Group__1"


    // $ANTLR start "rule__PossiblySignedNumber__Group__1__Impl"
    // InternalEcssLanguage.g:4724:1: rule__PossiblySignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__PossiblySignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4728:1: ( ( RULE_NUMBER ) )
            // InternalEcssLanguage.g:4729:1: ( RULE_NUMBER )
            {
            // InternalEcssLanguage.g:4729:1: ( RULE_NUMBER )
            // InternalEcssLanguage.g:4730:2: RULE_NUMBER
            {
             before(grammarAccess.getPossiblySignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getPossiblySignedNumberAccess().getNUMBERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedNumber__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalEcssLanguage.g:4740:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4744:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalEcssLanguage.g:4745:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalEcssLanguage.g:4752:1: rule__Property__Group__0__Impl : ( ( rule__Property__Alternatives_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4756:1: ( ( ( rule__Property__Alternatives_0 ) ) )
            // InternalEcssLanguage.g:4757:1: ( ( rule__Property__Alternatives_0 ) )
            {
            // InternalEcssLanguage.g:4757:1: ( ( rule__Property__Alternatives_0 ) )
            // InternalEcssLanguage.g:4758:2: ( rule__Property__Alternatives_0 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            // InternalEcssLanguage.g:4759:2: ( rule__Property__Alternatives_0 )
            // InternalEcssLanguage.g:4759:3: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalEcssLanguage.g:4767:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4771:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalEcssLanguage.g:4772:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalEcssLanguage.g:4779:1: rule__Property__Group__1__Impl : ( ( rule__Property__ConditionAssignment_1 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4783:1: ( ( ( rule__Property__ConditionAssignment_1 )? ) )
            // InternalEcssLanguage.g:4784:1: ( ( rule__Property__ConditionAssignment_1 )? )
            {
            // InternalEcssLanguage.g:4784:1: ( ( rule__Property__ConditionAssignment_1 )? )
            // InternalEcssLanguage.g:4785:2: ( rule__Property__ConditionAssignment_1 )?
            {
             before(grammarAccess.getPropertyAccess().getConditionAssignment_1()); 
            // InternalEcssLanguage.g:4786:2: ( rule__Property__ConditionAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEcssLanguage.g:4786:3: rule__Property__ConditionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__ConditionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalEcssLanguage.g:4794:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4798:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalEcssLanguage.g:4799:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalEcssLanguage.g:4806:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4810:1: ( ( ':' ) )
            // InternalEcssLanguage.g:4811:1: ( ':' )
            {
            // InternalEcssLanguage.g:4811:1: ( ':' )
            // InternalEcssLanguage.g:4812:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalEcssLanguage.g:4821:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4825:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalEcssLanguage.g:4826:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalEcssLanguage.g:4833:1: rule__Property__Group__3__Impl : ( ( ( rule__Property__ValueAssignment_3 ) ) ( ( rule__Property__ValueAssignment_3 )* ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4837:1: ( ( ( ( rule__Property__ValueAssignment_3 ) ) ( ( rule__Property__ValueAssignment_3 )* ) ) )
            // InternalEcssLanguage.g:4838:1: ( ( ( rule__Property__ValueAssignment_3 ) ) ( ( rule__Property__ValueAssignment_3 )* ) )
            {
            // InternalEcssLanguage.g:4838:1: ( ( ( rule__Property__ValueAssignment_3 ) ) ( ( rule__Property__ValueAssignment_3 )* ) )
            // InternalEcssLanguage.g:4839:2: ( ( rule__Property__ValueAssignment_3 ) ) ( ( rule__Property__ValueAssignment_3 )* )
            {
            // InternalEcssLanguage.g:4839:2: ( ( rule__Property__ValueAssignment_3 ) )
            // InternalEcssLanguage.g:4840:3: ( rule__Property__ValueAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            // InternalEcssLanguage.g:4841:3: ( rule__Property__ValueAssignment_3 )
            // InternalEcssLanguage.g:4841:4: rule__Property__ValueAssignment_3
            {
            pushFollow(FOLLOW_44);
            rule__Property__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_3()); 

            }

            // InternalEcssLanguage.g:4844:2: ( ( rule__Property__ValueAssignment_3 )* )
            // InternalEcssLanguage.g:4845:3: ( rule__Property__ValueAssignment_3 )*
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            // InternalEcssLanguage.g:4846:3: ( rule__Property__ValueAssignment_3 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_NUMBER)||LA49_0==44||LA49_0==46) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalEcssLanguage.g:4846:4: rule__Property__ValueAssignment_3
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Property__ValueAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getValueAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalEcssLanguage.g:4855:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4859:1: ( rule__Property__Group__4__Impl )
            // InternalEcssLanguage.g:4860:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalEcssLanguage.g:4866:1: rule__Property__Group__4__Impl : ( ';' ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4870:1: ( ( ';' ) )
            // InternalEcssLanguage.g:4871:1: ( ';' )
            {
            // InternalEcssLanguage.g:4871:1: ( ';' )
            // InternalEcssLanguage.g:4872:2: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__TemplateMatch__Group__0"
    // InternalEcssLanguage.g:4882:1: rule__TemplateMatch__Group__0 : rule__TemplateMatch__Group__0__Impl rule__TemplateMatch__Group__1 ;
    public final void rule__TemplateMatch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4886:1: ( rule__TemplateMatch__Group__0__Impl rule__TemplateMatch__Group__1 )
            // InternalEcssLanguage.g:4887:2: rule__TemplateMatch__Group__0__Impl rule__TemplateMatch__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__TemplateMatch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateMatch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__0"


    // $ANTLR start "rule__TemplateMatch__Group__0__Impl"
    // InternalEcssLanguage.g:4894:1: rule__TemplateMatch__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateMatch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4898:1: ( ( 'template' ) )
            // InternalEcssLanguage.g:4899:1: ( 'template' )
            {
            // InternalEcssLanguage.g:4899:1: ( 'template' )
            // InternalEcssLanguage.g:4900:2: 'template'
            {
             before(grammarAccess.getTemplateMatchAccess().getTemplateKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTemplateMatchAccess().getTemplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__0__Impl"


    // $ANTLR start "rule__TemplateMatch__Group__1"
    // InternalEcssLanguage.g:4909:1: rule__TemplateMatch__Group__1 : rule__TemplateMatch__Group__1__Impl rule__TemplateMatch__Group__2 ;
    public final void rule__TemplateMatch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4913:1: ( rule__TemplateMatch__Group__1__Impl rule__TemplateMatch__Group__2 )
            // InternalEcssLanguage.g:4914:2: rule__TemplateMatch__Group__1__Impl rule__TemplateMatch__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__TemplateMatch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateMatch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__1"


    // $ANTLR start "rule__TemplateMatch__Group__1__Impl"
    // InternalEcssLanguage.g:4921:1: rule__TemplateMatch__Group__1__Impl : ( '(' ) ;
    public final void rule__TemplateMatch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4925:1: ( ( '(' ) )
            // InternalEcssLanguage.g:4926:1: ( '(' )
            {
            // InternalEcssLanguage.g:4926:1: ( '(' )
            // InternalEcssLanguage.g:4927:2: '('
            {
             before(grammarAccess.getTemplateMatchAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTemplateMatchAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__1__Impl"


    // $ANTLR start "rule__TemplateMatch__Group__2"
    // InternalEcssLanguage.g:4936:1: rule__TemplateMatch__Group__2 : rule__TemplateMatch__Group__2__Impl rule__TemplateMatch__Group__3 ;
    public final void rule__TemplateMatch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4940:1: ( rule__TemplateMatch__Group__2__Impl rule__TemplateMatch__Group__3 )
            // InternalEcssLanguage.g:4941:2: rule__TemplateMatch__Group__2__Impl rule__TemplateMatch__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__TemplateMatch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateMatch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__2"


    // $ANTLR start "rule__TemplateMatch__Group__2__Impl"
    // InternalEcssLanguage.g:4948:1: rule__TemplateMatch__Group__2__Impl : ( ( rule__TemplateMatch__SelectorAssignment_2 ) ) ;
    public final void rule__TemplateMatch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4952:1: ( ( ( rule__TemplateMatch__SelectorAssignment_2 ) ) )
            // InternalEcssLanguage.g:4953:1: ( ( rule__TemplateMatch__SelectorAssignment_2 ) )
            {
            // InternalEcssLanguage.g:4953:1: ( ( rule__TemplateMatch__SelectorAssignment_2 ) )
            // InternalEcssLanguage.g:4954:2: ( rule__TemplateMatch__SelectorAssignment_2 )
            {
             before(grammarAccess.getTemplateMatchAccess().getSelectorAssignment_2()); 
            // InternalEcssLanguage.g:4955:2: ( rule__TemplateMatch__SelectorAssignment_2 )
            // InternalEcssLanguage.g:4955:3: rule__TemplateMatch__SelectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TemplateMatch__SelectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateMatchAccess().getSelectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__2__Impl"


    // $ANTLR start "rule__TemplateMatch__Group__3"
    // InternalEcssLanguage.g:4963:1: rule__TemplateMatch__Group__3 : rule__TemplateMatch__Group__3__Impl ;
    public final void rule__TemplateMatch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4967:1: ( rule__TemplateMatch__Group__3__Impl )
            // InternalEcssLanguage.g:4968:2: rule__TemplateMatch__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateMatch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__3"


    // $ANTLR start "rule__TemplateMatch__Group__3__Impl"
    // InternalEcssLanguage.g:4974:1: rule__TemplateMatch__Group__3__Impl : ( ')' ) ;
    public final void rule__TemplateMatch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4978:1: ( ( ')' ) )
            // InternalEcssLanguage.g:4979:1: ( ')' )
            {
            // InternalEcssLanguage.g:4979:1: ( ')' )
            // InternalEcssLanguage.g:4980:2: ')'
            {
             before(grammarAccess.getTemplateMatchAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTemplateMatchAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__Group__3__Impl"


    // $ANTLR start "rule__SlotMatch__Group__0"
    // InternalEcssLanguage.g:4990:1: rule__SlotMatch__Group__0 : rule__SlotMatch__Group__0__Impl rule__SlotMatch__Group__1 ;
    public final void rule__SlotMatch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:4994:1: ( rule__SlotMatch__Group__0__Impl rule__SlotMatch__Group__1 )
            // InternalEcssLanguage.g:4995:2: rule__SlotMatch__Group__0__Impl rule__SlotMatch__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SlotMatch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__0"


    // $ANTLR start "rule__SlotMatch__Group__0__Impl"
    // InternalEcssLanguage.g:5002:1: rule__SlotMatch__Group__0__Impl : ( 'slot' ) ;
    public final void rule__SlotMatch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5006:1: ( ( 'slot' ) )
            // InternalEcssLanguage.g:5007:1: ( 'slot' )
            {
            // InternalEcssLanguage.g:5007:1: ( 'slot' )
            // InternalEcssLanguage.g:5008:2: 'slot'
            {
             before(grammarAccess.getSlotMatchAccess().getSlotKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSlotMatchAccess().getSlotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__0__Impl"


    // $ANTLR start "rule__SlotMatch__Group__1"
    // InternalEcssLanguage.g:5017:1: rule__SlotMatch__Group__1 : rule__SlotMatch__Group__1__Impl rule__SlotMatch__Group__2 ;
    public final void rule__SlotMatch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5021:1: ( rule__SlotMatch__Group__1__Impl rule__SlotMatch__Group__2 )
            // InternalEcssLanguage.g:5022:2: rule__SlotMatch__Group__1__Impl rule__SlotMatch__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__SlotMatch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__1"


    // $ANTLR start "rule__SlotMatch__Group__1__Impl"
    // InternalEcssLanguage.g:5029:1: rule__SlotMatch__Group__1__Impl : ( '(' ) ;
    public final void rule__SlotMatch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5033:1: ( ( '(' ) )
            // InternalEcssLanguage.g:5034:1: ( '(' )
            {
            // InternalEcssLanguage.g:5034:1: ( '(' )
            // InternalEcssLanguage.g:5035:2: '('
            {
             before(grammarAccess.getSlotMatchAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSlotMatchAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__1__Impl"


    // $ANTLR start "rule__SlotMatch__Group__2"
    // InternalEcssLanguage.g:5044:1: rule__SlotMatch__Group__2 : rule__SlotMatch__Group__2__Impl rule__SlotMatch__Group__3 ;
    public final void rule__SlotMatch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5048:1: ( rule__SlotMatch__Group__2__Impl rule__SlotMatch__Group__3 )
            // InternalEcssLanguage.g:5049:2: rule__SlotMatch__Group__2__Impl rule__SlotMatch__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SlotMatch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__2"


    // $ANTLR start "rule__SlotMatch__Group__2__Impl"
    // InternalEcssLanguage.g:5056:1: rule__SlotMatch__Group__2__Impl : ( ( rule__SlotMatch__FirstAssignment_2 ) ) ;
    public final void rule__SlotMatch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5060:1: ( ( ( rule__SlotMatch__FirstAssignment_2 ) ) )
            // InternalEcssLanguage.g:5061:1: ( ( rule__SlotMatch__FirstAssignment_2 ) )
            {
            // InternalEcssLanguage.g:5061:1: ( ( rule__SlotMatch__FirstAssignment_2 ) )
            // InternalEcssLanguage.g:5062:2: ( rule__SlotMatch__FirstAssignment_2 )
            {
             before(grammarAccess.getSlotMatchAccess().getFirstAssignment_2()); 
            // InternalEcssLanguage.g:5063:2: ( rule__SlotMatch__FirstAssignment_2 )
            // InternalEcssLanguage.g:5063:3: rule__SlotMatch__FirstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SlotMatch__FirstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSlotMatchAccess().getFirstAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__2__Impl"


    // $ANTLR start "rule__SlotMatch__Group__3"
    // InternalEcssLanguage.g:5071:1: rule__SlotMatch__Group__3 : rule__SlotMatch__Group__3__Impl rule__SlotMatch__Group__4 ;
    public final void rule__SlotMatch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5075:1: ( rule__SlotMatch__Group__3__Impl rule__SlotMatch__Group__4 )
            // InternalEcssLanguage.g:5076:2: rule__SlotMatch__Group__3__Impl rule__SlotMatch__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__SlotMatch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__3"


    // $ANTLR start "rule__SlotMatch__Group__3__Impl"
    // InternalEcssLanguage.g:5083:1: rule__SlotMatch__Group__3__Impl : ( ',' ) ;
    public final void rule__SlotMatch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5087:1: ( ( ',' ) )
            // InternalEcssLanguage.g:5088:1: ( ',' )
            {
            // InternalEcssLanguage.g:5088:1: ( ',' )
            // InternalEcssLanguage.g:5089:2: ','
            {
             before(grammarAccess.getSlotMatchAccess().getCommaKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSlotMatchAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__3__Impl"


    // $ANTLR start "rule__SlotMatch__Group__4"
    // InternalEcssLanguage.g:5098:1: rule__SlotMatch__Group__4 : rule__SlotMatch__Group__4__Impl rule__SlotMatch__Group__5 ;
    public final void rule__SlotMatch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5102:1: ( rule__SlotMatch__Group__4__Impl rule__SlotMatch__Group__5 )
            // InternalEcssLanguage.g:5103:2: rule__SlotMatch__Group__4__Impl rule__SlotMatch__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__SlotMatch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__4"


    // $ANTLR start "rule__SlotMatch__Group__4__Impl"
    // InternalEcssLanguage.g:5110:1: rule__SlotMatch__Group__4__Impl : ( ( rule__SlotMatch__SecondAssignment_4 ) ) ;
    public final void rule__SlotMatch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5114:1: ( ( ( rule__SlotMatch__SecondAssignment_4 ) ) )
            // InternalEcssLanguage.g:5115:1: ( ( rule__SlotMatch__SecondAssignment_4 ) )
            {
            // InternalEcssLanguage.g:5115:1: ( ( rule__SlotMatch__SecondAssignment_4 ) )
            // InternalEcssLanguage.g:5116:2: ( rule__SlotMatch__SecondAssignment_4 )
            {
             before(grammarAccess.getSlotMatchAccess().getSecondAssignment_4()); 
            // InternalEcssLanguage.g:5117:2: ( rule__SlotMatch__SecondAssignment_4 )
            // InternalEcssLanguage.g:5117:3: rule__SlotMatch__SecondAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SlotMatch__SecondAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSlotMatchAccess().getSecondAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__4__Impl"


    // $ANTLR start "rule__SlotMatch__Group__5"
    // InternalEcssLanguage.g:5125:1: rule__SlotMatch__Group__5 : rule__SlotMatch__Group__5__Impl ;
    public final void rule__SlotMatch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5129:1: ( rule__SlotMatch__Group__5__Impl )
            // InternalEcssLanguage.g:5130:2: rule__SlotMatch__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SlotMatch__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__5"


    // $ANTLR start "rule__SlotMatch__Group__5__Impl"
    // InternalEcssLanguage.g:5136:1: rule__SlotMatch__Group__5__Impl : ( ')' ) ;
    public final void rule__SlotMatch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5140:1: ( ( ')' ) )
            // InternalEcssLanguage.g:5141:1: ( ')' )
            {
            // InternalEcssLanguage.g:5141:1: ( ')' )
            // InternalEcssLanguage.g:5142:2: ')'
            {
             before(grammarAccess.getSlotMatchAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSlotMatchAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__Group__5__Impl"


    // $ANTLR start "rule__PropertyValue__Group__0"
    // InternalEcssLanguage.g:5152:1: rule__PropertyValue__Group__0 : rule__PropertyValue__Group__0__Impl rule__PropertyValue__Group__1 ;
    public final void rule__PropertyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5156:1: ( rule__PropertyValue__Group__0__Impl rule__PropertyValue__Group__1 )
            // InternalEcssLanguage.g:5157:2: rule__PropertyValue__Group__0__Impl rule__PropertyValue__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__PropertyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group__0"


    // $ANTLR start "rule__PropertyValue__Group__0__Impl"
    // InternalEcssLanguage.g:5164:1: rule__PropertyValue__Group__0__Impl : ( ( rule__PropertyValue__Alternatives_0 ) ) ;
    public final void rule__PropertyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5168:1: ( ( ( rule__PropertyValue__Alternatives_0 ) ) )
            // InternalEcssLanguage.g:5169:1: ( ( rule__PropertyValue__Alternatives_0 ) )
            {
            // InternalEcssLanguage.g:5169:1: ( ( rule__PropertyValue__Alternatives_0 ) )
            // InternalEcssLanguage.g:5170:2: ( rule__PropertyValue__Alternatives_0 )
            {
             before(grammarAccess.getPropertyValueAccess().getAlternatives_0()); 
            // InternalEcssLanguage.g:5171:2: ( rule__PropertyValue__Alternatives_0 )
            // InternalEcssLanguage.g:5171:3: rule__PropertyValue__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group__1"
    // InternalEcssLanguage.g:5179:1: rule__PropertyValue__Group__1 : rule__PropertyValue__Group__1__Impl ;
    public final void rule__PropertyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5183:1: ( rule__PropertyValue__Group__1__Impl )
            // InternalEcssLanguage.g:5184:2: rule__PropertyValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group__1"


    // $ANTLR start "rule__PropertyValue__Group__1__Impl"
    // InternalEcssLanguage.g:5190:1: rule__PropertyValue__Group__1__Impl : ( ( rule__PropertyValue__Group_1__0 )? ) ;
    public final void rule__PropertyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5194:1: ( ( ( rule__PropertyValue__Group_1__0 )? ) )
            // InternalEcssLanguage.g:5195:1: ( ( rule__PropertyValue__Group_1__0 )? )
            {
            // InternalEcssLanguage.g:5195:1: ( ( rule__PropertyValue__Group_1__0 )? )
            // InternalEcssLanguage.g:5196:2: ( rule__PropertyValue__Group_1__0 )?
            {
             before(grammarAccess.getPropertyValueAccess().getGroup_1()); 
            // InternalEcssLanguage.g:5197:2: ( rule__PropertyValue__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==34) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEcssLanguage.g:5197:3: rule__PropertyValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group__1__Impl"


    // $ANTLR start "rule__PropertyValue__Group_0_3__0"
    // InternalEcssLanguage.g:5206:1: rule__PropertyValue__Group_0_3__0 : rule__PropertyValue__Group_0_3__0__Impl rule__PropertyValue__Group_0_3__1 ;
    public final void rule__PropertyValue__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5210:1: ( rule__PropertyValue__Group_0_3__0__Impl rule__PropertyValue__Group_0_3__1 )
            // InternalEcssLanguage.g:5211:2: rule__PropertyValue__Group_0_3__0__Impl rule__PropertyValue__Group_0_3__1
            {
            pushFollow(FOLLOW_12);
            rule__PropertyValue__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_3__0"


    // $ANTLR start "rule__PropertyValue__Group_0_3__0__Impl"
    // InternalEcssLanguage.g:5218:1: rule__PropertyValue__Group_0_3__0__Impl : ( 'ocl' ) ;
    public final void rule__PropertyValue__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5222:1: ( ( 'ocl' ) )
            // InternalEcssLanguage.g:5223:1: ( 'ocl' )
            {
            // InternalEcssLanguage.g:5223:1: ( 'ocl' )
            // InternalEcssLanguage.g:5224:2: 'ocl'
            {
             before(grammarAccess.getPropertyValueAccess().getOclKeyword_0_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getOclKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_3__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_0_3__1"
    // InternalEcssLanguage.g:5233:1: rule__PropertyValue__Group_0_3__1 : rule__PropertyValue__Group_0_3__1__Impl ;
    public final void rule__PropertyValue__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5237:1: ( rule__PropertyValue__Group_0_3__1__Impl )
            // InternalEcssLanguage.g:5238:2: rule__PropertyValue__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_3__1"


    // $ANTLR start "rule__PropertyValue__Group_0_3__1__Impl"
    // InternalEcssLanguage.g:5244:1: rule__PropertyValue__Group_0_3__1__Impl : ( ( rule__PropertyValue__OclvalueAssignment_0_3_1 ) ) ;
    public final void rule__PropertyValue__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5248:1: ( ( ( rule__PropertyValue__OclvalueAssignment_0_3_1 ) ) )
            // InternalEcssLanguage.g:5249:1: ( ( rule__PropertyValue__OclvalueAssignment_0_3_1 ) )
            {
            // InternalEcssLanguage.g:5249:1: ( ( rule__PropertyValue__OclvalueAssignment_0_3_1 ) )
            // InternalEcssLanguage.g:5250:2: ( rule__PropertyValue__OclvalueAssignment_0_3_1 )
            {
             before(grammarAccess.getPropertyValueAccess().getOclvalueAssignment_0_3_1()); 
            // InternalEcssLanguage.g:5251:2: ( rule__PropertyValue__OclvalueAssignment_0_3_1 )
            // InternalEcssLanguage.g:5251:3: rule__PropertyValue__OclvalueAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__OclvalueAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getOclvalueAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_3__1__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1__0"
    // InternalEcssLanguage.g:5260:1: rule__PropertyValue__Group_1__0 : rule__PropertyValue__Group_1__0__Impl rule__PropertyValue__Group_1__1 ;
    public final void rule__PropertyValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5264:1: ( rule__PropertyValue__Group_1__0__Impl rule__PropertyValue__Group_1__1 )
            // InternalEcssLanguage.g:5265:2: rule__PropertyValue__Group_1__0__Impl rule__PropertyValue__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__PropertyValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__0"


    // $ANTLR start "rule__PropertyValue__Group_1__0__Impl"
    // InternalEcssLanguage.g:5272:1: rule__PropertyValue__Group_1__0__Impl : ( ( rule__PropertyValue__HasPropertyAssignment_1_0 ) ) ;
    public final void rule__PropertyValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5276:1: ( ( ( rule__PropertyValue__HasPropertyAssignment_1_0 ) ) )
            // InternalEcssLanguage.g:5277:1: ( ( rule__PropertyValue__HasPropertyAssignment_1_0 ) )
            {
            // InternalEcssLanguage.g:5277:1: ( ( rule__PropertyValue__HasPropertyAssignment_1_0 ) )
            // InternalEcssLanguage.g:5278:2: ( rule__PropertyValue__HasPropertyAssignment_1_0 )
            {
             before(grammarAccess.getPropertyValueAccess().getHasPropertyAssignment_1_0()); 
            // InternalEcssLanguage.g:5279:2: ( rule__PropertyValue__HasPropertyAssignment_1_0 )
            // InternalEcssLanguage.g:5279:3: rule__PropertyValue__HasPropertyAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__HasPropertyAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getHasPropertyAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1__1"
    // InternalEcssLanguage.g:5287:1: rule__PropertyValue__Group_1__1 : rule__PropertyValue__Group_1__1__Impl rule__PropertyValue__Group_1__2 ;
    public final void rule__PropertyValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5291:1: ( rule__PropertyValue__Group_1__1__Impl rule__PropertyValue__Group_1__2 )
            // InternalEcssLanguage.g:5292:2: rule__PropertyValue__Group_1__1__Impl rule__PropertyValue__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__PropertyValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__1"


    // $ANTLR start "rule__PropertyValue__Group_1__1__Impl"
    // InternalEcssLanguage.g:5299:1: rule__PropertyValue__Group_1__1__Impl : ( ( rule__PropertyValue__Group_1_1__0 )? ) ;
    public final void rule__PropertyValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5303:1: ( ( ( rule__PropertyValue__Group_1_1__0 )? ) )
            // InternalEcssLanguage.g:5304:1: ( ( rule__PropertyValue__Group_1_1__0 )? )
            {
            // InternalEcssLanguage.g:5304:1: ( ( rule__PropertyValue__Group_1_1__0 )? )
            // InternalEcssLanguage.g:5305:2: ( rule__PropertyValue__Group_1_1__0 )?
            {
             before(grammarAccess.getPropertyValueAccess().getGroup_1_1()); 
            // InternalEcssLanguage.g:5306:2: ( rule__PropertyValue__Group_1_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_NUMBER)||LA51_0==44||LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEcssLanguage.g:5306:3: rule__PropertyValue__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyValueAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1__2"
    // InternalEcssLanguage.g:5314:1: rule__PropertyValue__Group_1__2 : rule__PropertyValue__Group_1__2__Impl ;
    public final void rule__PropertyValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5318:1: ( rule__PropertyValue__Group_1__2__Impl )
            // InternalEcssLanguage.g:5319:2: rule__PropertyValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__2"


    // $ANTLR start "rule__PropertyValue__Group_1__2__Impl"
    // InternalEcssLanguage.g:5325:1: rule__PropertyValue__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PropertyValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5329:1: ( ( ')' ) )
            // InternalEcssLanguage.g:5330:1: ( ')' )
            {
            // InternalEcssLanguage.g:5330:1: ( ')' )
            // InternalEcssLanguage.g:5331:2: ')'
            {
             before(grammarAccess.getPropertyValueAccess().getRightParenthesisKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1__2__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1_1__0"
    // InternalEcssLanguage.g:5341:1: rule__PropertyValue__Group_1_1__0 : rule__PropertyValue__Group_1_1__0__Impl rule__PropertyValue__Group_1_1__1 ;
    public final void rule__PropertyValue__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5345:1: ( rule__PropertyValue__Group_1_1__0__Impl rule__PropertyValue__Group_1_1__1 )
            // InternalEcssLanguage.g:5346:2: rule__PropertyValue__Group_1_1__0__Impl rule__PropertyValue__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__PropertyValue__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1__0"


    // $ANTLR start "rule__PropertyValue__Group_1_1__0__Impl"
    // InternalEcssLanguage.g:5353:1: rule__PropertyValue__Group_1_1__0__Impl : ( ( rule__PropertyValue__ArgumentAssignment_1_1_0 ) ) ;
    public final void rule__PropertyValue__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5357:1: ( ( ( rule__PropertyValue__ArgumentAssignment_1_1_0 ) ) )
            // InternalEcssLanguage.g:5358:1: ( ( rule__PropertyValue__ArgumentAssignment_1_1_0 ) )
            {
            // InternalEcssLanguage.g:5358:1: ( ( rule__PropertyValue__ArgumentAssignment_1_1_0 ) )
            // InternalEcssLanguage.g:5359:2: ( rule__PropertyValue__ArgumentAssignment_1_1_0 )
            {
             before(grammarAccess.getPropertyValueAccess().getArgumentAssignment_1_1_0()); 
            // InternalEcssLanguage.g:5360:2: ( rule__PropertyValue__ArgumentAssignment_1_1_0 )
            // InternalEcssLanguage.g:5360:3: rule__PropertyValue__ArgumentAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__ArgumentAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getArgumentAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1_1__1"
    // InternalEcssLanguage.g:5368:1: rule__PropertyValue__Group_1_1__1 : rule__PropertyValue__Group_1_1__1__Impl ;
    public final void rule__PropertyValue__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5372:1: ( rule__PropertyValue__Group_1_1__1__Impl )
            // InternalEcssLanguage.g:5373:2: rule__PropertyValue__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1__1"


    // $ANTLR start "rule__PropertyValue__Group_1_1__1__Impl"
    // InternalEcssLanguage.g:5379:1: rule__PropertyValue__Group_1_1__1__Impl : ( ( rule__PropertyValue__Group_1_1_1__0 )* ) ;
    public final void rule__PropertyValue__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5383:1: ( ( ( rule__PropertyValue__Group_1_1_1__0 )* ) )
            // InternalEcssLanguage.g:5384:1: ( ( rule__PropertyValue__Group_1_1_1__0 )* )
            {
            // InternalEcssLanguage.g:5384:1: ( ( rule__PropertyValue__Group_1_1_1__0 )* )
            // InternalEcssLanguage.g:5385:2: ( rule__PropertyValue__Group_1_1_1__0 )*
            {
             before(grammarAccess.getPropertyValueAccess().getGroup_1_1_1()); 
            // InternalEcssLanguage.g:5386:2: ( rule__PropertyValue__Group_1_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==29) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalEcssLanguage.g:5386:3: rule__PropertyValue__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PropertyValue__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getPropertyValueAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1__1__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1_1_1__0"
    // InternalEcssLanguage.g:5395:1: rule__PropertyValue__Group_1_1_1__0 : rule__PropertyValue__Group_1_1_1__0__Impl rule__PropertyValue__Group_1_1_1__1 ;
    public final void rule__PropertyValue__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5399:1: ( rule__PropertyValue__Group_1_1_1__0__Impl rule__PropertyValue__Group_1_1_1__1 )
            // InternalEcssLanguage.g:5400:2: rule__PropertyValue__Group_1_1_1__0__Impl rule__PropertyValue__Group_1_1_1__1
            {
            pushFollow(FOLLOW_43);
            rule__PropertyValue__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1_1__0"


    // $ANTLR start "rule__PropertyValue__Group_1_1_1__0__Impl"
    // InternalEcssLanguage.g:5407:1: rule__PropertyValue__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyValue__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5411:1: ( ( ',' ) )
            // InternalEcssLanguage.g:5412:1: ( ',' )
            {
            // InternalEcssLanguage.g:5412:1: ( ',' )
            // InternalEcssLanguage.g:5413:2: ','
            {
             before(grammarAccess.getPropertyValueAccess().getCommaKeyword_1_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_1_1_1__1"
    // InternalEcssLanguage.g:5422:1: rule__PropertyValue__Group_1_1_1__1 : rule__PropertyValue__Group_1_1_1__1__Impl ;
    public final void rule__PropertyValue__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5426:1: ( rule__PropertyValue__Group_1_1_1__1__Impl )
            // InternalEcssLanguage.g:5427:2: rule__PropertyValue__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1_1__1"


    // $ANTLR start "rule__PropertyValue__Group_1_1_1__1__Impl"
    // InternalEcssLanguage.g:5433:1: rule__PropertyValue__Group_1_1_1__1__Impl : ( ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 ) ) ;
    public final void rule__PropertyValue__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5437:1: ( ( ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 ) ) )
            // InternalEcssLanguage.g:5438:1: ( ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 ) )
            {
            // InternalEcssLanguage.g:5438:1: ( ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 ) )
            // InternalEcssLanguage.g:5439:2: ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 )
            {
             before(grammarAccess.getPropertyValueAccess().getArgumentAssignment_1_1_1_1()); 
            // InternalEcssLanguage.g:5440:2: ( rule__PropertyValue__ArgumentAssignment_1_1_1_1 )
            // InternalEcssLanguage.g:5440:3: rule__PropertyValue__ArgumentAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__ArgumentAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getArgumentAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalEcssLanguage.g:5449:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5453:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalEcssLanguage.g:5454:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalEcssLanguage.g:5461:1: rule__Condition__Group__0__Impl : ( '[' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5465:1: ( ( '[' ) )
            // InternalEcssLanguage.g:5466:1: ( '[' )
            {
            // InternalEcssLanguage.g:5466:1: ( '[' )
            // InternalEcssLanguage.g:5467:2: '['
            {
             before(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalEcssLanguage.g:5476:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5480:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalEcssLanguage.g:5481:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalEcssLanguage.g:5488:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ExpressionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5492:1: ( ( ( rule__Condition__ExpressionAssignment_1 ) ) )
            // InternalEcssLanguage.g:5493:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            {
            // InternalEcssLanguage.g:5493:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            // InternalEcssLanguage.g:5494:2: ( rule__Condition__ExpressionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            // InternalEcssLanguage.g:5495:2: ( rule__Condition__ExpressionAssignment_1 )
            // InternalEcssLanguage.g:5495:3: rule__Condition__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalEcssLanguage.g:5503:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5507:1: ( rule__Condition__Group__2__Impl )
            // InternalEcssLanguage.g:5508:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalEcssLanguage.g:5514:1: rule__Condition__Group__2__Impl : ( ']' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5518:1: ( ( ']' ) )
            // InternalEcssLanguage.g:5519:1: ( ']' )
            {
            // InternalEcssLanguage.g:5519:1: ( ']' )
            // InternalEcssLanguage.g:5520:2: ']'
            {
             before(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Model__ConfigAssignment_0"
    // InternalEcssLanguage.g:5530:1: rule__Model__ConfigAssignment_0 : ( ruleConfig ) ;
    public final void rule__Model__ConfigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5534:1: ( ( ruleConfig ) )
            // InternalEcssLanguage.g:5535:2: ( ruleConfig )
            {
            // InternalEcssLanguage.g:5535:2: ( ruleConfig )
            // InternalEcssLanguage.g:5536:3: ruleConfig
            {
             before(grammarAccess.getModelAccess().getConfigConfigParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfigConfigParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConfigAssignment_0"


    // $ANTLR start "rule__Model__ImportStatementAssignment_1"
    // InternalEcssLanguage.g:5545:1: rule__Model__ImportStatementAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportStatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5549:1: ( ( ruleImport ) )
            // InternalEcssLanguage.g:5550:2: ( ruleImport )
            {
            // InternalEcssLanguage.g:5550:2: ( ruleImport )
            // InternalEcssLanguage.g:5551:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportStatementImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportStatementImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportStatementAssignment_1"


    // $ANTLR start "rule__Model__TemplateDefsAssignment_2_0"
    // InternalEcssLanguage.g:5560:1: rule__Model__TemplateDefsAssignment_2_0 : ( ruleTemplateDef ) ;
    public final void rule__Model__TemplateDefsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5564:1: ( ( ruleTemplateDef ) )
            // InternalEcssLanguage.g:5565:2: ( ruleTemplateDef )
            {
            // InternalEcssLanguage.g:5565:2: ( ruleTemplateDef )
            // InternalEcssLanguage.g:5566:3: ruleTemplateDef
            {
             before(grammarAccess.getModelAccess().getTemplateDefsTemplateDefParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTemplateDefsTemplateDefParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TemplateDefsAssignment_2_0"


    // $ANTLR start "rule__Model__TemplateGenDefsAssignment_2_1"
    // InternalEcssLanguage.g:5575:1: rule__Model__TemplateGenDefsAssignment_2_1 : ( ruleTemplateGenDef ) ;
    public final void rule__Model__TemplateGenDefsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5579:1: ( ( ruleTemplateGenDef ) )
            // InternalEcssLanguage.g:5580:2: ( ruleTemplateGenDef )
            {
            // InternalEcssLanguage.g:5580:2: ( ruleTemplateGenDef )
            // InternalEcssLanguage.g:5581:3: ruleTemplateGenDef
            {
             before(grammarAccess.getModelAccess().getTemplateGenDefsTemplateGenDefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateGenDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTemplateGenDefsTemplateGenDefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TemplateGenDefsAssignment_2_1"


    // $ANTLR start "rule__Model__TemplatesAssignment_2_2"
    // InternalEcssLanguage.g:5590:1: rule__Model__TemplatesAssignment_2_2 : ( ruleTemplateRule ) ;
    public final void rule__Model__TemplatesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5594:1: ( ( ruleTemplateRule ) )
            // InternalEcssLanguage.g:5595:2: ( ruleTemplateRule )
            {
            // InternalEcssLanguage.g:5595:2: ( ruleTemplateRule )
            // InternalEcssLanguage.g:5596:3: ruleTemplateRule
            {
             before(grammarAccess.getModelAccess().getTemplatesTemplateRuleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTemplatesTemplateRuleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TemplatesAssignment_2_2"


    // $ANTLR start "rule__Model__PropertiesAssignment_2_3"
    // InternalEcssLanguage.g:5605:1: rule__Model__PropertiesAssignment_2_3 : ( rulePropertyRule ) ;
    public final void rule__Model__PropertiesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5609:1: ( ( rulePropertyRule ) )
            // InternalEcssLanguage.g:5610:2: ( rulePropertyRule )
            {
            // InternalEcssLanguage.g:5610:2: ( rulePropertyRule )
            // InternalEcssLanguage.g:5611:3: rulePropertyRule
            {
             before(grammarAccess.getModelAccess().getPropertiesPropertyRuleParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesPropertyRuleParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment_2_3"


    // $ANTLR start "rule__Config__HasMinImprovementAssignment_3_0"
    // InternalEcssLanguage.g:5620:1: rule__Config__HasMinImprovementAssignment_3_0 : ( ( 'minImprovement' ) ) ;
    public final void rule__Config__HasMinImprovementAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5624:1: ( ( ( 'minImprovement' ) ) )
            // InternalEcssLanguage.g:5625:2: ( ( 'minImprovement' ) )
            {
            // InternalEcssLanguage.g:5625:2: ( ( 'minImprovement' ) )
            // InternalEcssLanguage.g:5626:3: ( 'minImprovement' )
            {
             before(grammarAccess.getConfigAccess().getHasMinImprovementMinImprovementKeyword_3_0_0()); 
            // InternalEcssLanguage.g:5627:3: ( 'minImprovement' )
            // InternalEcssLanguage.g:5628:4: 'minImprovement'
            {
             before(grammarAccess.getConfigAccess().getHasMinImprovementMinImprovementKeyword_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getHasMinImprovementMinImprovementKeyword_3_0_0()); 

            }

             after(grammarAccess.getConfigAccess().getHasMinImprovementMinImprovementKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__HasMinImprovementAssignment_3_0"


    // $ANTLR start "rule__Config__MinImprovementAssignment_3_1"
    // InternalEcssLanguage.g:5639:1: rule__Config__MinImprovementAssignment_3_1 : ( RULE_NUMBER ) ;
    public final void rule__Config__MinImprovementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5643:1: ( ( RULE_NUMBER ) )
            // InternalEcssLanguage.g:5644:2: ( RULE_NUMBER )
            {
            // InternalEcssLanguage.g:5644:2: ( RULE_NUMBER )
            // InternalEcssLanguage.g:5645:3: RULE_NUMBER
            {
             before(grammarAccess.getConfigAccess().getMinImprovementNUMBERTerminalRuleCall_3_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getMinImprovementNUMBERTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__MinImprovementAssignment_3_1"


    // $ANTLR start "rule__Config__HasMaxDegressionAssignment_4_0"
    // InternalEcssLanguage.g:5654:1: rule__Config__HasMaxDegressionAssignment_4_0 : ( ( 'maxDegression' ) ) ;
    public final void rule__Config__HasMaxDegressionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5658:1: ( ( ( 'maxDegression' ) ) )
            // InternalEcssLanguage.g:5659:2: ( ( 'maxDegression' ) )
            {
            // InternalEcssLanguage.g:5659:2: ( ( 'maxDegression' ) )
            // InternalEcssLanguage.g:5660:3: ( 'maxDegression' )
            {
             before(grammarAccess.getConfigAccess().getHasMaxDegressionMaxDegressionKeyword_4_0_0()); 
            // InternalEcssLanguage.g:5661:3: ( 'maxDegression' )
            // InternalEcssLanguage.g:5662:4: 'maxDegression'
            {
             before(grammarAccess.getConfigAccess().getHasMaxDegressionMaxDegressionKeyword_4_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getHasMaxDegressionMaxDegressionKeyword_4_0_0()); 

            }

             after(grammarAccess.getConfigAccess().getHasMaxDegressionMaxDegressionKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__HasMaxDegressionAssignment_4_0"


    // $ANTLR start "rule__Config__MaxDegressionAssignment_4_1"
    // InternalEcssLanguage.g:5673:1: rule__Config__MaxDegressionAssignment_4_1 : ( RULE_NUMBER ) ;
    public final void rule__Config__MaxDegressionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5677:1: ( ( RULE_NUMBER ) )
            // InternalEcssLanguage.g:5678:2: ( RULE_NUMBER )
            {
            // InternalEcssLanguage.g:5678:2: ( RULE_NUMBER )
            // InternalEcssLanguage.g:5679:3: RULE_NUMBER
            {
             before(grammarAccess.getConfigAccess().getMaxDegressionNUMBERTerminalRuleCall_4_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getMaxDegressionNUMBERTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__MaxDegressionAssignment_4_1"


    // $ANTLR start "rule__Config__HaxMaxThingsAssignment_5_0"
    // InternalEcssLanguage.g:5688:1: rule__Config__HaxMaxThingsAssignment_5_0 : ( ( 'maxThings' ) ) ;
    public final void rule__Config__HaxMaxThingsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5692:1: ( ( ( 'maxThings' ) ) )
            // InternalEcssLanguage.g:5693:2: ( ( 'maxThings' ) )
            {
            // InternalEcssLanguage.g:5693:2: ( ( 'maxThings' ) )
            // InternalEcssLanguage.g:5694:3: ( 'maxThings' )
            {
             before(grammarAccess.getConfigAccess().getHaxMaxThingsMaxThingsKeyword_5_0_0()); 
            // InternalEcssLanguage.g:5695:3: ( 'maxThings' )
            // InternalEcssLanguage.g:5696:4: 'maxThings'
            {
             before(grammarAccess.getConfigAccess().getHaxMaxThingsMaxThingsKeyword_5_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getHaxMaxThingsMaxThingsKeyword_5_0_0()); 

            }

             after(grammarAccess.getConfigAccess().getHaxMaxThingsMaxThingsKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__HaxMaxThingsAssignment_5_0"


    // $ANTLR start "rule__Config__MaxThingsAssignment_5_1"
    // InternalEcssLanguage.g:5707:1: rule__Config__MaxThingsAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Config__MaxThingsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5711:1: ( ( RULE_INT ) )
            // InternalEcssLanguage.g:5712:2: ( RULE_INT )
            {
            // InternalEcssLanguage.g:5712:2: ( RULE_INT )
            // InternalEcssLanguage.g:5713:3: RULE_INT
            {
             before(grammarAccess.getConfigAccess().getMaxThingsINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getMaxThingsINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__MaxThingsAssignment_5_1"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalEcssLanguage.g:5722:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5726:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:5727:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:5727:2: ( RULE_STRING )
            // InternalEcssLanguage.g:5728:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__TemplateDef__NameAssignment_1"
    // InternalEcssLanguage.g:5737:1: rule__TemplateDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TemplateDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5741:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5742:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5742:2: ( RULE_ID )
            // InternalEcssLanguage.g:5743:3: RULE_ID
            {
             before(grammarAccess.getTemplateDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__NameAssignment_1"


    // $ANTLR start "rule__TemplateDef__JavaClassAssignment_3"
    // InternalEcssLanguage.g:5752:1: rule__TemplateDef__JavaClassAssignment_3 : ( RULE_QUALIFIEDNAME ) ;
    public final void rule__TemplateDef__JavaClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5756:1: ( ( RULE_QUALIFIEDNAME ) )
            // InternalEcssLanguage.g:5757:2: ( RULE_QUALIFIEDNAME )
            {
            // InternalEcssLanguage.g:5757:2: ( RULE_QUALIFIEDNAME )
            // InternalEcssLanguage.g:5758:3: RULE_QUALIFIEDNAME
            {
             before(grammarAccess.getTemplateDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_0()); 
            match(input,RULE_QUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__JavaClassAssignment_3"


    // $ANTLR start "rule__TemplateGenDef__NameAssignment_1"
    // InternalEcssLanguage.g:5767:1: rule__TemplateGenDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TemplateGenDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5771:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5772:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5772:2: ( RULE_ID )
            // InternalEcssLanguage.g:5773:3: RULE_ID
            {
             before(grammarAccess.getTemplateGenDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__NameAssignment_1"


    // $ANTLR start "rule__TemplateGenDef__SuperRuleAssignment_2_1"
    // InternalEcssLanguage.g:5782:1: rule__TemplateGenDef__SuperRuleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateGenDef__SuperRuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5786:1: ( ( ( RULE_ID ) ) )
            // InternalEcssLanguage.g:5787:2: ( ( RULE_ID ) )
            {
            // InternalEcssLanguage.g:5787:2: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5788:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateGenDefAccess().getSuperRuleTemplateRuleOrDefCrossReference_2_1_0()); 
            // InternalEcssLanguage.g:5789:3: ( RULE_ID )
            // InternalEcssLanguage.g:5790:4: RULE_ID
            {
             before(grammarAccess.getTemplateGenDefAccess().getSuperRuleTemplateRuleOrDefIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getSuperRuleTemplateRuleOrDefIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTemplateGenDefAccess().getSuperRuleTemplateRuleOrDefCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__SuperRuleAssignment_2_1"


    // $ANTLR start "rule__TemplateGenDef__JavaClassAssignment_3_1"
    // InternalEcssLanguage.g:5801:1: rule__TemplateGenDef__JavaClassAssignment_3_1 : ( RULE_QUALIFIEDNAME ) ;
    public final void rule__TemplateGenDef__JavaClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5805:1: ( ( RULE_QUALIFIEDNAME ) )
            // InternalEcssLanguage.g:5806:2: ( RULE_QUALIFIEDNAME )
            {
            // InternalEcssLanguage.g:5806:2: ( RULE_QUALIFIEDNAME )
            // InternalEcssLanguage.g:5807:3: RULE_QUALIFIEDNAME
            {
             before(grammarAccess.getTemplateGenDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_1_0()); 
            match(input,RULE_QUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getTemplateGenDefAccess().getJavaClassQUALIFIEDNAMETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGenDef__JavaClassAssignment_3_1"


    // $ANTLR start "rule__BasicTemplateRule__TypeAssignment_1"
    // InternalEcssLanguage.g:5816:1: rule__BasicTemplateRule__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BasicTemplateRule__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5820:1: ( ( ( RULE_ID ) ) )
            // InternalEcssLanguage.g:5821:2: ( ( RULE_ID ) )
            {
            // InternalEcssLanguage.g:5821:2: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5822:3: ( RULE_ID )
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getTypeTemplateDefCrossReference_1_0()); 
            // InternalEcssLanguage.g:5823:3: ( RULE_ID )
            // InternalEcssLanguage.g:5824:4: RULE_ID
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getTypeTemplateDefIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getTypeTemplateDefIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBasicTemplateRuleAccess().getTypeTemplateDefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__TypeAssignment_1"


    // $ANTLR start "rule__BasicTemplateRule__NameAssignment_2"
    // InternalEcssLanguage.g:5835:1: rule__BasicTemplateRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BasicTemplateRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5839:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5840:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5840:2: ( RULE_ID )
            // InternalEcssLanguage.g:5841:3: RULE_ID
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__NameAssignment_2"


    // $ANTLR start "rule__BasicTemplateRule__GroupsAssignment_3_1"
    // InternalEcssLanguage.g:5850:1: rule__BasicTemplateRule__GroupsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__BasicTemplateRule__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5854:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5855:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5855:2: ( RULE_ID )
            // InternalEcssLanguage.g:5856:3: RULE_ID
            {
             before(grammarAccess.getBasicTemplateRuleAccess().getGroupsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicTemplateRuleAccess().getGroupsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicTemplateRule__GroupsAssignment_3_1"


    // $ANTLR start "rule__TemplateGeneratorRule__TypeAssignment_1"
    // InternalEcssLanguage.g:5865:1: rule__TemplateGeneratorRule__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateGeneratorRule__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5869:1: ( ( ( RULE_ID ) ) )
            // InternalEcssLanguage.g:5870:2: ( ( RULE_ID ) )
            {
            // InternalEcssLanguage.g:5870:2: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5871:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeTemplateGenDefCrossReference_1_0()); 
            // InternalEcssLanguage.g:5872:3: ( RULE_ID )
            // InternalEcssLanguage.g:5873:4: RULE_ID
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeTemplateGenDefIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeTemplateGenDefIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeTemplateGenDefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__TypeAssignment_1"


    // $ANTLR start "rule__TemplateGeneratorRule__NameAssignment_2"
    // InternalEcssLanguage.g:5884:1: rule__TemplateGeneratorRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TemplateGeneratorRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5888:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5889:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5889:2: ( RULE_ID )
            // InternalEcssLanguage.g:5890:3: RULE_ID
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__NameAssignment_2"


    // $ANTLR start "rule__TemplateGeneratorRule__GroupsAssignment_3_1"
    // InternalEcssLanguage.g:5899:1: rule__TemplateGeneratorRule__GroupsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__TemplateGeneratorRule__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5903:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5904:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5904:2: ( RULE_ID )
            // InternalEcssLanguage.g:5905:3: RULE_ID
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateGeneratorRuleAccess().getGroupsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__GroupsAssignment_3_1"


    // $ANTLR start "rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0"
    // InternalEcssLanguage.g:5914:1: rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0 : ( ruleTypeDef ) ;
    public final void rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5918:1: ( ( ruleTypeDef ) )
            // InternalEcssLanguage.g:5919:2: ( ruleTypeDef )
            {
            // InternalEcssLanguage.g:5919:2: ( ruleTypeDef )
            // InternalEcssLanguage.g:5920:3: ruleTypeDef
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__TypeDefAssignment_4_1_0"


    // $ANTLR start "rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1"
    // InternalEcssLanguage.g:5929:1: rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1 : ( ruleTypeDef ) ;
    public final void rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5933:1: ( ( ruleTypeDef ) )
            // InternalEcssLanguage.g:5934:2: ( ruleTypeDef )
            {
            // InternalEcssLanguage.g:5934:2: ( ruleTypeDef )
            // InternalEcssLanguage.g:5935:3: ruleTypeDef
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTypeDefTypeDefParserRuleCall_4_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__TypeDefAssignment_4_1_1_1"


    // $ANTLR start "rule__TemplateGeneratorRule__IdPartAssignment_5_0_1"
    // InternalEcssLanguage.g:5944:1: rule__TemplateGeneratorRule__IdPartAssignment_5_0_1 : ( ruleTemplateRulePart ) ;
    public final void rule__TemplateGeneratorRule__IdPartAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5948:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:5949:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:5949:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:5950:3: ruleTemplateRulePart
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__IdPartAssignment_5_0_1"


    // $ANTLR start "rule__TemplateGeneratorRule__IdPartAssignment_5_1_1"
    // InternalEcssLanguage.g:5959:1: rule__TemplateGeneratorRule__IdPartAssignment_5_1_1 : ( ruleTemplateRulePart ) ;
    public final void rule__TemplateGeneratorRule__IdPartAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5963:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:5964:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:5964:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:5965:3: ruleTemplateRulePart
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleAccess().getIdPartTemplateRulePartParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__IdPartAssignment_5_1_1"


    // $ANTLR start "rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1"
    // InternalEcssLanguage.g:5974:1: rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1 : ( ruleTemplateRulePart ) ;
    public final void rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5978:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:5979:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:5979:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:5980:3: ruleTemplateRulePart
            {
             before(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartTemplateRulePartParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getTemplateGeneratorRuleAccess().getTemplateRulePartTemplateRulePartParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateGeneratorRule__TemplateRulePartAssignment_6_1"


    // $ANTLR start "rule__TypeDef__TypeAssignment_0"
    // InternalEcssLanguage.g:5989:1: rule__TypeDef__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__TypeDef__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:5993:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:5994:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:5994:2: ( RULE_ID )
            // InternalEcssLanguage.g:5995:3: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__TypeAssignment_0"


    // $ANTLR start "rule__TypeDef__NameAssignment_1"
    // InternalEcssLanguage.g:6004:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6008:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6009:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6009:2: ( RULE_ID )
            // InternalEcssLanguage.g:6010:3: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDef__NameAssignment_1"


    // $ANTLR start "rule__ForEachExpression__TypeAssignment_1"
    // InternalEcssLanguage.g:6019:1: rule__ForEachExpression__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForEachExpression__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6023:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6024:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6024:2: ( RULE_ID )
            // InternalEcssLanguage.g:6025:3: RULE_ID
            {
             before(grammarAccess.getForEachExpressionAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__TypeAssignment_1"


    // $ANTLR start "rule__ForEachExpression__VariableAssignment_2"
    // InternalEcssLanguage.g:6034:1: rule__ForEachExpression__VariableAssignment_2 : ( RULE_ID ) ;
    public final void rule__ForEachExpression__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6038:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6039:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6039:2: ( RULE_ID )
            // InternalEcssLanguage.g:6040:3: RULE_ID
            {
             before(grammarAccess.getForEachExpressionAccess().getVariableIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getVariableIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__VariableAssignment_2"


    // $ANTLR start "rule__ForEachExpression__ExprVarAssignment_4_0"
    // InternalEcssLanguage.g:6049:1: rule__ForEachExpression__ExprVarAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__ForEachExpression__ExprVarAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6053:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6054:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6054:2: ( RULE_ID )
            // InternalEcssLanguage.g:6055:3: RULE_ID
            {
             before(grammarAccess.getForEachExpressionAccess().getExprVarIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getExprVarIDTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__ExprVarAssignment_4_0"


    // $ANTLR start "rule__ForEachExpression__CompleteExprAssignment_4_1"
    // InternalEcssLanguage.g:6064:1: rule__ForEachExpression__CompleteExprAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ForEachExpression__CompleteExprAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6068:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6069:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6069:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6070:3: RULE_STRING
            {
             before(grammarAccess.getForEachExpressionAccess().getCompleteExprSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForEachExpressionAccess().getCompleteExprSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__CompleteExprAssignment_4_1"


    // $ANTLR start "rule__ForEachExpression__JoinAssignment_5_1"
    // InternalEcssLanguage.g:6079:1: rule__ForEachExpression__JoinAssignment_5_1 : ( ruleTemplateRulePart ) ;
    public final void rule__ForEachExpression__JoinAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6083:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:6084:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:6084:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:6085:3: ruleTemplateRulePart
            {
             before(grammarAccess.getForEachExpressionAccess().getJoinTemplateRulePartParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getForEachExpressionAccess().getJoinTemplateRulePartParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__JoinAssignment_5_1"


    // $ANTLR start "rule__ForEachExpression__BodyAssignment_7"
    // InternalEcssLanguage.g:6094:1: rule__ForEachExpression__BodyAssignment_7 : ( ruleTemplateRulePart ) ;
    public final void rule__ForEachExpression__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6098:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:6099:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:6099:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:6100:3: ruleTemplateRulePart
            {
             before(grammarAccess.getForEachExpressionAccess().getBodyTemplateRulePartParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getForEachExpressionAccess().getBodyTemplateRulePartParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForEachExpression__BodyAssignment_7"


    // $ANTLR start "rule__IfExpression__ValAssignment_2"
    // InternalEcssLanguage.g:6109:1: rule__IfExpression__ValAssignment_2 : ( RULE_ID ) ;
    public final void rule__IfExpression__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6113:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6114:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6114:2: ( RULE_ID )
            // InternalEcssLanguage.g:6115:3: RULE_ID
            {
             before(grammarAccess.getIfExpressionAccess().getValIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIfExpressionAccess().getValIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ValAssignment_2"


    // $ANTLR start "rule__IfExpression__ThenAssignment_5"
    // InternalEcssLanguage.g:6124:1: rule__IfExpression__ThenAssignment_5 : ( ruleTemplateRulePart ) ;
    public final void rule__IfExpression__ThenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6128:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:6129:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:6129:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:6130:3: ruleTemplateRulePart
            {
             before(grammarAccess.getIfExpressionAccess().getThenTemplateRulePartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getIfExpressionAccess().getThenTemplateRulePartParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ThenAssignment_5"


    // $ANTLR start "rule__IfExpression__ElseAssignment_7_2"
    // InternalEcssLanguage.g:6139:1: rule__IfExpression__ElseAssignment_7_2 : ( ruleTemplateRulePart ) ;
    public final void rule__IfExpression__ElseAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6143:1: ( ( ruleTemplateRulePart ) )
            // InternalEcssLanguage.g:6144:2: ( ruleTemplateRulePart )
            {
            // InternalEcssLanguage.g:6144:2: ( ruleTemplateRulePart )
            // InternalEcssLanguage.g:6145:3: ruleTemplateRulePart
            {
             before(grammarAccess.getIfExpressionAccess().getElseTemplateRulePartParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateRulePart();

            state._fsp--;

             after(grammarAccess.getIfExpressionAccess().getElseTemplateRulePartParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__ElseAssignment_7_2"


    // $ANTLR start "rule__StaticTemplateRulePart__ValueAssignment"
    // InternalEcssLanguage.g:6154:1: rule__StaticTemplateRulePart__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StaticTemplateRulePart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6158:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6159:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6159:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6160:3: RULE_STRING
            {
             before(grammarAccess.getStaticTemplateRulePartAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStaticTemplateRulePartAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticTemplateRulePart__ValueAssignment"


    // $ANTLR start "rule__TemplateFunctionCall__IsReferenceAssignment_1"
    // InternalEcssLanguage.g:6169:1: rule__TemplateFunctionCall__IsReferenceAssignment_1 : ( ( '@' ) ) ;
    public final void rule__TemplateFunctionCall__IsReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6173:1: ( ( ( '@' ) ) )
            // InternalEcssLanguage.g:6174:2: ( ( '@' ) )
            {
            // InternalEcssLanguage.g:6174:2: ( ( '@' ) )
            // InternalEcssLanguage.g:6175:3: ( '@' )
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceCommercialAtKeyword_1_0()); 
            // InternalEcssLanguage.g:6176:3: ( '@' )
            // InternalEcssLanguage.g:6177:4: '@'
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceCommercialAtKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceCommercialAtKeyword_1_0()); 

            }

             after(grammarAccess.getTemplateFunctionCallAccess().getIsReferenceCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__IsReferenceAssignment_1"


    // $ANTLR start "rule__TemplateFunctionCall__NameAssignment_2"
    // InternalEcssLanguage.g:6188:1: rule__TemplateFunctionCall__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TemplateFunctionCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6192:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6193:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6193:2: ( RULE_ID )
            // InternalEcssLanguage.g:6194:3: RULE_ID
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateFunctionCallAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__NameAssignment_2"


    // $ANTLR start "rule__TemplateFunctionCall__ParValueAssignment_4_0"
    // InternalEcssLanguage.g:6203:1: rule__TemplateFunctionCall__ParValueAssignment_4_0 : ( ruleTemplateParameterValue ) ;
    public final void rule__TemplateFunctionCall__ParValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6207:1: ( ( ruleTemplateParameterValue ) )
            // InternalEcssLanguage.g:6208:2: ( ruleTemplateParameterValue )
            {
            // InternalEcssLanguage.g:6208:2: ( ruleTemplateParameterValue )
            // InternalEcssLanguage.g:6209:3: ruleTemplateParameterValue
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateParameterValue();

            state._fsp--;

             after(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__ParValueAssignment_4_0"


    // $ANTLR start "rule__TemplateFunctionCall__ParValueAssignment_4_1_1"
    // InternalEcssLanguage.g:6218:1: rule__TemplateFunctionCall__ParValueAssignment_4_1_1 : ( ruleTemplateParameterValue ) ;
    public final void rule__TemplateFunctionCall__ParValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6222:1: ( ( ruleTemplateParameterValue ) )
            // InternalEcssLanguage.g:6223:2: ( ruleTemplateParameterValue )
            {
            // InternalEcssLanguage.g:6223:2: ( ruleTemplateParameterValue )
            // InternalEcssLanguage.g:6224:3: ruleTemplateParameterValue
            {
             before(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateParameterValue();

            state._fsp--;

             after(grammarAccess.getTemplateFunctionCallAccess().getParValueTemplateParameterValueParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateFunctionCall__ParValueAssignment_4_1_1"


    // $ANTLR start "rule__SlotCall__NameAssignment_1"
    // InternalEcssLanguage.g:6233:1: rule__SlotCall__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SlotCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6237:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6238:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6238:2: ( RULE_ID )
            // InternalEcssLanguage.g:6239:3: RULE_ID
            {
             before(grammarAccess.getSlotCallAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__NameAssignment_1"


    // $ANTLR start "rule__SlotCall__MinValueAssignment_2_1"
    // InternalEcssLanguage.g:6248:1: rule__SlotCall__MinValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SlotCall__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6252:1: ( ( RULE_INT ) )
            // InternalEcssLanguage.g:6253:2: ( RULE_INT )
            {
            // InternalEcssLanguage.g:6253:2: ( RULE_INT )
            // InternalEcssLanguage.g:6254:3: RULE_INT
            {
             before(grammarAccess.getSlotCallAccess().getMinValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getMinValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__MinValueAssignment_2_1"


    // $ANTLR start "rule__SlotCall__MaxValueAssignment_2_2_1"
    // InternalEcssLanguage.g:6263:1: rule__SlotCall__MaxValueAssignment_2_2_1 : ( RULE_INT ) ;
    public final void rule__SlotCall__MaxValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6267:1: ( ( RULE_INT ) )
            // InternalEcssLanguage.g:6268:2: ( RULE_INT )
            {
            // InternalEcssLanguage.g:6268:2: ( RULE_INT )
            // InternalEcssLanguage.g:6269:3: RULE_INT
            {
             before(grammarAccess.getSlotCallAccess().getMaxValueINTTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSlotCallAccess().getMaxValueINTTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotCall__MaxValueAssignment_2_2_1"


    // $ANTLR start "rule__LocalOrValueCall__NameAssignment_1_0"
    // InternalEcssLanguage.g:6278:1: rule__LocalOrValueCall__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__LocalOrValueCall__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6282:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6283:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6283:2: ( RULE_ID )
            // InternalEcssLanguage.g:6284:3: RULE_ID
            {
             before(grammarAccess.getLocalOrValueCallAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalOrValueCallAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__NameAssignment_1_0"


    // $ANTLR start "rule__LocalOrValueCall__NameAssignment_1_1"
    // InternalEcssLanguage.g:6293:1: rule__LocalOrValueCall__NameAssignment_1_1 : ( RULE_QUALIFIEDNAME ) ;
    public final void rule__LocalOrValueCall__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6297:1: ( ( RULE_QUALIFIEDNAME ) )
            // InternalEcssLanguage.g:6298:2: ( RULE_QUALIFIEDNAME )
            {
            // InternalEcssLanguage.g:6298:2: ( RULE_QUALIFIEDNAME )
            // InternalEcssLanguage.g:6299:3: RULE_QUALIFIEDNAME
            {
             before(grammarAccess.getLocalOrValueCallAccess().getNameQUALIFIEDNAMETerminalRuleCall_1_1_0()); 
            match(input,RULE_QUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getLocalOrValueCallAccess().getNameQUALIFIEDNAMETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalOrValueCall__NameAssignment_1_1"


    // $ANTLR start "rule__LocalEvaluationCall__ValueAssignment_1"
    // InternalEcssLanguage.g:6308:1: rule__LocalEvaluationCall__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LocalEvaluationCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6312:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6313:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6313:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6314:3: RULE_STRING
            {
             before(grammarAccess.getLocalEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocalEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalEvaluationCall__ValueAssignment_1"


    // $ANTLR start "rule__TemplateParameterValue__PropNameAssignment_0_1"
    // InternalEcssLanguage.g:6323:1: rule__TemplateParameterValue__PropNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__TemplateParameterValue__PropNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6327:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6328:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6328:2: ( RULE_ID )
            // InternalEcssLanguage.g:6329:3: RULE_ID
            {
             before(grammarAccess.getTemplateParameterValueAccess().getPropNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getPropNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__PropNameAssignment_0_1"


    // $ANTLR start "rule__TemplateParameterValue__VarNameAssignment_1"
    // InternalEcssLanguage.g:6338:1: rule__TemplateParameterValue__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TemplateParameterValue__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6342:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6343:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6343:2: ( RULE_ID )
            // InternalEcssLanguage.g:6344:3: RULE_ID
            {
             before(grammarAccess.getTemplateParameterValueAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getVarNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__VarNameAssignment_1"


    // $ANTLR start "rule__TemplateParameterValue__SlotNameAssignment_2_1"
    // InternalEcssLanguage.g:6353:1: rule__TemplateParameterValue__SlotNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__TemplateParameterValue__SlotNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6357:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6358:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6358:2: ( RULE_ID )
            // InternalEcssLanguage.g:6359:3: RULE_ID
            {
             before(grammarAccess.getTemplateParameterValueAccess().getSlotNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getSlotNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__SlotNameAssignment_2_1"


    // $ANTLR start "rule__TemplateParameterValue__MinValueAssignment_2_2_1"
    // InternalEcssLanguage.g:6368:1: rule__TemplateParameterValue__MinValueAssignment_2_2_1 : ( RULE_INT ) ;
    public final void rule__TemplateParameterValue__MinValueAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6372:1: ( ( RULE_INT ) )
            // InternalEcssLanguage.g:6373:2: ( RULE_INT )
            {
            // InternalEcssLanguage.g:6373:2: ( RULE_INT )
            // InternalEcssLanguage.g:6374:3: RULE_INT
            {
             before(grammarAccess.getTemplateParameterValueAccess().getMinValueINTTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getMinValueINTTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__MinValueAssignment_2_2_1"


    // $ANTLR start "rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1"
    // InternalEcssLanguage.g:6383:1: rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1 : ( RULE_INT ) ;
    public final void rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6387:1: ( ( RULE_INT ) )
            // InternalEcssLanguage.g:6388:2: ( RULE_INT )
            {
            // InternalEcssLanguage.g:6388:2: ( RULE_INT )
            // InternalEcssLanguage.g:6389:3: RULE_INT
            {
             before(grammarAccess.getTemplateParameterValueAccess().getMaxValueINTTerminalRuleCall_2_2_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getMaxValueINTTerminalRuleCall_2_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__MaxValueAssignment_2_2_2_1"


    // $ANTLR start "rule__TemplateParameterValue__DirectAssignment_3"
    // InternalEcssLanguage.g:6398:1: rule__TemplateParameterValue__DirectAssignment_3 : ( RULE_STRING ) ;
    public final void rule__TemplateParameterValue__DirectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6402:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6403:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6403:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6404:3: RULE_STRING
            {
             before(grammarAccess.getTemplateParameterValueAccess().getDirectSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTemplateParameterValueAccess().getDirectSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateParameterValue__DirectAssignment_3"


    // $ANTLR start "rule__EvaluationCall__ValueAssignment_1"
    // InternalEcssLanguage.g:6413:1: rule__EvaluationCall__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EvaluationCall__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6417:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6418:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6418:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6419:3: RULE_STRING
            {
             before(grammarAccess.getEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvaluationCallAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationCall__ValueAssignment_1"


    // $ANTLR start "rule__PropertyRule__SelectorAssignment_1"
    // InternalEcssLanguage.g:6428:1: rule__PropertyRule__SelectorAssignment_1 : ( ruleSelector ) ;
    public final void rule__PropertyRule__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6432:1: ( ( ruleSelector ) )
            // InternalEcssLanguage.g:6433:2: ( ruleSelector )
            {
            // InternalEcssLanguage.g:6433:2: ( ruleSelector )
            // InternalEcssLanguage.g:6434:3: ruleSelector
            {
             before(grammarAccess.getPropertyRuleAccess().getSelectorSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getPropertyRuleAccess().getSelectorSelectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__SelectorAssignment_1"


    // $ANTLR start "rule__PropertyRule__PropertyAssignment_3"
    // InternalEcssLanguage.g:6443:1: rule__PropertyRule__PropertyAssignment_3 : ( ruleProperty ) ;
    public final void rule__PropertyRule__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6447:1: ( ( ruleProperty ) )
            // InternalEcssLanguage.g:6448:2: ( ruleProperty )
            {
            // InternalEcssLanguage.g:6448:2: ( ruleProperty )
            // InternalEcssLanguage.g:6449:3: ruleProperty
            {
             before(grammarAccess.getPropertyRuleAccess().getPropertyPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRuleAccess().getPropertyPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyRule__PropertyAssignment_3"


    // $ANTLR start "rule__Selector__SelectorsAssignment"
    // InternalEcssLanguage.g:6458:1: rule__Selector__SelectorsAssignment : ( ruleSingleSelector ) ;
    public final void rule__Selector__SelectorsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6462:1: ( ( ruleSingleSelector ) )
            // InternalEcssLanguage.g:6463:2: ( ruleSingleSelector )
            {
            // InternalEcssLanguage.g:6463:2: ( ruleSingleSelector )
            // InternalEcssLanguage.g:6464:3: ruleSingleSelector
            {
             before(grammarAccess.getSelectorAccess().getSelectorsSingleSelectorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorsSingleSelectorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorsAssignment"


    // $ANTLR start "rule__SingleSelector__AllTypesAssignment_0_0"
    // InternalEcssLanguage.g:6473:1: rule__SingleSelector__AllTypesAssignment_0_0 : ( ( '*' ) ) ;
    public final void rule__SingleSelector__AllTypesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6477:1: ( ( ( '*' ) ) )
            // InternalEcssLanguage.g:6478:2: ( ( '*' ) )
            {
            // InternalEcssLanguage.g:6478:2: ( ( '*' ) )
            // InternalEcssLanguage.g:6479:3: ( '*' )
            {
             before(grammarAccess.getSingleSelectorAccess().getAllTypesAsteriskKeyword_0_0_0()); 
            // InternalEcssLanguage.g:6480:3: ( '*' )
            // InternalEcssLanguage.g:6481:4: '*'
            {
             before(grammarAccess.getSingleSelectorAccess().getAllTypesAsteriskKeyword_0_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSingleSelectorAccess().getAllTypesAsteriskKeyword_0_0_0()); 

            }

             after(grammarAccess.getSingleSelectorAccess().getAllTypesAsteriskKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__AllTypesAssignment_0_0"


    // $ANTLR start "rule__SingleSelector__ReferredNameAssignment_0_1"
    // InternalEcssLanguage.g:6492:1: rule__SingleSelector__ReferredNameAssignment_0_1 : ( ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 ) ) ;
    public final void rule__SingleSelector__ReferredNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6496:1: ( ( ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 ) ) )
            // InternalEcssLanguage.g:6497:2: ( ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 ) )
            {
            // InternalEcssLanguage.g:6497:2: ( ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 ) )
            // InternalEcssLanguage.g:6498:3: ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 )
            {
             before(grammarAccess.getSingleSelectorAccess().getReferredNameAlternatives_0_1_0()); 
            // InternalEcssLanguage.g:6499:3: ( rule__SingleSelector__ReferredNameAlternatives_0_1_0 )
            // InternalEcssLanguage.g:6499:4: rule__SingleSelector__ReferredNameAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleSelector__ReferredNameAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleSelectorAccess().getReferredNameAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__ReferredNameAssignment_0_1"


    // $ANTLR start "rule__SingleSelector__ConditionAssignment_1"
    // InternalEcssLanguage.g:6507:1: rule__SingleSelector__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__SingleSelector__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6511:1: ( ( ruleCondition ) )
            // InternalEcssLanguage.g:6512:2: ( ruleCondition )
            {
            // InternalEcssLanguage.g:6512:2: ( ruleCondition )
            // InternalEcssLanguage.g:6513:3: ruleCondition
            {
             before(grammarAccess.getSingleSelectorAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSingleSelectorAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleSelector__ConditionAssignment_1"


    // $ANTLR start "rule__Property__TemplateMatchAssignment_0_0"
    // InternalEcssLanguage.g:6522:1: rule__Property__TemplateMatchAssignment_0_0 : ( ruleTemplateMatch ) ;
    public final void rule__Property__TemplateMatchAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6526:1: ( ( ruleTemplateMatch ) )
            // InternalEcssLanguage.g:6527:2: ( ruleTemplateMatch )
            {
            // InternalEcssLanguage.g:6527:2: ( ruleTemplateMatch )
            // InternalEcssLanguage.g:6528:3: ruleTemplateMatch
            {
             before(grammarAccess.getPropertyAccess().getTemplateMatchTemplateMatchParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateMatch();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTemplateMatchTemplateMatchParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TemplateMatchAssignment_0_0"


    // $ANTLR start "rule__Property__SlotMatchAssignment_0_1"
    // InternalEcssLanguage.g:6537:1: rule__Property__SlotMatchAssignment_0_1 : ( ruleSlotMatch ) ;
    public final void rule__Property__SlotMatchAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6541:1: ( ( ruleSlotMatch ) )
            // InternalEcssLanguage.g:6542:2: ( ruleSlotMatch )
            {
            // InternalEcssLanguage.g:6542:2: ( ruleSlotMatch )
            // InternalEcssLanguage.g:6543:3: ruleSlotMatch
            {
             before(grammarAccess.getPropertyAccess().getSlotMatchSlotMatchParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSlotMatch();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getSlotMatchSlotMatchParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__SlotMatchAssignment_0_1"


    // $ANTLR start "rule__Property__NameAssignment_0_2"
    // InternalEcssLanguage.g:6552:1: rule__Property__NameAssignment_0_2 : ( ( rule__Property__NameAlternatives_0_2_0 ) ) ;
    public final void rule__Property__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6556:1: ( ( ( rule__Property__NameAlternatives_0_2_0 ) ) )
            // InternalEcssLanguage.g:6557:2: ( ( rule__Property__NameAlternatives_0_2_0 ) )
            {
            // InternalEcssLanguage.g:6557:2: ( ( rule__Property__NameAlternatives_0_2_0 ) )
            // InternalEcssLanguage.g:6558:3: ( rule__Property__NameAlternatives_0_2_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAlternatives_0_2_0()); 
            // InternalEcssLanguage.g:6559:3: ( rule__Property__NameAlternatives_0_2_0 )
            // InternalEcssLanguage.g:6559:4: rule__Property__NameAlternatives_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAlternatives_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAlternatives_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0_2"


    // $ANTLR start "rule__Property__ConditionAssignment_1"
    // InternalEcssLanguage.g:6567:1: rule__Property__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Property__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6571:1: ( ( ruleCondition ) )
            // InternalEcssLanguage.g:6572:2: ( ruleCondition )
            {
            // InternalEcssLanguage.g:6572:2: ( ruleCondition )
            // InternalEcssLanguage.g:6573:3: ruleCondition
            {
             before(grammarAccess.getPropertyAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ConditionAssignment_1"


    // $ANTLR start "rule__Property__ValueAssignment_3"
    // InternalEcssLanguage.g:6582:1: rule__Property__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6586:1: ( ( rulePropertyValue ) )
            // InternalEcssLanguage.g:6587:2: ( rulePropertyValue )
            {
            // InternalEcssLanguage.g:6587:2: ( rulePropertyValue )
            // InternalEcssLanguage.g:6588:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_3"


    // $ANTLR start "rule__TemplateMatch__SelectorAssignment_2"
    // InternalEcssLanguage.g:6597:1: rule__TemplateMatch__SelectorAssignment_2 : ( ruleSingleSelector ) ;
    public final void rule__TemplateMatch__SelectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6601:1: ( ( ruleSingleSelector ) )
            // InternalEcssLanguage.g:6602:2: ( ruleSingleSelector )
            {
            // InternalEcssLanguage.g:6602:2: ( ruleSingleSelector )
            // InternalEcssLanguage.g:6603:3: ruleSingleSelector
            {
             before(grammarAccess.getTemplateMatchAccess().getSelectorSingleSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleSelector();

            state._fsp--;

             after(grammarAccess.getTemplateMatchAccess().getSelectorSingleSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateMatch__SelectorAssignment_2"


    // $ANTLR start "rule__SlotMatch__FirstAssignment_2"
    // InternalEcssLanguage.g:6612:1: rule__SlotMatch__FirstAssignment_2 : ( ruleSingleSelector ) ;
    public final void rule__SlotMatch__FirstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6616:1: ( ( ruleSingleSelector ) )
            // InternalEcssLanguage.g:6617:2: ( ruleSingleSelector )
            {
            // InternalEcssLanguage.g:6617:2: ( ruleSingleSelector )
            // InternalEcssLanguage.g:6618:3: ruleSingleSelector
            {
             before(grammarAccess.getSlotMatchAccess().getFirstSingleSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleSelector();

            state._fsp--;

             after(grammarAccess.getSlotMatchAccess().getFirstSingleSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__FirstAssignment_2"


    // $ANTLR start "rule__SlotMatch__SecondAssignment_4"
    // InternalEcssLanguage.g:6627:1: rule__SlotMatch__SecondAssignment_4 : ( ruleSingleSelector ) ;
    public final void rule__SlotMatch__SecondAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6631:1: ( ( ruleSingleSelector ) )
            // InternalEcssLanguage.g:6632:2: ( ruleSingleSelector )
            {
            // InternalEcssLanguage.g:6632:2: ( ruleSingleSelector )
            // InternalEcssLanguage.g:6633:3: ruleSingleSelector
            {
             before(grammarAccess.getSlotMatchAccess().getSecondSingleSelectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleSelector();

            state._fsp--;

             after(grammarAccess.getSlotMatchAccess().getSecondSingleSelectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlotMatch__SecondAssignment_4"


    // $ANTLR start "rule__PropertyValue__ValueAssignment_0_0"
    // InternalEcssLanguage.g:6642:1: rule__PropertyValue__ValueAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__PropertyValue__ValueAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6646:1: ( ( RULE_ID ) )
            // InternalEcssLanguage.g:6647:2: ( RULE_ID )
            {
            // InternalEcssLanguage.g:6647:2: ( RULE_ID )
            // InternalEcssLanguage.g:6648:3: RULE_ID
            {
             before(grammarAccess.getPropertyValueAccess().getValueIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getValueIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ValueAssignment_0_0"


    // $ANTLR start "rule__PropertyValue__ValueAssignment_0_1"
    // InternalEcssLanguage.g:6657:1: rule__PropertyValue__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PropertyValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6661:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6662:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6662:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6663:3: RULE_STRING
            {
             before(grammarAccess.getPropertyValueAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ValueAssignment_0_1"


    // $ANTLR start "rule__PropertyValue__ValueNumbAssignment_0_2"
    // InternalEcssLanguage.g:6672:1: rule__PropertyValue__ValueNumbAssignment_0_2 : ( rulePossiblySignedNumber ) ;
    public final void rule__PropertyValue__ValueNumbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6676:1: ( ( rulePossiblySignedNumber ) )
            // InternalEcssLanguage.g:6677:2: ( rulePossiblySignedNumber )
            {
            // InternalEcssLanguage.g:6677:2: ( rulePossiblySignedNumber )
            // InternalEcssLanguage.g:6678:3: rulePossiblySignedNumber
            {
             before(grammarAccess.getPropertyValueAccess().getValueNumbPossiblySignedNumberParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePossiblySignedNumber();

            state._fsp--;

             after(grammarAccess.getPropertyValueAccess().getValueNumbPossiblySignedNumberParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ValueNumbAssignment_0_2"


    // $ANTLR start "rule__PropertyValue__OclvalueAssignment_0_3_1"
    // InternalEcssLanguage.g:6687:1: rule__PropertyValue__OclvalueAssignment_0_3_1 : ( ruleSpecificationCS ) ;
    public final void rule__PropertyValue__OclvalueAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6691:1: ( ( ruleSpecificationCS ) )
            // InternalEcssLanguage.g:6692:2: ( ruleSpecificationCS )
            {
            // InternalEcssLanguage.g:6692:2: ( ruleSpecificationCS )
            // InternalEcssLanguage.g:6693:3: ruleSpecificationCS
            {
             before(grammarAccess.getPropertyValueAccess().getOclvalueSpecificationCSParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecificationCS();

            state._fsp--;

             after(grammarAccess.getPropertyValueAccess().getOclvalueSpecificationCSParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__OclvalueAssignment_0_3_1"


    // $ANTLR start "rule__PropertyValue__HasPropertyAssignment_1_0"
    // InternalEcssLanguage.g:6702:1: rule__PropertyValue__HasPropertyAssignment_1_0 : ( ( '(' ) ) ;
    public final void rule__PropertyValue__HasPropertyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6706:1: ( ( ( '(' ) ) )
            // InternalEcssLanguage.g:6707:2: ( ( '(' ) )
            {
            // InternalEcssLanguage.g:6707:2: ( ( '(' ) )
            // InternalEcssLanguage.g:6708:3: ( '(' )
            {
             before(grammarAccess.getPropertyValueAccess().getHasPropertyLeftParenthesisKeyword_1_0_0()); 
            // InternalEcssLanguage.g:6709:3: ( '(' )
            // InternalEcssLanguage.g:6710:4: '('
            {
             before(grammarAccess.getPropertyValueAccess().getHasPropertyLeftParenthesisKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getHasPropertyLeftParenthesisKeyword_1_0_0()); 

            }

             after(grammarAccess.getPropertyValueAccess().getHasPropertyLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__HasPropertyAssignment_1_0"


    // $ANTLR start "rule__PropertyValue__ArgumentAssignment_1_1_0"
    // InternalEcssLanguage.g:6721:1: rule__PropertyValue__ArgumentAssignment_1_1_0 : ( rulePropertyValue ) ;
    public final void rule__PropertyValue__ArgumentAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6725:1: ( ( rulePropertyValue ) )
            // InternalEcssLanguage.g:6726:2: ( rulePropertyValue )
            {
            // InternalEcssLanguage.g:6726:2: ( rulePropertyValue )
            // InternalEcssLanguage.g:6727:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ArgumentAssignment_1_1_0"


    // $ANTLR start "rule__PropertyValue__ArgumentAssignment_1_1_1_1"
    // InternalEcssLanguage.g:6736:1: rule__PropertyValue__ArgumentAssignment_1_1_1_1 : ( rulePropertyValue ) ;
    public final void rule__PropertyValue__ArgumentAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6740:1: ( ( rulePropertyValue ) )
            // InternalEcssLanguage.g:6741:2: ( rulePropertyValue )
            {
            // InternalEcssLanguage.g:6741:2: ( rulePropertyValue )
            // InternalEcssLanguage.g:6742:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueAccess().getArgumentPropertyValueParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ArgumentAssignment_1_1_1_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1"
    // InternalEcssLanguage.g:6751:1: rule__Condition__ExpressionAssignment_1 : ( ruleSpecificationCS ) ;
    public final void rule__Condition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6755:1: ( ( ruleSpecificationCS ) )
            // InternalEcssLanguage.g:6756:2: ( ruleSpecificationCS )
            {
            // InternalEcssLanguage.g:6756:2: ( ruleSpecificationCS )
            // InternalEcssLanguage.g:6757:3: ruleSpecificationCS
            {
             before(grammarAccess.getConditionAccess().getExpressionSpecificationCSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecificationCS();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionSpecificationCSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1"


    // $ANTLR start "rule__SpecificationCS__OwnedExpressionAssignment"
    // InternalEcssLanguage.g:6766:1: rule__SpecificationCS__OwnedExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__SpecificationCS__OwnedExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEcssLanguage.g:6770:1: ( ( RULE_STRING ) )
            // InternalEcssLanguage.g:6771:2: ( RULE_STRING )
            {
            // InternalEcssLanguage.g:6771:2: ( RULE_STRING )
            // InternalEcssLanguage.g:6772:3: RULE_STRING
            {
             before(grammarAccess.getSpecificationCSAccess().getOwnedExpressionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSpecificationCSAccess().getOwnedExpressionSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecificationCS__OwnedExpressionAssignment"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\11\uffff\1\12\1\uffff";
    static final String dfa_3s = "\1\5\1\4\7\uffff\1\5\1\uffff";
    static final String dfa_4s = "\1\53\1\62\7\uffff\1\53\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\1\1\uffff\1\3";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\31\uffff\1\6\1\uffff\1\7\3\uffff\1\1\1\5\3\uffff\1\2\1\4",
            "\1\11\3\uffff\1\12\51\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\13\uffff\2\12\1\uffff\1\12\1\uffff\1\12\10\uffff\1\12\1\uffff\1\12\1\10\2\uffff\2\12\3\uffff\2\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "859:1: rule__TemplateRulePart__Alternatives : ( ( ruleTemplateFunctionCall ) | ( ruleLocalEvaluationCall ) | ( ruleLocalOrValueCall ) | ( ruleStaticTemplateRulePart ) | ( ruleEvaluationCall ) | ( ruleSlotCall ) | ( ruleForEachExpression ) | ( ruleIfExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000800000AAA0030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000800000AA20032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0003800000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000054520000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C6280000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000C6280000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C6280040020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006800000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000800000AA20030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000240030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000200032L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000500000000070L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000500000000072L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000500800000070L});

}