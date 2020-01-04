/**
 */
package yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yang.TypeStatement#getType <em>Type</em>}</li>
 *   <li>{@link yang.TypeStatement#getPre <em>Pre</em>}</li>
 *   <li>{@link yang.TypeStatement#getImporttype <em>Importtype</em>}</li>
 *   <li>{@link yang.TypeStatement#getTypesubstatements <em>Typesubstatements</em>}</li>
 * </ul>
 *
 * @see yang.YangPackage#getTypeStatement()
 * @model
 * @generated
 */
public interface TypeStatement extends LeafSubstatement, LeafListSubstatement, TypedefSubstatement, TypeSubStatement, ImportSubstatements, IncludeSubstatements {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(BuiltInType)
	 * @see yang.YangPackage#getTypeStatement_Type()
	 * @model containment="true"
	 * @generated
	 */
	BuiltInType getType();

	/**
	 * Sets the value of the '{@link yang.TypeStatement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BuiltInType value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' attribute.
	 * @see #setPre(String)
	 * @see yang.YangPackage#getTypeStatement_Pre()
	 * @model
	 * @generated
	 */
	String getPre();

	/**
	 * Sets the value of the '{@link yang.TypeStatement#getPre <em>Pre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' attribute.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(String value);

	/**
	 * Returns the value of the '<em><b>Importtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importtype</em>' reference.
	 * @see #setImporttype(TypedefStatement)
	 * @see yang.YangPackage#getTypeStatement_Importtype()
	 * @model
	 * @generated
	 */
	TypedefStatement getImporttype();

	/**
	 * Sets the value of the '{@link yang.TypeStatement#getImporttype <em>Importtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importtype</em>' reference.
	 * @see #getImporttype()
	 * @generated
	 */
	void setImporttype(TypedefStatement value);

	/**
	 * Returns the value of the '<em><b>Typesubstatements</b></em>' containment reference list.
	 * The list contents are of type {@link yang.TypeSubStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typesubstatements</em>' containment reference list.
	 * @see yang.YangPackage#getTypeStatement_Typesubstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSubStatement> getTypesubstatements();

} // TypeStatement
