/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Publish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslPublish#getEventType <em>Event Type</em>}</li>
 *   <li>{@link sculptordsl.DslPublish#getTopic <em>Topic</em>}</li>
 *   <li>{@link sculptordsl.DslPublish#getEventBus <em>Event Bus</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslPublish()
 * @model
 * @generated
 */
public interface DslPublish extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(DslEvent)
	 * @see sculptordsl.SculptordslPackage#getDslPublish_EventType()
	 * @model
	 * @generated
	 */
	DslEvent getEventType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslPublish#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(DslEvent value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see sculptordsl.SculptordslPackage#getDslPublish_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link sculptordsl.DslPublish#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Bus</em>' attribute.
	 * @see #setEventBus(String)
	 * @see sculptordsl.SculptordslPackage#getDslPublish_EventBus()
	 * @model
	 * @generated
	 */
	String getEventBus();

	/**
	 * Sets the value of the '{@link sculptordsl.DslPublish#getEventBus <em>Event Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Bus</em>' attribute.
	 * @see #getEventBus()
	 * @generated
	 */
	void setEventBus(String value);

} // DslPublish
