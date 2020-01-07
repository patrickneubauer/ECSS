/**
 */
package antlr4;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see antlr4.Antlr4Factory
 * @model kind="package"
 * @generated
 */
public interface Antlr4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "antlr4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.com.srclang/github/jknack/antlr4ide/Antlr4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "antlr4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Antlr4Package eINSTANCE = antlr4.impl.Antlr4PackageImpl.init();

	/**
	 * The meta object id for the '{@link antlr4.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.GrammarImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Prequels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__PREQUELS = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = 3;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__MODES = 4;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.PrequelConstructImpl <em>Prequel Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.PrequelConstructImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getPrequelConstruct()
	 * @generated
	 */
	int PREQUEL_CONSTRUCT = 1;

	/**
	 * The number of structural features of the '<em>Prequel Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREQUEL_CONSTRUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prequel Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREQUEL_CONSTRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.OptionsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__KEYWORD = PREQUEL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OPTIONS = PREQUEL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = PREQUEL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = PREQUEL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.OptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.TokenVocabImpl <em>Token Vocab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.TokenVocabImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getTokenVocab()
	 * @generated
	 */
	int TOKEN_VOCAB = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VOCAB__NAME = OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VOCAB__VALUE = OPTION__VALUE;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VOCAB__IMPORT_URI = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token Vocab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VOCAB_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Token Vocab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VOCAB_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.OptionValueImpl <em>Option Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.OptionValueImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getOptionValue()
	 * @generated
	 */
	int OPTION_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Option Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.QualifiedOptionImpl <em>Qualified Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.QualifiedOptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getQualifiedOption()
	 * @generated
	 */
	int QUALIFIED_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OPTION__VALUE = OPTION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualified Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OPTION_FEATURE_COUNT = OPTION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Qualified Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OPTION_OPERATION_COUNT = OPTION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.StringOptionImpl <em>String Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.StringOptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getStringOption()
	 * @generated
	 */
	int STRING_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION__VALUE = OPTION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_FEATURE_COUNT = OPTION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPTION_OPERATION_COUNT = OPTION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ActionOptionImpl <em>Action Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ActionOptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getActionOption()
	 * @generated
	 */
	int ACTION_OPTION = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPTION__VALUE = OPTION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPTION_FEATURE_COUNT = OPTION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPTION_OPERATION_COUNT = OPTION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.IntOptionImpl <em>Int Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.IntOptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getIntOption()
	 * @generated
	 */
	int INT_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION__VALUE = OPTION_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION_FEATURE_COUNT = OPTION_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPTION_OPERATION_COUNT = OPTION_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ImportsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 10;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__KEYWORD = PREQUEL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__IMPORTS = PREQUEL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = PREQUEL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_OPERATION_COUNT = PREQUEL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ImportImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 11;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.TokensImpl <em>Tokens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.TokensImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getTokens()
	 * @generated
	 */
	int TOKENS = 12;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENS__KEYWORD = PREQUEL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENS_FEATURE_COUNT = PREQUEL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKENS_OPERATION_COUNT = PREQUEL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.V4TokensImpl <em>V4 Tokens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.V4TokensImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getV4Tokens()
	 * @generated
	 */
	int V4_TOKENS = 13;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKENS__KEYWORD = TOKENS__KEYWORD;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKENS__TOKENS = TOKENS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>V4 Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKENS_FEATURE_COUNT = TOKENS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>V4 Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKENS_OPERATION_COUNT = TOKENS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.TokenRefImpl <em>Token Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.TokenRefImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getTokenRef()
	 * @generated
	 */
	int TOKEN_REF = 46;

	/**
	 * The number of structural features of the '<em>Token Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Token Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.V4TokenImpl <em>V4 Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.V4TokenImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getV4Token()
	 * @generated
	 */
	int V4_TOKEN = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKEN__NAME = TOKEN_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>V4 Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKEN_FEATURE_COUNT = TOKEN_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>V4 Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V4_TOKEN_OPERATION_COUNT = TOKEN_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.EmptyTokensImpl <em>Empty Tokens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.EmptyTokensImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getEmptyTokens()
	 * @generated
	 */
	int EMPTY_TOKENS = 15;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TOKENS__KEYWORD = TOKENS__KEYWORD;

	/**
	 * The number of structural features of the '<em>Empty Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TOKENS_FEATURE_COUNT = TOKENS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TOKENS_OPERATION_COUNT = TOKENS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.V3TokensImpl <em>V3 Tokens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.V3TokensImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getV3Tokens()
	 * @generated
	 */
	int V3_TOKENS = 16;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKENS__KEYWORD = TOKENS__KEYWORD;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKENS__TOKENS = TOKENS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>V3 Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKENS_FEATURE_COUNT = TOKENS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>V3 Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKENS_OPERATION_COUNT = TOKENS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.V3TokenImpl <em>V3 Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.V3TokenImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getV3Token()
	 * @generated
	 */
	int V3_TOKEN = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKEN__ID = TOKEN_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKEN__VALUE = TOKEN_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>V3 Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKEN_FEATURE_COUNT = TOKEN_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>V3 Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V3_TOKEN_OPERATION_COUNT = TOKEN_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.GrammarActionImpl <em>Grammar Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.GrammarActionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getGrammarAction()
	 * @generated
	 */
	int GRAMMAR_ACTION = 18;

	/**
	 * The feature id for the '<em><b>At Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION__AT_SYMBOL = PREQUEL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION__SCOPE = PREQUEL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colon Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION__COLON_SYMBOL = PREQUEL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION__NAME = PREQUEL_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION__ACTION = PREQUEL_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Grammar Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION_FEATURE_COUNT = PREQUEL_CONSTRUCT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Grammar Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_ACTION_OPERATION_COUNT = PREQUEL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerCommandArgImpl <em>Lexer Command Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerCommandArgImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommandArg()
	 * @generated
	 */
	int LEXER_COMMAND_ARG = 65;

	/**
	 * The number of structural features of the '<em>Lexer Command Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_ARG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lexer Command Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_ARG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ModeImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getMode()
	 * @generated
	 */
	int MODE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ID = LEXER_COMMAND_ARG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__RULES = LEXER_COMMAND_ARG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = LEXER_COMMAND_ARG_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = LEXER_COMMAND_ARG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RuleImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRule()
	 * @generated
	 */
	int RULE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semicolon Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SEMICOLON_SYMBOL = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ParserRuleImpl <em>Parser Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ParserRuleImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getParserRule()
	 * @generated
	 */
	int PARSER_RULE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Semicolon Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__SEMICOLON_SYMBOL = RULE__SEMICOLON_SYMBOL;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__ARGS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__RETURN = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__THROWS = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__LOCALS = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prequels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__PREQUELS = RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__BODY = RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Caught</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__CAUGHT = RULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parser Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parser Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ExceptionGroupImpl <em>Exception Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ExceptionGroupImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getExceptionGroup()
	 * @generated
	 */
	int EXCEPTION_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_GROUP__HANDLERS = 0;

	/**
	 * The feature id for the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_GROUP__FINALLY = 1;

	/**
	 * The number of structural features of the '<em>Exception Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exception Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ExceptionHandlerImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 23;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__BODY = 1;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.FinallyClauseImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getFinallyClause()
	 * @generated
	 */
	int FINALLY_CLAUSE = 24;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE__BODY = 0;

	/**
	 * The number of structural features of the '<em>Finally Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Finally Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ReturnImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 25;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__BODY = 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ExceptionsImpl <em>Exceptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ExceptionsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getExceptions()
	 * @generated
	 */
	int EXCEPTIONS = 26;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONS__EXCEPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exceptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LocalVarsImpl <em>Local Vars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LocalVarsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLocalVars()
	 * @generated
	 */
	int LOCAL_VARS = 27;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS__BODY = 0;

	/**
	 * The number of structural features of the '<em>Local Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Local Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RulePrequelImpl <em>Rule Prequel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RulePrequelImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRulePrequel()
	 * @generated
	 */
	int RULE_PREQUEL = 28;

	/**
	 * The number of structural features of the '<em>Rule Prequel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PREQUEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rule Prequel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_PREQUEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RuleActionImpl <em>Rule Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RuleActionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRuleAction()
	 * @generated
	 */
	int RULE_ACTION = 29;

	/**
	 * The feature id for the '<em><b>At Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ACTION__AT_SYMBOL = RULE_PREQUEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ACTION__NAME = RULE_PREQUEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ACTION__BODY = RULE_PREQUEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ACTION_FEATURE_COUNT = RULE_PREQUEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rule Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ACTION_OPERATION_COUNT = RULE_PREQUEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RuleBlockImpl <em>Rule Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RuleBlockImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRuleBlock()
	 * @generated
	 */
	int RULE_BLOCK = 30;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BLOCK__BODY = 0;

	/**
	 * The number of structural features of the '<em>Rule Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RuleAltListImpl <em>Rule Alt List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RuleAltListImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRuleAltList()
	 * @generated
	 */
	int RULE_ALT_LIST = 31;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ALT_LIST__ALTERNATIVES = 0;

	/**
	 * The number of structural features of the '<em>Rule Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ALT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ALT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LabeledAltImpl <em>Labeled Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LabeledAltImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLabeledAlt()
	 * @generated
	 */
	int LABELED_ALT = 32;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ALT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Pound Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ALT__POUND_SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ALT__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Labeled Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ALT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Labeled Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ALT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.AlternativeImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 33;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.EbnfImpl <em>Ebnf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.EbnfImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getEbnf()
	 * @generated
	 */
	int EBNF = 35;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF__BODY = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Ebnf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ebnf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ActionElementImpl <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ActionElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__OPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LabeledElementImpl <em>Labeled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LabeledElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLabeledElement()
	 * @generated
	 */
	int LABELED_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__BODY = 1;

	/**
	 * The number of structural features of the '<em>Labeled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Labeled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.EbnfSuffixImpl <em>Ebnf Suffix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.EbnfSuffixImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getEbnfSuffix()
	 * @generated
	 */
	int EBNF_SUFFIX = 38;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_SUFFIX__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Nongreedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_SUFFIX__NONGREEDY = 1;

	/**
	 * The number of structural features of the '<em>Ebnf Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_SUFFIX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ebnf Suffix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_SUFFIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.BlockImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 39;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BODY = 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.AltListImpl <em>Alt List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.AltListImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getAltList()
	 * @generated
	 */
	int ALT_LIST = 40;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_LIST__ALTERNATIVES = 0;

	/**
	 * The number of structural features of the '<em>Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.AtomImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 41;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__BODY = 0;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RuleRefImpl <em>Rule Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RuleRefImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRuleRef()
	 * @generated
	 */
	int RULE_REF = 42;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REF__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REF__ARGS = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REF__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Rule Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rule Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ElementOptionsImpl <em>Element Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ElementOptionsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getElementOptions()
	 * @generated
	 */
	int ELEMENT_OPTIONS = 43;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTIONS__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTIONS__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTIONS__END = 2;

	/**
	 * The number of structural features of the '<em>Element Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.RangeImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 44;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__TO = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.TerminalImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 45;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LITERAL = 2;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.NotSetImpl <em>Not Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.NotSetImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getNotSet()
	 * @generated
	 */
	int NOT_SET = 47;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SET__BODY = 0;

	/**
	 * The number of structural features of the '<em>Not Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Not Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.BlockSetImpl <em>Block Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.BlockSetImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getBlockSet()
	 * @generated
	 */
	int BLOCK_SET = 48;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SET__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Block Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.SetElementImpl <em>Set Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.SetElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getSetElement()
	 * @generated
	 */
	int SET_ELEMENT = 49;

	/**
	 * The feature id for the '<em><b>Token Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__TOKEN_REF = 0;

	/**
	 * The feature id for the '<em><b>String Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__STRING_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Char Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT__CHAR_SET = 3;

	/**
	 * The number of structural features of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Set Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.WildcardImpl <em>Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.WildcardImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getWildcard()
	 * @generated
	 */
	int WILDCARD = 50;

	/**
	 * The feature id for the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__DOT = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__OPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.ElementOptionImpl <em>Element Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.ElementOptionImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getElementOption()
	 * @generated
	 */
	int ELEMENT_OPTION = 51;

	/**
	 * The feature id for the '<em><b>Qualified Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION__QUALIFIED_ID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION__ID = 1;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION__ASSIGN = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Element Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerRuleImpl <em>Lexer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerRuleImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerRule()
	 * @generated
	 */
	int LEXER_RULE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Semicolon Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE__SEMICOLON_SYMBOL = RULE__SEMICOLON_SYMBOL;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE__FRAGMENT = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE__BODY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lexer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lexer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerRuleBlockImpl <em>Lexer Rule Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerRuleBlockImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerRuleBlock()
	 * @generated
	 */
	int LEXER_RULE_BLOCK = 53;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE_BLOCK__BODY = 0;

	/**
	 * The number of structural features of the '<em>Lexer Rule Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexer Rule Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_RULE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerAltListImpl <em>Lexer Alt List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerAltListImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerAltList()
	 * @generated
	 */
	int LEXER_ALT_LIST = 54;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT_LIST__ALTERNATIVES = 0;

	/**
	 * The number of structural features of the '<em>Lexer Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexer Alt List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerAltImpl <em>Lexer Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerAltImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerAlt()
	 * @generated
	 */
	int LEXER_ALT = 55;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Lexer Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ALT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerElementsImpl <em>Lexer Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerElementsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerElements()
	 * @generated
	 */
	int LEXER_ELEMENTS = 56;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENTS__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Lexer Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexer Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerElementImpl <em>Lexer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerElement()
	 * @generated
	 */
	int LEXER_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENT__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Lexer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LabeledLexerElementImpl <em>Labeled Lexer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LabeledLexerElementImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLabeledLexerElement()
	 * @generated
	 */
	int LABELED_LEXER_ELEMENT = 58;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_LEXER_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_LEXER_ELEMENT__BODY = 1;

	/**
	 * The number of structural features of the '<em>Labeled Lexer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_LEXER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Labeled Lexer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_LEXER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerAtomImpl <em>Lexer Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerAtomImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerAtom()
	 * @generated
	 */
	int LEXER_ATOM = 59;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ATOM__BODY = 0;

	/**
	 * The number of structural features of the '<em>Lexer Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ATOM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexer Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_ATOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerCharSetImpl <em>Lexer Char Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerCharSetImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerCharSet()
	 * @generated
	 */
	int LEXER_CHAR_SET = 60;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_CHAR_SET__BODY = 0;

	/**
	 * The number of structural features of the '<em>Lexer Char Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_CHAR_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lexer Char Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_CHAR_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerBlockImpl <em>Lexer Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerBlockImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerBlock()
	 * @generated
	 */
	int LEXER_BLOCK = 61;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_BLOCK__OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_BLOCK__BODY = 1;

	/**
	 * The number of structural features of the '<em>Lexer Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerCommandsImpl <em>Lexer Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerCommandsImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommands()
	 * @generated
	 */
	int LEXER_COMMANDS = 62;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMANDS__KEYWORD = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMANDS__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Lexer Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMANDS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMANDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerCommandImpl <em>Lexer Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerCommandImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommand()
	 * @generated
	 */
	int LEXER_COMMAND = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND__ARGS = 1;

	/**
	 * The number of structural features of the '<em>Lexer Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.LexerCommandExprImpl <em>Lexer Command Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.LexerCommandExprImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommandExpr()
	 * @generated
	 */
	int LEXER_COMMAND_EXPR = 64;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_EXPR__REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_EXPR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Lexer Command Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_EXPR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexer Command Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXER_COMMAND_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.impl.QualifiedIdImpl <em>Qualified Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.impl.QualifiedIdImpl
	 * @see antlr4.impl.Antlr4PackageImpl#getQualifiedId()
	 * @generated
	 */
	int QUALIFIED_ID = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ID__NAME = 0;

	/**
	 * The number of structural features of the '<em>Qualified Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualified Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link antlr4.GrammarType <em>Grammar Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr4.GrammarType
	 * @see antlr4.impl.Antlr4PackageImpl#getGrammarType()
	 * @generated
	 */
	int GRAMMAR_TYPE = 67;


	/**
	 * Returns the meta object for class '{@link antlr4.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see antlr4.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Grammar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see antlr4.Grammar#getType()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Type();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Grammar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.Grammar#getName()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Grammar#getPrequels <em>Prequels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prequels</em>'.
	 * @see antlr4.Grammar#getPrequels()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Prequels();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see antlr4.Grammar#getRules()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Grammar#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see antlr4.Grammar#getModes()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Modes();

	/**
	 * Returns the meta object for class '{@link antlr4.PrequelConstruct <em>Prequel Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prequel Construct</em>'.
	 * @see antlr4.PrequelConstruct
	 * @generated
	 */
	EClass getPrequelConstruct();

	/**
	 * Returns the meta object for class '{@link antlr4.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see antlr4.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Options#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see antlr4.Options#getKeyword()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Options#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see antlr4.Options#getOptions()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Options();

	/**
	 * Returns the meta object for class '{@link antlr4.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see antlr4.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see antlr4.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.TokenVocab <em>Token Vocab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Vocab</em>'.
	 * @see antlr4.TokenVocab
	 * @generated
	 */
	EClass getTokenVocab();

	/**
	 * Returns the meta object for the reference '{@link antlr4.TokenVocab#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import URI</em>'.
	 * @see antlr4.TokenVocab#getImportURI()
	 * @see #getTokenVocab()
	 * @generated
	 */
	EReference getTokenVocab_ImportURI();

	/**
	 * Returns the meta object for class '{@link antlr4.OptionValue <em>Option Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Value</em>'.
	 * @see antlr4.OptionValue
	 * @generated
	 */
	EClass getOptionValue();

	/**
	 * Returns the meta object for class '{@link antlr4.QualifiedOption <em>Qualified Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Option</em>'.
	 * @see antlr4.QualifiedOption
	 * @generated
	 */
	EClass getQualifiedOption();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.QualifiedOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see antlr4.QualifiedOption#getValue()
	 * @see #getQualifiedOption()
	 * @generated
	 */
	EReference getQualifiedOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.StringOption <em>String Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Option</em>'.
	 * @see antlr4.StringOption
	 * @generated
	 */
	EClass getStringOption();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.StringOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see antlr4.StringOption#getValue()
	 * @see #getStringOption()
	 * @generated
	 */
	EAttribute getStringOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.ActionOption <em>Action Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Option</em>'.
	 * @see antlr4.ActionOption
	 * @generated
	 */
	EClass getActionOption();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ActionOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see antlr4.ActionOption#getValue()
	 * @see #getActionOption()
	 * @generated
	 */
	EAttribute getActionOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.IntOption <em>Int Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Option</em>'.
	 * @see antlr4.IntOption
	 * @generated
	 */
	EClass getIntOption();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.IntOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see antlr4.IntOption#getValue()
	 * @see #getIntOption()
	 * @generated
	 */
	EAttribute getIntOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see antlr4.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Imports#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see antlr4.Imports#getKeyword()
	 * @see #getImports()
	 * @generated
	 */
	EAttribute getImports_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Imports#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see antlr4.Imports#getImports()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_Imports();

	/**
	 * Returns the meta object for class '{@link antlr4.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see antlr4.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Import#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see antlr4.Import#getAlias()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Alias();

	/**
	 * Returns the meta object for the reference '{@link antlr4.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import URI</em>'.
	 * @see antlr4.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link antlr4.Tokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tokens</em>'.
	 * @see antlr4.Tokens
	 * @generated
	 */
	EClass getTokens();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Tokens#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see antlr4.Tokens#getKeyword()
	 * @see #getTokens()
	 * @generated
	 */
	EAttribute getTokens_Keyword();

	/**
	 * Returns the meta object for class '{@link antlr4.V4Tokens <em>V4 Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>V4 Tokens</em>'.
	 * @see antlr4.V4Tokens
	 * @generated
	 */
	EClass getV4Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.V4Tokens#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see antlr4.V4Tokens#getTokens()
	 * @see #getV4Tokens()
	 * @generated
	 */
	EReference getV4Tokens_Tokens();

	/**
	 * Returns the meta object for class '{@link antlr4.V4Token <em>V4 Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>V4 Token</em>'.
	 * @see antlr4.V4Token
	 * @generated
	 */
	EClass getV4Token();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.V4Token#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.V4Token#getName()
	 * @see #getV4Token()
	 * @generated
	 */
	EAttribute getV4Token_Name();

	/**
	 * Returns the meta object for class '{@link antlr4.EmptyTokens <em>Empty Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Tokens</em>'.
	 * @see antlr4.EmptyTokens
	 * @generated
	 */
	EClass getEmptyTokens();

	/**
	 * Returns the meta object for class '{@link antlr4.V3Tokens <em>V3 Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>V3 Tokens</em>'.
	 * @see antlr4.V3Tokens
	 * @generated
	 */
	EClass getV3Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.V3Tokens#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see antlr4.V3Tokens#getTokens()
	 * @see #getV3Tokens()
	 * @generated
	 */
	EReference getV3Tokens_Tokens();

	/**
	 * Returns the meta object for class '{@link antlr4.V3Token <em>V3 Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>V3 Token</em>'.
	 * @see antlr4.V3Token
	 * @generated
	 */
	EClass getV3Token();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.V3Token#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see antlr4.V3Token#getId()
	 * @see #getV3Token()
	 * @generated
	 */
	EAttribute getV3Token_Id();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.V3Token#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see antlr4.V3Token#getValue()
	 * @see #getV3Token()
	 * @generated
	 */
	EAttribute getV3Token_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.GrammarAction <em>Grammar Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar Action</em>'.
	 * @see antlr4.GrammarAction
	 * @generated
	 */
	EClass getGrammarAction();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.GrammarAction#getAtSymbol <em>At Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Symbol</em>'.
	 * @see antlr4.GrammarAction#getAtSymbol()
	 * @see #getGrammarAction()
	 * @generated
	 */
	EAttribute getGrammarAction_AtSymbol();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.GrammarAction#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see antlr4.GrammarAction#getScope()
	 * @see #getGrammarAction()
	 * @generated
	 */
	EAttribute getGrammarAction_Scope();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.GrammarAction#getColonSymbol <em>Colon Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colon Symbol</em>'.
	 * @see antlr4.GrammarAction#getColonSymbol()
	 * @see #getGrammarAction()
	 * @generated
	 */
	EAttribute getGrammarAction_ColonSymbol();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.GrammarAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.GrammarAction#getName()
	 * @see #getGrammarAction()
	 * @generated
	 */
	EAttribute getGrammarAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.GrammarAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see antlr4.GrammarAction#getAction()
	 * @see #getGrammarAction()
	 * @generated
	 */
	EAttribute getGrammarAction_Action();

	/**
	 * Returns the meta object for class '{@link antlr4.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see antlr4.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Mode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see antlr4.Mode#getId()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Mode#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see antlr4.Mode#getRules()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Rules();

	/**
	 * Returns the meta object for class '{@link antlr4.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see antlr4.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Rule#getSemicolonSymbol <em>Semicolon Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semicolon Symbol</em>'.
	 * @see antlr4.Rule#getSemicolonSymbol()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_SemicolonSymbol();

	/**
	 * Returns the meta object for class '{@link antlr4.ParserRule <em>Parser Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Rule</em>'.
	 * @see antlr4.ParserRule
	 * @generated
	 */
	EClass getParserRule();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ParserRule#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see antlr4.ParserRule#getArgs()
	 * @see #getParserRule()
	 * @generated
	 */
	EAttribute getParserRule_Args();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ParserRule#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see antlr4.ParserRule#getReturn()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Return();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ParserRule#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throws</em>'.
	 * @see antlr4.ParserRule#getThrows()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Throws();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ParserRule#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locals</em>'.
	 * @see antlr4.ParserRule#getLocals()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.ParserRule#getPrequels <em>Prequels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prequels</em>'.
	 * @see antlr4.ParserRule#getPrequels()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Prequels();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ParserRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.ParserRule#getBody()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ParserRule#getCaught <em>Caught</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caught</em>'.
	 * @see antlr4.ParserRule#getCaught()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Caught();

	/**
	 * Returns the meta object for class '{@link antlr4.ExceptionGroup <em>Exception Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Group</em>'.
	 * @see antlr4.ExceptionGroup
	 * @generated
	 */
	EClass getExceptionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.ExceptionGroup#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see antlr4.ExceptionGroup#getHandlers()
	 * @see #getExceptionGroup()
	 * @generated
	 */
	EReference getExceptionGroup_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ExceptionGroup#getFinally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally</em>'.
	 * @see antlr4.ExceptionGroup#getFinally()
	 * @see #getExceptionGroup()
	 * @generated
	 */
	EReference getExceptionGroup_Finally();

	/**
	 * Returns the meta object for class '{@link antlr4.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see antlr4.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ExceptionHandler#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see antlr4.ExceptionHandler#getException()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EAttribute getExceptionHandler_Exception();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ExceptionHandler#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.ExceptionHandler#getBody()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EAttribute getExceptionHandler_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.FinallyClause <em>Finally Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Clause</em>'.
	 * @see antlr4.FinallyClause
	 * @generated
	 */
	EClass getFinallyClause();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.FinallyClause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.FinallyClause#getBody()
	 * @see #getFinallyClause()
	 * @generated
	 */
	EAttribute getFinallyClause_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see antlr4.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Return#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.Return#getBody()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.Exceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exceptions</em>'.
	 * @see antlr4.Exceptions
	 * @generated
	 */
	EClass getExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Exceptions#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see antlr4.Exceptions#getExceptions()
	 * @see #getExceptions()
	 * @generated
	 */
	EReference getExceptions_Exceptions();

	/**
	 * Returns the meta object for class '{@link antlr4.LocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Vars</em>'.
	 * @see antlr4.LocalVars
	 * @generated
	 */
	EClass getLocalVars();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LocalVars#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.LocalVars#getBody()
	 * @see #getLocalVars()
	 * @generated
	 */
	EAttribute getLocalVars_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.RulePrequel <em>Rule Prequel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Prequel</em>'.
	 * @see antlr4.RulePrequel
	 * @generated
	 */
	EClass getRulePrequel();

	/**
	 * Returns the meta object for class '{@link antlr4.RuleAction <em>Rule Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Action</em>'.
	 * @see antlr4.RuleAction
	 * @generated
	 */
	EClass getRuleAction();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.RuleAction#getAtSymbol <em>At Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Symbol</em>'.
	 * @see antlr4.RuleAction#getAtSymbol()
	 * @see #getRuleAction()
	 * @generated
	 */
	EAttribute getRuleAction_AtSymbol();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.RuleAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.RuleAction#getName()
	 * @see #getRuleAction()
	 * @generated
	 */
	EAttribute getRuleAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.RuleAction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.RuleAction#getBody()
	 * @see #getRuleAction()
	 * @generated
	 */
	EAttribute getRuleAction_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.RuleBlock <em>Rule Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Block</em>'.
	 * @see antlr4.RuleBlock
	 * @generated
	 */
	EClass getRuleBlock();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.RuleBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.RuleBlock#getBody()
	 * @see #getRuleBlock()
	 * @generated
	 */
	EReference getRuleBlock_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.RuleAltList <em>Rule Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Alt List</em>'.
	 * @see antlr4.RuleAltList
	 * @generated
	 */
	EClass getRuleAltList();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.RuleAltList#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see antlr4.RuleAltList#getAlternatives()
	 * @see #getRuleAltList()
	 * @generated
	 */
	EReference getRuleAltList_Alternatives();

	/**
	 * Returns the meta object for class '{@link antlr4.LabeledAlt <em>Labeled Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Alt</em>'.
	 * @see antlr4.LabeledAlt
	 * @generated
	 */
	EClass getLabeledAlt();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LabeledAlt#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LabeledAlt#getBody()
	 * @see #getLabeledAlt()
	 * @generated
	 */
	EReference getLabeledAlt_Body();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LabeledAlt#getPoundSymbol <em>Pound Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pound Symbol</em>'.
	 * @see antlr4.LabeledAlt#getPoundSymbol()
	 * @see #getLabeledAlt()
	 * @generated
	 */
	EAttribute getLabeledAlt_PoundSymbol();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LabeledAlt#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see antlr4.LabeledAlt#getLabel()
	 * @see #getLabeledAlt()
	 * @generated
	 */
	EAttribute getLabeledAlt_Label();

	/**
	 * Returns the meta object for class '{@link antlr4.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see antlr4.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Alternative#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.Alternative#getOptions()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Alternative#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see antlr4.Alternative#getElements()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Elements();

	/**
	 * Returns the meta object for class '{@link antlr4.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see antlr4.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Element#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.Element#getBody()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Element#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see antlr4.Element#getOperator()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Operator();

	/**
	 * Returns the meta object for class '{@link antlr4.Ebnf <em>Ebnf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebnf</em>'.
	 * @see antlr4.Ebnf
	 * @generated
	 */
	EClass getEbnf();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Ebnf#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.Ebnf#getBody()
	 * @see #getEbnf()
	 * @generated
	 */
	EReference getEbnf_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Ebnf#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see antlr4.Ebnf#getOperator()
	 * @see #getEbnf()
	 * @generated
	 */
	EReference getEbnf_Operator();

	/**
	 * Returns the meta object for class '{@link antlr4.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element</em>'.
	 * @see antlr4.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ActionElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.ActionElement#getBody()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ActionElement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.ActionElement#getOptions()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_Options();

	/**
	 * Returns the meta object for class '{@link antlr4.LabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Element</em>'.
	 * @see antlr4.LabeledElement
	 * @generated
	 */
	EClass getLabeledElement();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LabeledElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.LabeledElement#getName()
	 * @see #getLabeledElement()
	 * @generated
	 */
	EAttribute getLabeledElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LabeledElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LabeledElement#getBody()
	 * @see #getLabeledElement()
	 * @generated
	 */
	EReference getLabeledElement_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.EbnfSuffix <em>Ebnf Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebnf Suffix</em>'.
	 * @see antlr4.EbnfSuffix
	 * @generated
	 */
	EClass getEbnfSuffix();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.EbnfSuffix#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see antlr4.EbnfSuffix#getOperator()
	 * @see #getEbnfSuffix()
	 * @generated
	 */
	EAttribute getEbnfSuffix_Operator();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.EbnfSuffix#getNongreedy <em>Nongreedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nongreedy</em>'.
	 * @see antlr4.EbnfSuffix#getNongreedy()
	 * @see #getEbnfSuffix()
	 * @generated
	 */
	EAttribute getEbnfSuffix_Nongreedy();

	/**
	 * Returns the meta object for class '{@link antlr4.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see antlr4.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Block#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.Block#getOptions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.Block#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see antlr4.Block#getActions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Block#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.Block#getBody()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.AltList <em>Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt List</em>'.
	 * @see antlr4.AltList
	 * @generated
	 */
	EClass getAltList();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.AltList#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see antlr4.AltList#getAlternatives()
	 * @see #getAltList()
	 * @generated
	 */
	EReference getAltList_Alternatives();

	/**
	 * Returns the meta object for class '{@link antlr4.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see antlr4.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Atom#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.Atom#getBody()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.RuleRef <em>Rule Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Ref</em>'.
	 * @see antlr4.RuleRef
	 * @generated
	 */
	EClass getRuleRef();

	/**
	 * Returns the meta object for the reference '{@link antlr4.RuleRef#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see antlr4.RuleRef#getReference()
	 * @see #getRuleRef()
	 * @generated
	 */
	EReference getRuleRef_Reference();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.RuleRef#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see antlr4.RuleRef#getArgs()
	 * @see #getRuleRef()
	 * @generated
	 */
	EAttribute getRuleRef_Args();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.RuleRef#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.RuleRef#getOptions()
	 * @see #getRuleRef()
	 * @generated
	 */
	EReference getRuleRef_Options();

	/**
	 * Returns the meta object for class '{@link antlr4.ElementOptions <em>Element Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Options</em>'.
	 * @see antlr4.ElementOptions
	 * @generated
	 */
	EClass getElementOptions();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ElementOptions#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see antlr4.ElementOptions#getBegin()
	 * @see #getElementOptions()
	 * @generated
	 */
	EAttribute getElementOptions_Begin();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.ElementOptions#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see antlr4.ElementOptions#getOptions()
	 * @see #getElementOptions()
	 * @generated
	 */
	EReference getElementOptions_Options();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ElementOptions#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see antlr4.ElementOptions#getEnd()
	 * @see #getElementOptions()
	 * @generated
	 */
	EAttribute getElementOptions_End();

	/**
	 * Returns the meta object for class '{@link antlr4.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see antlr4.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Range#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see antlr4.Range#getFrom()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_From();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Range#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see antlr4.Range#getTo()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_To();

	/**
	 * Returns the meta object for class '{@link antlr4.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see antlr4.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference '{@link antlr4.Terminal#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see antlr4.Terminal#getReference()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Terminal#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.Terminal#getOptions()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Options();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Terminal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see antlr4.Terminal#getLiteral()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Literal();

	/**
	 * Returns the meta object for class '{@link antlr4.TokenRef <em>Token Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Ref</em>'.
	 * @see antlr4.TokenRef
	 * @generated
	 */
	EClass getTokenRef();

	/**
	 * Returns the meta object for class '{@link antlr4.NotSet <em>Not Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Set</em>'.
	 * @see antlr4.NotSet
	 * @generated
	 */
	EClass getNotSet();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.NotSet#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.NotSet#getBody()
	 * @see #getNotSet()
	 * @generated
	 */
	EReference getNotSet_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.BlockSet <em>Block Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Set</em>'.
	 * @see antlr4.BlockSet
	 * @generated
	 */
	EClass getBlockSet();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.BlockSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see antlr4.BlockSet#getElements()
	 * @see #getBlockSet()
	 * @generated
	 */
	EReference getBlockSet_Elements();

	/**
	 * Returns the meta object for class '{@link antlr4.SetElement <em>Set Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Element</em>'.
	 * @see antlr4.SetElement
	 * @generated
	 */
	EClass getSetElement();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.SetElement#getTokenRef <em>Token Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Ref</em>'.
	 * @see antlr4.SetElement#getTokenRef()
	 * @see #getSetElement()
	 * @generated
	 */
	EAttribute getSetElement_TokenRef();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.SetElement#getStringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Literal</em>'.
	 * @see antlr4.SetElement#getStringLiteral()
	 * @see #getSetElement()
	 * @generated
	 */
	EAttribute getSetElement_StringLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.SetElement#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see antlr4.SetElement#getRange()
	 * @see #getSetElement()
	 * @generated
	 */
	EReference getSetElement_Range();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.SetElement#getCharSet <em>Char Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Set</em>'.
	 * @see antlr4.SetElement#getCharSet()
	 * @see #getSetElement()
	 * @generated
	 */
	EAttribute getSetElement_CharSet();

	/**
	 * Returns the meta object for class '{@link antlr4.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard</em>'.
	 * @see antlr4.Wildcard
	 * @generated
	 */
	EClass getWildcard();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.Wildcard#getDot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot</em>'.
	 * @see antlr4.Wildcard#getDot()
	 * @see #getWildcard()
	 * @generated
	 */
	EAttribute getWildcard_Dot();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.Wildcard#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.Wildcard#getOptions()
	 * @see #getWildcard()
	 * @generated
	 */
	EReference getWildcard_Options();

	/**
	 * Returns the meta object for class '{@link antlr4.ElementOption <em>Element Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Option</em>'.
	 * @see antlr4.ElementOption
	 * @generated
	 */
	EClass getElementOption();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ElementOption#getQualifiedId <em>Qualified Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualified Id</em>'.
	 * @see antlr4.ElementOption#getQualifiedId()
	 * @see #getElementOption()
	 * @generated
	 */
	EReference getElementOption_QualifiedId();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ElementOption#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see antlr4.ElementOption#getId()
	 * @see #getElementOption()
	 * @generated
	 */
	EAttribute getElementOption_Id();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.ElementOption#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign</em>'.
	 * @see antlr4.ElementOption#getAssign()
	 * @see #getElementOption()
	 * @generated
	 */
	EAttribute getElementOption_Assign();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.ElementOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see antlr4.ElementOption#getValue()
	 * @see #getElementOption()
	 * @generated
	 */
	EReference getElementOption_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerRule <em>Lexer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Rule</em>'.
	 * @see antlr4.LexerRule
	 * @generated
	 */
	EClass getLexerRule();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LexerRule#isFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see antlr4.LexerRule#isFragment()
	 * @see #getLexerRule()
	 * @generated
	 */
	EAttribute getLexerRule_Fragment();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerRule#getBody()
	 * @see #getLexerRule()
	 * @generated
	 */
	EReference getLexerRule_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerRuleBlock <em>Lexer Rule Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Rule Block</em>'.
	 * @see antlr4.LexerRuleBlock
	 * @generated
	 */
	EClass getLexerRuleBlock();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerRuleBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerRuleBlock#getBody()
	 * @see #getLexerRuleBlock()
	 * @generated
	 */
	EReference getLexerRuleBlock_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerAltList <em>Lexer Alt List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Alt List</em>'.
	 * @see antlr4.LexerAltList
	 * @generated
	 */
	EClass getLexerAltList();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.LexerAltList#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternatives</em>'.
	 * @see antlr4.LexerAltList#getAlternatives()
	 * @see #getLexerAltList()
	 * @generated
	 */
	EReference getLexerAltList_Alternatives();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerAlt <em>Lexer Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Alt</em>'.
	 * @see antlr4.LexerAlt
	 * @generated
	 */
	EClass getLexerAlt();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerAlt#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerAlt#getBody()
	 * @see #getLexerAlt()
	 * @generated
	 */
	EReference getLexerAlt_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerAlt#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commands</em>'.
	 * @see antlr4.LexerAlt#getCommands()
	 * @see #getLexerAlt()
	 * @generated
	 */
	EReference getLexerAlt_Commands();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerElements <em>Lexer Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Elements</em>'.
	 * @see antlr4.LexerElements
	 * @generated
	 */
	EClass getLexerElements();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.LexerElements#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see antlr4.LexerElements#getElements()
	 * @see #getLexerElements()
	 * @generated
	 */
	EReference getLexerElements_Elements();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerElement <em>Lexer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Element</em>'.
	 * @see antlr4.LexerElement
	 * @generated
	 */
	EClass getLexerElement();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerElement#getBody()
	 * @see #getLexerElement()
	 * @generated
	 */
	EReference getLexerElement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerElement#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see antlr4.LexerElement#getOperator()
	 * @see #getLexerElement()
	 * @generated
	 */
	EReference getLexerElement_Operator();

	/**
	 * Returns the meta object for class '{@link antlr4.LabeledLexerElement <em>Labeled Lexer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Lexer Element</em>'.
	 * @see antlr4.LabeledLexerElement
	 * @generated
	 */
	EClass getLabeledLexerElement();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LabeledLexerElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see antlr4.LabeledLexerElement#getLabel()
	 * @see #getLabeledLexerElement()
	 * @generated
	 */
	EAttribute getLabeledLexerElement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LabeledLexerElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LabeledLexerElement#getBody()
	 * @see #getLabeledLexerElement()
	 * @generated
	 */
	EReference getLabeledLexerElement_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerAtom <em>Lexer Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Atom</em>'.
	 * @see antlr4.LexerAtom
	 * @generated
	 */
	EClass getLexerAtom();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerAtom#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerAtom#getBody()
	 * @see #getLexerAtom()
	 * @generated
	 */
	EReference getLexerAtom_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerCharSet <em>Lexer Char Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Char Set</em>'.
	 * @see antlr4.LexerCharSet
	 * @generated
	 */
	EClass getLexerCharSet();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LexerCharSet#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see antlr4.LexerCharSet#getBody()
	 * @see #getLexerCharSet()
	 * @generated
	 */
	EAttribute getLexerCharSet_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerBlock <em>Lexer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Block</em>'.
	 * @see antlr4.LexerBlock
	 * @generated
	 */
	EClass getLexerBlock();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerBlock#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see antlr4.LexerBlock#getOptions()
	 * @see #getLexerBlock()
	 * @generated
	 */
	EReference getLexerBlock_Options();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see antlr4.LexerBlock#getBody()
	 * @see #getLexerBlock()
	 * @generated
	 */
	EReference getLexerBlock_Body();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerCommands <em>Lexer Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Commands</em>'.
	 * @see antlr4.LexerCommands
	 * @generated
	 */
	EClass getLexerCommands();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LexerCommands#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see antlr4.LexerCommands#getKeyword()
	 * @see #getLexerCommands()
	 * @generated
	 */
	EAttribute getLexerCommands_Keyword();

	/**
	 * Returns the meta object for the containment reference list '{@link antlr4.LexerCommands#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see antlr4.LexerCommands#getCommands()
	 * @see #getLexerCommands()
	 * @generated
	 */
	EReference getLexerCommands_Commands();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerCommand <em>Lexer Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Command</em>'.
	 * @see antlr4.LexerCommand
	 * @generated
	 */
	EClass getLexerCommand();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LexerCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see antlr4.LexerCommand#getName()
	 * @see #getLexerCommand()
	 * @generated
	 */
	EAttribute getLexerCommand_Name();

	/**
	 * Returns the meta object for the containment reference '{@link antlr4.LexerCommand#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see antlr4.LexerCommand#getArgs()
	 * @see #getLexerCommand()
	 * @generated
	 */
	EReference getLexerCommand_Args();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerCommandExpr <em>Lexer Command Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Command Expr</em>'.
	 * @see antlr4.LexerCommandExpr
	 * @generated
	 */
	EClass getLexerCommandExpr();

	/**
	 * Returns the meta object for the reference '{@link antlr4.LexerCommandExpr#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see antlr4.LexerCommandExpr#getRef()
	 * @see #getLexerCommandExpr()
	 * @generated
	 */
	EReference getLexerCommandExpr_Ref();

	/**
	 * Returns the meta object for the attribute '{@link antlr4.LexerCommandExpr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see antlr4.LexerCommandExpr#getValue()
	 * @see #getLexerCommandExpr()
	 * @generated
	 */
	EAttribute getLexerCommandExpr_Value();

	/**
	 * Returns the meta object for class '{@link antlr4.LexerCommandArg <em>Lexer Command Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexer Command Arg</em>'.
	 * @see antlr4.LexerCommandArg
	 * @generated
	 */
	EClass getLexerCommandArg();

	/**
	 * Returns the meta object for class '{@link antlr4.QualifiedId <em>Qualified Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Id</em>'.
	 * @see antlr4.QualifiedId
	 * @generated
	 */
	EClass getQualifiedId();

	/**
	 * Returns the meta object for the attribute list '{@link antlr4.QualifiedId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see antlr4.QualifiedId#getName()
	 * @see #getQualifiedId()
	 * @generated
	 */
	EAttribute getQualifiedId_Name();

	/**
	 * Returns the meta object for enum '{@link antlr4.GrammarType <em>Grammar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grammar Type</em>'.
	 * @see antlr4.GrammarType
	 * @generated
	 */
	EEnum getGrammarType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Antlr4Factory getAntlr4Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link antlr4.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.GrammarImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__TYPE = eINSTANCE.getGrammar_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__NAME = eINSTANCE.getGrammar_Name();

		/**
		 * The meta object literal for the '<em><b>Prequels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__PREQUELS = eINSTANCE.getGrammar_Prequels();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULES = eINSTANCE.getGrammar_Rules();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__MODES = eINSTANCE.getGrammar_Modes();

		/**
		 * The meta object literal for the '{@link antlr4.impl.PrequelConstructImpl <em>Prequel Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.PrequelConstructImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getPrequelConstruct()
		 * @generated
		 */
		EClass PREQUEL_CONSTRUCT = eINSTANCE.getPrequelConstruct();

		/**
		 * The meta object literal for the '{@link antlr4.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.OptionsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__KEYWORD = eINSTANCE.getOptions_Keyword();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS__OPTIONS = eINSTANCE.getOptions_Options();

		/**
		 * The meta object literal for the '{@link antlr4.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.OptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.TokenVocabImpl <em>Token Vocab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.TokenVocabImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getTokenVocab()
		 * @generated
		 */
		EClass TOKEN_VOCAB = eINSTANCE.getTokenVocab();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_VOCAB__IMPORT_URI = eINSTANCE.getTokenVocab_ImportURI();

		/**
		 * The meta object literal for the '{@link antlr4.impl.OptionValueImpl <em>Option Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.OptionValueImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getOptionValue()
		 * @generated
		 */
		EClass OPTION_VALUE = eINSTANCE.getOptionValue();

		/**
		 * The meta object literal for the '{@link antlr4.impl.QualifiedOptionImpl <em>Qualified Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.QualifiedOptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getQualifiedOption()
		 * @generated
		 */
		EClass QUALIFIED_OPTION = eINSTANCE.getQualifiedOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_OPTION__VALUE = eINSTANCE.getQualifiedOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.StringOptionImpl <em>String Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.StringOptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getStringOption()
		 * @generated
		 */
		EClass STRING_OPTION = eINSTANCE.getStringOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_OPTION__VALUE = eINSTANCE.getStringOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ActionOptionImpl <em>Action Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ActionOptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getActionOption()
		 * @generated
		 */
		EClass ACTION_OPTION = eINSTANCE.getActionOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_OPTION__VALUE = eINSTANCE.getActionOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.IntOptionImpl <em>Int Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.IntOptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getIntOption()
		 * @generated
		 */
		EClass INT_OPTION = eINSTANCE.getIntOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_OPTION__VALUE = eINSTANCE.getIntOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ImportsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTS__KEYWORD = eINSTANCE.getImports_Keyword();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__IMPORTS = eINSTANCE.getImports_Imports();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ImportImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ALIAS = eINSTANCE.getImport_Alias();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link antlr4.impl.TokensImpl <em>Tokens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.TokensImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getTokens()
		 * @generated
		 */
		EClass TOKENS = eINSTANCE.getTokens();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKENS__KEYWORD = eINSTANCE.getTokens_Keyword();

		/**
		 * The meta object literal for the '{@link antlr4.impl.V4TokensImpl <em>V4 Tokens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.V4TokensImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getV4Tokens()
		 * @generated
		 */
		EClass V4_TOKENS = eINSTANCE.getV4Tokens();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V4_TOKENS__TOKENS = eINSTANCE.getV4Tokens_Tokens();

		/**
		 * The meta object literal for the '{@link antlr4.impl.V4TokenImpl <em>V4 Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.V4TokenImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getV4Token()
		 * @generated
		 */
		EClass V4_TOKEN = eINSTANCE.getV4Token();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute V4_TOKEN__NAME = eINSTANCE.getV4Token_Name();

		/**
		 * The meta object literal for the '{@link antlr4.impl.EmptyTokensImpl <em>Empty Tokens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.EmptyTokensImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getEmptyTokens()
		 * @generated
		 */
		EClass EMPTY_TOKENS = eINSTANCE.getEmptyTokens();

		/**
		 * The meta object literal for the '{@link antlr4.impl.V3TokensImpl <em>V3 Tokens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.V3TokensImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getV3Tokens()
		 * @generated
		 */
		EClass V3_TOKENS = eINSTANCE.getV3Tokens();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V3_TOKENS__TOKENS = eINSTANCE.getV3Tokens_Tokens();

		/**
		 * The meta object literal for the '{@link antlr4.impl.V3TokenImpl <em>V3 Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.V3TokenImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getV3Token()
		 * @generated
		 */
		EClass V3_TOKEN = eINSTANCE.getV3Token();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute V3_TOKEN__ID = eINSTANCE.getV3Token_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute V3_TOKEN__VALUE = eINSTANCE.getV3Token_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.GrammarActionImpl <em>Grammar Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.GrammarActionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getGrammarAction()
		 * @generated
		 */
		EClass GRAMMAR_ACTION = eINSTANCE.getGrammarAction();

		/**
		 * The meta object literal for the '<em><b>At Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_ACTION__AT_SYMBOL = eINSTANCE.getGrammarAction_AtSymbol();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_ACTION__SCOPE = eINSTANCE.getGrammarAction_Scope();

		/**
		 * The meta object literal for the '<em><b>Colon Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_ACTION__COLON_SYMBOL = eINSTANCE.getGrammarAction_ColonSymbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_ACTION__NAME = eINSTANCE.getGrammarAction_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_ACTION__ACTION = eINSTANCE.getGrammarAction_Action();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ModeImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__ID = eINSTANCE.getMode_Id();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__RULES = eINSTANCE.getMode_Rules();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RuleImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Semicolon Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__SEMICOLON_SYMBOL = eINSTANCE.getRule_SemicolonSymbol();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ParserRuleImpl <em>Parser Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ParserRuleImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getParserRule()
		 * @generated
		 */
		EClass PARSER_RULE = eINSTANCE.getParserRule();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_RULE__ARGS = eINSTANCE.getParserRule_Args();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__RETURN = eINSTANCE.getParserRule_Return();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__THROWS = eINSTANCE.getParserRule_Throws();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__LOCALS = eINSTANCE.getParserRule_Locals();

		/**
		 * The meta object literal for the '<em><b>Prequels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__PREQUELS = eINSTANCE.getParserRule_Prequels();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__BODY = eINSTANCE.getParserRule_Body();

		/**
		 * The meta object literal for the '<em><b>Caught</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__CAUGHT = eINSTANCE.getParserRule_Caught();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ExceptionGroupImpl <em>Exception Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ExceptionGroupImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getExceptionGroup()
		 * @generated
		 */
		EClass EXCEPTION_GROUP = eINSTANCE.getExceptionGroup();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_GROUP__HANDLERS = eINSTANCE.getExceptionGroup_Handlers();

		/**
		 * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_GROUP__FINALLY = eINSTANCE.getExceptionGroup_Finally();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ExceptionHandlerImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_HANDLER__EXCEPTION = eINSTANCE.getExceptionHandler_Exception();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_HANDLER__BODY = eINSTANCE.getExceptionHandler_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.FinallyClauseImpl <em>Finally Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.FinallyClauseImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getFinallyClause()
		 * @generated
		 */
		EClass FINALLY_CLAUSE = eINSTANCE.getFinallyClause();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINALLY_CLAUSE__BODY = eINSTANCE.getFinallyClause_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ReturnImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__BODY = eINSTANCE.getReturn_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ExceptionsImpl <em>Exceptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ExceptionsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getExceptions()
		 * @generated
		 */
		EClass EXCEPTIONS = eINSTANCE.getExceptions();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTIONS__EXCEPTIONS = eINSTANCE.getExceptions_Exceptions();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LocalVarsImpl <em>Local Vars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LocalVarsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLocalVars()
		 * @generated
		 */
		EClass LOCAL_VARS = eINSTANCE.getLocalVars();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARS__BODY = eINSTANCE.getLocalVars_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RulePrequelImpl <em>Rule Prequel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RulePrequelImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRulePrequel()
		 * @generated
		 */
		EClass RULE_PREQUEL = eINSTANCE.getRulePrequel();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RuleActionImpl <em>Rule Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RuleActionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRuleAction()
		 * @generated
		 */
		EClass RULE_ACTION = eINSTANCE.getRuleAction();

		/**
		 * The meta object literal for the '<em><b>At Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ACTION__AT_SYMBOL = eINSTANCE.getRuleAction_AtSymbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ACTION__NAME = eINSTANCE.getRuleAction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ACTION__BODY = eINSTANCE.getRuleAction_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RuleBlockImpl <em>Rule Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RuleBlockImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRuleBlock()
		 * @generated
		 */
		EClass RULE_BLOCK = eINSTANCE.getRuleBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BLOCK__BODY = eINSTANCE.getRuleBlock_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RuleAltListImpl <em>Rule Alt List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RuleAltListImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRuleAltList()
		 * @generated
		 */
		EClass RULE_ALT_LIST = eINSTANCE.getRuleAltList();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ALT_LIST__ALTERNATIVES = eINSTANCE.getRuleAltList_Alternatives();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LabeledAltImpl <em>Labeled Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LabeledAltImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLabeledAlt()
		 * @generated
		 */
		EClass LABELED_ALT = eINSTANCE.getLabeledAlt();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_ALT__BODY = eINSTANCE.getLabeledAlt_Body();

		/**
		 * The meta object literal for the '<em><b>Pound Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_ALT__POUND_SYMBOL = eINSTANCE.getLabeledAlt_PoundSymbol();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_ALT__LABEL = eINSTANCE.getLabeledAlt_Label();

		/**
		 * The meta object literal for the '{@link antlr4.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.AlternativeImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__OPTIONS = eINSTANCE.getAlternative_Options();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__ELEMENTS = eINSTANCE.getAlternative_Elements();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__BODY = eINSTANCE.getElement_Body();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OPERATOR = eINSTANCE.getElement_Operator();

		/**
		 * The meta object literal for the '{@link antlr4.impl.EbnfImpl <em>Ebnf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.EbnfImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getEbnf()
		 * @generated
		 */
		EClass EBNF = eINSTANCE.getEbnf();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBNF__BODY = eINSTANCE.getEbnf_Body();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBNF__OPERATOR = eINSTANCE.getEbnf_Operator();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ActionElementImpl <em>Action Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ActionElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__BODY = eINSTANCE.getActionElement_Body();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__OPTIONS = eINSTANCE.getActionElement_Options();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LabeledElementImpl <em>Labeled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LabeledElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLabeledElement()
		 * @generated
		 */
		EClass LABELED_ELEMENT = eINSTANCE.getLabeledElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_ELEMENT__NAME = eINSTANCE.getLabeledElement_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_ELEMENT__BODY = eINSTANCE.getLabeledElement_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.EbnfSuffixImpl <em>Ebnf Suffix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.EbnfSuffixImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getEbnfSuffix()
		 * @generated
		 */
		EClass EBNF_SUFFIX = eINSTANCE.getEbnfSuffix();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBNF_SUFFIX__OPERATOR = eINSTANCE.getEbnfSuffix_Operator();

		/**
		 * The meta object literal for the '<em><b>Nongreedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBNF_SUFFIX__NONGREEDY = eINSTANCE.getEbnfSuffix_Nongreedy();

		/**
		 * The meta object literal for the '{@link antlr4.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.BlockImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OPTIONS = eINSTANCE.getBlock_Options();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ACTIONS = eINSTANCE.getBlock_Actions();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BODY = eINSTANCE.getBlock_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.AltListImpl <em>Alt List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.AltListImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getAltList()
		 * @generated
		 */
		EClass ALT_LIST = eINSTANCE.getAltList();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_LIST__ALTERNATIVES = eINSTANCE.getAltList_Alternatives();

		/**
		 * The meta object literal for the '{@link antlr4.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.AtomImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__BODY = eINSTANCE.getAtom_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RuleRefImpl <em>Rule Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RuleRefImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRuleRef()
		 * @generated
		 */
		EClass RULE_REF = eINSTANCE.getRuleRef();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_REF__REFERENCE = eINSTANCE.getRuleRef_Reference();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_REF__ARGS = eINSTANCE.getRuleRef_Args();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_REF__OPTIONS = eINSTANCE.getRuleRef_Options();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ElementOptionsImpl <em>Element Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ElementOptionsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getElementOptions()
		 * @generated
		 */
		EClass ELEMENT_OPTIONS = eINSTANCE.getElementOptions();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_OPTIONS__BEGIN = eINSTANCE.getElementOptions_Begin();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_OPTIONS__OPTIONS = eINSTANCE.getElementOptions_Options();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_OPTIONS__END = eINSTANCE.getElementOptions_End();

		/**
		 * The meta object literal for the '{@link antlr4.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.RangeImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__FROM = eINSTANCE.getRange_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__TO = eINSTANCE.getRange_To();

		/**
		 * The meta object literal for the '{@link antlr4.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.TerminalImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__REFERENCE = eINSTANCE.getTerminal_Reference();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__OPTIONS = eINSTANCE.getTerminal_Options();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__LITERAL = eINSTANCE.getTerminal_Literal();

		/**
		 * The meta object literal for the '{@link antlr4.impl.TokenRefImpl <em>Token Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.TokenRefImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getTokenRef()
		 * @generated
		 */
		EClass TOKEN_REF = eINSTANCE.getTokenRef();

		/**
		 * The meta object literal for the '{@link antlr4.impl.NotSetImpl <em>Not Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.NotSetImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getNotSet()
		 * @generated
		 */
		EClass NOT_SET = eINSTANCE.getNotSet();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_SET__BODY = eINSTANCE.getNotSet_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.BlockSetImpl <em>Block Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.BlockSetImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getBlockSet()
		 * @generated
		 */
		EClass BLOCK_SET = eINSTANCE.getBlockSet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SET__ELEMENTS = eINSTANCE.getBlockSet_Elements();

		/**
		 * The meta object literal for the '{@link antlr4.impl.SetElementImpl <em>Set Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.SetElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getSetElement()
		 * @generated
		 */
		EClass SET_ELEMENT = eINSTANCE.getSetElement();

		/**
		 * The meta object literal for the '<em><b>Token Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__TOKEN_REF = eINSTANCE.getSetElement_TokenRef();

		/**
		 * The meta object literal for the '<em><b>String Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__STRING_LITERAL = eINSTANCE.getSetElement_StringLiteral();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ELEMENT__RANGE = eINSTANCE.getSetElement_Range();

		/**
		 * The meta object literal for the '<em><b>Char Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ELEMENT__CHAR_SET = eINSTANCE.getSetElement_CharSet();

		/**
		 * The meta object literal for the '{@link antlr4.impl.WildcardImpl <em>Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.WildcardImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getWildcard()
		 * @generated
		 */
		EClass WILDCARD = eINSTANCE.getWildcard();

		/**
		 * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILDCARD__DOT = eINSTANCE.getWildcard_Dot();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILDCARD__OPTIONS = eINSTANCE.getWildcard_Options();

		/**
		 * The meta object literal for the '{@link antlr4.impl.ElementOptionImpl <em>Element Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.ElementOptionImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getElementOption()
		 * @generated
		 */
		EClass ELEMENT_OPTION = eINSTANCE.getElementOption();

		/**
		 * The meta object literal for the '<em><b>Qualified Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_OPTION__QUALIFIED_ID = eINSTANCE.getElementOption_QualifiedId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_OPTION__ID = eINSTANCE.getElementOption_Id();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_OPTION__ASSIGN = eINSTANCE.getElementOption_Assign();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_OPTION__VALUE = eINSTANCE.getElementOption_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerRuleImpl <em>Lexer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerRuleImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerRule()
		 * @generated
		 */
		EClass LEXER_RULE = eINSTANCE.getLexerRule();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXER_RULE__FRAGMENT = eINSTANCE.getLexerRule_Fragment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_RULE__BODY = eINSTANCE.getLexerRule_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerRuleBlockImpl <em>Lexer Rule Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerRuleBlockImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerRuleBlock()
		 * @generated
		 */
		EClass LEXER_RULE_BLOCK = eINSTANCE.getLexerRuleBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_RULE_BLOCK__BODY = eINSTANCE.getLexerRuleBlock_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerAltListImpl <em>Lexer Alt List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerAltListImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerAltList()
		 * @generated
		 */
		EClass LEXER_ALT_LIST = eINSTANCE.getLexerAltList();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ALT_LIST__ALTERNATIVES = eINSTANCE.getLexerAltList_Alternatives();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerAltImpl <em>Lexer Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerAltImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerAlt()
		 * @generated
		 */
		EClass LEXER_ALT = eINSTANCE.getLexerAlt();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ALT__BODY = eINSTANCE.getLexerAlt_Body();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ALT__COMMANDS = eINSTANCE.getLexerAlt_Commands();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerElementsImpl <em>Lexer Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerElementsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerElements()
		 * @generated
		 */
		EClass LEXER_ELEMENTS = eINSTANCE.getLexerElements();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ELEMENTS__ELEMENTS = eINSTANCE.getLexerElements_Elements();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerElementImpl <em>Lexer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerElement()
		 * @generated
		 */
		EClass LEXER_ELEMENT = eINSTANCE.getLexerElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ELEMENT__BODY = eINSTANCE.getLexerElement_Body();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ELEMENT__OPERATOR = eINSTANCE.getLexerElement_Operator();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LabeledLexerElementImpl <em>Labeled Lexer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LabeledLexerElementImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLabeledLexerElement()
		 * @generated
		 */
		EClass LABELED_LEXER_ELEMENT = eINSTANCE.getLabeledLexerElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_LEXER_ELEMENT__LABEL = eINSTANCE.getLabeledLexerElement_Label();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_LEXER_ELEMENT__BODY = eINSTANCE.getLabeledLexerElement_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerAtomImpl <em>Lexer Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerAtomImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerAtom()
		 * @generated
		 */
		EClass LEXER_ATOM = eINSTANCE.getLexerAtom();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_ATOM__BODY = eINSTANCE.getLexerAtom_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerCharSetImpl <em>Lexer Char Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerCharSetImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerCharSet()
		 * @generated
		 */
		EClass LEXER_CHAR_SET = eINSTANCE.getLexerCharSet();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXER_CHAR_SET__BODY = eINSTANCE.getLexerCharSet_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerBlockImpl <em>Lexer Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerBlockImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerBlock()
		 * @generated
		 */
		EClass LEXER_BLOCK = eINSTANCE.getLexerBlock();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_BLOCK__OPTIONS = eINSTANCE.getLexerBlock_Options();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_BLOCK__BODY = eINSTANCE.getLexerBlock_Body();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerCommandsImpl <em>Lexer Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerCommandsImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommands()
		 * @generated
		 */
		EClass LEXER_COMMANDS = eINSTANCE.getLexerCommands();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXER_COMMANDS__KEYWORD = eINSTANCE.getLexerCommands_Keyword();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_COMMANDS__COMMANDS = eINSTANCE.getLexerCommands_Commands();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerCommandImpl <em>Lexer Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerCommandImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommand()
		 * @generated
		 */
		EClass LEXER_COMMAND = eINSTANCE.getLexerCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXER_COMMAND__NAME = eINSTANCE.getLexerCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_COMMAND__ARGS = eINSTANCE.getLexerCommand_Args();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerCommandExprImpl <em>Lexer Command Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerCommandExprImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommandExpr()
		 * @generated
		 */
		EClass LEXER_COMMAND_EXPR = eINSTANCE.getLexerCommandExpr();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXER_COMMAND_EXPR__REF = eINSTANCE.getLexerCommandExpr_Ref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXER_COMMAND_EXPR__VALUE = eINSTANCE.getLexerCommandExpr_Value();

		/**
		 * The meta object literal for the '{@link antlr4.impl.LexerCommandArgImpl <em>Lexer Command Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.LexerCommandArgImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getLexerCommandArg()
		 * @generated
		 */
		EClass LEXER_COMMAND_ARG = eINSTANCE.getLexerCommandArg();

		/**
		 * The meta object literal for the '{@link antlr4.impl.QualifiedIdImpl <em>Qualified Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.impl.QualifiedIdImpl
		 * @see antlr4.impl.Antlr4PackageImpl#getQualifiedId()
		 * @generated
		 */
		EClass QUALIFIED_ID = eINSTANCE.getQualifiedId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_ID__NAME = eINSTANCE.getQualifiedId_Name();

		/**
		 * The meta object literal for the '{@link antlr4.GrammarType <em>Grammar Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr4.GrammarType
		 * @see antlr4.impl.Antlr4PackageImpl#getGrammarType()
		 * @generated
		 */
		EEnum GRAMMAR_TYPE = eINSTANCE.getGrammarType();

	}

} //Antlr4Package
