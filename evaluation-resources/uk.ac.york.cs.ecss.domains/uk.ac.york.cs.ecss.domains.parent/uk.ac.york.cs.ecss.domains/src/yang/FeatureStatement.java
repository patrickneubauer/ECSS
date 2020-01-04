/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.FeatureStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.FeatureStatement#getFeaturesubstatements <em>Featuresubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getFeatureStatement()
 * @model
 * @generated
 */
public interface FeatureStatement extends ModuleStatement, SubmoduleStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getFeatureStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.FeatureStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Featuresubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.FeatureSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuresubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getFeatureStatement_Featuresubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureSubstatement> getFeaturesubstatements();

} // FeatureStatement
