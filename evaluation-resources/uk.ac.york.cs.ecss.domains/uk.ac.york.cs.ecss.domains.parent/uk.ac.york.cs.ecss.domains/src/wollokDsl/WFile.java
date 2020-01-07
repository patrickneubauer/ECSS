/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WFile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WFile#getImports <em>Imports</em>}</li>
 *   <li>{@link wollokDsl.WFile#getElements <em>Elements</em>}</li>
 *   <li>{@link wollokDsl.WFile#getMain <em>Main</em>}</li>
 *   <li>{@link wollokDsl.WFile#getTests <em>Tests</em>}</li>
 *   <li>{@link wollokDsl.WFile#getSuites <em>Suites</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWFile()
 * @model
 * @generated
 */
public interface WFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWFile_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WLibraryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWFile_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WLibraryElement> getElements();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(WProgram)
	 * @see wollokDsl.WollokDslPackage#getWFile_Main()
	 * @model containment="true"
	 * @generated
	 */
	WProgram getMain();

	/**
	 * Sets the value of the '{@link wollokDsl.WFile#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(WProgram value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWFile_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<WTest> getTests();

	/**
	 * Returns the value of the '<em><b>Suites</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WSuite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suites</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWFile_Suites()
	 * @model containment="true"
	 * @generated
	 */
	EList<WSuite> getSuites();

} // WFile
