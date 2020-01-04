/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ImportStatement#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link yang.ImportStatement#getImportsubstatements <em>Importsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see yang.YangPackage#getImportStatement_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link yang.ImportStatement#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * Returns the value of the '<em><b>Importsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ImportSubstatements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getImportStatement_Importsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportSubstatements> getImportsubstatements();

} // ImportStatement
