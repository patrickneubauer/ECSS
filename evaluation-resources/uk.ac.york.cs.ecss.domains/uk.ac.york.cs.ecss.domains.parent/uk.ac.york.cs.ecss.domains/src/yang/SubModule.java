/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.SubModule#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getSubModule()
 * @model
 * @generated
 */
public interface SubModule extends YangFile {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.SubmoduleStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see yang.YangPackage#getSubModule_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmoduleStatement> getStatements();

} // SubModule
