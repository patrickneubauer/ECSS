/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Any Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslAnyProperty#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isKey <em>Key</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isNotChangeable <em>Not Changeable</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isRequired <em>Required</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isNullable <em>Nullable</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getNullableMessage <em>Nullable Message</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isNotEmpty <em>Not Empty</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getNotEmptyMessage <em>Not Empty Message</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getSize <em>Size</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.DslAnyProperty#isTransient <em>Transient</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslAnyProperty()
 * @model
 * @generated
 */
public interface DslAnyProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #setVisibility(DslVisibility)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Visibility()
	 * @model
	 * @generated
	 */
	DslVisibility getVisibility();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(DslVisibility value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslCollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see sculptordsl.DslCollectionType
	 * @see #setCollectionType(DslCollectionType)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_CollectionType()
	 * @model
	 * @generated
	 */
	DslCollectionType getCollectionType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see sculptordsl.DslCollectionType
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(DslCollectionType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Changeable</em>' attribute.
	 * @see #setNotChangeable(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_NotChangeable()
	 * @model
	 * @generated
	 */
	boolean isNotChangeable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isNotChangeable <em>Not Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Changeable</em>' attribute.
	 * @see #isNotChangeable()
	 * @generated
	 */
	void setNotChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable Message</em>' attribute.
	 * @see #setNullableMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_NullableMessage()
	 * @model
	 * @generated
	 */
	String getNullableMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getNullableMessage <em>Nullable Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable Message</em>' attribute.
	 * @see #getNullableMessage()
	 * @generated
	 */
	void setNullableMessage(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Empty</em>' attribute.
	 * @see #setNotEmpty(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_NotEmpty()
	 * @model
	 * @generated
	 */
	boolean isNotEmpty();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isNotEmpty <em>Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Empty</em>' attribute.
	 * @see #isNotEmpty()
	 * @generated
	 */
	void setNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Empty Message</em>' attribute.
	 * @see #setNotEmptyMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_NotEmptyMessage()
	 * @model
	 * @generated
	 */
	String getNotEmptyMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getNotEmptyMessage <em>Not Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Empty Message</em>' attribute.
	 * @see #getNotEmptyMessage()
	 * @generated
	 */
	void setNotEmptyMessage(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Validate()
	 * @model
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslAnyProperty_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link sculptordsl.DslAnyProperty#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

} // DslAnyProperty
