/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.Triples#getSubject <em>Subject</em>}</li>
 *   <li>{@link xturtle.Triples#getPredObjs <em>Pred Objs</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getTriples()
 * @model
 * @generated
 */
public interface Triples extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Subject)
	 * @see xturtle.XturtlePackage#getTriples_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link xturtle.Triples#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

	/**
	 * Returns the value of the '<em><b>Pred Objs</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.PredicateObjectList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Objs</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getTriples_PredObjs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateObjectList> getPredObjs();

} // Triples
