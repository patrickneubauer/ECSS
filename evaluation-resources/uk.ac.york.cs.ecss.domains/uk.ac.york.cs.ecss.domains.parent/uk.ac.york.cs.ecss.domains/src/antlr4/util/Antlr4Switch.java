/**
 */
package antlr4.util;

import antlr4.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see antlr4.Antlr4Package
 * @generated
 */
public class Antlr4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Antlr4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antlr4Switch() {
		if (modelPackage == null) {
			modelPackage = Antlr4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Antlr4Package.GRAMMAR: {
				Grammar grammar = (Grammar)theEObject;
				T result = caseGrammar(grammar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.PREQUEL_CONSTRUCT: {
				PrequelConstruct prequelConstruct = (PrequelConstruct)theEObject;
				T result = casePrequelConstruct(prequelConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = casePrequelConstruct(options);
				if (result == null) result = caseRulePrequel(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.TOKEN_VOCAB: {
				TokenVocab tokenVocab = (TokenVocab)theEObject;
				T result = caseTokenVocab(tokenVocab);
				if (result == null) result = caseOption(tokenVocab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.OPTION_VALUE: {
				OptionValue optionValue = (OptionValue)theEObject;
				T result = caseOptionValue(optionValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.QUALIFIED_OPTION: {
				QualifiedOption qualifiedOption = (QualifiedOption)theEObject;
				T result = caseQualifiedOption(qualifiedOption);
				if (result == null) result = caseOptionValue(qualifiedOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.STRING_OPTION: {
				StringOption stringOption = (StringOption)theEObject;
				T result = caseStringOption(stringOption);
				if (result == null) result = caseOptionValue(stringOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ACTION_OPTION: {
				ActionOption actionOption = (ActionOption)theEObject;
				T result = caseActionOption(actionOption);
				if (result == null) result = caseOptionValue(actionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.INT_OPTION: {
				IntOption intOption = (IntOption)theEObject;
				T result = caseIntOption(intOption);
				if (result == null) result = caseOptionValue(intOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = casePrequelConstruct(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.TOKENS: {
				Tokens tokens = (Tokens)theEObject;
				T result = caseTokens(tokens);
				if (result == null) result = casePrequelConstruct(tokens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.V4_TOKENS: {
				V4Tokens v4Tokens = (V4Tokens)theEObject;
				T result = caseV4Tokens(v4Tokens);
				if (result == null) result = caseTokens(v4Tokens);
				if (result == null) result = casePrequelConstruct(v4Tokens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.V4_TOKEN: {
				V4Token v4Token = (V4Token)theEObject;
				T result = caseV4Token(v4Token);
				if (result == null) result = caseTokenRef(v4Token);
				if (result == null) result = caseLexerCommandArg(v4Token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EMPTY_TOKENS: {
				EmptyTokens emptyTokens = (EmptyTokens)theEObject;
				T result = caseEmptyTokens(emptyTokens);
				if (result == null) result = caseTokens(emptyTokens);
				if (result == null) result = casePrequelConstruct(emptyTokens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.V3_TOKENS: {
				V3Tokens v3Tokens = (V3Tokens)theEObject;
				T result = caseV3Tokens(v3Tokens);
				if (result == null) result = caseTokens(v3Tokens);
				if (result == null) result = casePrequelConstruct(v3Tokens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.V3_TOKEN: {
				V3Token v3Token = (V3Token)theEObject;
				T result = caseV3Token(v3Token);
				if (result == null) result = caseTokenRef(v3Token);
				if (result == null) result = caseLexerCommandArg(v3Token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.GRAMMAR_ACTION: {
				GrammarAction grammarAction = (GrammarAction)theEObject;
				T result = caseGrammarAction(grammarAction);
				if (result == null) result = casePrequelConstruct(grammarAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = caseLexerCommandArg(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.PARSER_RULE: {
				ParserRule parserRule = (ParserRule)theEObject;
				T result = caseParserRule(parserRule);
				if (result == null) result = caseRule(parserRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EXCEPTION_GROUP: {
				ExceptionGroup exceptionGroup = (ExceptionGroup)theEObject;
				T result = caseExceptionGroup(exceptionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.FINALLY_CLAUSE: {
				FinallyClause finallyClause = (FinallyClause)theEObject;
				T result = caseFinallyClause(finallyClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EXCEPTIONS: {
				Exceptions exceptions = (Exceptions)theEObject;
				T result = caseExceptions(exceptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LOCAL_VARS: {
				LocalVars localVars = (LocalVars)theEObject;
				T result = caseLocalVars(localVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE_PREQUEL: {
				RulePrequel rulePrequel = (RulePrequel)theEObject;
				T result = caseRulePrequel(rulePrequel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE_ACTION: {
				RuleAction ruleAction = (RuleAction)theEObject;
				T result = caseRuleAction(ruleAction);
				if (result == null) result = caseRulePrequel(ruleAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE_BLOCK: {
				RuleBlock ruleBlock = (RuleBlock)theEObject;
				T result = caseRuleBlock(ruleBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE_ALT_LIST: {
				RuleAltList ruleAltList = (RuleAltList)theEObject;
				T result = caseRuleAltList(ruleAltList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LABELED_ALT: {
				LabeledAlt labeledAlt = (LabeledAlt)theEObject;
				T result = caseLabeledAlt(labeledAlt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EBNF: {
				Ebnf ebnf = (Ebnf)theEObject;
				T result = caseEbnf(ebnf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T result = caseActionElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LABELED_ELEMENT: {
				LabeledElement labeledElement = (LabeledElement)theEObject;
				T result = caseLabeledElement(labeledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.EBNF_SUFFIX: {
				EbnfSuffix ebnfSuffix = (EbnfSuffix)theEObject;
				T result = caseEbnfSuffix(ebnfSuffix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ALT_LIST: {
				AltList altList = (AltList)theEObject;
				T result = caseAltList(altList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RULE_REF: {
				RuleRef ruleRef = (RuleRef)theEObject;
				T result = caseRuleRef(ruleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ELEMENT_OPTIONS: {
				ElementOptions elementOptions = (ElementOptions)theEObject;
				T result = caseElementOptions(elementOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.TOKEN_REF: {
				TokenRef tokenRef = (TokenRef)theEObject;
				T result = caseTokenRef(tokenRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.NOT_SET: {
				NotSet notSet = (NotSet)theEObject;
				T result = caseNotSet(notSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.BLOCK_SET: {
				BlockSet blockSet = (BlockSet)theEObject;
				T result = caseBlockSet(blockSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.SET_ELEMENT: {
				SetElement setElement = (SetElement)theEObject;
				T result = caseSetElement(setElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.WILDCARD: {
				Wildcard wildcard = (Wildcard)theEObject;
				T result = caseWildcard(wildcard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.ELEMENT_OPTION: {
				ElementOption elementOption = (ElementOption)theEObject;
				T result = caseElementOption(elementOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_RULE: {
				LexerRule lexerRule = (LexerRule)theEObject;
				T result = caseLexerRule(lexerRule);
				if (result == null) result = caseRule(lexerRule);
				if (result == null) result = caseTokenRef(lexerRule);
				if (result == null) result = caseLexerCommandArg(lexerRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_RULE_BLOCK: {
				LexerRuleBlock lexerRuleBlock = (LexerRuleBlock)theEObject;
				T result = caseLexerRuleBlock(lexerRuleBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_ALT_LIST: {
				LexerAltList lexerAltList = (LexerAltList)theEObject;
				T result = caseLexerAltList(lexerAltList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_ALT: {
				LexerAlt lexerAlt = (LexerAlt)theEObject;
				T result = caseLexerAlt(lexerAlt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_ELEMENTS: {
				LexerElements lexerElements = (LexerElements)theEObject;
				T result = caseLexerElements(lexerElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_ELEMENT: {
				LexerElement lexerElement = (LexerElement)theEObject;
				T result = caseLexerElement(lexerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LABELED_LEXER_ELEMENT: {
				LabeledLexerElement labeledLexerElement = (LabeledLexerElement)theEObject;
				T result = caseLabeledLexerElement(labeledLexerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_ATOM: {
				LexerAtom lexerAtom = (LexerAtom)theEObject;
				T result = caseLexerAtom(lexerAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_CHAR_SET: {
				LexerCharSet lexerCharSet = (LexerCharSet)theEObject;
				T result = caseLexerCharSet(lexerCharSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_BLOCK: {
				LexerBlock lexerBlock = (LexerBlock)theEObject;
				T result = caseLexerBlock(lexerBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_COMMANDS: {
				LexerCommands lexerCommands = (LexerCommands)theEObject;
				T result = caseLexerCommands(lexerCommands);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_COMMAND: {
				LexerCommand lexerCommand = (LexerCommand)theEObject;
				T result = caseLexerCommand(lexerCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_COMMAND_EXPR: {
				LexerCommandExpr lexerCommandExpr = (LexerCommandExpr)theEObject;
				T result = caseLexerCommandExpr(lexerCommandExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.LEXER_COMMAND_ARG: {
				LexerCommandArg lexerCommandArg = (LexerCommandArg)theEObject;
				T result = caseLexerCommandArg(lexerCommandArg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Antlr4Package.QUALIFIED_ID: {
				QualifiedId qualifiedId = (QualifiedId)theEObject;
				T result = caseQualifiedId(qualifiedId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammar(Grammar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prequel Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prequel Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrequelConstruct(PrequelConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Vocab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Vocab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenVocab(TokenVocab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionValue(OptionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedOption(QualifiedOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOption(StringOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionOption(ActionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOption(IntOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tokens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokens(Tokens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>V4 Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>V4 Tokens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV4Tokens(V4Tokens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>V4 Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>V4 Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV4Token(V4Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Tokens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyTokens(EmptyTokens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>V3 Tokens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>V3 Tokens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV3Tokens(V3Tokens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>V3 Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>V3 Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV3Token(V3Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammar Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammar Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammarAction(GrammarAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parser Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parser Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParserRule(ParserRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionGroup(ExceptionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyClause(FinallyClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exceptions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exceptions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptions(Exceptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVars(LocalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Prequel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Prequel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulePrequel(RulePrequel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleAction(RuleAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBlock(RuleBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Alt List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleAltList(RuleAltList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledAlt(LabeledAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebnf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebnf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbnf(Ebnf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledElement(LabeledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebnf Suffix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebnf Suffix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbnfSuffix(EbnfSuffix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltList(AltList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleRef(RuleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOptions(ElementOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenRef(TokenRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSet(NotSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockSet(BlockSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetElement(SetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildcard(Wildcard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOption(ElementOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerRule(LexerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Rule Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Rule Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerRuleBlock(LexerRuleBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Alt List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Alt List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerAltList(LexerAltList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerAlt(LexerAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerElements(LexerElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerElement(LexerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Lexer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Lexer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledLexerElement(LabeledLexerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerAtom(LexerAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Char Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Char Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerCharSet(LexerCharSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerBlock(LexerBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Commands</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Commands</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerCommands(LexerCommands object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerCommand(LexerCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Command Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Command Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerCommandExpr(LexerCommandExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexer Command Arg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexer Command Arg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexerCommandArg(LexerCommandArg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedId(QualifiedId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Antlr4Switch
