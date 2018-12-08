/**
 */
package spacetransportationservice.tests;

import junit.textui.TestRunner;

import spacetransportationservice.SpacetransportationserviceFactory;
import spacetransportationservice.Stage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StageTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StageTest.class);
	}

	/**
	 * Constructs a new Stage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stage getFixture() {
		return (Stage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpacetransportationserviceFactory.eINSTANCE.createStage());
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

} //StageTest
