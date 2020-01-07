/**
 */
package sculptordsl.impl;

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

import sculptordsl.DslApplication;
import sculptordsl.DslImport;
import sculptordsl.DslModel;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link sculptordsl.impl.DslModelImpl#getApp <em>App</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslModelImpl extends MinimalEObjectImpl.Container implements DslModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DslImport> imports;

	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected DslApplication app;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DslImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<DslImport>(DslImport.class, this, SculptordslPackage.DSL_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DslApplication getApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp(DslApplication newApp, NotificationChain msgs) {
		DslApplication oldApp = app;
		app = newApp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODEL__APP, oldApp, newApp);
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
	public void setApp(DslApplication newApp) {
		if (newApp != app) {
			NotificationChain msgs = null;
			if (app != null)
				msgs = ((InternalEObject)app).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_MODEL__APP, null, msgs);
			if (newApp != null)
				msgs = ((InternalEObject)newApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SculptordslPackage.DSL_MODEL__APP, null, msgs);
			msgs = basicSetApp(newApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_MODEL__APP, newApp, newApp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SculptordslPackage.DSL_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case SculptordslPackage.DSL_MODEL__APP:
				return basicSetApp(null, msgs);
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
			case SculptordslPackage.DSL_MODEL__IMPORTS:
				return getImports();
			case SculptordslPackage.DSL_MODEL__APP:
				return getApp();
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
			case SculptordslPackage.DSL_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DslImport>)newValue);
				return;
			case SculptordslPackage.DSL_MODEL__APP:
				setApp((DslApplication)newValue);
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
			case SculptordslPackage.DSL_MODEL__IMPORTS:
				getImports().clear();
				return;
			case SculptordslPackage.DSL_MODEL__APP:
				setApp((DslApplication)null);
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
			case SculptordslPackage.DSL_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case SculptordslPackage.DSL_MODEL__APP:
				return app != null;
		}
		return super.eIsSet(featureID);
	}

} //DslModelImpl
