/**
 */
package antlr4.util;

import antlr4.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see antlr4.Antlr4Package
 * @generated
 */
public class Antlr4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Antlr4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antlr4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Antlr4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Antlr4Switch<Adapter> modelSwitch =
		new Antlr4Switch<Adapter>() {
			@Override
			public Adapter caseGrammar(Grammar object) {
				return createGrammarAdapter();
			}
			@Override
			public Adapter casePrequelConstruct(PrequelConstruct object) {
				return createPrequelConstructAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseTokenVocab(TokenVocab object) {
				return createTokenVocabAdapter();
			}
			@Override
			public Adapter caseOptionValue(OptionValue object) {
				return createOptionValueAdapter();
			}
			@Override
			public Adapter caseQualifiedOption(QualifiedOption object) {
				return createQualifiedOptionAdapter();
			}
			@Override
			public Adapter caseStringOption(StringOption object) {
				return createStringOptionAdapter();
			}
			@Override
			public Adapter caseActionOption(ActionOption object) {
				return createActionOptionAdapter();
			}
			@Override
			public Adapter caseIntOption(IntOption object) {
				return createIntOptionAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseTokens(Tokens object) {
				return createTokensAdapter();
			}
			@Override
			public Adapter caseV4Tokens(V4Tokens object) {
				return createV4TokensAdapter();
			}
			@Override
			public Adapter caseV4Token(V4Token object) {
				return createV4TokenAdapter();
			}
			@Override
			public Adapter caseEmptyTokens(EmptyTokens object) {
				return createEmptyTokensAdapter();
			}
			@Override
			public Adapter caseV3Tokens(V3Tokens object) {
				return createV3TokensAdapter();
			}
			@Override
			public Adapter caseV3Token(V3Token object) {
				return createV3TokenAdapter();
			}
			@Override
			public Adapter caseGrammarAction(GrammarAction object) {
				return createGrammarActionAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseParserRule(ParserRule object) {
				return createParserRuleAdapter();
			}
			@Override
			public Adapter caseExceptionGroup(ExceptionGroup object) {
				return createExceptionGroupAdapter();
			}
			@Override
			public Adapter caseExceptionHandler(ExceptionHandler object) {
				return createExceptionHandlerAdapter();
			}
			@Override
			public Adapter caseFinallyClause(FinallyClause object) {
				return createFinallyClauseAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseExceptions(Exceptions object) {
				return createExceptionsAdapter();
			}
			@Override
			public Adapter caseLocalVars(LocalVars object) {
				return createLocalVarsAdapter();
			}
			@Override
			public Adapter caseRulePrequel(RulePrequel object) {
				return createRulePrequelAdapter();
			}
			@Override
			public Adapter caseRuleAction(RuleAction object) {
				return createRuleActionAdapter();
			}
			@Override
			public Adapter caseRuleBlock(RuleBlock object) {
				return createRuleBlockAdapter();
			}
			@Override
			public Adapter caseRuleAltList(RuleAltList object) {
				return createRuleAltListAdapter();
			}
			@Override
			public Adapter caseLabeledAlt(LabeledAlt object) {
				return createLabeledAltAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseEbnf(Ebnf object) {
				return createEbnfAdapter();
			}
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseLabeledElement(LabeledElement object) {
				return createLabeledElementAdapter();
			}
			@Override
			public Adapter caseEbnfSuffix(EbnfSuffix object) {
				return createEbnfSuffixAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseAltList(AltList object) {
				return createAltListAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseRuleRef(RuleRef object) {
				return createRuleRefAdapter();
			}
			@Override
			public Adapter caseElementOptions(ElementOptions object) {
				return createElementOptionsAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseTokenRef(TokenRef object) {
				return createTokenRefAdapter();
			}
			@Override
			public Adapter caseNotSet(NotSet object) {
				return createNotSetAdapter();
			}
			@Override
			public Adapter caseBlockSet(BlockSet object) {
				return createBlockSetAdapter();
			}
			@Override
			public Adapter caseSetElement(SetElement object) {
				return createSetElementAdapter();
			}
			@Override
			public Adapter caseWildcard(Wildcard object) {
				return createWildcardAdapter();
			}
			@Override
			public Adapter caseElementOption(ElementOption object) {
				return createElementOptionAdapter();
			}
			@Override
			public Adapter caseLexerRule(LexerRule object) {
				return createLexerRuleAdapter();
			}
			@Override
			public Adapter caseLexerRuleBlock(LexerRuleBlock object) {
				return createLexerRuleBlockAdapter();
			}
			@Override
			public Adapter caseLexerAltList(LexerAltList object) {
				return createLexerAltListAdapter();
			}
			@Override
			public Adapter caseLexerAlt(LexerAlt object) {
				return createLexerAltAdapter();
			}
			@Override
			public Adapter caseLexerElements(LexerElements object) {
				return createLexerElementsAdapter();
			}
			@Override
			public Adapter caseLexerElement(LexerElement object) {
				return createLexerElementAdapter();
			}
			@Override
			public Adapter caseLabeledLexerElement(LabeledLexerElement object) {
				return createLabeledLexerElementAdapter();
			}
			@Override
			public Adapter caseLexerAtom(LexerAtom object) {
				return createLexerAtomAdapter();
			}
			@Override
			public Adapter caseLexerCharSet(LexerCharSet object) {
				return createLexerCharSetAdapter();
			}
			@Override
			public Adapter caseLexerBlock(LexerBlock object) {
				return createLexerBlockAdapter();
			}
			@Override
			public Adapter caseLexerCommands(LexerCommands object) {
				return createLexerCommandsAdapter();
			}
			@Override
			public Adapter caseLexerCommand(LexerCommand object) {
				return createLexerCommandAdapter();
			}
			@Override
			public Adapter caseLexerCommandExpr(LexerCommandExpr object) {
				return createLexerCommandExprAdapter();
			}
			@Override
			public Adapter caseLexerCommandArg(LexerCommandArg object) {
				return createLexerCommandArgAdapter();
			}
			@Override
			public Adapter caseQualifiedId(QualifiedId object) {
				return createQualifiedIdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Grammar
	 * @generated
	 */
	public Adapter createGrammarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.PrequelConstruct <em>Prequel Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.PrequelConstruct
	 * @generated
	 */
	public Adapter createPrequelConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.TokenVocab <em>Token Vocab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.TokenVocab
	 * @generated
	 */
	public Adapter createTokenVocabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.OptionValue <em>Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.OptionValue
	 * @generated
	 */
	public Adapter createOptionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.QualifiedOption <em>Qualified Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.QualifiedOption
	 * @generated
	 */
	public Adapter createQualifiedOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.StringOption <em>String Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.StringOption
	 * @generated
	 */
	public Adapter createStringOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ActionOption <em>Action Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ActionOption
	 * @generated
	 */
	public Adapter createActionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.IntOption <em>Int Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.IntOption
	 * @generated
	 */
	public Adapter createIntOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Tokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Tokens
	 * @generated
	 */
	public Adapter createTokensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.V4Tokens <em>V4 Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.V4Tokens
	 * @generated
	 */
	public Adapter createV4TokensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.V4Token <em>V4 Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.V4Token
	 * @generated
	 */
	public Adapter createV4TokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.EmptyTokens <em>Empty Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.EmptyTokens
	 * @generated
	 */
	public Adapter createEmptyTokensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.V3Tokens <em>V3 Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.V3Tokens
	 * @generated
	 */
	public Adapter createV3TokensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.V3Token <em>V3 Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.V3Token
	 * @generated
	 */
	public Adapter createV3TokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.GrammarAction <em>Grammar Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.GrammarAction
	 * @generated
	 */
	public Adapter createGrammarActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ParserRule <em>Parser Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ParserRule
	 * @generated
	 */
	public Adapter createParserRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ExceptionGroup <em>Exception Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ExceptionGroup
	 * @generated
	 */
	public Adapter createExceptionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ExceptionHandler
	 * @generated
	 */
	public Adapter createExceptionHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.FinallyClause <em>Finally Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.FinallyClause
	 * @generated
	 */
	public Adapter createFinallyClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Exceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Exceptions
	 * @generated
	 */
	public Adapter createExceptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LocalVars
	 * @generated
	 */
	public Adapter createLocalVarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.RulePrequel <em>Rule Prequel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.RulePrequel
	 * @generated
	 */
	public Adapter createRulePrequelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.RuleAction <em>Rule Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.RuleAction
	 * @generated
	 */
	public Adapter createRuleActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.RuleBlock <em>Rule Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.RuleBlock
	 * @generated
	 */
	public Adapter createRuleBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.RuleAltList <em>Rule Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.RuleAltList
	 * @generated
	 */
	public Adapter createRuleAltListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LabeledAlt <em>Labeled Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LabeledAlt
	 * @generated
	 */
	public Adapter createLabeledAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Ebnf <em>Ebnf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Ebnf
	 * @generated
	 */
	public Adapter createEbnfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LabeledElement
	 * @generated
	 */
	public Adapter createLabeledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.EbnfSuffix <em>Ebnf Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.EbnfSuffix
	 * @generated
	 */
	public Adapter createEbnfSuffixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.AltList <em>Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.AltList
	 * @generated
	 */
	public Adapter createAltListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.RuleRef <em>Rule Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.RuleRef
	 * @generated
	 */
	public Adapter createRuleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ElementOptions <em>Element Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ElementOptions
	 * @generated
	 */
	public Adapter createElementOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.TokenRef <em>Token Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.TokenRef
	 * @generated
	 */
	public Adapter createTokenRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.NotSet <em>Not Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.NotSet
	 * @generated
	 */
	public Adapter createNotSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.BlockSet <em>Block Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.BlockSet
	 * @generated
	 */
	public Adapter createBlockSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.SetElement <em>Set Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.SetElement
	 * @generated
	 */
	public Adapter createSetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.Wildcard
	 * @generated
	 */
	public Adapter createWildcardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.ElementOption <em>Element Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.ElementOption
	 * @generated
	 */
	public Adapter createElementOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerRule <em>Lexer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerRule
	 * @generated
	 */
	public Adapter createLexerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerRuleBlock <em>Lexer Rule Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerRuleBlock
	 * @generated
	 */
	public Adapter createLexerRuleBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerAltList <em>Lexer Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerAltList
	 * @generated
	 */
	public Adapter createLexerAltListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerAlt <em>Lexer Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerAlt
	 * @generated
	 */
	public Adapter createLexerAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerElements <em>Lexer Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerElements
	 * @generated
	 */
	public Adapter createLexerElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerElement <em>Lexer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerElement
	 * @generated
	 */
	public Adapter createLexerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LabeledLexerElement <em>Labeled Lexer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LabeledLexerElement
	 * @generated
	 */
	public Adapter createLabeledLexerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerAtom <em>Lexer Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerAtom
	 * @generated
	 */
	public Adapter createLexerAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerCharSet <em>Lexer Char Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerCharSet
	 * @generated
	 */
	public Adapter createLexerCharSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerBlock <em>Lexer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerBlock
	 * @generated
	 */
	public Adapter createLexerBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerCommands <em>Lexer Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerCommands
	 * @generated
	 */
	public Adapter createLexerCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerCommand <em>Lexer Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerCommand
	 * @generated
	 */
	public Adapter createLexerCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerCommandExpr <em>Lexer Command Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerCommandExpr
	 * @generated
	 */
	public Adapter createLexerCommandExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.LexerCommandArg <em>Lexer Command Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.LexerCommandArg
	 * @generated
	 */
	public Adapter createLexerCommandArgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link antlr4.QualifiedId <em>Qualified Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see antlr4.QualifiedId
	 * @generated
	 */
	public Adapter createQualifiedIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Antlr4AdapterFactory
