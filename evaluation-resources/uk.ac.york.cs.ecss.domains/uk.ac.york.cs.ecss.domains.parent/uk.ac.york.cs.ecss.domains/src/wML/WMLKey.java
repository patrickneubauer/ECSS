/**
 */
package wML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wML.WMLKey#getValues <em>Values</em>}</li>
 *   <li>{@link wML.WMLKey#getEol <em>Eol</em>}</li>
 * </ul>
 *
 * @see wML.WMLPackage#getWMLKey()
 * @model
 * @generated
 */
public interface WMLKey extends WMLExpression {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link wML.WMLKeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see wML.WMLPackage#getWMLKey_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<WMLKeyValue> getValues();

	/**
	 * Returns the value of the '<em><b>Eol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eol</em>' attribute list.
	 * @see wML.WMLPackage#getWMLKey_Eol()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEol();

} // WMLKey
