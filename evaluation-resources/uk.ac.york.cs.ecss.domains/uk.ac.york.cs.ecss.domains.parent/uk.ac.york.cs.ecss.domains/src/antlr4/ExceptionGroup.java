/**
 */
package antlr4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link antlr4.ExceptionGroup#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link antlr4.ExceptionGroup#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @see antlr4.Antlr4Package#getExceptionGroup()
 * @model
 * @generated
 */
public interface ExceptionGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link antlr4.ExceptionHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see antlr4.Antlr4Package#getExceptionGroup_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionHandler> getHandlers();

	/**
	 * Returns the value of the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' containment reference.
	 * @see #setFinally(FinallyClause)
	 * @see antlr4.Antlr4Package#getExceptionGroup_Finally()
	 * @model containment="true"
	 * @generated
	 */
	FinallyClause getFinally();

	/**
	 * Sets the value of the '{@link antlr4.ExceptionGroup#getFinally <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally</em>' containment reference.
	 * @see #getFinally()
	 * @generated
	 */
	void setFinally(FinallyClause value);

} // ExceptionGroup
