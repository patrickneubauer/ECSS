/**
 */
package yang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.BuiltInType#getBtype <em>Btype</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getBuiltInType()
 * @model
 * @generated
 */
public interface BuiltInType extends EObject {
	/**
	 * Returns the value of the '<em><b>Btype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btype</em>' attribute.
	 * @see #setBtype(String)
	 * @see yang.YangPackage#getBuiltInType_Btype()
	 * @model
	 * @generated
	 */
	String getBtype();

	/**
	 * Sets the value of the '{@link yang.BuiltInType#getBtype <em>Btype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btype</em>' attribute.
	 * @see #getBtype()
	 * @generated
	 */
	void setBtype(String value);

} // BuiltInType
