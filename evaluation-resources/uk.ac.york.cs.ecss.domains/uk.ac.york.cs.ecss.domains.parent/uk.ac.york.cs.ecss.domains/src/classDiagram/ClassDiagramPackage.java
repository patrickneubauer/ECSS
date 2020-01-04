/**
 */
package classDiagram;

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
 * @see classDiagram.ClassDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uml.rethink/ClassDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackage eINSTANCE = classDiagram.impl.ClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link classDiagram.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.DomainModelImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__FILE = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.ElementImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.NodeImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.EntityImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NODE__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.CPackageImpl <em>CPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.CPackageImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getCPackage()
	 * @generated
	 */
	int CPACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPACKAGE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPACKAGE__STYLE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPACKAGE__ELEMENTS = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPACKAGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPACKAGE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.RelationImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LEFT_REF = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rel Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REL_TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RIGHT_REF = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.RelationParseImpl <em>Relation Parse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.RelationParseImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelationParse()
	 * @generated
	 */
	int RELATION_PARSE = 6;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE__COMP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE__DIRECT = 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE__MULTI = 3;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE__EXT = 4;

	/**
	 * The number of structural features of the '<em>Relation Parse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relation Parse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PARSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.RelationTypeImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__STRONG = 0;

	/**
	 * The feature id for the '<em><b>Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__WEAK = 1;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.EnumerImpl <em>Enumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.EnumerImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getEnumer()
	 * @generated
	 */
	int ENUMER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMER__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMER__TYPES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.ClazzImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__STEREOTYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__PROPERTIES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.PropertyImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Entity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ENTITY_LIST = 3;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.EntityListImpl <em>Entity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.EntityListImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getEntityList()
	 * @generated
	 */
	int ENTITY_LIST = 11;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST__REFS = 0;

	/**
	 * The number of structural features of the '<em>Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.NoteImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__POSITION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VALUE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__OF = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link classDiagram.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.impl.DataTypeImpl
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NATIVE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Is Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ARRAY = 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classDiagram.PackageStyle <em>Package Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.PackageStyle
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getPackageStyle()
	 * @generated
	 */
	int PACKAGE_STYLE = 14;

	/**
	 * The meta object id for the '{@link classDiagram.CompType <em>Comp Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.CompType
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getCompType()
	 * @generated
	 */
	int COMP_TYPE = 15;

	/**
	 * The meta object id for the '{@link classDiagram.NotePosition <em>Note Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.NotePosition
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getNotePosition()
	 * @generated
	 */
	int NOTE_POSITION = 16;

	/**
	 * The meta object id for the '{@link classDiagram.NativeType <em>Native Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classDiagram.NativeType
	 * @see classDiagram.impl.ClassDiagramPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link classDiagram.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see classDiagram.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.DomainModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see classDiagram.DomainModel#getFile()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_File();

	/**
	 * Returns the meta object for the containment reference list '{@link classDiagram.DomainModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see classDiagram.DomainModel#getPackages()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Packages();

	/**
	 * Returns the meta object for class '{@link classDiagram.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see classDiagram.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see classDiagram.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link classDiagram.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see classDiagram.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link classDiagram.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see classDiagram.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link classDiagram.CPackage <em>CPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPackage</em>'.
	 * @see classDiagram.CPackage
	 * @generated
	 */
	EClass getCPackage();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.CPackage#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see classDiagram.CPackage#getStyle()
	 * @see #getCPackage()
	 * @generated
	 */
	EAttribute getCPackage_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link classDiagram.CPackage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see classDiagram.CPackage#getElements()
	 * @see #getCPackage()
	 * @generated
	 */
	EReference getCPackage_Elements();

	/**
	 * Returns the meta object for class '{@link classDiagram.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see classDiagram.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link classDiagram.Relation#getLeftRef <em>Left Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Ref</em>'.
	 * @see classDiagram.Relation#getLeftRef()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_LeftRef();

	/**
	 * Returns the meta object for the containment reference '{@link classDiagram.Relation#getRelType <em>Rel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Type</em>'.
	 * @see classDiagram.Relation#getRelType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_RelType();

	/**
	 * Returns the meta object for the reference '{@link classDiagram.Relation#getRightRef <em>Right Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Ref</em>'.
	 * @see classDiagram.Relation#getRightRef()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_RightRef();

	/**
	 * Returns the meta object for class '{@link classDiagram.RelationParse <em>Relation Parse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Parse</em>'.
	 * @see classDiagram.RelationParse
	 * @generated
	 */
	EClass getRelationParse();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationParse#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see classDiagram.RelationParse#getComp()
	 * @see #getRelationParse()
	 * @generated
	 */
	EAttribute getRelationParse_Comp();

	/**
	 * Returns the meta object for the containment reference '{@link classDiagram.RelationParse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see classDiagram.RelationParse#getType()
	 * @see #getRelationParse()
	 * @generated
	 */
	EReference getRelationParse_Type();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationParse#isDirect <em>Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct</em>'.
	 * @see classDiagram.RelationParse#isDirect()
	 * @see #getRelationParse()
	 * @generated
	 */
	EAttribute getRelationParse_Direct();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationParse#getMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see classDiagram.RelationParse#getMulti()
	 * @see #getRelationParse()
	 * @generated
	 */
	EAttribute getRelationParse_Multi();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationParse#isExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see classDiagram.RelationParse#isExt()
	 * @see #getRelationParse()
	 * @generated
	 */
	EAttribute getRelationParse_Ext();

	/**
	 * Returns the meta object for class '{@link classDiagram.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see classDiagram.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationType#isStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strong</em>'.
	 * @see classDiagram.RelationType#isStrong()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Strong();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.RelationType#isWeak <em>Weak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weak</em>'.
	 * @see classDiagram.RelationType#isWeak()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Weak();

	/**
	 * Returns the meta object for class '{@link classDiagram.Enumer <em>Enumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumer</em>'.
	 * @see classDiagram.Enumer
	 * @generated
	 */
	EClass getEnumer();

	/**
	 * Returns the meta object for the attribute list '{@link classDiagram.Enumer#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see classDiagram.Enumer#getTypes()
	 * @see #getEnumer()
	 * @generated
	 */
	EAttribute getEnumer_Types();

	/**
	 * Returns the meta object for class '{@link classDiagram.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see classDiagram.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Clazz#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see classDiagram.Clazz#getStereotype()
	 * @see #getClazz()
	 * @generated
	 */
	EAttribute getClazz_Stereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link classDiagram.Clazz#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see classDiagram.Clazz#getProperties()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Properties();

	/**
	 * Returns the meta object for class '{@link classDiagram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see classDiagram.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see classDiagram.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Property#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see classDiagram.Property#isOptional()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link classDiagram.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see classDiagram.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the containment reference '{@link classDiagram.Property#getEntityList <em>Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity List</em>'.
	 * @see classDiagram.Property#getEntityList()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_EntityList();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Property#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see classDiagram.Property#isConstant()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Constant();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see classDiagram.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link classDiagram.EntityList <em>Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity List</em>'.
	 * @see classDiagram.EntityList
	 * @generated
	 */
	EClass getEntityList();

	/**
	 * Returns the meta object for the reference list '{@link classDiagram.EntityList#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refs</em>'.
	 * @see classDiagram.EntityList#getRefs()
	 * @see #getEntityList()
	 * @generated
	 */
	EReference getEntityList_Refs();

	/**
	 * Returns the meta object for class '{@link classDiagram.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see classDiagram.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Note#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see classDiagram.Note#getPosition()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Position();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.Note#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see classDiagram.Note#getValue()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Value();

	/**
	 * Returns the meta object for the reference '{@link classDiagram.Note#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of</em>'.
	 * @see classDiagram.Note#getOf()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Of();

	/**
	 * Returns the meta object for class '{@link classDiagram.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see classDiagram.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.DataType#getNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see classDiagram.DataType#getNative()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Native();

	/**
	 * Returns the meta object for the reference '{@link classDiagram.DataType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see classDiagram.DataType#getEntity()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Entity();

	/**
	 * Returns the meta object for the attribute '{@link classDiagram.DataType#isIsArray <em>Is Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Array</em>'.
	 * @see classDiagram.DataType#isIsArray()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsArray();

	/**
	 * Returns the meta object for enum '{@link classDiagram.PackageStyle <em>Package Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Package Style</em>'.
	 * @see classDiagram.PackageStyle
	 * @generated
	 */
	EEnum getPackageStyle();

	/**
	 * Returns the meta object for enum '{@link classDiagram.CompType <em>Comp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp Type</em>'.
	 * @see classDiagram.CompType
	 * @generated
	 */
	EEnum getCompType();

	/**
	 * Returns the meta object for enum '{@link classDiagram.NotePosition <em>Note Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Position</em>'.
	 * @see classDiagram.NotePosition
	 * @generated
	 */
	EEnum getNotePosition();

	/**
	 * Returns the meta object for enum '{@link classDiagram.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Native Type</em>'.
	 * @see classDiagram.NativeType
	 * @generated
	 */
	EEnum getNativeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagramFactory getClassDiagramFactory();

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
		 * The meta object literal for the '{@link classDiagram.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.DomainModelImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__FILE = eINSTANCE.getDomainModel_File();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__PACKAGES = eINSTANCE.getDomainModel_Packages();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.ElementImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.NodeImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.EntityImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.CPackageImpl <em>CPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.CPackageImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getCPackage()
		 * @generated
		 */
		EClass CPACKAGE = eINSTANCE.getCPackage();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPACKAGE__STYLE = eINSTANCE.getCPackage_Style();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPACKAGE__ELEMENTS = eINSTANCE.getCPackage_Elements();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.RelationImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Left Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LEFT_REF = eINSTANCE.getRelation_LeftRef();

		/**
		 * The meta object literal for the '<em><b>Rel Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__REL_TYPE = eINSTANCE.getRelation_RelType();

		/**
		 * The meta object literal for the '<em><b>Right Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__RIGHT_REF = eINSTANCE.getRelation_RightRef();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.RelationParseImpl <em>Relation Parse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.RelationParseImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelationParse()
		 * @generated
		 */
		EClass RELATION_PARSE = eINSTANCE.getRelationParse();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PARSE__COMP = eINSTANCE.getRelationParse_Comp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_PARSE__TYPE = eINSTANCE.getRelationParse_Type();

		/**
		 * The meta object literal for the '<em><b>Direct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PARSE__DIRECT = eINSTANCE.getRelationParse_Direct();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PARSE__MULTI = eINSTANCE.getRelationParse_Multi();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PARSE__EXT = eINSTANCE.getRelationParse_Ext();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.RelationTypeImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__STRONG = eINSTANCE.getRelationType_Strong();

		/**
		 * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__WEAK = eINSTANCE.getRelationType_Weak();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.EnumerImpl <em>Enumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.EnumerImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getEnumer()
		 * @generated
		 */
		EClass ENUMER = eINSTANCE.getEnumer();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMER__TYPES = eINSTANCE.getEnumer_Types();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.ClazzImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAZZ__STEREOTYPE = eINSTANCE.getClazz_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__PROPERTIES = eINSTANCE.getClazz_Properties();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.PropertyImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__OPTIONAL = eINSTANCE.getProperty_Optional();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Entity List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ENTITY_LIST = eINSTANCE.getProperty_EntityList();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CONSTANT = eINSTANCE.getProperty_Constant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.EntityListImpl <em>Entity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.EntityListImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getEntityList()
		 * @generated
		 */
		EClass ENTITY_LIST = eINSTANCE.getEntityList();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_LIST__REFS = eINSTANCE.getEntityList_Refs();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.NoteImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__POSITION = eINSTANCE.getNote_Position();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VALUE = eINSTANCE.getNote_Value();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__OF = eINSTANCE.getNote_Of();

		/**
		 * The meta object literal for the '{@link classDiagram.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.impl.DataTypeImpl
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NATIVE = eINSTANCE.getDataType_Native();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__ENTITY = eINSTANCE.getDataType_Entity();

		/**
		 * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_ARRAY = eINSTANCE.getDataType_IsArray();

		/**
		 * The meta object literal for the '{@link classDiagram.PackageStyle <em>Package Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.PackageStyle
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getPackageStyle()
		 * @generated
		 */
		EEnum PACKAGE_STYLE = eINSTANCE.getPackageStyle();

		/**
		 * The meta object literal for the '{@link classDiagram.CompType <em>Comp Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.CompType
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getCompType()
		 * @generated
		 */
		EEnum COMP_TYPE = eINSTANCE.getCompType();

		/**
		 * The meta object literal for the '{@link classDiagram.NotePosition <em>Note Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.NotePosition
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getNotePosition()
		 * @generated
		 */
		EEnum NOTE_POSITION = eINSTANCE.getNotePosition();

		/**
		 * The meta object literal for the '{@link classDiagram.NativeType <em>Native Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classDiagram.NativeType
		 * @see classDiagram.impl.ClassDiagramPackageImpl#getNativeType()
		 * @generated
		 */
		EEnum NATIVE_TYPE = eINSTANCE.getNativeType();

	}

} //ClassDiagramPackage
