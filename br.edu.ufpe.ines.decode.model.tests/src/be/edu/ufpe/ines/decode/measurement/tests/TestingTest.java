/**
 */
package be.edu.ufpe.ines.decode.measurement.tests;

import be.edu.ufpe.ines.decode.measurement.MeasurementFactory;
import be.edu.ufpe.ines.decode.measurement.Testing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingTest extends ExecutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestingTest.class);
	}

	/**
	 * Constructs a new Testing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Testing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Testing getFixture() {
		return (Testing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementFactory.eINSTANCE.createTesting());
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

} //TestingTest
