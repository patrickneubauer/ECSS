/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Substatements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.UnknownSubstatements#getPref <em>Pref</em>}</li>
 *   <li>{@link yang.UnknownSubstatements#getNamestat <em>Namestat</em>}</li>
 *   <li>{@link yang.UnknownSubstatements#getArgument <em>Argument</em>}</li>
 *   <li>{@link yang.UnknownSubstatements#getUnknownsubstatements <em>Unknownsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getUnknownSubstatements()
 * @model
 * @generated
 */
public interface UnknownSubstatements extends EObject {
	/**
	 * Returns the value of the '<em><b>Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref</em>' attribute.
	 * @see #setPref(String)
	 * @see yang.YangPackage#getUnknownSubstatements_Pref()
	 * @model
	 * @generated
	 */
	String getPref();

	/**
	 * Sets the value of the '{@link yang.UnknownSubstatements#getPref <em>Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref</em>' attribute.
	 * @see #getPref()
	 * @generated
	 */
	void setPref(String value);

	/**
	 * Returns the value of the '<em><b>Namestat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namestat</em>' attribute.
	 * @see #setNamestat(String)
	 * @see yang.YangPackage#getUnknownSubstatements_Namestat()
	 * @model
	 * @generated
	 */
	String getNamestat();

	/**
	 * Sets the value of the '{@link yang.UnknownSubstatements#getNamestat <em>Namestat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namestat</em>' attribute.
	 * @see #getNamestat()
	 * @generated
	 */
	void setNamestat(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' attribute.
	 * @see #setArgument(String)
	 * @see yang.YangPackage#getUnknownSubstatements_Argument()
	 * @model
	 * @generated
	 */
	String getArgument();

	/**
	 * Sets the value of the '{@link yang.UnknownSubstatements#getArgument <em>Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' attribute.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(String value);

	/**
	 * Returns the value of the '<em><b>Unknownsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownSubstatements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknownsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getUnknownSubstatements_Unknownsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownSubstatements> getUnknownsubstatements();

} // UnknownSubstatements
