/**
 */
package sculptordsl;

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
 * @see sculptordsl.SculptordslFactory
 * @model kind="package"
 * @generated
 */
public interface SculptordslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sculptordsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.org.srclang/sculptor/dsl/Sculptordsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sculptordsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SculptordslPackage eINSTANCE = sculptordsl.impl.SculptordslPackageImpl.init();

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslModelImpl <em>Dsl Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslModelImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslModel()
	 * @generated
	 */
	int DSL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL__APP = 1;

	/**
	 * The number of structural features of the '<em>Dsl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslImportImpl <em>Dsl Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslImportImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslImport()
	 * @generated
	 */
	int DSL_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Dsl Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsl Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslApplicationImpl <em>Dsl Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslApplicationImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslApplication()
	 * @generated
	 */
	int DSL_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION__BASE_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION__MODULES = 3;

	/**
	 * The number of structural features of the '<em>Dsl Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dsl Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslModuleImpl <em>Dsl Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslModuleImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslModule()
	 * @generated
	 */
	int DSL_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__EXTERNAL = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__BASE_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__HINT = 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__RESOURCES = 6;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__CONSUMERS = 7;

	/**
	 * The feature id for the '<em><b>Domain Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE__DOMAIN_OBJECTS = 8;

	/**
	 * The number of structural features of the '<em>Dsl Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Dsl Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceRepositoryOptionImpl <em>Dsl Service Repository Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceRepositoryOptionImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceRepositoryOption()
	 * @generated
	 */
	int DSL_SERVICE_REPOSITORY_OPTION = 13;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS = 2;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__HINT = 4;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE = 5;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES = 6;

	/**
	 * The number of structural features of the '<em>Dsl Service Repository Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dsl Service Repository Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceImpl <em>Dsl Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslService()
	 * @generated
	 */
	int DSL_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__DOC = DSL_SERVICE_REPOSITORY_OPTION__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__NAME = DSL_SERVICE_REPOSITORY_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__GAP_CLASS = DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__NO_GAP_CLASS = DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__HINT = DSL_SERVICE_REPOSITORY_OPTION__HINT;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__SUBSCRIBE = DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__DEPENDENCIES = DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__WEB_SERVICE = DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE__OPERATIONS = DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dsl Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_FEATURE_COUNT = DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dsl Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_COUNT = DSL_SERVICE_REPOSITORY_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslResourceImpl <em>Dsl Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslResourceImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResource()
	 * @generated
	 */
	int DSL_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__GAP_CLASS = 2;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__NO_GAP_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__HINT = 4;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__SCAFFOLD = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__DEPENDENCIES = 7;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE__OPERATIONS = 8;

	/**
	 * The number of structural features of the '<em>Dsl Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Dsl Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslConsumerImpl <em>Dsl Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslConsumerImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslConsumer()
	 * @generated
	 */
	int DSL_CONSUMER = 6;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__HINT = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__MESSAGE_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER__SUBSCRIBE = 6;

	/**
	 * The number of structural features of the '<em>Dsl Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dsl Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslSubscribeImpl <em>Dsl Subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslSubscribeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslSubscribe()
	 * @generated
	 */
	int DSL_SUBSCRIBE = 7;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SUBSCRIBE__TOPIC = 0;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SUBSCRIBE__EVENT_BUS = 1;

	/**
	 * The number of structural features of the '<em>Dsl Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SUBSCRIBE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SUBSCRIBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslPublishImpl <em>Dsl Publish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslPublishImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslPublish()
	 * @generated
	 */
	int DSL_PUBLISH = 8;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PUBLISH__EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PUBLISH__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PUBLISH__EVENT_BUS = 2;

	/**
	 * The number of structural features of the '<em>Dsl Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PUBLISH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dsl Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PUBLISH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslSimpleDomainObjectImpl <em>Dsl Simple Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslSimpleDomainObjectImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslSimpleDomainObject()
	 * @generated
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT__HINT = 3;

	/**
	 * The number of structural features of the '<em>Dsl Simple Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dsl Simple Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDomainObjectImpl <em>Dsl Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDomainObjectImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObject()
	 * @generated
	 */
	int DSL_DOMAIN_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DOC = DSL_SIMPLE_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__NAME = DSL_SIMPLE_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__PACKAGE = DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__HINT = DSL_SIMPLE_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__ABSTRACT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__EXTENDS_NAME = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__TRAITS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__CACHE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__NO_GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__SCAFFOLD = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DATABASE_TABLE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__INHERITANCE_TYPE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__VALIDATE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__BELONGS_TO = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__ATTRIBUTES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__REFERENCES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__OPERATIONS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT__REPOSITORY = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Dsl Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_FEATURE_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Dsl Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEventImpl <em>Dsl Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEventImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEvent()
	 * @generated
	 */
	int DSL_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DOC = DSL_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__NAME = DSL_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__PACKAGE = DSL_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__HINT = DSL_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__ABSTRACT = DSL_DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__EXTENDS_NAME = DSL_DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__TRAITS = DSL_DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__CACHE = DSL_DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__GAP_CLASS = DSL_DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__NO_GAP_CLASS = DSL_DOMAIN_OBJECT__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__SCAFFOLD = DSL_DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DATABASE_TABLE = DSL_DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DISCRIMINATOR_VALUE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DISCRIMINATOR_COLUMN = DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DISCRIMINATOR_TYPE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__DISCRIMINATOR_LENGTH = DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__INHERITANCE_TYPE = DSL_DOMAIN_OBJECT__INHERITANCE_TYPE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__VALIDATE = DSL_DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__NOT_AGGREGATE_ROOT = DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__BELONGS_TO = DSL_DOMAIN_OBJECT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__ATTRIBUTES = DSL_DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__REFERENCES = DSL_DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__OPERATIONS = DSL_DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__REPOSITORY = DSL_DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT__PERSISTENT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT_FEATURE_COUNT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_EVENT_OPERATION_COUNT = DSL_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDomainObjectTypedElementImpl <em>Dsl Domain Object Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDomainObjectTypedElementImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObjectTypedElement()
	 * @generated
	 */
	int DSL_DOMAIN_OBJECT_TYPED_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Dsl Domain Object Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dsl Domain Object Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceOperationImpl <em>Dsl Service Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceOperationImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceOperation()
	 * @generated
	 */
	int DSL_SERVICE_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__DOC = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__VISIBILITY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__RETURN_TYPE = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__NAME = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__PARAMETERS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__THROWS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__HINT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__PUBLISH = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Delegate Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION__DELEGATE_HOLDER = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Dsl Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_FEATURE_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Dsl Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_OPERATION_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceOperationDelegateImpl <em>Dsl Service Operation Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceOperationDelegateImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceOperationDelegate()
	 * @generated
	 */
	int DSL_SERVICE_OPERATION_DELEGATE = 12;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_DELEGATE__DELEGATE = 0;

	/**
	 * The feature id for the '<em><b>Delegate Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Dsl Service Operation Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_DELEGATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Service Operation Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_OPERATION_DELEGATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceRepositoryOperationOptionImpl <em>Dsl Service Repository Operation Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceRepositoryOperationOptionImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceRepositoryOperationOption()
	 * @generated
	 */
	int DSL_SERVICE_REPOSITORY_OPERATION_OPTION = 14;

	/**
	 * The number of structural features of the '<em>Dsl Service Repository Operation Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPERATION_OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dsl Service Repository Operation Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_REPOSITORY_OPERATION_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslResourceOperationImpl <em>Dsl Resource Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslResourceOperationImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResourceOperation()
	 * @generated
	 */
	int DSL_RESOURCE_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__DOC = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__THROWS = 5;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__HINT = 6;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__HTTP_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__PATH = 8;

	/**
	 * The feature id for the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__RETURN_STRING = 9;

	/**
	 * The feature id for the '<em><b>Delegate Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION__DELEGATE_HOLDER = 10;

	/**
	 * The number of structural features of the '<em>Dsl Resource Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Dsl Resource Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslResourceOperationDelegateImpl <em>Dsl Resource Operation Delegate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslResourceOperationDelegateImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResourceOperationDelegate()
	 * @generated
	 */
	int DSL_RESOURCE_OPERATION_DELEGATE = 16;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE = 0;

	/**
	 * The feature id for the '<em><b>Delegate Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Dsl Resource Operation Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_DELEGATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Resource Operation Delegate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_RESOURCE_OPERATION_DELEGATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslRepositoryOperationImpl <em>Dsl Repository Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslRepositoryOperationImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslRepositoryOperation()
	 * @generated
	 */
	int DSL_REPOSITORY_OPERATION = 17;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__DOC = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__VISIBILITY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__RETURN_TYPE = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__NAME = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__PARAMETERS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__THROWS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__HINT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__CACHE = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gap Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__GAP_OPERATION = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>No Gap Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__QUERY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__CONDITION = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__SELECT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__GROUP_BY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__ORDER_BY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Construct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__CONSTRUCT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__BUILD = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__MAP = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__PUBLISH = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Dsl Repository Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION_FEATURE_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Dsl Repository Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION_OPERATION_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslParameterImpl <em>Dsl Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslParameterImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslParameter()
	 * @generated
	 */
	int DSL_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PARAMETER__DOC = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PARAMETER__PARAMETER_TYPE = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PARAMETER__NAME = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PARAMETER_FEATURE_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PARAMETER_OPERATION_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslComplexTypeImpl <em>Dsl Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslComplexTypeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslComplexType()
	 * @generated
	 */
	int DSL_COMPLEX_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__COLLECTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Map Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__MAP_KEY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Dsl Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dsl Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEntityImpl <em>Dsl Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEntityImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEntity()
	 * @generated
	 */
	int DSL_ENTITY = 22;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DOC = DSL_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__NAME = DSL_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__PACKAGE = DSL_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__HINT = DSL_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__ABSTRACT = DSL_DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__EXTENDS_NAME = DSL_DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__TRAITS = DSL_DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__CACHE = DSL_DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__GAP_CLASS = DSL_DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__NO_GAP_CLASS = DSL_DOMAIN_OBJECT__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__SCAFFOLD = DSL_DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DATABASE_TABLE = DSL_DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DISCRIMINATOR_VALUE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DISCRIMINATOR_COLUMN = DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DISCRIMINATOR_TYPE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__DISCRIMINATOR_LENGTH = DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__INHERITANCE_TYPE = DSL_DOMAIN_OBJECT__INHERITANCE_TYPE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__VALIDATE = DSL_DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__NOT_AGGREGATE_ROOT = DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__BELONGS_TO = DSL_DOMAIN_OBJECT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__ATTRIBUTES = DSL_DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__REFERENCES = DSL_DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__OPERATIONS = DSL_DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__REPOSITORY = DSL_DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__EXTENDS = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__NOT_OPTIMISTIC_LOCKING = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Not Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY__NOT_AUDITABLE = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY_FEATURE_COUNT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENTITY_OPERATION_COUNT = DSL_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslValueObjectImpl <em>Dsl Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslValueObjectImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslValueObject()
	 * @generated
	 */
	int DSL_VALUE_OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DOC = DSL_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NAME = DSL_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__PACKAGE = DSL_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__HINT = DSL_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__ABSTRACT = DSL_DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__EXTENDS_NAME = DSL_DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__TRAITS = DSL_DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__CACHE = DSL_DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__GAP_CLASS = DSL_DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NO_GAP_CLASS = DSL_DOMAIN_OBJECT__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__SCAFFOLD = DSL_DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DATABASE_TABLE = DSL_DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DISCRIMINATOR_VALUE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DISCRIMINATOR_COLUMN = DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DISCRIMINATOR_TYPE = DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__DISCRIMINATOR_LENGTH = DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__INHERITANCE_TYPE = DSL_DOMAIN_OBJECT__INHERITANCE_TYPE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__VALIDATE = DSL_DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NOT_AGGREGATE_ROOT = DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__BELONGS_TO = DSL_DOMAIN_OBJECT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__ATTRIBUTES = DSL_DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__REFERENCES = DSL_DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__OPERATIONS = DSL_DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__REPOSITORY = DSL_DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__EXTENDS = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Not Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NOT_IMMUTABLE = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__PERSISTENT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Not Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT__NOT_PERSISTENT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dsl Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT_FEATURE_COUNT = DSL_DOMAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dsl Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_VALUE_OBJECT_OPERATION_COUNT = DSL_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDomainEventImpl <em>Dsl Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDomainEventImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainEvent()
	 * @generated
	 */
	int DSL_DOMAIN_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DOC = DSL_EVENT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__NAME = DSL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__PACKAGE = DSL_EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__HINT = DSL_EVENT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__ABSTRACT = DSL_EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__EXTENDS_NAME = DSL_EVENT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__TRAITS = DSL_EVENT__TRAITS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__CACHE = DSL_EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__GAP_CLASS = DSL_EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__NO_GAP_CLASS = DSL_EVENT__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__SCAFFOLD = DSL_EVENT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DATABASE_TABLE = DSL_EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DISCRIMINATOR_VALUE = DSL_EVENT__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DISCRIMINATOR_COLUMN = DSL_EVENT__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DISCRIMINATOR_TYPE = DSL_EVENT__DISCRIMINATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__DISCRIMINATOR_LENGTH = DSL_EVENT__DISCRIMINATOR_LENGTH;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__INHERITANCE_TYPE = DSL_EVENT__INHERITANCE_TYPE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__VALIDATE = DSL_EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__NOT_AGGREGATE_ROOT = DSL_EVENT__NOT_AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__BELONGS_TO = DSL_EVENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__ATTRIBUTES = DSL_EVENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__REFERENCES = DSL_EVENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__OPERATIONS = DSL_EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__REPOSITORY = DSL_EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__PERSISTENT = DSL_EVENT__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT__EXTENDS = DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT_FEATURE_COUNT = DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_EVENT_OPERATION_COUNT = DSL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslCommandEventImpl <em>Dsl Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslCommandEventImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslCommandEvent()
	 * @generated
	 */
	int DSL_COMMAND_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DOC = DSL_EVENT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__NAME = DSL_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__PACKAGE = DSL_EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__HINT = DSL_EVENT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__ABSTRACT = DSL_EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__EXTENDS_NAME = DSL_EVENT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__TRAITS = DSL_EVENT__TRAITS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__CACHE = DSL_EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__GAP_CLASS = DSL_EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__NO_GAP_CLASS = DSL_EVENT__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__SCAFFOLD = DSL_EVENT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DATABASE_TABLE = DSL_EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DISCRIMINATOR_VALUE = DSL_EVENT__DISCRIMINATOR_VALUE;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DISCRIMINATOR_COLUMN = DSL_EVENT__DISCRIMINATOR_COLUMN;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DISCRIMINATOR_TYPE = DSL_EVENT__DISCRIMINATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__DISCRIMINATOR_LENGTH = DSL_EVENT__DISCRIMINATOR_LENGTH;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__INHERITANCE_TYPE = DSL_EVENT__INHERITANCE_TYPE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__VALIDATE = DSL_EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__NOT_AGGREGATE_ROOT = DSL_EVENT__NOT_AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__BELONGS_TO = DSL_EVENT__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__ATTRIBUTES = DSL_EVENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__REFERENCES = DSL_EVENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__OPERATIONS = DSL_EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__REPOSITORY = DSL_EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__PERSISTENT = DSL_EVENT__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT__EXTENDS = DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT_FEATURE_COUNT = DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_COMMAND_EVENT_OPERATION_COUNT = DSL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslTraitImpl <em>Dsl Trait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslTraitImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslTrait()
	 * @generated
	 */
	int DSL_TRAIT = 26;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__DOC = DSL_SIMPLE_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__NAME = DSL_SIMPLE_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__PACKAGE = DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__HINT = DSL_SIMPLE_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__ATTRIBUTES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__REFERENCES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT__OPERATIONS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT_FEATURE_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_TRAIT_OPERATION_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDomainObjectOperationImpl <em>Dsl Domain Object Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDomainObjectOperationImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObjectOperation()
	 * @generated
	 */
	int DSL_DOMAIN_OBJECT_OPERATION = 27;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__DOC = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__ABSTRACT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__VISIBILITY = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__RETURN_TYPE = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__NAME = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__PARAMETERS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__THROWS = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION__HINT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dsl Domain Object Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION_FEATURE_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dsl Domain Object Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DOMAIN_OBJECT_OPERATION_OPERATION_COUNT = DSL_DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDataTransferObjectImpl <em>Dsl Data Transfer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDataTransferObjectImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDataTransferObject()
	 * @generated
	 */
	int DSL_DATA_TRANSFER_OBJECT = 28;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__DOC = DSL_SIMPLE_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__NAME = DSL_SIMPLE_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__PACKAGE = DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__HINT = DSL_SIMPLE_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__ABSTRACT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__EXTENDS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__VALIDATE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT__REFERENCES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dsl Data Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT_FEATURE_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dsl Data Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DATA_TRANSFER_OBJECT_OPERATION_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslBasicTypeImpl <em>Dsl Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslBasicTypeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslBasicType()
	 * @generated
	 */
	int DSL_BASIC_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__DOC = DSL_SIMPLE_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__NAME = DSL_SIMPLE_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__PACKAGE = DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__HINT = DSL_SIMPLE_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__TRAITS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__NOT_IMMUTABLE = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__NO_GAP_CLASS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__ATTRIBUTES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__REFERENCES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE__OPERATIONS = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dsl Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE_FEATURE_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dsl Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_BASIC_TYPE_OPERATION_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslAnyPropertyImpl <em>Dsl Any Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslAnyPropertyImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslAnyProperty()
	 * @generated
	 */
	int DSL_ANY_PROPERTY = 42;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__DOC = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__COLLECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__KEY = 4;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NOT_CHANGEABLE = 5;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__REQUIRED = 6;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NULLABLE = 7;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NULLABLE_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__HINT = 9;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NOT_EMPTY = 10;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__SIZE = 12;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__VALIDATE = 13;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY__TRANSIENT = 14;

	/**
	 * The number of structural features of the '<em>Dsl Any Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Dsl Any Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ANY_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslPropertyImpl <em>Dsl Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslPropertyImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslProperty()
	 * @generated
	 */
	int DSL_PROPERTY = 43;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__DOC = DSL_ANY_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__VISIBILITY = DSL_ANY_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__COLLECTION_TYPE = DSL_ANY_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NAME = DSL_ANY_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__KEY = DSL_ANY_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NOT_CHANGEABLE = DSL_ANY_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__REQUIRED = DSL_ANY_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NULLABLE = DSL_ANY_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NULLABLE_MESSAGE = DSL_ANY_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__HINT = DSL_ANY_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NOT_EMPTY = DSL_ANY_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__NOT_EMPTY_MESSAGE = DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__SIZE = DSL_ANY_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__VALIDATE = DSL_ANY_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__TRANSIENT = DSL_ANY_PROPERTY__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY__DATABASE_COLUMN = DSL_ANY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY_FEATURE_COUNT = DSL_ANY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_PROPERTY_OPERATION_COUNT = DSL_ANY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslAttributeImpl <em>Dsl Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslAttributeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslAttribute()
	 * @generated
	 */
	int DSL_ATTRIBUTE = 30;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DOC = DSL_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__VISIBILITY = DSL_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__COLLECTION_TYPE = DSL_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NAME = DSL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__KEY = DSL_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NOT_CHANGEABLE = DSL_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__REQUIRED = DSL_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NULLABLE = DSL_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NULLABLE_MESSAGE = DSL_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__HINT = DSL_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NOT_EMPTY = DSL_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NOT_EMPTY_MESSAGE = DSL_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__SIZE = DSL_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__VALIDATE = DSL_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__TRANSIENT = DSL_PROPERTY__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DATABASE_COLUMN = DSL_PROPERTY__DATABASE_COLUMN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__TYPE = DSL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__INDEX = DSL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assert False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__ASSERT_FALSE = DSL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assert False Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assert True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__ASSERT_TRUE = DSL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assert True Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__CREDIT_CARD_NUMBER = DSL_PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Credit Card Number Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DIGITS = DSL_PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__EMAIL = DSL_PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__EMAIL_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__FUTURE = DSL_PROPERTY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Future Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__FUTURE_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__PAST = DSL_PROPERTY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Past Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__PAST_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__MAX = DSL_PROPERTY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__MIN = DSL_PROPERTY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Decimal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DECIMAL_MAX = DSL_PROPERTY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Decimal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DECIMAL_MIN = DSL_PROPERTY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Not Blank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NOT_BLANK = DSL_PROPERTY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Not Blank Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__NOT_BLANK_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__PATTERN = DSL_PROPERTY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__RANGE = DSL_PROPERTY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__LENGTH = DSL_PROPERTY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Script Assert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__SCRIPT_ASSERT = DSL_PROPERTY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__URL = DSL_PROPERTY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE__DATABASE_TYPE = DSL_PROPERTY_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Dsl Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE_FEATURE_COUNT = DSL_PROPERTY_FEATURE_COUNT + 27;

	/**
	 * The number of operations of the '<em>Dsl Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ATTRIBUTE_OPERATION_COUNT = DSL_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslReferenceImpl <em>Dsl Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslReferenceImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslReference()
	 * @generated
	 */
	int DSL_REFERENCE = 31;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__DOC = DSL_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__VISIBILITY = DSL_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__COLLECTION_TYPE = DSL_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NAME = DSL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__KEY = DSL_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NOT_CHANGEABLE = DSL_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__REQUIRED = DSL_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NULLABLE = DSL_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NULLABLE_MESSAGE = DSL_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__HINT = DSL_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NOT_EMPTY = DSL_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__NOT_EMPTY_MESSAGE = DSL_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__SIZE = DSL_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__VALIDATE = DSL_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__TRANSIENT = DSL_PROPERTY__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__DATABASE_COLUMN = DSL_PROPERTY__DATABASE_COLUMN;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__DOMAIN_OBJECT_TYPE = DSL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__CASCADE = DSL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__FETCH = DSL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__CACHE = DSL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__INVERSE = DSL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Database Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__DATABASE_JOIN_TABLE = DSL_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Database Join Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__DATABASE_JOIN_COLUMN = DSL_PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__VALID = DSL_PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Valid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__VALID_MESSAGE = DSL_PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__ORDER_BY = DSL_PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__ORDER_COLUMN = DSL_PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Order Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__ORDER_COLUMN_NAME = DSL_PROPERTY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Opposite Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE__OPPOSITE_HOLDER = DSL_PROPERTY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Dsl Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE_FEATURE_COUNT = DSL_PROPERTY_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Dsl Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REFERENCE_OPERATION_COUNT = DSL_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDtoPropertyImpl <em>Dsl Dto Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDtoPropertyImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoProperty()
	 * @generated
	 */
	int DSL_DTO_PROPERTY = 44;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__DOC = DSL_ANY_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__VISIBILITY = DSL_ANY_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__COLLECTION_TYPE = DSL_ANY_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NAME = DSL_ANY_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__KEY = DSL_ANY_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NOT_CHANGEABLE = DSL_ANY_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__REQUIRED = DSL_ANY_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NULLABLE = DSL_ANY_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NULLABLE_MESSAGE = DSL_ANY_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__HINT = DSL_ANY_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NOT_EMPTY = DSL_ANY_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__NOT_EMPTY_MESSAGE = DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__SIZE = DSL_ANY_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__VALIDATE = DSL_ANY_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY__TRANSIENT = DSL_ANY_PROPERTY__TRANSIENT;

	/**
	 * The number of structural features of the '<em>Dsl Dto Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY_FEATURE_COUNT = DSL_ANY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dsl Dto Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_PROPERTY_OPERATION_COUNT = DSL_ANY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDtoAttributeImpl <em>Dsl Dto Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDtoAttributeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoAttribute()
	 * @generated
	 */
	int DSL_DTO_ATTRIBUTE = 32;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__DOC = DSL_DTO_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__VISIBILITY = DSL_DTO_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__COLLECTION_TYPE = DSL_DTO_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NAME = DSL_DTO_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__KEY = DSL_DTO_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NOT_CHANGEABLE = DSL_DTO_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__REQUIRED = DSL_DTO_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NULLABLE = DSL_DTO_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NULLABLE_MESSAGE = DSL_DTO_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__HINT = DSL_DTO_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NOT_EMPTY = DSL_DTO_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NOT_EMPTY_MESSAGE = DSL_DTO_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__SIZE = DSL_DTO_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__VALIDATE = DSL_DTO_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__TRANSIENT = DSL_DTO_PROPERTY__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__TYPE = DSL_DTO_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assert False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__ASSERT_FALSE = DSL_DTO_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assert False Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__ASSERT_FALSE_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assert True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__ASSERT_TRUE = DSL_DTO_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assert True Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__ASSERT_TRUE_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER = DSL_DTO_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Credit Card Number Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__DIGITS = DSL_DTO_PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__EMAIL = DSL_DTO_PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__EMAIL_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__FUTURE = DSL_DTO_PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Future Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__FUTURE_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__PAST = DSL_DTO_PROPERTY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Past Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__PAST_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__MAX = DSL_DTO_PROPERTY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__MIN = DSL_DTO_PROPERTY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Decimal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__DECIMAL_MAX = DSL_DTO_PROPERTY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Decimal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__DECIMAL_MIN = DSL_DTO_PROPERTY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Not Blank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NOT_BLANK = DSL_DTO_PROPERTY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Not Blank Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__NOT_BLANK_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__PATTERN = DSL_DTO_PROPERTY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__RANGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__LENGTH = DSL_DTO_PROPERTY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Script Assert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__SCRIPT_ASSERT = DSL_DTO_PROPERTY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE__URL = DSL_DTO_PROPERTY_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Dsl Dto Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE_FEATURE_COUNT = DSL_DTO_PROPERTY_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Dsl Dto Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_ATTRIBUTE_OPERATION_COUNT = DSL_DTO_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDtoReferenceImpl <em>Dsl Dto Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDtoReferenceImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoReference()
	 * @generated
	 */
	int DSL_DTO_REFERENCE = 33;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__DOC = DSL_DTO_PROPERTY__DOC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__VISIBILITY = DSL_DTO_PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__COLLECTION_TYPE = DSL_DTO_PROPERTY__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NAME = DSL_DTO_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__KEY = DSL_DTO_PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NOT_CHANGEABLE = DSL_DTO_PROPERTY__NOT_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__REQUIRED = DSL_DTO_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NULLABLE = DSL_DTO_PROPERTY__NULLABLE;

	/**
	 * The feature id for the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NULLABLE_MESSAGE = DSL_DTO_PROPERTY__NULLABLE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__HINT = DSL_DTO_PROPERTY__HINT;

	/**
	 * The feature id for the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NOT_EMPTY = DSL_DTO_PROPERTY__NOT_EMPTY;

	/**
	 * The feature id for the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__NOT_EMPTY_MESSAGE = DSL_DTO_PROPERTY__NOT_EMPTY_MESSAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__SIZE = DSL_DTO_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__VALIDATE = DSL_DTO_PROPERTY__VALIDATE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__TRANSIENT = DSL_DTO_PROPERTY__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE = DSL_DTO_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__VALID = DSL_DTO_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE__VALID_MESSAGE = DSL_DTO_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE_FEATURE_COUNT = DSL_DTO_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DTO_REFERENCE_OPERATION_COUNT = DSL_DTO_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslOppositeHolderImpl <em>Dsl Opposite Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslOppositeHolderImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslOppositeHolder()
	 * @generated
	 */
	int DSL_OPPOSITE_HOLDER = 34;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPPOSITE_HOLDER__OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Dsl Opposite Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPPOSITE_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsl Opposite Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_OPPOSITE_HOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslRepositoryImpl <em>Dsl Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslRepositoryImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslRepository()
	 * @generated
	 */
	int DSL_REPOSITORY = 35;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__DOC = DSL_SERVICE_REPOSITORY_OPTION__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__NAME = DSL_SERVICE_REPOSITORY_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__GAP_CLASS = DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__NO_GAP_CLASS = DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__HINT = DSL_SERVICE_REPOSITORY_OPTION__HINT;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__SUBSCRIBE = DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__DEPENDENCIES = DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY__OPERATIONS = DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dsl Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_FEATURE_COUNT = DSL_SERVICE_REPOSITORY_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dsl Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_REPOSITORY_OPERATION_COUNT = DSL_SERVICE_REPOSITORY_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslServiceDependencyImpl <em>Dsl Service Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslServiceDependencyImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceDependency()
	 * @generated
	 */
	int DSL_SERVICE_DEPENDENCY = 36;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_DEPENDENCY__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dsl Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_DEPENDENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsl Service Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_SERVICE_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslDependencyImpl <em>Dsl Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslDependencyImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDependency()
	 * @generated
	 */
	int DSL_DEPENDENCY = 37;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DEPENDENCY__DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DEPENDENCY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Dsl Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEnumImpl <em>Dsl Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEnumImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnum()
	 * @generated
	 */
	int DSL_ENUM = 38;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__DOC = DSL_SIMPLE_DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__NAME = DSL_SIMPLE_DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__PACKAGE = DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__HINT = DSL_SIMPLE_DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__ORDINAL = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__ATTRIBUTES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM__VALUES = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dsl Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_FEATURE_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dsl Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_OPERATION_COUNT = DSL_SIMPLE_DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEnumAttributeImpl <em>Dsl Enum Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEnumAttributeImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumAttribute()
	 * @generated
	 */
	int DSL_ENUM_ATTRIBUTE = 39;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE__DOC = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE__KEY = 3;

	/**
	 * The number of structural features of the '<em>Dsl Enum Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dsl Enum Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEnumValueImpl <em>Dsl Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEnumValueImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumValue()
	 * @generated
	 */
	int DSL_ENUM_VALUE = 40;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_VALUE__DOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_VALUE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_VALUE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Dsl Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dsl Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.impl.DslEnumParameterImpl <em>Dsl Enum Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.impl.DslEnumParameterImpl
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumParameter()
	 * @generated
	 */
	int DSL_ENUM_PARAMETER = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_PARAMETER__INTEGER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Dsl Enum Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dsl Enum Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_ENUM_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sculptordsl.DslHttpMethod <em>Dsl Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.DslHttpMethod
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslHttpMethod()
	 * @generated
	 */
	int DSL_HTTP_METHOD = 45;

	/**
	 * The meta object id for the '{@link sculptordsl.DslInheritanceType <em>Dsl Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.DslInheritanceType
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslInheritanceType()
	 * @generated
	 */
	int DSL_INHERITANCE_TYPE = 46;

	/**
	 * The meta object id for the '{@link sculptordsl.DslDiscriminatorType <em>Dsl Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.DslDiscriminatorType
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDiscriminatorType()
	 * @generated
	 */
	int DSL_DISCRIMINATOR_TYPE = 47;

	/**
	 * The meta object id for the '{@link sculptordsl.DslCollectionType <em>Dsl Collection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.DslCollectionType
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslCollectionType()
	 * @generated
	 */
	int DSL_COLLECTION_TYPE = 48;

	/**
	 * The meta object id for the '{@link sculptordsl.DslVisibility <em>Dsl Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sculptordsl.DslVisibility
	 * @see sculptordsl.impl.SculptordslPackageImpl#getDslVisibility()
	 * @generated
	 */
	int DSL_VISIBILITY = 49;


	/**
	 * Returns the meta object for class '{@link sculptordsl.DslModel <em>Dsl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Model</em>'.
	 * @see sculptordsl.DslModel
	 * @generated
	 */
	EClass getDslModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see sculptordsl.DslModel#getImports()
	 * @see #getDslModel()
	 * @generated
	 */
	EReference getDslModel_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslModel#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>App</em>'.
	 * @see sculptordsl.DslModel#getApp()
	 * @see #getDslModel()
	 * @generated
	 */
	EReference getDslModel_App();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslImport <em>Dsl Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Import</em>'.
	 * @see sculptordsl.DslImport
	 * @generated
	 */
	EClass getDslImport();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see sculptordsl.DslImport#getImportURI()
	 * @see #getDslImport()
	 * @generated
	 */
	EAttribute getDslImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslApplication <em>Dsl Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Application</em>'.
	 * @see sculptordsl.DslApplication
	 * @generated
	 */
	EClass getDslApplication();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslApplication#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslApplication#getDoc()
	 * @see #getDslApplication()
	 * @generated
	 */
	EAttribute getDslApplication_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslApplication#getName()
	 * @see #getDslApplication()
	 * @generated
	 */
	EAttribute getDslApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslApplication#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see sculptordsl.DslApplication#getBasePackage()
	 * @see #getDslApplication()
	 * @generated
	 */
	EAttribute getDslApplication_BasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslApplication#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see sculptordsl.DslApplication#getModules()
	 * @see #getDslApplication()
	 * @generated
	 */
	EReference getDslApplication_Modules();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslModule <em>Dsl Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Module</em>'.
	 * @see sculptordsl.DslModule
	 * @generated
	 */
	EClass getDslModule();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslModule#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslModule#getDoc()
	 * @see #getDslModule()
	 * @generated
	 */
	EAttribute getDslModule_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslModule#getName()
	 * @see #getDslModule()
	 * @generated
	 */
	EAttribute getDslModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslModule#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see sculptordsl.DslModule#isExternal()
	 * @see #getDslModule()
	 * @generated
	 */
	EAttribute getDslModule_External();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslModule#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see sculptordsl.DslModule#getBasePackage()
	 * @see #getDslModule()
	 * @generated
	 */
	EAttribute getDslModule_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslModule#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslModule#getHint()
	 * @see #getDslModule()
	 * @generated
	 */
	EAttribute getDslModule_Hint();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslModule#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see sculptordsl.DslModule#getServices()
	 * @see #getDslModule()
	 * @generated
	 */
	EReference getDslModule_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslModule#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see sculptordsl.DslModule#getResources()
	 * @see #getDslModule()
	 * @generated
	 */
	EReference getDslModule_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslModule#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumers</em>'.
	 * @see sculptordsl.DslModule#getConsumers()
	 * @see #getDslModule()
	 * @generated
	 */
	EReference getDslModule_Consumers();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslModule#getDomainObjects <em>Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Objects</em>'.
	 * @see sculptordsl.DslModule#getDomainObjects()
	 * @see #getDslModule()
	 * @generated
	 */
	EReference getDslModule_DomainObjects();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslService <em>Dsl Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service</em>'.
	 * @see sculptordsl.DslService
	 * @generated
	 */
	EClass getDslService();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslService#isWebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Service</em>'.
	 * @see sculptordsl.DslService#isWebService()
	 * @see #getDslService()
	 * @generated
	 */
	EAttribute getDslService_WebService();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslService#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslService#getOperations()
	 * @see #getDslService()
	 * @generated
	 */
	EReference getDslService_Operations();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslResource <em>Dsl Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Resource</em>'.
	 * @see sculptordsl.DslResource
	 * @generated
	 */
	EClass getDslResource();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslResource#getDoc()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslResource#getName()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptordsl.DslResource#isGapClass()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#isNoGapClass <em>No Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Class</em>'.
	 * @see sculptordsl.DslResource#isNoGapClass()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_NoGapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslResource#getHint()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_Hint();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#isScaffold <em>Scaffold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaffold</em>'.
	 * @see sculptordsl.DslResource#isScaffold()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_Scaffold();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see sculptordsl.DslResource#getPath()
	 * @see #getDslResource()
	 * @generated
	 */
	EAttribute getDslResource_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslResource#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see sculptordsl.DslResource#getDependencies()
	 * @see #getDslResource()
	 * @generated
	 */
	EReference getDslResource_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslResource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslResource#getOperations()
	 * @see #getDslResource()
	 * @generated
	 */
	EReference getDslResource_Operations();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslConsumer <em>Dsl Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Consumer</em>'.
	 * @see sculptordsl.DslConsumer
	 * @generated
	 */
	EClass getDslConsumer();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslConsumer#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslConsumer#getDoc()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EAttribute getDslConsumer_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslConsumer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslConsumer#getName()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EAttribute getDslConsumer_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslConsumer#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslConsumer#getHint()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EAttribute getDslConsumer_Hint();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslConsumer#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see sculptordsl.DslConsumer#getDependencies()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EReference getDslConsumer_Dependencies();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslConsumer#getMessageRoot <em>Message Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Root</em>'.
	 * @see sculptordsl.DslConsumer#getMessageRoot()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EReference getDslConsumer_MessageRoot();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslConsumer#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see sculptordsl.DslConsumer#getChannel()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EAttribute getDslConsumer_Channel();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslConsumer#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe</em>'.
	 * @see sculptordsl.DslConsumer#getSubscribe()
	 * @see #getDslConsumer()
	 * @generated
	 */
	EReference getDslConsumer_Subscribe();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslSubscribe <em>Dsl Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Subscribe</em>'.
	 * @see sculptordsl.DslSubscribe
	 * @generated
	 */
	EClass getDslSubscribe();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSubscribe#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see sculptordsl.DslSubscribe#getTopic()
	 * @see #getDslSubscribe()
	 * @generated
	 */
	EAttribute getDslSubscribe_Topic();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSubscribe#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see sculptordsl.DslSubscribe#getEventBus()
	 * @see #getDslSubscribe()
	 * @generated
	 */
	EAttribute getDslSubscribe_EventBus();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslPublish <em>Dsl Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Publish</em>'.
	 * @see sculptordsl.DslPublish
	 * @generated
	 */
	EClass getDslPublish();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslPublish#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see sculptordsl.DslPublish#getEventType()
	 * @see #getDslPublish()
	 * @generated
	 */
	EReference getDslPublish_EventType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslPublish#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see sculptordsl.DslPublish#getTopic()
	 * @see #getDslPublish()
	 * @generated
	 */
	EAttribute getDslPublish_Topic();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslPublish#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see sculptordsl.DslPublish#getEventBus()
	 * @see #getDslPublish()
	 * @generated
	 */
	EAttribute getDslPublish_EventBus();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEvent <em>Dsl Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Event</em>'.
	 * @see sculptordsl.DslEvent
	 * @generated
	 */
	EClass getDslEvent();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEvent#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see sculptordsl.DslEvent#isPersistent()
	 * @see #getDslEvent()
	 * @generated
	 */
	EAttribute getDslEvent_Persistent();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDomainObjectTypedElement <em>Dsl Domain Object Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Domain Object Typed Element</em>'.
	 * @see sculptordsl.DslDomainObjectTypedElement
	 * @generated
	 */
	EClass getDslDomainObjectTypedElement();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslServiceOperation <em>Dsl Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service Operation</em>'.
	 * @see sculptordsl.DslServiceOperation
	 * @generated
	 */
	EClass getDslServiceOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceOperation#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslServiceOperation#getDoc()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EAttribute getDslServiceOperation_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceOperation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see sculptordsl.DslServiceOperation#getVisibility()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EAttribute getDslServiceOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslServiceOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see sculptordsl.DslServiceOperation#getReturnType()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EReference getDslServiceOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslServiceOperation#getName()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EAttribute getDslServiceOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslServiceOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptordsl.DslServiceOperation#getParameters()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EReference getDslServiceOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceOperation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see sculptordsl.DslServiceOperation#getThrows()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EAttribute getDslServiceOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceOperation#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslServiceOperation#getHint()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EAttribute getDslServiceOperation_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslServiceOperation#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish</em>'.
	 * @see sculptordsl.DslServiceOperation#getPublish()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EReference getDslServiceOperation_Publish();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslServiceOperation#getDelegateHolder <em>Delegate Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate Holder</em>'.
	 * @see sculptordsl.DslServiceOperation#getDelegateHolder()
	 * @see #getDslServiceOperation()
	 * @generated
	 */
	EReference getDslServiceOperation_DelegateHolder();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslServiceOperationDelegate <em>Dsl Service Operation Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service Operation Delegate</em>'.
	 * @see sculptordsl.DslServiceOperationDelegate
	 * @generated
	 */
	EClass getDslServiceOperationDelegate();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslServiceOperationDelegate#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see sculptordsl.DslServiceOperationDelegate#getDelegate()
	 * @see #getDslServiceOperationDelegate()
	 * @generated
	 */
	EReference getDslServiceOperationDelegate_Delegate();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslServiceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate Operation</em>'.
	 * @see sculptordsl.DslServiceOperationDelegate#getDelegateOperation()
	 * @see #getDslServiceOperationDelegate()
	 * @generated
	 */
	EReference getDslServiceOperationDelegate_DelegateOperation();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslServiceRepositoryOption <em>Dsl Service Repository Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service Repository Option</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption
	 * @generated
	 */
	EClass getDslServiceRepositoryOption();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceRepositoryOption#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#getDoc()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EAttribute getDslServiceRepositoryOption_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceRepositoryOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#getName()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EAttribute getDslServiceRepositoryOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceRepositoryOption#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#isGapClass()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EAttribute getDslServiceRepositoryOption_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceRepositoryOption#isNoGapClass <em>No Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Class</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#isNoGapClass()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EAttribute getDslServiceRepositoryOption_NoGapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslServiceRepositoryOption#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#getHint()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EAttribute getDslServiceRepositoryOption_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslServiceRepositoryOption#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#getSubscribe()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EReference getDslServiceRepositoryOption_Subscribe();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslServiceRepositoryOption#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see sculptordsl.DslServiceRepositoryOption#getDependencies()
	 * @see #getDslServiceRepositoryOption()
	 * @generated
	 */
	EReference getDslServiceRepositoryOption_Dependencies();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslServiceRepositoryOperationOption <em>Dsl Service Repository Operation Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service Repository Operation Option</em>'.
	 * @see sculptordsl.DslServiceRepositoryOperationOption
	 * @generated
	 */
	EClass getDslServiceRepositoryOperationOption();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslResourceOperation <em>Dsl Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Resource Operation</em>'.
	 * @see sculptordsl.DslResourceOperation
	 * @generated
	 */
	EClass getDslResourceOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslResourceOperation#getDoc()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see sculptordsl.DslResourceOperation#getVisibility()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslResourceOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see sculptordsl.DslResourceOperation#getReturnType()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EReference getDslResourceOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslResourceOperation#getName()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslResourceOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptordsl.DslResourceOperation#getParameters()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EReference getDslResourceOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see sculptordsl.DslResourceOperation#getThrows()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslResourceOperation#getHint()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Hint();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see sculptordsl.DslResourceOperation#getHttpMethod()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see sculptordsl.DslResourceOperation#getPath()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_Path();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslResourceOperation#getReturnString <em>Return String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return String</em>'.
	 * @see sculptordsl.DslResourceOperation#getReturnString()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EAttribute getDslResourceOperation_ReturnString();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslResourceOperation#getDelegateHolder <em>Delegate Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate Holder</em>'.
	 * @see sculptordsl.DslResourceOperation#getDelegateHolder()
	 * @see #getDslResourceOperation()
	 * @generated
	 */
	EReference getDslResourceOperation_DelegateHolder();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslResourceOperationDelegate <em>Dsl Resource Operation Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Resource Operation Delegate</em>'.
	 * @see sculptordsl.DslResourceOperationDelegate
	 * @generated
	 */
	EClass getDslResourceOperationDelegate();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslResourceOperationDelegate#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see sculptordsl.DslResourceOperationDelegate#getDelegate()
	 * @see #getDslResourceOperationDelegate()
	 * @generated
	 */
	EReference getDslResourceOperationDelegate_Delegate();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslResourceOperationDelegate#getDelegateOperation <em>Delegate Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate Operation</em>'.
	 * @see sculptordsl.DslResourceOperationDelegate#getDelegateOperation()
	 * @see #getDslResourceOperationDelegate()
	 * @generated
	 */
	EReference getDslResourceOperationDelegate_DelegateOperation();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslRepositoryOperation <em>Dsl Repository Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Repository Operation</em>'.
	 * @see sculptordsl.DslRepositoryOperation
	 * @generated
	 */
	EClass getDslRepositoryOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getDoc()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getVisibility()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslRepositoryOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getReturnType()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EReference getDslRepositoryOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getName()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslRepositoryOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getParameters()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EReference getDslRepositoryOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getThrows()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getHint()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Hint();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isCache()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Cache();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isGapOperation <em>Gap Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Operation</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isGapOperation()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_GapOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isNoGapOperation <em>No Gap Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Operation</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isNoGapOperation()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_NoGapOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getQuery()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Query();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getCondition()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Condition();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getSelect()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Select();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group By</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getGroupBy()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_GroupBy();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getOrderBy()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isConstruct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construct</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isConstruct()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Construct();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isBuild()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Build();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isMap()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_Map();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslRepositoryOperation#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getPublish()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EReference getDslRepositoryOperation_Publish();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate To Access Object</em>'.
	 * @see sculptordsl.DslRepositoryOperation#isDelegateToAccessObject()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_DelegateToAccessObject();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslRepositoryOperation#getAccessObjectName <em>Access Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Object Name</em>'.
	 * @see sculptordsl.DslRepositoryOperation#getAccessObjectName()
	 * @see #getDslRepositoryOperation()
	 * @generated
	 */
	EAttribute getDslRepositoryOperation_AccessObjectName();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslParameter <em>Dsl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Parameter</em>'.
	 * @see sculptordsl.DslParameter
	 * @generated
	 */
	EClass getDslParameter();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslParameter#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslParameter#getDoc()
	 * @see #getDslParameter()
	 * @generated
	 */
	EAttribute getDslParameter_Doc();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see sculptordsl.DslParameter#getParameterType()
	 * @see #getDslParameter()
	 * @generated
	 */
	EReference getDslParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslParameter#getName()
	 * @see #getDslParameter()
	 * @generated
	 */
	EAttribute getDslParameter_Name();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslComplexType <em>Dsl Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Complex Type</em>'.
	 * @see sculptordsl.DslComplexType
	 * @generated
	 */
	EClass getDslComplexType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslComplexType#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see sculptordsl.DslComplexType#getCollectionType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EAttribute getDslComplexType_CollectionType();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslComplexType#getDomainObjectType <em>Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Type</em>'.
	 * @see sculptordsl.DslComplexType#getDomainObjectType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EReference getDslComplexType_DomainObjectType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslComplexType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sculptordsl.DslComplexType#getType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EAttribute getDslComplexType_Type();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslComplexType#getMapCollectionType <em>Map Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Collection Type</em>'.
	 * @see sculptordsl.DslComplexType#getMapCollectionType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EAttribute getDslComplexType_MapCollectionType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslComplexType#getMapKeyType <em>Map Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Type</em>'.
	 * @see sculptordsl.DslComplexType#getMapKeyType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EAttribute getDslComplexType_MapKeyType();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslComplexType#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Key Domain Object Type</em>'.
	 * @see sculptordsl.DslComplexType#getMapKeyDomainObjectType()
	 * @see #getDslComplexType()
	 * @generated
	 */
	EReference getDslComplexType_MapKeyDomainObjectType();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslSimpleDomainObject <em>Dsl Simple Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Simple Domain Object</em>'.
	 * @see sculptordsl.DslSimpleDomainObject
	 * @generated
	 */
	EClass getDslSimpleDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSimpleDomainObject#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslSimpleDomainObject#getDoc()
	 * @see #getDslSimpleDomainObject()
	 * @generated
	 */
	EAttribute getDslSimpleDomainObject_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSimpleDomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslSimpleDomainObject#getName()
	 * @see #getDslSimpleDomainObject()
	 * @generated
	 */
	EAttribute getDslSimpleDomainObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSimpleDomainObject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see sculptordsl.DslSimpleDomainObject#getPackage()
	 * @see #getDslSimpleDomainObject()
	 * @generated
	 */
	EAttribute getDslSimpleDomainObject_Package();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslSimpleDomainObject#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslSimpleDomainObject#getHint()
	 * @see #getDslSimpleDomainObject()
	 * @generated
	 */
	EAttribute getDslSimpleDomainObject_Hint();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDomainObject <em>Dsl Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Domain Object</em>'.
	 * @see sculptordsl.DslDomainObject
	 * @generated
	 */
	EClass getDslDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see sculptordsl.DslDomainObject#isAbstract()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getExtendsName <em>Extends Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Name</em>'.
	 * @see sculptordsl.DslDomainObject#getExtendsName()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_ExtendsName();

	/**
	 * Returns the meta object for the reference list '{@link sculptordsl.DslDomainObject#getTraits <em>Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traits</em>'.
	 * @see sculptordsl.DslDomainObject#getTraits()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_Traits();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see sculptordsl.DslDomainObject#isCache()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_Cache();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptordsl.DslDomainObject#isGapClass()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isNoGapClass <em>No Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Class</em>'.
	 * @see sculptordsl.DslDomainObject#isNoGapClass()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_NoGapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isScaffold <em>Scaffold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaffold</em>'.
	 * @see sculptordsl.DslDomainObject#isScaffold()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_Scaffold();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getDatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table</em>'.
	 * @see sculptordsl.DslDomainObject#getDatabaseTable()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_DatabaseTable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see sculptordsl.DslDomainObject#getDiscriminatorValue()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_DiscriminatorValue();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see sculptordsl.DslDomainObject#getDiscriminatorColumn()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_DiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see sculptordsl.DslDomainObject#getDiscriminatorType()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getDiscriminatorLength <em>Discriminator Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Length</em>'.
	 * @see sculptordsl.DslDomainObject#getDiscriminatorLength()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_DiscriminatorLength();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance Type</em>'.
	 * @see sculptordsl.DslDomainObject#getInheritanceType()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_InheritanceType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see sculptordsl.DslDomainObject#getValidate()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_Validate();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObject#isNotAggregateRoot <em>Not Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Aggregate Root</em>'.
	 * @see sculptordsl.DslDomainObject#isNotAggregateRoot()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EAttribute getDslDomainObject_NotAggregateRoot();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslDomainObject#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see sculptordsl.DslDomainObject#getBelongsTo()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_BelongsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDomainObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see sculptordsl.DslDomainObject#getAttributes()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDomainObject#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see sculptordsl.DslDomainObject#getReferences()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_References();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslDomainObject#getOperations()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_Operations();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslDomainObject#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see sculptordsl.DslDomainObject#getRepository()
	 * @see #getDslDomainObject()
	 * @generated
	 */
	EReference getDslDomainObject_Repository();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEntity <em>Dsl Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Entity</em>'.
	 * @see sculptordsl.DslEntity
	 * @generated
	 */
	EClass getDslEntity();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslEntity#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptordsl.DslEntity#getExtends()
	 * @see #getDslEntity()
	 * @generated
	 */
	EReference getDslEntity_Extends();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEntity#isNotOptimisticLocking <em>Not Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Optimistic Locking</em>'.
	 * @see sculptordsl.DslEntity#isNotOptimisticLocking()
	 * @see #getDslEntity()
	 * @generated
	 */
	EAttribute getDslEntity_NotOptimisticLocking();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEntity#isNotAuditable <em>Not Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Auditable</em>'.
	 * @see sculptordsl.DslEntity#isNotAuditable()
	 * @see #getDslEntity()
	 * @generated
	 */
	EAttribute getDslEntity_NotAuditable();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslValueObject <em>Dsl Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Value Object</em>'.
	 * @see sculptordsl.DslValueObject
	 * @generated
	 */
	EClass getDslValueObject();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslValueObject#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptordsl.DslValueObject#getExtends()
	 * @see #getDslValueObject()
	 * @generated
	 */
	EReference getDslValueObject_Extends();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslValueObject#isNotOptimisticLocking <em>Not Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Optimistic Locking</em>'.
	 * @see sculptordsl.DslValueObject#isNotOptimisticLocking()
	 * @see #getDslValueObject()
	 * @generated
	 */
	EAttribute getDslValueObject_NotOptimisticLocking();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslValueObject#isNotImmutable <em>Not Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Immutable</em>'.
	 * @see sculptordsl.DslValueObject#isNotImmutable()
	 * @see #getDslValueObject()
	 * @generated
	 */
	EAttribute getDslValueObject_NotImmutable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslValueObject#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see sculptordsl.DslValueObject#isPersistent()
	 * @see #getDslValueObject()
	 * @generated
	 */
	EAttribute getDslValueObject_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslValueObject#isNotPersistent <em>Not Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Persistent</em>'.
	 * @see sculptordsl.DslValueObject#isNotPersistent()
	 * @see #getDslValueObject()
	 * @generated
	 */
	EAttribute getDslValueObject_NotPersistent();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDomainEvent <em>Dsl Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Domain Event</em>'.
	 * @see sculptordsl.DslDomainEvent
	 * @generated
	 */
	EClass getDslDomainEvent();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslDomainEvent#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptordsl.DslDomainEvent#getExtends()
	 * @see #getDslDomainEvent()
	 * @generated
	 */
	EReference getDslDomainEvent_Extends();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslCommandEvent <em>Dsl Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Command Event</em>'.
	 * @see sculptordsl.DslCommandEvent
	 * @generated
	 */
	EClass getDslCommandEvent();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslCommandEvent#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptordsl.DslCommandEvent#getExtends()
	 * @see #getDslCommandEvent()
	 * @generated
	 */
	EReference getDslCommandEvent_Extends();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslTrait <em>Dsl Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Trait</em>'.
	 * @see sculptordsl.DslTrait
	 * @generated
	 */
	EClass getDslTrait();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslTrait#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see sculptordsl.DslTrait#getAttributes()
	 * @see #getDslTrait()
	 * @generated
	 */
	EReference getDslTrait_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslTrait#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see sculptordsl.DslTrait#getReferences()
	 * @see #getDslTrait()
	 * @generated
	 */
	EReference getDslTrait_References();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslTrait#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslTrait#getOperations()
	 * @see #getDslTrait()
	 * @generated
	 */
	EReference getDslTrait_Operations();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDomainObjectOperation <em>Dsl Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Domain Object Operation</em>'.
	 * @see sculptordsl.DslDomainObjectOperation
	 * @generated
	 */
	EClass getDslDomainObjectOperation();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getDoc()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#isAbstract()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getVisibility()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslDomainObjectOperation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getReturnType()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EReference getDslDomainObjectOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getName()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDomainObjectOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getParameters()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EReference getDslDomainObjectOperation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getThrows()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDomainObjectOperation#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslDomainObjectOperation#getHint()
	 * @see #getDslDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDslDomainObjectOperation_Hint();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDataTransferObject <em>Dsl Data Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Data Transfer Object</em>'.
	 * @see sculptordsl.DslDataTransferObject
	 * @generated
	 */
	EClass getDslDataTransferObject();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDataTransferObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see sculptordsl.DslDataTransferObject#isAbstract()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EAttribute getDslDataTransferObject_Abstract();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslDataTransferObject#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see sculptordsl.DslDataTransferObject#getExtends()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EReference getDslDataTransferObject_Extends();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDataTransferObject#getExtendsName <em>Extends Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Name</em>'.
	 * @see sculptordsl.DslDataTransferObject#getExtendsName()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EAttribute getDslDataTransferObject_ExtendsName();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDataTransferObject#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptordsl.DslDataTransferObject#isGapClass()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EAttribute getDslDataTransferObject_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDataTransferObject#isNoGapClass <em>No Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Class</em>'.
	 * @see sculptordsl.DslDataTransferObject#isNoGapClass()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EAttribute getDslDataTransferObject_NoGapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDataTransferObject#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see sculptordsl.DslDataTransferObject#getValidate()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EAttribute getDslDataTransferObject_Validate();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDataTransferObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see sculptordsl.DslDataTransferObject#getAttributes()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EReference getDslDataTransferObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslDataTransferObject#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see sculptordsl.DslDataTransferObject#getReferences()
	 * @see #getDslDataTransferObject()
	 * @generated
	 */
	EReference getDslDataTransferObject_References();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslBasicType <em>Dsl Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Basic Type</em>'.
	 * @see sculptordsl.DslBasicType
	 * @generated
	 */
	EClass getDslBasicType();

	/**
	 * Returns the meta object for the reference list '{@link sculptordsl.DslBasicType#getTraits <em>Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traits</em>'.
	 * @see sculptordsl.DslBasicType#getTraits()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EReference getDslBasicType_Traits();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslBasicType#isNotImmutable <em>Not Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Immutable</em>'.
	 * @see sculptordsl.DslBasicType#isNotImmutable()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EAttribute getDslBasicType_NotImmutable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslBasicType#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see sculptordsl.DslBasicType#isGapClass()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EAttribute getDslBasicType_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslBasicType#isNoGapClass <em>No Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Gap Class</em>'.
	 * @see sculptordsl.DslBasicType#isNoGapClass()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EAttribute getDslBasicType_NoGapClass();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslBasicType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see sculptordsl.DslBasicType#getAttributes()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EReference getDslBasicType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslBasicType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see sculptordsl.DslBasicType#getReferences()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EReference getDslBasicType_References();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslBasicType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslBasicType#getOperations()
	 * @see #getDslBasicType()
	 * @generated
	 */
	EReference getDslBasicType_Operations();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslAttribute <em>Dsl Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Attribute</em>'.
	 * @see sculptordsl.DslAttribute
	 * @generated
	 */
	EClass getDslAttribute();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sculptordsl.DslAttribute#getType()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see sculptordsl.DslAttribute#isIndex()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Index();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isAssertFalse <em>Assert False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert False</em>'.
	 * @see sculptordsl.DslAttribute#isAssertFalse()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_AssertFalse();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getAssertFalseMessage <em>Assert False Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert False Message</em>'.
	 * @see sculptordsl.DslAttribute#getAssertFalseMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_AssertFalseMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isAssertTrue <em>Assert True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert True</em>'.
	 * @see sculptordsl.DslAttribute#isAssertTrue()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_AssertTrue();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getAssertTrueMessage <em>Assert True Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert True Message</em>'.
	 * @see sculptordsl.DslAttribute#getAssertTrueMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_AssertTrueMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isCreditCardNumber <em>Credit Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Number</em>'.
	 * @see sculptordsl.DslAttribute#isCreditCardNumber()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_CreditCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getCreditCardNumberMessage <em>Credit Card Number Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Number Message</em>'.
	 * @see sculptordsl.DslAttribute#getCreditCardNumberMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_CreditCardNumberMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see sculptordsl.DslAttribute#getDigits()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Digits();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see sculptordsl.DslAttribute#isEmail()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Email();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getEmailMessage <em>Email Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Message</em>'.
	 * @see sculptordsl.DslAttribute#getEmailMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_EmailMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isFuture <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Future</em>'.
	 * @see sculptordsl.DslAttribute#isFuture()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Future();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getFutureMessage <em>Future Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Future Message</em>'.
	 * @see sculptordsl.DslAttribute#getFutureMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_FutureMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isPast <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past</em>'.
	 * @see sculptordsl.DslAttribute#isPast()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Past();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getPastMessage <em>Past Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past Message</em>'.
	 * @see sculptordsl.DslAttribute#getPastMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_PastMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see sculptordsl.DslAttribute#getMax()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Max();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see sculptordsl.DslAttribute#getMin()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Min();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getDecimalMax <em>Decimal Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Max</em>'.
	 * @see sculptordsl.DslAttribute#getDecimalMax()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_DecimalMax();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getDecimalMin <em>Decimal Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Min</em>'.
	 * @see sculptordsl.DslAttribute#getDecimalMin()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_DecimalMin();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#isNotBlank <em>Not Blank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Blank</em>'.
	 * @see sculptordsl.DslAttribute#isNotBlank()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_NotBlank();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getNotBlankMessage <em>Not Blank Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Blank Message</em>'.
	 * @see sculptordsl.DslAttribute#getNotBlankMessage()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_NotBlankMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see sculptordsl.DslAttribute#getPattern()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see sculptordsl.DslAttribute#getRange()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Range();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see sculptordsl.DslAttribute#getLength()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getScriptAssert <em>Script Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Assert</em>'.
	 * @see sculptordsl.DslAttribute#getScriptAssert()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_ScriptAssert();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see sculptordsl.DslAttribute#getUrl()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_Url();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAttribute#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see sculptordsl.DslAttribute#getDatabaseType()
	 * @see #getDslAttribute()
	 * @generated
	 */
	EAttribute getDslAttribute_DatabaseType();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslReference <em>Dsl Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Reference</em>'.
	 * @see sculptordsl.DslReference
	 * @generated
	 */
	EClass getDslReference();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslReference#getDomainObjectType <em>Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Type</em>'.
	 * @see sculptordsl.DslReference#getDomainObjectType()
	 * @see #getDslReference()
	 * @generated
	 */
	EReference getDslReference_DomainObjectType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see sculptordsl.DslReference#getCascade()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see sculptordsl.DslReference#getFetch()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see sculptordsl.DslReference#isCache()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_Cache();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see sculptordsl.DslReference#isInverse()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getDatabaseJoinTable <em>Database Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Table</em>'.
	 * @see sculptordsl.DslReference#getDatabaseJoinTable()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_DatabaseJoinTable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getDatabaseJoinColumn <em>Database Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Column</em>'.
	 * @see sculptordsl.DslReference#getDatabaseJoinColumn()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_DatabaseJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see sculptordsl.DslReference#isValid()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_Valid();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getValidMessage <em>Valid Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Message</em>'.
	 * @see sculptordsl.DslReference#getValidMessage()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_ValidMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see sculptordsl.DslReference#getOrderBy()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#isOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Column</em>'.
	 * @see sculptordsl.DslReference#isOrderColumn()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_OrderColumn();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslReference#getOrderColumnName <em>Order Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Column Name</em>'.
	 * @see sculptordsl.DslReference#getOrderColumnName()
	 * @see #getDslReference()
	 * @generated
	 */
	EAttribute getDslReference_OrderColumnName();

	/**
	 * Returns the meta object for the containment reference '{@link sculptordsl.DslReference#getOppositeHolder <em>Opposite Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opposite Holder</em>'.
	 * @see sculptordsl.DslReference#getOppositeHolder()
	 * @see #getDslReference()
	 * @generated
	 */
	EReference getDslReference_OppositeHolder();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDtoAttribute <em>Dsl Dto Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Dto Attribute</em>'.
	 * @see sculptordsl.DslDtoAttribute
	 * @generated
	 */
	EClass getDslDtoAttribute();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sculptordsl.DslDtoAttribute#getType()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isAssertFalse <em>Assert False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert False</em>'.
	 * @see sculptordsl.DslDtoAttribute#isAssertFalse()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_AssertFalse();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getAssertFalseMessage <em>Assert False Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert False Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getAssertFalseMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_AssertFalseMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isAssertTrue <em>Assert True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert True</em>'.
	 * @see sculptordsl.DslDtoAttribute#isAssertTrue()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_AssertTrue();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getAssertTrueMessage <em>Assert True Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assert True Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getAssertTrueMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_AssertTrueMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isCreditCardNumber <em>Credit Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Number</em>'.
	 * @see sculptordsl.DslDtoAttribute#isCreditCardNumber()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_CreditCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getCreditCardNumberMessage <em>Credit Card Number Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Number Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getCreditCardNumberMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_CreditCardNumberMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see sculptordsl.DslDtoAttribute#getDigits()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Digits();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see sculptordsl.DslDtoAttribute#isEmail()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Email();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getEmailMessage <em>Email Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getEmailMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_EmailMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isFuture <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Future</em>'.
	 * @see sculptordsl.DslDtoAttribute#isFuture()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Future();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getFutureMessage <em>Future Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Future Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getFutureMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_FutureMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isPast <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past</em>'.
	 * @see sculptordsl.DslDtoAttribute#isPast()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Past();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getPastMessage <em>Past Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getPastMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_PastMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see sculptordsl.DslDtoAttribute#getMax()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Max();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see sculptordsl.DslDtoAttribute#getMin()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Min();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getDecimalMax <em>Decimal Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Max</em>'.
	 * @see sculptordsl.DslDtoAttribute#getDecimalMax()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_DecimalMax();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getDecimalMin <em>Decimal Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Min</em>'.
	 * @see sculptordsl.DslDtoAttribute#getDecimalMin()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_DecimalMin();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#isNotBlank <em>Not Blank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Blank</em>'.
	 * @see sculptordsl.DslDtoAttribute#isNotBlank()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_NotBlank();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getNotBlankMessage <em>Not Blank Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Blank Message</em>'.
	 * @see sculptordsl.DslDtoAttribute#getNotBlankMessage()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_NotBlankMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see sculptordsl.DslDtoAttribute#getPattern()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see sculptordsl.DslDtoAttribute#getRange()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Range();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see sculptordsl.DslDtoAttribute#getLength()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getScriptAssert <em>Script Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Assert</em>'.
	 * @see sculptordsl.DslDtoAttribute#getScriptAssert()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_ScriptAssert();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoAttribute#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see sculptordsl.DslDtoAttribute#getUrl()
	 * @see #getDslDtoAttribute()
	 * @generated
	 */
	EAttribute getDslDtoAttribute_Url();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDtoReference <em>Dsl Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Dto Reference</em>'.
	 * @see sculptordsl.DslDtoReference
	 * @generated
	 */
	EClass getDslDtoReference();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslDtoReference#getDomainObjectType <em>Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Type</em>'.
	 * @see sculptordsl.DslDtoReference#getDomainObjectType()
	 * @see #getDslDtoReference()
	 * @generated
	 */
	EReference getDslDtoReference_DomainObjectType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoReference#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see sculptordsl.DslDtoReference#isValid()
	 * @see #getDslDtoReference()
	 * @generated
	 */
	EAttribute getDslDtoReference_Valid();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDtoReference#getValidMessage <em>Valid Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Message</em>'.
	 * @see sculptordsl.DslDtoReference#getValidMessage()
	 * @see #getDslDtoReference()
	 * @generated
	 */
	EAttribute getDslDtoReference_ValidMessage();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslOppositeHolder <em>Dsl Opposite Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Opposite Holder</em>'.
	 * @see sculptordsl.DslOppositeHolder
	 * @generated
	 */
	EClass getDslOppositeHolder();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslOppositeHolder#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see sculptordsl.DslOppositeHolder#getOpposite()
	 * @see #getDslOppositeHolder()
	 * @generated
	 */
	EReference getDslOppositeHolder_Opposite();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslRepository <em>Dsl Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Repository</em>'.
	 * @see sculptordsl.DslRepository
	 * @generated
	 */
	EClass getDslRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslRepository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see sculptordsl.DslRepository#getOperations()
	 * @see #getDslRepository()
	 * @generated
	 */
	EReference getDslRepository_Operations();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslServiceDependency <em>Dsl Service Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Service Dependency</em>'.
	 * @see sculptordsl.DslServiceDependency
	 * @generated
	 */
	EClass getDslServiceDependency();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslServiceDependency#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency</em>'.
	 * @see sculptordsl.DslServiceDependency#getDependency()
	 * @see #getDslServiceDependency()
	 * @generated
	 */
	EReference getDslServiceDependency_Dependency();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDependency <em>Dsl Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Dependency</em>'.
	 * @see sculptordsl.DslDependency
	 * @generated
	 */
	EClass getDslDependency();

	/**
	 * Returns the meta object for the reference '{@link sculptordsl.DslDependency#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency</em>'.
	 * @see sculptordsl.DslDependency#getDependency()
	 * @see #getDslDependency()
	 * @generated
	 */
	EReference getDslDependency_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslDependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslDependency#getName()
	 * @see #getDslDependency()
	 * @generated
	 */
	EAttribute getDslDependency_Name();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEnum <em>Dsl Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Enum</em>'.
	 * @see sculptordsl.DslEnum
	 * @generated
	 */
	EClass getDslEnum();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnum#isOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see sculptordsl.DslEnum#isOrdinal()
	 * @see #getDslEnum()
	 * @generated
	 */
	EAttribute getDslEnum_Ordinal();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslEnum#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see sculptordsl.DslEnum#getAttributes()
	 * @see #getDslEnum()
	 * @generated
	 */
	EReference getDslEnum_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslEnum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see sculptordsl.DslEnum#getValues()
	 * @see #getDslEnum()
	 * @generated
	 */
	EReference getDslEnum_Values();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEnumAttribute <em>Dsl Enum Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Enum Attribute</em>'.
	 * @see sculptordsl.DslEnumAttribute
	 * @generated
	 */
	EClass getDslEnumAttribute();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumAttribute#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslEnumAttribute#getDoc()
	 * @see #getDslEnumAttribute()
	 * @generated
	 */
	EAttribute getDslEnumAttribute_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sculptordsl.DslEnumAttribute#getType()
	 * @see #getDslEnumAttribute()
	 * @generated
	 */
	EAttribute getDslEnumAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslEnumAttribute#getName()
	 * @see #getDslEnumAttribute()
	 * @generated
	 */
	EAttribute getDslEnumAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see sculptordsl.DslEnumAttribute#isKey()
	 * @see #getDslEnumAttribute()
	 * @generated
	 */
	EAttribute getDslEnumAttribute_Key();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEnumValue <em>Dsl Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Enum Value</em>'.
	 * @see sculptordsl.DslEnumValue
	 * @generated
	 */
	EClass getDslEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumValue#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslEnumValue#getDoc()
	 * @see #getDslEnumValue()
	 * @generated
	 */
	EAttribute getDslEnumValue_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslEnumValue#getName()
	 * @see #getDslEnumValue()
	 * @generated
	 */
	EAttribute getDslEnumValue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sculptordsl.DslEnumValue#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see sculptordsl.DslEnumValue#getParameters()
	 * @see #getDslEnumValue()
	 * @generated
	 */
	EReference getDslEnumValue_Parameters();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslEnumParameter <em>Dsl Enum Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Enum Parameter</em>'.
	 * @see sculptordsl.DslEnumParameter
	 * @generated
	 */
	EClass getDslEnumParameter();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sculptordsl.DslEnumParameter#getValue()
	 * @see #getDslEnumParameter()
	 * @generated
	 */
	EAttribute getDslEnumParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslEnumParameter#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see sculptordsl.DslEnumParameter#getIntegerValue()
	 * @see #getDslEnumParameter()
	 * @generated
	 */
	EAttribute getDslEnumParameter_IntegerValue();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslAnyProperty <em>Dsl Any Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Any Property</em>'.
	 * @see sculptordsl.DslAnyProperty
	 * @generated
	 */
	EClass getDslAnyProperty();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see sculptordsl.DslAnyProperty#getDoc()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Doc();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see sculptordsl.DslAnyProperty#getVisibility()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see sculptordsl.DslAnyProperty#getCollectionType()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sculptordsl.DslAnyProperty#getName()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see sculptordsl.DslAnyProperty#isKey()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isNotChangeable <em>Not Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Changeable</em>'.
	 * @see sculptordsl.DslAnyProperty#isNotChangeable()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_NotChangeable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see sculptordsl.DslAnyProperty#isRequired()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see sculptordsl.DslAnyProperty#isNullable()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getNullableMessage <em>Nullable Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable Message</em>'.
	 * @see sculptordsl.DslAnyProperty#getNullableMessage()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_NullableMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see sculptordsl.DslAnyProperty#getHint()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Hint();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isNotEmpty <em>Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Empty</em>'.
	 * @see sculptordsl.DslAnyProperty#isNotEmpty()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_NotEmpty();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getNotEmptyMessage <em>Not Empty Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Empty Message</em>'.
	 * @see sculptordsl.DslAnyProperty#getNotEmptyMessage()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_NotEmptyMessage();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see sculptordsl.DslAnyProperty#getSize()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Size();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see sculptordsl.DslAnyProperty#getValidate()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Validate();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslAnyProperty#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see sculptordsl.DslAnyProperty#isTransient()
	 * @see #getDslAnyProperty()
	 * @generated
	 */
	EAttribute getDslAnyProperty_Transient();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslProperty <em>Dsl Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Property</em>'.
	 * @see sculptordsl.DslProperty
	 * @generated
	 */
	EClass getDslProperty();

	/**
	 * Returns the meta object for the attribute '{@link sculptordsl.DslProperty#getDatabaseColumn <em>Database Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column</em>'.
	 * @see sculptordsl.DslProperty#getDatabaseColumn()
	 * @see #getDslProperty()
	 * @generated
	 */
	EAttribute getDslProperty_DatabaseColumn();

	/**
	 * Returns the meta object for class '{@link sculptordsl.DslDtoProperty <em>Dsl Dto Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsl Dto Property</em>'.
	 * @see sculptordsl.DslDtoProperty
	 * @generated
	 */
	EClass getDslDtoProperty();

	/**
	 * Returns the meta object for enum '{@link sculptordsl.DslHttpMethod <em>Dsl Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dsl Http Method</em>'.
	 * @see sculptordsl.DslHttpMethod
	 * @generated
	 */
	EEnum getDslHttpMethod();

	/**
	 * Returns the meta object for enum '{@link sculptordsl.DslInheritanceType <em>Dsl Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dsl Inheritance Type</em>'.
	 * @see sculptordsl.DslInheritanceType
	 * @generated
	 */
	EEnum getDslInheritanceType();

	/**
	 * Returns the meta object for enum '{@link sculptordsl.DslDiscriminatorType <em>Dsl Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dsl Discriminator Type</em>'.
	 * @see sculptordsl.DslDiscriminatorType
	 * @generated
	 */
	EEnum getDslDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link sculptordsl.DslCollectionType <em>Dsl Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dsl Collection Type</em>'.
	 * @see sculptordsl.DslCollectionType
	 * @generated
	 */
	EEnum getDslCollectionType();

	/**
	 * Returns the meta object for enum '{@link sculptordsl.DslVisibility <em>Dsl Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dsl Visibility</em>'.
	 * @see sculptordsl.DslVisibility
	 * @generated
	 */
	EEnum getDslVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SculptordslFactory getSculptordslFactory();

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
		 * The meta object literal for the '{@link sculptordsl.impl.DslModelImpl <em>Dsl Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslModelImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslModel()
		 * @generated
		 */
		EClass DSL_MODEL = eINSTANCE.getDslModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODEL__IMPORTS = eINSTANCE.getDslModel_Imports();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODEL__APP = eINSTANCE.getDslModel_App();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslImportImpl <em>Dsl Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslImportImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslImport()
		 * @generated
		 */
		EClass DSL_IMPORT = eINSTANCE.getDslImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_IMPORT__IMPORT_URI = eINSTANCE.getDslImport_ImportURI();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslApplicationImpl <em>Dsl Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslApplicationImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslApplication()
		 * @generated
		 */
		EClass DSL_APPLICATION = eINSTANCE.getDslApplication();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_APPLICATION__DOC = eINSTANCE.getDslApplication_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_APPLICATION__NAME = eINSTANCE.getDslApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_APPLICATION__BASE_PACKAGE = eINSTANCE.getDslApplication_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_APPLICATION__MODULES = eINSTANCE.getDslApplication_Modules();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslModuleImpl <em>Dsl Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslModuleImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslModule()
		 * @generated
		 */
		EClass DSL_MODULE = eINSTANCE.getDslModule();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MODULE__DOC = eINSTANCE.getDslModule_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MODULE__NAME = eINSTANCE.getDslModule_Name();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MODULE__EXTERNAL = eINSTANCE.getDslModule_External();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MODULE__BASE_PACKAGE = eINSTANCE.getDslModule_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MODULE__HINT = eINSTANCE.getDslModule_Hint();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODULE__SERVICES = eINSTANCE.getDslModule_Services();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODULE__RESOURCES = eINSTANCE.getDslModule_Resources();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODULE__CONSUMERS = eINSTANCE.getDslModule_Consumers();

		/**
		 * The meta object literal for the '<em><b>Domain Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_MODULE__DOMAIN_OBJECTS = eINSTANCE.getDslModule_DomainObjects();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceImpl <em>Dsl Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslService()
		 * @generated
		 */
		EClass DSL_SERVICE = eINSTANCE.getDslService();

		/**
		 * The meta object literal for the '<em><b>Web Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE__WEB_SERVICE = eINSTANCE.getDslService_WebService();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE__OPERATIONS = eINSTANCE.getDslService_Operations();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslResourceImpl <em>Dsl Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslResourceImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResource()
		 * @generated
		 */
		EClass DSL_RESOURCE = eINSTANCE.getDslResource();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__DOC = eINSTANCE.getDslResource_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__NAME = eINSTANCE.getDslResource_Name();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__GAP_CLASS = eINSTANCE.getDslResource_GapClass();

		/**
		 * The meta object literal for the '<em><b>No Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__NO_GAP_CLASS = eINSTANCE.getDslResource_NoGapClass();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__HINT = eINSTANCE.getDslResource_Hint();

		/**
		 * The meta object literal for the '<em><b>Scaffold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__SCAFFOLD = eINSTANCE.getDslResource_Scaffold();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE__PATH = eINSTANCE.getDslResource_Path();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE__DEPENDENCIES = eINSTANCE.getDslResource_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE__OPERATIONS = eINSTANCE.getDslResource_Operations();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslConsumerImpl <em>Dsl Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslConsumerImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslConsumer()
		 * @generated
		 */
		EClass DSL_CONSUMER = eINSTANCE.getDslConsumer();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_CONSUMER__DOC = eINSTANCE.getDslConsumer_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_CONSUMER__NAME = eINSTANCE.getDslConsumer_Name();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_CONSUMER__HINT = eINSTANCE.getDslConsumer_Hint();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_CONSUMER__DEPENDENCIES = eINSTANCE.getDslConsumer_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Message Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_CONSUMER__MESSAGE_ROOT = eINSTANCE.getDslConsumer_MessageRoot();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_CONSUMER__CHANNEL = eINSTANCE.getDslConsumer_Channel();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_CONSUMER__SUBSCRIBE = eINSTANCE.getDslConsumer_Subscribe();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslSubscribeImpl <em>Dsl Subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslSubscribeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslSubscribe()
		 * @generated
		 */
		EClass DSL_SUBSCRIBE = eINSTANCE.getDslSubscribe();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SUBSCRIBE__TOPIC = eINSTANCE.getDslSubscribe_Topic();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SUBSCRIBE__EVENT_BUS = eINSTANCE.getDslSubscribe_EventBus();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslPublishImpl <em>Dsl Publish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslPublishImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslPublish()
		 * @generated
		 */
		EClass DSL_PUBLISH = eINSTANCE.getDslPublish();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_PUBLISH__EVENT_TYPE = eINSTANCE.getDslPublish_EventType();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_PUBLISH__TOPIC = eINSTANCE.getDslPublish_Topic();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_PUBLISH__EVENT_BUS = eINSTANCE.getDslPublish_EventBus();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEventImpl <em>Dsl Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEventImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEvent()
		 * @generated
		 */
		EClass DSL_EVENT = eINSTANCE.getDslEvent();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_EVENT__PERSISTENT = eINSTANCE.getDslEvent_Persistent();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDomainObjectTypedElementImpl <em>Dsl Domain Object Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDomainObjectTypedElementImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObjectTypedElement()
		 * @generated
		 */
		EClass DSL_DOMAIN_OBJECT_TYPED_ELEMENT = eINSTANCE.getDslDomainObjectTypedElement();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceOperationImpl <em>Dsl Service Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceOperationImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceOperation()
		 * @generated
		 */
		EClass DSL_SERVICE_OPERATION = eINSTANCE.getDslServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_OPERATION__DOC = eINSTANCE.getDslServiceOperation_Doc();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_OPERATION__VISIBILITY = eINSTANCE.getDslServiceOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION__RETURN_TYPE = eINSTANCE.getDslServiceOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_OPERATION__NAME = eINSTANCE.getDslServiceOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION__PARAMETERS = eINSTANCE.getDslServiceOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_OPERATION__THROWS = eINSTANCE.getDslServiceOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_OPERATION__HINT = eINSTANCE.getDslServiceOperation_Hint();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION__PUBLISH = eINSTANCE.getDslServiceOperation_Publish();

		/**
		 * The meta object literal for the '<em><b>Delegate Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION__DELEGATE_HOLDER = eINSTANCE.getDslServiceOperation_DelegateHolder();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceOperationDelegateImpl <em>Dsl Service Operation Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceOperationDelegateImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceOperationDelegate()
		 * @generated
		 */
		EClass DSL_SERVICE_OPERATION_DELEGATE = eINSTANCE.getDslServiceOperationDelegate();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION_DELEGATE__DELEGATE = eINSTANCE.getDslServiceOperationDelegate_Delegate();

		/**
		 * The meta object literal for the '<em><b>Delegate Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_OPERATION_DELEGATE__DELEGATE_OPERATION = eINSTANCE.getDslServiceOperationDelegate_DelegateOperation();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceRepositoryOptionImpl <em>Dsl Service Repository Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceRepositoryOptionImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceRepositoryOption()
		 * @generated
		 */
		EClass DSL_SERVICE_REPOSITORY_OPTION = eINSTANCE.getDslServiceRepositoryOption();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_REPOSITORY_OPTION__DOC = eINSTANCE.getDslServiceRepositoryOption_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_REPOSITORY_OPTION__NAME = eINSTANCE.getDslServiceRepositoryOption_Name();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_REPOSITORY_OPTION__GAP_CLASS = eINSTANCE.getDslServiceRepositoryOption_GapClass();

		/**
		 * The meta object literal for the '<em><b>No Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_REPOSITORY_OPTION__NO_GAP_CLASS = eINSTANCE.getDslServiceRepositoryOption_NoGapClass();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SERVICE_REPOSITORY_OPTION__HINT = eINSTANCE.getDslServiceRepositoryOption_Hint();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_REPOSITORY_OPTION__SUBSCRIBE = eINSTANCE.getDslServiceRepositoryOption_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_REPOSITORY_OPTION__DEPENDENCIES = eINSTANCE.getDslServiceRepositoryOption_Dependencies();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceRepositoryOperationOptionImpl <em>Dsl Service Repository Operation Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceRepositoryOperationOptionImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceRepositoryOperationOption()
		 * @generated
		 */
		EClass DSL_SERVICE_REPOSITORY_OPERATION_OPTION = eINSTANCE.getDslServiceRepositoryOperationOption();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslResourceOperationImpl <em>Dsl Resource Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslResourceOperationImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResourceOperation()
		 * @generated
		 */
		EClass DSL_RESOURCE_OPERATION = eINSTANCE.getDslResourceOperation();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__DOC = eINSTANCE.getDslResourceOperation_Doc();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__VISIBILITY = eINSTANCE.getDslResourceOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE_OPERATION__RETURN_TYPE = eINSTANCE.getDslResourceOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__NAME = eINSTANCE.getDslResourceOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE_OPERATION__PARAMETERS = eINSTANCE.getDslResourceOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__THROWS = eINSTANCE.getDslResourceOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__HINT = eINSTANCE.getDslResourceOperation_Hint();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__HTTP_METHOD = eINSTANCE.getDslResourceOperation_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__PATH = eINSTANCE.getDslResourceOperation_Path();

		/**
		 * The meta object literal for the '<em><b>Return String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_RESOURCE_OPERATION__RETURN_STRING = eINSTANCE.getDslResourceOperation_ReturnString();

		/**
		 * The meta object literal for the '<em><b>Delegate Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE_OPERATION__DELEGATE_HOLDER = eINSTANCE.getDslResourceOperation_DelegateHolder();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslResourceOperationDelegateImpl <em>Dsl Resource Operation Delegate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslResourceOperationDelegateImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslResourceOperationDelegate()
		 * @generated
		 */
		EClass DSL_RESOURCE_OPERATION_DELEGATE = eINSTANCE.getDslResourceOperationDelegate();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE = eINSTANCE.getDslResourceOperationDelegate_Delegate();

		/**
		 * The meta object literal for the '<em><b>Delegate Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_RESOURCE_OPERATION_DELEGATE__DELEGATE_OPERATION = eINSTANCE.getDslResourceOperationDelegate_DelegateOperation();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslRepositoryOperationImpl <em>Dsl Repository Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslRepositoryOperationImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslRepositoryOperation()
		 * @generated
		 */
		EClass DSL_REPOSITORY_OPERATION = eINSTANCE.getDslRepositoryOperation();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__DOC = eINSTANCE.getDslRepositoryOperation_Doc();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__VISIBILITY = eINSTANCE.getDslRepositoryOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REPOSITORY_OPERATION__RETURN_TYPE = eINSTANCE.getDslRepositoryOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__NAME = eINSTANCE.getDslRepositoryOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REPOSITORY_OPERATION__PARAMETERS = eINSTANCE.getDslRepositoryOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__THROWS = eINSTANCE.getDslRepositoryOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__HINT = eINSTANCE.getDslRepositoryOperation_Hint();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__CACHE = eINSTANCE.getDslRepositoryOperation_Cache();

		/**
		 * The meta object literal for the '<em><b>Gap Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__GAP_OPERATION = eINSTANCE.getDslRepositoryOperation_GapOperation();

		/**
		 * The meta object literal for the '<em><b>No Gap Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__NO_GAP_OPERATION = eINSTANCE.getDslRepositoryOperation_NoGapOperation();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__QUERY = eINSTANCE.getDslRepositoryOperation_Query();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__CONDITION = eINSTANCE.getDslRepositoryOperation_Condition();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__SELECT = eINSTANCE.getDslRepositoryOperation_Select();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__GROUP_BY = eINSTANCE.getDslRepositoryOperation_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__ORDER_BY = eINSTANCE.getDslRepositoryOperation_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Construct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__CONSTRUCT = eINSTANCE.getDslRepositoryOperation_Construct();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__BUILD = eINSTANCE.getDslRepositoryOperation_Build();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__MAP = eINSTANCE.getDslRepositoryOperation_Map();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REPOSITORY_OPERATION__PUBLISH = eINSTANCE.getDslRepositoryOperation_Publish();

		/**
		 * The meta object literal for the '<em><b>Delegate To Access Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = eINSTANCE.getDslRepositoryOperation_DelegateToAccessObject();

		/**
		 * The meta object literal for the '<em><b>Access Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = eINSTANCE.getDslRepositoryOperation_AccessObjectName();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslParameterImpl <em>Dsl Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslParameterImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslParameter()
		 * @generated
		 */
		EClass DSL_PARAMETER = eINSTANCE.getDslParameter();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_PARAMETER__DOC = eINSTANCE.getDslParameter_Doc();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_PARAMETER__PARAMETER_TYPE = eINSTANCE.getDslParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_PARAMETER__NAME = eINSTANCE.getDslParameter_Name();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslComplexTypeImpl <em>Dsl Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslComplexTypeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslComplexType()
		 * @generated
		 */
		EClass DSL_COMPLEX_TYPE = eINSTANCE.getDslComplexType();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_COMPLEX_TYPE__COLLECTION_TYPE = eINSTANCE.getDslComplexType_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_COMPLEX_TYPE__DOMAIN_OBJECT_TYPE = eINSTANCE.getDslComplexType_DomainObjectType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_COMPLEX_TYPE__TYPE = eINSTANCE.getDslComplexType_Type();

		/**
		 * The meta object literal for the '<em><b>Map Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_COMPLEX_TYPE__MAP_COLLECTION_TYPE = eINSTANCE.getDslComplexType_MapCollectionType();

		/**
		 * The meta object literal for the '<em><b>Map Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_COMPLEX_TYPE__MAP_KEY_TYPE = eINSTANCE.getDslComplexType_MapKeyType();

		/**
		 * The meta object literal for the '<em><b>Map Key Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_COMPLEX_TYPE__MAP_KEY_DOMAIN_OBJECT_TYPE = eINSTANCE.getDslComplexType_MapKeyDomainObjectType();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslSimpleDomainObjectImpl <em>Dsl Simple Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslSimpleDomainObjectImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslSimpleDomainObject()
		 * @generated
		 */
		EClass DSL_SIMPLE_DOMAIN_OBJECT = eINSTANCE.getDslSimpleDomainObject();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SIMPLE_DOMAIN_OBJECT__DOC = eINSTANCE.getDslSimpleDomainObject_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SIMPLE_DOMAIN_OBJECT__NAME = eINSTANCE.getDslSimpleDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SIMPLE_DOMAIN_OBJECT__PACKAGE = eINSTANCE.getDslSimpleDomainObject_Package();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_SIMPLE_DOMAIN_OBJECT__HINT = eINSTANCE.getDslSimpleDomainObject_Hint();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDomainObjectImpl <em>Dsl Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDomainObjectImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObject()
		 * @generated
		 */
		EClass DSL_DOMAIN_OBJECT = eINSTANCE.getDslDomainObject();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__ABSTRACT = eINSTANCE.getDslDomainObject_Abstract();

		/**
		 * The meta object literal for the '<em><b>Extends Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__EXTENDS_NAME = eINSTANCE.getDslDomainObject_ExtendsName();

		/**
		 * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__TRAITS = eINSTANCE.getDslDomainObject_Traits();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__CACHE = eINSTANCE.getDslDomainObject_Cache();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__GAP_CLASS = eINSTANCE.getDslDomainObject_GapClass();

		/**
		 * The meta object literal for the '<em><b>No Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__NO_GAP_CLASS = eINSTANCE.getDslDomainObject_NoGapClass();

		/**
		 * The meta object literal for the '<em><b>Scaffold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__SCAFFOLD = eINSTANCE.getDslDomainObject_Scaffold();

		/**
		 * The meta object literal for the '<em><b>Database Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__DATABASE_TABLE = eINSTANCE.getDslDomainObject_DatabaseTable();

		/**
		 * The meta object literal for the '<em><b>Discriminator Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__DISCRIMINATOR_VALUE = eINSTANCE.getDslDomainObject_DiscriminatorValue();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__DISCRIMINATOR_COLUMN = eINSTANCE.getDslDomainObject_DiscriminatorColumn();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__DISCRIMINATOR_TYPE = eINSTANCE.getDslDomainObject_DiscriminatorType();

		/**
		 * The meta object literal for the '<em><b>Discriminator Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__DISCRIMINATOR_LENGTH = eINSTANCE.getDslDomainObject_DiscriminatorLength();

		/**
		 * The meta object literal for the '<em><b>Inheritance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__INHERITANCE_TYPE = eINSTANCE.getDslDomainObject_InheritanceType();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__VALIDATE = eINSTANCE.getDslDomainObject_Validate();

		/**
		 * The meta object literal for the '<em><b>Not Aggregate Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT__NOT_AGGREGATE_ROOT = eINSTANCE.getDslDomainObject_NotAggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__BELONGS_TO = eINSTANCE.getDslDomainObject_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__ATTRIBUTES = eINSTANCE.getDslDomainObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__REFERENCES = eINSTANCE.getDslDomainObject_References();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__OPERATIONS = eINSTANCE.getDslDomainObject_Operations();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT__REPOSITORY = eINSTANCE.getDslDomainObject_Repository();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEntityImpl <em>Dsl Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEntityImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEntity()
		 * @generated
		 */
		EClass DSL_ENTITY = eINSTANCE.getDslEntity();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_ENTITY__EXTENDS = eINSTANCE.getDslEntity_Extends();

		/**
		 * The meta object literal for the '<em><b>Not Optimistic Locking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENTITY__NOT_OPTIMISTIC_LOCKING = eINSTANCE.getDslEntity_NotOptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Not Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENTITY__NOT_AUDITABLE = eINSTANCE.getDslEntity_NotAuditable();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslValueObjectImpl <em>Dsl Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslValueObjectImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslValueObject()
		 * @generated
		 */
		EClass DSL_VALUE_OBJECT = eINSTANCE.getDslValueObject();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_VALUE_OBJECT__EXTENDS = eINSTANCE.getDslValueObject_Extends();

		/**
		 * The meta object literal for the '<em><b>Not Optimistic Locking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_VALUE_OBJECT__NOT_OPTIMISTIC_LOCKING = eINSTANCE.getDslValueObject_NotOptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Not Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_VALUE_OBJECT__NOT_IMMUTABLE = eINSTANCE.getDslValueObject_NotImmutable();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_VALUE_OBJECT__PERSISTENT = eINSTANCE.getDslValueObject_Persistent();

		/**
		 * The meta object literal for the '<em><b>Not Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_VALUE_OBJECT__NOT_PERSISTENT = eINSTANCE.getDslValueObject_NotPersistent();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDomainEventImpl <em>Dsl Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDomainEventImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainEvent()
		 * @generated
		 */
		EClass DSL_DOMAIN_EVENT = eINSTANCE.getDslDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_EVENT__EXTENDS = eINSTANCE.getDslDomainEvent_Extends();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslCommandEventImpl <em>Dsl Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslCommandEventImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslCommandEvent()
		 * @generated
		 */
		EClass DSL_COMMAND_EVENT = eINSTANCE.getDslCommandEvent();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_COMMAND_EVENT__EXTENDS = eINSTANCE.getDslCommandEvent_Extends();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslTraitImpl <em>Dsl Trait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslTraitImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslTrait()
		 * @generated
		 */
		EClass DSL_TRAIT = eINSTANCE.getDslTrait();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_TRAIT__ATTRIBUTES = eINSTANCE.getDslTrait_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_TRAIT__REFERENCES = eINSTANCE.getDslTrait_References();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_TRAIT__OPERATIONS = eINSTANCE.getDslTrait_Operations();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDomainObjectOperationImpl <em>Dsl Domain Object Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDomainObjectOperationImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDomainObjectOperation()
		 * @generated
		 */
		EClass DSL_DOMAIN_OBJECT_OPERATION = eINSTANCE.getDslDomainObjectOperation();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__DOC = eINSTANCE.getDslDomainObjectOperation_Doc();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__ABSTRACT = eINSTANCE.getDslDomainObjectOperation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__VISIBILITY = eINSTANCE.getDslDomainObjectOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT_OPERATION__RETURN_TYPE = eINSTANCE.getDslDomainObjectOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__NAME = eINSTANCE.getDslDomainObjectOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DOMAIN_OBJECT_OPERATION__PARAMETERS = eINSTANCE.getDslDomainObjectOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__THROWS = eINSTANCE.getDslDomainObjectOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DOMAIN_OBJECT_OPERATION__HINT = eINSTANCE.getDslDomainObjectOperation_Hint();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDataTransferObjectImpl <em>Dsl Data Transfer Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDataTransferObjectImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDataTransferObject()
		 * @generated
		 */
		EClass DSL_DATA_TRANSFER_OBJECT = eINSTANCE.getDslDataTransferObject();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DATA_TRANSFER_OBJECT__ABSTRACT = eINSTANCE.getDslDataTransferObject_Abstract();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DATA_TRANSFER_OBJECT__EXTENDS = eINSTANCE.getDslDataTransferObject_Extends();

		/**
		 * The meta object literal for the '<em><b>Extends Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DATA_TRANSFER_OBJECT__EXTENDS_NAME = eINSTANCE.getDslDataTransferObject_ExtendsName();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DATA_TRANSFER_OBJECT__GAP_CLASS = eINSTANCE.getDslDataTransferObject_GapClass();

		/**
		 * The meta object literal for the '<em><b>No Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DATA_TRANSFER_OBJECT__NO_GAP_CLASS = eINSTANCE.getDslDataTransferObject_NoGapClass();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DATA_TRANSFER_OBJECT__VALIDATE = eINSTANCE.getDslDataTransferObject_Validate();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DATA_TRANSFER_OBJECT__ATTRIBUTES = eINSTANCE.getDslDataTransferObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DATA_TRANSFER_OBJECT__REFERENCES = eINSTANCE.getDslDataTransferObject_References();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslBasicTypeImpl <em>Dsl Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslBasicTypeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslBasicType()
		 * @generated
		 */
		EClass DSL_BASIC_TYPE = eINSTANCE.getDslBasicType();

		/**
		 * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_BASIC_TYPE__TRAITS = eINSTANCE.getDslBasicType_Traits();

		/**
		 * The meta object literal for the '<em><b>Not Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_BASIC_TYPE__NOT_IMMUTABLE = eINSTANCE.getDslBasicType_NotImmutable();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_BASIC_TYPE__GAP_CLASS = eINSTANCE.getDslBasicType_GapClass();

		/**
		 * The meta object literal for the '<em><b>No Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_BASIC_TYPE__NO_GAP_CLASS = eINSTANCE.getDslBasicType_NoGapClass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_BASIC_TYPE__ATTRIBUTES = eINSTANCE.getDslBasicType_Attributes();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_BASIC_TYPE__REFERENCES = eINSTANCE.getDslBasicType_References();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_BASIC_TYPE__OPERATIONS = eINSTANCE.getDslBasicType_Operations();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslAttributeImpl <em>Dsl Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslAttributeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslAttribute()
		 * @generated
		 */
		EClass DSL_ATTRIBUTE = eINSTANCE.getDslAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__TYPE = eINSTANCE.getDslAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__INDEX = eINSTANCE.getDslAttribute_Index();

		/**
		 * The meta object literal for the '<em><b>Assert False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__ASSERT_FALSE = eINSTANCE.getDslAttribute_AssertFalse();

		/**
		 * The meta object literal for the '<em><b>Assert False Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__ASSERT_FALSE_MESSAGE = eINSTANCE.getDslAttribute_AssertFalseMessage();

		/**
		 * The meta object literal for the '<em><b>Assert True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__ASSERT_TRUE = eINSTANCE.getDslAttribute_AssertTrue();

		/**
		 * The meta object literal for the '<em><b>Assert True Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__ASSERT_TRUE_MESSAGE = eINSTANCE.getDslAttribute_AssertTrueMessage();

		/**
		 * The meta object literal for the '<em><b>Credit Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__CREDIT_CARD_NUMBER = eINSTANCE.getDslAttribute_CreditCardNumber();

		/**
		 * The meta object literal for the '<em><b>Credit Card Number Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE = eINSTANCE.getDslAttribute_CreditCardNumberMessage();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__DIGITS = eINSTANCE.getDslAttribute_Digits();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__EMAIL = eINSTANCE.getDslAttribute_Email();

		/**
		 * The meta object literal for the '<em><b>Email Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__EMAIL_MESSAGE = eINSTANCE.getDslAttribute_EmailMessage();

		/**
		 * The meta object literal for the '<em><b>Future</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__FUTURE = eINSTANCE.getDslAttribute_Future();

		/**
		 * The meta object literal for the '<em><b>Future Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__FUTURE_MESSAGE = eINSTANCE.getDslAttribute_FutureMessage();

		/**
		 * The meta object literal for the '<em><b>Past</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__PAST = eINSTANCE.getDslAttribute_Past();

		/**
		 * The meta object literal for the '<em><b>Past Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__PAST_MESSAGE = eINSTANCE.getDslAttribute_PastMessage();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__MAX = eINSTANCE.getDslAttribute_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__MIN = eINSTANCE.getDslAttribute_Min();

		/**
		 * The meta object literal for the '<em><b>Decimal Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__DECIMAL_MAX = eINSTANCE.getDslAttribute_DecimalMax();

		/**
		 * The meta object literal for the '<em><b>Decimal Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__DECIMAL_MIN = eINSTANCE.getDslAttribute_DecimalMin();

		/**
		 * The meta object literal for the '<em><b>Not Blank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__NOT_BLANK = eINSTANCE.getDslAttribute_NotBlank();

		/**
		 * The meta object literal for the '<em><b>Not Blank Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__NOT_BLANK_MESSAGE = eINSTANCE.getDslAttribute_NotBlankMessage();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__PATTERN = eINSTANCE.getDslAttribute_Pattern();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__RANGE = eINSTANCE.getDslAttribute_Range();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__LENGTH = eINSTANCE.getDslAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Script Assert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__SCRIPT_ASSERT = eINSTANCE.getDslAttribute_ScriptAssert();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__URL = eINSTANCE.getDslAttribute_Url();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ATTRIBUTE__DATABASE_TYPE = eINSTANCE.getDslAttribute_DatabaseType();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslReferenceImpl <em>Dsl Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslReferenceImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslReference()
		 * @generated
		 */
		EClass DSL_REFERENCE = eINSTANCE.getDslReference();

		/**
		 * The meta object literal for the '<em><b>Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REFERENCE__DOMAIN_OBJECT_TYPE = eINSTANCE.getDslReference_DomainObjectType();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__CASCADE = eINSTANCE.getDslReference_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__FETCH = eINSTANCE.getDslReference_Fetch();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__CACHE = eINSTANCE.getDslReference_Cache();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__INVERSE = eINSTANCE.getDslReference_Inverse();

		/**
		 * The meta object literal for the '<em><b>Database Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__DATABASE_JOIN_TABLE = eINSTANCE.getDslReference_DatabaseJoinTable();

		/**
		 * The meta object literal for the '<em><b>Database Join Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__DATABASE_JOIN_COLUMN = eINSTANCE.getDslReference_DatabaseJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__VALID = eINSTANCE.getDslReference_Valid();

		/**
		 * The meta object literal for the '<em><b>Valid Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__VALID_MESSAGE = eINSTANCE.getDslReference_ValidMessage();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__ORDER_BY = eINSTANCE.getDslReference_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Order Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__ORDER_COLUMN = eINSTANCE.getDslReference_OrderColumn();

		/**
		 * The meta object literal for the '<em><b>Order Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_REFERENCE__ORDER_COLUMN_NAME = eINSTANCE.getDslReference_OrderColumnName();

		/**
		 * The meta object literal for the '<em><b>Opposite Holder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REFERENCE__OPPOSITE_HOLDER = eINSTANCE.getDslReference_OppositeHolder();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDtoAttributeImpl <em>Dsl Dto Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDtoAttributeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoAttribute()
		 * @generated
		 */
		EClass DSL_DTO_ATTRIBUTE = eINSTANCE.getDslDtoAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__TYPE = eINSTANCE.getDslDtoAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Assert False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__ASSERT_FALSE = eINSTANCE.getDslDtoAttribute_AssertFalse();

		/**
		 * The meta object literal for the '<em><b>Assert False Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__ASSERT_FALSE_MESSAGE = eINSTANCE.getDslDtoAttribute_AssertFalseMessage();

		/**
		 * The meta object literal for the '<em><b>Assert True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__ASSERT_TRUE = eINSTANCE.getDslDtoAttribute_AssertTrue();

		/**
		 * The meta object literal for the '<em><b>Assert True Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__ASSERT_TRUE_MESSAGE = eINSTANCE.getDslDtoAttribute_AssertTrueMessage();

		/**
		 * The meta object literal for the '<em><b>Credit Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER = eINSTANCE.getDslDtoAttribute_CreditCardNumber();

		/**
		 * The meta object literal for the '<em><b>Credit Card Number Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__CREDIT_CARD_NUMBER_MESSAGE = eINSTANCE.getDslDtoAttribute_CreditCardNumberMessage();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__DIGITS = eINSTANCE.getDslDtoAttribute_Digits();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__EMAIL = eINSTANCE.getDslDtoAttribute_Email();

		/**
		 * The meta object literal for the '<em><b>Email Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__EMAIL_MESSAGE = eINSTANCE.getDslDtoAttribute_EmailMessage();

		/**
		 * The meta object literal for the '<em><b>Future</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__FUTURE = eINSTANCE.getDslDtoAttribute_Future();

		/**
		 * The meta object literal for the '<em><b>Future Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__FUTURE_MESSAGE = eINSTANCE.getDslDtoAttribute_FutureMessage();

		/**
		 * The meta object literal for the '<em><b>Past</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__PAST = eINSTANCE.getDslDtoAttribute_Past();

		/**
		 * The meta object literal for the '<em><b>Past Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__PAST_MESSAGE = eINSTANCE.getDslDtoAttribute_PastMessage();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__MAX = eINSTANCE.getDslDtoAttribute_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__MIN = eINSTANCE.getDslDtoAttribute_Min();

		/**
		 * The meta object literal for the '<em><b>Decimal Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__DECIMAL_MAX = eINSTANCE.getDslDtoAttribute_DecimalMax();

		/**
		 * The meta object literal for the '<em><b>Decimal Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__DECIMAL_MIN = eINSTANCE.getDslDtoAttribute_DecimalMin();

		/**
		 * The meta object literal for the '<em><b>Not Blank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__NOT_BLANK = eINSTANCE.getDslDtoAttribute_NotBlank();

		/**
		 * The meta object literal for the '<em><b>Not Blank Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__NOT_BLANK_MESSAGE = eINSTANCE.getDslDtoAttribute_NotBlankMessage();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__PATTERN = eINSTANCE.getDslDtoAttribute_Pattern();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__RANGE = eINSTANCE.getDslDtoAttribute_Range();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__LENGTH = eINSTANCE.getDslDtoAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Script Assert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__SCRIPT_ASSERT = eINSTANCE.getDslDtoAttribute_ScriptAssert();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_ATTRIBUTE__URL = eINSTANCE.getDslDtoAttribute_Url();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDtoReferenceImpl <em>Dsl Dto Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDtoReferenceImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoReference()
		 * @generated
		 */
		EClass DSL_DTO_REFERENCE = eINSTANCE.getDslDtoReference();

		/**
		 * The meta object literal for the '<em><b>Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DTO_REFERENCE__DOMAIN_OBJECT_TYPE = eINSTANCE.getDslDtoReference_DomainObjectType();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_REFERENCE__VALID = eINSTANCE.getDslDtoReference_Valid();

		/**
		 * The meta object literal for the '<em><b>Valid Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DTO_REFERENCE__VALID_MESSAGE = eINSTANCE.getDslDtoReference_ValidMessage();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslOppositeHolderImpl <em>Dsl Opposite Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslOppositeHolderImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslOppositeHolder()
		 * @generated
		 */
		EClass DSL_OPPOSITE_HOLDER = eINSTANCE.getDslOppositeHolder();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_OPPOSITE_HOLDER__OPPOSITE = eINSTANCE.getDslOppositeHolder_Opposite();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslRepositoryImpl <em>Dsl Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslRepositoryImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslRepository()
		 * @generated
		 */
		EClass DSL_REPOSITORY = eINSTANCE.getDslRepository();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_REPOSITORY__OPERATIONS = eINSTANCE.getDslRepository_Operations();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslServiceDependencyImpl <em>Dsl Service Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslServiceDependencyImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslServiceDependency()
		 * @generated
		 */
		EClass DSL_SERVICE_DEPENDENCY = eINSTANCE.getDslServiceDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_SERVICE_DEPENDENCY__DEPENDENCY = eINSTANCE.getDslServiceDependency_Dependency();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDependencyImpl <em>Dsl Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDependencyImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDependency()
		 * @generated
		 */
		EClass DSL_DEPENDENCY = eINSTANCE.getDslDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_DEPENDENCY__DEPENDENCY = eINSTANCE.getDslDependency_Dependency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_DEPENDENCY__NAME = eINSTANCE.getDslDependency_Name();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEnumImpl <em>Dsl Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEnumImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnum()
		 * @generated
		 */
		EClass DSL_ENUM = eINSTANCE.getDslEnum();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM__ORDINAL = eINSTANCE.getDslEnum_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_ENUM__ATTRIBUTES = eINSTANCE.getDslEnum_Attributes();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_ENUM__VALUES = eINSTANCE.getDslEnum_Values();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEnumAttributeImpl <em>Dsl Enum Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEnumAttributeImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumAttribute()
		 * @generated
		 */
		EClass DSL_ENUM_ATTRIBUTE = eINSTANCE.getDslEnumAttribute();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_ATTRIBUTE__DOC = eINSTANCE.getDslEnumAttribute_Doc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_ATTRIBUTE__TYPE = eINSTANCE.getDslEnumAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_ATTRIBUTE__NAME = eINSTANCE.getDslEnumAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_ATTRIBUTE__KEY = eINSTANCE.getDslEnumAttribute_Key();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEnumValueImpl <em>Dsl Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEnumValueImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumValue()
		 * @generated
		 */
		EClass DSL_ENUM_VALUE = eINSTANCE.getDslEnumValue();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_VALUE__DOC = eINSTANCE.getDslEnumValue_Doc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_VALUE__NAME = eINSTANCE.getDslEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSL_ENUM_VALUE__PARAMETERS = eINSTANCE.getDslEnumValue_Parameters();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslEnumParameterImpl <em>Dsl Enum Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslEnumParameterImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslEnumParameter()
		 * @generated
		 */
		EClass DSL_ENUM_PARAMETER = eINSTANCE.getDslEnumParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_PARAMETER__VALUE = eINSTANCE.getDslEnumParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ENUM_PARAMETER__INTEGER_VALUE = eINSTANCE.getDslEnumParameter_IntegerValue();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslAnyPropertyImpl <em>Dsl Any Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslAnyPropertyImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslAnyProperty()
		 * @generated
		 */
		EClass DSL_ANY_PROPERTY = eINSTANCE.getDslAnyProperty();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__DOC = eINSTANCE.getDslAnyProperty_Doc();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__VISIBILITY = eINSTANCE.getDslAnyProperty_Visibility();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__COLLECTION_TYPE = eINSTANCE.getDslAnyProperty_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NAME = eINSTANCE.getDslAnyProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__KEY = eINSTANCE.getDslAnyProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Not Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NOT_CHANGEABLE = eINSTANCE.getDslAnyProperty_NotChangeable();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__REQUIRED = eINSTANCE.getDslAnyProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NULLABLE = eINSTANCE.getDslAnyProperty_Nullable();

		/**
		 * The meta object literal for the '<em><b>Nullable Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NULLABLE_MESSAGE = eINSTANCE.getDslAnyProperty_NullableMessage();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__HINT = eINSTANCE.getDslAnyProperty_Hint();

		/**
		 * The meta object literal for the '<em><b>Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NOT_EMPTY = eINSTANCE.getDslAnyProperty_NotEmpty();

		/**
		 * The meta object literal for the '<em><b>Not Empty Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__NOT_EMPTY_MESSAGE = eINSTANCE.getDslAnyProperty_NotEmptyMessage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__SIZE = eINSTANCE.getDslAnyProperty_Size();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__VALIDATE = eINSTANCE.getDslAnyProperty_Validate();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_ANY_PROPERTY__TRANSIENT = eINSTANCE.getDslAnyProperty_Transient();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslPropertyImpl <em>Dsl Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslPropertyImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslProperty()
		 * @generated
		 */
		EClass DSL_PROPERTY = eINSTANCE.getDslProperty();

		/**
		 * The meta object literal for the '<em><b>Database Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_PROPERTY__DATABASE_COLUMN = eINSTANCE.getDslProperty_DatabaseColumn();

		/**
		 * The meta object literal for the '{@link sculptordsl.impl.DslDtoPropertyImpl <em>Dsl Dto Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.impl.DslDtoPropertyImpl
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDtoProperty()
		 * @generated
		 */
		EClass DSL_DTO_PROPERTY = eINSTANCE.getDslDtoProperty();

		/**
		 * The meta object literal for the '{@link sculptordsl.DslHttpMethod <em>Dsl Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.DslHttpMethod
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslHttpMethod()
		 * @generated
		 */
		EEnum DSL_HTTP_METHOD = eINSTANCE.getDslHttpMethod();

		/**
		 * The meta object literal for the '{@link sculptordsl.DslInheritanceType <em>Dsl Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.DslInheritanceType
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslInheritanceType()
		 * @generated
		 */
		EEnum DSL_INHERITANCE_TYPE = eINSTANCE.getDslInheritanceType();

		/**
		 * The meta object literal for the '{@link sculptordsl.DslDiscriminatorType <em>Dsl Discriminator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.DslDiscriminatorType
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslDiscriminatorType()
		 * @generated
		 */
		EEnum DSL_DISCRIMINATOR_TYPE = eINSTANCE.getDslDiscriminatorType();

		/**
		 * The meta object literal for the '{@link sculptordsl.DslCollectionType <em>Dsl Collection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.DslCollectionType
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslCollectionType()
		 * @generated
		 */
		EEnum DSL_COLLECTION_TYPE = eINSTANCE.getDslCollectionType();

		/**
		 * The meta object literal for the '{@link sculptordsl.DslVisibility <em>Dsl Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sculptordsl.DslVisibility
		 * @see sculptordsl.impl.SculptordslPackageImpl#getDslVisibility()
		 * @generated
		 */
		EEnum DSL_VISIBILITY = eINSTANCE.getDslVisibility();

	}

} //SculptordslPackage
