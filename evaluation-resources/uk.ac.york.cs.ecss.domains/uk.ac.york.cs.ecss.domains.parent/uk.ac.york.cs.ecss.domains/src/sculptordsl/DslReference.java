/**
 */
package sculptordsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslReference#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getCascade <em>Cascade</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getFetch <em>Fetch</em>}</li>
 *   <li>{@link sculptordsl.DslReference#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.DslReference#isInverse <em>Inverse</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getDatabaseJoinTable <em>Database Join Table</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getDatabaseJoinColumn <em>Database Join Column</em>}</li>
 *   <li>{@link sculptordsl.DslReference#isValid <em>Valid</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getValidMessage <em>Valid Message</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link sculptordsl.DslReference#isOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getOrderColumnName <em>Order Column Name</em>}</li>
 *   <li>{@link sculptordsl.DslReference#getOppositeHolder <em>Opposite Holder</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslReference()
 * @model
 * @generated
 */
public interface DslReference extends DslProperty {
	/**
	 * Returns the value of the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Type</em>' reference.
	 * @see #setDomainObjectType(DslSimpleDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslReference_DomainObjectType()
	 * @model
	 * @generated
	 */
	DslSimpleDomainObject getDomainObjectType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getDomainObjectType <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Type</em>' reference.
	 * @see #getDomainObjectType()
	 * @generated
	 */
	void setDomainObjectType(DslSimpleDomainObject value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see #setCascade(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_Cascade()
	 * @model
	 * @generated
	 */
	String getCascade();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(String value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see #setFetch(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_Fetch()
	 * @model
	 * @generated
	 */
	String getFetch();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(String value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslReference_Cache()
	 * @model
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' attribute.
	 * @see #setInverse(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslReference_Inverse()
	 * @model
	 * @generated
	 */
	boolean isInverse();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#isInverse <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' attribute.
	 * @see #isInverse()
	 * @generated
	 */
	void setInverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Database Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Join Table</em>' attribute.
	 * @see #setDatabaseJoinTable(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_DatabaseJoinTable()
	 * @model
	 * @generated
	 */
	String getDatabaseJoinTable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getDatabaseJoinTable <em>Database Join Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Join Table</em>' attribute.
	 * @see #getDatabaseJoinTable()
	 * @generated
	 */
	void setDatabaseJoinTable(String value);

	/**
	 * Returns the value of the '<em><b>Database Join Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Join Column</em>' attribute.
	 * @see #setDatabaseJoinColumn(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_DatabaseJoinColumn()
	 * @model
	 * @generated
	 */
	String getDatabaseJoinColumn();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getDatabaseJoinColumn <em>Database Join Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Join Column</em>' attribute.
	 * @see #getDatabaseJoinColumn()
	 * @generated
	 */
	void setDatabaseJoinColumn(String value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslReference_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Valid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Message</em>' attribute.
	 * @see #setValidMessage(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_ValidMessage()
	 * @model
	 * @generated
	 */
	String getValidMessage();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getValidMessage <em>Valid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Message</em>' attribute.
	 * @see #getValidMessage()
	 * @generated
	 */
	void setValidMessage(String value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see #setOrderBy(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_OrderBy()
	 * @model
	 * @generated
	 */
	String getOrderBy();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(String value);

	/**
	 * Returns the value of the '<em><b>Order Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Column</em>' attribute.
	 * @see #setOrderColumn(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslReference_OrderColumn()
	 * @model
	 * @generated
	 */
	boolean isOrderColumn();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#isOrderColumn <em>Order Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Column</em>' attribute.
	 * @see #isOrderColumn()
	 * @generated
	 */
	void setOrderColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Column Name</em>' attribute.
	 * @see #setOrderColumnName(String)
	 * @see sculptordsl.SculptordslPackage#getDslReference_OrderColumnName()
	 * @model
	 * @generated
	 */
	String getOrderColumnName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getOrderColumnName <em>Order Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Column Name</em>' attribute.
	 * @see #getOrderColumnName()
	 * @generated
	 */
	void setOrderColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Opposite Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Holder</em>' containment reference.
	 * @see #setOppositeHolder(DslOppositeHolder)
	 * @see sculptordsl.SculptordslPackage#getDslReference_OppositeHolder()
	 * @model containment="true"
	 * @generated
	 */
	DslOppositeHolder getOppositeHolder();

	/**
	 * Sets the value of the '{@link sculptordsl.DslReference#getOppositeHolder <em>Opposite Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Holder</em>' containment reference.
	 * @see #getOppositeHolder()
	 * @generated
	 */
	void setOppositeHolder(DslOppositeHolder value);

} // DslReference
