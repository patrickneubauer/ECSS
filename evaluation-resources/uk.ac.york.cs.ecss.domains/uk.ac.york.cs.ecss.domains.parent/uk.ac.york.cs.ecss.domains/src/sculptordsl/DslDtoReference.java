/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Dto Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDtoReference#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.DslDtoReference#isValid <em>Valid</em>}</li>
 *   <li>{@link sculptordsl.DslDtoReference#getValidMessage <em>Valid Message</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDtoReference()
 * @model
 * @generated
 */
public interface DslDtoReference extends DslDtoProperty {
	/**
	 * Returns the value of the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Type</em>' reference.
	 * @see #setDomainObjectType(DslSimpleDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslDtoReference_DomainObjectType()
	 * @model
	 * @generated
	 */
	DslSimpleDomainObject getDomainObjectType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDtoReference#getDomainObjectType <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Type</em>' reference.
	 * @see #getDomainObjectType()
	 * @generated
	 */
	void setDomainObjectType(DslSimpleDomainObject value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDtoReference_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDtoReference#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Valid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Message</em>' attribute.
	 * @see #setValidMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslDtoReference_ValidMessage()
	 * @model
	 * @generated
	 */
	String getValidMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDtoReference#getValidMessage <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Message</em>' attribute.
	 * @see #getValidMessage()
	 * @generated
	 */
	void setValidMessage(String value);

} // DslDtoReference
