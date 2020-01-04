/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.GroupingStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.GroupingStatement#getGroupingsubstatements <em>Groupingsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getGroupingStatement()
 * @model
 * @generated
 */
public interface GroupingStatement extends ModuleStatement, SubmoduleStatement, RpcSubstatement, InputSubstatement, OutputSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getGroupingStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.GroupingStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Groupingsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.GroupingSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupingsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getGroupingStatement_Groupingsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroupingSubstatement> getGroupingsubstatements();

} // GroupingStatement
