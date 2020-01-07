/**
 */
package module2.impl;

import module2.JsonArray;
import module2.JsonDependency;
import module2.JsonMetadata;
import module2.JsonModuleName;
import module2.JsonOS;
import module2.JsonObject;
import module2.JsonRequirement;
import module2.JsonTag;
import module2.JsonValue;
import module2.JsonVersion;
import module2.JsonVersionRange;
import module2.MetadataRefPair;
import module2.Module2Factory;
import module2.Module2Package;
import module2.Pair;
import module2.RequirementNameValue;
import module2.UnrecognizedPair;
import module2.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Module2PackageImpl extends EPackageImpl implements Module2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unrecognizedPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataRefPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementNameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonVersionRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonModuleNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonOSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see module2.Module2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Module2PackageImpl() {
		super(eNS_URI, Module2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Module2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Module2Package init() {
		if (isInited) return (Module2Package)EPackage.Registry.INSTANCE.getEPackage(Module2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredModule2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Module2PackageImpl theModule2Package = registeredModule2Package instanceof Module2PackageImpl ? (Module2PackageImpl)registeredModule2Package : new Module2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModule2Package.createPackageContents();

		// Initialize created meta-data
		theModule2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModule2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Module2Package.eNS_URI, theModule2Package);
		return theModule2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonObject() {
		return jsonObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJsonObject_Pairs() {
		return (EReference)jsonObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonMetadata() {
		return jsonMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPair_Name() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPair_Value() {
		return (EReference)pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnrecognizedPair() {
		return unrecognizedPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonArray() {
		return jsonArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJsonArray_Value() {
		return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonDependency() {
		return jsonDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadataRefPair() {
		return metadataRefPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadataRefPair_Ref() {
		return (EReference)metadataRefPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonRequirement() {
		return jsonRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonValue() {
		return jsonValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonValue_Value() {
		return (EAttribute)jsonValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementNameValue() {
		return requirementNameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonVersionRange() {
		return jsonVersionRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonModuleName() {
		return jsonModuleNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonTag() {
		return jsonTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonVersion() {
		return jsonVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonOS() {
		return jsonOSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Module2Factory getModule2Factory() {
		return (Module2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jsonObjectEClass = createEClass(JSON_OBJECT);
		createEReference(jsonObjectEClass, JSON_OBJECT__PAIRS);

		jsonMetadataEClass = createEClass(JSON_METADATA);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__NAME);
		createEReference(pairEClass, PAIR__VALUE);

		unrecognizedPairEClass = createEClass(UNRECOGNIZED_PAIR);

		jsonArrayEClass = createEClass(JSON_ARRAY);
		createEReference(jsonArrayEClass, JSON_ARRAY__VALUE);

		jsonDependencyEClass = createEClass(JSON_DEPENDENCY);

		metadataRefPairEClass = createEClass(METADATA_REF_PAIR);
		createEReference(metadataRefPairEClass, METADATA_REF_PAIR__REF);

		jsonRequirementEClass = createEClass(JSON_REQUIREMENT);

		jsonValueEClass = createEClass(JSON_VALUE);
		createEAttribute(jsonValueEClass, JSON_VALUE__VALUE);

		requirementNameValueEClass = createEClass(REQUIREMENT_NAME_VALUE);

		jsonVersionRangeEClass = createEClass(JSON_VERSION_RANGE);

		jsonModuleNameEClass = createEClass(JSON_MODULE_NAME);

		jsonTagEClass = createEClass(JSON_TAG);

		jsonVersionEClass = createEClass(JSON_VERSION);

		jsonOSEClass = createEClass(JSON_OS);

		valueEClass = createEClass(VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jsonObjectEClass.getESuperTypes().add(this.getValue());
		jsonMetadataEClass.getESuperTypes().add(this.getJsonObject());
		unrecognizedPairEClass.getESuperTypes().add(this.getPair());
		jsonArrayEClass.getESuperTypes().add(this.getValue());
		jsonDependencyEClass.getESuperTypes().add(this.getJsonObject());
		metadataRefPairEClass.getESuperTypes().add(this.getPair());
		jsonRequirementEClass.getESuperTypes().add(this.getJsonObject());
		jsonValueEClass.getESuperTypes().add(this.getValue());
		requirementNameValueEClass.getESuperTypes().add(this.getJsonValue());
		jsonVersionRangeEClass.getESuperTypes().add(this.getJsonValue());
		jsonModuleNameEClass.getESuperTypes().add(this.getJsonValue());
		jsonTagEClass.getESuperTypes().add(this.getJsonValue());
		jsonVersionEClass.getESuperTypes().add(this.getJsonValue());
		jsonOSEClass.getESuperTypes().add(this.getJsonObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonObject_Pairs(), this.getPair(), null, "pairs", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonMetadataEClass, JsonMetadata.class, "JsonMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPair_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPair_Value(), this.getValue(), null, "value", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unrecognizedPairEClass, UnrecognizedPair.class, "UnrecognizedPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonArray_Value(), this.getValue(), null, "value", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonDependencyEClass, JsonDependency.class, "JsonDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataRefPairEClass, MetadataRefPair.class, "MetadataRefPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataRefPair_Ref(), this.getJsonMetadata(), null, "ref", null, 0, 1, MetadataRefPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonRequirementEClass, JsonRequirement.class, "JsonRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonValueEClass, JsonValue.class, "JsonValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonValue_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, JsonValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementNameValueEClass, RequirementNameValue.class, "RequirementNameValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonVersionRangeEClass, JsonVersionRange.class, "JsonVersionRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonModuleNameEClass, JsonModuleName.class, "JsonModuleName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonTagEClass, JsonTag.class, "JsonTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonVersionEClass, JsonVersion.class, "JsonVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonOSEClass, JsonOS.class, "JsonOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Module2PackageImpl
