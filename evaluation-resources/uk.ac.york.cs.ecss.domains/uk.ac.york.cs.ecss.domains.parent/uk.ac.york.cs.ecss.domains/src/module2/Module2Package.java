/**
 */
package module2;

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
 * @see module2.Module2Factory
 * @model kind="package"
 * @generated
 */
public interface Module2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "module2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.com.srclang/puppetlabs/geppetto/module2/dsl/Module2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "module2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Module2Package eINSTANCE = module2.impl.Module2PackageImpl.init();

	/**
	 * The meta object id for the '{@link module2.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.ValueImpl
	 * @see module2.impl.Module2PackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 15;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonObjectImpl <em>Json Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonObjectImpl
	 * @see module2.impl.Module2PackageImpl#getJsonObject()
	 * @generated
	 */
	int JSON_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__PAIRS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonMetadataImpl <em>Json Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonMetadataImpl
	 * @see module2.impl.Module2PackageImpl#getJsonMetadata()
	 * @generated
	 */
	int JSON_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_METADATA__PAIRS = JSON_OBJECT__PAIRS;

	/**
	 * The number of structural features of the '<em>Json Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_METADATA_FEATURE_COUNT = JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_METADATA_OPERATION_COUNT = JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.PairImpl
	 * @see module2.impl.Module2PackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link module2.impl.UnrecognizedPairImpl <em>Unrecognized Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.UnrecognizedPairImpl
	 * @see module2.impl.Module2PackageImpl#getUnrecognizedPair()
	 * @generated
	 */
	int UNRECOGNIZED_PAIR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PAIR__NAME = PAIR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PAIR__VALUE = PAIR__VALUE;

	/**
	 * The number of structural features of the '<em>Unrecognized Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PAIR_FEATURE_COUNT = PAIR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unrecognized Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRECOGNIZED_PAIR_OPERATION_COUNT = PAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonArrayImpl <em>Json Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonArrayImpl
	 * @see module2.impl.Module2PackageImpl#getJsonArray()
	 * @generated
	 */
	int JSON_ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Json Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Json Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonDependencyImpl <em>Json Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonDependencyImpl
	 * @see module2.impl.Module2PackageImpl#getJsonDependency()
	 * @generated
	 */
	int JSON_DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DEPENDENCY__PAIRS = JSON_OBJECT__PAIRS;

	/**
	 * The number of structural features of the '<em>Json Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DEPENDENCY_FEATURE_COUNT = JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_DEPENDENCY_OPERATION_COUNT = JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.MetadataRefPairImpl <em>Metadata Ref Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.MetadataRefPairImpl
	 * @see module2.impl.Module2PackageImpl#getMetadataRefPair()
	 * @generated
	 */
	int METADATA_REF_PAIR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_REF_PAIR__NAME = PAIR__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_REF_PAIR__VALUE = PAIR__VALUE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_REF_PAIR__REF = PAIR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metadata Ref Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_REF_PAIR_FEATURE_COUNT = PAIR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metadata Ref Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_REF_PAIR_OPERATION_COUNT = PAIR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonRequirementImpl <em>Json Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonRequirementImpl
	 * @see module2.impl.Module2PackageImpl#getJsonRequirement()
	 * @generated
	 */
	int JSON_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REQUIREMENT__PAIRS = JSON_OBJECT__PAIRS;

	/**
	 * The number of structural features of the '<em>Json Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REQUIREMENT_FEATURE_COUNT = JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_REQUIREMENT_OPERATION_COUNT = JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonValueImpl <em>Json Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonValueImpl
	 * @see module2.impl.Module2PackageImpl#getJsonValue()
	 * @generated
	 */
	int JSON_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Json Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Json Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.RequirementNameValueImpl <em>Requirement Name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.RequirementNameValueImpl
	 * @see module2.impl.Module2PackageImpl#getRequirementNameValue()
	 * @generated
	 */
	int REQUIREMENT_NAME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_NAME_VALUE__VALUE = JSON_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Requirement Name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_NAME_VALUE_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_NAME_VALUE_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonVersionRangeImpl <em>Json Version Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonVersionRangeImpl
	 * @see module2.impl.Module2PackageImpl#getJsonVersionRange()
	 * @generated
	 */
	int JSON_VERSION_RANGE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION_RANGE__VALUE = JSON_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Json Version Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION_RANGE_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Version Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION_RANGE_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonModuleNameImpl <em>Json Module Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonModuleNameImpl
	 * @see module2.impl.Module2PackageImpl#getJsonModuleName()
	 * @generated
	 */
	int JSON_MODULE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MODULE_NAME__VALUE = JSON_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Json Module Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MODULE_NAME_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Module Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MODULE_NAME_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonTagImpl <em>Json Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonTagImpl
	 * @see module2.impl.Module2PackageImpl#getJsonTag()
	 * @generated
	 */
	int JSON_TAG = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TAG__VALUE = JSON_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Json Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TAG_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TAG_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonVersionImpl <em>Json Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonVersionImpl
	 * @see module2.impl.Module2PackageImpl#getJsonVersion()
	 * @generated
	 */
	int JSON_VERSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION__VALUE = JSON_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Json Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION_FEATURE_COUNT = JSON_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VERSION_OPERATION_COUNT = JSON_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link module2.impl.JsonOSImpl <em>Json OS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see module2.impl.JsonOSImpl
	 * @see module2.impl.Module2PackageImpl#getJsonOS()
	 * @generated
	 */
	int JSON_OS = 14;

	/**
	 * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OS__PAIRS = JSON_OBJECT__PAIRS;

	/**
	 * The number of structural features of the '<em>Json OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OS_FEATURE_COUNT = JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OS_OPERATION_COUNT = JSON_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link module2.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Object</em>'.
	 * @see module2.JsonObject
	 * @generated
	 */
	EClass getJsonObject();

	/**
	 * Returns the meta object for the containment reference list '{@link module2.JsonObject#getPairs <em>Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pairs</em>'.
	 * @see module2.JsonObject#getPairs()
	 * @see #getJsonObject()
	 * @generated
	 */
	EReference getJsonObject_Pairs();

	/**
	 * Returns the meta object for class '{@link module2.JsonMetadata <em>Json Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Metadata</em>'.
	 * @see module2.JsonMetadata
	 * @generated
	 */
	EClass getJsonMetadata();

	/**
	 * Returns the meta object for class '{@link module2.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see module2.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link module2.Pair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see module2.Pair#getName()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Name();

	/**
	 * Returns the meta object for the containment reference '{@link module2.Pair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see module2.Pair#getValue()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Value();

	/**
	 * Returns the meta object for class '{@link module2.UnrecognizedPair <em>Unrecognized Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unrecognized Pair</em>'.
	 * @see module2.UnrecognizedPair
	 * @generated
	 */
	EClass getUnrecognizedPair();

	/**
	 * Returns the meta object for class '{@link module2.JsonArray <em>Json Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Array</em>'.
	 * @see module2.JsonArray
	 * @generated
	 */
	EClass getJsonArray();

	/**
	 * Returns the meta object for the containment reference list '{@link module2.JsonArray#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see module2.JsonArray#getValue()
	 * @see #getJsonArray()
	 * @generated
	 */
	EReference getJsonArray_Value();

	/**
	 * Returns the meta object for class '{@link module2.JsonDependency <em>Json Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Dependency</em>'.
	 * @see module2.JsonDependency
	 * @generated
	 */
	EClass getJsonDependency();

	/**
	 * Returns the meta object for class '{@link module2.MetadataRefPair <em>Metadata Ref Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Ref Pair</em>'.
	 * @see module2.MetadataRefPair
	 * @generated
	 */
	EClass getMetadataRefPair();

	/**
	 * Returns the meta object for the reference '{@link module2.MetadataRefPair#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see module2.MetadataRefPair#getRef()
	 * @see #getMetadataRefPair()
	 * @generated
	 */
	EReference getMetadataRefPair_Ref();

	/**
	 * Returns the meta object for class '{@link module2.JsonRequirement <em>Json Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Requirement</em>'.
	 * @see module2.JsonRequirement
	 * @generated
	 */
	EClass getJsonRequirement();

	/**
	 * Returns the meta object for class '{@link module2.JsonValue <em>Json Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Value</em>'.
	 * @see module2.JsonValue
	 * @generated
	 */
	EClass getJsonValue();

	/**
	 * Returns the meta object for the attribute '{@link module2.JsonValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see module2.JsonValue#getValue()
	 * @see #getJsonValue()
	 * @generated
	 */
	EAttribute getJsonValue_Value();

	/**
	 * Returns the meta object for class '{@link module2.RequirementNameValue <em>Requirement Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Name Value</em>'.
	 * @see module2.RequirementNameValue
	 * @generated
	 */
	EClass getRequirementNameValue();

	/**
	 * Returns the meta object for class '{@link module2.JsonVersionRange <em>Json Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Version Range</em>'.
	 * @see module2.JsonVersionRange
	 * @generated
	 */
	EClass getJsonVersionRange();

	/**
	 * Returns the meta object for class '{@link module2.JsonModuleName <em>Json Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Module Name</em>'.
	 * @see module2.JsonModuleName
	 * @generated
	 */
	EClass getJsonModuleName();

	/**
	 * Returns the meta object for class '{@link module2.JsonTag <em>Json Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Tag</em>'.
	 * @see module2.JsonTag
	 * @generated
	 */
	EClass getJsonTag();

	/**
	 * Returns the meta object for class '{@link module2.JsonVersion <em>Json Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Version</em>'.
	 * @see module2.JsonVersion
	 * @generated
	 */
	EClass getJsonVersion();

	/**
	 * Returns the meta object for class '{@link module2.JsonOS <em>Json OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json OS</em>'.
	 * @see module2.JsonOS
	 * @generated
	 */
	EClass getJsonOS();

	/**
	 * Returns the meta object for class '{@link module2.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see module2.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Module2Factory getModule2Factory();

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
		 * The meta object literal for the '{@link module2.impl.JsonObjectImpl <em>Json Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonObjectImpl
		 * @see module2.impl.Module2PackageImpl#getJsonObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJsonObject();

		/**
		 * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_OBJECT__PAIRS = eINSTANCE.getJsonObject_Pairs();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonMetadataImpl <em>Json Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonMetadataImpl
		 * @see module2.impl.Module2PackageImpl#getJsonMetadata()
		 * @generated
		 */
		EClass JSON_METADATA = eINSTANCE.getJsonMetadata();

		/**
		 * The meta object literal for the '{@link module2.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.PairImpl
		 * @see module2.impl.Module2PackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__NAME = eINSTANCE.getPair_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VALUE = eINSTANCE.getPair_Value();

		/**
		 * The meta object literal for the '{@link module2.impl.UnrecognizedPairImpl <em>Unrecognized Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.UnrecognizedPairImpl
		 * @see module2.impl.Module2PackageImpl#getUnrecognizedPair()
		 * @generated
		 */
		EClass UNRECOGNIZED_PAIR = eINSTANCE.getUnrecognizedPair();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonArrayImpl <em>Json Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonArrayImpl
		 * @see module2.impl.Module2PackageImpl#getJsonArray()
		 * @generated
		 */
		EClass JSON_ARRAY = eINSTANCE.getJsonArray();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_ARRAY__VALUE = eINSTANCE.getJsonArray_Value();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonDependencyImpl <em>Json Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonDependencyImpl
		 * @see module2.impl.Module2PackageImpl#getJsonDependency()
		 * @generated
		 */
		EClass JSON_DEPENDENCY = eINSTANCE.getJsonDependency();

		/**
		 * The meta object literal for the '{@link module2.impl.MetadataRefPairImpl <em>Metadata Ref Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.MetadataRefPairImpl
		 * @see module2.impl.Module2PackageImpl#getMetadataRefPair()
		 * @generated
		 */
		EClass METADATA_REF_PAIR = eINSTANCE.getMetadataRefPair();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_REF_PAIR__REF = eINSTANCE.getMetadataRefPair_Ref();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonRequirementImpl <em>Json Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonRequirementImpl
		 * @see module2.impl.Module2PackageImpl#getJsonRequirement()
		 * @generated
		 */
		EClass JSON_REQUIREMENT = eINSTANCE.getJsonRequirement();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonValueImpl <em>Json Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonValueImpl
		 * @see module2.impl.Module2PackageImpl#getJsonValue()
		 * @generated
		 */
		EClass JSON_VALUE = eINSTANCE.getJsonValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_VALUE__VALUE = eINSTANCE.getJsonValue_Value();

		/**
		 * The meta object literal for the '{@link module2.impl.RequirementNameValueImpl <em>Requirement Name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.RequirementNameValueImpl
		 * @see module2.impl.Module2PackageImpl#getRequirementNameValue()
		 * @generated
		 */
		EClass REQUIREMENT_NAME_VALUE = eINSTANCE.getRequirementNameValue();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonVersionRangeImpl <em>Json Version Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonVersionRangeImpl
		 * @see module2.impl.Module2PackageImpl#getJsonVersionRange()
		 * @generated
		 */
		EClass JSON_VERSION_RANGE = eINSTANCE.getJsonVersionRange();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonModuleNameImpl <em>Json Module Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonModuleNameImpl
		 * @see module2.impl.Module2PackageImpl#getJsonModuleName()
		 * @generated
		 */
		EClass JSON_MODULE_NAME = eINSTANCE.getJsonModuleName();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonTagImpl <em>Json Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonTagImpl
		 * @see module2.impl.Module2PackageImpl#getJsonTag()
		 * @generated
		 */
		EClass JSON_TAG = eINSTANCE.getJsonTag();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonVersionImpl <em>Json Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonVersionImpl
		 * @see module2.impl.Module2PackageImpl#getJsonVersion()
		 * @generated
		 */
		EClass JSON_VERSION = eINSTANCE.getJsonVersion();

		/**
		 * The meta object literal for the '{@link module2.impl.JsonOSImpl <em>Json OS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.JsonOSImpl
		 * @see module2.impl.Module2PackageImpl#getJsonOS()
		 * @generated
		 */
		EClass JSON_OS = eINSTANCE.getJsonOS();

		/**
		 * The meta object literal for the '{@link module2.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see module2.impl.ValueImpl
		 * @see module2.impl.Module2PackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

	}

} //Module2Package
