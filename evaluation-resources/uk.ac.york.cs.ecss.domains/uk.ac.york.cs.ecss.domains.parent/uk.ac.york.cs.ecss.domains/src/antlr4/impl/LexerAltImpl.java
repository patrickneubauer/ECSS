/**
 */
package antlr4.impl;

import antlr4.Antlr4Package;
import antlr4.LexerAlt;
import antlr4.LexerCommands;
import antlr4.LexerElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexer Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link antlr4.impl.LexerAltImpl#getBody <em>Body</em>}</li>
 *   <li>{@link antlr4.impl.LexerAltImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LexerAltImpl extends MinimalEObjectImpl.Container implements LexerAlt {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected LexerElements body;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected LexerCommands commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexerAltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Antlr4Package.Literals.LEXER_ALT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerElements getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(LexerElements newBody, NotificationChain msgs) {
		LexerElements oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Antlr4Package.LEXER_ALT__BODY, oldBody, newBody);
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
	public void setBody(LexerElements newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.LEXER_ALT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.LEXER_ALT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.LEXER_ALT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LexerCommands getCommands() {
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommands(LexerCommands newCommands, NotificationChain msgs) {
		LexerCommands oldCommands = commands;
		commands = newCommands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Antlr4Package.LEXER_ALT__COMMANDS, oldCommands, newCommands);
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
	public void setCommands(LexerCommands newCommands) {
		if (newCommands != commands) {
			NotificationChain msgs = null;
			if (commands != null)
				msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.LEXER_ALT__COMMANDS, null, msgs);
			if (newCommands != null)
				msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Antlr4Package.LEXER_ALT__COMMANDS, null, msgs);
			msgs = basicSetCommands(newCommands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.LEXER_ALT__COMMANDS, newCommands, newCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Antlr4Package.LEXER_ALT__BODY:
				return basicSetBody(null, msgs);
			case Antlr4Package.LEXER_ALT__COMMANDS:
				return basicSetCommands(null, msgs);
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
			case Antlr4Package.LEXER_ALT__BODY:
				return getBody();
			case Antlr4Package.LEXER_ALT__COMMANDS:
				return getCommands();
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
			case Antlr4Package.LEXER_ALT__BODY:
				setBody((LexerElements)newValue);
				return;
			case Antlr4Package.LEXER_ALT__COMMANDS:
				setCommands((LexerCommands)newValue);
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
			case Antlr4Package.LEXER_ALT__BODY:
				setBody((LexerElements)null);
				return;
			case Antlr4Package.LEXER_ALT__COMMANDS:
				setCommands((LexerCommands)null);
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
			case Antlr4Package.LEXER_ALT__BODY:
				return body != null;
			case Antlr4Package.LEXER_ALT__COMMANDS:
				return commands != null;
		}
		return super.eIsSet(featureID);
	}

} //LexerAltImpl
