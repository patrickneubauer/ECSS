/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.ContainerStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.ContainerStatement#getContainersubstatements <em>Containersubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getContainerStatement()
 * @model
 * @generated
 */
public interface ContainerStatement extends DatadefStatement, ChoiceSubstatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getContainerStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.ContainerStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Containersubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.ContainerSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containersubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getContainerStatement_Containersubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerSubstatement> getContainersubstatements();

} // ContainerStatement
