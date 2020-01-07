/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslComplexType#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link sculptordsl.DslComplexType#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.DslComplexType#getType <em>Type</em>}</li>
 *   <li>{@link sculptordsl.DslComplexType#getMapCollectionType <em>Map Collection Type</em>}</li>
 *   <li>{@link sculptordsl.DslComplexType#getMapKeyType <em>Map Key Type</em>}</li>
 *   <li>{@link sculptordsl.DslComplexType#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslComplexType()
 * @model
 * @generated
 */
public interface DslComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslCollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see sculptordsl.DslCollectionType
	 * @see #setCollectionType(DslCollectionType)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_CollectionType()
	 * @model
	 * @generated
	 */
	DslCollectionType getCollectionType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see sculptordsl.DslCollectionType
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(DslCollectionType value);

	/**
	 * Returns the value of the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Type</em>' reference.
	 * @see #setDomainObjectType(DslSimpleDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_DomainObjectType()
	 * @model
	 * @generated
	 */
	DslSimpleDomainObject getDomainObjectType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getDomainObjectType <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Type</em>' reference.
	 * @see #getDomainObjectType()
	 * @generated
	 */
	void setDomainObjectType(DslSimpleDomainObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Map Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Collection Type</em>' attribute.
	 * @see #setMapCollectionType(String)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_MapCollectionType()
	 * @model
	 * @generated
	 */
	String getMapCollectionType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getMapCollectionType <em>Map Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Collection Type</em>' attribute.
	 * @see #getMapCollectionType()
	 * @generated
	 */
	void setMapCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Type</em>' attribute.
	 * @see #setMapKeyType(String)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_MapKeyType()
	 * @model
	 * @generated
	 */
	String getMapKeyType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getMapKeyType <em>Map Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Type</em>' attribute.
	 * @see #getMapKeyType()
	 * @generated
	 */
	void setMapKeyType(String value);

	/**
	 * Returns the value of the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Domain Object Type</em>' reference.
	 * @see #setMapKeyDomainObjectType(DslSimpleDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslComplexType_MapKeyDomainObjectType()
	 * @model
	 * @generated
	 */
	DslSimpleDomainObject getMapKeyDomainObjectType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslComplexType#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Domain Object Type</em>' reference.
	 * @see #getMapKeyDomainObjectType()
	 * @generated
	 */
	void setMapKeyDomainObjectType(DslSimpleDomainObject value);

} // DslComplexType
