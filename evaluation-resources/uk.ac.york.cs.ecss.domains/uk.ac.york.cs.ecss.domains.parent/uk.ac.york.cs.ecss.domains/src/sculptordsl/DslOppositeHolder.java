/**
 */
package sculptordsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Opposite Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptordsl.DslOppositeHolder#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see sculptordsl.SculptordslPackage#getDslOppositeHolder()
 * @model
 * @generated
 */
public interface DslOppositeHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(DslReference)
	 * @see sculptordsl.SculptordslPackage#getDslOppositeHolder_Opposite()
	 * @model
	 * @generated
	 */
	DslReference getOpposite();

	/**
	 * Sets the value of the '{@link sculptordsl.DslOppositeHolder#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(DslReference value);

} // DslOppositeHolder
