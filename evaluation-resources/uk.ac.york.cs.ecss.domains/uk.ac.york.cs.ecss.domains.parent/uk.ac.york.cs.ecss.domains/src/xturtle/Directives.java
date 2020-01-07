/**
 */
package xturtle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xturtle.Directives#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @see xturtle.XturtlePackage#getDirectives()
 * @model
 * @generated
 */
public interface Directives extends EObject {
	/**
	 * Returns the value of the '<em><b>Directive</b></em>' containment reference list.
	 * The list contents are of type {@link xturtle.Directive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive</em>' containment reference list.
	 * @see xturtle.XturtlePackage#getDirectives_Directive()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directive> getDirective();

} // Directives
