/*
 * generated by Xtext 2.15.0
 */
package uk.ac.york.simpleregexp.simplereg.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleRegGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RegexAlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexAlternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRegexGroupParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cRegexAlternativesElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsRegexGroupParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//RegexAlternatives AbstractElement:
		//	RegexGroup ({RegexAlternatives.elements+=current} ('|' elements+=RegexGroup)+)?;
		@Override public ParserRule getRule() { return rule; }
		
		//RegexGroup ({RegexAlternatives.elements+=current} ('|' elements+=RegexGroup)+)?
		public Group getGroup() { return cGroup; }
		
		//RegexGroup
		public RuleCall getRegexGroupParserRuleCall_0() { return cRegexGroupParserRuleCall_0; }
		
		//({RegexAlternatives.elements+=current} ('|' elements+=RegexGroup)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{RegexAlternatives.elements+=current}
		public Action getRegexAlternativesElementsAction_1_0() { return cRegexAlternativesElementsAction_1_0; }
		
		//('|' elements+=RegexGroup)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=RegexGroup
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//RegexGroup
		public RuleCall getElementsRegexGroupParserRuleCall_1_1_1_0() { return cElementsRegexGroupParserRuleCall_1_1_1_0; }
	}
	public class RegexGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRegexTokenParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cRegexGroupElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cElementsRegexTokenParserRuleCall_1_1_0 = (RuleCall)cElementsAssignment_1_1.eContents().get(0);
		
		//RegexGroup AbstractElement:
		//	RegexToken ({RegexGroup.elements+=current} elements+=RegexToken+)?;
		@Override public ParserRule getRule() { return rule; }
		
		//RegexToken ({RegexGroup.elements+=current} elements+=RegexToken+)?
		public Group getGroup() { return cGroup; }
		
		//RegexToken
		public RuleCall getRegexTokenParserRuleCall_0() { return cRegexTokenParserRuleCall_0; }
		
		//({RegexGroup.elements+=current} elements+=RegexToken+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{RegexGroup.elements+=current}
		public Action getRegexGroupElementsAction_1_0() { return cRegexGroupElementsAction_1_0; }
		
		//elements+=RegexToken+
		public Assignment getElementsAssignment_1_1() { return cElementsAssignment_1_1; }
		
		//RegexToken
		public RuleCall getElementsRegexTokenParserRuleCall_1_1_0() { return cElementsRegexTokenParserRuleCall_1_1_0; }
	}
	public class RegexTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRegexTokenElementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cCardinalityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_1_0 = (Alternatives)cCardinalityAssignment_1.eContents().get(0);
		private final Keyword cCardinalityQuestionMarkKeyword_1_0_0 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(0);
		private final Keyword cCardinalityAsteriskKeyword_1_0_1 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(1);
		private final Keyword cCardinalityPlusSignKeyword_1_0_2 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cHasMinCardAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cHasMinCardLeftCurlyBracketKeyword_2_0_0 = (Keyword)cHasMinCardAssignment_2_0.eContents().get(0);
		private final Assignment cMinCardinalityAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMinCardinalityEINTParserRuleCall_2_1_0 = (RuleCall)cMinCardinalityAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Assignment cHasMaxCardAssignment_2_2_0 = (Assignment)cGroup_2_2.eContents().get(0);
		private final Keyword cHasMaxCardCommaKeyword_2_2_0_0 = (Keyword)cHasMaxCardAssignment_2_2_0.eContents().get(0);
		private final Assignment cMaxCardinalityAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cMaxCardinalityEINTParserRuleCall_2_2_1_0 = (RuleCall)cMaxCardinalityAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */ RegexToken AbstractElement:
		//	RegexTokenElement cardinality=('?' | '*' | '+')? (hasMinCard?='{' minCardinality=EINT? (hasMaxCard?=','
		//	maxCardinality=EINT?)? '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//RegexTokenElement cardinality=('?' | '*' | '+')? (hasMinCard?='{' minCardinality=EINT? (hasMaxCard?=','
		//maxCardinality=EINT?)? '}')?
		public Group getGroup() { return cGroup; }
		
		//RegexTokenElement
		public RuleCall getRegexTokenElementParserRuleCall_0() { return cRegexTokenElementParserRuleCall_0; }
		
		//cardinality=('?' | '*' | '+')?
		public Assignment getCardinalityAssignment_1() { return cCardinalityAssignment_1; }
		
		//('?' | '*' | '+')
		public Alternatives getCardinalityAlternatives_1_0() { return cCardinalityAlternatives_1_0; }
		
		//'?'
		public Keyword getCardinalityQuestionMarkKeyword_1_0_0() { return cCardinalityQuestionMarkKeyword_1_0_0; }
		
		//'*'
		public Keyword getCardinalityAsteriskKeyword_1_0_1() { return cCardinalityAsteriskKeyword_1_0_1; }
		
		//'+'
		public Keyword getCardinalityPlusSignKeyword_1_0_2() { return cCardinalityPlusSignKeyword_1_0_2; }
		
		//(hasMinCard?='{' minCardinality=EINT? (hasMaxCard?=',' maxCardinality=EINT?)? '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//hasMinCard?='{'
		public Assignment getHasMinCardAssignment_2_0() { return cHasMinCardAssignment_2_0; }
		
		//'{'
		public Keyword getHasMinCardLeftCurlyBracketKeyword_2_0_0() { return cHasMinCardLeftCurlyBracketKeyword_2_0_0; }
		
		//minCardinality=EINT?
		public Assignment getMinCardinalityAssignment_2_1() { return cMinCardinalityAssignment_2_1; }
		
		//EINT
		public RuleCall getMinCardinalityEINTParserRuleCall_2_1_0() { return cMinCardinalityEINTParserRuleCall_2_1_0; }
		
		//(hasMaxCard?=',' maxCardinality=EINT?)?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//hasMaxCard?=','
		public Assignment getHasMaxCardAssignment_2_2_0() { return cHasMaxCardAssignment_2_2_0; }
		
		//','
		public Keyword getHasMaxCardCommaKeyword_2_2_0_0() { return cHasMaxCardCommaKeyword_2_2_0_0; }
		
		//maxCardinality=EINT?
		public Assignment getMaxCardinalityAssignment_2_2_1() { return cMaxCardinalityAssignment_2_2_1; }
		
		//EINT
		public RuleCall getMaxCardinalityEINTParserRuleCall_2_2_1_0() { return cMaxCardinalityEINTParserRuleCall_2_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class RegexTokenElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.RegexTokenElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMultiCharactersParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesizedRegexElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cWildcardParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSingleCharsParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//RegexTokenElement AbstractElement:
		//	MultiCharacters | ParenthesizedRegexElement | Wildcard | SingleChars;
		@Override public ParserRule getRule() { return rule; }
		
		//MultiCharacters | ParenthesizedRegexElement | Wildcard | SingleChars
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MultiCharacters
		public RuleCall getMultiCharactersParserRuleCall_0() { return cMultiCharactersParserRuleCall_0; }
		
		//ParenthesizedRegexElement
		public RuleCall getParenthesizedRegexElementParserRuleCall_1() { return cParenthesizedRegexElementParserRuleCall_1; }
		
		//Wildcard
		public RuleCall getWildcardParserRuleCall_2() { return cWildcardParserRuleCall_2; }
		
		//SingleChars
		public RuleCall getSingleCharsParserRuleCall_3() { return cSingleCharsParserRuleCall_3; }
	}
	public class ParenthesizedRegexElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.ParenthesizedRegexElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cRegexAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedRegexElement AbstractElement:
		//	'(' RegexAlternatives ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' RegexAlternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//RegexAlternatives
		public RuleCall getRegexAlternativesParserRuleCall_1() { return cRegexAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class SingleCharsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.SingleChars");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueTSINGLECHARSDTParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//SingleChars:
		//	value=TSINGLECHARSDT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=TSINGLECHARSDT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//TSINGLECHARSDT
		public RuleCall getValueTSINGLECHARSDTParserRuleCall_0() { return cValueTSINGLECHARSDTParserRuleCall_0; }
	}
	public class EINTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.EINT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTEST2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EINT ecore::EInt:
		//	INT | TEST2;
		@Override public ParserRule getRule() { return rule; }
		
		//INT | TEST2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//TEST2
		public RuleCall getTEST2ParserRuleCall_1() { return cTEST2ParserRuleCall_1; }
	}
	public class TEST2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.TEST2");
		private final Keyword cTest2Keyword = (Keyword)rule.eContents().get(1);
		
		//TEST2:
		//	'test2';
		@Override public ParserRule getRule() { return rule; }
		
		//'test2'
		public Keyword getTest2Keyword() { return cTest2Keyword; }
	}
	public class TSINGLECHARSDTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.TSINGLECHARSDT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTSINGLECHARSTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TSINGLECHARSDT:
		//	INT | TSINGLECHARS;
		@Override public ParserRule getRule() { return rule; }
		
		//INT | TSINGLECHARS
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//TSINGLECHARS
		public RuleCall getTSINGLECHARSTerminalRuleCall_1() { return cTSINGLECHARSTerminalRuleCall_1; }
	}
	public class WildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.Wildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWildcardAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Wildcard:
		//	{Wildcard}
		//	'.';
		@Override public ParserRule getRule() { return rule; }
		
		//{Wildcard} '.'
		public Group getGroup() { return cGroup; }
		
		//{Wildcard}
		public Action getWildcardAction_0() { return cWildcardAction_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class MultiCharactersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.MultiCharacters");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueMULTICHARTERMINALTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		////TODO: Hier muss man dann die zeichen manuell parsen
		//MultiCharacters:
		//	value=MULTICHARTERMINAL;
		@Override public ParserRule getRule() { return rule; }
		
		//value=MULTICHARTERMINAL
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//MULTICHARTERMINAL
		public RuleCall getValueMULTICHARTERMINALTerminalRuleCall_0() { return cValueMULTICHARTERMINALTerminalRuleCall_0; }
	}
	
	
	private final RegexAlternativesElements pRegexAlternatives;
	private final RegexGroupElements pRegexGroup;
	private final RegexTokenElements pRegexToken;
	private final RegexTokenElementElements pRegexTokenElement;
	private final ParenthesizedRegexElementElements pParenthesizedRegexElement;
	private final SingleCharsElements pSingleChars;
	private final EINTElements pEINT;
	private final TEST2Elements pTEST2;
	private final TerminalRule tINT;
	private final TSINGLECHARSDTElements pTSINGLECHARSDT;
	private final WildcardElements pWildcard;
	private final MultiCharactersElements pMultiCharacters;
	private final TerminalRule tMULTICHARTERMINAL;
	private final TerminalRule tTSINGLECHARS;
	
	private final Grammar grammar;

	@Inject
	public SimpleRegGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pRegexAlternatives = new RegexAlternativesElements();
		this.pRegexGroup = new RegexGroupElements();
		this.pRegexToken = new RegexTokenElements();
		this.pRegexTokenElement = new RegexTokenElementElements();
		this.pParenthesizedRegexElement = new ParenthesizedRegexElementElements();
		this.pSingleChars = new SingleCharsElements();
		this.pEINT = new EINTElements();
		this.pTEST2 = new TEST2Elements();
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.INT");
		this.pTSINGLECHARSDT = new TSINGLECHARSDTElements();
		this.pWildcard = new WildcardElements();
		this.pMultiCharacters = new MultiCharactersElements();
		this.tMULTICHARTERMINAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.MULTICHARTERMINAL");
		this.tTSINGLECHARS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.york.simpleregexp.simplereg.SimpleReg.TSINGLECHARS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.york.simpleregexp.simplereg.SimpleReg".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//RegexAlternatives AbstractElement:
	//	RegexGroup ({RegexAlternatives.elements+=current} ('|' elements+=RegexGroup)+)?;
	public RegexAlternativesElements getRegexAlternativesAccess() {
		return pRegexAlternatives;
	}
	
	public ParserRule getRegexAlternativesRule() {
		return getRegexAlternativesAccess().getRule();
	}
	
	//RegexGroup AbstractElement:
	//	RegexToken ({RegexGroup.elements+=current} elements+=RegexToken+)?;
	public RegexGroupElements getRegexGroupAccess() {
		return pRegexGroup;
	}
	
	public ParserRule getRegexGroupRule() {
		return getRegexGroupAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */ RegexToken AbstractElement:
	//	RegexTokenElement cardinality=('?' | '*' | '+')? (hasMinCard?='{' minCardinality=EINT? (hasMaxCard?=','
	//	maxCardinality=EINT?)? '}')?;
	public RegexTokenElements getRegexTokenAccess() {
		return pRegexToken;
	}
	
	public ParserRule getRegexTokenRule() {
		return getRegexTokenAccess().getRule();
	}
	
	//RegexTokenElement AbstractElement:
	//	MultiCharacters | ParenthesizedRegexElement | Wildcard | SingleChars;
	public RegexTokenElementElements getRegexTokenElementAccess() {
		return pRegexTokenElement;
	}
	
	public ParserRule getRegexTokenElementRule() {
		return getRegexTokenElementAccess().getRule();
	}
	
	//ParenthesizedRegexElement AbstractElement:
	//	'(' RegexAlternatives ')';
	public ParenthesizedRegexElementElements getParenthesizedRegexElementAccess() {
		return pParenthesizedRegexElement;
	}
	
	public ParserRule getParenthesizedRegexElementRule() {
		return getParenthesizedRegexElementAccess().getRule();
	}
	
	//SingleChars:
	//	value=TSINGLECHARSDT;
	public SingleCharsElements getSingleCharsAccess() {
		return pSingleChars;
	}
	
	public ParserRule getSingleCharsRule() {
		return getSingleCharsAccess().getRule();
	}
	
	//EINT ecore::EInt:
	//	INT | TEST2;
	public EINTElements getEINTAccess() {
		return pEINT;
	}
	
	public ParserRule getEINTRule() {
		return getEINTAccess().getRule();
	}
	
	//TEST2:
	//	'test2';
	public TEST2Elements getTEST2Access() {
		return pTEST2;
	}
	
	public ParserRule getTEST2Rule() {
		return getTEST2Access().getRule();
	}
	
	//terminal INT:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//TSINGLECHARSDT:
	//	INT | TSINGLECHARS;
	public TSINGLECHARSDTElements getTSINGLECHARSDTAccess() {
		return pTSINGLECHARSDT;
	}
	
	public ParserRule getTSINGLECHARSDTRule() {
		return getTSINGLECHARSDTAccess().getRule();
	}
	
	//Wildcard:
	//	{Wildcard}
	//	'.';
	public WildcardElements getWildcardAccess() {
		return pWildcard;
	}
	
	public ParserRule getWildcardRule() {
		return getWildcardAccess().getRule();
	}
	
	////TODO: Hier muss man dann die zeichen manuell parsen
	//MultiCharacters:
	//	value=MULTICHARTERMINAL;
	public MultiCharactersElements getMultiCharactersAccess() {
		return pMultiCharacters;
	}
	
	public ParserRule getMultiCharactersRule() {
		return getMultiCharactersAccess().getRule();
	}
	
	//terminal MULTICHARTERMINAL:
	//	'['->']';
	public TerminalRule getMULTICHARTERMINALRule() {
		return tMULTICHARTERMINAL;
	}
	
	//terminal TSINGLECHARS:
	//	'\\' . | !('[' | ')' | '{' | '}' | ']' | '\\' | '(' | '|' | '.')+;
	public TerminalRule getTSINGLECHARSRule() {
		return tTSINGLECHARS;
	}
}
