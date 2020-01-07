/**
 */
package rIMDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rIMDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RIMDslFactoryImpl extends EFactoryImpl implements RIMDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RIMDslFactory init() {
		try {
			RIMDslFactory theRIMDslFactory = (RIMDslFactory)EPackage.Registry.INSTANCE.getEFactory(RIMDslPackage.eNS_URI);
			if (theRIMDslFactory != null) {
				return theRIMDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RIMDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMDslFactoryImpl() {
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
			case RIMDslPackage.DOMAIN_MODEL: return createDomainModel();
			case RIMDslPackage.DOMAIN_DECLARATION: return createDomainDeclaration();
			case RIMDslPackage.REF: return createRef();
			case RIMDslPackage.USE: return createUse();
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL: return createResourceInteractionModel();
			case RIMDslPackage.EVENT: return createEvent();
			case RIMDslPackage.COMMAND: return createCommand();
			case RIMDslPackage.COMMAND_SPEC: return createCommandSpec();
			case RIMDslPackage.COMMAND_PROPERTY: return createCommandProperty();
			case RIMDslPackage.BASE_PATH: return createBasePath();
			case RIMDslPackage.RELATION: return createRelation();
			case RIMDslPackage.STATE: return createState();
			case RIMDslPackage.IMPL_REF: return createImplRef();
			case RIMDslPackage.METHOD_REF: return createMethodRef();
			case RIMDslPackage.TRANSITION_REF: return createTransitionRef();
			case RIMDslPackage.RESOURCE_LOCATOR: return createResourceLocator();
			case RIMDslPackage.TRANSITION: return createTransition();
			case RIMDslPackage.TRANSITION_FOR_EACH: return createTransitionForEach();
			case RIMDslPackage.TRANSITION_EMBEDDED_FOR_EACH: return createTransitionEmbeddedForEach();
			case RIMDslPackage.TRANSITION_AUTO: return createTransitionAuto();
			case RIMDslPackage.TRANSITION_REDIRECT: return createTransitionRedirect();
			case RIMDslPackage.TRANSITION_EMBEDDED: return createTransitionEmbedded();
			case RIMDslPackage.TRANSITION_SPEC: return createTransitionSpec();
			case RIMDslPackage.EXPRESSION: return createExpression();
			case RIMDslPackage.FUNCTION: return createFunction();
			case RIMDslPackage.FUNCTION_OK: return createFunction_OK();
			case RIMDslPackage.FUNCTION_NOT_FOUND: return createFunction_NOT_FOUND();
			case RIMDslPackage.RELATION_REF: return createRelationRef();
			case RIMDslPackage.RELATION_CONSTANT: return createRelationConstant();
			case RIMDslPackage.PATH: return createPath();
			case RIMDslPackage.RESOURCE_TYPE: return createResourceType();
			case RIMDslPackage.ENTITY: return createEntity();
			case RIMDslPackage.RESOURCE_COMMAND: return createResourceCommand();
			case RIMDslPackage.URI_LINK: return createUriLink();
			case RIMDslPackage.URI_LINKAGE: return createUriLinkage();
			case RIMDslPackage.TITLE: return createTitle();
			case RIMDslPackage.LINK_ID: return createLinkId();
			case RIMDslPackage.SOURCE_FIELD: return createSourceField();
			case RIMDslPackage.MDF_ANNOTATION: return createMdfAnnotation();
			case RIMDslPackage.OK_FUNCTION: return createOKFunction();
			case RIMDslPackage.NOT_FOUND_FUNCTION: return createNotFoundFunction();
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
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainDeclaration createDomainDeclaration() {
		DomainDeclarationImpl domainDeclaration = new DomainDeclarationImpl();
		return domainDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref createRef() {
		RefImpl ref = new RefImpl();
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Use createUse() {
		UseImpl use = new UseImpl();
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceInteractionModel createResourceInteractionModel() {
		ResourceInteractionModelImpl resourceInteractionModel = new ResourceInteractionModelImpl();
		return resourceInteractionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandSpec createCommandSpec() {
		CommandSpecImpl commandSpec = new CommandSpecImpl();
		return commandSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandProperty createCommandProperty() {
		CommandPropertyImpl commandProperty = new CommandPropertyImpl();
		return commandProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePath createBasePath() {
		BasePathImpl basePath = new BasePathImpl();
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplRef createImplRef() {
		ImplRefImpl implRef = new ImplRefImpl();
		return implRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef createMethodRef() {
		MethodRefImpl methodRef = new MethodRefImpl();
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionRef createTransitionRef() {
		TransitionRefImpl transitionRef = new TransitionRefImpl();
		return transitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator createResourceLocator() {
		ResourceLocatorImpl resourceLocator = new ResourceLocatorImpl();
		return resourceLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionForEach createTransitionForEach() {
		TransitionForEachImpl transitionForEach = new TransitionForEachImpl();
		return transitionForEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionEmbeddedForEach createTransitionEmbeddedForEach() {
		TransitionEmbeddedForEachImpl transitionEmbeddedForEach = new TransitionEmbeddedForEachImpl();
		return transitionEmbeddedForEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionAuto createTransitionAuto() {
		TransitionAutoImpl transitionAuto = new TransitionAutoImpl();
		return transitionAuto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionRedirect createTransitionRedirect() {
		TransitionRedirectImpl transitionRedirect = new TransitionRedirectImpl();
		return transitionRedirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionEmbedded createTransitionEmbedded() {
		TransitionEmbeddedImpl transitionEmbedded = new TransitionEmbeddedImpl();
		return transitionEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionSpec createTransitionSpec() {
		TransitionSpecImpl transitionSpec = new TransitionSpecImpl();
		return transitionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function_OK createFunction_OK() {
		Function_OKImpl function_OK = new Function_OKImpl();
		return function_OK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function_NOT_FOUND createFunction_NOT_FOUND() {
		Function_NOT_FOUNDImpl function_NOT_FOUND = new Function_NOT_FOUNDImpl();
		return function_NOT_FOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationRef createRelationRef() {
		RelationRefImpl relationRef = new RelationRefImpl();
		return relationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationConstant createRelationConstant() {
		RelationConstantImpl relationConstant = new RelationConstantImpl();
		return relationConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCommand createResourceCommand() {
		ResourceCommandImpl resourceCommand = new ResourceCommandImpl();
		return resourceCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriLink createUriLink() {
		UriLinkImpl uriLink = new UriLinkImpl();
		return uriLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UriLinkage createUriLinkage() {
		UriLinkageImpl uriLinkage = new UriLinkageImpl();
		return uriLinkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkId createLinkId() {
		LinkIdImpl linkId = new LinkIdImpl();
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceField createSourceField() {
		SourceFieldImpl sourceField = new SourceFieldImpl();
		return sourceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MdfAnnotation createMdfAnnotation() {
		MdfAnnotationImpl mdfAnnotation = new MdfAnnotationImpl();
		return mdfAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OKFunction createOKFunction() {
		OKFunctionImpl okFunction = new OKFunctionImpl();
		return okFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotFoundFunction createNotFoundFunction() {
		NotFoundFunctionImpl notFoundFunction = new NotFoundFunctionImpl();
		return notFoundFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RIMDslPackage getRIMDslPackage() {
		return (RIMDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RIMDslPackage getPackage() {
		return RIMDslPackage.eINSTANCE;
	}

} //RIMDslFactoryImpl
