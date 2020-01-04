/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.PositionStatement#getIntarg <em>Intarg</em>}</li>
 *   <li>{@link yang.PositionStatement#getPositionunknownstatements <em>Positionunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getPositionStatement()
 * @model
 * @generated
 */
public interface PositionStatement extends BitSubstatement {
	/**
	 * Returns the value of the '<em><b>Intarg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intarg</em>' attribute.
	 * @see #setIntarg(String)
	 * @see yang.YangPackage#getPositionStatement_Intarg()
	 * @model
	 * @generated
	 */
	String getIntarg();

	/**
	 * Sets the value of the '{@link yang.PositionStatement#getIntarg <em>Intarg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intarg</em>' attribute.
	 * @see #getIntarg()
	 * @generated
	 */
	void setIntarg(String value);

	/**
	 * Returns the value of the '<em><b>Positionunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getPositionStatement_Positionunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getPositionunknownstatements();

} // PositionStatement
