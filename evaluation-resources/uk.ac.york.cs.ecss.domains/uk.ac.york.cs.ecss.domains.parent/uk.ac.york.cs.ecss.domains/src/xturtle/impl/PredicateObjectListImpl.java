/**
 */
package xturtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xturtle.Predicate;
import xturtle.PredicateObjectList;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Object List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xturtle.impl.PredicateObjectListImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link xturtle.impl.PredicateObjectListImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateObjectListImpl extends MinimalEObjectImpl.Container implements PredicateObjectList {
	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected Predicate verb;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<xturtle.Object> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateObjectListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XturtlePackage.Literals.PREDICATE_OBJECT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerb(Predicate newVerb, NotificationChain msgs) {
		Predicate oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XturtlePackage.PREDICATE_OBJECT_LIST__VERB, oldVerb, newVerb);
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
	public void setVerb(Predicate newVerb) {
		if (newVerb != verb) {
			NotificationChain msgs = null;
			if (verb != null)
				msgs = ((InternalEObject)verb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.PREDICATE_OBJECT_LIST__VERB, null, msgs);
			if (newVerb != null)
				msgs = ((InternalEObject)newVerb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.PREDICATE_OBJECT_LIST__VERB, null, msgs);
			msgs = basicSetVerb(newVerb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XturtlePackage.PREDICATE_OBJECT_LIST__VERB, newVerb, newVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<xturtle.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<xturtle.Object>(xturtle.Object.class, this, XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XturtlePackage.PREDICATE_OBJECT_LIST__VERB:
				return basicSetVerb(null, msgs);
			case XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case XturtlePackage.PREDICATE_OBJECT_LIST__VERB:
				return getVerb();
			case XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS:
				return getObjects();
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
			case XturtlePackage.PREDICATE_OBJECT_LIST__VERB:
				setVerb((Predicate)newValue);
				return;
			case XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends xturtle.Object>)newValue);
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
			case XturtlePackage.PREDICATE_OBJECT_LIST__VERB:
				setVerb((Predicate)null);
				return;
			case XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS:
				getObjects().clear();
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
			case XturtlePackage.PREDICATE_OBJECT_LIST__VERB:
				return verb != null;
			case XturtlePackage.PREDICATE_OBJECT_LIST__OBJECTS:
				return objects != null && !objects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PredicateObjectListImpl
