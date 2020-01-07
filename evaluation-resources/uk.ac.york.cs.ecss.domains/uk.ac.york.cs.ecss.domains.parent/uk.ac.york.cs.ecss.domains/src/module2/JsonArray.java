/**
 */
package module2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link module2.JsonArray#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see module2.Module2Package#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link module2.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see module2.Module2Package#getJsonArray_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

} // JsonArray
