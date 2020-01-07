/**
 */
package module2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link module2.JsonObject#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see module2.Module2Package#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends Value {
	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link module2.Pair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see module2.Module2Package#getJsonObject_Pairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair> getPairs();

} // JsonObject
