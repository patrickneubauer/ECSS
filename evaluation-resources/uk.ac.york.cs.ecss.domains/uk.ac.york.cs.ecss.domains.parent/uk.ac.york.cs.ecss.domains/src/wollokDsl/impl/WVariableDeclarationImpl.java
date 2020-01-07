/**
 */
package wollokDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wollokDsl.WExpression;
import wollokDsl.WVariable;
import wollokDsl.WVariableDeclaration;
import wollokDsl.WollokDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WVariable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.impl.WVariableDeclarationImpl#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link wollokDsl.impl.WVariableDeclarationImpl#isProperty <em>Property</em>}</li>
 *   <li>{@link wollokDsl.impl.WVariableDeclarationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link wollokDsl.impl.WVariableDeclarationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WVariableDeclarationImpl extends WExpressionImpl implements WVariableDeclaration {
	/**
	 * The default value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected boolean writeable = WRITEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean property = PROPERTY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected WVariable variable;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected WExpression right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WollokDslPackage.Literals.WVARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWriteable() {
		return writeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteable(boolean newWriteable) {
		boolean oldWriteable = writeable;
		writeable = newWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__WRITEABLE, oldWriteable, writeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(boolean newProperty) {
		boolean oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(WVariable newVariable, NotificationChain msgs) {
		WVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(WVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WExpression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(WExpression newRight, NotificationChain msgs) {
		WExpression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__RIGHT, oldRight, newRight);
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
	public void setRight(WExpression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WVARIABLE_DECLARATION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WollokDslPackage.WVARIABLE_DECLARATION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WollokDslPackage.WVARIABLE_DECLARATION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE:
				return basicSetVariable(null, msgs);
			case WollokDslPackage.WVARIABLE_DECLARATION__RIGHT:
				return basicSetRight(null, msgs);
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
			case WollokDslPackage.WVARIABLE_DECLARATION__WRITEABLE:
				return isWriteable();
			case WollokDslPackage.WVARIABLE_DECLARATION__PROPERTY:
				return isProperty();
			case WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE:
				return getVariable();
			case WollokDslPackage.WVARIABLE_DECLARATION__RIGHT:
				return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WollokDslPackage.WVARIABLE_DECLARATION__WRITEABLE:
				setWriteable((Boolean)newValue);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__PROPERTY:
				setProperty((Boolean)newValue);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE:
				setVariable((WVariable)newValue);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__RIGHT:
				setRight((WExpression)newValue);
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
			case WollokDslPackage.WVARIABLE_DECLARATION__WRITEABLE:
				setWriteable(WRITEABLE_EDEFAULT);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE:
				setVariable((WVariable)null);
				return;
			case WollokDslPackage.WVARIABLE_DECLARATION__RIGHT:
				setRight((WExpression)null);
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
			case WollokDslPackage.WVARIABLE_DECLARATION__WRITEABLE:
				return writeable != WRITEABLE_EDEFAULT;
			case WollokDslPackage.WVARIABLE_DECLARATION__PROPERTY:
				return property != PROPERTY_EDEFAULT;
			case WollokDslPackage.WVARIABLE_DECLARATION__VARIABLE:
				return variable != null;
			case WollokDslPackage.WVARIABLE_DECLARATION__RIGHT:
				return right != null;
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
		result.append(" (writeable: ");
		result.append(writeable);
		result.append(", property: ");
		result.append(property);
		result.append(')');
		return result.toString();
	}

} //WVariableDeclarationImpl
