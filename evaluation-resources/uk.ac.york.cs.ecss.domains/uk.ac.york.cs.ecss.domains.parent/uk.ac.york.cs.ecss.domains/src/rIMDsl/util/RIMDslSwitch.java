/**
 */
package rIMDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rIMDsl.*;

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
 * @see rIMDsl.RIMDslPackage
 * @generated
 */
public class RIMDslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RIMDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIMDslSwitch() {
		if (modelPackage == null) {
			modelPackage = RIMDslPackage.eINSTANCE;
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
			case RIMDslPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.DOMAIN_DECLARATION: {
				DomainDeclaration domainDeclaration = (DomainDeclaration)theEObject;
				T result = caseDomainDeclaration(domainDeclaration);
				if (result == null) result = caseRef(domainDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.REF: {
				Ref ref = (Ref)theEObject;
				T result = caseRef(ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.USE: {
				Use use = (Use)theEObject;
				T result = caseUse(use);
				if (result == null) result = caseRef(use);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RESOURCE_INTERACTION_MODEL: {
				ResourceInteractionModel resourceInteractionModel = (ResourceInteractionModel)theEObject;
				T result = caseResourceInteractionModel(resourceInteractionModel);
				if (result == null) result = caseRef(resourceInteractionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.COMMAND_SPEC: {
				CommandSpec commandSpec = (CommandSpec)theEObject;
				T result = caseCommandSpec(commandSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.COMMAND_PROPERTY: {
				CommandProperty commandProperty = (CommandProperty)theEObject;
				T result = caseCommandProperty(commandProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.BASE_PATH: {
				BasePath basePath = (BasePath)theEObject;
				T result = caseBasePath(basePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.IMPL_REF: {
				ImplRef implRef = (ImplRef)theEObject;
				T result = caseImplRef(implRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.METHOD_REF: {
				MethodRef methodRef = (MethodRef)theEObject;
				T result = caseMethodRef(methodRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_REF: {
				TransitionRef transitionRef = (TransitionRef)theEObject;
				T result = caseTransitionRef(transitionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RESOURCE_LOCATOR: {
				ResourceLocator resourceLocator = (ResourceLocator)theEObject;
				T result = caseResourceLocator(resourceLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseTransitionRef(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_FOR_EACH: {
				TransitionForEach transitionForEach = (TransitionForEach)theEObject;
				T result = caseTransitionForEach(transitionForEach);
				if (result == null) result = caseTransitionRef(transitionForEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_EMBEDDED_FOR_EACH: {
				TransitionEmbeddedForEach transitionEmbeddedForEach = (TransitionEmbeddedForEach)theEObject;
				T result = caseTransitionEmbeddedForEach(transitionEmbeddedForEach);
				if (result == null) result = caseTransitionRef(transitionEmbeddedForEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_AUTO: {
				TransitionAuto transitionAuto = (TransitionAuto)theEObject;
				T result = caseTransitionAuto(transitionAuto);
				if (result == null) result = caseTransitionRef(transitionAuto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_REDIRECT: {
				TransitionRedirect transitionRedirect = (TransitionRedirect)theEObject;
				T result = caseTransitionRedirect(transitionRedirect);
				if (result == null) result = caseTransitionRef(transitionRedirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_EMBEDDED: {
				TransitionEmbedded transitionEmbedded = (TransitionEmbedded)theEObject;
				T result = caseTransitionEmbedded(transitionEmbedded);
				if (result == null) result = caseTransitionRef(transitionEmbedded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TRANSITION_SPEC: {
				TransitionSpec transitionSpec = (TransitionSpec)theEObject;
				T result = caseTransitionSpec(transitionSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.FUNCTION_OK: {
				Function_OK function_OK = (Function_OK)theEObject;
				T result = caseFunction_OK(function_OK);
				if (result == null) result = caseFunction(function_OK);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.FUNCTION_NOT_FOUND: {
				Function_NOT_FOUND function_NOT_FOUND = (Function_NOT_FOUND)theEObject;
				T result = caseFunction_NOT_FOUND(function_NOT_FOUND);
				if (result == null) result = caseFunction(function_NOT_FOUND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RELATION_REF: {
				RelationRef relationRef = (RelationRef)theEObject;
				T result = caseRelationRef(relationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RELATION_CONSTANT: {
				RelationConstant relationConstant = (RelationConstant)theEObject;
				T result = caseRelationConstant(relationConstant);
				if (result == null) result = caseRelationRef(relationConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.RESOURCE_COMMAND: {
				ResourceCommand resourceCommand = (ResourceCommand)theEObject;
				T result = caseResourceCommand(resourceCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.URI_LINK: {
				UriLink uriLink = (UriLink)theEObject;
				T result = caseUriLink(uriLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.URI_LINKAGE: {
				UriLinkage uriLinkage = (UriLinkage)theEObject;
				T result = caseUriLinkage(uriLinkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.TITLE: {
				Title title = (Title)theEObject;
				T result = caseTitle(title);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.LINK_ID: {
				LinkId linkId = (LinkId)theEObject;
				T result = caseLinkId(linkId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.SOURCE_FIELD: {
				SourceField sourceField = (SourceField)theEObject;
				T result = caseSourceField(sourceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.MDF_ANNOTATION: {
				MdfAnnotation mdfAnnotation = (MdfAnnotation)theEObject;
				T result = caseMdfAnnotation(mdfAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.OK_FUNCTION: {
				OKFunction okFunction = (OKFunction)theEObject;
				T result = caseOKFunction(okFunction);
				if (result == null) result = caseFunction_OK(okFunction);
				if (result == null) result = caseFunction(okFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RIMDslPackage.NOT_FOUND_FUNCTION: {
				NotFoundFunction notFoundFunction = (NotFoundFunction)theEObject;
				T result = caseNotFoundFunction(notFoundFunction);
				if (result == null) result = caseFunction_NOT_FOUND(notFoundFunction);
				if (result == null) result = caseFunction(notFoundFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDeclaration(DomainDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRef(Ref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUse(Use object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Interaction Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Interaction Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInteractionModel(ResourceInteractionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandSpec(CommandSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandProperty(CommandProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePath(BasePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplRef(ImplRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef(MethodRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionRef(TransitionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceLocator(ResourceLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionForEach(TransitionForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Embedded For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Embedded For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEmbeddedForEach(TransitionEmbeddedForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Auto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Auto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionAuto(TransitionAuto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Redirect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Redirect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionRedirect(TransitionRedirect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Embedded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionEmbedded(TransitionEmbedded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionSpec(TransitionSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function OK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function OK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction_OK(Function_OK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function NOT FOUND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function NOT FOUND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction_NOT_FOUND(Function_NOT_FOUND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationRef(RelationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationConstant(RelationConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCommand(ResourceCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriLink(UriLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriLinkage(UriLinkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkId(LinkId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceField(SourceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mdf Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mdf Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMdfAnnotation(MdfAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OK Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OK Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOKFunction(OKFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Found Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Found Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotFoundFunction(NotFoundFunction object) {
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

} //RIMDslSwitch
