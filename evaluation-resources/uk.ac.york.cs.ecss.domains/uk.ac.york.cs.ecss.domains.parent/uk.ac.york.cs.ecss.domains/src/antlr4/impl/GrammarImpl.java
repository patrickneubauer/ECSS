/**
 */
package antlr4.impl;

import antlr4.Antlr4Package;
import antlr4.Grammar;
import antlr4.GrammarType;
import antlr4.Mode;
import antlr4.PrequelConstruct;
import antlr4.Rule;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link antlr4.impl.GrammarImpl#getType <em>Type</em>}</li>
 *   <li>{@link antlr4.impl.GrammarImpl#getName <em>Name</em>}</li>
 *   <li>{@link antlr4.impl.GrammarImpl#getPrequels <em>Prequels</em>}</li>
 *   <li>{@link antlr4.impl.GrammarImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link antlr4.impl.GrammarImpl#getModes <em>Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrammarImpl extends MinimalEObjectImpl.Container implements Grammar {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GrammarType TYPE_EDEFAULT = GrammarType.DEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GrammarType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getPrequels() <em>Prequels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrequels()
	 * @generated
	 * @ordered
	 */
	protected EList<PrequelConstruct> prequels;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Antlr4Package.Literals.GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrammarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(GrammarType newType) {
		GrammarType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Antlr4Package.GRAMMAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrequelConstruct> getPrequels() {
		if (prequels == null) {
			prequels = new EObjectContainmentEList<PrequelConstruct>(PrequelConstruct.class, this, Antlr4Package.GRAMMAR__PREQUELS);
		}
		return prequels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, Antlr4Package.GRAMMAR__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, Antlr4Package.GRAMMAR__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Antlr4Package.GRAMMAR__PREQUELS:
				return ((InternalEList<?>)getPrequels()).basicRemove(otherEnd, msgs);
			case Antlr4Package.GRAMMAR__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case Antlr4Package.GRAMMAR__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
			case Antlr4Package.GRAMMAR__TYPE:
				return getType();
			case Antlr4Package.GRAMMAR__NAME:
				return getName();
			case Antlr4Package.GRAMMAR__PREQUELS:
				return getPrequels();
			case Antlr4Package.GRAMMAR__RULES:
				return getRules();
			case Antlr4Package.GRAMMAR__MODES:
				return getModes();
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
			case Antlr4Package.GRAMMAR__TYPE:
				setType((GrammarType)newValue);
				return;
			case Antlr4Package.GRAMMAR__NAME:
				setName((String)newValue);
				return;
			case Antlr4Package.GRAMMAR__PREQUELS:
				getPrequels().clear();
				getPrequels().addAll((Collection<? extends PrequelConstruct>)newValue);
				return;
			case Antlr4Package.GRAMMAR__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case Antlr4Package.GRAMMAR__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
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
			case Antlr4Package.GRAMMAR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Antlr4Package.GRAMMAR__PREQUELS:
				getPrequels().clear();
				return;
			case Antlr4Package.GRAMMAR__RULES:
				getRules().clear();
				return;
			case Antlr4Package.GRAMMAR__MODES:
				getModes().clear();
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
			case Antlr4Package.GRAMMAR__TYPE:
				return type != TYPE_EDEFAULT;
			case Antlr4Package.GRAMMAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Antlr4Package.GRAMMAR__PREQUELS:
				return prequels != null && !prequels.isEmpty();
			case Antlr4Package.GRAMMAR__RULES:
				return rules != null && !rules.isEmpty();
			case Antlr4Package.GRAMMAR__MODES:
				return modes != null && !modes.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GrammarImpl
