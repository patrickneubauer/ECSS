/**
 */
package module2.util;

import module2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see module2.Module2Package
 * @generated
 */
public class Module2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Module2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Module2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Module2Switch<Adapter> modelSwitch =
		new Module2Switch<Adapter>() {
			@Override
			public Adapter caseJsonObject(JsonObject object) {
				return createJsonObjectAdapter();
			}
			@Override
			public Adapter caseJsonMetadata(JsonMetadata object) {
				return createJsonMetadataAdapter();
			}
			@Override
			public Adapter casePair(Pair object) {
				return createPairAdapter();
			}
			@Override
			public Adapter caseUnrecognizedPair(UnrecognizedPair object) {
				return createUnrecognizedPairAdapter();
			}
			@Override
			public Adapter caseJsonArray(JsonArray object) {
				return createJsonArrayAdapter();
			}
			@Override
			public Adapter caseJsonDependency(JsonDependency object) {
				return createJsonDependencyAdapter();
			}
			@Override
			public Adapter caseMetadataRefPair(MetadataRefPair object) {
				return createMetadataRefPairAdapter();
			}
			@Override
			public Adapter caseJsonRequirement(JsonRequirement object) {
				return createJsonRequirementAdapter();
			}
			@Override
			public Adapter caseJsonValue(JsonValue object) {
				return createJsonValueAdapter();
			}
			@Override
			public Adapter caseRequirementNameValue(RequirementNameValue object) {
				return createRequirementNameValueAdapter();
			}
			@Override
			public Adapter caseJsonVersionRange(JsonVersionRange object) {
				return createJsonVersionRangeAdapter();
			}
			@Override
			public Adapter caseJsonModuleName(JsonModuleName object) {
				return createJsonModuleNameAdapter();
			}
			@Override
			public Adapter caseJsonTag(JsonTag object) {
				return createJsonTagAdapter();
			}
			@Override
			public Adapter caseJsonVersion(JsonVersion object) {
				return createJsonVersionAdapter();
			}
			@Override
			public Adapter caseJsonOS(JsonOS object) {
				return createJsonOSAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonObject
	 * @generated
	 */
	public Adapter createJsonObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonMetadata <em>Json Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonMetadata
	 * @generated
	 */
	public Adapter createJsonMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.UnrecognizedPair <em>Unrecognized Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.UnrecognizedPair
	 * @generated
	 */
	public Adapter createUnrecognizedPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonArray <em>Json Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonArray
	 * @generated
	 */
	public Adapter createJsonArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonDependency <em>Json Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonDependency
	 * @generated
	 */
	public Adapter createJsonDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.MetadataRefPair <em>Metadata Ref Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.MetadataRefPair
	 * @generated
	 */
	public Adapter createMetadataRefPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonRequirement <em>Json Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonRequirement
	 * @generated
	 */
	public Adapter createJsonRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonValue <em>Json Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonValue
	 * @generated
	 */
	public Adapter createJsonValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.RequirementNameValue <em>Requirement Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.RequirementNameValue
	 * @generated
	 */
	public Adapter createRequirementNameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonVersionRange <em>Json Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonVersionRange
	 * @generated
	 */
	public Adapter createJsonVersionRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonModuleName <em>Json Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonModuleName
	 * @generated
	 */
	public Adapter createJsonModuleNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonTag <em>Json Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonTag
	 * @generated
	 */
	public Adapter createJsonTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonVersion <em>Json Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonVersion
	 * @generated
	 */
	public Adapter createJsonVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.JsonOS <em>Json OS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.JsonOS
	 * @generated
	 */
	public Adapter createJsonOSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link module2.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see module2.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Module2AdapterFactory
