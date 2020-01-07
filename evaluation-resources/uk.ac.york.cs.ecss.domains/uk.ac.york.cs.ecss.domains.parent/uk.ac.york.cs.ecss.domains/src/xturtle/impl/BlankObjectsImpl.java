/**
 */
package xturtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xturtle.BlankObjects;
import xturtle.PredicateObjectList;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blank Objects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xturtle.impl.BlankObjectsImpl#getPredObjs <em>Pred Objs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlankObjectsImpl extends BlankImpl implements BlankObjects {
	/**
	 * The cached value of the '{@link #getPredObjs() <em>Pred Objs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredObjs()
	 * @generated
	 * @ordered
	 */
	protected EList<PredicateObjectList> predObjs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlankObjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XturtlePackage.Literals.BLANK_OBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredicateObjectList> getPredObjs() {
		if (predObjs == null) {
			predObjs = new EObjectContainmentEList<PredicateObjectList>(PredicateObjectList.class, this, XturtlePackage.BLANK_OBJECTS__PRED_OBJS);
		}
		return predObjs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XturtlePackage.BLANK_OBJECTS__PRED_OBJS:
				return ((InternalEList<?>)getPredObjs()).basicRemove(otherEnd, msgs);
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
			case XturtlePackage.BLANK_OBJECTS__PRED_OBJS:
				return getPredObjs();
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
			case XturtlePackage.BLANK_OBJECTS__PRED_OBJS:
				getPredObjs().clear();
				getPredObjs().addAll((Collection<? extends PredicateObjectList>)newValue);
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
			case XturtlePackage.BLANK_OBJECTS__PRED_OBJS:
				getPredObjs().clear();
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
			case XturtlePackage.BLANK_OBJECTS__PRED_OBJS:
				return predObjs != null && !predObjs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlankObjectsImpl
