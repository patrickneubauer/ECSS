/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.PatternStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.PatternStatement#getPatternsubstatements <em>Patternsubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getPatternStatement()
 * @model
 * @generated
 */
public interface PatternStatement extends TypeSubStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see yang.YangPackage#getPatternStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link yang.PatternStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Patternsubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.MultipleSubstatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patternsubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getPatternStatement_Patternsubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleSubstatement> getPatternsubstatements();

} // PatternStatement
