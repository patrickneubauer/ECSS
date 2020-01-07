/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Object List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.PredicateObjectList#getVerb <em>Verb</em>}</li>
 *   <li>{@link xturtle.PredicateObjectList#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getPredicateObjectList()
 * @model
 * @generated
 */
public interface PredicateObjectList extends EObject {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' containment reference.
	 * @see #setVerb(Predicate)
	 * @see xturtle.XturtlePackage#getPredicateObjectList_Verb()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getVerb();

	/**
	 * Sets the value of the '{@link xturtle.PredicateObjectList#getVerb <em>Verb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' containment reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(Predicate value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getPredicateObjectList_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<xturtle.Object> getObjects();

} // PredicateObjectList
