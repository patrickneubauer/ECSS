/**
 */
package sculptordsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sculptordsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sculptordsl.SculptordslPackage
 * @generated
 */
public class SculptordslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptordslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptordslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SculptordslPackage.eINSTANCE;
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
	protected SculptordslSwitch<Adapter> modelSwitch =
		new SculptordslSwitch<Adapter>() {
			@Override
			public Adapter caseDslModel(DslModel object) {
				return createDslModelAdapter();
			}
			@Override
			public Adapter caseDslImport(DslImport object) {
				return createDslImportAdapter();
			}
			@Override
			public Adapter caseDslApplication(DslApplication object) {
				return createDslApplicationAdapter();
			}
			@Override
			public Adapter caseDslModule(DslModule object) {
				return createDslModuleAdapter();
			}
			@Override
			public Adapter caseDslService(DslService object) {
				return createDslServiceAdapter();
			}
			@Override
			public Adapter caseDslResource(DslResource object) {
				return createDslResourceAdapter();
			}
			@Override
			public Adapter caseDslConsumer(DslConsumer object) {
				return createDslConsumerAdapter();
			}
			@Override
			public Adapter caseDslSubscribe(DslSubscribe object) {
				return createDslSubscribeAdapter();
			}
			@Override
			public Adapter caseDslPublish(DslPublish object) {
				return createDslPublishAdapter();
			}
			@Override
			public Adapter caseDslEvent(DslEvent object) {
				return createDslEventAdapter();
			}
			@Override
			public Adapter caseDslDomainObjectTypedElement(DslDomainObjectTypedElement object) {
				return createDslDomainObjectTypedElementAdapter();
			}
			@Override
			public Adapter caseDslServiceOperation(DslServiceOperation object) {
				return createDslServiceOperationAdapter();
			}
			@Override
			public Adapter caseDslServiceOperationDelegate(DslServiceOperationDelegate object) {
				return createDslServiceOperationDelegateAdapter();
			}
			@Override
			public Adapter caseDslServiceRepositoryOption(DslServiceRepositoryOption object) {
				return createDslServiceRepositoryOptionAdapter();
			}
			@Override
			public Adapter caseDslServiceRepositoryOperationOption(DslServiceRepositoryOperationOption object) {
				return createDslServiceRepositoryOperationOptionAdapter();
			}
			@Override
			public Adapter caseDslResourceOperation(DslResourceOperation object) {
				return createDslResourceOperationAdapter();
			}
			@Override
			public Adapter caseDslResourceOperationDelegate(DslResourceOperationDelegate object) {
				return createDslResourceOperationDelegateAdapter();
			}
			@Override
			public Adapter caseDslRepositoryOperation(DslRepositoryOperation object) {
				return createDslRepositoryOperationAdapter();
			}
			@Override
			public Adapter caseDslParameter(DslParameter object) {
				return createDslParameterAdapter();
			}
			@Override
			public Adapter caseDslComplexType(DslComplexType object) {
				return createDslComplexTypeAdapter();
			}
			@Override
			public Adapter caseDslSimpleDomainObject(DslSimpleDomainObject object) {
				return createDslSimpleDomainObjectAdapter();
			}
			@Override
			public Adapter caseDslDomainObject(DslDomainObject object) {
				return createDslDomainObjectAdapter();
			}
			@Override
			public Adapter caseDslEntity(DslEntity object) {
				return createDslEntityAdapter();
			}
			@Override
			public Adapter caseDslValueObject(DslValueObject object) {
				return createDslValueObjectAdapter();
			}
			@Override
			public Adapter caseDslDomainEvent(DslDomainEvent object) {
				return createDslDomainEventAdapter();
			}
			@Override
			public Adapter caseDslCommandEvent(DslCommandEvent object) {
				return createDslCommandEventAdapter();
			}
			@Override
			public Adapter caseDslTrait(DslTrait object) {
				return createDslTraitAdapter();
			}
			@Override
			public Adapter caseDslDomainObjectOperation(DslDomainObjectOperation object) {
				return createDslDomainObjectOperationAdapter();
			}
			@Override
			public Adapter caseDslDataTransferObject(DslDataTransferObject object) {
				return createDslDataTransferObjectAdapter();
			}
			@Override
			public Adapter caseDslBasicType(DslBasicType object) {
				return createDslBasicTypeAdapter();
			}
			@Override
			public Adapter caseDslAttribute(DslAttribute object) {
				return createDslAttributeAdapter();
			}
			@Override
			public Adapter caseDslReference(DslReference object) {
				return createDslReferenceAdapter();
			}
			@Override
			public Adapter caseDslDtoAttribute(DslDtoAttribute object) {
				return createDslDtoAttributeAdapter();
			}
			@Override
			public Adapter caseDslDtoReference(DslDtoReference object) {
				return createDslDtoReferenceAdapter();
			}
			@Override
			public Adapter caseDslOppositeHolder(DslOppositeHolder object) {
				return createDslOppositeHolderAdapter();
			}
			@Override
			public Adapter caseDslRepository(DslRepository object) {
				return createDslRepositoryAdapter();
			}
			@Override
			public Adapter caseDslServiceDependency(DslServiceDependency object) {
				return createDslServiceDependencyAdapter();
			}
			@Override
			public Adapter caseDslDependency(DslDependency object) {
				return createDslDependencyAdapter();
			}
			@Override
			public Adapter caseDslEnum(DslEnum object) {
				return createDslEnumAdapter();
			}
			@Override
			public Adapter caseDslEnumAttribute(DslEnumAttribute object) {
				return createDslEnumAttributeAdapter();
			}
			@Override
			public Adapter caseDslEnumValue(DslEnumValue object) {
				return createDslEnumValueAdapter();
			}
			@Override
			public Adapter caseDslEnumParameter(DslEnumParameter object) {
				return createDslEnumParameterAdapter();
			}
			@Override
			public Adapter caseDslAnyProperty(DslAnyProperty object) {
				return createDslAnyPropertyAdapter();
			}
			@Override
			public Adapter caseDslProperty(DslProperty object) {
				return createDslPropertyAdapter();
			}
			@Override
			public Adapter caseDslDtoProperty(DslDtoProperty object) {
				return createDslDtoPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslModel <em>Dsl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslModel
	 * @generated
	 */
	public Adapter createDslModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslImport <em>Dsl Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslImport
	 * @generated
	 */
	public Adapter createDslImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslApplication <em>Dsl Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslApplication
	 * @generated
	 */
	public Adapter createDslApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslModule <em>Dsl Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslModule
	 * @generated
	 */
	public Adapter createDslModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslService <em>Dsl Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslService
	 * @generated
	 */
	public Adapter createDslServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslResource <em>Dsl Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslResource
	 * @generated
	 */
	public Adapter createDslResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslConsumer <em>Dsl Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslConsumer
	 * @generated
	 */
	public Adapter createDslConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslSubscribe <em>Dsl Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslSubscribe
	 * @generated
	 */
	public Adapter createDslSubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslPublish <em>Dsl Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslPublish
	 * @generated
	 */
	public Adapter createDslPublishAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEvent <em>Dsl Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEvent
	 * @generated
	 */
	public Adapter createDslEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDomainObjectTypedElement <em>Dsl Domain Object Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDomainObjectTypedElement
	 * @generated
	 */
	public Adapter createDslDomainObjectTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslServiceOperation <em>Dsl Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslServiceOperation
	 * @generated
	 */
	public Adapter createDslServiceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslServiceOperationDelegate <em>Dsl Service Operation Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslServiceOperationDelegate
	 * @generated
	 */
	public Adapter createDslServiceOperationDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslServiceRepositoryOption <em>Dsl Service Repository Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslServiceRepositoryOption
	 * @generated
	 */
	public Adapter createDslServiceRepositoryOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslServiceRepositoryOperationOption <em>Dsl Service Repository Operation Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslServiceRepositoryOperationOption
	 * @generated
	 */
	public Adapter createDslServiceRepositoryOperationOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslResourceOperation <em>Dsl Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslResourceOperation
	 * @generated
	 */
	public Adapter createDslResourceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslResourceOperationDelegate <em>Dsl Resource Operation Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslResourceOperationDelegate
	 * @generated
	 */
	public Adapter createDslResourceOperationDelegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslRepositoryOperation <em>Dsl Repository Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslRepositoryOperation
	 * @generated
	 */
	public Adapter createDslRepositoryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslParameter <em>Dsl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslParameter
	 * @generated
	 */
	public Adapter createDslParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslComplexType <em>Dsl Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslComplexType
	 * @generated
	 */
	public Adapter createDslComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslSimpleDomainObject <em>Dsl Simple Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslSimpleDomainObject
	 * @generated
	 */
	public Adapter createDslSimpleDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDomainObject <em>Dsl Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDomainObject
	 * @generated
	 */
	public Adapter createDslDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEntity <em>Dsl Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEntity
	 * @generated
	 */
	public Adapter createDslEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslValueObject <em>Dsl Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslValueObject
	 * @generated
	 */
	public Adapter createDslValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDomainEvent <em>Dsl Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDomainEvent
	 * @generated
	 */
	public Adapter createDslDomainEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslCommandEvent <em>Dsl Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslCommandEvent
	 * @generated
	 */
	public Adapter createDslCommandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslTrait <em>Dsl Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslTrait
	 * @generated
	 */
	public Adapter createDslTraitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDomainObjectOperation <em>Dsl Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDomainObjectOperation
	 * @generated
	 */
	public Adapter createDslDomainObjectOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDataTransferObject <em>Dsl Data Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDataTransferObject
	 * @generated
	 */
	public Adapter createDslDataTransferObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslBasicType <em>Dsl Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslBasicType
	 * @generated
	 */
	public Adapter createDslBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslAttribute <em>Dsl Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslAttribute
	 * @generated
	 */
	public Adapter createDslAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslReference <em>Dsl Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslReference
	 * @generated
	 */
	public Adapter createDslReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDtoAttribute <em>Dsl Dto Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDtoAttribute
	 * @generated
	 */
	public Adapter createDslDtoAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDtoReference <em>Dsl Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDtoReference
	 * @generated
	 */
	public Adapter createDslDtoReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslOppositeHolder <em>Dsl Opposite Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslOppositeHolder
	 * @generated
	 */
	public Adapter createDslOppositeHolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslRepository <em>Dsl Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslRepository
	 * @generated
	 */
	public Adapter createDslRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslServiceDependency <em>Dsl Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslServiceDependency
	 * @generated
	 */
	public Adapter createDslServiceDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDependency <em>Dsl Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDependency
	 * @generated
	 */
	public Adapter createDslDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEnum <em>Dsl Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEnum
	 * @generated
	 */
	public Adapter createDslEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEnumAttribute <em>Dsl Enum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEnumAttribute
	 * @generated
	 */
	public Adapter createDslEnumAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEnumValue <em>Dsl Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEnumValue
	 * @generated
	 */
	public Adapter createDslEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslEnumParameter <em>Dsl Enum Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslEnumParameter
	 * @generated
	 */
	public Adapter createDslEnumParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslAnyProperty <em>Dsl Any Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslAnyProperty
	 * @generated
	 */
	public Adapter createDslAnyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslProperty <em>Dsl Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslProperty
	 * @generated
	 */
	public Adapter createDslPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sculptordsl.DslDtoProperty <em>Dsl Dto Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sculptordsl.DslDtoProperty
	 * @generated
	 */
	public Adapter createDslDtoPropertyAdapter() {
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

} //SculptordslAdapterFactory
