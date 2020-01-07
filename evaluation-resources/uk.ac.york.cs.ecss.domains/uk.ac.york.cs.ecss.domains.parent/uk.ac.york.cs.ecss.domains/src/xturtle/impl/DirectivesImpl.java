/**
 */
package xturtle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xturtle.Directive;
import xturtle.Directives;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xturtle.impl.DirectivesImpl#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectivesImpl extends MinimalEObjectImpl.Container implements Directives {
	/**
	 * The cached value of the '{@link #getDirective() <em>Directive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirective()
	 * @generated
	 * @ordered
	 */
	protected EList<Directive> directive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XturtlePackage.Literals.DIRECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Directive> getDirective() {
		if (directive == null) {
			directive = new EObjectContainmentEList<Directive>(Directive.class, this, XturtlePackage.DIRECTIVES__DIRECTIVE);
		}
		return directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XturtlePackage.DIRECTIVES__DIRECTIVE:
				return ((InternalEList<?>)getDirective()).basicRemove(otherEnd, msgs);
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
			case XturtlePackage.DIRECTIVES__DIRECTIVE:
				return getDirective();
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
			case XturtlePackage.DIRECTIVES__DIRECTIVE:
				getDirective().clear();
				getDirective().addAll((Collection<? extends Directive>)newValue);
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
			case XturtlePackage.DIRECTIVES__DIRECTIVE:
				getDirective().clear();
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
			case XturtlePackage.DIRECTIVES__DIRECTIVE:
				return directive != null && !directive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectivesImpl
