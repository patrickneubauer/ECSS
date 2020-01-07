/**
 */
package rIMDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.Event#getName <em>Name</em>}</li>
 *   <li>{@link rIMDsl.Event#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link rIMDsl.Event#getHttpMethod <em>Http Method</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rIMDsl.RIMDslPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rIMDsl.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link rIMDsl.MdfAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see rIMDsl.RIMDslPackage#getEvent_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MdfAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see #setHttpMethod(String)
	 * @see rIMDsl.RIMDslPackage#getEvent_HttpMethod()
	 * @model
	 * @generated
	 */
	String getHttpMethod();

	/**
	 * Sets the value of the '{@link rIMDsl.Event#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(String value);

} // Event
