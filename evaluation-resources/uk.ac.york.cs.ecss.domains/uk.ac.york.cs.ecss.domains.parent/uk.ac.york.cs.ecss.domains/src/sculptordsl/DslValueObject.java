/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslValueObject#getExtends <em>Extends</em>}</li>
 *   <li>{@link sculptordsl.DslValueObject#isNotOptimisticLocking <em>Not Optimistic Locking</em>}</li>
 *   <li>{@link sculptordsl.DslValueObject#isNotImmutable <em>Not Immutable</em>}</li>
 *   <li>{@link sculptordsl.DslValueObject#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link sculptordsl.DslValueObject#isNotPersistent <em>Not Persistent</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslValueObject()
 * @model
 * @generated
 */
public interface DslValueObject extends DslDomainObject {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DslValueObject)
	 * @see sculptordsl.SculptordslPackage#getDslValueObject_Extends()
	 * @model
	 * @generated
	 */
	DslValueObject getExtends();

	/**
	 * Sets the value of the '{@link sculptordsl.DslValueObject#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DslValueObject value);

	/**
	 * Returns the value of the '<em><b>Not Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Optimistic Locking</em>' attribute.
	 * @see #setNotOptimisticLocking(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslValueObject_NotOptimisticLocking()
	 * @model
	 * @generated
	 */
	boolean isNotOptimisticLocking();

	/**
	 * Sets the value of the '{@link sculptordsl.DslValueObject#isNotOptimisticLocking <em>Not Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Optimistic Locking</em>' attribute.
	 * @see #isNotOptimisticLocking()
	 * @generated
	 */
	void setNotOptimisticLocking(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Immutable</em>' attribute.
	 * @see #setNotImmutable(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslValueObject_NotImmutable()
	 * @model
	 * @generated
	 */
	boolean isNotImmutable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslValueObject#isNotImmutable <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Immutable</em>' attribute.
	 * @see #isNotImmutable()
	 * @generated
	 */
	void setNotImmutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslValueObject_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link sculptordsl.DslValueObject#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Persistent</em>' attribute.
	 * @see #setNotPersistent(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslValueObject_NotPersistent()
	 * @model
	 * @generated
	 */
	boolean isNotPersistent();

	/**
	 * Sets the value of the '{@link sculptordsl.DslValueObject#isNotPersistent <em>Not Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Persistent</em>' attribute.
	 * @see #isNotPersistent()
	 * @generated
	 */
	void setNotPersistent(boolean value);

} // DslValueObject
