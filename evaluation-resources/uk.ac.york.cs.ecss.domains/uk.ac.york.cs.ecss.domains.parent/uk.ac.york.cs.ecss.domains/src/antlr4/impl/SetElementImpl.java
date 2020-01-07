/**
 */
package antlr4.impl;

import antlr4.Antlr4Package;
import antlr4.Range;
import antlr4.SetElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link antlr4.impl.SetElementImpl#getTokenRef <em>Token Ref</em>}</li>
 *   <li>{@link antlr4.impl.SetElementImpl#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link antlr4.impl.SetElementImpl#getRange <em>Range</em>}</li>
 *   <li>{@link antlr4.impl.SetElementImpl#getCharSet <em>Char Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetElementImpl extends MinimalEObjectImpl.Container implements SetElement {
	/**
	 * The default value of the '{@link #getTokenRef() <em>Token Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenRef() <em>Token Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenRef()
	 * @generated
	 * @ordered
	 */
	protected String tokenRef = TOKEN_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLiteral()
	 * @generated
	 * @ordered
	 */
	protected String stringLiteral = STRING_LITERAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * The default value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSet()
	 * @generated
	 * @ordered
	 */
	protected String charSet = CHAR_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Antlr4Package.Literals.SET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenRef() {
		return tokenRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenRef(String newTokenRef) {
		String oldTokenRef = tokenRef;
		tokenRef = newTokenRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.SET_ELEMENT__TOKEN_REF, oldTokenRef, tokenRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringLiteral() {
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringLiteral(String newStringLiteral) {
		String oldStringLiteral = stringLiteral;
		stringLiteral = newStringLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.SET_ELEMENT__STRING_LITERAL, oldStringLiteral, stringLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Antlr4Package.SET_ELEMENT__RANGE, oldRange, newRange);
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
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.SET_ELEMENT__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.SET_ELEMENT__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.SET_ELEMENT__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharSet() {
		return charSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharSet(String newCharSet) {
		String oldCharSet = charSet;
		charSet = newCharSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.SET_ELEMENT__CHAR_SET, oldCharSet, charSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Antlr4Package.SET_ELEMENT__RANGE:
				return basicSetRange(null, msgs);
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
			case Antlr4Package.SET_ELEMENT__TOKEN_REF:
				return getTokenRef();
			case Antlr4Package.SET_ELEMENT__STRING_LITERAL:
				return getStringLiteral();
			case Antlr4Package.SET_ELEMENT__RANGE:
				return getRange();
			case Antlr4Package.SET_ELEMENT__CHAR_SET:
				return getCharSet();
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
			case Antlr4Package.SET_ELEMENT__TOKEN_REF:
				setTokenRef((String)newValue);
				return;
			case Antlr4Package.SET_ELEMENT__STRING_LITERAL:
				setStringLiteral((String)newValue);
				return;
			case Antlr4Package.SET_ELEMENT__RANGE:
				setRange((Range)newValue);
				return;
			case Antlr4Package.SET_ELEMENT__CHAR_SET:
				setCharSet((String)newValue);
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
			case Antlr4Package.SET_ELEMENT__TOKEN_REF:
				setTokenRef(TOKEN_REF_EDEFAULT);
				return;
			case Antlr4Package.SET_ELEMENT__STRING_LITERAL:
				setStringLiteral(STRING_LITERAL_EDEFAULT);
				return;
			case Antlr4Package.SET_ELEMENT__RANGE:
				setRange((Range)null);
				return;
			case Antlr4Package.SET_ELEMENT__CHAR_SET:
				setCharSet(CHAR_SET_EDEFAULT);
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
			case Antlr4Package.SET_ELEMENT__TOKEN_REF:
				return TOKEN_REF_EDEFAULT == null ? tokenRef != null : !TOKEN_REF_EDEFAULT.equals(tokenRef);
			case Antlr4Package.SET_ELEMENT__STRING_LITERAL:
				return STRING_LITERAL_EDEFAULT == null ? stringLiteral != null : !STRING_LITERAL_EDEFAULT.equals(stringLiteral);
			case Antlr4Package.SET_ELEMENT__RANGE:
				return range != null;
			case Antlr4Package.SET_ELEMENT__CHAR_SET:
				return CHAR_SET_EDEFAULT == null ? charSet != null : !CHAR_SET_EDEFAULT.equals(charSet);
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
		result.append(" (tokenRef: ");
		result.append(tokenRef);
		result.append(", stringLiteral: ");
		result.append(stringLiteral);
		result.append(", charSet: ");
		result.append(charSet);
		result.append(')');
		return result.toString();
	}

} //SetElementImpl
