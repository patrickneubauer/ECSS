/**
 */
package rIMDsl.impl;

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

import rIMDsl.Expression;
import rIMDsl.LinkId;
import rIMDsl.RIMDslPackage;
import rIMDsl.SourceField;
import rIMDsl.Title;
import rIMDsl.TransitionSpec;
import rIMDsl.UriLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rIMDsl.impl.TransitionSpecImpl#getEval <em>Eval</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionSpecImpl#getUriLinks <em>Uri Links</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionSpecImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionSpecImpl#getId <em>Id</em>}</li>
 *   <li>{@link rIMDsl.impl.TransitionSpecImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionSpecImpl extends MinimalEObjectImpl.Container implements TransitionSpec {
	/**
	 * The cached value of the '{@link #getEval() <em>Eval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEval()
	 * @generated
	 * @ordered
	 */
	protected Expression eval;

	/**
	 * The cached value of the '{@link #getUriLinks() <em>Uri Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<UriLink> uriLinks;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Title title;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected LinkId id;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected SourceField field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RIMDslPackage.Literals.TRANSITION_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getEval() {
		return eval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEval(Expression newEval, NotificationChain msgs) {
		Expression oldEval = eval;
		eval = newEval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__EVAL, oldEval, newEval);
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
	public void setEval(Expression newEval) {
		if (newEval != eval) {
			NotificationChain msgs = null;
			if (eval != null)
				msgs = ((InternalEObject)eval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__EVAL, null, msgs);
			if (newEval != null)
				msgs = ((InternalEObject)newEval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__EVAL, null, msgs);
			msgs = basicSetEval(newEval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__EVAL, newEval, newEval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UriLink> getUriLinks() {
		if (uriLinks == null) {
			uriLinks = new EObjectContainmentEList<UriLink>(UriLink.class, this, RIMDslPackage.TRANSITION_SPEC__URI_LINKS);
		}
		return uriLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs) {
		Title oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__TITLE, oldTitle, newTitle);
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
	public void setTitle(Title newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkId getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(LinkId newId, NotificationChain msgs) {
		LinkId oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__ID, oldId, newId);
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
	public void setId(LinkId newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceField getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(SourceField newField, NotificationChain msgs) {
		SourceField oldField = field;
		field = newField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__FIELD, oldField, newField);
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
	public void setField(SourceField newField) {
		if (newField != field) {
			NotificationChain msgs = null;
			if (field != null)
				msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__FIELD, null, msgs);
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RIMDslPackage.TRANSITION_SPEC__FIELD, null, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RIMDslPackage.TRANSITION_SPEC__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RIMDslPackage.TRANSITION_SPEC__EVAL:
				return basicSetEval(null, msgs);
			case RIMDslPackage.TRANSITION_SPEC__URI_LINKS:
				return ((InternalEList<?>)getUriLinks()).basicRemove(otherEnd, msgs);
			case RIMDslPackage.TRANSITION_SPEC__TITLE:
				return basicSetTitle(null, msgs);
			case RIMDslPackage.TRANSITION_SPEC__ID:
				return basicSetId(null, msgs);
			case RIMDslPackage.TRANSITION_SPEC__FIELD:
				return basicSetField(null, msgs);
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
			case RIMDslPackage.TRANSITION_SPEC__EVAL:
				return getEval();
			case RIMDslPackage.TRANSITION_SPEC__URI_LINKS:
				return getUriLinks();
			case RIMDslPackage.TRANSITION_SPEC__TITLE:
				return getTitle();
			case RIMDslPackage.TRANSITION_SPEC__ID:
				return getId();
			case RIMDslPackage.TRANSITION_SPEC__FIELD:
				return getField();
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
			case RIMDslPackage.TRANSITION_SPEC__EVAL:
				setEval((Expression)newValue);
				return;
			case RIMDslPackage.TRANSITION_SPEC__URI_LINKS:
				getUriLinks().clear();
				getUriLinks().addAll((Collection<? extends UriLink>)newValue);
				return;
			case RIMDslPackage.TRANSITION_SPEC__TITLE:
				setTitle((Title)newValue);
				return;
			case RIMDslPackage.TRANSITION_SPEC__ID:
				setId((LinkId)newValue);
				return;
			case RIMDslPackage.TRANSITION_SPEC__FIELD:
				setField((SourceField)newValue);
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
			case RIMDslPackage.TRANSITION_SPEC__EVAL:
				setEval((Expression)null);
				return;
			case RIMDslPackage.TRANSITION_SPEC__URI_LINKS:
				getUriLinks().clear();
				return;
			case RIMDslPackage.TRANSITION_SPEC__TITLE:
				setTitle((Title)null);
				return;
			case RIMDslPackage.TRANSITION_SPEC__ID:
				setId((LinkId)null);
				return;
			case RIMDslPackage.TRANSITION_SPEC__FIELD:
				setField((SourceField)null);
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
			case RIMDslPackage.TRANSITION_SPEC__EVAL:
				return eval != null;
			case RIMDslPackage.TRANSITION_SPEC__URI_LINKS:
				return uriLinks != null && !uriLinks.isEmpty();
			case RIMDslPackage.TRANSITION_SPEC__TITLE:
				return title != null;
			case RIMDslPackage.TRANSITION_SPEC__ID:
				return id != null;
			case RIMDslPackage.TRANSITION_SPEC__FIELD:
				return field != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionSpecImpl
