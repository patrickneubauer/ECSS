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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wollokDsl.WArgumentList;
import wollokDsl.WClass;
import wollokDsl.WConstructorCall;
import wollokDsl.WMixin;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WConstructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WConstructorCallImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link wollokDsl.impl.WConstructorCallImpl#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link wollokDsl.impl.WConstructorCallImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WConstructorCallImpl extends WExpressionImpl implements WConstructorCall {
	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected WClass classRef;

	/**
	 * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentList()
	 * @generated
	 * @ordered
	 */
	protected WArgumentList argumentList;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<WMixin> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WConstructorCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WCONSTRUCTOR_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WClass getClassRef() {
		if (classRef != null && classRef.eIsProxy()) {
			InternalEObject oldClassRef = (InternalEObject)classRef;
			classRef = (WClass)eResolveProxy(oldClassRef);
			if (classRef != oldClassRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF, oldClassRef, classRef));
			}
		}
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WClass basicGetClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassRef(WClass newClassRef) {
		WClass oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WArgumentList getArgumentList() {
		return argumentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentList(WArgumentList newArgumentList, NotificationChain msgs) {
		WArgumentList oldArgumentList = argumentList;
		argumentList = newArgumentList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST, oldArgumentList, newArgumentList);
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
	public void setArgumentList(WArgumentList newArgumentList) {
		if (newArgumentList != argumentList) {
			NotificationChain msgs = null;
			if (argumentList != null)
				msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST, null, msgs);
			if (newArgumentList != null)
				msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST, null, msgs);
			msgs = basicSetArgumentList(newArgumentList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST, newArgumentList, newArgumentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WMixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<WMixin>(WMixin.class, this, WollokDslPackage.WCONSTRUCTOR_CALL__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST:
				return basicSetArgumentList(null, msgs);
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
			case WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF:
				if (resolve) return getClassRef();
				return basicGetClassRef();
			case WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST:
				return getArgumentList();
			case WollokDslPackage.WCONSTRUCTOR_CALL__MIXINS:
				return getMixins();
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
			case WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF:
				setClassRef((WClass)newValue);
				return;
			case WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST:
				setArgumentList((WArgumentList)newValue);
				return;
			case WollokDslPackage.WCONSTRUCTOR_CALL__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends WMixin>)newValue);
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
			case WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF:
				setClassRef((WClass)null);
				return;
			case WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST:
				setArgumentList((WArgumentList)null);
				return;
			case WollokDslPackage.WCONSTRUCTOR_CALL__MIXINS:
				getMixins().clear();
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
			case WollokDslPackage.WCONSTRUCTOR_CALL__CLASS_REF:
				return classRef != null;
			case WollokDslPackage.WCONSTRUCTOR_CALL__ARGUMENT_LIST:
				return argumentList != null;
			case WollokDslPackage.WCONSTRUCTOR_CALL__MIXINS:
				return mixins != null && !mixins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WConstructorCallImpl
