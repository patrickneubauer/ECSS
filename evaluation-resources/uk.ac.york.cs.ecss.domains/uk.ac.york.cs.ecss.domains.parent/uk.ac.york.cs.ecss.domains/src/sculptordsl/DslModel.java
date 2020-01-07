/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslModel#getImports <em>Imports</em>}</li>
 *   <li>{@link sculptordsl.DslModel#getApp <em>App</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslModel()
 * @model
 * @generated
 */
public interface DslModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslImport> getImports();

	/**
	 * Returns the value of the '<em><b>App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' containment reference.
	 * @see #setApp(DslApplication)
	 * @see sculptordsl.SculptordslPackage#getDslModel_App()
	 * @model containment="true"
	 * @generated
	 */
	DslApplication getApp();

	/**
	 * Sets the value of the '{@link sculptordsl.DslModel#getApp <em>App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' containment reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(DslApplication value);

} // DslModel
