/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslProperty#getDatabaseColumn <em>Database Column</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslProperty()
 * @model
 * @generated
 */
public interface DslProperty extends DslAnyProperty {
	/**
	 * Returns the value of the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Column</em>' attribute.
	 * @see #setDatabaseColumn(String)
	 * @see sculptordsl.SculptordslPackage#getDslProperty_DatabaseColumn()
	 * @model
	 * @generated
	 */
	String getDatabaseColumn();

	/**
	 * Sets the value of the '{@link sculptordsl.DslProperty#getDatabaseColumn <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Column</em>' attribute.
	 * @see #getDatabaseColumn()
	 * @generated
	 */
	void setDatabaseColumn(String value);

} // DslProperty
