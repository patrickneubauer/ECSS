/**
 */
package antlr4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.Import#getAlias <em>Alias</em>}</li>
 *   <li>{@link antlr4.Import#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see antlr4.Antlr4Package#getImport_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link antlr4.Import#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' reference.
	 * @see #setImportURI(Grammar)
	 * @see antlr4.Antlr4Package#getImport_ImportURI()
	 * @model
	 * @generated
	 */
	Grammar getImportURI();

	/**
	 * Sets the value of the '{@link antlr4.Import#getImportURI <em>Import URI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' reference.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(Grammar value);

} // Import
