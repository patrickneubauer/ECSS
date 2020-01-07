/**
 */
package wollokDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSuite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wollokDsl.WSuite#getName <em>Name</em>}</li>
 *   <li>{@link wollokDsl.WSuite#getFixture <em>Fixture</em>}</li>
 *   <li>{@link wollokDsl.WSuite#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see wollokDsl.WollokDslPackage#getWSuite()
 * @model
 * @generated
 */
public interface WSuite extends WMethodContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wollokDsl.WollokDslPackage#getWSuite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wollokDsl.WSuite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fixture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture</em>' containment reference.
	 * @see #setFixture(WFixture)
	 * @see wollokDsl.WollokDslPackage#getWSuite_Fixture()
	 * @model containment="true"
	 * @generated
	 */
	WFixture getFixture();

	/**
	 * Sets the value of the '{@link wollokDsl.WSuite#getFixture <em>Fixture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixture</em>' containment reference.
	 * @see #getFixture()
	 * @generated
	 */
	void setFixture(WFixture value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link wollokDsl.WTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see wollokDsl.WollokDslPackage#getWSuite_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<WTest> getTests();

} // WSuite
