/**
 */
package pp2;

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
 * @see pp2.Pp2Factory
 * @model kind="package"
 * @generated
 */
public interface Pp2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pp2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.puppetlabs.com/geppetto/1.0.0/PP2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pp2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pp2Package eINSTANCE = pp2.impl.Pp2PackageImpl.init();

	/**
	 * The meta object id for the '{@link pp2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ExpressionBlockImpl
	 * @see pp2.impl.Pp2PackageImpl#getExpressionBlock()
	 * @generated
	 */
	int EXPRESSION_BLOCK = 52;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK__STATEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.PuppetManifestImpl <em>Puppet Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.PuppetManifestImpl
	 * @see pp2.impl.Pp2PackageImpl#getPuppetManifest()
	 * @generated
	 */
	int PUPPET_MANIFEST = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPPET_MANIFEST__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Puppet Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPPET_MANIFEST_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Puppet Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUPPET_MANIFEST_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ResourceBodyImpl <em>Resource Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ResourceBodyImpl
	 * @see pp2.impl.Pp2PackageImpl#getResourceBody()
	 * @generated
	 */
	int RESOURCE_BODY = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BODY__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BODY__NAME_EXPR = 1;

	/**
	 * The number of structural features of the '<em>Resource Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BODY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AttributeOperationImpl <em>Attribute Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AttributeOperationImpl
	 * @see pp2.impl.Pp2PackageImpl#getAttributeOperation()
	 * @generated
	 */
	int ATTRIBUTE_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION__OP = 2;

	/**
	 * The number of structural features of the '<em>Attribute Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AttributeOperationsImpl <em>Attribute Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AttributeOperationsImpl
	 * @see pp2.impl.Pp2PackageImpl#getAttributeOperations()
	 * @generated
	 */
	int ATTRIBUTE_OPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATIONS__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Attribute Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.ICollectQuery <em>ICollect Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.ICollectQuery
	 * @see pp2.impl.Pp2PackageImpl#getICollectQuery()
	 * @generated
	 */
	int ICOLLECT_QUERY = 5;

	/**
	 * The number of structural features of the '<em>ICollect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOLLECT_QUERY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ICollect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOLLECT_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.UnaryExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 49;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.VirtualCollectQueryImpl <em>Virtual Collect Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.VirtualCollectQueryImpl
	 * @see pp2.impl.Pp2PackageImpl#getVirtualCollectQuery()
	 * @generated
	 */
	int VIRTUAL_COLLECT_QUERY = 6;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_COLLECT_QUERY__EXPR = UNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>Virtual Collect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_COLLECT_QUERY_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Collect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_COLLECT_QUERY_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ExportedCollectQueryImpl <em>Exported Collect Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ExportedCollectQueryImpl
	 * @see pp2.impl.Pp2PackageImpl#getExportedCollectQuery()
	 * @generated
	 */
	int EXPORTED_COLLECT_QUERY = 7;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_COLLECT_QUERY__EXPR = UNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>Exported Collect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_COLLECT_QUERY_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exported Collect Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTED_COLLECT_QUERY_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.DefinitionImpl
	 * @see pp2.impl.Pp2PackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CLASS_NAME = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ARGUMENTS = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.HostClassDefinitionImpl <em>Host Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.HostClassDefinitionImpl
	 * @see pp2.impl.Pp2PackageImpl#getHostClassDefinition()
	 * @generated
	 */
	int HOST_CLASS_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION__STATEMENTS = DEFINITION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION__CLASS_NAME = DEFINITION__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION__ARGUMENTS = DEFINITION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION__PARENT = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Host Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Host Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CLASS_DEFINITION_OPERATION_COUNT = DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.DefinitionArgumentListImpl <em>Definition Argument List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.DefinitionArgumentListImpl
	 * @see pp2.impl.Pp2PackageImpl#getDefinitionArgumentList()
	 * @generated
	 */
	int DEFINITION_ARGUMENT_LIST = 10;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT_LIST__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Definition Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definition Argument List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.DefinitionArgumentImpl <em>Definition Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.DefinitionArgumentImpl
	 * @see pp2.impl.Pp2PackageImpl#getDefinitionArgument()
	 * @generated
	 */
	int DEFINITION_ARGUMENT = 11;

	/**
	 * The feature id for the '<em><b>Puppet Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT__PUPPET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Arg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT__ARG_NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT__OP = 3;

	/**
	 * The number of structural features of the '<em>Definition Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Definition Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.CaseExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getCaseExpression()
	 * @generated
	 */
	int CASE_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Switch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__SWITCH_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.CaseImpl
	 * @see pp2.impl.Pp2PackageImpl#getCase()
	 * @generated
	 */
	int CASE = 13;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__VALUES = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.IfExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__COND_EXPR = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE_STATEMENT = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralNameOrReferenceImpl <em>Literal Name Or Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralNameOrReferenceImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralNameOrReference()
	 * @generated
	 */
	int LITERAL_NAME_OR_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME_OR_REFERENCE__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Name Or Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME_OR_REFERENCE_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Name Or Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME_OR_REFERENCE_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ResourceExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getResourceExpression()
	 * @generated
	 */
	int RESOURCE_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Resource Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__RESOURCE_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION__RESOURCE_DATA = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ImportExpressionImpl <em>Import Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ImportExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getImportExpression()
	 * @generated
	 */
	int IMPORT_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_EXPRESSION__VALUES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralListImpl <em>Literal List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralListImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralList()
	 * @generated
	 */
	int LITERAL_LIST = 19;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LIST__ELEMENTS = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LIST_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_LIST_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralHashImpl <em>Literal Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralHashImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralHash()
	 * @generated
	 */
	int LITERAL_HASH = 20;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_HASH__ELEMENTS = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_HASH_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_HASH_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.HashEntryImpl <em>Hash Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.HashEntryImpl
	 * @see pp2.impl.Pp2PackageImpl#getHashEntry()
	 * @generated
	 */
	int HASH_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hash Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hash Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralBooleanImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralUndefImpl <em>Literal Undef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralUndefImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralUndef()
	 * @generated
	 */
	int LITERAL_UNDEF = 23;

	/**
	 * The number of structural features of the '<em>Literal Undef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNDEF_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Undef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNDEF_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralDefaultImpl <em>Literal Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralDefaultImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralDefault()
	 * @generated
	 */
	int LITERAL_DEFAULT = 24;

	/**
	 * The number of structural features of the '<em>Literal Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DEFAULT_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_DEFAULT_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralRegexImpl <em>Literal Regex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralRegexImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralRegex()
	 * @generated
	 */
	int LITERAL_REGEX = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REGEX__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Regex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REGEX_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Regex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REGEX_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralNameImpl <em>Literal Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralNameImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralName()
	 * @generated
	 */
	int LITERAL_NAME = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NAME_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.VariableExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getVariableExpression()
	 * @generated
	 */
	int VARIABLE_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__VAR_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.BinaryExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.BinaryOpExpressionImpl <em>Binary Op Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.BinaryOpExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getBinaryOpExpression()
	 * @generated
	 */
	int BINARY_OP_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_EXPRESSION__OP_NAME = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Op Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.RelationshipExpressionImpl <em>Relationship Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.RelationshipExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getRelationshipExpression()
	 * @generated
	 */
	int RELATIONSHIP_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Relationship Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AssignmentExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AppendExpressionImpl <em>Append Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AppendExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getAppendExpression()
	 * @generated
	 */
	int APPEND_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>Append Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Append Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEND_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.OrExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AndExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.RelationalExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.EqualityExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getEqualityExpression()
	 * @generated
	 */
	int EQUALITY_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ShiftExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getShiftExpression()
	 * @generated
	 */
	int SHIFT_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AdditiveExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getAdditiveExpression()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Additive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.MultiplicativeExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getMultiplicativeExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiplicative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.MatchingExpressionImpl <em>Matching Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.MatchingExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getMatchingExpression()
	 * @generated
	 */
	int MATCHING_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>Matching Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Matching Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.InExpressionImpl <em>In Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.InExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getInExpression()
	 * @generated
	 */
	int IN_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__LEFT_EXPR = BINARY_OP_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__RIGHT_EXPR = BINARY_OP_EXPRESSION__RIGHT_EXPR;

	/**
	 * The feature id for the '<em><b>Op Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION__OP_NAME = BINARY_OP_EXPRESSION__OP_NAME;

	/**
	 * The number of structural features of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_FEATURE_COUNT = BINARY_OP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_EXPRESSION_OPERATION_COUNT = BINARY_OP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ParameterizedExpressionImpl <em>Parameterized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ParameterizedExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getParameterizedExpression()
	 * @generated
	 */
	int PARAMETERIZED_EXPRESSION = 47;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_EXPRESSION__LEFT_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameterized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.AtExpressionImpl <em>At Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.AtExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getAtExpression()
	 * @generated
	 */
	int AT_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_EXPRESSION__LEFT_EXPR = PARAMETERIZED_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_EXPRESSION__PARAMETERS = PARAMETERIZED_EXPRESSION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>At Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_EXPRESSION_FEATURE_COUNT = PARAMETERIZED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>At Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_EXPRESSION_OPERATION_COUNT = PARAMETERIZED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.CollectExpressionImpl <em>Collect Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.CollectExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getCollectExpression()
	 * @generated
	 */
	int COLLECT_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Class Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_EXPRESSION__CLASS_REFERENCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_EXPRESSION__QUERY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_EXPRESSION__ATTRIBUTES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collect Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collect Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.SelectorExpressionImpl <em>Selector Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.SelectorExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getSelectorExpression()
	 * @generated
	 */
	int SELECTOR_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_EXPRESSION__LEFT_EXPR = PARAMETERIZED_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_EXPRESSION__PARAMETERS = PARAMETERIZED_EXPRESSION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_EXPRESSION_FEATURE_COUNT = PARAMETERIZED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_EXPRESSION_OPERATION_COUNT = PARAMETERIZED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.SelectorEntryImpl <em>Selector Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.SelectorEntryImpl
	 * @see pp2.impl.Pp2PackageImpl#getSelectorEntry()
	 * @generated
	 */
	int SELECTOR_ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_ENTRY__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_ENTRY__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>Selector Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_ENTRY_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selector Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_ENTRY_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.WithLambdaExpressionImpl <em>With Lambda Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.WithLambdaExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getWithLambdaExpression()
	 * @generated
	 */
	int WITH_LAMBDA_EXPRESSION = 73;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_LAMBDA_EXPRESSION__LEFT_EXPR = PARAMETERIZED_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_LAMBDA_EXPRESSION__PARAMETERS = PARAMETERIZED_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_LAMBDA_EXPRESSION__LAMBDA = PARAMETERIZED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>With Lambda Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_LAMBDA_EXPRESSION_FEATURE_COUNT = PARAMETERIZED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>With Lambda Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_LAMBDA_EXPRESSION_OPERATION_COUNT = PARAMETERIZED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.FunctionCallImpl
	 * @see pp2.impl.Pp2PackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 44;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__LEFT_EXPR = WITH_LAMBDA_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = WITH_LAMBDA_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__LAMBDA = WITH_LAMBDA_EXPRESSION__LAMBDA;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = WITH_LAMBDA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = WITH_LAMBDA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.NodeDefinitionImpl
	 * @see pp2.impl.Pp2PackageImpl#getNodeDefinition()
	 * @generated
	 */
	int NODE_DEFINITION = 48;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Host Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__HOST_NAMES = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION__PARENT_NAME = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEFINITION_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.UnaryMinusExpressionImpl <em>Unary Minus Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.UnaryMinusExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getUnaryMinusExpression()
	 * @generated
	 */
	int UNARY_MINUS_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION__EXPR = UNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>Unary Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Minus Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.UnaryNotExpressionImpl <em>Unary Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.UnaryNotExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getUnaryNotExpression()
	 * @generated
	 */
	int UNARY_NOT_EXPRESSION = 51;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT_EXPRESSION__EXPR = UNARY_EXPRESSION__EXPR;

	/**
	 * The number of structural features of the '<em>Unary Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_NOT_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ElseExpressionImpl <em>Else Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ElseExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getElseExpression()
	 * @generated
	 */
	int ELSE_EXPRESSION = 53;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_EXPRESSION__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Else Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_EXPRESSION_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Else Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_EXPRESSION_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ElseIfExpressionImpl <em>Else If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ElseIfExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getElseIfExpression()
	 * @generated
	 */
	int ELSE_IF_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_EXPRESSION__STATEMENTS = IF_EXPRESSION__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_EXPRESSION__COND_EXPR = IF_EXPRESSION__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_EXPRESSION__ELSE_STATEMENT = IF_EXPRESSION__ELSE_STATEMENT;

	/**
	 * The number of structural features of the '<em>Else If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_EXPRESSION_FEATURE_COUNT = IF_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Else If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_EXPRESSION_OPERATION_COUNT = IF_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.VirtualNameOrReferenceImpl <em>Virtual Name Or Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.VirtualNameOrReferenceImpl
	 * @see pp2.impl.Pp2PackageImpl#getVirtualNameOrReference()
	 * @generated
	 */
	int VIRTUAL_NAME_OR_REFERENCE = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NAME_OR_REFERENCE__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NAME_OR_REFERENCE__EXPORTED = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Name Or Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NAME_OR_REFERENCE_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Name Or Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NAME_OR_REFERENCE_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ParenthesisedExpressionImpl <em>Parenthesised Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ParenthesisedExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getParenthesisedExpression()
	 * @generated
	 */
	int PARENTHESISED_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESISED_EXPRESSION__EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesised Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESISED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesised Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESISED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ExprListImpl <em>Expr List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ExprListImpl
	 * @see pp2.impl.Pp2PackageImpl#getExprList()
	 * @generated
	 */
	int EXPR_LIST = 57;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_LIST__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_LIST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expr List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_LIST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.StringExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 60;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.DoubleQuotedStringImpl <em>Double Quoted String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.DoubleQuotedStringImpl
	 * @see pp2.impl.Pp2PackageImpl#getDoubleQuotedString()
	 * @generated
	 */
	int DOUBLE_QUOTED_STRING = 58;

	/**
	 * The feature id for the '<em><b>String Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUOTED_STRING__STRING_PART = STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Quoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUOTED_STRING_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Quoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_QUOTED_STRING_OPERATION_COUNT = STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.SingleQuotedStringImpl <em>Single Quoted String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.SingleQuotedStringImpl
	 * @see pp2.impl.Pp2PackageImpl#getSingleQuotedString()
	 * @generated
	 */
	int SINGLE_QUOTED_STRING = 59;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUOTED_STRING__TEXT = STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Quoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUOTED_STRING_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Quoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUOTED_STRING_OPERATION_COUNT = STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.UnquotedStringImpl <em>Unquoted String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.UnquotedStringImpl
	 * @see pp2.impl.Pp2PackageImpl#getUnquotedString()
	 * @generated
	 */
	int UNQUOTED_STRING = 61;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUOTED_STRING__EXPRESSION = STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unquoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUOTED_STRING_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unquoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNQUOTED_STRING_OPERATION_COUNT = STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.IQuotedString <em>IQuoted String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.IQuotedString
	 * @see pp2.impl.Pp2PackageImpl#getIQuotedString()
	 * @generated
	 */
	int IQUOTED_STRING = 62;

	/**
	 * The number of structural features of the '<em>IQuoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQUOTED_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IQuoted String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IQUOTED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.InterpolatedVariableImpl <em>Interpolated Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.InterpolatedVariableImpl
	 * @see pp2.impl.Pp2PackageImpl#getInterpolatedVariable()
	 * @generated
	 */
	int INTERPOLATED_VARIABLE = 63;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATED_VARIABLE__VAR_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpolated Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATED_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interpolated Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATED_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.TextExpressionImpl <em>Text Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.TextExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getTextExpression()
	 * @generated
	 */
	int TEXT_EXPRESSION = 64;

	/**
	 * The number of structural features of the '<em>Text Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pp2.impl.VerbatimTEImpl <em>Verbatim TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.VerbatimTEImpl
	 * @see pp2.impl.Pp2PackageImpl#getVerbatimTE()
	 * @generated
	 */
	int VERBATIM_TE = 65;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_TE__TEXT = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verbatim TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_TE_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verbatim TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_TE_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.ExpressionTEImpl <em>Expression TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.ExpressionTEImpl
	 * @see pp2.impl.Pp2PackageImpl#getExpressionTE()
	 * @generated
	 */
	int EXPRESSION_TE = 66;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TE__EXPRESSION = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TE_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TE_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.VariableTEImpl <em>Variable TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.VariableTEImpl
	 * @see pp2.impl.Pp2PackageImpl#getVariableTE()
	 * @generated
	 */
	int VARIABLE_TE = 67;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TE__VAR_NAME = TEXT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TE_FEATURE_COUNT = TEXT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TE_OPERATION_COUNT = TEXT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LiteralClassImpl <em>Literal Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LiteralClassImpl
	 * @see pp2.impl.Pp2PackageImpl#getLiteralClass()
	 * @generated
	 */
	int LITERAL_CLASS = 68;

	/**
	 * The number of structural features of the '<em>Literal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLASS_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CLASS_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.UnlessExpressionImpl <em>Unless Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.UnlessExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getUnlessExpression()
	 * @generated
	 */
	int UNLESS_EXPRESSION = 69;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_EXPRESSION__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_EXPRESSION__COND_EXPR = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_EXPRESSION__ELSE_STATEMENT = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unless Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unless Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_EXPRESSION_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.LambdaImpl <em>Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.LambdaImpl
	 * @see pp2.impl.Pp2PackageImpl#getLambda()
	 * @generated
	 */
	int LAMBDA = 70;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__STATEMENTS = EXPRESSION_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__ARGUMENTS = EXPRESSION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_FEATURE_COUNT = EXPRESSION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_OPERATION_COUNT = EXPRESSION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.NamedAccessExpressionImpl <em>Named Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.NamedAccessExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getNamedAccessExpression()
	 * @generated
	 */
	int NAMED_ACCESS_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACCESS_EXPRESSION__LEFT_EXPR = BINARY_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Right Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACCESS_EXPRESSION__RIGHT_EXPR = BINARY_EXPRESSION__RIGHT_EXPR;

	/**
	 * The number of structural features of the '<em>Named Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACCESS_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ACCESS_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.MethodCallImpl
	 * @see pp2.impl.Pp2PackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 72;

	/**
	 * The feature id for the '<em><b>Left Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__LEFT_EXPR = WITH_LAMBDA_EXPRESSION__LEFT_EXPR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARAMETERS = WITH_LAMBDA_EXPRESSION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__LAMBDA = WITH_LAMBDA_EXPRESSION__LAMBDA;

	/**
	 * The feature id for the '<em><b>Parenthesized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARENTHESIZED = WITH_LAMBDA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_EXPR = WITH_LAMBDA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = WITH_LAMBDA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_OPERATION_COUNT = WITH_LAMBDA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.JavaLambdaImpl <em>Java Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.JavaLambdaImpl
	 * @see pp2.impl.Pp2PackageImpl#getJavaLambda()
	 * @generated
	 */
	int JAVA_LAMBDA = 74;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LAMBDA__STATEMENTS = LAMBDA__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LAMBDA__ARGUMENTS = LAMBDA__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Farrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LAMBDA__FARROW = LAMBDA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LAMBDA_FEATURE_COUNT = LAMBDA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_LAMBDA_OPERATION_COUNT = LAMBDA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.RubyLambdaImpl <em>Ruby Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.RubyLambdaImpl
	 * @see pp2.impl.Pp2PackageImpl#getRubyLambda()
	 * @generated
	 */
	int RUBY_LAMBDA = 75;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_LAMBDA__STATEMENTS = LAMBDA__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_LAMBDA__ARGUMENTS = LAMBDA__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Ruby Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_LAMBDA_FEATURE_COUNT = LAMBDA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ruby Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_LAMBDA_OPERATION_COUNT = LAMBDA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pp2.impl.SeparatorExpressionImpl <em>Separator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pp2.impl.SeparatorExpressionImpl
	 * @see pp2.impl.Pp2PackageImpl#getSeparatorExpression()
	 * @generated
	 */
	int SEPARATOR_EXPRESSION = 76;

	/**
	 * The number of structural features of the '<em>Separator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Separator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pp2.PuppetManifest <em>Puppet Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puppet Manifest</em>'.
	 * @see pp2.PuppetManifest
	 * @generated
	 */
	EClass getPuppetManifest();

	/**
	 * Returns the meta object for class '{@link pp2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see pp2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link pp2.ResourceBody <em>Resource Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Body</em>'.
	 * @see pp2.ResourceBody
	 * @generated
	 */
	EClass getResourceBody();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ResourceBody#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see pp2.ResourceBody#getAttributes()
	 * @see #getResourceBody()
	 * @generated
	 */
	EReference getResourceBody_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ResourceBody#getNameExpr <em>Name Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Expr</em>'.
	 * @see pp2.ResourceBody#getNameExpr()
	 * @see #getResourceBody()
	 * @generated
	 */
	EReference getResourceBody_NameExpr();

	/**
	 * Returns the meta object for class '{@link pp2.AttributeOperation <em>Attribute Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Operation</em>'.
	 * @see pp2.AttributeOperation
	 * @generated
	 */
	EClass getAttributeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.AttributeOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see pp2.AttributeOperation#getValue()
	 * @see #getAttributeOperation()
	 * @generated
	 */
	EReference getAttributeOperation_Value();

	/**
	 * Returns the meta object for the attribute '{@link pp2.AttributeOperation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pp2.AttributeOperation#getKey()
	 * @see #getAttributeOperation()
	 * @generated
	 */
	EAttribute getAttributeOperation_Key();

	/**
	 * Returns the meta object for the attribute '{@link pp2.AttributeOperation#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see pp2.AttributeOperation#getOp()
	 * @see #getAttributeOperation()
	 * @generated
	 */
	EAttribute getAttributeOperation_Op();

	/**
	 * Returns the meta object for class '{@link pp2.AttributeOperations <em>Attribute Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Operations</em>'.
	 * @see pp2.AttributeOperations
	 * @generated
	 */
	EClass getAttributeOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.AttributeOperations#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pp2.AttributeOperations#getAttributes()
	 * @see #getAttributeOperations()
	 * @generated
	 */
	EReference getAttributeOperations_Attributes();

	/**
	 * Returns the meta object for class '{@link pp2.ICollectQuery <em>ICollect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICollect Query</em>'.
	 * @see pp2.ICollectQuery
	 * @generated
	 */
	EClass getICollectQuery();

	/**
	 * Returns the meta object for class '{@link pp2.VirtualCollectQuery <em>Virtual Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Collect Query</em>'.
	 * @see pp2.VirtualCollectQuery
	 * @generated
	 */
	EClass getVirtualCollectQuery();

	/**
	 * Returns the meta object for class '{@link pp2.ExportedCollectQuery <em>Exported Collect Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exported Collect Query</em>'.
	 * @see pp2.ExportedCollectQuery
	 * @generated
	 */
	EClass getExportedCollectQuery();

	/**
	 * Returns the meta object for class '{@link pp2.HostClassDefinition <em>Host Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Class Definition</em>'.
	 * @see pp2.HostClassDefinition
	 * @generated
	 */
	EClass getHostClassDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.HostClassDefinition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see pp2.HostClassDefinition#getParent()
	 * @see #getHostClassDefinition()
	 * @generated
	 */
	EReference getHostClassDefinition_Parent();

	/**
	 * Returns the meta object for class '{@link pp2.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see pp2.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link pp2.Definition#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see pp2.Definition#getClassName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_ClassName();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.Definition#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see pp2.Definition#getArguments()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Arguments();

	/**
	 * Returns the meta object for class '{@link pp2.DefinitionArgumentList <em>Definition Argument List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Argument List</em>'.
	 * @see pp2.DefinitionArgumentList
	 * @generated
	 */
	EClass getDefinitionArgumentList();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.DefinitionArgumentList#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see pp2.DefinitionArgumentList#getArguments()
	 * @see #getDefinitionArgumentList()
	 * @generated
	 */
	EReference getDefinitionArgumentList_Arguments();

	/**
	 * Returns the meta object for class '{@link pp2.DefinitionArgument <em>Definition Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Argument</em>'.
	 * @see pp2.DefinitionArgument
	 * @generated
	 */
	EClass getDefinitionArgument();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.DefinitionArgument#getPuppetType <em>Puppet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Puppet Type</em>'.
	 * @see pp2.DefinitionArgument#getPuppetType()
	 * @see #getDefinitionArgument()
	 * @generated
	 */
	EReference getDefinitionArgument_PuppetType();

	/**
	 * Returns the meta object for the attribute '{@link pp2.DefinitionArgument#getArgName <em>Arg Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg Name</em>'.
	 * @see pp2.DefinitionArgument#getArgName()
	 * @see #getDefinitionArgument()
	 * @generated
	 */
	EAttribute getDefinitionArgument_ArgName();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.DefinitionArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see pp2.DefinitionArgument#getValue()
	 * @see #getDefinitionArgument()
	 * @generated
	 */
	EReference getDefinitionArgument_Value();

	/**
	 * Returns the meta object for the attribute '{@link pp2.DefinitionArgument#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see pp2.DefinitionArgument#getOp()
	 * @see #getDefinitionArgument()
	 * @generated
	 */
	EAttribute getDefinitionArgument_Op();

	/**
	 * Returns the meta object for class '{@link pp2.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Expression</em>'.
	 * @see pp2.CaseExpression
	 * @generated
	 */
	EClass getCaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.CaseExpression#getSwitchExpr <em>Switch Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expr</em>'.
	 * @see pp2.CaseExpression#getSwitchExpr()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_SwitchExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.CaseExpression#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see pp2.CaseExpression#getCases()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_Cases();

	/**
	 * Returns the meta object for class '{@link pp2.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see pp2.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.Case#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see pp2.Case#getValues()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Values();

	/**
	 * Returns the meta object for class '{@link pp2.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see pp2.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.IfExpression#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see pp2.IfExpression#getCondExpr()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_CondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.IfExpression#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see pp2.IfExpression#getElseStatement()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ElseStatement();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see pp2.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralNameOrReference <em>Literal Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Name Or Reference</em>'.
	 * @see pp2.LiteralNameOrReference
	 * @generated
	 */
	EClass getLiteralNameOrReference();

	/**
	 * Returns the meta object for the attribute '{@link pp2.LiteralNameOrReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pp2.LiteralNameOrReference#getValue()
	 * @see #getLiteralNameOrReference()
	 * @generated
	 */
	EAttribute getLiteralNameOrReference_Value();

	/**
	 * Returns the meta object for class '{@link pp2.ResourceExpression <em>Resource Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Expression</em>'.
	 * @see pp2.ResourceExpression
	 * @generated
	 */
	EClass getResourceExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ResourceExpression#getResourceExpr <em>Resource Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Expr</em>'.
	 * @see pp2.ResourceExpression#getResourceExpr()
	 * @see #getResourceExpression()
	 * @generated
	 */
	EReference getResourceExpression_ResourceExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.ResourceExpression#getResourceData <em>Resource Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Data</em>'.
	 * @see pp2.ResourceExpression#getResourceData()
	 * @see #getResourceExpression()
	 * @generated
	 */
	EReference getResourceExpression_ResourceData();

	/**
	 * Returns the meta object for class '{@link pp2.ImportExpression <em>Import Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Expression</em>'.
	 * @see pp2.ImportExpression
	 * @generated
	 */
	EClass getImportExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.ImportExpression#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see pp2.ImportExpression#getValues()
	 * @see #getImportExpression()
	 * @generated
	 */
	EReference getImportExpression_Values();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralList <em>Literal List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal List</em>'.
	 * @see pp2.LiteralList
	 * @generated
	 */
	EClass getLiteralList();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.LiteralList#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see pp2.LiteralList#getElements()
	 * @see #getLiteralList()
	 * @generated
	 */
	EReference getLiteralList_Elements();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralHash <em>Literal Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Hash</em>'.
	 * @see pp2.LiteralHash
	 * @generated
	 */
	EClass getLiteralHash();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.LiteralHash#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see pp2.LiteralHash#getElements()
	 * @see #getLiteralHash()
	 * @generated
	 */
	EReference getLiteralHash_Elements();

	/**
	 * Returns the meta object for class '{@link pp2.HashEntry <em>Hash Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Entry</em>'.
	 * @see pp2.HashEntry
	 * @generated
	 */
	EClass getHashEntry();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.HashEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see pp2.HashEntry#getKey()
	 * @see #getHashEntry()
	 * @generated
	 */
	EReference getHashEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.HashEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see pp2.HashEntry#getValue()
	 * @see #getHashEntry()
	 * @generated
	 */
	EReference getHashEntry_Value();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see pp2.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link pp2.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pp2.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralUndef <em>Literal Undef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Undef</em>'.
	 * @see pp2.LiteralUndef
	 * @generated
	 */
	EClass getLiteralUndef();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralDefault <em>Literal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Default</em>'.
	 * @see pp2.LiteralDefault
	 * @generated
	 */
	EClass getLiteralDefault();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralRegex <em>Literal Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Regex</em>'.
	 * @see pp2.LiteralRegex
	 * @generated
	 */
	EClass getLiteralRegex();

	/**
	 * Returns the meta object for the attribute '{@link pp2.LiteralRegex#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pp2.LiteralRegex#getValue()
	 * @see #getLiteralRegex()
	 * @generated
	 */
	EAttribute getLiteralRegex_Value();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Name</em>'.
	 * @see pp2.LiteralName
	 * @generated
	 */
	EClass getLiteralName();

	/**
	 * Returns the meta object for the attribute '{@link pp2.LiteralName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pp2.LiteralName#getValue()
	 * @see #getLiteralName()
	 * @generated
	 */
	EAttribute getLiteralName_Value();

	/**
	 * Returns the meta object for class '{@link pp2.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Expression</em>'.
	 * @see pp2.VariableExpression
	 * @generated
	 */
	EClass getVariableExpression();

	/**
	 * Returns the meta object for the attribute '{@link pp2.VariableExpression#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see pp2.VariableExpression#getVarName()
	 * @see #getVariableExpression()
	 * @generated
	 */
	EAttribute getVariableExpression_VarName();

	/**
	 * Returns the meta object for class '{@link pp2.RelationshipExpression <em>Relationship Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Expression</em>'.
	 * @see pp2.RelationshipExpression
	 * @generated
	 */
	EClass getRelationshipExpression();

	/**
	 * Returns the meta object for class '{@link pp2.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see pp2.AssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for class '{@link pp2.AppendExpression <em>Append Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Append Expression</em>'.
	 * @see pp2.AppendExpression
	 * @generated
	 */
	EClass getAppendExpression();

	/**
	 * Returns the meta object for class '{@link pp2.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see pp2.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link pp2.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see pp2.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link pp2.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see pp2.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for class '{@link pp2.EqualityExpression <em>Equality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Expression</em>'.
	 * @see pp2.EqualityExpression
	 * @generated
	 */
	EClass getEqualityExpression();

	/**
	 * Returns the meta object for class '{@link pp2.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Expression</em>'.
	 * @see pp2.ShiftExpression
	 * @generated
	 */
	EClass getShiftExpression();

	/**
	 * Returns the meta object for class '{@link pp2.AdditiveExpression <em>Additive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression</em>'.
	 * @see pp2.AdditiveExpression
	 * @generated
	 */
	EClass getAdditiveExpression();

	/**
	 * Returns the meta object for class '{@link pp2.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression</em>'.
	 * @see pp2.MultiplicativeExpression
	 * @generated
	 */
	EClass getMultiplicativeExpression();

	/**
	 * Returns the meta object for class '{@link pp2.MatchingExpression <em>Matching Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Expression</em>'.
	 * @see pp2.MatchingExpression
	 * @generated
	 */
	EClass getMatchingExpression();

	/**
	 * Returns the meta object for class '{@link pp2.InExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Expression</em>'.
	 * @see pp2.InExpression
	 * @generated
	 */
	EClass getInExpression();

	/**
	 * Returns the meta object for class '{@link pp2.AtExpression <em>At Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Expression</em>'.
	 * @see pp2.AtExpression
	 * @generated
	 */
	EClass getAtExpression();

	/**
	 * Returns the meta object for class '{@link pp2.CollectExpression <em>Collect Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collect Expression</em>'.
	 * @see pp2.CollectExpression
	 * @generated
	 */
	EClass getCollectExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.CollectExpression#getClassReference <em>Class Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Reference</em>'.
	 * @see pp2.CollectExpression#getClassReference()
	 * @see #getCollectExpression()
	 * @generated
	 */
	EReference getCollectExpression_ClassReference();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.CollectExpression#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see pp2.CollectExpression#getQuery()
	 * @see #getCollectExpression()
	 * @generated
	 */
	EReference getCollectExpression_Query();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.CollectExpression#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see pp2.CollectExpression#getAttributes()
	 * @see #getCollectExpression()
	 * @generated
	 */
	EReference getCollectExpression_Attributes();

	/**
	 * Returns the meta object for class '{@link pp2.SelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Expression</em>'.
	 * @see pp2.SelectorExpression
	 * @generated
	 */
	EClass getSelectorExpression();

	/**
	 * Returns the meta object for class '{@link pp2.SelectorEntry <em>Selector Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Entry</em>'.
	 * @see pp2.SelectorEntry
	 * @generated
	 */
	EClass getSelectorEntry();

	/**
	 * Returns the meta object for class '{@link pp2.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see pp2.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for class '{@link pp2.BinaryOpExpression <em>Binary Op Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op Expression</em>'.
	 * @see pp2.BinaryOpExpression
	 * @generated
	 */
	EClass getBinaryOpExpression();

	/**
	 * Returns the meta object for the attribute '{@link pp2.BinaryOpExpression#getOpName <em>Op Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Name</em>'.
	 * @see pp2.BinaryOpExpression#getOpName()
	 * @see #getBinaryOpExpression()
	 * @generated
	 */
	EAttribute getBinaryOpExpression_OpName();

	/**
	 * Returns the meta object for class '{@link pp2.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see pp2.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.BinaryExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see pp2.BinaryExpression#getLeftExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.BinaryExpression#getRightExpr <em>Right Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expr</em>'.
	 * @see pp2.BinaryExpression#getRightExpr()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpr();

	/**
	 * Returns the meta object for class '{@link pp2.ParameterizedExpression <em>Parameterized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Expression</em>'.
	 * @see pp2.ParameterizedExpression
	 * @generated
	 */
	EClass getParameterizedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ParameterizedExpression#getLeftExpr <em>Left Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expr</em>'.
	 * @see pp2.ParameterizedExpression#getLeftExpr()
	 * @see #getParameterizedExpression()
	 * @generated
	 */
	EReference getParameterizedExpression_LeftExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.ParameterizedExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see pp2.ParameterizedExpression#getParameters()
	 * @see #getParameterizedExpression()
	 * @generated
	 */
	EReference getParameterizedExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link pp2.NodeDefinition <em>Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Definition</em>'.
	 * @see pp2.NodeDefinition
	 * @generated
	 */
	EClass getNodeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.NodeDefinition#getHostNames <em>Host Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Names</em>'.
	 * @see pp2.NodeDefinition#getHostNames()
	 * @see #getNodeDefinition()
	 * @generated
	 */
	EReference getNodeDefinition_HostNames();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.NodeDefinition#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Name</em>'.
	 * @see pp2.NodeDefinition#getParentName()
	 * @see #getNodeDefinition()
	 * @generated
	 */
	EReference getNodeDefinition_ParentName();

	/**
	 * Returns the meta object for class '{@link pp2.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see pp2.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.UnaryExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see pp2.UnaryExpression#getExpr()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expr();

	/**
	 * Returns the meta object for class '{@link pp2.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Minus Expression</em>'.
	 * @see pp2.UnaryMinusExpression
	 * @generated
	 */
	EClass getUnaryMinusExpression();

	/**
	 * Returns the meta object for class '{@link pp2.UnaryNotExpression <em>Unary Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Not Expression</em>'.
	 * @see pp2.UnaryNotExpression
	 * @generated
	 */
	EClass getUnaryNotExpression();

	/**
	 * Returns the meta object for class '{@link pp2.ExpressionBlock <em>Expression Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Block</em>'.
	 * @see pp2.ExpressionBlock
	 * @generated
	 */
	EClass getExpressionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.ExpressionBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see pp2.ExpressionBlock#getStatements()
	 * @see #getExpressionBlock()
	 * @generated
	 */
	EReference getExpressionBlock_Statements();

	/**
	 * Returns the meta object for class '{@link pp2.ElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Expression</em>'.
	 * @see pp2.ElseExpression
	 * @generated
	 */
	EClass getElseExpression();

	/**
	 * Returns the meta object for class '{@link pp2.ElseIfExpression <em>Else If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Expression</em>'.
	 * @see pp2.ElseIfExpression
	 * @generated
	 */
	EClass getElseIfExpression();

	/**
	 * Returns the meta object for class '{@link pp2.VirtualNameOrReference <em>Virtual Name Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Name Or Reference</em>'.
	 * @see pp2.VirtualNameOrReference
	 * @generated
	 */
	EClass getVirtualNameOrReference();

	/**
	 * Returns the meta object for the attribute '{@link pp2.VirtualNameOrReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pp2.VirtualNameOrReference#getValue()
	 * @see #getVirtualNameOrReference()
	 * @generated
	 */
	EAttribute getVirtualNameOrReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link pp2.VirtualNameOrReference#isExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exported</em>'.
	 * @see pp2.VirtualNameOrReference#isExported()
	 * @see #getVirtualNameOrReference()
	 * @generated
	 */
	EAttribute getVirtualNameOrReference_Exported();

	/**
	 * Returns the meta object for class '{@link pp2.ParenthesisedExpression <em>Parenthesised Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesised Expression</em>'.
	 * @see pp2.ParenthesisedExpression
	 * @generated
	 */
	EClass getParenthesisedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ParenthesisedExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see pp2.ParenthesisedExpression#getExpr()
	 * @see #getParenthesisedExpression()
	 * @generated
	 */
	EReference getParenthesisedExpression_Expr();

	/**
	 * Returns the meta object for class '{@link pp2.ExprList <em>Expr List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr List</em>'.
	 * @see pp2.ExprList
	 * @generated
	 */
	EClass getExprList();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.ExprList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see pp2.ExprList#getExpressions()
	 * @see #getExprList()
	 * @generated
	 */
	EReference getExprList_Expressions();

	/**
	 * Returns the meta object for class '{@link pp2.DoubleQuotedString <em>Double Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Quoted String</em>'.
	 * @see pp2.DoubleQuotedString
	 * @generated
	 */
	EClass getDoubleQuotedString();

	/**
	 * Returns the meta object for the containment reference list '{@link pp2.DoubleQuotedString#getStringPart <em>String Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Part</em>'.
	 * @see pp2.DoubleQuotedString#getStringPart()
	 * @see #getDoubleQuotedString()
	 * @generated
	 */
	EReference getDoubleQuotedString_StringPart();

	/**
	 * Returns the meta object for class '{@link pp2.SingleQuotedString <em>Single Quoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Quoted String</em>'.
	 * @see pp2.SingleQuotedString
	 * @generated
	 */
	EClass getSingleQuotedString();

	/**
	 * Returns the meta object for the attribute '{@link pp2.SingleQuotedString#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see pp2.SingleQuotedString#getText()
	 * @see #getSingleQuotedString()
	 * @generated
	 */
	EAttribute getSingleQuotedString_Text();

	/**
	 * Returns the meta object for class '{@link pp2.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see pp2.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for class '{@link pp2.UnquotedString <em>Unquoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unquoted String</em>'.
	 * @see pp2.UnquotedString
	 * @generated
	 */
	EClass getUnquotedString();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.UnquotedString#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see pp2.UnquotedString#getExpression()
	 * @see #getUnquotedString()
	 * @generated
	 */
	EReference getUnquotedString_Expression();

	/**
	 * Returns the meta object for class '{@link pp2.IQuotedString <em>IQuoted String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IQuoted String</em>'.
	 * @see pp2.IQuotedString
	 * @generated
	 */
	EClass getIQuotedString();

	/**
	 * Returns the meta object for class '{@link pp2.InterpolatedVariable <em>Interpolated Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolated Variable</em>'.
	 * @see pp2.InterpolatedVariable
	 * @generated
	 */
	EClass getInterpolatedVariable();

	/**
	 * Returns the meta object for the attribute '{@link pp2.InterpolatedVariable#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see pp2.InterpolatedVariable#getVarName()
	 * @see #getInterpolatedVariable()
	 * @generated
	 */
	EAttribute getInterpolatedVariable_VarName();

	/**
	 * Returns the meta object for class '{@link pp2.TextExpression <em>Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Expression</em>'.
	 * @see pp2.TextExpression
	 * @generated
	 */
	EClass getTextExpression();

	/**
	 * Returns the meta object for class '{@link pp2.VerbatimTE <em>Verbatim TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbatim TE</em>'.
	 * @see pp2.VerbatimTE
	 * @generated
	 */
	EClass getVerbatimTE();

	/**
	 * Returns the meta object for the attribute '{@link pp2.VerbatimTE#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see pp2.VerbatimTE#getText()
	 * @see #getVerbatimTE()
	 * @generated
	 */
	EAttribute getVerbatimTE_Text();

	/**
	 * Returns the meta object for class '{@link pp2.ExpressionTE <em>Expression TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression TE</em>'.
	 * @see pp2.ExpressionTE
	 * @generated
	 */
	EClass getExpressionTE();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.ExpressionTE#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see pp2.ExpressionTE#getExpression()
	 * @see #getExpressionTE()
	 * @generated
	 */
	EReference getExpressionTE_Expression();

	/**
	 * Returns the meta object for class '{@link pp2.VariableTE <em>Variable TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable TE</em>'.
	 * @see pp2.VariableTE
	 * @generated
	 */
	EClass getVariableTE();

	/**
	 * Returns the meta object for the attribute '{@link pp2.VariableTE#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see pp2.VariableTE#getVarName()
	 * @see #getVariableTE()
	 * @generated
	 */
	EAttribute getVariableTE_VarName();

	/**
	 * Returns the meta object for class '{@link pp2.LiteralClass <em>Literal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Class</em>'.
	 * @see pp2.LiteralClass
	 * @generated
	 */
	EClass getLiteralClass();

	/**
	 * Returns the meta object for class '{@link pp2.UnlessExpression <em>Unless Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unless Expression</em>'.
	 * @see pp2.UnlessExpression
	 * @generated
	 */
	EClass getUnlessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.UnlessExpression#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see pp2.UnlessExpression#getCondExpr()
	 * @see #getUnlessExpression()
	 * @generated
	 */
	EReference getUnlessExpression_CondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.UnlessExpression#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see pp2.UnlessExpression#getElseStatement()
	 * @see #getUnlessExpression()
	 * @generated
	 */
	EReference getUnlessExpression_ElseStatement();

	/**
	 * Returns the meta object for class '{@link pp2.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda</em>'.
	 * @see pp2.Lambda
	 * @generated
	 */
	EClass getLambda();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.Lambda#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see pp2.Lambda#getArguments()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_Arguments();

	/**
	 * Returns the meta object for class '{@link pp2.NamedAccessExpression <em>Named Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Access Expression</em>'.
	 * @see pp2.NamedAccessExpression
	 * @generated
	 */
	EClass getNamedAccessExpression();

	/**
	 * Returns the meta object for class '{@link pp2.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see pp2.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the attribute '{@link pp2.MethodCall#isParenthesized <em>Parenthesized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parenthesized</em>'.
	 * @see pp2.MethodCall#isParenthesized()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_Parenthesized();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.MethodCall#getMethodExpr <em>Method Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Expr</em>'.
	 * @see pp2.MethodCall#getMethodExpr()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_MethodExpr();

	/**
	 * Returns the meta object for class '{@link pp2.WithLambdaExpression <em>With Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With Lambda Expression</em>'.
	 * @see pp2.WithLambdaExpression
	 * @generated
	 */
	EClass getWithLambdaExpression();

	/**
	 * Returns the meta object for the containment reference '{@link pp2.WithLambdaExpression#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lambda</em>'.
	 * @see pp2.WithLambdaExpression#getLambda()
	 * @see #getWithLambdaExpression()
	 * @generated
	 */
	EReference getWithLambdaExpression_Lambda();

	/**
	 * Returns the meta object for class '{@link pp2.JavaLambda <em>Java Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Lambda</em>'.
	 * @see pp2.JavaLambda
	 * @generated
	 */
	EClass getJavaLambda();

	/**
	 * Returns the meta object for the attribute '{@link pp2.JavaLambda#isFarrow <em>Farrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farrow</em>'.
	 * @see pp2.JavaLambda#isFarrow()
	 * @see #getJavaLambda()
	 * @generated
	 */
	EAttribute getJavaLambda_Farrow();

	/**
	 * Returns the meta object for class '{@link pp2.RubyLambda <em>Ruby Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Lambda</em>'.
	 * @see pp2.RubyLambda
	 * @generated
	 */
	EClass getRubyLambda();

	/**
	 * Returns the meta object for class '{@link pp2.SeparatorExpression <em>Separator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator Expression</em>'.
	 * @see pp2.SeparatorExpression
	 * @generated
	 */
	EClass getSeparatorExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pp2Factory getPp2Factory();

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
		 * The meta object literal for the '{@link pp2.impl.PuppetManifestImpl <em>Puppet Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.PuppetManifestImpl
		 * @see pp2.impl.Pp2PackageImpl#getPuppetManifest()
		 * @generated
		 */
		EClass PUPPET_MANIFEST = eINSTANCE.getPuppetManifest();

		/**
		 * The meta object literal for the '{@link pp2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.ResourceBodyImpl <em>Resource Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ResourceBodyImpl
		 * @see pp2.impl.Pp2PackageImpl#getResourceBody()
		 * @generated
		 */
		EClass RESOURCE_BODY = eINSTANCE.getResourceBody();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BODY__ATTRIBUTES = eINSTANCE.getResourceBody_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BODY__NAME_EXPR = eINSTANCE.getResourceBody_NameExpr();

		/**
		 * The meta object literal for the '{@link pp2.impl.AttributeOperationImpl <em>Attribute Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AttributeOperationImpl
		 * @see pp2.impl.Pp2PackageImpl#getAttributeOperation()
		 * @generated
		 */
		EClass ATTRIBUTE_OPERATION = eINSTANCE.getAttributeOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_OPERATION__VALUE = eINSTANCE.getAttributeOperation_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_OPERATION__KEY = eINSTANCE.getAttributeOperation_Key();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_OPERATION__OP = eINSTANCE.getAttributeOperation_Op();

		/**
		 * The meta object literal for the '{@link pp2.impl.AttributeOperationsImpl <em>Attribute Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AttributeOperationsImpl
		 * @see pp2.impl.Pp2PackageImpl#getAttributeOperations()
		 * @generated
		 */
		EClass ATTRIBUTE_OPERATIONS = eINSTANCE.getAttributeOperations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_OPERATIONS__ATTRIBUTES = eINSTANCE.getAttributeOperations_Attributes();

		/**
		 * The meta object literal for the '{@link pp2.ICollectQuery <em>ICollect Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.ICollectQuery
		 * @see pp2.impl.Pp2PackageImpl#getICollectQuery()
		 * @generated
		 */
		EClass ICOLLECT_QUERY = eINSTANCE.getICollectQuery();

		/**
		 * The meta object literal for the '{@link pp2.impl.VirtualCollectQueryImpl <em>Virtual Collect Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.VirtualCollectQueryImpl
		 * @see pp2.impl.Pp2PackageImpl#getVirtualCollectQuery()
		 * @generated
		 */
		EClass VIRTUAL_COLLECT_QUERY = eINSTANCE.getVirtualCollectQuery();

		/**
		 * The meta object literal for the '{@link pp2.impl.ExportedCollectQueryImpl <em>Exported Collect Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ExportedCollectQueryImpl
		 * @see pp2.impl.Pp2PackageImpl#getExportedCollectQuery()
		 * @generated
		 */
		EClass EXPORTED_COLLECT_QUERY = eINSTANCE.getExportedCollectQuery();

		/**
		 * The meta object literal for the '{@link pp2.impl.HostClassDefinitionImpl <em>Host Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.HostClassDefinitionImpl
		 * @see pp2.impl.Pp2PackageImpl#getHostClassDefinition()
		 * @generated
		 */
		EClass HOST_CLASS_DEFINITION = eINSTANCE.getHostClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOST_CLASS_DEFINITION__PARENT = eINSTANCE.getHostClassDefinition_Parent();

		/**
		 * The meta object literal for the '{@link pp2.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.DefinitionImpl
		 * @see pp2.impl.Pp2PackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__CLASS_NAME = eINSTANCE.getDefinition_ClassName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__ARGUMENTS = eINSTANCE.getDefinition_Arguments();

		/**
		 * The meta object literal for the '{@link pp2.impl.DefinitionArgumentListImpl <em>Definition Argument List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.DefinitionArgumentListImpl
		 * @see pp2.impl.Pp2PackageImpl#getDefinitionArgumentList()
		 * @generated
		 */
		EClass DEFINITION_ARGUMENT_LIST = eINSTANCE.getDefinitionArgumentList();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ARGUMENT_LIST__ARGUMENTS = eINSTANCE.getDefinitionArgumentList_Arguments();

		/**
		 * The meta object literal for the '{@link pp2.impl.DefinitionArgumentImpl <em>Definition Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.DefinitionArgumentImpl
		 * @see pp2.impl.Pp2PackageImpl#getDefinitionArgument()
		 * @generated
		 */
		EClass DEFINITION_ARGUMENT = eINSTANCE.getDefinitionArgument();

		/**
		 * The meta object literal for the '<em><b>Puppet Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ARGUMENT__PUPPET_TYPE = eINSTANCE.getDefinitionArgument_PuppetType();

		/**
		 * The meta object literal for the '<em><b>Arg Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_ARGUMENT__ARG_NAME = eINSTANCE.getDefinitionArgument_ArgName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ARGUMENT__VALUE = eINSTANCE.getDefinitionArgument_Value();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_ARGUMENT__OP = eINSTANCE.getDefinitionArgument_Op();

		/**
		 * The meta object literal for the '{@link pp2.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.CaseExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getCaseExpression()
		 * @generated
		 */
		EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

		/**
		 * The meta object literal for the '<em><b>Switch Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__SWITCH_EXPR = eINSTANCE.getCaseExpression_SwitchExpr();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__CASES = eINSTANCE.getCaseExpression_Cases();

		/**
		 * The meta object literal for the '{@link pp2.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.CaseImpl
		 * @see pp2.impl.Pp2PackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__VALUES = eINSTANCE.getCase_Values();

		/**
		 * The meta object literal for the '{@link pp2.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.IfExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__COND_EXPR = eINSTANCE.getIfExpression_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE_STATEMENT = eINSTANCE.getIfExpression_ElseStatement();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralNameOrReferenceImpl <em>Literal Name Or Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralNameOrReferenceImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralNameOrReference()
		 * @generated
		 */
		EClass LITERAL_NAME_OR_REFERENCE = eINSTANCE.getLiteralNameOrReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_NAME_OR_REFERENCE__VALUE = eINSTANCE.getLiteralNameOrReference_Value();

		/**
		 * The meta object literal for the '{@link pp2.impl.ResourceExpressionImpl <em>Resource Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ResourceExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getResourceExpression()
		 * @generated
		 */
		EClass RESOURCE_EXPRESSION = eINSTANCE.getResourceExpression();

		/**
		 * The meta object literal for the '<em><b>Resource Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EXPRESSION__RESOURCE_EXPR = eINSTANCE.getResourceExpression_ResourceExpr();

		/**
		 * The meta object literal for the '<em><b>Resource Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_EXPRESSION__RESOURCE_DATA = eINSTANCE.getResourceExpression_ResourceData();

		/**
		 * The meta object literal for the '{@link pp2.impl.ImportExpressionImpl <em>Import Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ImportExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getImportExpression()
		 * @generated
		 */
		EClass IMPORT_EXPRESSION = eINSTANCE.getImportExpression();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_EXPRESSION__VALUES = eINSTANCE.getImportExpression_Values();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralListImpl <em>Literal List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralListImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralList()
		 * @generated
		 */
		EClass LITERAL_LIST = eINSTANCE.getLiteralList();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_LIST__ELEMENTS = eINSTANCE.getLiteralList_Elements();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralHashImpl <em>Literal Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralHashImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralHash()
		 * @generated
		 */
		EClass LITERAL_HASH = eINSTANCE.getLiteralHash();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_HASH__ELEMENTS = eINSTANCE.getLiteralHash_Elements();

		/**
		 * The meta object literal for the '{@link pp2.impl.HashEntryImpl <em>Hash Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.HashEntryImpl
		 * @see pp2.impl.Pp2PackageImpl#getHashEntry()
		 * @generated
		 */
		EClass HASH_ENTRY = eINSTANCE.getHashEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_ENTRY__KEY = eINSTANCE.getHashEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_ENTRY__VALUE = eINSTANCE.getHashEntry_Value();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralBooleanImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralUndefImpl <em>Literal Undef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralUndefImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralUndef()
		 * @generated
		 */
		EClass LITERAL_UNDEF = eINSTANCE.getLiteralUndef();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralDefaultImpl <em>Literal Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralDefaultImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralDefault()
		 * @generated
		 */
		EClass LITERAL_DEFAULT = eINSTANCE.getLiteralDefault();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralRegexImpl <em>Literal Regex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralRegexImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralRegex()
		 * @generated
		 */
		EClass LITERAL_REGEX = eINSTANCE.getLiteralRegex();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_REGEX__VALUE = eINSTANCE.getLiteralRegex_Value();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralNameImpl <em>Literal Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralNameImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralName()
		 * @generated
		 */
		EClass LITERAL_NAME = eINSTANCE.getLiteralName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_NAME__VALUE = eINSTANCE.getLiteralName_Value();

		/**
		 * The meta object literal for the '{@link pp2.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.VariableExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getVariableExpression()
		 * @generated
		 */
		EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_EXPRESSION__VAR_NAME = eINSTANCE.getVariableExpression_VarName();

		/**
		 * The meta object literal for the '{@link pp2.impl.RelationshipExpressionImpl <em>Relationship Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.RelationshipExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getRelationshipExpression()
		 * @generated
		 */
		EClass RELATIONSHIP_EXPRESSION = eINSTANCE.getRelationshipExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AssignmentExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.AppendExpressionImpl <em>Append Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AppendExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getAppendExpression()
		 * @generated
		 */
		EClass APPEND_EXPRESSION = eINSTANCE.getAppendExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.OrExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AndExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.RelationalExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.EqualityExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getEqualityExpression()
		 * @generated
		 */
		EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ShiftExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getShiftExpression()
		 * @generated
		 */
		EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AdditiveExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getAdditiveExpression()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.MultiplicativeExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getMultiplicativeExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.MatchingExpressionImpl <em>Matching Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.MatchingExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getMatchingExpression()
		 * @generated
		 */
		EClass MATCHING_EXPRESSION = eINSTANCE.getMatchingExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.InExpressionImpl <em>In Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.InExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getInExpression()
		 * @generated
		 */
		EClass IN_EXPRESSION = eINSTANCE.getInExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.AtExpressionImpl <em>At Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.AtExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getAtExpression()
		 * @generated
		 */
		EClass AT_EXPRESSION = eINSTANCE.getAtExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.CollectExpressionImpl <em>Collect Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.CollectExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getCollectExpression()
		 * @generated
		 */
		EClass COLLECT_EXPRESSION = eINSTANCE.getCollectExpression();

		/**
		 * The meta object literal for the '<em><b>Class Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_EXPRESSION__CLASS_REFERENCE = eINSTANCE.getCollectExpression_ClassReference();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_EXPRESSION__QUERY = eINSTANCE.getCollectExpression_Query();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECT_EXPRESSION__ATTRIBUTES = eINSTANCE.getCollectExpression_Attributes();

		/**
		 * The meta object literal for the '{@link pp2.impl.SelectorExpressionImpl <em>Selector Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.SelectorExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getSelectorExpression()
		 * @generated
		 */
		EClass SELECTOR_EXPRESSION = eINSTANCE.getSelectorExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.SelectorEntryImpl <em>Selector Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.SelectorEntryImpl
		 * @see pp2.impl.Pp2PackageImpl#getSelectorEntry()
		 * @generated
		 */
		EClass SELECTOR_ENTRY = eINSTANCE.getSelectorEntry();

		/**
		 * The meta object literal for the '{@link pp2.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.FunctionCallImpl
		 * @see pp2.impl.Pp2PackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '{@link pp2.impl.BinaryOpExpressionImpl <em>Binary Op Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.BinaryOpExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getBinaryOpExpression()
		 * @generated
		 */
		EClass BINARY_OP_EXPRESSION = eINSTANCE.getBinaryOpExpression();

		/**
		 * The meta object literal for the '<em><b>Op Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OP_EXPRESSION__OP_NAME = eINSTANCE.getBinaryOpExpression_OpName();

		/**
		 * The meta object literal for the '{@link pp2.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.BinaryExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPR = eINSTANCE.getBinaryExpression_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Right Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPR = eINSTANCE.getBinaryExpression_RightExpr();

		/**
		 * The meta object literal for the '{@link pp2.impl.ParameterizedExpressionImpl <em>Parameterized Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ParameterizedExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getParameterizedExpression()
		 * @generated
		 */
		EClass PARAMETERIZED_EXPRESSION = eINSTANCE.getParameterizedExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_EXPRESSION__LEFT_EXPR = eINSTANCE.getParameterizedExpression_LeftExpr();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_EXPRESSION__PARAMETERS = eINSTANCE.getParameterizedExpression_Parameters();

		/**
		 * The meta object literal for the '{@link pp2.impl.NodeDefinitionImpl <em>Node Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.NodeDefinitionImpl
		 * @see pp2.impl.Pp2PackageImpl#getNodeDefinition()
		 * @generated
		 */
		EClass NODE_DEFINITION = eINSTANCE.getNodeDefinition();

		/**
		 * The meta object literal for the '<em><b>Host Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION__HOST_NAMES = eINSTANCE.getNodeDefinition_HostNames();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_DEFINITION__PARENT_NAME = eINSTANCE.getNodeDefinition_ParentName();

		/**
		 * The meta object literal for the '{@link pp2.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.UnaryExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getUnaryExpression_Expr();

		/**
		 * The meta object literal for the '{@link pp2.impl.UnaryMinusExpressionImpl <em>Unary Minus Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.UnaryMinusExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getUnaryMinusExpression()
		 * @generated
		 */
		EClass UNARY_MINUS_EXPRESSION = eINSTANCE.getUnaryMinusExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.UnaryNotExpressionImpl <em>Unary Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.UnaryNotExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getUnaryNotExpression()
		 * @generated
		 */
		EClass UNARY_NOT_EXPRESSION = eINSTANCE.getUnaryNotExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.ExpressionBlockImpl <em>Expression Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ExpressionBlockImpl
		 * @see pp2.impl.Pp2PackageImpl#getExpressionBlock()
		 * @generated
		 */
		EClass EXPRESSION_BLOCK = eINSTANCE.getExpressionBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BLOCK__STATEMENTS = eINSTANCE.getExpressionBlock_Statements();

		/**
		 * The meta object literal for the '{@link pp2.impl.ElseExpressionImpl <em>Else Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ElseExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getElseExpression()
		 * @generated
		 */
		EClass ELSE_EXPRESSION = eINSTANCE.getElseExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.ElseIfExpressionImpl <em>Else If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ElseIfExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getElseIfExpression()
		 * @generated
		 */
		EClass ELSE_IF_EXPRESSION = eINSTANCE.getElseIfExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.VirtualNameOrReferenceImpl <em>Virtual Name Or Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.VirtualNameOrReferenceImpl
		 * @see pp2.impl.Pp2PackageImpl#getVirtualNameOrReference()
		 * @generated
		 */
		EClass VIRTUAL_NAME_OR_REFERENCE = eINSTANCE.getVirtualNameOrReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_NAME_OR_REFERENCE__VALUE = eINSTANCE.getVirtualNameOrReference_Value();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_NAME_OR_REFERENCE__EXPORTED = eINSTANCE.getVirtualNameOrReference_Exported();

		/**
		 * The meta object literal for the '{@link pp2.impl.ParenthesisedExpressionImpl <em>Parenthesised Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ParenthesisedExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getParenthesisedExpression()
		 * @generated
		 */
		EClass PARENTHESISED_EXPRESSION = eINSTANCE.getParenthesisedExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESISED_EXPRESSION__EXPR = eINSTANCE.getParenthesisedExpression_Expr();

		/**
		 * The meta object literal for the '{@link pp2.impl.ExprListImpl <em>Expr List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ExprListImpl
		 * @see pp2.impl.Pp2PackageImpl#getExprList()
		 * @generated
		 */
		EClass EXPR_LIST = eINSTANCE.getExprList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_LIST__EXPRESSIONS = eINSTANCE.getExprList_Expressions();

		/**
		 * The meta object literal for the '{@link pp2.impl.DoubleQuotedStringImpl <em>Double Quoted String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.DoubleQuotedStringImpl
		 * @see pp2.impl.Pp2PackageImpl#getDoubleQuotedString()
		 * @generated
		 */
		EClass DOUBLE_QUOTED_STRING = eINSTANCE.getDoubleQuotedString();

		/**
		 * The meta object literal for the '<em><b>String Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUBLE_QUOTED_STRING__STRING_PART = eINSTANCE.getDoubleQuotedString_StringPart();

		/**
		 * The meta object literal for the '{@link pp2.impl.SingleQuotedStringImpl <em>Single Quoted String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.SingleQuotedStringImpl
		 * @see pp2.impl.Pp2PackageImpl#getSingleQuotedString()
		 * @generated
		 */
		EClass SINGLE_QUOTED_STRING = eINSTANCE.getSingleQuotedString();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_QUOTED_STRING__TEXT = eINSTANCE.getSingleQuotedString_Text();

		/**
		 * The meta object literal for the '{@link pp2.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.StringExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.UnquotedStringImpl <em>Unquoted String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.UnquotedStringImpl
		 * @see pp2.impl.Pp2PackageImpl#getUnquotedString()
		 * @generated
		 */
		EClass UNQUOTED_STRING = eINSTANCE.getUnquotedString();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNQUOTED_STRING__EXPRESSION = eINSTANCE.getUnquotedString_Expression();

		/**
		 * The meta object literal for the '{@link pp2.IQuotedString <em>IQuoted String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.IQuotedString
		 * @see pp2.impl.Pp2PackageImpl#getIQuotedString()
		 * @generated
		 */
		EClass IQUOTED_STRING = eINSTANCE.getIQuotedString();

		/**
		 * The meta object literal for the '{@link pp2.impl.InterpolatedVariableImpl <em>Interpolated Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.InterpolatedVariableImpl
		 * @see pp2.impl.Pp2PackageImpl#getInterpolatedVariable()
		 * @generated
		 */
		EClass INTERPOLATED_VARIABLE = eINSTANCE.getInterpolatedVariable();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPOLATED_VARIABLE__VAR_NAME = eINSTANCE.getInterpolatedVariable_VarName();

		/**
		 * The meta object literal for the '{@link pp2.impl.TextExpressionImpl <em>Text Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.TextExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getTextExpression()
		 * @generated
		 */
		EClass TEXT_EXPRESSION = eINSTANCE.getTextExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.VerbatimTEImpl <em>Verbatim TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.VerbatimTEImpl
		 * @see pp2.impl.Pp2PackageImpl#getVerbatimTE()
		 * @generated
		 */
		EClass VERBATIM_TE = eINSTANCE.getVerbatimTE();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBATIM_TE__TEXT = eINSTANCE.getVerbatimTE_Text();

		/**
		 * The meta object literal for the '{@link pp2.impl.ExpressionTEImpl <em>Expression TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.ExpressionTEImpl
		 * @see pp2.impl.Pp2PackageImpl#getExpressionTE()
		 * @generated
		 */
		EClass EXPRESSION_TE = eINSTANCE.getExpressionTE();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TE__EXPRESSION = eINSTANCE.getExpressionTE_Expression();

		/**
		 * The meta object literal for the '{@link pp2.impl.VariableTEImpl <em>Variable TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.VariableTEImpl
		 * @see pp2.impl.Pp2PackageImpl#getVariableTE()
		 * @generated
		 */
		EClass VARIABLE_TE = eINSTANCE.getVariableTE();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TE__VAR_NAME = eINSTANCE.getVariableTE_VarName();

		/**
		 * The meta object literal for the '{@link pp2.impl.LiteralClassImpl <em>Literal Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LiteralClassImpl
		 * @see pp2.impl.Pp2PackageImpl#getLiteralClass()
		 * @generated
		 */
		EClass LITERAL_CLASS = eINSTANCE.getLiteralClass();

		/**
		 * The meta object literal for the '{@link pp2.impl.UnlessExpressionImpl <em>Unless Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.UnlessExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getUnlessExpression()
		 * @generated
		 */
		EClass UNLESS_EXPRESSION = eINSTANCE.getUnlessExpression();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLESS_EXPRESSION__COND_EXPR = eINSTANCE.getUnlessExpression_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLESS_EXPRESSION__ELSE_STATEMENT = eINSTANCE.getUnlessExpression_ElseStatement();

		/**
		 * The meta object literal for the '{@link pp2.impl.LambdaImpl <em>Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.LambdaImpl
		 * @see pp2.impl.Pp2PackageImpl#getLambda()
		 * @generated
		 */
		EClass LAMBDA = eINSTANCE.getLambda();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__ARGUMENTS = eINSTANCE.getLambda_Arguments();

		/**
		 * The meta object literal for the '{@link pp2.impl.NamedAccessExpressionImpl <em>Named Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.NamedAccessExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getNamedAccessExpression()
		 * @generated
		 */
		EClass NAMED_ACCESS_EXPRESSION = eINSTANCE.getNamedAccessExpression();

		/**
		 * The meta object literal for the '{@link pp2.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.MethodCallImpl
		 * @see pp2.impl.Pp2PackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Parenthesized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__PARENTHESIZED = eINSTANCE.getMethodCall_Parenthesized();

		/**
		 * The meta object literal for the '<em><b>Method Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__METHOD_EXPR = eINSTANCE.getMethodCall_MethodExpr();

		/**
		 * The meta object literal for the '{@link pp2.impl.WithLambdaExpressionImpl <em>With Lambda Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.WithLambdaExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getWithLambdaExpression()
		 * @generated
		 */
		EClass WITH_LAMBDA_EXPRESSION = eINSTANCE.getWithLambdaExpression();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_LAMBDA_EXPRESSION__LAMBDA = eINSTANCE.getWithLambdaExpression_Lambda();

		/**
		 * The meta object literal for the '{@link pp2.impl.JavaLambdaImpl <em>Java Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.JavaLambdaImpl
		 * @see pp2.impl.Pp2PackageImpl#getJavaLambda()
		 * @generated
		 */
		EClass JAVA_LAMBDA = eINSTANCE.getJavaLambda();

		/**
		 * The meta object literal for the '<em><b>Farrow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_LAMBDA__FARROW = eINSTANCE.getJavaLambda_Farrow();

		/**
		 * The meta object literal for the '{@link pp2.impl.RubyLambdaImpl <em>Ruby Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.RubyLambdaImpl
		 * @see pp2.impl.Pp2PackageImpl#getRubyLambda()
		 * @generated
		 */
		EClass RUBY_LAMBDA = eINSTANCE.getRubyLambda();

		/**
		 * The meta object literal for the '{@link pp2.impl.SeparatorExpressionImpl <em>Separator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pp2.impl.SeparatorExpressionImpl
		 * @see pp2.impl.Pp2PackageImpl#getSeparatorExpression()
		 * @generated
		 */
		EClass SEPARATOR_EXPRESSION = eINSTANCE.getSeparatorExpression();

	}

} //Pp2Package
