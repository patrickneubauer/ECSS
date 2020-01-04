/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ExtensionStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.ExtensionStatement#getExtensionsubstatements <em>Extensionsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getExtensionStatement()
 * @model
 * @generated
 */
public interface ExtensionStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see yang.YangPackage#getExtensionStatement_Arg()
	 * @model
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link yang.ExtensionStatement#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

	/**
	 * Returns the value of the '<em><b>Extensionsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ExtensionSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getExtensionStatement_Extensionsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionSubstatement> getExtensionsubstatements();

} // ExtensionStatement
