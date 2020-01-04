/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.PathStatement#getPath <em>Path</em>}</li>
 *   <li>{@link yang.PathStatement#getPathunknownstatements <em>Pathunknownstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getPathStatement()
 * @model
 * @generated
 */
public interface PathStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see yang.YangPackage#getPathStatement_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link yang.PathStatement#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Pathunknownstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.UnknownStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathunknownstatements</em>' containment reference list.
	 * @see yang.YangPackage#getPathStatement_Pathunknownstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnknownStatement> getPathunknownstatements();

} // PathStatement
