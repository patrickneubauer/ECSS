/**
 */
package rIMDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uri Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.UriLink#getTemplateProperty <em>Template Property</em>}</li>
 *   <li>{@link rIMDsl.UriLink#getEntityProperty <em>Entity Property</em>}</li>
 * </ul>
 *
 * @see rIMDsl.RIMDslPackage#getUriLink()
 * @model
 * @generated
 */
public interface UriLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Property</em>' attribute.
	 * @see #setTemplateProperty(String)
	 * @see rIMDsl.RIMDslPackage#getUriLink_TemplateProperty()
	 * @model
	 * @generated
	 */
	String getTemplateProperty();

	/**
	 * Sets the value of the '{@link rIMDsl.UriLink#getTemplateProperty <em>Template Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Property</em>' attribute.
	 * @see #getTemplateProperty()
	 * @generated
	 */
	void setTemplateProperty(String value);

	/**
	 * Returns the value of the '<em><b>Entity Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Property</em>' containment reference.
	 * @see #setEntityProperty(UriLinkage)
	 * @see rIMDsl.RIMDslPackage#getUriLink_EntityProperty()
	 * @model containment="true"
	 * @generated
	 */
	UriLinkage getEntityProperty();

	/**
	 * Sets the value of the '{@link rIMDsl.UriLink#getEntityProperty <em>Entity Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Property</em>' containment reference.
	 * @see #getEntityProperty()
	 * @generated
	 */
	void setEntityProperty(UriLinkage value);

} // UriLink
