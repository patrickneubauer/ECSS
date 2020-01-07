/**
 */
package sculptordsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sculptordsl.DslAnyProperty;
import sculptordsl.DslApplication;
import sculptordsl.DslAttribute;
import sculptordsl.DslBasicType;
import sculptordsl.DslCollectionType;
import sculptordsl.DslCommandEvent;
import sculptordsl.DslComplexType;
import sculptordsl.DslConsumer;
import sculptordsl.DslDataTransferObject;
import sculptordsl.DslDependency;
import sculptordsl.DslDiscriminatorType;
import sculptordsl.DslDomainEvent;
import sculptordsl.DslDomainObject;
import sculptordsl.DslDomainObjectOperation;
import sculptordsl.DslDomainObjectTypedElement;
import sculptordsl.DslDtoAttribute;
import sculptordsl.DslDtoProperty;
import sculptordsl.DslDtoReference;
import sculptordsl.DslEntity;
import sculptordsl.DslEnum;
import sculptordsl.DslEnumAttribute;
import sculptordsl.DslEnumParameter;
import sculptordsl.DslEnumValue;
import sculptordsl.DslEvent;
import sculptordsl.DslHttpMethod;
import sculptordsl.DslImport;
import sculptordsl.DslInheritanceType;
import sculptordsl.DslModel;
import sculptordsl.DslModule;
import sculptordsl.DslOppositeHolder;
import sculptordsl.DslParameter;
import sculptordsl.DslProperty;
import sculptordsl.DslPublish;
import sculptordsl.DslReference;
import sculptordsl.DslRepository;
import sculptordsl.DslRepositoryOperation;
import sculptordsl.DslResource;
import sculptordsl.DslResourceOperation;
import sculptordsl.DslResourceOperationDelegate;
import sculptordsl.DslService;
import sculptordsl.DslServiceDependency;
import sculptordsl.DslServiceOperation;
import sculptordsl.DslServiceOperationDelegate;
import sculptordsl.DslServiceRepositoryOperationOption;
import sculptordsl.DslServiceRepositoryOption;
import sculptordsl.DslSimpleDomainObject;
import sculptordsl.DslSubscribe;
import sculptordsl.DslTrait;
import sculptordsl.DslValueObject;
import sculptordsl.DslVisibility;
import sculptordsl.SculptordslFactory;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptordslPackageImpl extends EPackageImpl implements SculptordslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslSubscribeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslPublishEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDomainObjectTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceOperationDelegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceRepositoryOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceRepositoryOperationOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslResourceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslResourceOperationDelegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslRepositoryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslSimpleDomainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDomainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslValueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDomainEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslCommandEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslTraitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDomainObjectOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDataTransferObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslBasicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDtoAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDtoReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslOppositeHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslServiceDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEnumAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEnumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslEnumParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslAnyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslDtoPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dslHttpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dslInheritanceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dslDiscriminatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dslCollectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dslVisibilityEEnum = null;

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
	 * @see sculptordsl.SculptordslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SculptordslPackageImpl() {
		super(eNS_URI, SculptordslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SculptordslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SculptordslPackage init() {
		if (isInited) return (SculptordslPackage)EPackage.Registry.INSTANCE.getEPackage(SculptordslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSculptordslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SculptordslPackageImpl theSculptordslPackage = registeredSculptordslPackage instanceof SculptordslPackageImpl ? (SculptordslPackageImpl)registeredSculptordslPackage : new SculptordslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSculptordslPackage.createPackageContents();

		// Initialize created meta-data
		theSculptordslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSculptordslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SculptordslPackage.eNS_URI, theSculptordslPackage);
		return theSculptordslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslModel() {
		return dslModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModel_Imports() {
		return (EReference)dslModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModel_App() {
		return (EReference)dslModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslImport() {
		return dslImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslImport_ImportURI() {
		return (EAttribute)dslImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslApplication() {
		return dslApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslApplication_Doc() {
		return (EAttribute)dslApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslApplication_Name() {
		return (EAttribute)dslApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslApplication_BasePackage() {
		return (EAttribute)dslApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslApplication_Modules() {
		return (EReference)dslApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslModule() {
		return dslModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslModule_Doc() {
		return (EAttribute)dslModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslModule_Name() {
		return (EAttribute)dslModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslModule_External() {
		return (EAttribute)dslModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslModule_BasePackage() {
		return (EAttribute)dslModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslModule_Hint() {
		return (EAttribute)dslModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModule_Services() {
		return (EReference)dslModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModule_Resources() {
		return (EReference)dslModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModule_Consumers() {
		return (EReference)dslModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslModule_DomainObjects() {
		return (EReference)dslModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslService() {
		return dslServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslService_WebService() {
		return (EAttribute)dslServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslService_Operations() {
		return (EReference)dslServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslResource() {
		return dslResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_Doc() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_Name() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_GapClass() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_NoGapClass() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_Hint() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_Scaffold() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResource_Path() {
		return (EAttribute)dslResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResource_Dependencies() {
		return (EReference)dslResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResource_Operations() {
		return (EReference)dslResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslConsumer() {
		return dslConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslConsumer_Doc() {
		return (EAttribute)dslConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslConsumer_Name() {
		return (EAttribute)dslConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslConsumer_Hint() {
		return (EAttribute)dslConsumerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslConsumer_Dependencies() {
		return (EReference)dslConsumerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslConsumer_MessageRoot() {
		return (EReference)dslConsumerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslConsumer_Channel() {
		return (EAttribute)dslConsumerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslConsumer_Subscribe() {
		return (EReference)dslConsumerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslSubscribe() {
		return dslSubscribeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSubscribe_Topic() {
		return (EAttribute)dslSubscribeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSubscribe_EventBus() {
		return (EAttribute)dslSubscribeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslPublish() {
		return dslPublishEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslPublish_EventType() {
		return (EReference)dslPublishEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslPublish_Topic() {
		return (EAttribute)dslPublishEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslPublish_EventBus() {
		return (EAttribute)dslPublishEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEvent() {
		return dslEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEvent_Persistent() {
		return (EAttribute)dslEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDomainObjectTypedElement() {
		return dslDomainObjectTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslServiceOperation() {
		return dslServiceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceOperation_Doc() {
		return (EAttribute)dslServiceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceOperation_Visibility() {
		return (EAttribute)dslServiceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperation_ReturnType() {
		return (EReference)dslServiceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceOperation_Name() {
		return (EAttribute)dslServiceOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperation_Parameters() {
		return (EReference)dslServiceOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceOperation_Throws() {
		return (EAttribute)dslServiceOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceOperation_Hint() {
		return (EAttribute)dslServiceOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperation_Publish() {
		return (EReference)dslServiceOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperation_DelegateHolder() {
		return (EReference)dslServiceOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslServiceOperationDelegate() {
		return dslServiceOperationDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperationDelegate_Delegate() {
		return (EReference)dslServiceOperationDelegateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceOperationDelegate_DelegateOperation() {
		return (EReference)dslServiceOperationDelegateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslServiceRepositoryOption() {
		return dslServiceRepositoryOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceRepositoryOption_Doc() {
		return (EAttribute)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceRepositoryOption_Name() {
		return (EAttribute)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceRepositoryOption_GapClass() {
		return (EAttribute)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceRepositoryOption_NoGapClass() {
		return (EAttribute)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslServiceRepositoryOption_Hint() {
		return (EAttribute)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceRepositoryOption_Subscribe() {
		return (EReference)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceRepositoryOption_Dependencies() {
		return (EReference)dslServiceRepositoryOptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslServiceRepositoryOperationOption() {
		return dslServiceRepositoryOperationOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslResourceOperation() {
		return dslResourceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Doc() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Visibility() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResourceOperation_ReturnType() {
		return (EReference)dslResourceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Name() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResourceOperation_Parameters() {
		return (EReference)dslResourceOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Throws() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Hint() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_HttpMethod() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_Path() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslResourceOperation_ReturnString() {
		return (EAttribute)dslResourceOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResourceOperation_DelegateHolder() {
		return (EReference)dslResourceOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslResourceOperationDelegate() {
		return dslResourceOperationDelegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResourceOperationDelegate_Delegate() {
		return (EReference)dslResourceOperationDelegateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslResourceOperationDelegate_DelegateOperation() {
		return (EReference)dslResourceOperationDelegateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslRepositoryOperation() {
		return dslRepositoryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Doc() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Visibility() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslRepositoryOperation_ReturnType() {
		return (EReference)dslRepositoryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Name() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslRepositoryOperation_Parameters() {
		return (EReference)dslRepositoryOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Throws() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Hint() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Cache() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_GapOperation() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_NoGapOperation() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Query() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Condition() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Select() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_GroupBy() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_OrderBy() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Construct() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Build() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_Map() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslRepositoryOperation_Publish() {
		return (EReference)dslRepositoryOperationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_DelegateToAccessObject() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslRepositoryOperation_AccessObjectName() {
		return (EAttribute)dslRepositoryOperationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslParameter() {
		return dslParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslParameter_Doc() {
		return (EAttribute)dslParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslParameter_ParameterType() {
		return (EReference)dslParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslParameter_Name() {
		return (EAttribute)dslParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslComplexType() {
		return dslComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslComplexType_CollectionType() {
		return (EAttribute)dslComplexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslComplexType_DomainObjectType() {
		return (EReference)dslComplexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslComplexType_Type() {
		return (EAttribute)dslComplexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslComplexType_MapCollectionType() {
		return (EAttribute)dslComplexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslComplexType_MapKeyType() {
		return (EAttribute)dslComplexTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslComplexType_MapKeyDomainObjectType() {
		return (EReference)dslComplexTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslSimpleDomainObject() {
		return dslSimpleDomainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSimpleDomainObject_Doc() {
		return (EAttribute)dslSimpleDomainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSimpleDomainObject_Name() {
		return (EAttribute)dslSimpleDomainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSimpleDomainObject_Package() {
		return (EAttribute)dslSimpleDomainObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslSimpleDomainObject_Hint() {
		return (EAttribute)dslSimpleDomainObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDomainObject() {
		return dslDomainObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_Abstract() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_ExtendsName() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_Traits() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_Cache() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_GapClass() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_NoGapClass() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_Scaffold() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_DatabaseTable() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_DiscriminatorValue() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_DiscriminatorColumn() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_DiscriminatorType() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_DiscriminatorLength() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_InheritanceType() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_Validate() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObject_NotAggregateRoot() {
		return (EAttribute)dslDomainObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_BelongsTo() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_Attributes() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_References() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_Operations() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObject_Repository() {
		return (EReference)dslDomainObjectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEntity() {
		return dslEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslEntity_Extends() {
		return (EReference)dslEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEntity_NotOptimisticLocking() {
		return (EAttribute)dslEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEntity_NotAuditable() {
		return (EAttribute)dslEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslValueObject() {
		return dslValueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslValueObject_Extends() {
		return (EReference)dslValueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslValueObject_NotOptimisticLocking() {
		return (EAttribute)dslValueObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslValueObject_NotImmutable() {
		return (EAttribute)dslValueObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslValueObject_Persistent() {
		return (EAttribute)dslValueObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslValueObject_NotPersistent() {
		return (EAttribute)dslValueObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDomainEvent() {
		return dslDomainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainEvent_Extends() {
		return (EReference)dslDomainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslCommandEvent() {
		return dslCommandEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslCommandEvent_Extends() {
		return (EReference)dslCommandEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslTrait() {
		return dslTraitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslTrait_Attributes() {
		return (EReference)dslTraitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslTrait_References() {
		return (EReference)dslTraitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslTrait_Operations() {
		return (EReference)dslTraitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDomainObjectOperation() {
		return dslDomainObjectOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Doc() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Abstract() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Visibility() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObjectOperation_ReturnType() {
		return (EReference)dslDomainObjectOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Name() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDomainObjectOperation_Parameters() {
		return (EReference)dslDomainObjectOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Throws() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDomainObjectOperation_Hint() {
		return (EAttribute)dslDomainObjectOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDataTransferObject() {
		return dslDataTransferObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDataTransferObject_Abstract() {
		return (EAttribute)dslDataTransferObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDataTransferObject_Extends() {
		return (EReference)dslDataTransferObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDataTransferObject_ExtendsName() {
		return (EAttribute)dslDataTransferObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDataTransferObject_GapClass() {
		return (EAttribute)dslDataTransferObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDataTransferObject_NoGapClass() {
		return (EAttribute)dslDataTransferObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDataTransferObject_Validate() {
		return (EAttribute)dslDataTransferObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDataTransferObject_Attributes() {
		return (EReference)dslDataTransferObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDataTransferObject_References() {
		return (EReference)dslDataTransferObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslBasicType() {
		return dslBasicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslBasicType_Traits() {
		return (EReference)dslBasicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslBasicType_NotImmutable() {
		return (EAttribute)dslBasicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslBasicType_GapClass() {
		return (EAttribute)dslBasicTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslBasicType_NoGapClass() {
		return (EAttribute)dslBasicTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslBasicType_Attributes() {
		return (EReference)dslBasicTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslBasicType_References() {
		return (EReference)dslBasicTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslBasicType_Operations() {
		return (EReference)dslBasicTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslAttribute() {
		return dslAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Type() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Index() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_AssertFalse() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_AssertFalseMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_AssertTrue() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_AssertTrueMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_CreditCardNumber() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_CreditCardNumberMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Digits() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Email() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_EmailMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Future() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_FutureMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Past() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_PastMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Max() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Min() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_DecimalMax() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_DecimalMin() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_NotBlank() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_NotBlankMessage() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Pattern() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Range() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Length() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_ScriptAssert() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_Url() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAttribute_DatabaseType() {
		return (EAttribute)dslAttributeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslReference() {
		return dslReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslReference_DomainObjectType() {
		return (EReference)dslReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_Cascade() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_Fetch() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_Cache() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_Inverse() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_DatabaseJoinTable() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_DatabaseJoinColumn() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_Valid() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_ValidMessage() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_OrderBy() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_OrderColumn() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslReference_OrderColumnName() {
		return (EAttribute)dslReferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslReference_OppositeHolder() {
		return (EReference)dslReferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDtoAttribute() {
		return dslDtoAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Type() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_AssertFalse() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_AssertFalseMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_AssertTrue() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_AssertTrueMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_CreditCardNumber() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_CreditCardNumberMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Digits() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Email() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_EmailMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Future() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_FutureMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Past() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_PastMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Max() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Min() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_DecimalMax() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_DecimalMin() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_NotBlank() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_NotBlankMessage() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Pattern() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Range() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Length() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_ScriptAssert() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoAttribute_Url() {
		return (EAttribute)dslDtoAttributeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDtoReference() {
		return dslDtoReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDtoReference_DomainObjectType() {
		return (EReference)dslDtoReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoReference_Valid() {
		return (EAttribute)dslDtoReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDtoReference_ValidMessage() {
		return (EAttribute)dslDtoReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslOppositeHolder() {
		return dslOppositeHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslOppositeHolder_Opposite() {
		return (EReference)dslOppositeHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslRepository() {
		return dslRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslRepository_Operations() {
		return (EReference)dslRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslServiceDependency() {
		return dslServiceDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslServiceDependency_Dependency() {
		return (EReference)dslServiceDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDependency() {
		return dslDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslDependency_Dependency() {
		return (EReference)dslDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslDependency_Name() {
		return (EAttribute)dslDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEnum() {
		return dslEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnum_Ordinal() {
		return (EAttribute)dslEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslEnum_Attributes() {
		return (EReference)dslEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslEnum_Values() {
		return (EReference)dslEnumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEnumAttribute() {
		return dslEnumAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumAttribute_Doc() {
		return (EAttribute)dslEnumAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumAttribute_Type() {
		return (EAttribute)dslEnumAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumAttribute_Name() {
		return (EAttribute)dslEnumAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumAttribute_Key() {
		return (EAttribute)dslEnumAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEnumValue() {
		return dslEnumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumValue_Doc() {
		return (EAttribute)dslEnumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumValue_Name() {
		return (EAttribute)dslEnumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDslEnumValue_Parameters() {
		return (EReference)dslEnumValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslEnumParameter() {
		return dslEnumParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumParameter_Value() {
		return (EAttribute)dslEnumParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslEnumParameter_IntegerValue() {
		return (EAttribute)dslEnumParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslAnyProperty() {
		return dslAnyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Doc() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Visibility() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_CollectionType() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Name() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Key() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_NotChangeable() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Required() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Nullable() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_NullableMessage() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Hint() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_NotEmpty() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_NotEmptyMessage() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Size() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Validate() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslAnyProperty_Transient() {
		return (EAttribute)dslAnyPropertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslProperty() {
		return dslPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDslProperty_DatabaseColumn() {
		return (EAttribute)dslPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDslDtoProperty() {
		return dslDtoPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDslHttpMethod() {
		return dslHttpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDslInheritanceType() {
		return dslInheritanceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDslDiscriminatorType() {
		return dslDiscriminatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDslCollectionType() {
		return dslCollectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDslVisibility() {
		return dslVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptordslFactory getSculptordslFactory() {
		return (SculptordslFactory)getEFactoryInstance();
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
		dslModelEClass = createEClass(DSL_MODEL);
		createEReference(dslModelEClass, DSL_MODEL__IMPORTS);
		createEReference(dslModelEClass, DSL_MODEL__APP);

		dslImportEClass = createEClass(DSL_IMPORT);
		createEAttribute(dslImportEClass, DSL_IMPORT__IMPORT_URI);

		dslApplicationEClass = createEClass(DSL_APPLICATION);
		createEAttribute(dslApplicationEClass, DSL_APPLICATION__DOC);
		createEAttribute(dslApplicationEClass, DSL_APPLICATION__NAME);
		createEAttribute(dslApplicationEClass, DSL_APPLICATION__BASE_PACKAGE);
		createEReference(dslApplicationEClass, DSL_APPLICATION__MODULES);

		dslModuleEClass = createEClass(DSL_MODULE);
		createEAttribute(dslModuleEClass, DSL_MODULE__DOC);
		createEAttribute(dslModuleEClass, DSL_MODULE__NAME);
		createEAttribute(dslModuleEClass, DSL_MODULE__EXTERNAL);
		createEAttribute(dslModuleEClass, DSL_MODULE__BASE_PACKAGE);
		createEAttribute(dslModuleEClass, DSL_MODULE__HINT);
		createEReference(dslModuleEClass, DSL_MODULE__SERVICES);
		createEReference(dslModuleEClass, DSL_MODULE__RESOURCES);
		createEReference(dslModuleEClass, DSL_MODULE__CONSUMERS);
		createEReference(dslModuleEClass, DSL_MODULE__DOMAIN_OBJECTS);

		dslServiceEClass = createEClass(DSL_SERVICE);
		createEAttribute(dslServiceEClass, DSL_SERVICE__WEB_SERVICE);
		createEReference(dslServiceEClass, DSL_SERVICE__OPERATIONS);

		dslResourceEClass = createEClass(DSL_RESOURCE);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__DOC);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__NAME);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__GAP_CLASS);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__NO_GAP_CLASS);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__HINT);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__SCAFFOLD);
		createEAttribute(dslResourceEClass, DSL_RESOURCE__PATH);
		createEReference(dslResourceEClass, DSL_RESOURCE__DEPENDENCIES);
		createEReference(dslResourceEClass, DSL_RESOURCE__OPERATIONS);

		dslConsumerEClass = createEClass(DSL_CONSUMER);
		createEAttribute(dslConsumerEClass, DSL_CONSUMER__DOC);
		createEAttribute(dslConsumerEClass, DSL_CONSUMER__NAME);
		createEAttribute(dslConsumerEClass, DSL_CONSUMER__HINT);
		createEReference(dslConsumerEClass, DSL_CONSUMER__DEPENDENCIES);
		createEReference(dslConsumerEClass, DSL_CONSUMER__MESSAGE_ROOT);
		createEAttribute(dslConsumerEClass, DSL_CONSUMER__CHANNEL);
		createEReference(dslConsumerEClass, DSL_CONSUMER__SUBSCRIBE);

		dslSubscribeEClass = createEClass(DSL_SUBSCRIBE);
		createEAttribute(dslSubscribeEClass, DSL_SUBSCRIBE__TOPIC);
		createEAttribute(dslSubscribeEClass, DSL_SUBSCRIBE__EVENT_BUS);

		dslPublishEClass = createEClass(DSL_PUBLISH);
		createEReference(dslPublishEClass, DSL_PUBLISH__EVENT_TYPE);
		createEAttribute(dslPublishEClass, DSL_PUBLISH__TOPIC);
		createEAttribute(dslPublishEClass, DSL_PUBLISH__EVENT_BUS);

		dslEventEClass = createEClass(DSL_EVENT);
		createEAttribute(dslEventEClass, DSL_EVENT__PERSISTENT);

		dslDomainObjectTypedElementEClass = createEClass(DSL_DOMAIN_OBJECT_TYPED_ELEMENT);

		dslServiceOperationEClass = createEClass(DSL_SERVICE_OPERATION);
		createEAttribute(dslServiceOperationEClass, DSL_SERVICE_OPERATION__DOC);
		createEAttribute(dslServiceOperationEClass, DSL_SERVICE_OPERATION__VISIBILITY);
		createEReference(dslServiceOperationEClass, DSL_SERVICE_OPERATION__RETURN_TYPE);
		createEAttribute(dslServiceOperationEClass, DSL_SERVICE_OPERATION__NAME);
		createEReference(dslServiceOperationEClass, DSL_SERVICE_OPERATION__PARAMETERS);
		createEAttribute(dslServiceOperationEClass, DSL_SERVICE_OPERATION__THROWS);
		createEAttribute(dslServiceOperationEClass, DSL_SERVICE_OPERATION__HINT);
		createEReference(dslServiceOperationEClass, DSL_SERVICE_OPERATION__PUBLISH);
		createEReference(dslServiceOperationEClass, DSL_SERVICE_OPERATION__DELEGATE_HOLDER);

		dslServiceOperationDelegateEClass = createEClass(DSL_SERVICE_OPERATION_DELEGATE);
		createEReference(dslServiceOperationDelegateEClass, DSL_SERVICE_OPERATION_DELEGATE__DELEGATE);
		createEReference(dslServiceOperationDelegateEClass, DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION);

		dslServiceRepositoryOptionEClass = createEClass(DSL_SERVICE_REPOSITORY_OPTION);
		createEAttribute(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__DOC);
		createEAttribute(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__NAME);
		createEAttribute(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS);
		createEAttribute(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS);
		createEAttribute(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__HINT);
		createEReference(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE);
		createEReference(dslServiceRepositoryOptionEClass, DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES);

		dslServiceRepositoryOperationOptionEClass = createEClass(DSL_SERVICE_REPOSITORY_OPERATION_OPTION);

		dslResourceOperationEClass = createEClass(DSL_RESOURCE_OPERATION);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__DOC);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__VISIBILITY);
		createEReference(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__RETURN_TYPE);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__NAME);
		createEReference(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__PARAMETERS);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__THROWS);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__HINT);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__HTTP_METHOD);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__PATH);
		createEAttribute(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__RETURN_STRING);
		createEReference(dslResourceOperationEClass, DSL_RESOURCE_OPERATION__DELEGATE_HOLDER);

		dslResourceOperationDelegateEClass = createEClass(DSL_RESOURCE_OPERATION_DELEGATE);
		createEReference(dslResourceOperationDelegateEClass, DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE);
		createEReference(dslResourceOperationDelegateEClass, DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE_OPERATION);

		dslRepositoryOperationEClass = createEClass(DSL_REPOSITORY_OPERATION);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__DOC);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__VISIBILITY);
		createEReference(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__RETURN_TYPE);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__NAME);
		createEReference(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__PARAMETERS);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__THROWS);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__HINT);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__CACHE);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__GAP_OPERATION);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__QUERY);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__CONDITION);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__SELECT);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__GROUP_BY);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__ORDER_BY);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__CONSTRUCT);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__BUILD);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__MAP);
		createEReference(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__PUBLISH);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT);
		createEAttribute(dslRepositoryOperationEClass, DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME);

		dslParameterEClass = createEClass(DSL_PARAMETER);
		createEAttribute(dslParameterEClass, DSL_PARAMETER__DOC);
		createEReference(dslParameterEClass, DSL_PARAMETER__PARAMETER_TYPE);
		createEAttribute(dslParameterEClass, DSL_PARAMETER__NAME);

		dslComplexTypeEClass = createEClass(DSL_COMPLEX_TYPE);
		createEAttribute(dslComplexTypeEClass, DSL_COMPLEX_TYPE__COLLECTION_TYPE);
		createEReference(dslComplexTypeEClass, DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE);
		createEAttribute(dslComplexTypeEClass, DSL_COMPLEX_TYPE__TYPE);
		createEAttribute(dslComplexTypeEClass, DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE);
		createEAttribute(dslComplexTypeEClass, DSL_COMPLEX_TYPE__MAP_KEY_TYPE);
		createEReference(dslComplexTypeEClass, DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE);

		dslSimpleDomainObjectEClass = createEClass(DSL_SIMPLE_DOMAIN_OBJECT);
		createEAttribute(dslSimpleDomainObjectEClass, DSL_SIMPLE_DOMAIN_OBJECT__DOC);
		createEAttribute(dslSimpleDomainObjectEClass, DSL_SIMPLE_DOMAIN_OBJECT__NAME);
		createEAttribute(dslSimpleDomainObjectEClass, DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE);
		createEAttribute(dslSimpleDomainObjectEClass, DSL_SIMPLE_DOMAIN_OBJECT__HINT);

		dslDomainObjectEClass = createEClass(DSL_DOMAIN_OBJECT);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__ABSTRACT);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__EXTENDS_NAME);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__TRAITS);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__CACHE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__GAP_CLASS);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__NO_GAP_CLASS);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__SCAFFOLD);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__DATABASE_TABLE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__INHERITANCE_TYPE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__VALIDATE);
		createEAttribute(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__BELONGS_TO);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__ATTRIBUTES);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__REFERENCES);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__OPERATIONS);
		createEReference(dslDomainObjectEClass, DSL_DOMAIN_OBJECT__REPOSITORY);

		dslEntityEClass = createEClass(DSL_ENTITY);
		createEReference(dslEntityEClass, DSL_ENTITY__EXTENDS);
		createEAttribute(dslEntityEClass, DSL_ENTITY__NOT_OPTIMISTIC_LOCKING);
		createEAttribute(dslEntityEClass, DSL_ENTITY__NOT_AUDITABLE);

		dslValueObjectEClass = createEClass(DSL_VALUE_OBJECT);
		createEReference(dslValueObjectEClass, DSL_VALUE_OBJECT__EXTENDS);
		createEAttribute(dslValueObjectEClass, DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING);
		createEAttribute(dslValueObjectEClass, DSL_VALUE_OBJECT__NOT_IMMUTABLE);
		createEAttribute(dslValueObjectEClass, DSL_VALUE_OBJECT__PERSISTENT);
		createEAttribute(dslValueObjectEClass, DSL_VALUE_OBJECT__NOT_PERSISTENT);

		dslDomainEventEClass = createEClass(DSL_DOMAIN_EVENT);
		createEReference(dslDomainEventEClass, DSL_DOMAIN_EVENT__EXTENDS);

		dslCommandEventEClass = createEClass(DSL_COMMAND_EVENT);
		createEReference(dslCommandEventEClass, DSL_COMMAND_EVENT__EXTENDS);

		dslTraitEClass = createEClass(DSL_TRAIT);
		createEReference(dslTraitEClass, DSL_TRAIT__ATTRIBUTES);
		createEReference(dslTraitEClass, DSL_TRAIT__REFERENCES);
		createEReference(dslTraitEClass, DSL_TRAIT__OPERATIONS);

		dslDomainObjectOperationEClass = createEClass(DSL_DOMAIN_OBJECT_OPERATION);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__DOC);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__ABSTRACT);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__VISIBILITY);
		createEReference(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__RETURN_TYPE);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__NAME);
		createEReference(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__PARAMETERS);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__THROWS);
		createEAttribute(dslDomainObjectOperationEClass, DSL_DOMAIN_OBJECT_OPERATION__HINT);

		dslDataTransferObjectEClass = createEClass(DSL_DATA_TRANSFER_OBJECT);
		createEAttribute(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__ABSTRACT);
		createEReference(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__EXTENDS);
		createEAttribute(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME);
		createEAttribute(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__GAP_CLASS);
		createEAttribute(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS);
		createEAttribute(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__VALIDATE);
		createEReference(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES);
		createEReference(dslDataTransferObjectEClass, DSL_DATA_TRANSFER_OBJECT__REFERENCES);

		dslBasicTypeEClass = createEClass(DSL_BASIC_TYPE);
		createEReference(dslBasicTypeEClass, DSL_BASIC_TYPE__TRAITS);
		createEAttribute(dslBasicTypeEClass, DSL_BASIC_TYPE__NOT_IMMUTABLE);
		createEAttribute(dslBasicTypeEClass, DSL_BASIC_TYPE__GAP_CLASS);
		createEAttribute(dslBasicTypeEClass, DSL_BASIC_TYPE__NO_GAP_CLASS);
		createEReference(dslBasicTypeEClass, DSL_BASIC_TYPE__ATTRIBUTES);
		createEReference(dslBasicTypeEClass, DSL_BASIC_TYPE__REFERENCES);
		createEReference(dslBasicTypeEClass, DSL_BASIC_TYPE__OPERATIONS);

		dslAttributeEClass = createEClass(DSL_ATTRIBUTE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__TYPE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__INDEX);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__ASSERT_FALSE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__ASSERT_TRUE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__CREDIT_CARD_NUMBER);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__DIGITS);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__EMAIL);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__EMAIL_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__FUTURE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__FUTURE_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__PAST);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__PAST_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__MAX);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__MIN);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__DECIMAL_MAX);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__DECIMAL_MIN);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__NOT_BLANK);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__NOT_BLANK_MESSAGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__PATTERN);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__RANGE);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__LENGTH);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__SCRIPT_ASSERT);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__URL);
		createEAttribute(dslAttributeEClass, DSL_ATTRIBUTE__DATABASE_TYPE);

		dslReferenceEClass = createEClass(DSL_REFERENCE);
		createEReference(dslReferenceEClass, DSL_REFERENCE__DOMAIN_OBJECT_TYPE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__CASCADE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__FETCH);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__CACHE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__INVERSE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__DATABASE_JOIN_TABLE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__DATABASE_JOIN_COLUMN);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__VALID);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__VALID_MESSAGE);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__ORDER_BY);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__ORDER_COLUMN);
		createEAttribute(dslReferenceEClass, DSL_REFERENCE__ORDER_COLUMN_NAME);
		createEReference(dslReferenceEClass, DSL_REFERENCE__OPPOSITE_HOLDER);

		dslDtoAttributeEClass = createEClass(DSL_DTO_ATTRIBUTE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__TYPE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__ASSERT_FALSE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__ASSERT_FALSE_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__ASSERT_TRUE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__ASSERT_TRUE_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__DIGITS);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__EMAIL);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__EMAIL_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__FUTURE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__FUTURE_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__PAST);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__PAST_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__MAX);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__MIN);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__DECIMAL_MAX);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__DECIMAL_MIN);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__NOT_BLANK);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__NOT_BLANK_MESSAGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__PATTERN);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__RANGE);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__LENGTH);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__SCRIPT_ASSERT);
		createEAttribute(dslDtoAttributeEClass, DSL_DTO_ATTRIBUTE__URL);

		dslDtoReferenceEClass = createEClass(DSL_DTO_REFERENCE);
		createEReference(dslDtoReferenceEClass, DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE);
		createEAttribute(dslDtoReferenceEClass, DSL_DTO_REFERENCE__VALID);
		createEAttribute(dslDtoReferenceEClass, DSL_DTO_REFERENCE__VALID_MESSAGE);

		dslOppositeHolderEClass = createEClass(DSL_OPPOSITE_HOLDER);
		createEReference(dslOppositeHolderEClass, DSL_OPPOSITE_HOLDER__OPPOSITE);

		dslRepositoryEClass = createEClass(DSL_REPOSITORY);
		createEReference(dslRepositoryEClass, DSL_REPOSITORY__OPERATIONS);

		dslServiceDependencyEClass = createEClass(DSL_SERVICE_DEPENDENCY);
		createEReference(dslServiceDependencyEClass, DSL_SERVICE_DEPENDENCY__DEPENDENCY);

		dslDependencyEClass = createEClass(DSL_DEPENDENCY);
		createEReference(dslDependencyEClass, DSL_DEPENDENCY__DEPENDENCY);
		createEAttribute(dslDependencyEClass, DSL_DEPENDENCY__NAME);

		dslEnumEClass = createEClass(DSL_ENUM);
		createEAttribute(dslEnumEClass, DSL_ENUM__ORDINAL);
		createEReference(dslEnumEClass, DSL_ENUM__ATTRIBUTES);
		createEReference(dslEnumEClass, DSL_ENUM__VALUES);

		dslEnumAttributeEClass = createEClass(DSL_ENUM_ATTRIBUTE);
		createEAttribute(dslEnumAttributeEClass, DSL_ENUM_ATTRIBUTE__DOC);
		createEAttribute(dslEnumAttributeEClass, DSL_ENUM_ATTRIBUTE__TYPE);
		createEAttribute(dslEnumAttributeEClass, DSL_ENUM_ATTRIBUTE__NAME);
		createEAttribute(dslEnumAttributeEClass, DSL_ENUM_ATTRIBUTE__KEY);

		dslEnumValueEClass = createEClass(DSL_ENUM_VALUE);
		createEAttribute(dslEnumValueEClass, DSL_ENUM_VALUE__DOC);
		createEAttribute(dslEnumValueEClass, DSL_ENUM_VALUE__NAME);
		createEReference(dslEnumValueEClass, DSL_ENUM_VALUE__PARAMETERS);

		dslEnumParameterEClass = createEClass(DSL_ENUM_PARAMETER);
		createEAttribute(dslEnumParameterEClass, DSL_ENUM_PARAMETER__VALUE);
		createEAttribute(dslEnumParameterEClass, DSL_ENUM_PARAMETER__INTEGER_VALUE);

		dslAnyPropertyEClass = createEClass(DSL_ANY_PROPERTY);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__DOC);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__VISIBILITY);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__COLLECTION_TYPE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NAME);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__KEY);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NOT_CHANGEABLE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__REQUIRED);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NULLABLE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NULLABLE_MESSAGE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__HINT);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NOT_EMPTY);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__SIZE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__VALIDATE);
		createEAttribute(dslAnyPropertyEClass, DSL_ANY_PROPERTY__TRANSIENT);

		dslPropertyEClass = createEClass(DSL_PROPERTY);
		createEAttribute(dslPropertyEClass, DSL_PROPERTY__DATABASE_COLUMN);

		dslDtoPropertyEClass = createEClass(DSL_DTO_PROPERTY);

		// Create enums
		dslHttpMethodEEnum = createEEnum(DSL_HTTP_METHOD);
		dslInheritanceTypeEEnum = createEEnum(DSL_INHERITANCE_TYPE);
		dslDiscriminatorTypeEEnum = createEEnum(DSL_DISCRIMINATOR_TYPE);
		dslCollectionTypeEEnum = createEEnum(DSL_COLLECTION_TYPE);
		dslVisibilityEEnum = createEEnum(DSL_VISIBILITY);
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
		dslServiceEClass.getESuperTypes().add(this.getDslServiceRepositoryOption());
		dslEventEClass.getESuperTypes().add(this.getDslDomainObject());
		dslServiceOperationEClass.getESuperTypes().add(this.getDslDomainObjectTypedElement());
		dslServiceOperationEClass.getESuperTypes().add(this.getDslServiceRepositoryOperationOption());
		dslRepositoryOperationEClass.getESuperTypes().add(this.getDslDomainObjectTypedElement());
		dslRepositoryOperationEClass.getESuperTypes().add(this.getDslServiceRepositoryOperationOption());
		dslParameterEClass.getESuperTypes().add(this.getDslDomainObjectTypedElement());
		dslDomainObjectEClass.getESuperTypes().add(this.getDslSimpleDomainObject());
		dslEntityEClass.getESuperTypes().add(this.getDslDomainObject());
		dslValueObjectEClass.getESuperTypes().add(this.getDslDomainObject());
		dslDomainEventEClass.getESuperTypes().add(this.getDslEvent());
		dslCommandEventEClass.getESuperTypes().add(this.getDslEvent());
		dslTraitEClass.getESuperTypes().add(this.getDslSimpleDomainObject());
		dslDomainObjectOperationEClass.getESuperTypes().add(this.getDslDomainObjectTypedElement());
		dslDataTransferObjectEClass.getESuperTypes().add(this.getDslSimpleDomainObject());
		dslBasicTypeEClass.getESuperTypes().add(this.getDslSimpleDomainObject());
		dslAttributeEClass.getESuperTypes().add(this.getDslProperty());
		dslReferenceEClass.getESuperTypes().add(this.getDslProperty());
		dslDtoAttributeEClass.getESuperTypes().add(this.getDslDtoProperty());
		dslDtoReferenceEClass.getESuperTypes().add(this.getDslDtoProperty());
		dslRepositoryEClass.getESuperTypes().add(this.getDslServiceRepositoryOption());
		dslEnumEClass.getESuperTypes().add(this.getDslSimpleDomainObject());
		dslPropertyEClass.getESuperTypes().add(this.getDslAnyProperty());
		dslDtoPropertyEClass.getESuperTypes().add(this.getDslAnyProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(dslModelEClass, DslModel.class, "DslModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslModel_Imports(), this.getDslImport(), null, "imports", null, 0, -1, DslModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslModel_App(), this.getDslApplication(), null, "app", null, 0, 1, DslModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslImportEClass, DslImport.class, "DslImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, DslImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslApplicationEClass, DslApplication.class, "DslApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslApplication_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslApplication_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, DslApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslApplication_Modules(), this.getDslModule(), null, "modules", null, 0, -1, DslApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslModuleEClass, DslModule.class, "DslModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslModule_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslModule_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslModule_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslModule_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslModule_Services(), this.getDslService(), null, "services", null, 0, -1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslModule_Resources(), this.getDslResource(), null, "resources", null, 0, -1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslModule_Consumers(), this.getDslConsumer(), null, "consumers", null, 0, -1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslModule_DomainObjects(), this.getDslSimpleDomainObject(), null, "domainObjects", null, 0, -1, DslModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslServiceEClass, DslService.class, "DslService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslService_WebService(), ecorePackage.getEBoolean(), "webService", null, 0, 1, DslService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslService_Operations(), this.getDslServiceOperation(), null, "operations", null, 0, -1, DslService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslResourceEClass, DslResource.class, "DslResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslResource_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_NoGapClass(), ecorePackage.getEBoolean(), "noGapClass", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_Scaffold(), ecorePackage.getEBoolean(), "scaffold", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResource_Path(), ecorePackage.getEString(), "path", null, 0, 1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResource_Dependencies(), this.getDslServiceDependency(), null, "dependencies", null, 0, -1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResource_Operations(), this.getDslResourceOperation(), null, "operations", null, 0, -1, DslResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslConsumerEClass, DslConsumer.class, "DslConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslConsumer_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslConsumer_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslConsumer_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslConsumer_Dependencies(), this.getDslDependency(), null, "dependencies", null, 0, -1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslConsumer_MessageRoot(), this.getDslDomainObject(), null, "messageRoot", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslConsumer_Channel(), ecorePackage.getEString(), "channel", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslConsumer_Subscribe(), this.getDslSubscribe(), null, "subscribe", null, 0, 1, DslConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslSubscribeEClass, DslSubscribe.class, "DslSubscribe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslSubscribe_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, DslSubscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslSubscribe_EventBus(), ecorePackage.getEString(), "eventBus", null, 0, 1, DslSubscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslPublishEClass, DslPublish.class, "DslPublish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslPublish_EventType(), this.getDslEvent(), null, "eventType", null, 0, 1, DslPublish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslPublish_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, DslPublish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslPublish_EventBus(), ecorePackage.getEString(), "eventBus", null, 0, 1, DslPublish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEventEClass, DslEvent.class, "DslEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslEvent_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, DslEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDomainObjectTypedElementEClass, DslDomainObjectTypedElement.class, "DslDomainObjectTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dslServiceOperationEClass, DslServiceOperation.class, "DslServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslServiceOperation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceOperation_Visibility(), this.getDslVisibility(), "visibility", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceOperation_ReturnType(), this.getDslComplexType(), null, "returnType", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceOperation_Parameters(), this.getDslParameter(), null, "parameters", null, 0, -1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceOperation_Throws(), ecorePackage.getEString(), "throws", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceOperation_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceOperation_Publish(), this.getDslPublish(), null, "publish", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceOperation_DelegateHolder(), this.getDslServiceOperationDelegate(), null, "delegateHolder", null, 0, 1, DslServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslServiceOperationDelegateEClass, DslServiceOperationDelegate.class, "DslServiceOperationDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslServiceOperationDelegate_Delegate(), this.getDslServiceRepositoryOption(), null, "delegate", null, 0, 1, DslServiceOperationDelegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceOperationDelegate_DelegateOperation(), this.getDslServiceRepositoryOperationOption(), null, "delegateOperation", null, 0, 1, DslServiceOperationDelegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslServiceRepositoryOptionEClass, DslServiceRepositoryOption.class, "DslServiceRepositoryOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslServiceRepositoryOption_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceRepositoryOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceRepositoryOption_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceRepositoryOption_NoGapClass(), ecorePackage.getEBoolean(), "noGapClass", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslServiceRepositoryOption_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceRepositoryOption_Subscribe(), this.getDslSubscribe(), null, "subscribe", null, 0, 1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslServiceRepositoryOption_Dependencies(), this.getDslDependency(), null, "dependencies", null, 0, -1, DslServiceRepositoryOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslServiceRepositoryOperationOptionEClass, DslServiceRepositoryOperationOption.class, "DslServiceRepositoryOperationOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dslResourceOperationEClass, DslResourceOperation.class, "DslResourceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslResourceOperation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_Visibility(), this.getDslVisibility(), "visibility", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResourceOperation_ReturnType(), this.getDslComplexType(), null, "returnType", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResourceOperation_Parameters(), this.getDslParameter(), null, "parameters", null, 0, -1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_Throws(), ecorePackage.getEString(), "throws", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_HttpMethod(), this.getDslHttpMethod(), "httpMethod", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_Path(), ecorePackage.getEString(), "path", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslResourceOperation_ReturnString(), ecorePackage.getEString(), "returnString", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResourceOperation_DelegateHolder(), this.getDslResourceOperationDelegate(), null, "delegateHolder", null, 0, 1, DslResourceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslResourceOperationDelegateEClass, DslResourceOperationDelegate.class, "DslResourceOperationDelegate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslResourceOperationDelegate_Delegate(), this.getDslService(), null, "delegate", null, 0, 1, DslResourceOperationDelegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslResourceOperationDelegate_DelegateOperation(), this.getDslServiceOperation(), null, "delegateOperation", null, 0, 1, DslResourceOperationDelegate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslRepositoryOperationEClass, DslRepositoryOperation.class, "DslRepositoryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslRepositoryOperation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Visibility(), this.getDslVisibility(), "visibility", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslRepositoryOperation_ReturnType(), this.getDslComplexType(), null, "returnType", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslRepositoryOperation_Parameters(), this.getDslParameter(), null, "parameters", null, 0, -1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Throws(), ecorePackage.getEString(), "throws", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Cache(), ecorePackage.getEBoolean(), "cache", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_GapOperation(), ecorePackage.getEBoolean(), "gapOperation", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_NoGapOperation(), ecorePackage.getEBoolean(), "noGapOperation", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Query(), ecorePackage.getEString(), "query", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Select(), ecorePackage.getEString(), "select", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_GroupBy(), ecorePackage.getEString(), "groupBy", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_OrderBy(), ecorePackage.getEString(), "orderBy", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Construct(), ecorePackage.getEBoolean(), "construct", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Build(), ecorePackage.getEBoolean(), "build", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_Map(), ecorePackage.getEBoolean(), "map", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslRepositoryOperation_Publish(), this.getDslPublish(), null, "publish", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_DelegateToAccessObject(), ecorePackage.getEBoolean(), "delegateToAccessObject", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslRepositoryOperation_AccessObjectName(), ecorePackage.getEString(), "accessObjectName", null, 0, 1, DslRepositoryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslParameterEClass, DslParameter.class, "DslParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslParameter_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslParameter_ParameterType(), this.getDslComplexType(), null, "parameterType", null, 0, 1, DslParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslComplexTypeEClass, DslComplexType.class, "DslComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslComplexType_CollectionType(), this.getDslCollectionType(), "collectionType", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslComplexType_DomainObjectType(), this.getDslSimpleDomainObject(), null, "domainObjectType", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslComplexType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslComplexType_MapCollectionType(), ecorePackage.getEString(), "mapCollectionType", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslComplexType_MapKeyType(), ecorePackage.getEString(), "mapKeyType", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslComplexType_MapKeyDomainObjectType(), this.getDslSimpleDomainObject(), null, "mapKeyDomainObjectType", null, 0, 1, DslComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslSimpleDomainObjectEClass, DslSimpleDomainObject.class, "DslSimpleDomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslSimpleDomainObject_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslSimpleDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslSimpleDomainObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslSimpleDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslSimpleDomainObject_Package(), ecorePackage.getEString(), "package", null, 0, 1, DslSimpleDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslSimpleDomainObject_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslSimpleDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDomainObjectEClass, DslDomainObject.class, "DslDomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslDomainObject_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_ExtendsName(), ecorePackage.getEString(), "extendsName", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_Traits(), this.getDslTrait(), null, "traits", null, 0, -1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_Cache(), ecorePackage.getEBoolean(), "cache", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_NoGapClass(), ecorePackage.getEBoolean(), "noGapClass", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_Scaffold(), ecorePackage.getEBoolean(), "scaffold", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_DatabaseTable(), ecorePackage.getEString(), "databaseTable", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_DiscriminatorValue(), ecorePackage.getEString(), "discriminatorValue", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_DiscriminatorColumn(), ecorePackage.getEString(), "discriminatorColumn", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_DiscriminatorType(), this.getDslDiscriminatorType(), "discriminatorType", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_DiscriminatorLength(), ecorePackage.getEString(), "discriminatorLength", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_InheritanceType(), this.getDslInheritanceType(), "inheritanceType", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_Validate(), ecorePackage.getEString(), "validate", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObject_NotAggregateRoot(), ecorePackage.getEBoolean(), "notAggregateRoot", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_BelongsTo(), this.getDslDomainObject(), null, "belongsTo", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_Attributes(), this.getDslAttribute(), null, "attributes", null, 0, -1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_References(), this.getDslReference(), null, "references", null, 0, -1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_Operations(), this.getDslDomainObjectOperation(), null, "operations", null, 0, -1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObject_Repository(), this.getDslRepository(), null, "repository", null, 0, 1, DslDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEntityEClass, DslEntity.class, "DslEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslEntity_Extends(), this.getDslEntity(), null, "extends", null, 0, 1, DslEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEntity_NotOptimisticLocking(), ecorePackage.getEBoolean(), "notOptimisticLocking", null, 0, 1, DslEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEntity_NotAuditable(), ecorePackage.getEBoolean(), "notAuditable", null, 0, 1, DslEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslValueObjectEClass, DslValueObject.class, "DslValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslValueObject_Extends(), this.getDslValueObject(), null, "extends", null, 0, 1, DslValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslValueObject_NotOptimisticLocking(), ecorePackage.getEBoolean(), "notOptimisticLocking", null, 0, 1, DslValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslValueObject_NotImmutable(), ecorePackage.getEBoolean(), "notImmutable", null, 0, 1, DslValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslValueObject_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, DslValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslValueObject_NotPersistent(), ecorePackage.getEBoolean(), "notPersistent", null, 0, 1, DslValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDomainEventEClass, DslDomainEvent.class, "DslDomainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslDomainEvent_Extends(), this.getDslDomainEvent(), null, "extends", null, 0, 1, DslDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslCommandEventEClass, DslCommandEvent.class, "DslCommandEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslCommandEvent_Extends(), this.getDslCommandEvent(), null, "extends", null, 0, 1, DslCommandEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslTraitEClass, DslTrait.class, "DslTrait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslTrait_Attributes(), this.getDslAttribute(), null, "attributes", null, 0, -1, DslTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslTrait_References(), this.getDslReference(), null, "references", null, 0, -1, DslTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslTrait_Operations(), this.getDslDomainObjectOperation(), null, "operations", null, 0, -1, DslTrait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDomainObjectOperationEClass, DslDomainObjectOperation.class, "DslDomainObjectOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslDomainObjectOperation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObjectOperation_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObjectOperation_Visibility(), this.getDslVisibility(), "visibility", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObjectOperation_ReturnType(), this.getDslComplexType(), null, "returnType", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObjectOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDomainObjectOperation_Parameters(), this.getDslParameter(), null, "parameters", null, 0, -1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObjectOperation_Throws(), ecorePackage.getEString(), "throws", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDomainObjectOperation_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslDomainObjectOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDataTransferObjectEClass, DslDataTransferObject.class, "DslDataTransferObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslDataTransferObject_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDataTransferObject_Extends(), this.getDslDataTransferObject(), null, "extends", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDataTransferObject_ExtendsName(), ecorePackage.getEString(), "extendsName", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDataTransferObject_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDataTransferObject_NoGapClass(), ecorePackage.getEBoolean(), "noGapClass", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDataTransferObject_Validate(), ecorePackage.getEString(), "validate", null, 0, 1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDataTransferObject_Attributes(), this.getDslDtoAttribute(), null, "attributes", null, 0, -1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslDataTransferObject_References(), this.getDslDtoReference(), null, "references", null, 0, -1, DslDataTransferObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslBasicTypeEClass, DslBasicType.class, "DslBasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslBasicType_Traits(), this.getDslTrait(), null, "traits", null, 0, -1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslBasicType_NotImmutable(), ecorePackage.getEBoolean(), "notImmutable", null, 0, 1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslBasicType_GapClass(), ecorePackage.getEBoolean(), "gapClass", null, 0, 1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslBasicType_NoGapClass(), ecorePackage.getEBoolean(), "noGapClass", null, 0, 1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslBasicType_Attributes(), this.getDslAttribute(), null, "attributes", null, 0, -1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslBasicType_References(), this.getDslReference(), null, "references", null, 0, -1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslBasicType_Operations(), this.getDslDomainObjectOperation(), null, "operations", null, 0, -1, DslBasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslAttributeEClass, DslAttribute.class, "DslAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Index(), ecorePackage.getEBoolean(), "index", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_AssertFalse(), ecorePackage.getEBoolean(), "assertFalse", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_AssertFalseMessage(), ecorePackage.getEString(), "assertFalseMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_AssertTrue(), ecorePackage.getEBoolean(), "assertTrue", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_AssertTrueMessage(), ecorePackage.getEString(), "assertTrueMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_CreditCardNumber(), ecorePackage.getEBoolean(), "creditCardNumber", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_CreditCardNumberMessage(), ecorePackage.getEString(), "creditCardNumberMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Digits(), ecorePackage.getEString(), "digits", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Email(), ecorePackage.getEBoolean(), "email", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_EmailMessage(), ecorePackage.getEString(), "emailMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Future(), ecorePackage.getEBoolean(), "future", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_FutureMessage(), ecorePackage.getEString(), "futureMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Past(), ecorePackage.getEBoolean(), "past", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_PastMessage(), ecorePackage.getEString(), "pastMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Max(), ecorePackage.getEString(), "max", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Min(), ecorePackage.getEString(), "min", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_DecimalMax(), ecorePackage.getEString(), "decimalMax", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_DecimalMin(), ecorePackage.getEString(), "decimalMin", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_NotBlank(), ecorePackage.getEBoolean(), "notBlank", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_NotBlankMessage(), ecorePackage.getEString(), "notBlankMessage", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Range(), ecorePackage.getEString(), "range", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Length(), ecorePackage.getEString(), "length", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_ScriptAssert(), ecorePackage.getEString(), "scriptAssert", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_Url(), ecorePackage.getEString(), "url", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAttribute_DatabaseType(), ecorePackage.getEString(), "databaseType", null, 0, 1, DslAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslReferenceEClass, DslReference.class, "DslReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslReference_DomainObjectType(), this.getDslSimpleDomainObject(), null, "domainObjectType", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_Cascade(), ecorePackage.getEString(), "cascade", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_Fetch(), ecorePackage.getEString(), "fetch", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_Cache(), ecorePackage.getEBoolean(), "cache", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_Inverse(), ecorePackage.getEBoolean(), "inverse", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_DatabaseJoinTable(), ecorePackage.getEString(), "databaseJoinTable", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_DatabaseJoinColumn(), ecorePackage.getEString(), "databaseJoinColumn", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_ValidMessage(), ecorePackage.getEString(), "validMessage", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_OrderBy(), ecorePackage.getEString(), "orderBy", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_OrderColumn(), ecorePackage.getEBoolean(), "orderColumn", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslReference_OrderColumnName(), ecorePackage.getEString(), "orderColumnName", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslReference_OppositeHolder(), this.getDslOppositeHolder(), null, "oppositeHolder", null, 0, 1, DslReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDtoAttributeEClass, DslDtoAttribute.class, "DslDtoAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslDtoAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_AssertFalse(), ecorePackage.getEBoolean(), "assertFalse", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_AssertFalseMessage(), ecorePackage.getEString(), "assertFalseMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_AssertTrue(), ecorePackage.getEBoolean(), "assertTrue", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_AssertTrueMessage(), ecorePackage.getEString(), "assertTrueMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_CreditCardNumber(), ecorePackage.getEBoolean(), "creditCardNumber", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_CreditCardNumberMessage(), ecorePackage.getEString(), "creditCardNumberMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Digits(), ecorePackage.getEString(), "digits", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Email(), ecorePackage.getEBoolean(), "email", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_EmailMessage(), ecorePackage.getEString(), "emailMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Future(), ecorePackage.getEBoolean(), "future", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_FutureMessage(), ecorePackage.getEString(), "futureMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Past(), ecorePackage.getEBoolean(), "past", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_PastMessage(), ecorePackage.getEString(), "pastMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Max(), ecorePackage.getEString(), "max", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Min(), ecorePackage.getEString(), "min", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_DecimalMax(), ecorePackage.getEString(), "decimalMax", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_DecimalMin(), ecorePackage.getEString(), "decimalMin", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_NotBlank(), ecorePackage.getEBoolean(), "notBlank", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_NotBlankMessage(), ecorePackage.getEString(), "notBlankMessage", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Range(), ecorePackage.getEString(), "range", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Length(), ecorePackage.getEString(), "length", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_ScriptAssert(), ecorePackage.getEString(), "scriptAssert", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoAttribute_Url(), ecorePackage.getEString(), "url", null, 0, 1, DslDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDtoReferenceEClass, DslDtoReference.class, "DslDtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslDtoReference_DomainObjectType(), this.getDslSimpleDomainObject(), null, "domainObjectType", null, 0, 1, DslDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoReference_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, DslDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDtoReference_ValidMessage(), ecorePackage.getEString(), "validMessage", null, 0, 1, DslDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslOppositeHolderEClass, DslOppositeHolder.class, "DslOppositeHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslOppositeHolder_Opposite(), this.getDslReference(), null, "opposite", null, 0, 1, DslOppositeHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslRepositoryEClass, DslRepository.class, "DslRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslRepository_Operations(), this.getDslRepositoryOperation(), null, "operations", null, 0, -1, DslRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslServiceDependencyEClass, DslServiceDependency.class, "DslServiceDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslServiceDependency_Dependency(), this.getDslService(), null, "dependency", null, 0, 1, DslServiceDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDependencyEClass, DslDependency.class, "DslDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDslDependency_Dependency(), this.getDslServiceRepositoryOption(), null, "dependency", null, 0, 1, DslDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslDependency_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEnumEClass, DslEnum.class, "DslEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslEnum_Ordinal(), ecorePackage.getEBoolean(), "ordinal", null, 0, 1, DslEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslEnum_Attributes(), this.getDslEnumAttribute(), null, "attributes", null, 0, -1, DslEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslEnum_Values(), this.getDslEnumValue(), null, "values", null, 0, -1, DslEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEnumAttributeEClass, DslEnumAttribute.class, "DslEnumAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslEnumAttribute_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslEnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEnumAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, DslEnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEnumAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslEnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEnumAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, DslEnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEnumValueEClass, DslEnumValue.class, "DslEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslEnumValue_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEnumValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDslEnumValue_Parameters(), this.getDslEnumParameter(), null, "parameters", null, 0, -1, DslEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslEnumParameterEClass, DslEnumParameter.class, "DslEnumParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslEnumParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, DslEnumParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslEnumParameter_IntegerValue(), ecorePackage.getEInt(), "integerValue", null, 0, 1, DslEnumParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslAnyPropertyEClass, DslAnyProperty.class, "DslAnyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslAnyProperty_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Visibility(), this.getDslVisibility(), "visibility", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_CollectionType(), this.getDslCollectionType(), "collectionType", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_NotChangeable(), ecorePackage.getEBoolean(), "notChangeable", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_NullableMessage(), ecorePackage.getEString(), "nullableMessage", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_NotEmpty(), ecorePackage.getEBoolean(), "notEmpty", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_NotEmptyMessage(), ecorePackage.getEString(), "notEmptyMessage", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Size(), ecorePackage.getEString(), "size", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Validate(), ecorePackage.getEString(), "validate", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDslAnyProperty_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, DslAnyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslPropertyEClass, DslProperty.class, "DslProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDslProperty_DatabaseColumn(), ecorePackage.getEString(), "databaseColumn", null, 0, 1, DslProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dslDtoPropertyEClass, DslDtoProperty.class, "DslDtoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dslHttpMethodEEnum, DslHttpMethod.class, "DslHttpMethod");
		addEEnumLiteral(dslHttpMethodEEnum, DslHttpMethod.NONE);
		addEEnumLiteral(dslHttpMethodEEnum, DslHttpMethod.GET);
		addEEnumLiteral(dslHttpMethodEEnum, DslHttpMethod.POST);
		addEEnumLiteral(dslHttpMethodEEnum, DslHttpMethod.PUT);
		addEEnumLiteral(dslHttpMethodEEnum, DslHttpMethod.DELETE);

		initEEnum(dslInheritanceTypeEEnum, DslInheritanceType.class, "DslInheritanceType");
		addEEnumLiteral(dslInheritanceTypeEEnum, DslInheritanceType.JOINED);
		addEEnumLiteral(dslInheritanceTypeEEnum, DslInheritanceType.SINGLE_TABLE);

		initEEnum(dslDiscriminatorTypeEEnum, DslDiscriminatorType.class, "DslDiscriminatorType");
		addEEnumLiteral(dslDiscriminatorTypeEEnum, DslDiscriminatorType.STRING);
		addEEnumLiteral(dslDiscriminatorTypeEEnum, DslDiscriminatorType.CHAR);
		addEEnumLiteral(dslDiscriminatorTypeEEnum, DslDiscriminatorType.INTEGER);

		initEEnum(dslCollectionTypeEEnum, DslCollectionType.class, "DslCollectionType");
		addEEnumLiteral(dslCollectionTypeEEnum, DslCollectionType.NONE);
		addEEnumLiteral(dslCollectionTypeEEnum, DslCollectionType.SET);
		addEEnumLiteral(dslCollectionTypeEEnum, DslCollectionType.LIST);
		addEEnumLiteral(dslCollectionTypeEEnum, DslCollectionType.BAG);
		addEEnumLiteral(dslCollectionTypeEEnum, DslCollectionType.COLLECTION);

		initEEnum(dslVisibilityEEnum, DslVisibility.class, "DslVisibility");
		addEEnumLiteral(dslVisibilityEEnum, DslVisibility.PUBLIC);
		addEEnumLiteral(dslVisibilityEEnum, DslVisibility.PROTECTED);
		addEEnumLiteral(dslVisibilityEEnum, DslVisibility.PRIVATE);
		addEEnumLiteral(dslVisibilityEEnum, DslVisibility.PACKAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //SculptordslPackageImpl
