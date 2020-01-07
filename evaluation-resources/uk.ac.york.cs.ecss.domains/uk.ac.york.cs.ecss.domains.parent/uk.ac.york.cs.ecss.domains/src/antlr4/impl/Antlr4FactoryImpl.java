/**
 */
package antlr4.impl;

import antlr4.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Antlr4FactoryImpl extends EFactoryImpl implements Antlr4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Antlr4Factory init() {
		try {
			Antlr4Factory theAntlr4Factory = (Antlr4Factory)EPackage.Registry.INSTANCE.getEFactory(Antlr4Package.eNS_URI);
			if (theAntlr4Factory != null) {
				return theAntlr4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Antlr4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antlr4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Antlr4Package.GRAMMAR: return createGrammar();
			case Antlr4Package.PREQUEL_CONSTRUCT: return createPrequelConstruct();
			case Antlr4Package.OPTIONS: return createOptions();
			case Antlr4Package.OPTION: return createOption();
			case Antlr4Package.TOKEN_VOCAB: return createTokenVocab();
			case Antlr4Package.OPTION_VALUE: return createOptionValue();
			case Antlr4Package.QUALIFIED_OPTION: return createQualifiedOption();
			case Antlr4Package.STRING_OPTION: return createStringOption();
			case Antlr4Package.ACTION_OPTION: return createActionOption();
			case Antlr4Package.INT_OPTION: return createIntOption();
			case Antlr4Package.IMPORTS: return createImports();
			case Antlr4Package.IMPORT: return createImport();
			case Antlr4Package.TOKENS: return createTokens();
			case Antlr4Package.V4_TOKENS: return createV4Tokens();
			case Antlr4Package.V4_TOKEN: return createV4Token();
			case Antlr4Package.EMPTY_TOKENS: return createEmptyTokens();
			case Antlr4Package.V3_TOKENS: return createV3Tokens();
			case Antlr4Package.V3_TOKEN: return createV3Token();
			case Antlr4Package.GRAMMAR_ACTION: return createGrammarAction();
			case Antlr4Package.MODE: return createMode();
			case Antlr4Package.RULE: return createRule();
			case Antlr4Package.PARSER_RULE: return createParserRule();
			case Antlr4Package.EXCEPTION_GROUP: return createExceptionGroup();
			case Antlr4Package.EXCEPTION_HANDLER: return createExceptionHandler();
			case Antlr4Package.FINALLY_CLAUSE: return createFinallyClause();
			case Antlr4Package.RETURN: return createReturn();
			case Antlr4Package.EXCEPTIONS: return createExceptions();
			case Antlr4Package.LOCAL_VARS: return createLocalVars();
			case Antlr4Package.RULE_PREQUEL: return createRulePrequel();
			case Antlr4Package.RULE_ACTION: return createRuleAction();
			case Antlr4Package.RULE_BLOCK: return createRuleBlock();
			case Antlr4Package.RULE_ALT_LIST: return createRuleAltList();
			case Antlr4Package.LABELED_ALT: return createLabeledAlt();
			case Antlr4Package.ALTERNATIVE: return createAlternative();
			case Antlr4Package.ELEMENT: return createElement();
			case Antlr4Package.EBNF: return createEbnf();
			case Antlr4Package.ACTION_ELEMENT: return createActionElement();
			case Antlr4Package.LABELED_ELEMENT: return createLabeledElement();
			case Antlr4Package.EBNF_SUFFIX: return createEbnfSuffix();
			case Antlr4Package.BLOCK: return createBlock();
			case Antlr4Package.ALT_LIST: return createAltList();
			case Antlr4Package.ATOM: return createAtom();
			case Antlr4Package.RULE_REF: return createRuleRef();
			case Antlr4Package.ELEMENT_OPTIONS: return createElementOptions();
			case Antlr4Package.RANGE: return createRange();
			case Antlr4Package.TERMINAL: return createTerminal();
			case Antlr4Package.TOKEN_REF: return createTokenRef();
			case Antlr4Package.NOT_SET: return createNotSet();
			case Antlr4Package.BLOCK_SET: return createBlockSet();
			case Antlr4Package.SET_ELEMENT: return createSetElement();
			case Antlr4Package.WILDCARD: return createWildcard();
			case Antlr4Package.ELEMENT_OPTION: return createElementOption();
			case Antlr4Package.LEXER_RULE: return createLexerRule();
			case Antlr4Package.LEXER_RULE_BLOCK: return createLexerRuleBlock();
			case Antlr4Package.LEXER_ALT_LIST: return createLexerAltList();
			case Antlr4Package.LEXER_ALT: return createLexerAlt();
			case Antlr4Package.LEXER_ELEMENTS: return createLexerElements();
			case Antlr4Package.LEXER_ELEMENT: return createLexerElement();
			case Antlr4Package.LABELED_LEXER_ELEMENT: return createLabeledLexerElement();
			case Antlr4Package.LEXER_ATOM: return createLexerAtom();
			case Antlr4Package.LEXER_CHAR_SET: return createLexerCharSet();
			case Antlr4Package.LEXER_BLOCK: return createLexerBlock();
			case Antlr4Package.LEXER_COMMANDS: return createLexerCommands();
			case Antlr4Package.LEXER_COMMAND: return createLexerCommand();
			case Antlr4Package.LEXER_COMMAND_EXPR: return createLexerCommandExpr();
			case Antlr4Package.LEXER_COMMAND_ARG: return createLexerCommandArg();
			case Antlr4Package.QUALIFIED_ID: return createQualifiedId();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Antlr4Package.GRAMMAR_TYPE:
				return createGrammarTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Antlr4Package.GRAMMAR_TYPE:
				return convertGrammarTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrequelConstruct createPrequelConstruct() {
		PrequelConstructImpl prequelConstruct = new PrequelConstructImpl();
		return prequelConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenVocab createTokenVocab() {
		TokenVocabImpl tokenVocab = new TokenVocabImpl();
		return tokenVocab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionValue createOptionValue() {
		OptionValueImpl optionValue = new OptionValueImpl();
		return optionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedOption createQualifiedOption() {
		QualifiedOptionImpl qualifiedOption = new QualifiedOptionImpl();
		return qualifiedOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOption createStringOption() {
		StringOptionImpl stringOption = new StringOptionImpl();
		return stringOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionOption createActionOption() {
		ActionOptionImpl actionOption = new ActionOptionImpl();
		return actionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntOption createIntOption() {
		IntOptionImpl intOption = new IntOptionImpl();
		return intOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tokens createTokens() {
		TokensImpl tokens = new TokensImpl();
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V4Tokens createV4Tokens() {
		V4TokensImpl v4Tokens = new V4TokensImpl();
		return v4Tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V4Token createV4Token() {
		V4TokenImpl v4Token = new V4TokenImpl();
		return v4Token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyTokens createEmptyTokens() {
		EmptyTokensImpl emptyTokens = new EmptyTokensImpl();
		return emptyTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V3Tokens createV3Tokens() {
		V3TokensImpl v3Tokens = new V3TokensImpl();
		return v3Tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V3Token createV3Token() {
		V3TokenImpl v3Token = new V3TokenImpl();
		return v3Token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrammarAction createGrammarAction() {
		GrammarActionImpl grammarAction = new GrammarActionImpl();
		return grammarAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParserRule createParserRule() {
		ParserRuleImpl parserRule = new ParserRuleImpl();
		return parserRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionGroup createExceptionGroup() {
		ExceptionGroupImpl exceptionGroup = new ExceptionGroupImpl();
		return exceptionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinallyClause createFinallyClause() {
		FinallyClauseImpl finallyClause = new FinallyClauseImpl();
		return finallyClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exceptions createExceptions() {
		ExceptionsImpl exceptions = new ExceptionsImpl();
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalVars createLocalVars() {
		LocalVarsImpl localVars = new LocalVarsImpl();
		return localVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulePrequel createRulePrequel() {
		RulePrequelImpl rulePrequel = new RulePrequelImpl();
		return rulePrequel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleAction createRuleAction() {
		RuleActionImpl ruleAction = new RuleActionImpl();
		return ruleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleBlock createRuleBlock() {
		RuleBlockImpl ruleBlock = new RuleBlockImpl();
		return ruleBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleAltList createRuleAltList() {
		RuleAltListImpl ruleAltList = new RuleAltListImpl();
		return ruleAltList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledAlt createLabeledAlt() {
		LabeledAltImpl labeledAlt = new LabeledAltImpl();
		return labeledAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ebnf createEbnf() {
		EbnfImpl ebnf = new EbnfImpl();
		return ebnf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionElement createActionElement() {
		ActionElementImpl actionElement = new ActionElementImpl();
		return actionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledElement createLabeledElement() {
		LabeledElementImpl labeledElement = new LabeledElementImpl();
		return labeledElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EbnfSuffix createEbnfSuffix() {
		EbnfSuffixImpl ebnfSuffix = new EbnfSuffixImpl();
		return ebnfSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltList createAltList() {
		AltListImpl altList = new AltListImpl();
		return altList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleRef createRuleRef() {
		RuleRefImpl ruleRef = new RuleRefImpl();
		return ruleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementOptions createElementOptions() {
		ElementOptionsImpl elementOptions = new ElementOptionsImpl();
		return elementOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenRef createTokenRef() {
		TokenRefImpl tokenRef = new TokenRefImpl();
		return tokenRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotSet createNotSet() {
		NotSetImpl notSet = new NotSetImpl();
		return notSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockSet createBlockSet() {
		BlockSetImpl blockSet = new BlockSetImpl();
		return blockSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetElement createSetElement() {
		SetElementImpl setElement = new SetElementImpl();
		return setElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wildcard createWildcard() {
		WildcardImpl wildcard = new WildcardImpl();
		return wildcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementOption createElementOption() {
		ElementOptionImpl elementOption = new ElementOptionImpl();
		return elementOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerRule createLexerRule() {
		LexerRuleImpl lexerRule = new LexerRuleImpl();
		return lexerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerRuleBlock createLexerRuleBlock() {
		LexerRuleBlockImpl lexerRuleBlock = new LexerRuleBlockImpl();
		return lexerRuleBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerAltList createLexerAltList() {
		LexerAltListImpl lexerAltList = new LexerAltListImpl();
		return lexerAltList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerAlt createLexerAlt() {
		LexerAltImpl lexerAlt = new LexerAltImpl();
		return lexerAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerElements createLexerElements() {
		LexerElementsImpl lexerElements = new LexerElementsImpl();
		return lexerElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerElement createLexerElement() {
		LexerElementImpl lexerElement = new LexerElementImpl();
		return lexerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledLexerElement createLabeledLexerElement() {
		LabeledLexerElementImpl labeledLexerElement = new LabeledLexerElementImpl();
		return labeledLexerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerAtom createLexerAtom() {
		LexerAtomImpl lexerAtom = new LexerAtomImpl();
		return lexerAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCharSet createLexerCharSet() {
		LexerCharSetImpl lexerCharSet = new LexerCharSetImpl();
		return lexerCharSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerBlock createLexerBlock() {
		LexerBlockImpl lexerBlock = new LexerBlockImpl();
		return lexerBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCommands createLexerCommands() {
		LexerCommandsImpl lexerCommands = new LexerCommandsImpl();
		return lexerCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCommand createLexerCommand() {
		LexerCommandImpl lexerCommand = new LexerCommandImpl();
		return lexerCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCommandExpr createLexerCommandExpr() {
		LexerCommandExprImpl lexerCommandExpr = new LexerCommandExprImpl();
		return lexerCommandExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCommandArg createLexerCommandArg() {
		LexerCommandArgImpl lexerCommandArg = new LexerCommandArgImpl();
		return lexerCommandArg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedId createQualifiedId() {
		QualifiedIdImpl qualifiedId = new QualifiedIdImpl();
		return qualifiedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarType createGrammarTypeFromString(EDataType eDataType, String initialValue) {
		GrammarType result = GrammarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrammarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Antlr4Package getAntlr4Package() {
		return (Antlr4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Antlr4Package getPackage() {
		return Antlr4Package.eINSTANCE;
	}

} //Antlr4FactoryImpl
