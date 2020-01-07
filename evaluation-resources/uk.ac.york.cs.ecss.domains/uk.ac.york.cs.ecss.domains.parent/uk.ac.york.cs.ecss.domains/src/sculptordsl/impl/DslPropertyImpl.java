/**
 */
package sculptordsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sculptordsl.DslProperty;
import sculptordsl.SculptordslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.impl.DslPropertyImpl#getDatabaseColumn <em>Database Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DslPropertyImpl extends DslAnyPropertyImpl implements DslProperty {
	/**
	 * The default value of the '{@link #getDatabaseColumn() <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseColumn() <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumn()
	 * @generated
	 * @ordered
	 */
	protected String databaseColumn = DATABASE_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptordslPackage.Literals.DSL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseColumn() {
		return databaseColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseColumn(String newDatabaseColumn) {
		String oldDatabaseColumn = databaseColumn;
		databaseColumn = newDatabaseColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptordslPackage.DSL_PROPERTY__DATABASE_COLUMN, oldDatabaseColumn, databaseColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptordslPackage.DSL_PROPERTY__DATABASE_COLUMN:
				return getDatabaseColumn();
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
			case SculptordslPackage.DSL_PROPERTY__DATABASE_COLUMN:
				setDatabaseColumn((String)newValue);
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
			case SculptordslPackage.DSL_PROPERTY__DATABASE_COLUMN:
				setDatabaseColumn(DATABASE_COLUMN_EDEFAULT);
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
			case SculptordslPackage.DSL_PROPERTY__DATABASE_COLUMN:
				return DATABASE_COLUMN_EDEFAULT == null ? databaseColumn != null : !DATABASE_COLUMN_EDEFAULT.equals(databaseColumn);
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
		result.append(" (databaseColumn: ");
		result.append(databaseColumn);
		result.append(')');
		return result.toString();
	}

} //DslPropertyImpl
