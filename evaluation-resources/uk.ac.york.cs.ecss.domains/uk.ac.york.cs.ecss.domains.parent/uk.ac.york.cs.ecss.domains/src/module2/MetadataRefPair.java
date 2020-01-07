/**
 */
package module2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Ref Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link module2.MetadataRefPair#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see module2.Module2Package#getMetadataRefPair()
 * @model
 * @generated
 */
public interface MetadataRefPair extends Pair {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(JsonMetadata)
	 * @see module2.Module2Package#getMetadataRefPair_Ref()
	 * @model
	 * @generated
	 */
	JsonMetadata getRef();

	/**
	 * Sets the value of the '{@link module2.MetadataRefPair#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(JsonMetadata value);

} // MetadataRefPair
