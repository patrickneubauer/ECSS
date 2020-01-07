/**
 */
package rIMDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rIMDsl.RIMDslPackage
 * @generated
 */
public interface RIMDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RIMDslFactory eINSTANCE = rIMDsl.impl.RIMDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Domain Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Declaration</em>'.
	 * @generated
	 */
	DomainDeclaration createDomainDeclaration();

	/**
	 * Returns a new object of class '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref</em>'.
	 * @generated
	 */
	Ref createRef();

	/**
	 * Returns a new object of class '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use</em>'.
	 * @generated
	 */
	Use createUse();

	/**
	 * Returns a new object of class '<em>Resource Interaction Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interaction Model</em>'.
	 * @generated
	 */
	ResourceInteractionModel createResourceInteractionModel();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Command Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Spec</em>'.
	 * @generated
	 */
	CommandSpec createCommandSpec();

	/**
	 * Returns a new object of class '<em>Command Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Property</em>'.
	 * @generated
	 */
	CommandProperty createCommandProperty();

	/**
	 * Returns a new object of class '<em>Base Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Path</em>'.
	 * @generated
	 */
	BasePath createBasePath();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Impl Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Ref</em>'.
	 * @generated
	 */
	ImplRef createImplRef();

	/**
	 * Returns a new object of class '<em>Method Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Ref</em>'.
	 * @generated
	 */
	MethodRef createMethodRef();

	/**
	 * Returns a new object of class '<em>Transition Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Ref</em>'.
	 * @generated
	 */
	TransitionRef createTransitionRef();

	/**
	 * Returns a new object of class '<em>Resource Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Locator</em>'.
	 * @generated
	 */
	ResourceLocator createResourceLocator();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Transition For Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition For Each</em>'.
	 * @generated
	 */
	TransitionForEach createTransitionForEach();

	/**
	 * Returns a new object of class '<em>Transition Embedded For Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Embedded For Each</em>'.
	 * @generated
	 */
	TransitionEmbeddedForEach createTransitionEmbeddedForEach();

	/**
	 * Returns a new object of class '<em>Transition Auto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Auto</em>'.
	 * @generated
	 */
	TransitionAuto createTransitionAuto();

	/**
	 * Returns a new object of class '<em>Transition Redirect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Redirect</em>'.
	 * @generated
	 */
	TransitionRedirect createTransitionRedirect();

	/**
	 * Returns a new object of class '<em>Transition Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Embedded</em>'.
	 * @generated
	 */
	TransitionEmbedded createTransitionEmbedded();

	/**
	 * Returns a new object of class '<em>Transition Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Spec</em>'.
	 * @generated
	 */
	TransitionSpec createTransitionSpec();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Function OK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function OK</em>'.
	 * @generated
	 */
	Function_OK createFunction_OK();

	/**
	 * Returns a new object of class '<em>Function NOT FOUND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function NOT FOUND</em>'.
	 * @generated
	 */
	Function_NOT_FOUND createFunction_NOT_FOUND();

	/**
	 * Returns a new object of class '<em>Relation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Ref</em>'.
	 * @generated
	 */
	RelationRef createRelationRef();

	/**
	 * Returns a new object of class '<em>Relation Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Constant</em>'.
	 * @generated
	 */
	RelationConstant createRelationConstant();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type</em>'.
	 * @generated
	 */
	ResourceType createResourceType();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Resource Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Command</em>'.
	 * @generated
	 */
	ResourceCommand createResourceCommand();

	/**
	 * Returns a new object of class '<em>Uri Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Link</em>'.
	 * @generated
	 */
	UriLink createUriLink();

	/**
	 * Returns a new object of class '<em>Uri Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Linkage</em>'.
	 * @generated
	 */
	UriLinkage createUriLinkage();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Link Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Id</em>'.
	 * @generated
	 */
	LinkId createLinkId();

	/**
	 * Returns a new object of class '<em>Source Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Field</em>'.
	 * @generated
	 */
	SourceField createSourceField();

	/**
	 * Returns a new object of class '<em>Mdf Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mdf Annotation</em>'.
	 * @generated
	 */
	MdfAnnotation createMdfAnnotation();

	/**
	 * Returns a new object of class '<em>OK Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OK Function</em>'.
	 * @generated
	 */
	OKFunction createOKFunction();

	/**
	 * Returns a new object of class '<em>Not Found Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Found Function</em>'.
	 * @generated
	 */
	NotFoundFunction createNotFoundFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RIMDslPackage getRIMDslPackage();

} //RIMDslFactory
