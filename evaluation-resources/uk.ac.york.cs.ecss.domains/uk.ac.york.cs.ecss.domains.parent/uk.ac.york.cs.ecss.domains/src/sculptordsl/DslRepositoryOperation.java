/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Repository Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getDoc <em>Doc</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getName <em>Name</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getThrows <em>Throws</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getHint <em>Hint</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isCache <em>Cache</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isGapOperation <em>Gap Operation</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isNoGapOperation <em>No Gap Operation</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getQuery <em>Query</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getCondition <em>Condition</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getSelect <em>Select</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isConstruct <em>Construct</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isBuild <em>Build</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isMap <em>Map</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getPublish <em>Publish</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}</li>
 *   <li>{@link sculptordsl.DslRepositoryOperation#getAccessObjectName <em>Access Object Name</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation()
 * @model
 * @generated
 */
public interface DslRepositoryOperation extends DslDomainObjectTypedElement, DslServiceRepositoryOperationOption {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getDoc <em>Doc</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Visibility()
	 * @model
	 * @generated
	 */
	DslVisibility getVisibility();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see sculptordsl.DslVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(DslVisibility value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(DslComplexType)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	DslComplexType getReturnType();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DslComplexType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Throws()
	 * @model
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Cache()
	 * @model
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Gap Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Operation</em>' attribute.
	 * @see #setGapOperation(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_GapOperation()
	 * @model
	 * @generated
	 */
	boolean isGapOperation();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isGapOperation <em>Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Operation</em>' attribute.
	 * @see #isGapOperation()
	 * @generated
	 */
	void setGapOperation(boolean value);

	/**
	 * Returns the value of the '<em><b>No Gap Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Gap Operation</em>' attribute.
	 * @see #setNoGapOperation(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_NoGapOperation()
	 * @model
	 * @generated
	 */
	boolean isNoGapOperation();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isNoGapOperation <em>No Gap Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Gap Operation</em>' attribute.
	 * @see #isNoGapOperation()
	 * @generated
	 */
	void setNoGapOperation(boolean value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' attribute.
	 * @see #setSelect(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Select()
	 * @model
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' attribute.
	 * @see #setGroupBy(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_GroupBy()
	 * @model
	 * @generated
	 */
	String getGroupBy();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getGroupBy <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By</em>' attribute.
	 * @see #getGroupBy()
	 * @generated
	 */
	void setGroupBy(String value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see #setOrderBy(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_OrderBy()
	 * @model
	 * @generated
	 */
	String getOrderBy();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(String value);

	/**
	 * Returns the value of the '<em><b>Construct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construct</em>' attribute.
	 * @see #setConstruct(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Construct()
	 * @model
	 * @generated
	 */
	boolean isConstruct();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isConstruct <em>Construct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construct</em>' attribute.
	 * @see #isConstruct()
	 * @generated
	 */
	void setConstruct(boolean value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' attribute.
	 * @see #setBuild(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Build()
	 * @model
	 * @generated
	 */
	boolean isBuild();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isBuild <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' attribute.
	 * @see #isBuild()
	 * @generated
	 */
	void setBuild(boolean value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' attribute.
	 * @see #setMap(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Map()
	 * @model
	 * @generated
	 */
	boolean isMap();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isMap <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' attribute.
	 * @see #isMap()
	 * @generated
	 */
	void setMap(boolean value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' containment reference.
	 * @see #setPublish(DslPublish)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_Publish()
	 * @model containment="true"
	 * @generated
	 */
	DslPublish getPublish();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getPublish <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' containment reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(DslPublish value);

	/**
	 * Returns the value of the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #setDelegateToAccessObject(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_DelegateToAccessObject()
	 * @model
	 * @generated
	 */
	boolean isDelegateToAccessObject();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #isDelegateToAccessObject()
	 * @generated
	 */
	void setDelegateToAccessObject(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Object Name</em>' attribute.
	 * @see #setAccessObjectName(String)
	 * @see sculptordsl.SculptordslPackage#getDslRepositoryOperation_AccessObjectName()
	 * @model
	 * @generated
	 */
	String getAccessObjectName();

	/**
	 * Sets the value of the '{@link sculptordsl.DslRepositoryOperation#getAccessObjectName <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Object Name</em>' attribute.
	 * @see #getAccessObjectName()
	 * @generated
	 */
	void setAccessObjectName(String value);

} // DslRepositoryOperation
