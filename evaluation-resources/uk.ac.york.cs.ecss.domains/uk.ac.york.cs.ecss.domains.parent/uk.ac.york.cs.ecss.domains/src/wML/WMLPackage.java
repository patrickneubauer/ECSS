/**
 */
package wML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see wML.WMLFactory
 * @model kind="package"
 * @generated
 */
public interface WMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org.srclang/wesnoth/WML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WMLPackage eINSTANCE = wML.impl.WMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link wML.impl.WMLGrammarElementImpl <em>Grammar Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLGrammarElementImpl
	 * @see wML.impl.WMLPackageImpl#getWMLGrammarElement()
	 * @generated
	 */
	int WML_GRAMMAR_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Grammar Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_GRAMMAR_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Grammar Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_GRAMMAR_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLRootImpl
	 * @see wML.impl.WMLPackageImpl#getWMLRoot()
	 * @generated
	 */
	int WML_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT__EXPRESSIONS = WML_GRAMMAR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT_FEATURE_COUNT = WML_GRAMMAR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT_OPERATION_COUNT = WML_GRAMMAR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLValuedExpressionImpl <em>Valued Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLValuedExpressionImpl
	 * @see wML.impl.WMLPackageImpl#getWMLValuedExpression()
	 * @generated
	 */
	int WML_VALUED_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Valued Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_VALUED_EXPRESSION_FEATURE_COUNT = WML_GRAMMAR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valued Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_VALUED_EXPRESSION_OPERATION_COUNT = WML_GRAMMAR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLExpressionImpl
	 * @see wML.impl.WMLPackageImpl#getWMLExpression()
	 * @generated
	 */
	int WML_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_EXPRESSION__NAME = WML_VALUED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_EXPRESSION_FEATURE_COUNT = WML_VALUED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_EXPRESSION_OPERATION_COUNT = WML_VALUED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLRootExpressionImpl <em>Root Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLRootExpressionImpl
	 * @see wML.impl.WMLPackageImpl#getWMLRootExpression()
	 * @generated
	 */
	int WML_ROOT_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT_EXPRESSION__NAME = WML_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Root Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT_EXPRESSION_FEATURE_COUNT = WML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ROOT_EXPRESSION_OPERATION_COUNT = WML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLTagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLTagImpl
	 * @see wML.impl.WMLPackageImpl#getWMLTag()
	 * @generated
	 */
	int WML_TAG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG__NAME = WML_ROOT_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG__PLUS = WML_ROOT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG__EXPRESSIONS = WML_ROOT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG__END_NAME = WML_ROOT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG_FEATURE_COUNT = WML_ROOT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TAG_OPERATION_COUNT = WML_ROOT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLKeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLKeyImpl
	 * @see wML.impl.WMLPackageImpl#getWMLKey()
	 * @generated
	 */
	int WML_KEY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY__NAME = WML_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY__VALUES = WML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eol</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY__EOL = WML_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY_FEATURE_COUNT = WML_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY_OPERATION_COUNT = WML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLKeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLKeyValueImpl
	 * @see wML.impl.WMLPackageImpl#getWMLKeyValue()
	 * @generated
	 */
	int WML_KEY_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY_VALUE_FEATURE_COUNT = WML_GRAMMAR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_KEY_VALUE_OPERATION_COUNT = WML_GRAMMAR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLMacroCallImpl <em>Macro Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLMacroCallImpl
	 * @see wML.impl.WMLPackageImpl#getWMLMacroCall()
	 * @generated
	 */
	int WML_MACRO_CALL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL__NAME = WML_KEY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL__POINT = WML_KEY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL__RELATIVE = WML_KEY_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL__PARAMETERS = WML_KEY_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL_FEATURE_COUNT = WML_KEY_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL_OPERATION_COUNT = WML_KEY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLMacroCallParameterImpl <em>Macro Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLMacroCallParameterImpl
	 * @see wML.impl.WMLPackageImpl#getWMLMacroCallParameter()
	 * @generated
	 */
	int WML_MACRO_CALL_PARAMETER = 6;

	/**
	 * The number of structural features of the '<em>Macro Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL_PARAMETER_FEATURE_COUNT = WML_GRAMMAR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Macro Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_CALL_PARAMETER_OPERATION_COUNT = WML_GRAMMAR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLArrayCallImpl <em>Array Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLArrayCallImpl
	 * @see wML.impl.WMLPackageImpl#getWMLArrayCall()
	 * @generated
	 */
	int WML_ARRAY_CALL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ARRAY_CALL__VALUE = WML_KEY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ARRAY_CALL_FEATURE_COUNT = WML_KEY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_ARRAY_CALL_OPERATION_COUNT = WML_KEY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLMacroDefineImpl <em>Macro Define</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLMacroDefineImpl
	 * @see wML.impl.WMLPackageImpl#getWMLMacroDefine()
	 * @generated
	 */
	int WML_MACRO_DEFINE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_DEFINE__NAME = WML_ROOT_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_DEFINE__EXPRESSIONS = WML_ROOT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_DEFINE__END_NAME = WML_ROOT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macro Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_DEFINE_FEATURE_COUNT = WML_ROOT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Macro Define</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_DEFINE_OPERATION_COUNT = WML_ROOT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLPreprocIFImpl <em>Preproc IF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLPreprocIFImpl
	 * @see wML.impl.WMLPackageImpl#getWMLPreprocIF()
	 * @generated
	 */
	int WML_PREPROC_IF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF__NAME = WML_ROOT_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF__EXPRESSIONS = WML_ROOT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF__ELSES = WML_ROOT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF__ELSE_EXPRESSIONS = WML_ROOT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF__END_NAME = WML_ROOT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Preproc IF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF_FEATURE_COUNT = WML_ROOT_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Preproc IF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_PREPROC_IF_OPERATION_COUNT = WML_ROOT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLTextdomainImpl <em>Textdomain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLTextdomainImpl
	 * @see wML.impl.WMLPackageImpl#getWMLTextdomain()
	 * @generated
	 */
	int WML_TEXTDOMAIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TEXTDOMAIN__NAME = WML_ROOT_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Textdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TEXTDOMAIN_FEATURE_COUNT = WML_ROOT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textdomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_TEXTDOMAIN_OPERATION_COUNT = WML_ROOT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLLuaCodeImpl <em>Lua Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLLuaCodeImpl
	 * @see wML.impl.WMLPackageImpl#getWMLLuaCode()
	 * @generated
	 */
	int WML_LUA_CODE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_LUA_CODE__VALUE = WML_KEY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lua Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_LUA_CODE_FEATURE_COUNT = WML_KEY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lua Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_LUA_CODE_OPERATION_COUNT = WML_KEY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLMacroParameterImpl <em>Macro Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLMacroParameterImpl
	 * @see wML.impl.WMLPackageImpl#getWMLMacroParameter()
	 * @generated
	 */
	int WML_MACRO_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_PARAMETER__VALUE = WML_MACRO_CALL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_PARAMETER_FEATURE_COUNT = WML_MACRO_CALL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Macro Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_MACRO_PARAMETER_OPERATION_COUNT = WML_MACRO_CALL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.WMLValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.WMLValueImpl
	 * @see wML.impl.WMLPackageImpl#getWMLValue()
	 * @generated
	 */
	int WML_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_VALUE__VALUE = WML_KEY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_VALUE_FEATURE_COUNT = WML_KEY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WML_VALUE_OPERATION_COUNT = WML_KEY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wML.impl.MacroTokensImpl <em>Macro Tokens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wML.impl.MacroTokensImpl
	 * @see wML.impl.WMLPackageImpl#getMacroTokens()
	 * @generated
	 */
	int MACRO_TOKENS = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_TOKENS__VALUE = WML_MACRO_PARAMETER__VALUE;

	/**
	 * The number of structural features of the '<em>Macro Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_TOKENS_FEATURE_COUNT = WML_MACRO_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Macro Tokens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_TOKENS_OPERATION_COUNT = WML_MACRO_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wML.WMLRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see wML.WMLRoot
	 * @generated
	 */
	EClass getWMLRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLRoot#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see wML.WMLRoot#getExpressions()
	 * @see #getWMLRoot()
	 * @generated
	 */
	EReference getWMLRoot_Expressions();

	/**
	 * Returns the meta object for class '{@link wML.WMLGrammarElement <em>Grammar Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar Element</em>'.
	 * @see wML.WMLGrammarElement
	 * @generated
	 */
	EClass getWMLGrammarElement();

	/**
	 * Returns the meta object for class '{@link wML.WMLTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see wML.WMLTag
	 * @generated
	 */
	EClass getWMLTag();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLTag#getPlus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plus</em>'.
	 * @see wML.WMLTag#getPlus()
	 * @see #getWMLTag()
	 * @generated
	 */
	EAttribute getWMLTag_Plus();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLTag#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see wML.WMLTag#getExpressions()
	 * @see #getWMLTag()
	 * @generated
	 */
	EReference getWMLTag_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLTag#getEndName <em>End Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Name</em>'.
	 * @see wML.WMLTag#getEndName()
	 * @see #getWMLTag()
	 * @generated
	 */
	EAttribute getWMLTag_EndName();

	/**
	 * Returns the meta object for class '{@link wML.WMLKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see wML.WMLKey
	 * @generated
	 */
	EClass getWMLKey();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLKey#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see wML.WMLKey#getValues()
	 * @see #getWMLKey()
	 * @generated
	 */
	EReference getWMLKey_Values();

	/**
	 * Returns the meta object for the attribute list '{@link wML.WMLKey#getEol <em>Eol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Eol</em>'.
	 * @see wML.WMLKey#getEol()
	 * @see #getWMLKey()
	 * @generated
	 */
	EAttribute getWMLKey_Eol();

	/**
	 * Returns the meta object for class '{@link wML.WMLKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see wML.WMLKeyValue
	 * @generated
	 */
	EClass getWMLKeyValue();

	/**
	 * Returns the meta object for class '{@link wML.WMLMacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Call</em>'.
	 * @see wML.WMLMacroCall
	 * @generated
	 */
	EClass getWMLMacroCall();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLMacroCall#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see wML.WMLMacroCall#getPoint()
	 * @see #getWMLMacroCall()
	 * @generated
	 */
	EAttribute getWMLMacroCall_Point();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLMacroCall#getRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see wML.WMLMacroCall#getRelative()
	 * @see #getWMLMacroCall()
	 * @generated
	 */
	EAttribute getWMLMacroCall_Relative();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLMacroCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see wML.WMLMacroCall#getParameters()
	 * @see #getWMLMacroCall()
	 * @generated
	 */
	EReference getWMLMacroCall_Parameters();

	/**
	 * Returns the meta object for class '{@link wML.WMLMacroCallParameter <em>Macro Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Call Parameter</em>'.
	 * @see wML.WMLMacroCallParameter
	 * @generated
	 */
	EClass getWMLMacroCallParameter();

	/**
	 * Returns the meta object for class '{@link wML.WMLArrayCall <em>Array Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Call</em>'.
	 * @see wML.WMLArrayCall
	 * @generated
	 */
	EClass getWMLArrayCall();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLArrayCall#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see wML.WMLArrayCall#getValue()
	 * @see #getWMLArrayCall()
	 * @generated
	 */
	EReference getWMLArrayCall_Value();

	/**
	 * Returns the meta object for class '{@link wML.WMLMacroDefine <em>Macro Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Define</em>'.
	 * @see wML.WMLMacroDefine
	 * @generated
	 */
	EClass getWMLMacroDefine();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLMacroDefine#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see wML.WMLMacroDefine#getExpressions()
	 * @see #getWMLMacroDefine()
	 * @generated
	 */
	EReference getWMLMacroDefine_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLMacroDefine#getEndName <em>End Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Name</em>'.
	 * @see wML.WMLMacroDefine#getEndName()
	 * @see #getWMLMacroDefine()
	 * @generated
	 */
	EAttribute getWMLMacroDefine_EndName();

	/**
	 * Returns the meta object for class '{@link wML.WMLPreprocIF <em>Preproc IF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preproc IF</em>'.
	 * @see wML.WMLPreprocIF
	 * @generated
	 */
	EClass getWMLPreprocIF();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLPreprocIF#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see wML.WMLPreprocIF#getExpressions()
	 * @see #getWMLPreprocIF()
	 * @generated
	 */
	EReference getWMLPreprocIF_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLPreprocIF#getElses <em>Elses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elses</em>'.
	 * @see wML.WMLPreprocIF#getElses()
	 * @see #getWMLPreprocIF()
	 * @generated
	 */
	EAttribute getWMLPreprocIF_Elses();

	/**
	 * Returns the meta object for the containment reference list '{@link wML.WMLPreprocIF#getElseExpressions <em>Else Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Expressions</em>'.
	 * @see wML.WMLPreprocIF#getElseExpressions()
	 * @see #getWMLPreprocIF()
	 * @generated
	 */
	EReference getWMLPreprocIF_ElseExpressions();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLPreprocIF#getEndName <em>End Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Name</em>'.
	 * @see wML.WMLPreprocIF#getEndName()
	 * @see #getWMLPreprocIF()
	 * @generated
	 */
	EAttribute getWMLPreprocIF_EndName();

	/**
	 * Returns the meta object for class '{@link wML.WMLRootExpression <em>Root Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Expression</em>'.
	 * @see wML.WMLRootExpression
	 * @generated
	 */
	EClass getWMLRootExpression();

	/**
	 * Returns the meta object for class '{@link wML.WMLExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see wML.WMLExpression
	 * @generated
	 */
	EClass getWMLExpression();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wML.WMLExpression#getName()
	 * @see #getWMLExpression()
	 * @generated
	 */
	EAttribute getWMLExpression_Name();

	/**
	 * Returns the meta object for class '{@link wML.WMLValuedExpression <em>Valued Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Expression</em>'.
	 * @see wML.WMLValuedExpression
	 * @generated
	 */
	EClass getWMLValuedExpression();

	/**
	 * Returns the meta object for class '{@link wML.WMLTextdomain <em>Textdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textdomain</em>'.
	 * @see wML.WMLTextdomain
	 * @generated
	 */
	EClass getWMLTextdomain();

	/**
	 * Returns the meta object for class '{@link wML.WMLLuaCode <em>Lua Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lua Code</em>'.
	 * @see wML.WMLLuaCode
	 * @generated
	 */
	EClass getWMLLuaCode();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLLuaCode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wML.WMLLuaCode#getValue()
	 * @see #getWMLLuaCode()
	 * @generated
	 */
	EAttribute getWMLLuaCode_Value();

	/**
	 * Returns the meta object for class '{@link wML.WMLMacroParameter <em>Macro Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Parameter</em>'.
	 * @see wML.WMLMacroParameter
	 * @generated
	 */
	EClass getWMLMacroParameter();

	/**
	 * Returns the meta object for the attribute '{@link wML.WMLMacroParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see wML.WMLMacroParameter#getValue()
	 * @see #getWMLMacroParameter()
	 * @generated
	 */
	EAttribute getWMLMacroParameter_Value();

	/**
	 * Returns the meta object for class '{@link wML.WMLValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see wML.WMLValue
	 * @generated
	 */
	EClass getWMLValue();

	/**
	 * Returns the meta object for class '{@link wML.MacroTokens <em>Macro Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Tokens</em>'.
	 * @see wML.MacroTokens
	 * @generated
	 */
	EClass getMacroTokens();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WMLFactory getWMLFactory();

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
		 * The meta object literal for the '{@link wML.impl.WMLRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLRootImpl
		 * @see wML.impl.WMLPackageImpl#getWMLRoot()
		 * @generated
		 */
		EClass WML_ROOT = eINSTANCE.getWMLRoot();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_ROOT__EXPRESSIONS = eINSTANCE.getWMLRoot_Expressions();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLGrammarElementImpl <em>Grammar Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLGrammarElementImpl
		 * @see wML.impl.WMLPackageImpl#getWMLGrammarElement()
		 * @generated
		 */
		EClass WML_GRAMMAR_ELEMENT = eINSTANCE.getWMLGrammarElement();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLTagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLTagImpl
		 * @see wML.impl.WMLPackageImpl#getWMLTag()
		 * @generated
		 */
		EClass WML_TAG = eINSTANCE.getWMLTag();

		/**
		 * The meta object literal for the '<em><b>Plus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_TAG__PLUS = eINSTANCE.getWMLTag_Plus();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_TAG__EXPRESSIONS = eINSTANCE.getWMLTag_Expressions();

		/**
		 * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_TAG__END_NAME = eINSTANCE.getWMLTag_EndName();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLKeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLKeyImpl
		 * @see wML.impl.WMLPackageImpl#getWMLKey()
		 * @generated
		 */
		EClass WML_KEY = eINSTANCE.getWMLKey();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_KEY__VALUES = eINSTANCE.getWMLKey_Values();

		/**
		 * The meta object literal for the '<em><b>Eol</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_KEY__EOL = eINSTANCE.getWMLKey_Eol();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLKeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLKeyValueImpl
		 * @see wML.impl.WMLPackageImpl#getWMLKeyValue()
		 * @generated
		 */
		EClass WML_KEY_VALUE = eINSTANCE.getWMLKeyValue();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLMacroCallImpl <em>Macro Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLMacroCallImpl
		 * @see wML.impl.WMLPackageImpl#getWMLMacroCall()
		 * @generated
		 */
		EClass WML_MACRO_CALL = eINSTANCE.getWMLMacroCall();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_MACRO_CALL__POINT = eINSTANCE.getWMLMacroCall_Point();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_MACRO_CALL__RELATIVE = eINSTANCE.getWMLMacroCall_Relative();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_MACRO_CALL__PARAMETERS = eINSTANCE.getWMLMacroCall_Parameters();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLMacroCallParameterImpl <em>Macro Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLMacroCallParameterImpl
		 * @see wML.impl.WMLPackageImpl#getWMLMacroCallParameter()
		 * @generated
		 */
		EClass WML_MACRO_CALL_PARAMETER = eINSTANCE.getWMLMacroCallParameter();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLArrayCallImpl <em>Array Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLArrayCallImpl
		 * @see wML.impl.WMLPackageImpl#getWMLArrayCall()
		 * @generated
		 */
		EClass WML_ARRAY_CALL = eINSTANCE.getWMLArrayCall();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_ARRAY_CALL__VALUE = eINSTANCE.getWMLArrayCall_Value();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLMacroDefineImpl <em>Macro Define</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLMacroDefineImpl
		 * @see wML.impl.WMLPackageImpl#getWMLMacroDefine()
		 * @generated
		 */
		EClass WML_MACRO_DEFINE = eINSTANCE.getWMLMacroDefine();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_MACRO_DEFINE__EXPRESSIONS = eINSTANCE.getWMLMacroDefine_Expressions();

		/**
		 * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_MACRO_DEFINE__END_NAME = eINSTANCE.getWMLMacroDefine_EndName();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLPreprocIFImpl <em>Preproc IF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLPreprocIFImpl
		 * @see wML.impl.WMLPackageImpl#getWMLPreprocIF()
		 * @generated
		 */
		EClass WML_PREPROC_IF = eINSTANCE.getWMLPreprocIF();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_PREPROC_IF__EXPRESSIONS = eINSTANCE.getWMLPreprocIF_Expressions();

		/**
		 * The meta object literal for the '<em><b>Elses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_PREPROC_IF__ELSES = eINSTANCE.getWMLPreprocIF_Elses();

		/**
		 * The meta object literal for the '<em><b>Else Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WML_PREPROC_IF__ELSE_EXPRESSIONS = eINSTANCE.getWMLPreprocIF_ElseExpressions();

		/**
		 * The meta object literal for the '<em><b>End Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_PREPROC_IF__END_NAME = eINSTANCE.getWMLPreprocIF_EndName();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLRootExpressionImpl <em>Root Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLRootExpressionImpl
		 * @see wML.impl.WMLPackageImpl#getWMLRootExpression()
		 * @generated
		 */
		EClass WML_ROOT_EXPRESSION = eINSTANCE.getWMLRootExpression();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLExpressionImpl
		 * @see wML.impl.WMLPackageImpl#getWMLExpression()
		 * @generated
		 */
		EClass WML_EXPRESSION = eINSTANCE.getWMLExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_EXPRESSION__NAME = eINSTANCE.getWMLExpression_Name();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLValuedExpressionImpl <em>Valued Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLValuedExpressionImpl
		 * @see wML.impl.WMLPackageImpl#getWMLValuedExpression()
		 * @generated
		 */
		EClass WML_VALUED_EXPRESSION = eINSTANCE.getWMLValuedExpression();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLTextdomainImpl <em>Textdomain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLTextdomainImpl
		 * @see wML.impl.WMLPackageImpl#getWMLTextdomain()
		 * @generated
		 */
		EClass WML_TEXTDOMAIN = eINSTANCE.getWMLTextdomain();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLLuaCodeImpl <em>Lua Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLLuaCodeImpl
		 * @see wML.impl.WMLPackageImpl#getWMLLuaCode()
		 * @generated
		 */
		EClass WML_LUA_CODE = eINSTANCE.getWMLLuaCode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_LUA_CODE__VALUE = eINSTANCE.getWMLLuaCode_Value();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLMacroParameterImpl <em>Macro Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLMacroParameterImpl
		 * @see wML.impl.WMLPackageImpl#getWMLMacroParameter()
		 * @generated
		 */
		EClass WML_MACRO_PARAMETER = eINSTANCE.getWMLMacroParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WML_MACRO_PARAMETER__VALUE = eINSTANCE.getWMLMacroParameter_Value();

		/**
		 * The meta object literal for the '{@link wML.impl.WMLValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.WMLValueImpl
		 * @see wML.impl.WMLPackageImpl#getWMLValue()
		 * @generated
		 */
		EClass WML_VALUE = eINSTANCE.getWMLValue();

		/**
		 * The meta object literal for the '{@link wML.impl.MacroTokensImpl <em>Macro Tokens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wML.impl.MacroTokensImpl
		 * @see wML.impl.WMLPackageImpl#getMacroTokens()
		 * @generated
		 */
		EClass MACRO_TOKENS = eINSTANCE.getMacroTokens();

	}

} //WMLPackage
