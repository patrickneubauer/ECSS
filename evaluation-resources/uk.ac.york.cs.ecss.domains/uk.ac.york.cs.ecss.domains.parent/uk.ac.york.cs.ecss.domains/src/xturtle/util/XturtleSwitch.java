/**
 */
package xturtle.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xturtle.Base;
import xturtle.Blank;
import xturtle.BlankCollection;
import xturtle.BlankObjects;
import xturtle.BooleanLiteral;
import xturtle.Directive;
import xturtle.DirectiveBlock;
import xturtle.Directives;
import xturtle.Literal;
import xturtle.NumberLiteral;
import xturtle.Predicate;
import xturtle.PredicateObjectList;
import xturtle.PrefixId;
import xturtle.QNameDef;
import xturtle.QNameRef;
import xturtle.Resource;
import xturtle.ResourceRef;
import xturtle.StringLiteral;
import xturtle.Subject;
import xturtle.Triples;
import xturtle.TypePredicate;
import xturtle.UriDef;
import xturtle.UriRef;
import xturtle.XturtlePackage;

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
 * @see xturtle.XturtlePackage
 * @generated
 */
public class XturtleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XturtlePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XturtleSwitch() {
		if (modelPackage == null) {
			modelPackage = XturtlePackage.eINSTANCE;
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
			case XturtlePackage.DIRECTIVE_BLOCK: {
				DirectiveBlock directiveBlock = (DirectiveBlock)theEObject;
				T result = caseDirectiveBlock(directiveBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.DIRECTIVES: {
				Directives directives = (Directives)theEObject;
				T result = caseDirectives(directives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.DIRECTIVE: {
				Directive directive = (Directive)theEObject;
				T result = caseDirective(directive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.PREFIX_ID: {
				PrefixId prefixId = (PrefixId)theEObject;
				T result = casePrefixId(prefixId);
				if (result == null) result = caseDirective(prefixId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = caseDirective(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.TRIPLES: {
				Triples triples = (Triples)theEObject;
				T result = caseTriples(triples);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.PREDICATE_OBJECT_LIST: {
				PredicateObjectList predicateObjectList = (PredicateObjectList)theEObject;
				T result = casePredicateObjectList(predicateObjectList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.SUBJECT: {
				Subject subject = (Subject)theEObject;
				T result = caseSubject(subject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.OBJECT: {
				xturtle.Object object = (xturtle.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseSubject(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.RESOURCE_REF: {
				ResourceRef resourceRef = (ResourceRef)theEObject;
				T result = caseResourceRef(resourceRef);
				if (result == null) result = caseObject(resourceRef);
				if (result == null) result = casePredicate(resourceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.BLANK: {
				Blank blank = (Blank)theEObject;
				T result = caseBlank(blank);
				if (result == null) result = caseSubject(blank);
				if (result == null) result = caseObject(blank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.BLANK_OBJECTS: {
				BlankObjects blankObjects = (BlankObjects)theEObject;
				T result = caseBlankObjects(blankObjects);
				if (result == null) result = caseBlank(blankObjects);
				if (result == null) result = caseSubject(blankObjects);
				if (result == null) result = caseObject(blankObjects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.BLANK_COLLECTION: {
				BlankCollection blankCollection = (BlankCollection)theEObject;
				T result = caseBlankCollection(blankCollection);
				if (result == null) result = caseBlank(blankCollection);
				if (result == null) result = caseSubject(blankCollection);
				if (result == null) result = caseObject(blankCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.QNAME_DEF: {
				QNameDef qNameDef = (QNameDef)theEObject;
				T result = caseQNameDef(qNameDef);
				if (result == null) result = caseResource(qNameDef);
				if (result == null) result = caseSubject(qNameDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.QNAME_REF: {
				QNameRef qNameRef = (QNameRef)theEObject;
				T result = caseQNameRef(qNameRef);
				if (result == null) result = caseResourceRef(qNameRef);
				if (result == null) result = caseObject(qNameRef);
				if (result == null) result = casePredicate(qNameRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.URI_DEF: {
				UriDef uriDef = (UriDef)theEObject;
				T result = caseUriDef(uriDef);
				if (result == null) result = caseResource(uriDef);
				if (result == null) result = caseSubject(uriDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.URI_REF: {
				UriRef uriRef = (UriRef)theEObject;
				T result = caseUriRef(uriRef);
				if (result == null) result = caseResourceRef(uriRef);
				if (result == null) result = caseObject(uriRef);
				if (result == null) result = casePredicate(uriRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseObject(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.NUMBER_LITERAL: {
				NumberLiteral numberLiteral = (NumberLiteral)theEObject;
				T result = caseNumberLiteral(numberLiteral);
				if (result == null) result = caseLiteral(numberLiteral);
				if (result == null) result = caseObject(numberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseObject(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseObject(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XturtlePackage.TYPE_PREDICATE: {
				TypePredicate typePredicate = (TypePredicate)theEObject;
				T result = caseTypePredicate(typePredicate);
				if (result == null) result = casePredicate(typePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directive Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directive Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectiveBlock(DirectiveBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectives(Directives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirective(Directive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixId(PrefixId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triples</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triples</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriples(Triples object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Object List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateObjectList(PredicateObjectList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(xturtle.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRef(ResourceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlank(Blank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Objects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Objects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankObjects(BlankObjects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankCollection(BlankCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QName Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QName Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQNameDef(QNameDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QName Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QName Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQNameRef(QNameRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriDef(UriDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriRef(UriRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePredicate(TypePredicate object) {
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

} //XturtleSwitch
