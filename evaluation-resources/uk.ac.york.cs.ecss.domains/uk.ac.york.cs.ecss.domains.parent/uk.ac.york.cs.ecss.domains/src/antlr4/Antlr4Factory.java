/**
 */
package antlr4;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see antlr4.Antlr4Package
 * @generated
 */
public interface Antlr4Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Antlr4Factory eINSTANCE = antlr4.impl.Antlr4FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar</em>'.
	 * @generated
	 */
	Grammar createGrammar();

	/**
	 * Returns a new object of class '<em>Prequel Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prequel Construct</em>'.
	 * @generated
	 */
	PrequelConstruct createPrequelConstruct();

	/**
	 * Returns a new object of class '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options</em>'.
	 * @generated
	 */
	Options createOptions();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Token Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Vocab</em>'.
	 * @generated
	 */
	TokenVocab createTokenVocab();

	/**
	 * Returns a new object of class '<em>Option Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Value</em>'.
	 * @generated
	 */
	OptionValue createOptionValue();

	/**
	 * Returns a new object of class '<em>Qualified Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Option</em>'.
	 * @generated
	 */
	QualifiedOption createQualifiedOption();

	/**
	 * Returns a new object of class '<em>String Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Option</em>'.
	 * @generated
	 */
	StringOption createStringOption();

	/**
	 * Returns a new object of class '<em>Action Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Option</em>'.
	 * @generated
	 */
	ActionOption createActionOption();

	/**
	 * Returns a new object of class '<em>Int Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Option</em>'.
	 * @generated
	 */
	IntOption createIntOption();

	/**
	 * Returns a new object of class '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imports</em>'.
	 * @generated
	 */
	Imports createImports();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tokens</em>'.
	 * @generated
	 */
	Tokens createTokens();

	/**
	 * Returns a new object of class '<em>V4 Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V4 Tokens</em>'.
	 * @generated
	 */
	V4Tokens createV4Tokens();

	/**
	 * Returns a new object of class '<em>V4 Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V4 Token</em>'.
	 * @generated
	 */
	V4Token createV4Token();

	/**
	 * Returns a new object of class '<em>Empty Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Tokens</em>'.
	 * @generated
	 */
	EmptyTokens createEmptyTokens();

	/**
	 * Returns a new object of class '<em>V3 Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V3 Tokens</em>'.
	 * @generated
	 */
	V3Tokens createV3Tokens();

	/**
	 * Returns a new object of class '<em>V3 Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V3 Token</em>'.
	 * @generated
	 */
	V3Token createV3Token();

	/**
	 * Returns a new object of class '<em>Grammar Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar Action</em>'.
	 * @generated
	 */
	GrammarAction createGrammarAction();

	/**
	 * Returns a new object of class '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode</em>'.
	 * @generated
	 */
	Mode createMode();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Parser Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parser Rule</em>'.
	 * @generated
	 */
	ParserRule createParserRule();

	/**
	 * Returns a new object of class '<em>Exception Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Group</em>'.
	 * @generated
	 */
	ExceptionGroup createExceptionGroup();

	/**
	 * Returns a new object of class '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Handler</em>'.
	 * @generated
	 */
	ExceptionHandler createExceptionHandler();

	/**
	 * Returns a new object of class '<em>Finally Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finally Clause</em>'.
	 * @generated
	 */
	FinallyClause createFinallyClause();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Exceptions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exceptions</em>'.
	 * @generated
	 */
	Exceptions createExceptions();

	/**
	 * Returns a new object of class '<em>Local Vars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Vars</em>'.
	 * @generated
	 */
	LocalVars createLocalVars();

	/**
	 * Returns a new object of class '<em>Rule Prequel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Prequel</em>'.
	 * @generated
	 */
	RulePrequel createRulePrequel();

	/**
	 * Returns a new object of class '<em>Rule Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Action</em>'.
	 * @generated
	 */
	RuleAction createRuleAction();

	/**
	 * Returns a new object of class '<em>Rule Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Block</em>'.
	 * @generated
	 */
	RuleBlock createRuleBlock();

	/**
	 * Returns a new object of class '<em>Rule Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Alt List</em>'.
	 * @generated
	 */
	RuleAltList createRuleAltList();

	/**
	 * Returns a new object of class '<em>Labeled Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Alt</em>'.
	 * @generated
	 */
	LabeledAlt createLabeledAlt();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Ebnf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ebnf</em>'.
	 * @generated
	 */
	Ebnf createEbnf();

	/**
	 * Returns a new object of class '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Element</em>'.
	 * @generated
	 */
	ActionElement createActionElement();

	/**
	 * Returns a new object of class '<em>Labeled Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Element</em>'.
	 * @generated
	 */
	LabeledElement createLabeledElement();

	/**
	 * Returns a new object of class '<em>Ebnf Suffix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ebnf Suffix</em>'.
	 * @generated
	 */
	EbnfSuffix createEbnfSuffix();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt List</em>'.
	 * @generated
	 */
	AltList createAltList();

	/**
	 * Returns a new object of class '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom</em>'.
	 * @generated
	 */
	Atom createAtom();

	/**
	 * Returns a new object of class '<em>Rule Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Ref</em>'.
	 * @generated
	 */
	RuleRef createRuleRef();

	/**
	 * Returns a new object of class '<em>Element Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Options</em>'.
	 * @generated
	 */
	ElementOptions createElementOptions();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Token Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Ref</em>'.
	 * @generated
	 */
	TokenRef createTokenRef();

	/**
	 * Returns a new object of class '<em>Not Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Set</em>'.
	 * @generated
	 */
	NotSet createNotSet();

	/**
	 * Returns a new object of class '<em>Block Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Set</em>'.
	 * @generated
	 */
	BlockSet createBlockSet();

	/**
	 * Returns a new object of class '<em>Set Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Element</em>'.
	 * @generated
	 */
	SetElement createSetElement();

	/**
	 * Returns a new object of class '<em>Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wildcard</em>'.
	 * @generated
	 */
	Wildcard createWildcard();

	/**
	 * Returns a new object of class '<em>Element Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Option</em>'.
	 * @generated
	 */
	ElementOption createElementOption();

	/**
	 * Returns a new object of class '<em>Lexer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Rule</em>'.
	 * @generated
	 */
	LexerRule createLexerRule();

	/**
	 * Returns a new object of class '<em>Lexer Rule Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Rule Block</em>'.
	 * @generated
	 */
	LexerRuleBlock createLexerRuleBlock();

	/**
	 * Returns a new object of class '<em>Lexer Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Alt List</em>'.
	 * @generated
	 */
	LexerAltList createLexerAltList();

	/**
	 * Returns a new object of class '<em>Lexer Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Alt</em>'.
	 * @generated
	 */
	LexerAlt createLexerAlt();

	/**
	 * Returns a new object of class '<em>Lexer Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Elements</em>'.
	 * @generated
	 */
	LexerElements createLexerElements();

	/**
	 * Returns a new object of class '<em>Lexer Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Element</em>'.
	 * @generated
	 */
	LexerElement createLexerElement();

	/**
	 * Returns a new object of class '<em>Labeled Lexer Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Lexer Element</em>'.
	 * @generated
	 */
	LabeledLexerElement createLabeledLexerElement();

	/**
	 * Returns a new object of class '<em>Lexer Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Atom</em>'.
	 * @generated
	 */
	LexerAtom createLexerAtom();

	/**
	 * Returns a new object of class '<em>Lexer Char Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Char Set</em>'.
	 * @generated
	 */
	LexerCharSet createLexerCharSet();

	/**
	 * Returns a new object of class '<em>Lexer Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Block</em>'.
	 * @generated
	 */
	LexerBlock createLexerBlock();

	/**
	 * Returns a new object of class '<em>Lexer Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Commands</em>'.
	 * @generated
	 */
	LexerCommands createLexerCommands();

	/**
	 * Returns a new object of class '<em>Lexer Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Command</em>'.
	 * @generated
	 */
	LexerCommand createLexerCommand();

	/**
	 * Returns a new object of class '<em>Lexer Command Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Command Expr</em>'.
	 * @generated
	 */
	LexerCommandExpr createLexerCommandExpr();

	/**
	 * Returns a new object of class '<em>Lexer Command Arg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexer Command Arg</em>'.
	 * @generated
	 */
	LexerCommandArg createLexerCommandArg();

	/**
	 * Returns a new object of class '<em>Qualified Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Id</em>'.
	 * @generated
	 */
	QualifiedId createQualifiedId();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Antlr4Package getAntlr4Package();

} //Antlr4Factory
