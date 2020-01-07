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

import xturtle.DirectiveBlock;
import xturtle.Directives;
import xturtle.Triples;
import xturtle.XturtlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directive Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xturtle.impl.DirectiveBlockImpl#getDirectives <em>Directives</em>}</li>
 *   <li>{@link xturtle.impl.DirectiveBlockImpl#getTriples <em>Triples</em>}</li>
 *   <li>{@link xturtle.impl.DirectiveBlockImpl#getDirectiveblock <em>Directiveblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectiveBlockImpl extends MinimalEObjectImpl.Container implements DirectiveBlock {
	/**
	 * The cached value of the '{@link #getDirectives() <em>Directives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectives()
	 * @generated
	 * @ordered
	 */
	protected Directives directives;

	/**
	 * The cached value of the '{@link #getTriples() <em>Triples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriples()
	 * @generated
	 * @ordered
	 */
	protected EList<Triples> triples;

	/**
	 * The cached value of the '{@link #getDirectiveblock() <em>Directiveblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveblock()
	 * @generated
	 * @ordered
	 */
	protected DirectiveBlock directiveblock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectiveBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XturtlePackage.Literals.DIRECTIVE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directives getDirectives() {
		return directives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectives(Directives newDirectives, NotificationChain msgs) {
		Directives oldDirectives = directives;
		directives = newDirectives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES, oldDirectives, newDirectives);
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
	public void setDirectives(Directives newDirectives) {
		if (newDirectives != directives) {
			NotificationChain msgs = null;
			if (directives != null)
				msgs = ((InternalEObject)directives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES, null, msgs);
			if (newDirectives != null)
				msgs = ((InternalEObject)newDirectives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES, null, msgs);
			msgs = basicSetDirectives(newDirectives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES, newDirectives, newDirectives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Triples> getTriples() {
		if (triples == null) {
			triples = new EObjectContainmentEList<Triples>(Triples.class, this, XturtlePackage.DIRECTIVE_BLOCK__TRIPLES);
		}
		return triples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectiveBlock getDirectiveblock() {
		return directiveblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectiveblock(DirectiveBlock newDirectiveblock, NotificationChain msgs) {
		DirectiveBlock oldDirectiveblock = directiveblock;
		directiveblock = newDirectiveblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK, oldDirectiveblock, newDirectiveblock);
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
	public void setDirectiveblock(DirectiveBlock newDirectiveblock) {
		if (newDirectiveblock != directiveblock) {
			NotificationChain msgs = null;
			if (directiveblock != null)
				msgs = ((InternalEObject)directiveblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK, null, msgs);
			if (newDirectiveblock != null)
				msgs = ((InternalEObject)newDirectiveblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK, null, msgs);
			msgs = basicSetDirectiveblock(newDirectiveblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK, newDirectiveblock, newDirectiveblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES:
				return basicSetDirectives(null, msgs);
			case XturtlePackage.DIRECTIVE_BLOCK__TRIPLES:
				return ((InternalEList<?>)getTriples()).basicRemove(otherEnd, msgs);
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK:
				return basicSetDirectiveblock(null, msgs);
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
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES:
				return getDirectives();
			case XturtlePackage.DIRECTIVE_BLOCK__TRIPLES:
				return getTriples();
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK:
				return getDirectiveblock();
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
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES:
				setDirectives((Directives)newValue);
				return;
			case XturtlePackage.DIRECTIVE_BLOCK__TRIPLES:
				getTriples().clear();
				getTriples().addAll((Collection<? extends Triples>)newValue);
				return;
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK:
				setDirectiveblock((DirectiveBlock)newValue);
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
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES:
				setDirectives((Directives)null);
				return;
			case XturtlePackage.DIRECTIVE_BLOCK__TRIPLES:
				getTriples().clear();
				return;
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK:
				setDirectiveblock((DirectiveBlock)null);
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
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVES:
				return directives != null;
			case XturtlePackage.DIRECTIVE_BLOCK__TRIPLES:
				return triples != null && !triples.isEmpty();
			case XturtlePackage.DIRECTIVE_BLOCK__DIRECTIVEBLOCK:
				return directiveblock != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectiveBlockImpl
