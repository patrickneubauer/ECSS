/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.IncludeStatement#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link yang.IncludeStatement#getIncludesubstatements <em>Includesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getIncludeStatement()
 * @model
 * @generated
 */
public interface IncludeStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see yang.YangPackage#getIncludeStatement_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link yang.IncludeStatement#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Includesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.IncludeSubstatements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getIncludeStatement_Includesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludeSubstatements> getIncludesubstatements();

} // IncludeStatement
