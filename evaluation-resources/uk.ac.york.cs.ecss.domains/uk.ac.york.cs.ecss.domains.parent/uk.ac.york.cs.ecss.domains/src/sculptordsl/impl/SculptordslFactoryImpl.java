/**
 */
package sculptordsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sculptordsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptordslFactoryImpl extends EFactoryImpl implements SculptordslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SculptordslFactory init() {
		try {
			SculptordslFactory theSculptordslFactory = (SculptordslFactory)EPackage.Registry.INSTANCE.getEFactory(SculptordslPackage.eNS_URI);
			if (theSculptordslFactory != null) {
				return theSculptordslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SculptordslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptordslFactoryImpl() {
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
			case SculptordslPackage.DSL_MODEL: return createDslModel();
			case SculptordslPackage.DSL_IMPORT: return createDslImport();
			case SculptordslPackage.DSL_APPLICATION: return createDslApplication();
			case SculptordslPackage.DSL_MODULE: return createDslModule();
			case SculptordslPackage.DSL_SERVICE: return createDslService();
			case SculptordslPackage.DSL_RESOURCE: return createDslResource();
			case SculptordslPackage.DSL_CONSUMER: return createDslConsumer();
			case SculptordslPackage.DSL_SUBSCRIBE: return createDslSubscribe();
			case SculptordslPackage.DSL_PUBLISH: return createDslPublish();
			case SculptordslPackage.DSL_EVENT: return createDslEvent();
			case SculptordslPackage.DSL_DOMAIN_OBJECT_TYPED_ELEMENT: return createDslDomainObjectTypedElement();
			case SculptordslPackage.DSL_SERVICE_OPERATION: return createDslServiceOperation();
			case SculptordslPackage.DSL_SERVICE_OPERATION_DELEGATE: return createDslServiceOperationDelegate();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPTION: return createDslServiceRepositoryOption();
			case SculptordslPackage.DSL_SERVICE_REPOSITORY_OPERATION_OPTION: return createDslServiceRepositoryOperationOption();
			case SculptordslPackage.DSL_RESOURCE_OPERATION: return createDslResourceOperation();
			case SculptordslPackage.DSL_RESOURCE_OPERATION_DELEGATE: return createDslResourceOperationDelegate();
			case SculptordslPackage.DSL_REPOSITORY_OPERATION: return createDslRepositoryOperation();
			case SculptordslPackage.DSL_PARAMETER: return createDslParameter();
			case SculptordslPackage.DSL_COMPLEX_TYPE: return createDslComplexType();
			case SculptordslPackage.DSL_SIMPLE_DOMAIN_OBJECT: return createDslSimpleDomainObject();
			case SculptordslPackage.DSL_DOMAIN_OBJECT: return createDslDomainObject();
			case SculptordslPackage.DSL_ENTITY: return createDslEntity();
			case SculptordslPackage.DSL_VALUE_OBJECT: return createDslValueObject();
			case SculptordslPackage.DSL_DOMAIN_EVENT: return createDslDomainEvent();
			case SculptordslPackage.DSL_COMMAND_EVENT: return createDslCommandEvent();
			case SculptordslPackage.DSL_TRAIT: return createDslTrait();
			case SculptordslPackage.DSL_DOMAIN_OBJECT_OPERATION: return createDslDomainObjectOperation();
			case SculptordslPackage.DSL_DATA_TRANSFER_OBJECT: return createDslDataTransferObject();
			case SculptordslPackage.DSL_BASIC_TYPE: return createDslBasicType();
			case SculptordslPackage.DSL_ATTRIBUTE: return createDslAttribute();
			case SculptordslPackage.DSL_REFERENCE: return createDslReference();
			case SculptordslPackage.DSL_DTO_ATTRIBUTE: return createDslDtoAttribute();
			case SculptordslPackage.DSL_DTO_REFERENCE: return createDslDtoReference();
			case SculptordslPackage.DSL_OPPOSITE_HOLDER: return createDslOppositeHolder();
			case SculptordslPackage.DSL_REPOSITORY: return createDslRepository();
			case SculptordslPackage.DSL_SERVICE_DEPENDENCY: return createDslServiceDependency();
			case SculptordslPackage.DSL_DEPENDENCY: return createDslDependency();
			case SculptordslPackage.DSL_ENUM: return createDslEnum();
			case SculptordslPackage.DSL_ENUM_ATTRIBUTE: return createDslEnumAttribute();
			case SculptordslPackage.DSL_ENUM_VALUE: return createDslEnumValue();
			case SculptordslPackage.DSL_ENUM_PARAMETER: return createDslEnumParameter();
			case SculptordslPackage.DSL_ANY_PROPERTY: return createDslAnyProperty();
			case SculptordslPackage.DSL_PROPERTY: return createDslProperty();
			case SculptordslPackage.DSL_DTO_PROPERTY: return createDslDtoProperty();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SculptordslPackage.DSL_HTTP_METHOD:
				return createDslHttpMethodFromString(eDataType, initialValue);
			case SculptordslPackage.DSL_INHERITANCE_TYPE:
				return createDslInheritanceTypeFromString(eDataType, initialValue);
			case SculptordslPackage.DSL_DISCRIMINATOR_TYPE:
				return createDslDiscriminatorTypeFromString(eDataType, initialValue);
			case SculptordslPackage.DSL_COLLECTION_TYPE:
				return createDslCollectionTypeFromString(eDataType, initialValue);
			case SculptordslPackage.DSL_VISIBILITY:
				return createDslVisibilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SculptordslPackage.DSL_HTTP_METHOD:
				return convertDslHttpMethodToString(eDataType, instanceValue);
			case SculptordslPackage.DSL_INHERITANCE_TYPE:
				return convertDslInheritanceTypeToString(eDataType, instanceValue);
			case SculptordslPackage.DSL_DISCRIMINATOR_TYPE:
				return convertDslDiscriminatorTypeToString(eDataType, instanceValue);
			case SculptordslPackage.DSL_COLLECTION_TYPE:
				return convertDslCollectionTypeToString(eDataType, instanceValue);
			case SculptordslPackage.DSL_VISIBILITY:
				return convertDslVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslModel createDslModel() {
		DslModelImpl dslModel = new DslModelImpl();
		return dslModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslImport createDslImport() {
		DslImportImpl dslImport = new DslImportImpl();
		return dslImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslApplication createDslApplication() {
		DslApplicationImpl dslApplication = new DslApplicationImpl();
		return dslApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslModule createDslModule() {
		DslModuleImpl dslModule = new DslModuleImpl();
		return dslModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslService createDslService() {
		DslServiceImpl dslService = new DslServiceImpl();
		return dslService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslResource createDslResource() {
		DslResourceImpl dslResource = new DslResourceImpl();
		return dslResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslConsumer createDslConsumer() {
		DslConsumerImpl dslConsumer = new DslConsumerImpl();
		return dslConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSubscribe createDslSubscribe() {
		DslSubscribeImpl dslSubscribe = new DslSubscribeImpl();
		return dslSubscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslPublish createDslPublish() {
		DslPublishImpl dslPublish = new DslPublishImpl();
		return dslPublish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEvent createDslEvent() {
		DslEventImpl dslEvent = new DslEventImpl();
		return dslEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainObjectTypedElement createDslDomainObjectTypedElement() {
		DslDomainObjectTypedElementImpl dslDomainObjectTypedElement = new DslDomainObjectTypedElementImpl();
		return dslDomainObjectTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceOperation createDslServiceOperation() {
		DslServiceOperationImpl dslServiceOperation = new DslServiceOperationImpl();
		return dslServiceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceOperationDelegate createDslServiceOperationDelegate() {
		DslServiceOperationDelegateImpl dslServiceOperationDelegate = new DslServiceOperationDelegateImpl();
		return dslServiceOperationDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceRepositoryOption createDslServiceRepositoryOption() {
		DslServiceRepositoryOptionImpl dslServiceRepositoryOption = new DslServiceRepositoryOptionImpl();
		return dslServiceRepositoryOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceRepositoryOperationOption createDslServiceRepositoryOperationOption() {
		DslServiceRepositoryOperationOptionImpl dslServiceRepositoryOperationOption = new DslServiceRepositoryOperationOptionImpl();
		return dslServiceRepositoryOperationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslResourceOperation createDslResourceOperation() {
		DslResourceOperationImpl dslResourceOperation = new DslResourceOperationImpl();
		return dslResourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslResourceOperationDelegate createDslResourceOperationDelegate() {
		DslResourceOperationDelegateImpl dslResourceOperationDelegate = new DslResourceOperationDelegateImpl();
		return dslResourceOperationDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslRepositoryOperation createDslRepositoryOperation() {
		DslRepositoryOperationImpl dslRepositoryOperation = new DslRepositoryOperationImpl();
		return dslRepositoryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslParameter createDslParameter() {
		DslParameterImpl dslParameter = new DslParameterImpl();
		return dslParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslComplexType createDslComplexType() {
		DslComplexTypeImpl dslComplexType = new DslComplexTypeImpl();
		return dslComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslSimpleDomainObject createDslSimpleDomainObject() {
		DslSimpleDomainObjectImpl dslSimpleDomainObject = new DslSimpleDomainObjectImpl();
		return dslSimpleDomainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainObject createDslDomainObject() {
		DslDomainObjectImpl dslDomainObject = new DslDomainObjectImpl();
		return dslDomainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEntity createDslEntity() {
		DslEntityImpl dslEntity = new DslEntityImpl();
		return dslEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslValueObject createDslValueObject() {
		DslValueObjectImpl dslValueObject = new DslValueObjectImpl();
		return dslValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainEvent createDslDomainEvent() {
		DslDomainEventImpl dslDomainEvent = new DslDomainEventImpl();
		return dslDomainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslCommandEvent createDslCommandEvent() {
		DslCommandEventImpl dslCommandEvent = new DslCommandEventImpl();
		return dslCommandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslTrait createDslTrait() {
		DslTraitImpl dslTrait = new DslTraitImpl();
		return dslTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDomainObjectOperation createDslDomainObjectOperation() {
		DslDomainObjectOperationImpl dslDomainObjectOperation = new DslDomainObjectOperationImpl();
		return dslDomainObjectOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDataTransferObject createDslDataTransferObject() {
		DslDataTransferObjectImpl dslDataTransferObject = new DslDataTransferObjectImpl();
		return dslDataTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslBasicType createDslBasicType() {
		DslBasicTypeImpl dslBasicType = new DslBasicTypeImpl();
		return dslBasicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslAttribute createDslAttribute() {
		DslAttributeImpl dslAttribute = new DslAttributeImpl();
		return dslAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslReference createDslReference() {
		DslReferenceImpl dslReference = new DslReferenceImpl();
		return dslReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDtoAttribute createDslDtoAttribute() {
		DslDtoAttributeImpl dslDtoAttribute = new DslDtoAttributeImpl();
		return dslDtoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDtoReference createDslDtoReference() {
		DslDtoReferenceImpl dslDtoReference = new DslDtoReferenceImpl();
		return dslDtoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslOppositeHolder createDslOppositeHolder() {
		DslOppositeHolderImpl dslOppositeHolder = new DslOppositeHolderImpl();
		return dslOppositeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslRepository createDslRepository() {
		DslRepositoryImpl dslRepository = new DslRepositoryImpl();
		return dslRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslServiceDependency createDslServiceDependency() {
		DslServiceDependencyImpl dslServiceDependency = new DslServiceDependencyImpl();
		return dslServiceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDependency createDslDependency() {
		DslDependencyImpl dslDependency = new DslDependencyImpl();
		return dslDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEnum createDslEnum() {
		DslEnumImpl dslEnum = new DslEnumImpl();
		return dslEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEnumAttribute createDslEnumAttribute() {
		DslEnumAttributeImpl dslEnumAttribute = new DslEnumAttributeImpl();
		return dslEnumAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEnumValue createDslEnumValue() {
		DslEnumValueImpl dslEnumValue = new DslEnumValueImpl();
		return dslEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslEnumParameter createDslEnumParameter() {
		DslEnumParameterImpl dslEnumParameter = new DslEnumParameterImpl();
		return dslEnumParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslAnyProperty createDslAnyProperty() {
		DslAnyPropertyImpl dslAnyProperty = new DslAnyPropertyImpl();
		return dslAnyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslProperty createDslProperty() {
		DslPropertyImpl dslProperty = new DslPropertyImpl();
		return dslProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslDtoProperty createDslDtoProperty() {
		DslDtoPropertyImpl dslDtoProperty = new DslDtoPropertyImpl();
		return dslDtoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslHttpMethod createDslHttpMethodFromString(EDataType eDataType, String initialValue) {
		DslHttpMethod result = DslHttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDslHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslInheritanceType createDslInheritanceTypeFromString(EDataType eDataType, String initialValue) {
		DslInheritanceType result = DslInheritanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDslInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslDiscriminatorType createDslDiscriminatorTypeFromString(EDataType eDataType, String initialValue) {
		DslDiscriminatorType result = DslDiscriminatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDslDiscriminatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslCollectionType createDslCollectionTypeFromString(EDataType eDataType, String initialValue) {
		DslCollectionType result = DslCollectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDslCollectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslVisibility createDslVisibilityFromString(EDataType eDataType, String initialValue) {
		DslVisibility result = DslVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDslVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptordslPackage getSculptordslPackage() {
		return (SculptordslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SculptordslPackage getPackage() {
		return SculptordslPackage.eINSTANCE;
	}

} //SculptordslFactoryImpl
