/**
 */
package spacetransportationservice.tests;

import junit.textui.TestRunner;

import spacetransportationservice.EngineType;
import spacetransportationservice.SpacetransportationserviceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Engine Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineTypeTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EngineTypeTest.class);
	}

	/**
	 * Constructs a new Engine Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Engine Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EngineType getFixture() {
		return (EngineType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpacetransportationserviceFactory.eINSTANCE.createEngineType());
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

} //EngineTypeTest
