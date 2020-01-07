/**
 */
package sculptordsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslBasicType#getTraits <em>Traits</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#isNotImmutable <em>Not Immutable</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#isNoGapClass <em>No Gap Class</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#getReferences <em>References</em>}</li>
 *   <li>{@link sculptordsl.DslBasicType#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslBasicType()
 * @model
 * @generated
 */
public interface DslBasicType extends DslSimpleDomainObject {
	/**
	 * Returns the value of the '<em><b>Traits</b></em>' reference list.
	 * The list contents are of type {@link sculptordsl.DslTrait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traits</em>' reference list.
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_Traits()
	 * @model
	 * @generated
	 */
	EList<DslTrait> getTraits();

	/**
	 * Returns the value of the '<em><b>Not Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Immutable</em>' attribute.
	 * @see #setNotImmutable(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_NotImmutable()
	 * @model
	 * @generated
	 */
	boolean isNotImmutable();

	/**
	 * Sets the value of the '{@link sculptordsl.DslBasicType#isNotImmutable <em>Not Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Immutable</em>' attribute.
	 * @see #isNotImmutable()
	 * @generated
	 */
	void setNotImmutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslBasicType#isGapClass <em>Gap Class</em>}' attribute.
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
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_NoGapClass()
	 * @model
	 * @generated
	 */
	boolean isNoGapClass();

	/**
	 * Sets the value of the '{@link sculptordsl.DslBasicType#isNoGapClass <em>No Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Gap Class</em>' attribute.
	 * @see #isNoGapClass()
	 * @generated
	 */
	void setNoGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sculptordsl.DslAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_Attributes()
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
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_References()
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
	 * @see sculptordsl.SculptordslPackage#getDslBasicType_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DslDomainObjectOperation> getOperations();

} // DslBasicType
