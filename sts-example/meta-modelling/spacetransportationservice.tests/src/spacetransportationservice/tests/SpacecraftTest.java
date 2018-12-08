/**
 */
package spacetransportationservice.tests;

import junit.textui.TestRunner;

import spacetransportationservice.Spacecraft;
import spacetransportationservice.SpacetransportationserviceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spacecraft</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacecraftTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpacecraftTest.class);
	}

	/**
	 * Constructs a new Spacecraft test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Spacecraft test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Spacecraft getFixture() {
		return (Spacecraft)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpacetransportationserviceFactory.eINSTANCE.createSpacecraft());
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

} //SpacecraftTest
