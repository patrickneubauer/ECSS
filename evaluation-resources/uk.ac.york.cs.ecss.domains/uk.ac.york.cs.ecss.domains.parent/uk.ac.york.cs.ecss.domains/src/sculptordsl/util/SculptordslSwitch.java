/**
 */
package sculptordsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sculptordsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sculptordsl.SculptordslPackage
 * @generated
 */
public class SculptordslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SculptordslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptordslSwitch() {
		if (modelPackage == null) {
			modelPackage = SculptordslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SculptordslPackage.DSL_MODEL: {
				DslModel dslModel = (DslModel)theEObject;
				T result = caseDslModel(dslModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_IMPORT: {
				DslImport dslImport = (DslImport)theEObject;
				T result = caseDslImport(dslImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_APPLICATION: {
				DslApplication dslApplication = (DslApplication)theEObject;
				T result = caseDslApplication(dslApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_MODULE: {
				DslModule dslModule = (DslModule)theEObject;
				T result = caseDslModule(dslModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE: {
				DslService dslService = (DslService)theEObject;
				T result = caseDslService(dslService);
				if (result == null) result = caseDslServiceRepositoryOption(dslService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_RESOURCE: {
				DslResource dslResource = (DslResource)theEObject;
				T result = caseDslResource(dslResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_CONSUMER: {
				DslConsumer dslConsumer = (DslConsumer)theEObject;
				T result = caseDslConsumer(dslConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SUBSCRIBE: {
				DslSubscribe dslSubscribe = (DslSubscribe)theEObject;
				T result = caseDslSubscribe(dslSubscribe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_PUBLISH: {
				DslPublish dslPublish = (DslPublish)theEObject;
				T result = caseDslPublish(dslPublish);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_EVENT: {
				DslEvent dslEvent = (DslEvent)theEObject;
				T result = caseDslEvent(dslEvent);
				if (result == null) result = caseDslDomainObject(dslEvent);
				if (result == null) result = caseDslSimpleDomainObject(dslEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DOMAIN_OBJECT_TYPED_ELEMENT: {
				DslDomainObjectTypedElement dslDomainObjectTypedElement = (DslDomainObjectTypedElement)theEObject;
				T result = caseDslDomainObjectTypedElement(dslDomainObjectTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE_OPERATION: {
				DslServiceOperation dslServiceOperation = (DslServiceOperation)theEObject;
				T result = caseDslServiceOperation(dslServiceOperation);
				if (result == null) result = caseDslDomainObjectTypedElement(dslServiceOperation);
				if (result == null) result = caseDslServiceRepositoryOperationOption(dslServiceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE: {
				DslServiceOperationDelegate dslServiceOperationDelegate = (DslServiceOperationDelegate)theEObject;
				T result = caseDslServiceOperationDelegate(dslServiceOperationDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION: {
				DslServiceRepositoryOption dslServiceRepositoryOption = (DslServiceRepositoryOption)theEObject;
				T result = caseDslServiceRepositoryOption(dslServiceRepositoryOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPERATION_OPTION: {
				DslServiceRepositoryOperationOption dslServiceRepositoryOperationOption = (DslServiceRepositoryOperationOption)theEObject;
				T result = caseDslServiceRepositoryOperationOption(dslServiceRepositoryOperationOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_RESOURCE_OPERATION: {
				DslResourceOperation dslResourceOperation = (DslResourceOperation)theEObject;
				T result = caseDslResourceOperation(dslResourceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_RESOURCE_OPERATION_DELEGATE: {
				DslResourceOperationDelegate dslResourceOperationDelegate = (DslResourceOperationDelegate)theEObject;
				T result = caseDslResourceOperationDelegate(dslResourceOperationDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_REPOSITORY_OPERATION: {
				DslRepositoryOperation dslRepositoryOperation = (DslRepositoryOperation)theEObject;
				T result = caseDslRepositoryOperation(dslRepositoryOperation);
				if (result == null) result = caseDslDomainObjectTypedElement(dslRepositoryOperation);
				if (result == null) result = caseDslServiceRepositoryOperationOption(dslRepositoryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_PARAMETER: {
				DslParameter dslParameter = (DslParameter)theEObject;
				T result = caseDslParameter(dslParameter);
				if (result == null) result = caseDslDomainObjectTypedElement(dslParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_COMPLEX_TYPE: {
				DslComplexType dslComplexType = (DslComplexType)theEObject;
				T result = caseDslComplexType(dslComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SIMPLE_DOMAIN_OBJECT: {
				DslSimpleDomainObject dslSimpleDomainObject = (DslSimpleDomainObject)theEObject;
				T result = caseDslSimpleDomainObject(dslSimpleDomainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DOMAIN_OBJECT: {
				DslDomainObject dslDomainObject = (DslDomainObject)theEObject;
				T result = caseDslDomainObject(dslDomainObject);
				if (result == null) result = caseDslSimpleDomainObject(dslDomainObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ENTITY: {
				DslEntity dslEntity = (DslEntity)theEObject;
				T result = caseDslEntity(dslEntity);
				if (result == null) result = caseDslDomainObject(dslEntity);
				if (result == null) result = caseDslSimpleDomainObject(dslEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_VALUE_OBJECT: {
				DslValueObject dslValueObject = (DslValueObject)theEObject;
				T result = caseDslValueObject(dslValueObject);
				if (result == null) result = caseDslDomainObject(dslValueObject);
				if (result == null) result = caseDslSimpleDomainObject(dslValueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DOMAIN_EVENT: {
				DslDomainEvent dslDomainEvent = (DslDomainEvent)theEObject;
				T result = caseDslDomainEvent(dslDomainEvent);
				if (result == null) result = caseDslEvent(dslDomainEvent);
				if (result == null) result = caseDslDomainObject(dslDomainEvent);
				if (result == null) result = caseDslSimpleDomainObject(dslDomainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_COMMAND_EVENT: {
				DslCommandEvent dslCommandEvent = (DslCommandEvent)theEObject;
				T result = caseDslCommandEvent(dslCommandEvent);
				if (result == null) result = caseDslEvent(dslCommandEvent);
				if (result == null) result = caseDslDomainObject(dslCommandEvent);
				if (result == null) result = caseDslSimpleDomainObject(dslCommandEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_TRAIT: {
				DslTrait dslTrait = (DslTrait)theEObject;
				T result = caseDslTrait(dslTrait);
				if (result == null) result = caseDslSimpleDomainObject(dslTrait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DOMAIN_OBJECT_OPERATION: {
				DslDomainObjectOperation dslDomainObjectOperation = (DslDomainObjectOperation)theEObject;
				T result = caseDslDomainObjectOperation(dslDomainObjectOperation);
				if (result == null) result = caseDslDomainObjectTypedElement(dslDomainObjectOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT: {
				DslDataTransferObject dslDataTransferObject = (DslDataTransferObject)theEObject;
				T result = caseDslDataTransferObject(dslDataTransferObject);
				if (result == null) result = caseDslSimpleDomainObject(dslDataTransferObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_BASIC_TYPE: {
				DslBasicType dslBasicType = (DslBasicType)theEObject;
				T result = caseDslBasicType(dslBasicType);
				if (result == null) result = caseDslSimpleDomainObject(dslBasicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ATTRIBUTE: {
				DslAttribute dslAttribute = (DslAttribute)theEObject;
				T result = caseDslAttribute(dslAttribute);
				if (result == null) result = caseDslProperty(dslAttribute);
				if (result == null) result = caseDslAnyProperty(dslAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_REFERENCE: {
				DslReference dslReference = (DslReference)theEObject;
				T result = caseDslReference(dslReference);
				if (result == null) result = caseDslProperty(dslReference);
				if (result == null) result = caseDslAnyProperty(dslReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DTO_ATTRIBUTE: {
				DslDtoAttribute dslDtoAttribute = (DslDtoAttribute)theEObject;
				T result = caseDslDtoAttribute(dslDtoAttribute);
				if (result == null) result = caseDslDtoProperty(dslDtoAttribute);
				if (result == null) result = caseDslAnyProperty(dslDtoAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DTO_REFERENCE: {
				DslDtoReference dslDtoReference = (DslDtoReference)theEObject;
				T result = caseDslDtoReference(dslDtoReference);
				if (result == null) result = caseDslDtoProperty(dslDtoReference);
				if (result == null) result = caseDslAnyProperty(dslDtoReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_OPPOSITE_HOLDER: {
				DslOppositeHolder dslOppositeHolder = (DslOppositeHolder)theEObject;
				T result = caseDslOppositeHolder(dslOppositeHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_REPOSITORY: {
				DslRepository dslRepository = (DslRepository)theEObject;
				T result = caseDslRepository(dslRepository);
				if (result == null) result = caseDslServiceRepositoryOption(dslRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_SERVICE_DEPENDENCY: {
				DslServiceDependency dslServiceDependency = (DslServiceDependency)theEObject;
				T result = caseDslServiceDependency(dslServiceDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DEPENDENCY: {
				DslDependency dslDependency = (DslDependency)theEObject;
				T result = caseDslDependency(dslDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ENUM: {
				DslEnum dslEnum = (DslEnum)theEObject;
				T result = caseDslEnum(dslEnum);
				if (result == null) result = caseDslSimpleDomainObject(dslEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ENUM_ATTRIBUTE: {
				DslEnumAttribute dslEnumAttribute = (DslEnumAttribute)theEObject;
				T result = caseDslEnumAttribute(dslEnumAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ENUM_VALUE: {
				DslEnumValue dslEnumValue = (DslEnumValue)theEObject;
				T result = caseDslEnumValue(dslEnumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ENUM_PARAMETER: {
				DslEnumParameter dslEnumParameter = (DslEnumParameter)theEObject;
				T result = caseDslEnumParameter(dslEnumParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_ANY_PROPERTY: {
				DslAnyProperty dslAnyProperty = (DslAnyProperty)theEObject;
				T result = caseDslAnyProperty(dslAnyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_PROPERTY: {
				DslProperty dslProperty = (DslProperty)theEObject;
				T result = caseDslProperty(dslProperty);
				if (result == null) result = caseDslAnyProperty(dslProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SculptordslPackage.DSL_DTO_PROPERTY: {
				DslDtoProperty dslDtoProperty = (DslDtoProperty)theEObject;
				T result = caseDslDtoProperty(dslDtoProperty);
				if (result == null) result = caseDslAnyProperty(dslDtoProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslModel(DslModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslImport(DslImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslApplication(DslApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslModule(DslModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslService(DslService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslResource(DslResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslConsumer(DslConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Subscribe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslSubscribe(DslSubscribe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Publish</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Publish</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslPublish(DslPublish object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEvent(DslEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Domain Object Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Domain Object Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDomainObjectTypedElement(DslDomainObjectTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslServiceOperation(DslServiceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service Operation Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service Operation Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslServiceOperationDelegate(DslServiceOperationDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service Repository Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service Repository Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslServiceRepositoryOption(DslServiceRepositoryOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service Repository Operation Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service Repository Operation Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslServiceRepositoryOperationOption(DslServiceRepositoryOperationOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Resource Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Resource Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslResourceOperation(DslResourceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Resource Operation Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Resource Operation Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslResourceOperationDelegate(DslResourceOperationDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Repository Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Repository Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslRepositoryOperation(DslRepositoryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslParameter(DslParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslComplexType(DslComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Simple Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Simple Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslSimpleDomainObject(DslSimpleDomainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Domain Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Domain Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDomainObject(DslDomainObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEntity(DslEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslValueObject(DslValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Domain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDomainEvent(DslDomainEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Command Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Command Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslCommandEvent(DslCommandEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Trait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Trait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslTrait(DslTrait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Domain Object Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Domain Object Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDomainObjectOperation(DslDomainObjectOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Data Transfer Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Data Transfer Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDataTransferObject(DslDataTransferObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Basic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Basic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslBasicType(DslBasicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslAttribute(DslAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslReference(DslReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Dto Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Dto Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDtoAttribute(DslDtoAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Dto Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDtoReference(DslDtoReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Opposite Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Opposite Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslOppositeHolder(DslOppositeHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslRepository(DslRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Service Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslServiceDependency(DslServiceDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDependency(DslDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEnum(DslEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Enum Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Enum Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEnumAttribute(DslEnumAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEnumValue(DslEnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Enum Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Enum Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslEnumParameter(DslEnumParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Any Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Any Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslAnyProperty(DslAnyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslProperty(DslProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dsl Dto Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dsl Dto Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDslDtoProperty(DslDtoProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SculptordslSwitch
