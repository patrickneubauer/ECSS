/**
 */
package wollokDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wollokDsl.WExpression;
import wollokDsl.WMemberFeatureCall;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WMember Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WMemberFeatureCallImpl#getMemberCallTarget <em>Member Call Target</em>}</li>
 *   <li>{@link wollokDsl.impl.WMemberFeatureCallImpl#isNullSafe <em>Null Safe</em>}</li>
 *   <li>{@link wollokDsl.impl.WMemberFeatureCallImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link wollokDsl.impl.WMemberFeatureCallImpl#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WMemberFeatureCallImpl extends WExpressionImpl implements WMemberFeatureCall {
	/**
	 * The cached value of the '{@link #getMemberCallTarget() <em>Member Call Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCallTarget()
	 * @generated
	 * @ordered
	 */
	protected WExpression memberCallTarget;

	/**
	 * The default value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullSafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_SAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullSafe() <em>Null Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullSafe()
	 * @generated
	 * @ordered
	 */
	protected boolean nullSafe = NULL_SAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberCallArguments() <em>Member Call Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<WExpression> memberCallArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMemberFeatureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WMEMBER_FEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WExpression getMemberCallTarget() {
		return memberCallTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberCallTarget(WExpression newMemberCallTarget, NotificationChain msgs) {
		WExpression oldMemberCallTarget = memberCallTarget;
		memberCallTarget = newMemberCallTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, oldMemberCallTarget, newMemberCallTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberCallTarget(WExpression newMemberCallTarget) {
		if (newMemberCallTarget != memberCallTarget) {
			NotificationChain msgs = null;
			if (memberCallTarget != null)
				msgs = ((InternalEObject)memberCallTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
			if (newMemberCallTarget != null)
				msgs = ((InternalEObject)newMemberCallTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, null, msgs);
			msgs = basicSetMemberCallTarget(newMemberCallTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET, newMemberCallTarget, newMemberCallTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullSafe() {
		return nullSafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullSafe(boolean newNullSafe) {
		boolean oldNullSafe = nullSafe;
		nullSafe = newNullSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMEMBER_FEATURE_CALL__NULL_SAFE, oldNullSafe, nullSafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(String newFeature) {
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WMEMBER_FEATURE_CALL__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WExpression> getMemberCallArguments() {
		if (memberCallArguments == null) {
			memberCallArguments = new EObjectContainmentEList<WExpression>(WExpression.class, this, WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS);
		}
		return memberCallArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return basicSetMemberCallTarget(null, msgs);
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return ((InternalEList<?>)getMemberCallArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return getMemberCallTarget();
			case WollokDslPackage.WMEMBER_FEATURE_CALL__NULL_SAFE:
				return isNullSafe();
			case WollokDslPackage.WMEMBER_FEATURE_CALL__FEATURE:
				return getFeature();
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return getMemberCallArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				setMemberCallTarget((WExpression)newValue);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__NULL_SAFE:
				setNullSafe((Boolean)newValue);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__FEATURE:
				setFeature((String)newValue);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				getMemberCallArguments().addAll((Collection<? extends WExpression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				setMemberCallTarget((WExpression)null);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__NULL_SAFE:
				setNullSafe(NULL_SAFE_EDEFAULT);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET:
				return memberCallTarget != null;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__NULL_SAFE:
				return nullSafe != NULL_SAFE_EDEFAULT;
			case WollokDslPackage.WMEMBER_FEATURE_CALL__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
			case WollokDslPackage.WMEMBER_FEATURE_CALL__MEMBER_CALL_ARGUMENTS:
				return memberCallArguments != null && !memberCallArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nullSafe: ");
		result.append(nullSafe);
		result.append(", feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //WMemberFeatureCallImpl
