/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslEntity#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.DslEntity#isNotOptimisticLocking <em>Not Optimistic Locking</em>}</li>
 *   <li>{@link sculptordsl.DslEntity#isNotAuditable <em>Not Auditable</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslEntity()
 * @model
 * @generated
 */
public interface DslEntity extends DslDomainObject {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DslEntity)
	 * @see sculptordsl.SculptordslPackage#getDslEntity_Extends()
	 * @model
	 * @generated
	 */
	DslEntity getExtends();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEntity#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DslEntity value);

	/**
	 * Returns the value of the '<em><b>Not Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Optimistic Locking</em>' attribute.
	 * @see #setNotOptimisticLocking(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslEntity_NotOptimisticLocking()
	 * @model
	 * @generated
	 */
	boolean isNotOptimisticLocking();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEntity#isNotOptimisticLocking <em>Not Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Optimistic Locking</em>' attribute.
	 * @see #isNotOptimisticLocking()
	 * @generated
	 */
	void setNotOptimisticLocking(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Auditable</em>' attribute.
	 * @see #setNotAuditable(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslEntity_NotAuditable()
	 * @model
	 * @generated
	 */
	boolean isNotAuditable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslEntity#isNotAuditable <em>Not Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Auditable</em>' attribute.
	 * @see #isNotAuditable()
	 * @generated
	 */
	void setNotAuditable(boolean value);

} // DslEntity
