/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}</li>
 *   <li>{@link wollokDsl.WMemberFeatureCall#isNullSafe <em>Null Safe</em>}</li>
 *   <li>{@link wollokDsl.WMemberFeatureCall#getFeature <em>Feature</em>}</li>
 *   <li>{@link wollokDsl.WMemberFeatureCall#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWMemberFeatureCall()
 * @model
 * @generated
 */
public interface WMemberFeatureCall extends WExpression {
	/**
	 * Returns the value of the '<em><b>Member Call Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Call Target</em>' containment reference.
	 * @see #setMemberCallTarget(WExpression)
	 * @see wollokDsl.WollokDslPackage#getWMemberFeatureCall_MemberCallTarget()
	 * @model containment="true"
	 * @generated
	 */
	WExpression getMemberCallTarget();

	/**
	 * Sets the value of the '{@link wollokDsl.WMemberFeatureCall#getMemberCallTarget <em>Member Call Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Call Target</em>' containment reference.
	 * @see #getMemberCallTarget()
	 * @generated
	 */
	void setMemberCallTarget(WExpression value);

	/**
	 * Returns the value of the '<em><b>Null Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Safe</em>' attribute.
	 * @see #setNullSafe(boolean)
	 * @see wollokDsl.WollokDslPackage#getWMemberFeatureCall_NullSafe()
	 * @model
	 * @generated
	 */
	boolean isNullSafe();

	/**
	 * Sets the value of the '{@link wollokDsl.WMemberFeatureCall#isNullSafe <em>Null Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Safe</em>' attribute.
	 * @see #isNullSafe()
	 * @generated
	 */
	void setNullSafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see wollokDsl.WollokDslPackage#getWMemberFeatureCall_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link wollokDsl.WMemberFeatureCall#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Call Arguments</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWMemberFeatureCall_MemberCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<WExpression> getMemberCallArguments();

} // WMemberFeatureCall
