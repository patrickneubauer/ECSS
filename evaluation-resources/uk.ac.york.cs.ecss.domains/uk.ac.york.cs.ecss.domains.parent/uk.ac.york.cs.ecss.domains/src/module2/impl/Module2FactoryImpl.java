/**
 */
package module2.impl;

import module2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Module2FactoryImpl extends EFactoryImpl implements Module2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Module2Factory init() {
		try {
			Module2Factory theModule2Factory = (Module2Factory)EPackage.Registry.INSTANCE.getEFactory(Module2Package.eNS_URI);
			if (theModule2Factory != null) {
				return theModule2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Module2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Module2Package.JSON_OBJECT: return createJsonObject();
			case Module2Package.JSON_METADATA: return createJsonMetadata();
			case Module2Package.PAIR: return createPair();
			case Module2Package.UNRECOGNIZED_PAIR: return createUnrecognizedPair();
			case Module2Package.JSON_ARRAY: return createJsonArray();
			case Module2Package.JSON_DEPENDENCY: return createJsonDependency();
			case Module2Package.METADATA_REF_PAIR: return createMetadataRefPair();
			case Module2Package.JSON_REQUIREMENT: return createJsonRequirement();
			case Module2Package.JSON_VALUE: return createJsonValue();
			case Module2Package.REQUIREMENT_NAME_VALUE: return createRequirementNameValue();
			case Module2Package.JSON_VERSION_RANGE: return createJsonVersionRange();
			case Module2Package.JSON_MODULE_NAME: return createJsonModuleName();
			case Module2Package.JSON_TAG: return createJsonTag();
			case Module2Package.JSON_VERSION: return createJsonVersion();
			case Module2Package.JSON_OS: return createJsonOS();
			case Module2Package.VALUE: return createValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonObject createJsonObject() {
		JsonObjectImpl jsonObject = new JsonObjectImpl();
		return jsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonMetadata createJsonMetadata() {
		JsonMetadataImpl jsonMetadata = new JsonMetadataImpl();
		return jsonMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnrecognizedPair createUnrecognizedPair() {
		UnrecognizedPairImpl unrecognizedPair = new UnrecognizedPairImpl();
		return unrecognizedPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonArray createJsonArray() {
		JsonArrayImpl jsonArray = new JsonArrayImpl();
		return jsonArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDependency createJsonDependency() {
		JsonDependencyImpl jsonDependency = new JsonDependencyImpl();
		return jsonDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataRefPair createMetadataRefPair() {
		MetadataRefPairImpl metadataRefPair = new MetadataRefPairImpl();
		return metadataRefPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonRequirement createJsonRequirement() {
		JsonRequirementImpl jsonRequirement = new JsonRequirementImpl();
		return jsonRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonValue createJsonValue() {
		JsonValueImpl jsonValue = new JsonValueImpl();
		return jsonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementNameValue createRequirementNameValue() {
		RequirementNameValueImpl requirementNameValue = new RequirementNameValueImpl();
		return requirementNameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonVersionRange createJsonVersionRange() {
		JsonVersionRangeImpl jsonVersionRange = new JsonVersionRangeImpl();
		return jsonVersionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonModuleName createJsonModuleName() {
		JsonModuleNameImpl jsonModuleName = new JsonModuleNameImpl();
		return jsonModuleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonTag createJsonTag() {
		JsonTagImpl jsonTag = new JsonTagImpl();
		return jsonTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonVersion createJsonVersion() {
		JsonVersionImpl jsonVersion = new JsonVersionImpl();
		return jsonVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonOS createJsonOS() {
		JsonOSImpl jsonOS = new JsonOSImpl();
		return jsonOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Module2Package getModule2Package() {
		return (Module2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Module2Package getPackage() {
		return Module2Package.eINSTANCE;
	}

} //Module2FactoryImpl
