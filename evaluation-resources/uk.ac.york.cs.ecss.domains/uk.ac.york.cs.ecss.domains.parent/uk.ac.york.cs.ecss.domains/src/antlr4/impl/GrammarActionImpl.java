/**
 */
package antlr4.impl;

import antlr4.Antlr4Package;
import antlr4.GrammarAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link antlr4.impl.GrammarActionImpl#getAtSymbol <em>At Symbol</em>}</li>
 *   <li>{@link antlr4.impl.GrammarActionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link antlr4.impl.GrammarActionImpl#getColonSymbol <em>Colon Symbol</em>}</li>
 *   <li>{@link antlr4.impl.GrammarActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.impl.GrammarActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrammarActionImpl extends PrequelConstructImpl implements GrammarAction {
	/**
	 * The default value of the '{@link #getAtSymbol() <em>At Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String AT_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtSymbol() <em>At Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtSymbol()
	 * @generated
	 * @ordered
	 */
	protected String atSymbol = AT_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColonSymbol() <em>Colon Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String COLON_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColonSymbol() <em>Colon Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonSymbol()
	 * @generated
	 * @ordered
	 */
	protected String colonSymbol = COLON_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Antlr4Package.Literals.GRAMMAR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAtSymbol() {
		return atSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtSymbol(String newAtSymbol) {
		String oldAtSymbol = atSymbol;
		atSymbol = newAtSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR_ACTION__AT_SYMBOL, oldAtSymbol, atSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR_ACTION__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColonSymbol() {
		return colonSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonSymbol(String newColonSymbol) {
		String oldColonSymbol = colonSymbol;
		colonSymbol = newColonSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR_ACTION__COLON_SYMBOL, oldColonSymbol, colonSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR_ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Antlr4Package.GRAMMAR_ACTION__AT_SYMBOL:
				return getAtSymbol();
			case Antlr4Package.GRAMMAR_ACTION__SCOPE:
				return getScope();
			case Antlr4Package.GRAMMAR_ACTION__COLON_SYMBOL:
				return getColonSymbol();
			case Antlr4Package.GRAMMAR_ACTION__NAME:
				return getName();
			case Antlr4Package.GRAMMAR_ACTION__ACTION:
				return getAction();
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
			case Antlr4Package.GRAMMAR_ACTION__AT_SYMBOL:
				setAtSymbol((String)newValue);
				return;
			case Antlr4Package.GRAMMAR_ACTION__SCOPE:
				setScope((String)newValue);
				return;
			case Antlr4Package.GRAMMAR_ACTION__COLON_SYMBOL:
				setColonSymbol((String)newValue);
				return;
			case Antlr4Package.GRAMMAR_ACTION__NAME:
				setName((String)newValue);
				return;
			case Antlr4Package.GRAMMAR_ACTION__ACTION:
				setAction((String)newValue);
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
			case Antlr4Package.GRAMMAR_ACTION__AT_SYMBOL:
				setAtSymbol(AT_SYMBOL_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR_ACTION__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR_ACTION__COLON_SYMBOL:
				setColonSymbol(COLON_SYMBOL_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR_ACTION__ACTION:
				setAction(ACTION_EDEFAULT);
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
			case Antlr4Package.GRAMMAR_ACTION__AT_SYMBOL:
				return AT_SYMBOL_EDEFAULT == null ? atSymbol != null : !AT_SYMBOL_EDEFAULT.equals(atSymbol);
			case Antlr4Package.GRAMMAR_ACTION__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case Antlr4Package.GRAMMAR_ACTION__COLON_SYMBOL:
				return COLON_SYMBOL_EDEFAULT == null ? colonSymbol != null : !COLON_SYMBOL_EDEFAULT.equals(colonSymbol);
			case Antlr4Package.GRAMMAR_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Antlr4Package.GRAMMAR_ACTION__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
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
		result.append(" (atSymbol: ");
		result.append(atSymbol);
		result.append(", scope: ");
		result.append(scope);
		result.append(", colonSymbol: ");
		result.append(colonSymbol);
		result.append(", name: ");
		result.append(name);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //GrammarActionImpl
