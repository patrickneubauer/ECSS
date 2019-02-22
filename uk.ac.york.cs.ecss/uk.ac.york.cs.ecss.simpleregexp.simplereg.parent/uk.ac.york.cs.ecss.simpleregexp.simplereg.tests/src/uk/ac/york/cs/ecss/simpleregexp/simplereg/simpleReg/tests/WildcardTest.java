/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.SimpleRegFactory;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.Wildcard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WildcardTest extends AbstractElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WildcardTest.class);
	}

	/**
	 * Constructs a new Wildcard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildcardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wildcard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Wildcard getFixture() {
		return (Wildcard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleRegFactory.eINSTANCE.createWildcard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WildcardTest
