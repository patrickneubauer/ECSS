/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslParameter#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link sculptordsl.DslParameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslParameter()
 * @model
 * @generated
 */
public interface DslParameter extends DslDomainObjectTypedElement {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslParameter_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslParameter#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(DslComplexType)
	 * @see sculptordsl.SculptordslPackage#getDslParameter_ParameterType()
	 * @model containment="true"
	 * @generated
	 */
	DslComplexType getParameterType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslParameter#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(DslComplexType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DslParameter
