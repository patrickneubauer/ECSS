/**
 */
package spacetransportationservice.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import spacetransportationservice.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see spacetransportationservice.SpacetransportationservicePackage
 * @generated
 */
public class SpacetransportationserviceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpacetransportationservicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacetransportationserviceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpacetransportationservicePackage.eINSTANCE;
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
	protected SpacetransportationserviceSwitch<Adapter> modelSwitch =
		new SpacetransportationserviceSwitch<Adapter>() {
			@Override
			public Adapter caseSpacecraft(Spacecraft object) {
				return createSpacecraftAdapter();
			}
			@Override
			public Adapter caseLaunchSite(LaunchSite object) {
				return createLaunchSiteAdapter();
			}
			@Override
			public Adapter caseStage(Stage object) {
				return createStageAdapter();
			}
			@Override
			public Adapter casePhysicalProperty(PhysicalProperty object) {
				return createPhysicalPropertyAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEngineType(EngineType object) {
				return createEngineTypeAdapter();
			}
			@Override
			public Adapter caseSpaceTransportationService(SpaceTransportationService object) {
				return createSpaceTransportationServiceAdapter();
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
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.Spacecraft <em>Spacecraft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.Spacecraft
	 * @generated
	 */
	public Adapter createSpacecraftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.LaunchSite <em>Launch Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.LaunchSite
	 * @generated
	 */
	public Adapter createLaunchSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.PhysicalProperty <em>Physical Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.PhysicalProperty
	 * @generated
	 */
	public Adapter createPhysicalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.EngineType <em>Engine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.EngineType
	 * @generated
	 */
	public Adapter createEngineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link spacetransportationservice.SpaceTransportationService <em>Space Transportation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see spacetransportationservice.SpaceTransportationService
	 * @generated
	 */
	public Adapter createSpaceTransportationServiceAdapter() {
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

} //SpacetransportationserviceAdapterFactory
