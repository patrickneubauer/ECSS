/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.Module#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends YangFile {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ModuleStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see yang.YangPackage#getModule_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleStatement> getStatements();

} // Module
