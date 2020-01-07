/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslDomainObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getTraits <em>Traits</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#isScaffold <em>Scaffold</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getDatabaseTable <em>Database Table</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getDiscriminatorLength <em>Discriminator Length</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getInheritanceType <em>Inheritance Type</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getValidate <em>Validate</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#isNotAggregateRoot <em>Not Aggregate Root</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link sculptordsl.DslDomainObject#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslDomainObject()
 * @model
 * @generated
 */
public interface DslDomainObject extends DslSimpleDomainObject {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Name</em>' attribute.
	 * @see #setExtendsName(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_ExtendsName()
	 * @model
	 * @generated
	 */
	String getExtendsName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getExtendsName <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Name</em>' attribute.
	 * @see #getExtendsName()
	 * @generated
	 */
	void setExtendsName(String value);

	/**
	 * Returns the value of the '<em><b>Traits</b></em>' reference list.
	 * The list contents are of type {@link sculptordsl.DslTrait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traits</em>' reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Traits()
	 * @model
	 * @generated
	 */
	EList<DslTrait> getTraits();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Cache()
	 * @model
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>No Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Gap Class</em>' attribute.
	 * @see #setNoGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_NoGapClass()
	 * @model
	 * @generated
	 */
	boolean isNoGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isNoGapClass <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Gap Class</em>' attribute.
	 * @see #isNoGapClass()
	 * @generated
	 */
	void setNoGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffold</em>' attribute.
	 * @see #setScaffold(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Scaffold()
	 * @model
	 * @generated
	 */
	boolean isScaffold();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isScaffold <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffold</em>' attribute.
	 * @see #isScaffold()
	 * @generated
	 */
	void setScaffold(boolean value);

	/**
	 * Returns the value of the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table</em>' attribute.
	 * @see #setDatabaseTable(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_DatabaseTable()
	 * @model
	 * @generated
	 */
	String getDatabaseTable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getDatabaseTable <em>Database Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table</em>' attribute.
	 * @see #getDatabaseTable()
	 * @generated
	 */
	void setDatabaseTable(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Value</em>' attribute.
	 * @see #setDiscriminatorValue(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_DiscriminatorValue()
	 * @model
	 * @generated
	 */
	String getDiscriminatorValue();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getDiscriminatorValue <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Value</em>' attribute.
	 * @see #getDiscriminatorValue()
	 * @generated
	 */
	void setDiscriminatorValue(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column</em>' attribute.
	 * @see #setDiscriminatorColumn(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_DiscriminatorColumn()
	 * @model
	 * @generated
	 */
	String getDiscriminatorColumn();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getDiscriminatorColumn <em>Discriminator Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column</em>' attribute.
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	void setDiscriminatorColumn(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslDiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see sculptordsl.DslDiscriminatorType
	 * @see #setDiscriminatorType(DslDiscriminatorType)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_DiscriminatorType()
	 * @model
	 * @generated
	 */
	DslDiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see sculptordsl.DslDiscriminatorType
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DslDiscriminatorType value);

	/**
	 * Returns the value of the '<em><b>Discriminator Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Length</em>' attribute.
	 * @see #setDiscriminatorLength(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_DiscriminatorLength()
	 * @model
	 * @generated
	 */
	String getDiscriminatorLength();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getDiscriminatorLength <em>Discriminator Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Length</em>' attribute.
	 * @see #getDiscriminatorLength()
	 * @generated
	 */
	void setDiscriminatorLength(String value);

	/**
	 * Returns the value of the '<em><b>Inheritance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sculptordsl.DslInheritanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance Type</em>' attribute.
	 * @see sculptordsl.DslInheritanceType
	 * @see #setInheritanceType(DslInheritanceType)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_InheritanceType()
	 * @model
	 * @generated
	 */
	DslInheritanceType getInheritanceType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getInheritanceType <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Type</em>' attribute.
	 * @see sculptordsl.DslInheritanceType
	 * @see #getInheritanceType()
	 * @generated
	 */
	void setInheritanceType(DslInheritanceType value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Validate()
	 * @model
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Not Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Aggregate Root</em>' attribute.
	 * @see #setNotAggregateRoot(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_NotAggregateRoot()
	 * @model
	 * @generated
	 */
	boolean isNotAggregateRoot();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#isNotAggregateRoot <em>Not Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Aggregate Root</em>' attribute.
	 * @see #isNotAggregateRoot()
	 * @generated
	 */
	void setNotAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(DslDomainObject)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_BelongsTo()
	 * @model
	 * @generated
	 */
	DslDomainObject getBelongsTo();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(DslDomainObject value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslDomainObjectOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDomainObjectOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(DslRepository)
	 * @see sculptordsl.SculptordslPackage#getDslDomainObject_Repository()
	 * @model containment="true"
	 * @generated
	 */
	DslRepository getRepository();

	/**
	 * Sets the value of the '{@link sculptordsl.DslDomainObject#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(DslRepository value);

} // DslDomainObject
