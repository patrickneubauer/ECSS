/**
 * generated by Xtext 2.15.0
 */
package uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.RegexGroup;
import uk.ac.york.cs.ecss.simpleregexp.simplereg.simpleReg.SimpleRegFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regex Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegexGroupTest extends AbstractElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegexGroupTest.class);
	}

	/**
	 * Constructs a new Regex Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Regex Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegexGroup getFixture() {
		return (RegexGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleRegFactory.eINSTANCE.createRegexGroup());
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

} //RegexGroupTest
