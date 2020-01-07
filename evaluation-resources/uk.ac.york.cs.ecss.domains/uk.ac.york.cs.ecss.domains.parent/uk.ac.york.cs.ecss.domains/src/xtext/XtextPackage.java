/**
 */
package xtext;

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
 * @see xtext.XtextFactory
 * @model kind="package"
 * @generated
 */
public interface XtextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xtext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/2008/Xtext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xtext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XtextPackage eINSTANCE = xtext.impl.XtextPackageImpl.init();

	/**
	 * The meta object id for the '{@link xtext.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.GrammarImpl
	 * @see xtext.impl.XtextPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Used Grammars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__USED_GRAMMARS = 1;

	/**
	 * The feature id for the '<em><b>Defines Hidden Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__DEFINES_HIDDEN_TOKENS = 2;

	/**
	 * The feature id for the '<em><b>Hidden Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__HIDDEN_TOKENS = 3;

	/**
	 * The feature id for the '<em><b>Metamodel Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__METAMODEL_DECLARATIONS = 4;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = 5;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AbstractRuleImpl
	 * @see xtext.impl.XtextPackageImpl#getAbstractRule()
	 * @generated
	 */
	int ABSTRACT_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE__ALTERNATIVES = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE__ANNOTATIONS = 3;

	/**
	 * The number of structural features of the '<em>Abstract Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AbstractMetamodelDeclarationImpl <em>Abstract Metamodel Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AbstractMetamodelDeclarationImpl
	 * @see xtext.impl.XtextPackageImpl#getAbstractMetamodelDeclaration()
	 * @generated
	 */
	int ABSTRACT_METAMODEL_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METAMODEL_DECLARATION__EPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METAMODEL_DECLARATION__ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Metamodel Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METAMODEL_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Metamodel Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METAMODEL_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.GeneratedMetamodelImpl <em>Generated Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.GeneratedMetamodelImpl
	 * @see xtext.impl.XtextPackageImpl#getGeneratedMetamodel()
	 * @generated
	 */
	int GENERATED_METAMODEL = 3;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_METAMODEL__EPACKAGE = ABSTRACT_METAMODEL_DECLARATION__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_METAMODEL__ALIAS = ABSTRACT_METAMODEL_DECLARATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_METAMODEL__NAME = ABSTRACT_METAMODEL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generated Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_METAMODEL_FEATURE_COUNT = ABSTRACT_METAMODEL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generated Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_METAMODEL_OPERATION_COUNT = ABSTRACT_METAMODEL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ReferencedMetamodelImpl <em>Referenced Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ReferencedMetamodelImpl
	 * @see xtext.impl.XtextPackageImpl#getReferencedMetamodel()
	 * @generated
	 */
	int REFERENCED_METAMODEL = 4;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_METAMODEL__EPACKAGE = ABSTRACT_METAMODEL_DECLARATION__EPACKAGE;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_METAMODEL__ALIAS = ABSTRACT_METAMODEL_DECLARATION__ALIAS;

	/**
	 * The number of structural features of the '<em>Referenced Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_METAMODEL_FEATURE_COUNT = ABSTRACT_METAMODEL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Referenced Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_METAMODEL_OPERATION_COUNT = ABSTRACT_METAMODEL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ParserRuleImpl <em>Parser Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ParserRuleImpl
	 * @see xtext.impl.XtextPackageImpl#getParserRule()
	 * @generated
	 */
	int PARSER_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__NAME = ABSTRACT_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__TYPE = ABSTRACT_RULE__TYPE;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__ALTERNATIVES = ABSTRACT_RULE__ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__ANNOTATIONS = ABSTRACT_RULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Defines Hidden Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__DEFINES_HIDDEN_TOKENS = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__HIDDEN_TOKENS = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__PARAMETERS = ABSTRACT_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__FRAGMENT = ABSTRACT_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE__WILDCARD = ABSTRACT_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parser Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parser Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSER_RULE_OPERATION_COUNT = ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.TypeRefImpl
	 * @see xtext.impl.XtextPackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 6;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__METAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF__CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AbstractElementImpl
	 * @see xtext.impl.XtextPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__PREDICATED = 1;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__FIRST_SET_PREDICATED = 2;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ActionImpl
	 * @see xtext.impl.XtextPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FEATURE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OPERATOR = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.KeywordImpl
	 * @see xtext.impl.XtextPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 9;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__VALUE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.RuleCallImpl <em>Rule Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.RuleCallImpl
	 * @see xtext.impl.XtextPackageImpl#getRuleCall()
	 * @generated
	 */
	int RULE_CALL = 10;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__RULE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__ARGUMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explicitly Called</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL__EXPLICITLY_CALLED = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rule Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CALL_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AssignmentImpl
	 * @see xtext.impl.XtextPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 11;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FEATURE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATOR = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TERMINAL = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.CrossReferenceImpl
	 * @see xtext.impl.XtextPackageImpl#getCrossReference()
	 * @generated
	 */
	int CROSS_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE__TERMINAL = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cross Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cross Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_REFERENCE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.TerminalRuleImpl <em>Terminal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.TerminalRuleImpl
	 * @see xtext.impl.XtextPackageImpl#getTerminalRule()
	 * @generated
	 */
	int TERMINAL_RULE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE__NAME = ABSTRACT_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE__TYPE = ABSTRACT_RULE__TYPE;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE__ALTERNATIVES = ABSTRACT_RULE__ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE__ANNOTATIONS = ABSTRACT_RULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE__FRAGMENT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_RULE_OPERATION_COUNT = ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AbstractNegatedTokenImpl <em>Abstract Negated Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AbstractNegatedTokenImpl
	 * @see xtext.impl.XtextPackageImpl#getAbstractNegatedToken()
	 * @generated
	 */
	int ABSTRACT_NEGATED_TOKEN = 14;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN__TERMINAL = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Negated Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Negated Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NEGATED_TOKEN_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.NegatedTokenImpl <em>Negated Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.NegatedTokenImpl
	 * @see xtext.impl.XtextPackageImpl#getNegatedToken()
	 * @generated
	 */
	int NEGATED_TOKEN = 15;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN__CARDINALITY = ABSTRACT_NEGATED_TOKEN__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN__PREDICATED = ABSTRACT_NEGATED_TOKEN__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN__FIRST_SET_PREDICATED = ABSTRACT_NEGATED_TOKEN__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN__TERMINAL = ABSTRACT_NEGATED_TOKEN__TERMINAL;

	/**
	 * The number of structural features of the '<em>Negated Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN_FEATURE_COUNT = ABSTRACT_NEGATED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negated Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_TOKEN_OPERATION_COUNT = ABSTRACT_NEGATED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.UntilTokenImpl <em>Until Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.UntilTokenImpl
	 * @see xtext.impl.XtextPackageImpl#getUntilToken()
	 * @generated
	 */
	int UNTIL_TOKEN = 16;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN__CARDINALITY = ABSTRACT_NEGATED_TOKEN__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN__PREDICATED = ABSTRACT_NEGATED_TOKEN__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN__FIRST_SET_PREDICATED = ABSTRACT_NEGATED_TOKEN__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN__TERMINAL = ABSTRACT_NEGATED_TOKEN__TERMINAL;

	/**
	 * The number of structural features of the '<em>Until Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN_FEATURE_COUNT = ABSTRACT_NEGATED_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Until Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTIL_TOKEN_OPERATION_COUNT = ABSTRACT_NEGATED_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.WildcardImpl <em>Wildcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.WildcardImpl
	 * @see xtext.impl.XtextPackageImpl#getWildcard()
	 * @generated
	 */
	int WILDCARD = 17;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The number of structural features of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wildcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILDCARD_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.EnumRuleImpl <em>Enum Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.EnumRuleImpl
	 * @see xtext.impl.XtextPackageImpl#getEnumRule()
	 * @generated
	 */
	int ENUM_RULE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE__NAME = ABSTRACT_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE__TYPE = ABSTRACT_RULE__TYPE;

	/**
	 * The feature id for the '<em><b>Alternatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE__ALTERNATIVES = ABSTRACT_RULE__ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE__ANNOTATIONS = ABSTRACT_RULE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Enum Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_RULE_OPERATION_COUNT = ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.EnumLiteralDeclarationImpl <em>Enum Literal Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.EnumLiteralDeclarationImpl
	 * @see xtext.impl.XtextPackageImpl#getEnumLiteralDeclaration()
	 * @generated
	 */
	int ENUM_LITERAL_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION__ENUM_LITERAL = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION__LITERAL = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Literal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Literal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DECLARATION_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.CompoundElementImpl <em>Compound Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.CompoundElementImpl
	 * @see xtext.impl.XtextPackageImpl#getCompoundElement()
	 * @generated
	 */
	int COMPOUND_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compound Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_ELEMENT_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AlternativesImpl <em>Alternatives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AlternativesImpl
	 * @see xtext.impl.XtextPackageImpl#getAlternatives()
	 * @generated
	 */
	int ALTERNATIVES = 20;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__CARDINALITY = COMPOUND_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__PREDICATED = COMPOUND_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__FIRST_SET_PREDICATED = COMPOUND_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternatives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVES_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.UnorderedGroupImpl <em>Unordered Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.UnorderedGroupImpl
	 * @see xtext.impl.XtextPackageImpl#getUnorderedGroup()
	 * @generated
	 */
	int UNORDERED_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP__CARDINALITY = COMPOUND_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP__PREDICATED = COMPOUND_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP__FIRST_SET_PREDICATED = COMPOUND_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Unordered Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unordered Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_GROUP_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.GroupImpl
	 * @see xtext.impl.XtextPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 22;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CARDINALITY = COMPOUND_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PREDICATED = COMPOUND_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FIRST_SET_PREDICATED = COMPOUND_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = COMPOUND_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GUARD_CONDITION = COMPOUND_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = COMPOUND_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = COMPOUND_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.CharacterRangeImpl <em>Character Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.CharacterRangeImpl
	 * @see xtext.impl.XtextPackageImpl#getCharacterRange()
	 * @generated
	 */
	int CHARACTER_RANGE = 23;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE__LEFT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE__RIGHT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Character Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_RANGE_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.EOFImpl <em>EOF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.EOFImpl
	 * @see xtext.impl.XtextPackageImpl#getEOF()
	 * @generated
	 */
	int EOF = 25;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOF__CARDINALITY = ABSTRACT_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOF__PREDICATED = ABSTRACT_ELEMENT__PREDICATED;

	/**
	 * The feature id for the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOF__FIRST_SET_PREDICATED = ABSTRACT_ELEMENT__FIRST_SET_PREDICATED;

	/**
	 * The number of structural features of the '<em>EOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOF_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOF_OPERATION_COUNT = ABSTRACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ParameterImpl
	 * @see xtext.impl.XtextPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.NamedArgumentImpl <em>Named Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.NamedArgumentImpl
	 * @see xtext.impl.XtextPackageImpl#getNamedArgument()
	 * @generated
	 */
	int NAMED_ARGUMENT = 27;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Called By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT__CALLED_BY_NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ConditionImpl
	 * @see xtext.impl.XtextPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 28;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtext.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.CompositeConditionImpl
	 * @see xtext.impl.XtextPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ConjunctionImpl
	 * @see xtext.impl.XtextPackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 29;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LEFT = COMPOSITE_CONDITION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__RIGHT = COMPOSITE_CONDITION__RIGHT;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = COMPOSITE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_OPERATION_COUNT = COMPOSITE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.NegationImpl
	 * @see xtext.impl.XtextPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.DisjunctionImpl
	 * @see xtext.impl.XtextPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 31;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LEFT = COMPOSITE_CONDITION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__RIGHT = COMPOSITE_CONDITION__RIGHT;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = COMPOSITE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_OPERATION_COUNT = COMPOSITE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.ParameterReferenceImpl
	 * @see xtext.impl.XtextPackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 33;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__PARAMETER = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.LiteralConditionImpl <em>Literal Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.LiteralConditionImpl
	 * @see xtext.impl.XtextPackageImpl#getLiteralCondition()
	 * @generated
	 */
	int LITERAL_CONDITION = 34;

	/**
	 * The feature id for the '<em><b>True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONDITION__TRUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtext.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtext.impl.AnnotationImpl
	 * @see xtext.impl.XtextPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link xtext.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see xtext.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Grammar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xtext.Grammar#getName()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Name();

	/**
	 * Returns the meta object for the reference list '{@link xtext.Grammar#getUsedGrammars <em>Used Grammars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Grammars</em>'.
	 * @see xtext.Grammar#getUsedGrammars()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_UsedGrammars();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Grammar#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defines Hidden Tokens</em>'.
	 * @see xtext.Grammar#isDefinesHiddenTokens()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_DefinesHiddenTokens();

	/**
	 * Returns the meta object for the reference list '{@link xtext.Grammar#getHiddenTokens <em>Hidden Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Tokens</em>'.
	 * @see xtext.Grammar#getHiddenTokens()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_HiddenTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.Grammar#getMetamodelDeclarations <em>Metamodel Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Declarations</em>'.
	 * @see xtext.Grammar#getMetamodelDeclarations()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_MetamodelDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see xtext.Grammar#getRules()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rules();

	/**
	 * Returns the meta object for class '{@link xtext.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Rule</em>'.
	 * @see xtext.AbstractRule
	 * @generated
	 */
	EClass getAbstractRule();

	/**
	 * Returns the meta object for the attribute '{@link xtext.AbstractRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xtext.AbstractRule#getName()
	 * @see #getAbstractRule()
	 * @generated
	 */
	EAttribute getAbstractRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.AbstractRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see xtext.AbstractRule#getType()
	 * @see #getAbstractRule()
	 * @generated
	 */
	EReference getAbstractRule_Type();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.AbstractRule#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternatives</em>'.
	 * @see xtext.AbstractRule#getAlternatives()
	 * @see #getAbstractRule()
	 * @generated
	 */
	EReference getAbstractRule_Alternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.AbstractRule#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see xtext.AbstractRule#getAnnotations()
	 * @see #getAbstractRule()
	 * @generated
	 */
	EReference getAbstractRule_Annotations();

	/**
	 * Returns the meta object for class '{@link xtext.AbstractMetamodelDeclaration <em>Abstract Metamodel Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Metamodel Declaration</em>'.
	 * @see xtext.AbstractMetamodelDeclaration
	 * @generated
	 */
	EClass getAbstractMetamodelDeclaration();

	/**
	 * Returns the meta object for the reference '{@link xtext.AbstractMetamodelDeclaration#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see xtext.AbstractMetamodelDeclaration#getEPackage()
	 * @see #getAbstractMetamodelDeclaration()
	 * @generated
	 */
	EReference getAbstractMetamodelDeclaration_EPackage();

	/**
	 * Returns the meta object for the attribute '{@link xtext.AbstractMetamodelDeclaration#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see xtext.AbstractMetamodelDeclaration#getAlias()
	 * @see #getAbstractMetamodelDeclaration()
	 * @generated
	 */
	EAttribute getAbstractMetamodelDeclaration_Alias();

	/**
	 * Returns the meta object for class '{@link xtext.GeneratedMetamodel <em>Generated Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Metamodel</em>'.
	 * @see xtext.GeneratedMetamodel
	 * @generated
	 */
	EClass getGeneratedMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link xtext.GeneratedMetamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xtext.GeneratedMetamodel#getName()
	 * @see #getGeneratedMetamodel()
	 * @generated
	 */
	EAttribute getGeneratedMetamodel_Name();

	/**
	 * Returns the meta object for class '{@link xtext.ReferencedMetamodel <em>Referenced Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Metamodel</em>'.
	 * @see xtext.ReferencedMetamodel
	 * @generated
	 */
	EClass getReferencedMetamodel();

	/**
	 * Returns the meta object for class '{@link xtext.ParserRule <em>Parser Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Rule</em>'.
	 * @see xtext.ParserRule
	 * @generated
	 */
	EClass getParserRule();

	/**
	 * Returns the meta object for the attribute '{@link xtext.ParserRule#isDefinesHiddenTokens <em>Defines Hidden Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defines Hidden Tokens</em>'.
	 * @see xtext.ParserRule#isDefinesHiddenTokens()
	 * @see #getParserRule()
	 * @generated
	 */
	EAttribute getParserRule_DefinesHiddenTokens();

	/**
	 * Returns the meta object for the reference list '{@link xtext.ParserRule#getHiddenTokens <em>Hidden Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hidden Tokens</em>'.
	 * @see xtext.ParserRule#getHiddenTokens()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_HiddenTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.ParserRule#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see xtext.ParserRule#getParameters()
	 * @see #getParserRule()
	 * @generated
	 */
	EReference getParserRule_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link xtext.ParserRule#isFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see xtext.ParserRule#isFragment()
	 * @see #getParserRule()
	 * @generated
	 */
	EAttribute getParserRule_Fragment();

	/**
	 * Returns the meta object for the attribute '{@link xtext.ParserRule#isWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see xtext.ParserRule#isWildcard()
	 * @see #getParserRule()
	 * @generated
	 */
	EAttribute getParserRule_Wildcard();

	/**
	 * Returns the meta object for class '{@link xtext.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see xtext.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for the reference '{@link xtext.TypeRef#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see xtext.TypeRef#getMetamodel()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Metamodel();

	/**
	 * Returns the meta object for the reference '{@link xtext.TypeRef#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see xtext.TypeRef#getClassifier()
	 * @see #getTypeRef()
	 * @generated
	 */
	EReference getTypeRef_Classifier();

	/**
	 * Returns the meta object for class '{@link xtext.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see xtext.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for the attribute '{@link xtext.AbstractElement#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see xtext.AbstractElement#getCardinality()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link xtext.AbstractElement#isPredicated <em>Predicated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicated</em>'.
	 * @see xtext.AbstractElement#isPredicated()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Predicated();

	/**
	 * Returns the meta object for the attribute '{@link xtext.AbstractElement#isFirstSetPredicated <em>First Set Predicated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Set Predicated</em>'.
	 * @see xtext.AbstractElement#isFirstSetPredicated()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_FirstSetPredicated();

	/**
	 * Returns the meta object for class '{@link xtext.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see xtext.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see xtext.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Action#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see xtext.Action#getFeature()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Feature();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Action#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see xtext.Action#getOperator()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Operator();

	/**
	 * Returns the meta object for class '{@link xtext.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see xtext.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Keyword#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xtext.Keyword#getValue()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Value();

	/**
	 * Returns the meta object for class '{@link xtext.RuleCall <em>Rule Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Call</em>'.
	 * @see xtext.RuleCall
	 * @generated
	 */
	EClass getRuleCall();

	/**
	 * Returns the meta object for the reference '{@link xtext.RuleCall#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see xtext.RuleCall#getRule()
	 * @see #getRuleCall()
	 * @generated
	 */
	EReference getRuleCall_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.RuleCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see xtext.RuleCall#getArguments()
	 * @see #getRuleCall()
	 * @generated
	 */
	EReference getRuleCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link xtext.RuleCall#isExplicitlyCalled <em>Explicitly Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicitly Called</em>'.
	 * @see xtext.RuleCall#isExplicitlyCalled()
	 * @see #getRuleCall()
	 * @generated
	 */
	EAttribute getRuleCall_ExplicitlyCalled();

	/**
	 * Returns the meta object for class '{@link xtext.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see xtext.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Assignment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see xtext.Assignment#getFeature()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Feature();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Assignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see xtext.Assignment#getOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.Assignment#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminal</em>'.
	 * @see xtext.Assignment#getTerminal()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Terminal();

	/**
	 * Returns the meta object for class '{@link xtext.CrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Reference</em>'.
	 * @see xtext.CrossReference
	 * @generated
	 */
	EClass getCrossReference();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CrossReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see xtext.CrossReference#getType()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Type();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CrossReference#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminal</em>'.
	 * @see xtext.CrossReference#getTerminal()
	 * @see #getCrossReference()
	 * @generated
	 */
	EReference getCrossReference_Terminal();

	/**
	 * Returns the meta object for class '{@link xtext.TerminalRule <em>Terminal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Rule</em>'.
	 * @see xtext.TerminalRule
	 * @generated
	 */
	EClass getTerminalRule();

	/**
	 * Returns the meta object for the attribute '{@link xtext.TerminalRule#isFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see xtext.TerminalRule#isFragment()
	 * @see #getTerminalRule()
	 * @generated
	 */
	EAttribute getTerminalRule_Fragment();

	/**
	 * Returns the meta object for class '{@link xtext.AbstractNegatedToken <em>Abstract Negated Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Negated Token</em>'.
	 * @see xtext.AbstractNegatedToken
	 * @generated
	 */
	EClass getAbstractNegatedToken();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.AbstractNegatedToken#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminal</em>'.
	 * @see xtext.AbstractNegatedToken#getTerminal()
	 * @see #getAbstractNegatedToken()
	 * @generated
	 */
	EReference getAbstractNegatedToken_Terminal();

	/**
	 * Returns the meta object for class '{@link xtext.NegatedToken <em>Negated Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Token</em>'.
	 * @see xtext.NegatedToken
	 * @generated
	 */
	EClass getNegatedToken();

	/**
	 * Returns the meta object for class '{@link xtext.UntilToken <em>Until Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Until Token</em>'.
	 * @see xtext.UntilToken
	 * @generated
	 */
	EClass getUntilToken();

	/**
	 * Returns the meta object for class '{@link xtext.Wildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wildcard</em>'.
	 * @see xtext.Wildcard
	 * @generated
	 */
	EClass getWildcard();

	/**
	 * Returns the meta object for class '{@link xtext.EnumRule <em>Enum Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Rule</em>'.
	 * @see xtext.EnumRule
	 * @generated
	 */
	EClass getEnumRule();

	/**
	 * Returns the meta object for class '{@link xtext.EnumLiteralDeclaration <em>Enum Literal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Declaration</em>'.
	 * @see xtext.EnumLiteralDeclaration
	 * @generated
	 */
	EClass getEnumLiteralDeclaration();

	/**
	 * Returns the meta object for the reference '{@link xtext.EnumLiteralDeclaration#getEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Literal</em>'.
	 * @see xtext.EnumLiteralDeclaration#getEnumLiteral()
	 * @see #getEnumLiteralDeclaration()
	 * @generated
	 */
	EReference getEnumLiteralDeclaration_EnumLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.EnumLiteralDeclaration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see xtext.EnumLiteralDeclaration#getLiteral()
	 * @see #getEnumLiteralDeclaration()
	 * @generated
	 */
	EReference getEnumLiteralDeclaration_Literal();

	/**
	 * Returns the meta object for class '{@link xtext.Alternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternatives</em>'.
	 * @see xtext.Alternatives
	 * @generated
	 */
	EClass getAlternatives();

	/**
	 * Returns the meta object for class '{@link xtext.UnorderedGroup <em>Unordered Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered Group</em>'.
	 * @see xtext.UnorderedGroup
	 * @generated
	 */
	EClass getUnorderedGroup();

	/**
	 * Returns the meta object for class '{@link xtext.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see xtext.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.Group#getGuardCondition <em>Guard Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Condition</em>'.
	 * @see xtext.Group#getGuardCondition()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_GuardCondition();

	/**
	 * Returns the meta object for class '{@link xtext.CharacterRange <em>Character Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Range</em>'.
	 * @see xtext.CharacterRange
	 * @generated
	 */
	EClass getCharacterRange();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CharacterRange#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see xtext.CharacterRange#getLeft()
	 * @see #getCharacterRange()
	 * @generated
	 */
	EReference getCharacterRange_Left();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CharacterRange#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see xtext.CharacterRange#getRight()
	 * @see #getCharacterRange()
	 * @generated
	 */
	EReference getCharacterRange_Right();

	/**
	 * Returns the meta object for class '{@link xtext.CompoundElement <em>Compound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Element</em>'.
	 * @see xtext.CompoundElement
	 * @generated
	 */
	EClass getCompoundElement();

	/**
	 * Returns the meta object for the containment reference list '{@link xtext.CompoundElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see xtext.CompoundElement#getElements()
	 * @see #getCompoundElement()
	 * @generated
	 */
	EReference getCompoundElement_Elements();

	/**
	 * Returns the meta object for class '{@link xtext.EOF <em>EOF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOF</em>'.
	 * @see xtext.EOF
	 * @generated
	 */
	EClass getEOF();

	/**
	 * Returns the meta object for class '{@link xtext.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see xtext.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xtext.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link xtext.NamedArgument <em>Named Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Argument</em>'.
	 * @see xtext.NamedArgument
	 * @generated
	 */
	EClass getNamedArgument();

	/**
	 * Returns the meta object for the reference '{@link xtext.NamedArgument#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see xtext.NamedArgument#getParameter()
	 * @see #getNamedArgument()
	 * @generated
	 */
	EReference getNamedArgument_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.NamedArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xtext.NamedArgument#getValue()
	 * @see #getNamedArgument()
	 * @generated
	 */
	EReference getNamedArgument_Value();

	/**
	 * Returns the meta object for the attribute '{@link xtext.NamedArgument#isCalledByName <em>Called By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Called By Name</em>'.
	 * @see xtext.NamedArgument#isCalledByName()
	 * @see #getNamedArgument()
	 * @generated
	 */
	EAttribute getNamedArgument_CalledByName();

	/**
	 * Returns the meta object for class '{@link xtext.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see xtext.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link xtext.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see xtext.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for class '{@link xtext.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see xtext.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.Negation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xtext.Negation#getValue()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Value();

	/**
	 * Returns the meta object for class '{@link xtext.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see xtext.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for class '{@link xtext.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see xtext.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CompositeCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see xtext.CompositeCondition#getLeft()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Left();

	/**
	 * Returns the meta object for the containment reference '{@link xtext.CompositeCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see xtext.CompositeCondition#getRight()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Right();

	/**
	 * Returns the meta object for class '{@link xtext.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see xtext.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for the reference '{@link xtext.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see xtext.ParameterReference#getParameter()
	 * @see #getParameterReference()
	 * @generated
	 */
	EReference getParameterReference_Parameter();

	/**
	 * Returns the meta object for class '{@link xtext.LiteralCondition <em>Literal Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Condition</em>'.
	 * @see xtext.LiteralCondition
	 * @generated
	 */
	EClass getLiteralCondition();

	/**
	 * Returns the meta object for the attribute '{@link xtext.LiteralCondition#isTrue <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True</em>'.
	 * @see xtext.LiteralCondition#isTrue()
	 * @see #getLiteralCondition()
	 * @generated
	 */
	EAttribute getLiteralCondition_True();

	/**
	 * Returns the meta object for class '{@link xtext.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see xtext.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link xtext.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xtext.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XtextFactory getXtextFactory();

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
		 * The meta object literal for the '{@link xtext.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.GrammarImpl
		 * @see xtext.impl.XtextPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__NAME = eINSTANCE.getGrammar_Name();

		/**
		 * The meta object literal for the '<em><b>Used Grammars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__USED_GRAMMARS = eINSTANCE.getGrammar_UsedGrammars();

		/**
		 * The meta object literal for the '<em><b>Defines Hidden Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__DEFINES_HIDDEN_TOKENS = eINSTANCE.getGrammar_DefinesHiddenTokens();

		/**
		 * The meta object literal for the '<em><b>Hidden Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__HIDDEN_TOKENS = eINSTANCE.getGrammar_HiddenTokens();

		/**
		 * The meta object literal for the '<em><b>Metamodel Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__METAMODEL_DECLARATIONS = eINSTANCE.getGrammar_MetamodelDeclarations();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULES = eINSTANCE.getGrammar_Rules();

		/**
		 * The meta object literal for the '{@link xtext.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AbstractRuleImpl
		 * @see xtext.impl.XtextPackageImpl#getAbstractRule()
		 * @generated
		 */
		EClass ABSTRACT_RULE = eINSTANCE.getAbstractRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RULE__NAME = eINSTANCE.getAbstractRule_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RULE__TYPE = eINSTANCE.getAbstractRule_Type();

		/**
		 * The meta object literal for the '<em><b>Alternatives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RULE__ALTERNATIVES = eINSTANCE.getAbstractRule_Alternatives();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RULE__ANNOTATIONS = eINSTANCE.getAbstractRule_Annotations();

		/**
		 * The meta object literal for the '{@link xtext.impl.AbstractMetamodelDeclarationImpl <em>Abstract Metamodel Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AbstractMetamodelDeclarationImpl
		 * @see xtext.impl.XtextPackageImpl#getAbstractMetamodelDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_METAMODEL_DECLARATION = eINSTANCE.getAbstractMetamodelDeclaration();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_METAMODEL_DECLARATION__EPACKAGE = eINSTANCE.getAbstractMetamodelDeclaration_EPackage();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_METAMODEL_DECLARATION__ALIAS = eINSTANCE.getAbstractMetamodelDeclaration_Alias();

		/**
		 * The meta object literal for the '{@link xtext.impl.GeneratedMetamodelImpl <em>Generated Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.GeneratedMetamodelImpl
		 * @see xtext.impl.XtextPackageImpl#getGeneratedMetamodel()
		 * @generated
		 */
		EClass GENERATED_METAMODEL = eINSTANCE.getGeneratedMetamodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATED_METAMODEL__NAME = eINSTANCE.getGeneratedMetamodel_Name();

		/**
		 * The meta object literal for the '{@link xtext.impl.ReferencedMetamodelImpl <em>Referenced Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ReferencedMetamodelImpl
		 * @see xtext.impl.XtextPackageImpl#getReferencedMetamodel()
		 * @generated
		 */
		EClass REFERENCED_METAMODEL = eINSTANCE.getReferencedMetamodel();

		/**
		 * The meta object literal for the '{@link xtext.impl.ParserRuleImpl <em>Parser Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ParserRuleImpl
		 * @see xtext.impl.XtextPackageImpl#getParserRule()
		 * @generated
		 */
		EClass PARSER_RULE = eINSTANCE.getParserRule();

		/**
		 * The meta object literal for the '<em><b>Defines Hidden Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_RULE__DEFINES_HIDDEN_TOKENS = eINSTANCE.getParserRule_DefinesHiddenTokens();

		/**
		 * The meta object literal for the '<em><b>Hidden Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__HIDDEN_TOKENS = eINSTANCE.getParserRule_HiddenTokens();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSER_RULE__PARAMETERS = eINSTANCE.getParserRule_Parameters();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_RULE__FRAGMENT = eINSTANCE.getParserRule_Fragment();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSER_RULE__WILDCARD = eINSTANCE.getParserRule_Wildcard();

		/**
		 * The meta object literal for the '{@link xtext.impl.TypeRefImpl <em>Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.TypeRefImpl
		 * @see xtext.impl.XtextPackageImpl#getTypeRef()
		 * @generated
		 */
		EClass TYPE_REF = eINSTANCE.getTypeRef();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__METAMODEL = eINSTANCE.getTypeRef_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF__CLASSIFIER = eINSTANCE.getTypeRef_Classifier();

		/**
		 * The meta object literal for the '{@link xtext.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AbstractElementImpl
		 * @see xtext.impl.XtextPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__CARDINALITY = eINSTANCE.getAbstractElement_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Predicated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__PREDICATED = eINSTANCE.getAbstractElement_Predicated();

		/**
		 * The meta object literal for the '<em><b>First Set Predicated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__FIRST_SET_PREDICATED = eINSTANCE.getAbstractElement_FirstSetPredicated();

		/**
		 * The meta object literal for the '{@link xtext.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ActionImpl
		 * @see xtext.impl.XtextPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FEATURE = eINSTANCE.getAction_Feature();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__OPERATOR = eINSTANCE.getAction_Operator();

		/**
		 * The meta object literal for the '{@link xtext.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.KeywordImpl
		 * @see xtext.impl.XtextPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__VALUE = eINSTANCE.getKeyword_Value();

		/**
		 * The meta object literal for the '{@link xtext.impl.RuleCallImpl <em>Rule Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.RuleCallImpl
		 * @see xtext.impl.XtextPackageImpl#getRuleCall()
		 * @generated
		 */
		EClass RULE_CALL = eINSTANCE.getRuleCall();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CALL__RULE = eINSTANCE.getRuleCall_Rule();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CALL__ARGUMENTS = eINSTANCE.getRuleCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Explicitly Called</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_CALL__EXPLICITLY_CALLED = eINSTANCE.getRuleCall_ExplicitlyCalled();

		/**
		 * The meta object literal for the '{@link xtext.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AssignmentImpl
		 * @see xtext.impl.XtextPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TERMINAL = eINSTANCE.getAssignment_Terminal();

		/**
		 * The meta object literal for the '{@link xtext.impl.CrossReferenceImpl <em>Cross Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.CrossReferenceImpl
		 * @see xtext.impl.XtextPackageImpl#getCrossReference()
		 * @generated
		 */
		EClass CROSS_REFERENCE = eINSTANCE.getCrossReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_REFERENCE__TYPE = eINSTANCE.getCrossReference_Type();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_REFERENCE__TERMINAL = eINSTANCE.getCrossReference_Terminal();

		/**
		 * The meta object literal for the '{@link xtext.impl.TerminalRuleImpl <em>Terminal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.TerminalRuleImpl
		 * @see xtext.impl.XtextPackageImpl#getTerminalRule()
		 * @generated
		 */
		EClass TERMINAL_RULE = eINSTANCE.getTerminalRule();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_RULE__FRAGMENT = eINSTANCE.getTerminalRule_Fragment();

		/**
		 * The meta object literal for the '{@link xtext.impl.AbstractNegatedTokenImpl <em>Abstract Negated Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AbstractNegatedTokenImpl
		 * @see xtext.impl.XtextPackageImpl#getAbstractNegatedToken()
		 * @generated
		 */
		EClass ABSTRACT_NEGATED_TOKEN = eINSTANCE.getAbstractNegatedToken();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NEGATED_TOKEN__TERMINAL = eINSTANCE.getAbstractNegatedToken_Terminal();

		/**
		 * The meta object literal for the '{@link xtext.impl.NegatedTokenImpl <em>Negated Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.NegatedTokenImpl
		 * @see xtext.impl.XtextPackageImpl#getNegatedToken()
		 * @generated
		 */
		EClass NEGATED_TOKEN = eINSTANCE.getNegatedToken();

		/**
		 * The meta object literal for the '{@link xtext.impl.UntilTokenImpl <em>Until Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.UntilTokenImpl
		 * @see xtext.impl.XtextPackageImpl#getUntilToken()
		 * @generated
		 */
		EClass UNTIL_TOKEN = eINSTANCE.getUntilToken();

		/**
		 * The meta object literal for the '{@link xtext.impl.WildcardImpl <em>Wildcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.WildcardImpl
		 * @see xtext.impl.XtextPackageImpl#getWildcard()
		 * @generated
		 */
		EClass WILDCARD = eINSTANCE.getWildcard();

		/**
		 * The meta object literal for the '{@link xtext.impl.EnumRuleImpl <em>Enum Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.EnumRuleImpl
		 * @see xtext.impl.XtextPackageImpl#getEnumRule()
		 * @generated
		 */
		EClass ENUM_RULE = eINSTANCE.getEnumRule();

		/**
		 * The meta object literal for the '{@link xtext.impl.EnumLiteralDeclarationImpl <em>Enum Literal Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.EnumLiteralDeclarationImpl
		 * @see xtext.impl.XtextPackageImpl#getEnumLiteralDeclaration()
		 * @generated
		 */
		EClass ENUM_LITERAL_DECLARATION = eINSTANCE.getEnumLiteralDeclaration();

		/**
		 * The meta object literal for the '<em><b>Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_DECLARATION__ENUM_LITERAL = eINSTANCE.getEnumLiteralDeclaration_EnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_DECLARATION__LITERAL = eINSTANCE.getEnumLiteralDeclaration_Literal();

		/**
		 * The meta object literal for the '{@link xtext.impl.AlternativesImpl <em>Alternatives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AlternativesImpl
		 * @see xtext.impl.XtextPackageImpl#getAlternatives()
		 * @generated
		 */
		EClass ALTERNATIVES = eINSTANCE.getAlternatives();

		/**
		 * The meta object literal for the '{@link xtext.impl.UnorderedGroupImpl <em>Unordered Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.UnorderedGroupImpl
		 * @see xtext.impl.XtextPackageImpl#getUnorderedGroup()
		 * @generated
		 */
		EClass UNORDERED_GROUP = eINSTANCE.getUnorderedGroup();

		/**
		 * The meta object literal for the '{@link xtext.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.GroupImpl
		 * @see xtext.impl.XtextPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Guard Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GUARD_CONDITION = eINSTANCE.getGroup_GuardCondition();

		/**
		 * The meta object literal for the '{@link xtext.impl.CharacterRangeImpl <em>Character Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.CharacterRangeImpl
		 * @see xtext.impl.XtextPackageImpl#getCharacterRange()
		 * @generated
		 */
		EClass CHARACTER_RANGE = eINSTANCE.getCharacterRange();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_RANGE__LEFT = eINSTANCE.getCharacterRange_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER_RANGE__RIGHT = eINSTANCE.getCharacterRange_Right();

		/**
		 * The meta object literal for the '{@link xtext.impl.CompoundElementImpl <em>Compound Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.CompoundElementImpl
		 * @see xtext.impl.XtextPackageImpl#getCompoundElement()
		 * @generated
		 */
		EClass COMPOUND_ELEMENT = eINSTANCE.getCompoundElement();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_ELEMENT__ELEMENTS = eINSTANCE.getCompoundElement_Elements();

		/**
		 * The meta object literal for the '{@link xtext.impl.EOFImpl <em>EOF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.EOFImpl
		 * @see xtext.impl.XtextPackageImpl#getEOF()
		 * @generated
		 */
		EClass EOF = eINSTANCE.getEOF();

		/**
		 * The meta object literal for the '{@link xtext.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ParameterImpl
		 * @see xtext.impl.XtextPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link xtext.impl.NamedArgumentImpl <em>Named Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.NamedArgumentImpl
		 * @see xtext.impl.XtextPackageImpl#getNamedArgument()
		 * @generated
		 */
		EClass NAMED_ARGUMENT = eINSTANCE.getNamedArgument();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ARGUMENT__PARAMETER = eINSTANCE.getNamedArgument_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ARGUMENT__VALUE = eINSTANCE.getNamedArgument_Value();

		/**
		 * The meta object literal for the '<em><b>Called By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ARGUMENT__CALLED_BY_NAME = eINSTANCE.getNamedArgument_CalledByName();

		/**
		 * The meta object literal for the '{@link xtext.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ConditionImpl
		 * @see xtext.impl.XtextPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link xtext.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ConjunctionImpl
		 * @see xtext.impl.XtextPackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '{@link xtext.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.NegationImpl
		 * @see xtext.impl.XtextPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__VALUE = eINSTANCE.getNegation_Value();

		/**
		 * The meta object literal for the '{@link xtext.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.DisjunctionImpl
		 * @see xtext.impl.XtextPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '{@link xtext.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.CompositeConditionImpl
		 * @see xtext.impl.XtextPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__LEFT = eINSTANCE.getCompositeCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__RIGHT = eINSTANCE.getCompositeCondition_Right();

		/**
		 * The meta object literal for the '{@link xtext.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.ParameterReferenceImpl
		 * @see xtext.impl.XtextPackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

		/**
		 * The meta object literal for the '{@link xtext.impl.LiteralConditionImpl <em>Literal Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.LiteralConditionImpl
		 * @see xtext.impl.XtextPackageImpl#getLiteralCondition()
		 * @generated
		 */
		EClass LITERAL_CONDITION = eINSTANCE.getLiteralCondition();

		/**
		 * The meta object literal for the '<em><b>True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_CONDITION__TRUE = eINSTANCE.getLiteralCondition_True();

		/**
		 * The meta object literal for the '{@link xtext.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtext.impl.AnnotationImpl
		 * @see xtext.impl.XtextPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

	}

} //XtextPackage
