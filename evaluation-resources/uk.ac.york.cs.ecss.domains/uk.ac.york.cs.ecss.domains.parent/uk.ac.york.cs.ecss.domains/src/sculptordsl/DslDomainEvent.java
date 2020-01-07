/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Domain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDomainEvent#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDomainEvent()
 * @model
 * @generated
 */
public interface DslDomainEvent extends DslEvent {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DslDomainEvent)
	 * @see sculptordsl.SculptordslPackage#getDslDomainEvent_Extends()
	 * @model
	 * @generated
	 */
	DslDomainEvent getExtends();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainEvent#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DslDomainEvent value);

} // DslDomainEvent
