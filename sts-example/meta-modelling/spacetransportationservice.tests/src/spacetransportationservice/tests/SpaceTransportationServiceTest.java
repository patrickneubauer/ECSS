/**
 */
package spacetransportationservice.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spacetransportationservice.SpaceTransportationService;
import spacetransportationservice.SpacetransportationserviceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Space Transportation Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceTransportationServiceTest extends TestCase {

	/**
	 * The fixture for this Space Transportation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceTransportationService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpaceTransportationServiceTest.class);
	}

	/**
	 * Constructs a new Space Transportation Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceTransportationServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Space Transportation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SpaceTransportationService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Space Transportation Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceTransportationService getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpacetransportationserviceFactory.eINSTANCE.createSpaceTransportationService());
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

} //SpaceTransportationServiceTest
