/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.NamespaceStatement#getUri <em>Uri</em>}</li>
 *   <li>{@link yang.NamespaceStatement#getNamespaceunknownstatements <em>Namespaceunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getNamespaceStatement()
 * @model
 * @generated
 */
public interface NamespaceStatement extends ModuleStatement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see yang.YangPackage#getNamespaceStatement_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link yang.NamespaceStatement#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Namespaceunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaceunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getNamespaceStatement_Namespaceunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getNamespaceunknownstatements();

} // NamespaceStatement
