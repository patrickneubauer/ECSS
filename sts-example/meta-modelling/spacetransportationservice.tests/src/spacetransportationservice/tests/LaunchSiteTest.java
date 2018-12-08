/**
 */
package spacetransportationservice.tests;

import junit.textui.TestRunner;

import spacetransportationservice.LaunchSite;
import spacetransportationservice.SpacetransportationserviceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Launch Site</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaunchSiteTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LaunchSiteTest.class);
	}

	/**
	 * Constructs a new Launch Site test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchSiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Launch Site test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LaunchSite getFixture() {
		return (LaunchSite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpacetransportationserviceFactory.eINSTANCE.createLaunchSite());
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

} //LaunchSiteTest
