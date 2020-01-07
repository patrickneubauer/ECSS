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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wollokDsl.Import;
import wollokDsl.WFile;
import wollokDsl.WLibraryElement;
import wollokDsl.WProgram;
import wollokDsl.WSuite;
import wollokDsl.WTest;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WFile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link wollokDsl.impl.WFileImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link wollokDsl.impl.WFileImpl#getMain <em>Main</em>}</li>
 *   <li>{@link wollokDsl.impl.WFileImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link wollokDsl.impl.WFileImpl#getSuites <em>Suites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WFileImpl extends MinimalEObjectImpl.Container implements WFile {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<WLibraryElement> elements;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected WProgram main;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<WTest> tests;

	/**
	 * The cached value of the '{@link #getSuites() <em>Suites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuites()
	 * @generated
	 * @ordered
	 */
	protected EList<WSuite> suites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, WollokDslPackage.WFILE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WLibraryElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<WLibraryElement>(WLibraryElement.class, this, WollokDslPackage.WFILE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WProgram getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain(WProgram newMain, NotificationChain msgs) {
		WProgram oldMain = main;
		main = newMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WFILE__MAIN, oldMain, newMain);
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
	public void setMain(WProgram newMain) {
		if (newMain != main) {
			NotificationChain msgs = null;
			if (main != null)
				msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WFILE__MAIN, null, msgs);
			if (newMain != null)
				msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WFILE__MAIN, null, msgs);
			msgs = basicSetMain(newMain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WFILE__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WTest> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<WTest>(WTest.class, this, WollokDslPackage.WFILE__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WSuite> getSuites() {
		if (suites == null) {
			suites = new EObjectContainmentEList<WSuite>(WSuite.class, this, WollokDslPackage.WFILE__SUITES);
		}
		return suites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WFILE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WFILE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WFILE__MAIN:
				return basicSetMain(null, msgs);
			case WollokDslPackage.WFILE__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case WollokDslPackage.WFILE__SUITES:
				return ((InternalEList<?>)getSuites()).basicRemove(otherEnd, msgs);
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
			case WollokDslPackage.WFILE__IMPORTS:
				return getImports();
			case WollokDslPackage.WFILE__ELEMENTS:
				return getElements();
			case WollokDslPackage.WFILE__MAIN:
				return getMain();
			case WollokDslPackage.WFILE__TESTS:
				return getTests();
			case WollokDslPackage.WFILE__SUITES:
				return getSuites();
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
			case WollokDslPackage.WFILE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case WollokDslPackage.WFILE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends WLibraryElement>)newValue);
				return;
			case WollokDslPackage.WFILE__MAIN:
				setMain((WProgram)newValue);
				return;
			case WollokDslPackage.WFILE__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends WTest>)newValue);
				return;
			case WollokDslPackage.WFILE__SUITES:
				getSuites().clear();
				getSuites().addAll((Collection<? extends WSuite>)newValue);
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
			case WollokDslPackage.WFILE__IMPORTS:
				getImports().clear();
				return;
			case WollokDslPackage.WFILE__ELEMENTS:
				getElements().clear();
				return;
			case WollokDslPackage.WFILE__MAIN:
				setMain((WProgram)null);
				return;
			case WollokDslPackage.WFILE__TESTS:
				getTests().clear();
				return;
			case WollokDslPackage.WFILE__SUITES:
				getSuites().clear();
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
			case WollokDslPackage.WFILE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case WollokDslPackage.WFILE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case WollokDslPackage.WFILE__MAIN:
				return main != null;
			case WollokDslPackage.WFILE__TESTS:
				return tests != null && !tests.isEmpty();
			case WollokDslPackage.WFILE__SUITES:
				return suites != null && !suites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WFileImpl
