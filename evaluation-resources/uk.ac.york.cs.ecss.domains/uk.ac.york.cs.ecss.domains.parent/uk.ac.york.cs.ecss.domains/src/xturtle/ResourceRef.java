/**
 */
package xturtle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.ResourceRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getResourceRef()
 * @model
 * @generated
 */
public interface ResourceRef extends xturtle.Object, Predicate {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Resource)
	 * @see xturtle.XturtlePackage#getResourceRef_Ref()
	 * @model
	 * @generated
	 */
	Resource getRef();

	/**
	 * Sets the value of the '{@link xturtle.ResourceRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Resource value);

} // ResourceRef
