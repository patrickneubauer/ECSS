/**
 */
package rIMDsl;

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
 * @see rIMDsl.RIMDslFactory
 * @model kind="package"
 * @generated
 */
public interface RIMDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rIMDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.com.trglang/temenos/interaction/rimdsl/RIMDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rIMDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RIMDslPackage eINSTANCE = rIMDsl.impl.RIMDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link rIMDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.DomainModelImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Rims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__RIMS = 0;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.RefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.RefImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getRef()
	 * @generated
	 */
	int REF = 2;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.DomainDeclarationImpl <em>Domain Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.DomainDeclarationImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getDomainDeclaration()
	 * @generated
	 */
	int DOMAIN_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECLARATION__NAME = REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECLARATION__ANNOTATIONS = REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECLARATION__RIMS = REF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Domain Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECLARATION_FEATURE_COUNT = REF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Domain Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECLARATION_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.UseImpl <em>Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.UseImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getUse()
	 * @generated
	 */
	int USE = 3;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE__IMPORTED_NAMESPACE = REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ResourceInteractionModelImpl <em>Resource Interaction Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ResourceInteractionModelImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceInteractionModel()
	 * @generated
	 */
	int RESOURCE_INTERACTION_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__NAME = REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__ANNOTATIONS = REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__EVENTS = REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__COMMANDS = REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Basepath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__BASEPATH = REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__RELATIONS = REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL__STATES = REF_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL_FEATURE_COUNT = REF_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Resource Interaction Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERACTION_MODEL_OPERATION_COUNT = REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.EventImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HTTP_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.CommandImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__SPEC = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.CommandSpecImpl <em>Command Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.CommandSpecImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getCommandSpec()
	 * @generated
	 */
	int COMMAND_SPEC = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SPEC__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Command Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.CommandPropertyImpl <em>Command Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.CommandPropertyImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getCommandProperty()
	 * @generated
	 */
	int COMMAND_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Command Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.BasePathImpl <em>Base Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.BasePathImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getBasePath()
	 * @generated
	 */
	int BASE_PATH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PATH__NAME = 0;

	/**
	 * The number of structural features of the '<em>Base Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Base Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.RelationImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fqn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FQN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.StateImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getState()
	 * @generated
	 */
	int STATE = 11;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IMPL = 6;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__RELATIONS = 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PATH = 8;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 9;

	/**
	 * The feature id for the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ERROR_STATE = 10;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CACHE = 11;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ImplRefImpl <em>Impl Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ImplRefImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getImplRef()
	 * @generated
	 */
	int IMPL_REF = 12;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF__VIEW = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF__METHODS = 2;

	/**
	 * The number of structural features of the '<em>Impl Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Impl Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.MethodRefImpl <em>Method Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.MethodRefImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getMethodRef()
	 * @generated
	 */
	int METHOD_REF = 13;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Method Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionRefImpl <em>Transition Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionRefImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionRef()
	 * @generated
	 */
	int TRANSITION_REF = 14;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF__EVENT = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF__STATE = 1;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF__LOCATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF__NAME = 3;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF__SPEC = 4;

	/**
	 * The number of structural features of the '<em>Transition Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ResourceLocatorImpl <em>Resource Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ResourceLocatorImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceLocator()
	 * @generated
	 */
	int RESOURCE_LOCATOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__ARGS = 1;

	/**
	 * The number of structural features of the '<em>Resource Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionForEachImpl <em>Transition For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionForEachImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionForEach()
	 * @generated
	 */
	int TRANSITION_FOR_EACH = 17;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FOR_EACH_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionEmbeddedForEachImpl <em>Transition Embedded For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionEmbeddedForEachImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionEmbeddedForEach()
	 * @generated
	 */
	int TRANSITION_EMBEDDED_FOR_EACH = 18;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition Embedded For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Embedded For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FOR_EACH_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionAutoImpl <em>Transition Auto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionAutoImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionAuto()
	 * @generated
	 */
	int TRANSITION_AUTO = 19;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition Auto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Auto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_AUTO_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionRedirectImpl <em>Transition Redirect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionRedirectImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionRedirect()
	 * @generated
	 */
	int TRANSITION_REDIRECT = 20;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Redirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_REDIRECT_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionEmbeddedImpl <em>Transition Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionEmbeddedImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionEmbedded()
	 * @generated
	 */
	int TRANSITION_EMBEDDED = 21;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED__EVENT = TRANSITION_REF__EVENT;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED__STATE = TRANSITION_REF__STATE;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED__LOCATOR = TRANSITION_REF__LOCATOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED__NAME = TRANSITION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED__SPEC = TRANSITION_REF__SPEC;

	/**
	 * The number of structural features of the '<em>Transition Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_FEATURE_COUNT = TRANSITION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EMBEDDED_OPERATION_COUNT = TRANSITION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TransitionSpecImpl <em>Transition Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TransitionSpecImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionSpec()
	 * @generated
	 */
	int TRANSITION_SPEC = 22;

	/**
	 * The feature id for the '<em><b>Eval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC__EVAL = 0;

	/**
	 * The feature id for the '<em><b>Uri Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC__URI_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC__ID = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Transition Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ExpressionImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.FunctionImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 24;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.Function_OKImpl <em>Function OK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.Function_OKImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction_OK()
	 * @generated
	 */
	int FUNCTION_OK = 25;

	/**
	 * The number of structural features of the '<em>Function OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OK_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OK_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.Function_NOT_FOUNDImpl <em>Function NOT FOUND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.Function_NOT_FOUNDImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction_NOT_FOUND()
	 * @generated
	 */
	int FUNCTION_NOT_FOUND = 26;

	/**
	 * The number of structural features of the '<em>Function NOT FOUND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NOT_FOUND_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function NOT FOUND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NOT_FOUND_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.RelationRefImpl <em>Relation Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.RelationRefImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getRelationRef()
	 * @generated
	 */
	int RELATION_REF = 27;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REF__RELATION = 0;

	/**
	 * The number of structural features of the '<em>Relation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.RelationConstantImpl <em>Relation Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.RelationConstantImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getRelationConstant()
	 * @generated
	 */
	int RELATION_CONSTANT = 28;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTANT__RELATION = RELATION_REF__RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTANT__NAME = RELATION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTANT_FEATURE_COUNT = RELATION_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTANT_OPERATION_COUNT = RELATION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.PathImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ResourceTypeImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Is Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__IS_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.EntityImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.ResourceCommandImpl <em>Resource Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.ResourceCommandImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceCommand()
	 * @generated
	 */
	int RESOURCE_COMMAND = 32;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COMMAND__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COMMAND__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Resource Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.UriLinkImpl <em>Uri Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.UriLinkImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getUriLink()
	 * @generated
	 */
	int URI_LINK = 33;

	/**
	 * The feature id for the '<em><b>Template Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINK__TEMPLATE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Entity Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINK__ENTITY_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Uri Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uri Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.UriLinkageImpl <em>Uri Linkage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.UriLinkageImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getUriLinkage()
	 * @generated
	 */
	int URI_LINKAGE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINKAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Uri Linkage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Uri Linkage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_LINKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.TitleImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.LinkIdImpl <em>Link Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.LinkIdImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getLinkId()
	 * @generated
	 */
	int LINK_ID = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ID__NAME = 0;

	/**
	 * The number of structural features of the '<em>Link Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.SourceFieldImpl <em>Source Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.SourceFieldImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getSourceField()
	 * @generated
	 */
	int SOURCE_FIELD = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Source Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.MdfAnnotationImpl <em>Mdf Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.MdfAnnotationImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getMdfAnnotation()
	 * @generated
	 */
	int MDF_ANNOTATION = 38;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDF_ANNOTATION__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDF_ANNOTATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDF_ANNOTATION__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Mdf Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDF_ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mdf Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDF_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.OKFunctionImpl <em>OK Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.OKFunctionImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getOKFunction()
	 * @generated
	 */
	int OK_FUNCTION = 39;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FUNCTION__STATE = FUNCTION_OK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OK Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FUNCTION_FEATURE_COUNT = FUNCTION_OK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OK Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FUNCTION_OPERATION_COUNT = FUNCTION_OK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rIMDsl.impl.NotFoundFunctionImpl <em>Not Found Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rIMDsl.impl.NotFoundFunctionImpl
	 * @see rIMDsl.impl.RIMDslPackageImpl#getNotFoundFunction()
	 * @generated
	 */
	int NOT_FOUND_FUNCTION = 40;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_FUNCTION__STATE = FUNCTION_NOT_FOUND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Found Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_FUNCTION_FEATURE_COUNT = FUNCTION_NOT_FOUND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Found Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FOUND_FUNCTION_OPERATION_COUNT = FUNCTION_NOT_FOUND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link rIMDsl.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see rIMDsl.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.DomainModel#getRims <em>Rims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rims</em>'.
	 * @see rIMDsl.DomainModel#getRims()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Rims();

	/**
	 * Returns the meta object for class '{@link rIMDsl.DomainDeclaration <em>Domain Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Declaration</em>'.
	 * @see rIMDsl.DomainDeclaration
	 * @generated
	 */
	EClass getDomainDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.DomainDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.DomainDeclaration#getName()
	 * @see #getDomainDeclaration()
	 * @generated
	 */
	EAttribute getDomainDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.DomainDeclaration#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see rIMDsl.DomainDeclaration#getAnnotations()
	 * @see #getDomainDeclaration()
	 * @generated
	 */
	EReference getDomainDeclaration_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.DomainDeclaration#getRims <em>Rims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rims</em>'.
	 * @see rIMDsl.DomainDeclaration#getRims()
	 * @see #getDomainDeclaration()
	 * @generated
	 */
	EReference getDomainDeclaration_Rims();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see rIMDsl.Ref
	 * @generated
	 */
	EClass getRef();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use</em>'.
	 * @see rIMDsl.Use
	 * @generated
	 */
	EClass getUse();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Use#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see rIMDsl.Use#getImportedNamespace()
	 * @see #getUse()
	 * @generated
	 */
	EAttribute getUse_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link rIMDsl.ResourceInteractionModel <em>Resource Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interaction Model</em>'.
	 * @see rIMDsl.ResourceInteractionModel
	 * @generated
	 */
	EClass getResourceInteractionModel();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.ResourceInteractionModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getName()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EAttribute getResourceInteractionModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceInteractionModel#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getAnnotations()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceInteractionModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getEvents()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceInteractionModel#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getCommands()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_Commands();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.ResourceInteractionModel#getBasepath <em>Basepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basepath</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getBasepath()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_Basepath();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceInteractionModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getRelations()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceInteractionModel#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see rIMDsl.ResourceInteractionModel#getStates()
	 * @see #getResourceInteractionModel()
	 * @generated
	 */
	EReference getResourceInteractionModel_States();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see rIMDsl.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.Event#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see rIMDsl.Event#getAnnotations()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Event#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see rIMDsl.Event#getHttpMethod()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_HttpMethod();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see rIMDsl.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.Command#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see rIMDsl.Command#getSpec()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Spec();

	/**
	 * Returns the meta object for class '{@link rIMDsl.CommandSpec <em>Command Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Spec</em>'.
	 * @see rIMDsl.CommandSpec
	 * @generated
	 */
	EClass getCommandSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.CommandSpec#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see rIMDsl.CommandSpec#getProperties()
	 * @see #getCommandSpec()
	 * @generated
	 */
	EReference getCommandSpec_Properties();

	/**
	 * Returns the meta object for class '{@link rIMDsl.CommandProperty <em>Command Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Property</em>'.
	 * @see rIMDsl.CommandProperty
	 * @generated
	 */
	EClass getCommandProperty();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.CommandProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.CommandProperty#getName()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.CommandProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rIMDsl.CommandProperty#getValue()
	 * @see #getCommandProperty()
	 * @generated
	 */
	EAttribute getCommandProperty_Value();

	/**
	 * Returns the meta object for class '{@link rIMDsl.BasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Path</em>'.
	 * @see rIMDsl.BasePath
	 * @generated
	 */
	EClass getBasePath();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.BasePath#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.BasePath#getName()
	 * @see #getBasePath()
	 * @generated
	 */
	EAttribute getBasePath_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see rIMDsl.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Relation#getFqn <em>Fqn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fqn</em>'.
	 * @see rIMDsl.Relation#getFqn()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Fqn();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Relation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rIMDsl.Relation#getDescription()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Description();

	/**
	 * Returns the meta object for class '{@link rIMDsl.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see rIMDsl.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.State#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see rIMDsl.State#isIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.State#isIsException <em>Is Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exception</em>'.
	 * @see rIMDsl.State#isIsException()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsException();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.State#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see rIMDsl.State#getAnnotations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see rIMDsl.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Type();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.State#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see rIMDsl.State#getEntity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.State#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impl</em>'.
	 * @see rIMDsl.State#getImpl()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Impl();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.State#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see rIMDsl.State#getRelations()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.State#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see rIMDsl.State#getPath()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see rIMDsl.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.State#getErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error State</em>'.
	 * @see rIMDsl.State#getErrorState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ErrorState();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.State#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see rIMDsl.State#getCache()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Cache();

	/**
	 * Returns the meta object for class '{@link rIMDsl.ImplRef <em>Impl Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Ref</em>'.
	 * @see rIMDsl.ImplRef
	 * @generated
	 */
	EClass getImplRef();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.ImplRef#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see rIMDsl.ImplRef#getView()
	 * @see #getImplRef()
	 * @generated
	 */
	EReference getImplRef_View();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ImplRef#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see rIMDsl.ImplRef#getActions()
	 * @see #getImplRef()
	 * @generated
	 */
	EReference getImplRef_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ImplRef#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see rIMDsl.ImplRef#getMethods()
	 * @see #getImplRef()
	 * @generated
	 */
	EReference getImplRef_Methods();

	/**
	 * Returns the meta object for class '{@link rIMDsl.MethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Ref</em>'.
	 * @see rIMDsl.MethodRef
	 * @generated
	 */
	EClass getMethodRef();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.MethodRef#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see rIMDsl.MethodRef#getEvent()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Event();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.MethodRef#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see rIMDsl.MethodRef#getCommand()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Command();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionRef <em>Transition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Ref</em>'.
	 * @see rIMDsl.TransitionRef
	 * @generated
	 */
	EClass getTransitionRef();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.TransitionRef#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see rIMDsl.TransitionRef#getEvent()
	 * @see #getTransitionRef()
	 * @generated
	 */
	EReference getTransitionRef_Event();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.TransitionRef#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see rIMDsl.TransitionRef#getState()
	 * @see #getTransitionRef()
	 * @generated
	 */
	EReference getTransitionRef_State();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionRef#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locator</em>'.
	 * @see rIMDsl.TransitionRef#getLocator()
	 * @see #getTransitionRef()
	 * @generated
	 */
	EReference getTransitionRef_Locator();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.TransitionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.TransitionRef#getName()
	 * @see #getTransitionRef()
	 * @generated
	 */
	EAttribute getTransitionRef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionRef#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see rIMDsl.TransitionRef#getSpec()
	 * @see #getTransitionRef()
	 * @generated
	 */
	EReference getTransitionRef_Spec();

	/**
	 * Returns the meta object for class '{@link rIMDsl.ResourceLocator <em>Resource Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Locator</em>'.
	 * @see rIMDsl.ResourceLocator
	 * @generated
	 */
	EClass getResourceLocator();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.ResourceLocator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.ResourceLocator#getName()
	 * @see #getResourceLocator()
	 * @generated
	 */
	EAttribute getResourceLocator_Name();

	/**
	 * Returns the meta object for the attribute list '{@link rIMDsl.ResourceLocator#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see rIMDsl.ResourceLocator#getArgs()
	 * @see #getResourceLocator()
	 * @generated
	 */
	EAttribute getResourceLocator_Args();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see rIMDsl.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionForEach <em>Transition For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition For Each</em>'.
	 * @see rIMDsl.TransitionForEach
	 * @generated
	 */
	EClass getTransitionForEach();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionEmbeddedForEach <em>Transition Embedded For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Embedded For Each</em>'.
	 * @see rIMDsl.TransitionEmbeddedForEach
	 * @generated
	 */
	EClass getTransitionEmbeddedForEach();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionAuto <em>Transition Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Auto</em>'.
	 * @see rIMDsl.TransitionAuto
	 * @generated
	 */
	EClass getTransitionAuto();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionRedirect <em>Transition Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Redirect</em>'.
	 * @see rIMDsl.TransitionRedirect
	 * @generated
	 */
	EClass getTransitionRedirect();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionEmbedded <em>Transition Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Embedded</em>'.
	 * @see rIMDsl.TransitionEmbedded
	 * @generated
	 */
	EClass getTransitionEmbedded();

	/**
	 * Returns the meta object for class '{@link rIMDsl.TransitionSpec <em>Transition Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Spec</em>'.
	 * @see rIMDsl.TransitionSpec
	 * @generated
	 */
	EClass getTransitionSpec();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionSpec#getEval <em>Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eval</em>'.
	 * @see rIMDsl.TransitionSpec#getEval()
	 * @see #getTransitionSpec()
	 * @generated
	 */
	EReference getTransitionSpec_Eval();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.TransitionSpec#getUriLinks <em>Uri Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uri Links</em>'.
	 * @see rIMDsl.TransitionSpec#getUriLinks()
	 * @see #getTransitionSpec()
	 * @generated
	 */
	EReference getTransitionSpec_UriLinks();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionSpec#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see rIMDsl.TransitionSpec#getTitle()
	 * @see #getTransitionSpec()
	 * @generated
	 */
	EReference getTransitionSpec_Title();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionSpec#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see rIMDsl.TransitionSpec#getId()
	 * @see #getTransitionSpec()
	 * @generated
	 */
	EReference getTransitionSpec_Id();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.TransitionSpec#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see rIMDsl.TransitionSpec#getField()
	 * @see #getTransitionSpec()
	 * @generated
	 */
	EReference getTransitionSpec_Field();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see rIMDsl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.Expression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see rIMDsl.Expression#getExpressions()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Expressions();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see rIMDsl.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Function_OK <em>Function OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function OK</em>'.
	 * @see rIMDsl.Function_OK
	 * @generated
	 */
	EClass getFunction_OK();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Function_NOT_FOUND <em>Function NOT FOUND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function NOT FOUND</em>'.
	 * @see rIMDsl.Function_NOT_FOUND
	 * @generated
	 */
	EClass getFunction_NOT_FOUND();

	/**
	 * Returns the meta object for class '{@link rIMDsl.RelationRef <em>Relation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Ref</em>'.
	 * @see rIMDsl.RelationRef
	 * @generated
	 */
	EClass getRelationRef();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.RelationRef#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see rIMDsl.RelationRef#getRelation()
	 * @see #getRelationRef()
	 * @generated
	 */
	EReference getRelationRef_Relation();

	/**
	 * Returns the meta object for class '{@link rIMDsl.RelationConstant <em>Relation Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Constant</em>'.
	 * @see rIMDsl.RelationConstant
	 * @generated
	 */
	EClass getRelationConstant();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.RelationConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.RelationConstant#getName()
	 * @see #getRelationConstant()
	 * @generated
	 */
	EAttribute getRelationConstant_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see rIMDsl.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Path#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Path#getName()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see rIMDsl.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.ResourceType#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see rIMDsl.ResourceType#isIsCollection()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.ResourceType#isIsItem <em>Is Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Item</em>'.
	 * @see rIMDsl.ResourceType#isIsItem()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_IsItem();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see rIMDsl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.ResourceCommand <em>Resource Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Command</em>'.
	 * @see rIMDsl.ResourceCommand
	 * @generated
	 */
	EClass getResourceCommand();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.ResourceCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see rIMDsl.ResourceCommand#getCommand()
	 * @see #getResourceCommand()
	 * @generated
	 */
	EReference getResourceCommand_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link rIMDsl.ResourceCommand#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see rIMDsl.ResourceCommand#getProperties()
	 * @see #getResourceCommand()
	 * @generated
	 */
	EReference getResourceCommand_Properties();

	/**
	 * Returns the meta object for class '{@link rIMDsl.UriLink <em>Uri Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Link</em>'.
	 * @see rIMDsl.UriLink
	 * @generated
	 */
	EClass getUriLink();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.UriLink#getTemplateProperty <em>Template Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Property</em>'.
	 * @see rIMDsl.UriLink#getTemplateProperty()
	 * @see #getUriLink()
	 * @generated
	 */
	EAttribute getUriLink_TemplateProperty();

	/**
	 * Returns the meta object for the containment reference '{@link rIMDsl.UriLink#getEntityProperty <em>Entity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Property</em>'.
	 * @see rIMDsl.UriLink#getEntityProperty()
	 * @see #getUriLink()
	 * @generated
	 */
	EReference getUriLink_EntityProperty();

	/**
	 * Returns the meta object for class '{@link rIMDsl.UriLinkage <em>Uri Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Linkage</em>'.
	 * @see rIMDsl.UriLinkage
	 * @generated
	 */
	EClass getUriLinkage();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.UriLinkage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.UriLinkage#getName()
	 * @see #getUriLinkage()
	 * @generated
	 */
	EAttribute getUriLinkage_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see rIMDsl.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.Title#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.Title#getName()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.LinkId <em>Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Id</em>'.
	 * @see rIMDsl.LinkId
	 * @generated
	 */
	EClass getLinkId();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.LinkId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.LinkId#getName()
	 * @see #getLinkId()
	 * @generated
	 */
	EAttribute getLinkId_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.SourceField <em>Source Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Field</em>'.
	 * @see rIMDsl.SourceField
	 * @generated
	 */
	EClass getSourceField();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.SourceField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.SourceField#getName()
	 * @see #getSourceField()
	 * @generated
	 */
	EAttribute getSourceField_Name();

	/**
	 * Returns the meta object for class '{@link rIMDsl.MdfAnnotation <em>Mdf Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mdf Annotation</em>'.
	 * @see rIMDsl.MdfAnnotation
	 * @generated
	 */
	EClass getMdfAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.MdfAnnotation#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see rIMDsl.MdfAnnotation#getNamespace()
	 * @see #getMdfAnnotation()
	 * @generated
	 */
	EAttribute getMdfAnnotation_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link rIMDsl.MdfAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rIMDsl.MdfAnnotation#getName()
	 * @see #getMdfAnnotation()
	 * @generated
	 */
	EAttribute getMdfAnnotation_Name();

	/**
	 * Returns the meta object for the attribute list '{@link rIMDsl.MdfAnnotation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see rIMDsl.MdfAnnotation#getProperties()
	 * @see #getMdfAnnotation()
	 * @generated
	 */
	EAttribute getMdfAnnotation_Properties();

	/**
	 * Returns the meta object for class '{@link rIMDsl.OKFunction <em>OK Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OK Function</em>'.
	 * @see rIMDsl.OKFunction
	 * @generated
	 */
	EClass getOKFunction();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.OKFunction#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see rIMDsl.OKFunction#getState()
	 * @see #getOKFunction()
	 * @generated
	 */
	EReference getOKFunction_State();

	/**
	 * Returns the meta object for class '{@link rIMDsl.NotFoundFunction <em>Not Found Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Found Function</em>'.
	 * @see rIMDsl.NotFoundFunction
	 * @generated
	 */
	EClass getNotFoundFunction();

	/**
	 * Returns the meta object for the reference '{@link rIMDsl.NotFoundFunction#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see rIMDsl.NotFoundFunction#getState()
	 * @see #getNotFoundFunction()
	 * @generated
	 */
	EReference getNotFoundFunction_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RIMDslFactory getRIMDslFactory();

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
		 * The meta object literal for the '{@link rIMDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.DomainModelImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Rims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__RIMS = eINSTANCE.getDomainModel_Rims();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.DomainDeclarationImpl <em>Domain Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.DomainDeclarationImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getDomainDeclaration()
		 * @generated
		 */
		EClass DOMAIN_DECLARATION = eINSTANCE.getDomainDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DECLARATION__NAME = eINSTANCE.getDomainDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DECLARATION__ANNOTATIONS = eINSTANCE.getDomainDeclaration_Annotations();

		/**
		 * The meta object literal for the '<em><b>Rims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DECLARATION__RIMS = eINSTANCE.getDomainDeclaration_Rims();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.RefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.RefImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getRef()
		 * @generated
		 */
		EClass REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.UseImpl <em>Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.UseImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getUse()
		 * @generated
		 */
		EClass USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE__IMPORTED_NAMESPACE = eINSTANCE.getUse_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ResourceInteractionModelImpl <em>Resource Interaction Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ResourceInteractionModelImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceInteractionModel()
		 * @generated
		 */
		EClass RESOURCE_INTERACTION_MODEL = eINSTANCE.getResourceInteractionModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INTERACTION_MODEL__NAME = eINSTANCE.getResourceInteractionModel_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__ANNOTATIONS = eINSTANCE.getResourceInteractionModel_Annotations();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__EVENTS = eINSTANCE.getResourceInteractionModel_Events();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__COMMANDS = eINSTANCE.getResourceInteractionModel_Commands();

		/**
		 * The meta object literal for the '<em><b>Basepath</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__BASEPATH = eINSTANCE.getResourceInteractionModel_Basepath();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__RELATIONS = eINSTANCE.getResourceInteractionModel_Relations();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERACTION_MODEL__STATES = eINSTANCE.getResourceInteractionModel_States();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.EventImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ANNOTATIONS = eINSTANCE.getEvent_Annotations();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__HTTP_METHOD = eINSTANCE.getEvent_HttpMethod();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.CommandImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__SPEC = eINSTANCE.getCommand_Spec();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.CommandSpecImpl <em>Command Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.CommandSpecImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getCommandSpec()
		 * @generated
		 */
		EClass COMMAND_SPEC = eINSTANCE.getCommandSpec();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_SPEC__PROPERTIES = eINSTANCE.getCommandSpec_Properties();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.CommandPropertyImpl <em>Command Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.CommandPropertyImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getCommandProperty()
		 * @generated
		 */
		EClass COMMAND_PROPERTY = eINSTANCE.getCommandProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__NAME = eINSTANCE.getCommandProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PROPERTY__VALUE = eINSTANCE.getCommandProperty_Value();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.BasePathImpl <em>Base Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.BasePathImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getBasePath()
		 * @generated
		 */
		EClass BASE_PATH = eINSTANCE.getBasePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_PATH__NAME = eINSTANCE.getBasePath_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.RelationImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Fqn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__FQN = eINSTANCE.getRelation_Fqn();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DESCRIPTION = eINSTANCE.getRelation_Description();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.StateImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_EXCEPTION = eINSTANCE.getState_IsException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ANNOTATIONS = eINSTANCE.getState_Annotations();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTITY = eINSTANCE.getState_Entity();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__IMPL = eINSTANCE.getState_Impl();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__RELATIONS = eINSTANCE.getState_Relations();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PATH = eINSTANCE.getState_Path();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ERROR_STATE = eINSTANCE.getState_ErrorState();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__CACHE = eINSTANCE.getState_Cache();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ImplRefImpl <em>Impl Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ImplRefImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getImplRef()
		 * @generated
		 */
		EClass IMPL_REF = eINSTANCE.getImplRef();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPL_REF__VIEW = eINSTANCE.getImplRef_View();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPL_REF__ACTIONS = eINSTANCE.getImplRef_Actions();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPL_REF__METHODS = eINSTANCE.getImplRef_Methods();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.MethodRefImpl <em>Method Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.MethodRefImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getMethodRef()
		 * @generated
		 */
		EClass METHOD_REF = eINSTANCE.getMethodRef();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF__EVENT = eINSTANCE.getMethodRef_Event();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF__COMMAND = eINSTANCE.getMethodRef_Command();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionRefImpl <em>Transition Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionRefImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionRef()
		 * @generated
		 */
		EClass TRANSITION_REF = eINSTANCE.getTransitionRef();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REF__EVENT = eINSTANCE.getTransitionRef_Event();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REF__STATE = eINSTANCE.getTransitionRef_State();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REF__LOCATOR = eINSTANCE.getTransitionRef_Locator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_REF__NAME = eINSTANCE.getTransitionRef_Name();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_REF__SPEC = eINSTANCE.getTransitionRef_Spec();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ResourceLocatorImpl <em>Resource Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ResourceLocatorImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceLocator()
		 * @generated
		 */
		EClass RESOURCE_LOCATOR = eINSTANCE.getResourceLocator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_LOCATOR__NAME = eINSTANCE.getResourceLocator_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_LOCATOR__ARGS = eINSTANCE.getResourceLocator_Args();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionForEachImpl <em>Transition For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionForEachImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionForEach()
		 * @generated
		 */
		EClass TRANSITION_FOR_EACH = eINSTANCE.getTransitionForEach();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionEmbeddedForEachImpl <em>Transition Embedded For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionEmbeddedForEachImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionEmbeddedForEach()
		 * @generated
		 */
		EClass TRANSITION_EMBEDDED_FOR_EACH = eINSTANCE.getTransitionEmbeddedForEach();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionAutoImpl <em>Transition Auto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionAutoImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionAuto()
		 * @generated
		 */
		EClass TRANSITION_AUTO = eINSTANCE.getTransitionAuto();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionRedirectImpl <em>Transition Redirect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionRedirectImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionRedirect()
		 * @generated
		 */
		EClass TRANSITION_REDIRECT = eINSTANCE.getTransitionRedirect();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionEmbeddedImpl <em>Transition Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionEmbeddedImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionEmbedded()
		 * @generated
		 */
		EClass TRANSITION_EMBEDDED = eINSTANCE.getTransitionEmbedded();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TransitionSpecImpl <em>Transition Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TransitionSpecImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTransitionSpec()
		 * @generated
		 */
		EClass TRANSITION_SPEC = eINSTANCE.getTransitionSpec();

		/**
		 * The meta object literal for the '<em><b>Eval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SPEC__EVAL = eINSTANCE.getTransitionSpec_Eval();

		/**
		 * The meta object literal for the '<em><b>Uri Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SPEC__URI_LINKS = eINSTANCE.getTransitionSpec_UriLinks();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SPEC__TITLE = eINSTANCE.getTransitionSpec_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SPEC__ID = eINSTANCE.getTransitionSpec_Id();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SPEC__FIELD = eINSTANCE.getTransitionSpec_Field();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ExpressionImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__EXPRESSIONS = eINSTANCE.getExpression_Expressions();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.FunctionImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.Function_OKImpl <em>Function OK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.Function_OKImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction_OK()
		 * @generated
		 */
		EClass FUNCTION_OK = eINSTANCE.getFunction_OK();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.Function_NOT_FOUNDImpl <em>Function NOT FOUND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.Function_NOT_FOUNDImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getFunction_NOT_FOUND()
		 * @generated
		 */
		EClass FUNCTION_NOT_FOUND = eINSTANCE.getFunction_NOT_FOUND();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.RelationRefImpl <em>Relation Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.RelationRefImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getRelationRef()
		 * @generated
		 */
		EClass RELATION_REF = eINSTANCE.getRelationRef();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_REF__RELATION = eINSTANCE.getRelationRef_Relation();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.RelationConstantImpl <em>Relation Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.RelationConstantImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getRelationConstant()
		 * @generated
		 */
		EClass RELATION_CONSTANT = eINSTANCE.getRelationConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CONSTANT__NAME = eINSTANCE.getRelationConstant_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.PathImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__NAME = eINSTANCE.getPath_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ResourceTypeImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_COLLECTION = eINSTANCE.getResourceType_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__IS_ITEM = eINSTANCE.getResourceType_IsItem();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.EntityImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.ResourceCommandImpl <em>Resource Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.ResourceCommandImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getResourceCommand()
		 * @generated
		 */
		EClass RESOURCE_COMMAND = eINSTANCE.getResourceCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_COMMAND__COMMAND = eINSTANCE.getResourceCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_COMMAND__PROPERTIES = eINSTANCE.getResourceCommand_Properties();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.UriLinkImpl <em>Uri Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.UriLinkImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getUriLink()
		 * @generated
		 */
		EClass URI_LINK = eINSTANCE.getUriLink();

		/**
		 * The meta object literal for the '<em><b>Template Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_LINK__TEMPLATE_PROPERTY = eINSTANCE.getUriLink_TemplateProperty();

		/**
		 * The meta object literal for the '<em><b>Entity Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URI_LINK__ENTITY_PROPERTY = eINSTANCE.getUriLink_EntityProperty();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.UriLinkageImpl <em>Uri Linkage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.UriLinkageImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getUriLinkage()
		 * @generated
		 */
		EClass URI_LINKAGE = eINSTANCE.getUriLinkage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_LINKAGE__NAME = eINSTANCE.getUriLinkage_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.TitleImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__NAME = eINSTANCE.getTitle_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.LinkIdImpl <em>Link Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.LinkIdImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getLinkId()
		 * @generated
		 */
		EClass LINK_ID = eINSTANCE.getLinkId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ID__NAME = eINSTANCE.getLinkId_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.SourceFieldImpl <em>Source Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.SourceFieldImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getSourceField()
		 * @generated
		 */
		EClass SOURCE_FIELD = eINSTANCE.getSourceField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FIELD__NAME = eINSTANCE.getSourceField_Name();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.MdfAnnotationImpl <em>Mdf Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.MdfAnnotationImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getMdfAnnotation()
		 * @generated
		 */
		EClass MDF_ANNOTATION = eINSTANCE.getMdfAnnotation();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MDF_ANNOTATION__NAMESPACE = eINSTANCE.getMdfAnnotation_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MDF_ANNOTATION__NAME = eINSTANCE.getMdfAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MDF_ANNOTATION__PROPERTIES = eINSTANCE.getMdfAnnotation_Properties();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.OKFunctionImpl <em>OK Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.OKFunctionImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getOKFunction()
		 * @generated
		 */
		EClass OK_FUNCTION = eINSTANCE.getOKFunction();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OK_FUNCTION__STATE = eINSTANCE.getOKFunction_State();

		/**
		 * The meta object literal for the '{@link rIMDsl.impl.NotFoundFunctionImpl <em>Not Found Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rIMDsl.impl.NotFoundFunctionImpl
		 * @see rIMDsl.impl.RIMDslPackageImpl#getNotFoundFunction()
		 * @generated
		 */
		EClass NOT_FOUND_FUNCTION = eINSTANCE.getNotFoundFunction();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_FOUND_FUNCTION__STATE = eINSTANCE.getNotFoundFunction_State();

	}

} //RIMDslPackage
