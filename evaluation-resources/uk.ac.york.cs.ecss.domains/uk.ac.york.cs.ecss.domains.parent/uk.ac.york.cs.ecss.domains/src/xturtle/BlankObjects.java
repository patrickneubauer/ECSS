/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blank Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.BlankObjects#getPredObjs <em>Pred Objs</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getBlankObjects()
 * @model
 * @generated
 */
public interface BlankObjects extends Blank {
	/**
	 * Returns the value of the '<em><b>Pred Objs</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.PredicateObjectList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Objs</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getBlankObjects_PredObjs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PredicateObjectList> getPredObjs();

} // BlankObjects
