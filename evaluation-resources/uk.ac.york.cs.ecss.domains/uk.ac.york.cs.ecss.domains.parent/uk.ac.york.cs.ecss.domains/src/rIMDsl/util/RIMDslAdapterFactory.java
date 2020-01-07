/**
 */
package rIMDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rIMDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rIMDsl.RIMDslPackage
 * @generated
 */
public class RIMDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RIMDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RIMDslPackage.eINSTANCE;
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
	protected RIMDslSwitch<Adapter> modelSwitch =
		new RIMDslSwitch<Adapter>() {
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseDomainDeclaration(DomainDeclaration object) {
				return createDomainDeclarationAdapter();
			}
			@Override
			public Adapter caseRef(Ref object) {
				return createRefAdapter();
			}
			@Override
			public Adapter caseUse(Use object) {
				return createUseAdapter();
			}
			@Override
			public Adapter caseResourceInteractionModel(ResourceInteractionModel object) {
				return createResourceInteractionModelAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseCommandSpec(CommandSpec object) {
				return createCommandSpecAdapter();
			}
			@Override
			public Adapter caseCommandProperty(CommandProperty object) {
				return createCommandPropertyAdapter();
			}
			@Override
			public Adapter caseBasePath(BasePath object) {
				return createBasePathAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseImplRef(ImplRef object) {
				return createImplRefAdapter();
			}
			@Override
			public Adapter caseMethodRef(MethodRef object) {
				return createMethodRefAdapter();
			}
			@Override
			public Adapter caseTransitionRef(TransitionRef object) {
				return createTransitionRefAdapter();
			}
			@Override
			public Adapter caseResourceLocator(ResourceLocator object) {
				return createResourceLocatorAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseTransitionForEach(TransitionForEach object) {
				return createTransitionForEachAdapter();
			}
			@Override
			public Adapter caseTransitionEmbeddedForEach(TransitionEmbeddedForEach object) {
				return createTransitionEmbeddedForEachAdapter();
			}
			@Override
			public Adapter caseTransitionAuto(TransitionAuto object) {
				return createTransitionAutoAdapter();
			}
			@Override
			public Adapter caseTransitionRedirect(TransitionRedirect object) {
				return createTransitionRedirectAdapter();
			}
			@Override
			public Adapter caseTransitionEmbedded(TransitionEmbedded object) {
				return createTransitionEmbeddedAdapter();
			}
			@Override
			public Adapter caseTransitionSpec(TransitionSpec object) {
				return createTransitionSpecAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseFunction_OK(Function_OK object) {
				return createFunction_OKAdapter();
			}
			@Override
			public Adapter caseFunction_NOT_FOUND(Function_NOT_FOUND object) {
				return createFunction_NOT_FOUNDAdapter();
			}
			@Override
			public Adapter caseRelationRef(RelationRef object) {
				return createRelationRefAdapter();
			}
			@Override
			public Adapter caseRelationConstant(RelationConstant object) {
				return createRelationConstantAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResourceCommand(ResourceCommand object) {
				return createResourceCommandAdapter();
			}
			@Override
			public Adapter caseUriLink(UriLink object) {
				return createUriLinkAdapter();
			}
			@Override
			public Adapter caseUriLinkage(UriLinkage object) {
				return createUriLinkageAdapter();
			}
			@Override
			public Adapter caseTitle(Title object) {
				return createTitleAdapter();
			}
			@Override
			public Adapter caseLinkId(LinkId object) {
				return createLinkIdAdapter();
			}
			@Override
			public Adapter caseSourceField(SourceField object) {
				return createSourceFieldAdapter();
			}
			@Override
			public Adapter caseMdfAnnotation(MdfAnnotation object) {
				return createMdfAnnotationAdapter();
			}
			@Override
			public Adapter caseOKFunction(OKFunction object) {
				return createOKFunctionAdapter();
			}
			@Override
			public Adapter caseNotFoundFunction(NotFoundFunction object) {
				return createNotFoundFunctionAdapter();
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
	 * Creates a new adapter for an object of class '{@link rIMDsl.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.DomainDeclaration <em>Domain Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.DomainDeclaration
	 * @generated
	 */
	public Adapter createDomainDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Ref
	 * @generated
	 */
	public Adapter createRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Use
	 * @generated
	 */
	public Adapter createUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.ResourceInteractionModel <em>Resource Interaction Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.ResourceInteractionModel
	 * @generated
	 */
	public Adapter createResourceInteractionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.CommandSpec <em>Command Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.CommandSpec
	 * @generated
	 */
	public Adapter createCommandSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.CommandProperty <em>Command Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.CommandProperty
	 * @generated
	 */
	public Adapter createCommandPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.BasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.BasePath
	 * @generated
	 */
	public Adapter createBasePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.ImplRef <em>Impl Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.ImplRef
	 * @generated
	 */
	public Adapter createImplRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.MethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.MethodRef
	 * @generated
	 */
	public Adapter createMethodRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionRef <em>Transition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionRef
	 * @generated
	 */
	public Adapter createTransitionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.ResourceLocator <em>Resource Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.ResourceLocator
	 * @generated
	 */
	public Adapter createResourceLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionForEach <em>Transition For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionForEach
	 * @generated
	 */
	public Adapter createTransitionForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionEmbeddedForEach <em>Transition Embedded For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionEmbeddedForEach
	 * @generated
	 */
	public Adapter createTransitionEmbeddedForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionAuto <em>Transition Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionAuto
	 * @generated
	 */
	public Adapter createTransitionAutoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionRedirect <em>Transition Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionRedirect
	 * @generated
	 */
	public Adapter createTransitionRedirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionEmbedded <em>Transition Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionEmbedded
	 * @generated
	 */
	public Adapter createTransitionEmbeddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.TransitionSpec <em>Transition Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.TransitionSpec
	 * @generated
	 */
	public Adapter createTransitionSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Function_OK <em>Function OK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Function_OK
	 * @generated
	 */
	public Adapter createFunction_OKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Function_NOT_FOUND <em>Function NOT FOUND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Function_NOT_FOUND
	 * @generated
	 */
	public Adapter createFunction_NOT_FOUNDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.RelationRef <em>Relation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.RelationRef
	 * @generated
	 */
	public Adapter createRelationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.RelationConstant <em>Relation Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.RelationConstant
	 * @generated
	 */
	public Adapter createRelationConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.ResourceCommand <em>Resource Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.ResourceCommand
	 * @generated
	 */
	public Adapter createResourceCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.UriLink <em>Uri Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.UriLink
	 * @generated
	 */
	public Adapter createUriLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.UriLinkage <em>Uri Linkage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.UriLinkage
	 * @generated
	 */
	public Adapter createUriLinkageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.LinkId <em>Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.LinkId
	 * @generated
	 */
	public Adapter createLinkIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.SourceField <em>Source Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.SourceField
	 * @generated
	 */
	public Adapter createSourceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.MdfAnnotation <em>Mdf Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.MdfAnnotation
	 * @generated
	 */
	public Adapter createMdfAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.OKFunction <em>OK Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.OKFunction
	 * @generated
	 */
	public Adapter createOKFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rIMDsl.NotFoundFunction <em>Not Found Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rIMDsl.NotFoundFunction
	 * @generated
	 */
	public Adapter createNotFoundFunctionAdapter() {
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

} //RIMDslAdapterFactory
