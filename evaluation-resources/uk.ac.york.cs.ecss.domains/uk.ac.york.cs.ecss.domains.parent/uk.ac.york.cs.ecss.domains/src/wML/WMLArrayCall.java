/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLArrayCall#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLArrayCall()
 * @model
 * @generated
 */
public interface WMLArrayCall extends WMLKeyValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLArrayCall_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLValue> getValue();

} // WMLArrayCall
