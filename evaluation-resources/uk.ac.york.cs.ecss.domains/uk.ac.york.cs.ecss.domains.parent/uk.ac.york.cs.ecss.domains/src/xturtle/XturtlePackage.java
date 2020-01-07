/**
 */
package xturtle;

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
 * @see xturtle.XturtleFactory
 * @model kind="package"
 * @generated
 */
public interface XturtlePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xturtle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.de.srclang/itemis/tooling/xturtle/Xturtle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xturtle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XturtlePackage eINSTANCE = xturtle.impl.XturtlePackageImpl.init();

	/**
	 * The meta object id for the '{@link xturtle.impl.DirectiveBlockImpl <em>Directive Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.DirectiveBlockImpl
	 * @see xturtle.impl.XturtlePackageImpl#getDirectiveBlock()
	 * @generated
	 */
	int DIRECTIVE_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_BLOCK__DIRECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Triples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_BLOCK__TRIPLES = 1;

	/**
	 * The feature id for the '<em><b>Directiveblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_BLOCK__DIRECTIVEBLOCK = 2;

	/**
	 * The number of structural features of the '<em>Directive Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Directive Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.DirectivesImpl <em>Directives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.DirectivesImpl
	 * @see xturtle.impl.XturtlePackageImpl#getDirectives()
	 * @generated
	 */
	int DIRECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Directive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVES__DIRECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Directives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Directives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.DirectiveImpl <em>Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.DirectiveImpl
	 * @see xturtle.impl.XturtlePackageImpl#getDirective()
	 * @generated
	 */
	int DIRECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__URI = 0;

	/**
	 * The number of structural features of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.PrefixIdImpl <em>Prefix Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.PrefixIdImpl
	 * @see xturtle.impl.XturtlePackageImpl#getPrefixId()
	 * @generated
	 */
	int PREFIX_ID = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ID__URI = DIRECTIVE__URI;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ID__ID = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prefix Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ID_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prefix Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_ID_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.BaseImpl
	 * @see xturtle.impl.XturtlePackageImpl#getBase()
	 * @generated
	 */
	int BASE = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__URI = DIRECTIVE__URI;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.TriplesImpl <em>Triples</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.TriplesImpl
	 * @see xturtle.impl.XturtlePackageImpl#getTriples()
	 * @generated
	 */
	int TRIPLES = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Pred Objs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES__PRED_OBJS = 1;

	/**
	 * The number of structural features of the '<em>Triples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Triples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.PredicateObjectListImpl <em>Predicate Object List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.PredicateObjectListImpl
	 * @see xturtle.impl.XturtlePackageImpl#getPredicateObjectList()
	 * @generated
	 */
	int PREDICATE_OBJECT_LIST = 6;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_LIST__VERB = 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_LIST__OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>Predicate Object List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Predicate Object List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OBJECT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.SubjectImpl
	 * @see xturtle.impl.XturtlePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 7;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.ObjectImpl
	 * @see xturtle.impl.XturtlePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 8;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.PredicateImpl
	 * @see xturtle.impl.XturtlePackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 9;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.ResourceImpl
	 * @see xturtle.impl.XturtlePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 10;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.ResourceRefImpl
	 * @see xturtle.impl.XturtlePackageImpl#getResourceRef()
	 * @generated
	 */
	int RESOURCE_REF = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__REF = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.BlankImpl <em>Blank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.BlankImpl
	 * @see xturtle.impl.XturtlePackageImpl#getBlank()
	 * @generated
	 */
	int BLANK = 12;

	/**
	 * The number of structural features of the '<em>Blank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_OPERATION_COUNT = SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.BlankObjectsImpl <em>Blank Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.BlankObjectsImpl
	 * @see xturtle.impl.XturtlePackageImpl#getBlankObjects()
	 * @generated
	 */
	int BLANK_OBJECTS = 13;

	/**
	 * The feature id for the '<em><b>Pred Objs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_OBJECTS__PRED_OBJS = BLANK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blank Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_OBJECTS_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blank Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_OBJECTS_OPERATION_COUNT = BLANK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.BlankCollectionImpl <em>Blank Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.BlankCollectionImpl
	 * @see xturtle.impl.XturtlePackageImpl#getBlankCollection()
	 * @generated
	 */
	int BLANK_COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_COLLECTION__OBJECTS = BLANK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blank Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_COLLECTION_FEATURE_COUNT = BLANK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blank Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_COLLECTION_OPERATION_COUNT = BLANK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.QNameDefImpl <em>QName Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.QNameDefImpl
	 * @see xturtle.impl.XturtlePackageImpl#getQNameDef()
	 * @generated
	 */
	int QNAME_DEF = 15;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_DEF__PREFIX = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_DEF__ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QName Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_DEF_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QName Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_DEF_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.QNameRefImpl <em>QName Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.QNameRefImpl
	 * @see xturtle.impl.XturtlePackageImpl#getQNameRef()
	 * @generated
	 */
	int QNAME_REF = 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_REF__REF = RESOURCE_REF__REF;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_REF__PREFIX = RESOURCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QName Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_REF_FEATURE_COUNT = RESOURCE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QName Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QNAME_REF_OPERATION_COUNT = RESOURCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.UriDefImpl <em>Uri Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.UriDefImpl
	 * @see xturtle.impl.XturtlePackageImpl#getUriDef()
	 * @generated
	 */
	int URI_DEF = 17;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DEF__URI = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DEF_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_DEF_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.UriRefImpl <em>Uri Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.UriRefImpl
	 * @see xturtle.impl.XturtlePackageImpl#getUriRef()
	 * @generated
	 */
	int URI_REF = 18;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_REF__REF = RESOURCE_REF__REF;

	/**
	 * The number of structural features of the '<em>Uri Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_REF_FEATURE_COUNT = RESOURCE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uri Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_REF_OPERATION_COUNT = RESOURCE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.LiteralImpl
	 * @see xturtle.impl.XturtlePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.NumberLiteralImpl
	 * @see xturtle.impl.XturtlePackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.StringLiteralImpl
	 * @see xturtle.impl.XturtlePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__TYPE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__LANGUAGE = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.BooleanLiteralImpl
	 * @see xturtle.impl.XturtlePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xturtle.impl.TypePredicateImpl <em>Type Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xturtle.impl.TypePredicateImpl
	 * @see xturtle.impl.XturtlePackageImpl#getTypePredicate()
	 * @generated
	 */
	int TYPE_PREDICATE = 23;

	/**
	 * The number of structural features of the '<em>Type Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xturtle.DirectiveBlock <em>Directive Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive Block</em>'.
	 * @see xturtle.DirectiveBlock
	 * @generated
	 */
	EClass getDirectiveBlock();

	/**
	 * Returns the meta object for the containment reference '{@link xturtle.DirectiveBlock#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directives</em>'.
	 * @see xturtle.DirectiveBlock#getDirectives()
	 * @see #getDirectiveBlock()
	 * @generated
	 */
	EReference getDirectiveBlock_Directives();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.DirectiveBlock#getTriples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triples</em>'.
	 * @see xturtle.DirectiveBlock#getTriples()
	 * @see #getDirectiveBlock()
	 * @generated
	 */
	EReference getDirectiveBlock_Triples();

	/**
	 * Returns the meta object for the containment reference '{@link xturtle.DirectiveBlock#getDirectiveblock <em>Directiveblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directiveblock</em>'.
	 * @see xturtle.DirectiveBlock#getDirectiveblock()
	 * @see #getDirectiveBlock()
	 * @generated
	 */
	EReference getDirectiveBlock_Directiveblock();

	/**
	 * Returns the meta object for class '{@link xturtle.Directives <em>Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directives</em>'.
	 * @see xturtle.Directives
	 * @generated
	 */
	EClass getDirectives();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.Directives#getDirective <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directive</em>'.
	 * @see xturtle.Directives#getDirective()
	 * @see #getDirectives()
	 * @generated
	 */
	EReference getDirectives_Directive();

	/**
	 * Returns the meta object for class '{@link xturtle.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive</em>'.
	 * @see xturtle.Directive
	 * @generated
	 */
	EClass getDirective();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.Directive#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see xturtle.Directive#getUri()
	 * @see #getDirective()
	 * @generated
	 */
	EAttribute getDirective_Uri();

	/**
	 * Returns the meta object for class '{@link xturtle.PrefixId <em>Prefix Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Id</em>'.
	 * @see xturtle.PrefixId
	 * @generated
	 */
	EClass getPrefixId();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.PrefixId#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xturtle.PrefixId#getId()
	 * @see #getPrefixId()
	 * @generated
	 */
	EAttribute getPrefixId_Id();

	/**
	 * Returns the meta object for class '{@link xturtle.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see xturtle.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link xturtle.Triples <em>Triples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triples</em>'.
	 * @see xturtle.Triples
	 * @generated
	 */
	EClass getTriples();

	/**
	 * Returns the meta object for the containment reference '{@link xturtle.Triples#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see xturtle.Triples#getSubject()
	 * @see #getTriples()
	 * @generated
	 */
	EReference getTriples_Subject();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.Triples#getPredObjs <em>Pred Objs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pred Objs</em>'.
	 * @see xturtle.Triples#getPredObjs()
	 * @see #getTriples()
	 * @generated
	 */
	EReference getTriples_PredObjs();

	/**
	 * Returns the meta object for class '{@link xturtle.PredicateObjectList <em>Predicate Object List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Object List</em>'.
	 * @see xturtle.PredicateObjectList
	 * @generated
	 */
	EClass getPredicateObjectList();

	/**
	 * Returns the meta object for the containment reference '{@link xturtle.PredicateObjectList#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verb</em>'.
	 * @see xturtle.PredicateObjectList#getVerb()
	 * @see #getPredicateObjectList()
	 * @generated
	 */
	EReference getPredicateObjectList_Verb();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.PredicateObjectList#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see xturtle.PredicateObjectList#getObjects()
	 * @see #getPredicateObjectList()
	 * @generated
	 */
	EReference getPredicateObjectList_Objects();

	/**
	 * Returns the meta object for class '{@link xturtle.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see xturtle.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for class '{@link xturtle.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see xturtle.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link xturtle.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see xturtle.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link xturtle.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see xturtle.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link xturtle.ResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref</em>'.
	 * @see xturtle.ResourceRef
	 * @generated
	 */
	EClass getResourceRef();

	/**
	 * Returns the meta object for the reference '{@link xturtle.ResourceRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see xturtle.ResourceRef#getRef()
	 * @see #getResourceRef()
	 * @generated
	 */
	EReference getResourceRef_Ref();

	/**
	 * Returns the meta object for class '{@link xturtle.Blank <em>Blank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank</em>'.
	 * @see xturtle.Blank
	 * @generated
	 */
	EClass getBlank();

	/**
	 * Returns the meta object for class '{@link xturtle.BlankObjects <em>Blank Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Objects</em>'.
	 * @see xturtle.BlankObjects
	 * @generated
	 */
	EClass getBlankObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.BlankObjects#getPredObjs <em>Pred Objs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pred Objs</em>'.
	 * @see xturtle.BlankObjects#getPredObjs()
	 * @see #getBlankObjects()
	 * @generated
	 */
	EReference getBlankObjects_PredObjs();

	/**
	 * Returns the meta object for class '{@link xturtle.BlankCollection <em>Blank Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Collection</em>'.
	 * @see xturtle.BlankCollection
	 * @generated
	 */
	EClass getBlankCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link xturtle.BlankCollection#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see xturtle.BlankCollection#getObjects()
	 * @see #getBlankCollection()
	 * @generated
	 */
	EReference getBlankCollection_Objects();

	/**
	 * Returns the meta object for class '{@link xturtle.QNameDef <em>QName Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QName Def</em>'.
	 * @see xturtle.QNameDef
	 * @generated
	 */
	EClass getQNameDef();

	/**
	 * Returns the meta object for the reference '{@link xturtle.QNameDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see xturtle.QNameDef#getPrefix()
	 * @see #getQNameDef()
	 * @generated
	 */
	EReference getQNameDef_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.QNameDef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xturtle.QNameDef#getId()
	 * @see #getQNameDef()
	 * @generated
	 */
	EAttribute getQNameDef_Id();

	/**
	 * Returns the meta object for class '{@link xturtle.QNameRef <em>QName Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QName Ref</em>'.
	 * @see xturtle.QNameRef
	 * @generated
	 */
	EClass getQNameRef();

	/**
	 * Returns the meta object for the reference '{@link xturtle.QNameRef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see xturtle.QNameRef#getPrefix()
	 * @see #getQNameRef()
	 * @generated
	 */
	EReference getQNameRef_Prefix();

	/**
	 * Returns the meta object for class '{@link xturtle.UriDef <em>Uri Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Def</em>'.
	 * @see xturtle.UriDef
	 * @generated
	 */
	EClass getUriDef();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.UriDef#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see xturtle.UriDef#getUri()
	 * @see #getUriDef()
	 * @generated
	 */
	EAttribute getUriDef_Uri();

	/**
	 * Returns the meta object for class '{@link xturtle.UriRef <em>Uri Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Ref</em>'.
	 * @see xturtle.UriRef
	 * @generated
	 */
	EClass getUriRef();

	/**
	 * Returns the meta object for class '{@link xturtle.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see xturtle.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xturtle.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link xturtle.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see xturtle.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for class '{@link xturtle.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see xturtle.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link xturtle.StringLiteral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see xturtle.StringLiteral#getType()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EReference getStringLiteral_Type();

	/**
	 * Returns the meta object for the attribute '{@link xturtle.StringLiteral#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see xturtle.StringLiteral#getLanguage()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Language();

	/**
	 * Returns the meta object for class '{@link xturtle.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see xturtle.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for class '{@link xturtle.TypePredicate <em>Type Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Predicate</em>'.
	 * @see xturtle.TypePredicate
	 * @generated
	 */
	EClass getTypePredicate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XturtleFactory getXturtleFactory();

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
		 * The meta object literal for the '{@link xturtle.impl.DirectiveBlockImpl <em>Directive Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.DirectiveBlockImpl
		 * @see xturtle.impl.XturtlePackageImpl#getDirectiveBlock()
		 * @generated
		 */
		EClass DIRECTIVE_BLOCK = eINSTANCE.getDirectiveBlock();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE_BLOCK__DIRECTIVES = eINSTANCE.getDirectiveBlock_Directives();

		/**
		 * The meta object literal for the '<em><b>Triples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE_BLOCK__TRIPLES = eINSTANCE.getDirectiveBlock_Triples();

		/**
		 * The meta object literal for the '<em><b>Directiveblock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE_BLOCK__DIRECTIVEBLOCK = eINSTANCE.getDirectiveBlock_Directiveblock();

		/**
		 * The meta object literal for the '{@link xturtle.impl.DirectivesImpl <em>Directives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.DirectivesImpl
		 * @see xturtle.impl.XturtlePackageImpl#getDirectives()
		 * @generated
		 */
		EClass DIRECTIVES = eINSTANCE.getDirectives();

		/**
		 * The meta object literal for the '<em><b>Directive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVES__DIRECTIVE = eINSTANCE.getDirectives_Directive();

		/**
		 * The meta object literal for the '{@link xturtle.impl.DirectiveImpl <em>Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.DirectiveImpl
		 * @see xturtle.impl.XturtlePackageImpl#getDirective()
		 * @generated
		 */
		EClass DIRECTIVE = eINSTANCE.getDirective();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIVE__URI = eINSTANCE.getDirective_Uri();

		/**
		 * The meta object literal for the '{@link xturtle.impl.PrefixIdImpl <em>Prefix Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.PrefixIdImpl
		 * @see xturtle.impl.XturtlePackageImpl#getPrefixId()
		 * @generated
		 */
		EClass PREFIX_ID = eINSTANCE.getPrefixId();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFIX_ID__ID = eINSTANCE.getPrefixId_Id();

		/**
		 * The meta object literal for the '{@link xturtle.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.BaseImpl
		 * @see xturtle.impl.XturtlePackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link xturtle.impl.TriplesImpl <em>Triples</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.TriplesImpl
		 * @see xturtle.impl.XturtlePackageImpl#getTriples()
		 * @generated
		 */
		EClass TRIPLES = eINSTANCE.getTriples();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLES__SUBJECT = eINSTANCE.getTriples_Subject();

		/**
		 * The meta object literal for the '<em><b>Pred Objs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLES__PRED_OBJS = eINSTANCE.getTriples_PredObjs();

		/**
		 * The meta object literal for the '{@link xturtle.impl.PredicateObjectListImpl <em>Predicate Object List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.PredicateObjectListImpl
		 * @see xturtle.impl.XturtlePackageImpl#getPredicateObjectList()
		 * @generated
		 */
		EClass PREDICATE_OBJECT_LIST = eINSTANCE.getPredicateObjectList();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_OBJECT_LIST__VERB = eINSTANCE.getPredicateObjectList_Verb();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_OBJECT_LIST__OBJECTS = eINSTANCE.getPredicateObjectList_Objects();

		/**
		 * The meta object literal for the '{@link xturtle.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.SubjectImpl
		 * @see xturtle.impl.XturtlePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '{@link xturtle.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.ObjectImpl
		 * @see xturtle.impl.XturtlePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link xturtle.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.PredicateImpl
		 * @see xturtle.impl.XturtlePackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link xturtle.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.ResourceImpl
		 * @see xturtle.impl.XturtlePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link xturtle.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.ResourceRefImpl
		 * @see xturtle.impl.XturtlePackageImpl#getResourceRef()
		 * @generated
		 */
		EClass RESOURCE_REF = eINSTANCE.getResourceRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF__REF = eINSTANCE.getResourceRef_Ref();

		/**
		 * The meta object literal for the '{@link xturtle.impl.BlankImpl <em>Blank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.BlankImpl
		 * @see xturtle.impl.XturtlePackageImpl#getBlank()
		 * @generated
		 */
		EClass BLANK = eINSTANCE.getBlank();

		/**
		 * The meta object literal for the '{@link xturtle.impl.BlankObjectsImpl <em>Blank Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.BlankObjectsImpl
		 * @see xturtle.impl.XturtlePackageImpl#getBlankObjects()
		 * @generated
		 */
		EClass BLANK_OBJECTS = eINSTANCE.getBlankObjects();

		/**
		 * The meta object literal for the '<em><b>Pred Objs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLANK_OBJECTS__PRED_OBJS = eINSTANCE.getBlankObjects_PredObjs();

		/**
		 * The meta object literal for the '{@link xturtle.impl.BlankCollectionImpl <em>Blank Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.BlankCollectionImpl
		 * @see xturtle.impl.XturtlePackageImpl#getBlankCollection()
		 * @generated
		 */
		EClass BLANK_COLLECTION = eINSTANCE.getBlankCollection();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLANK_COLLECTION__OBJECTS = eINSTANCE.getBlankCollection_Objects();

		/**
		 * The meta object literal for the '{@link xturtle.impl.QNameDefImpl <em>QName Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.QNameDefImpl
		 * @see xturtle.impl.XturtlePackageImpl#getQNameDef()
		 * @generated
		 */
		EClass QNAME_DEF = eINSTANCE.getQNameDef();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNAME_DEF__PREFIX = eINSTANCE.getQNameDef_Prefix();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QNAME_DEF__ID = eINSTANCE.getQNameDef_Id();

		/**
		 * The meta object literal for the '{@link xturtle.impl.QNameRefImpl <em>QName Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.QNameRefImpl
		 * @see xturtle.impl.XturtlePackageImpl#getQNameRef()
		 * @generated
		 */
		EClass QNAME_REF = eINSTANCE.getQNameRef();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QNAME_REF__PREFIX = eINSTANCE.getQNameRef_Prefix();

		/**
		 * The meta object literal for the '{@link xturtle.impl.UriDefImpl <em>Uri Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.UriDefImpl
		 * @see xturtle.impl.XturtlePackageImpl#getUriDef()
		 * @generated
		 */
		EClass URI_DEF = eINSTANCE.getUriDef();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_DEF__URI = eINSTANCE.getUriDef_Uri();

		/**
		 * The meta object literal for the '{@link xturtle.impl.UriRefImpl <em>Uri Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.UriRefImpl
		 * @see xturtle.impl.XturtlePackageImpl#getUriRef()
		 * @generated
		 */
		EClass URI_REF = eINSTANCE.getUriRef();

		/**
		 * The meta object literal for the '{@link xturtle.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.LiteralImpl
		 * @see xturtle.impl.XturtlePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link xturtle.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.NumberLiteralImpl
		 * @see xturtle.impl.XturtlePackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '{@link xturtle.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.StringLiteralImpl
		 * @see xturtle.impl.XturtlePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_LITERAL__TYPE = eINSTANCE.getStringLiteral_Type();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__LANGUAGE = eINSTANCE.getStringLiteral_Language();

		/**
		 * The meta object literal for the '{@link xturtle.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.BooleanLiteralImpl
		 * @see xturtle.impl.XturtlePackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '{@link xturtle.impl.TypePredicateImpl <em>Type Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xturtle.impl.TypePredicateImpl
		 * @see xturtle.impl.XturtlePackageImpl#getTypePredicate()
		 * @generated
		 */
		EClass TYPE_PREDICATE = eINSTANCE.getTypePredicate();

	}

} //XturtlePackage
