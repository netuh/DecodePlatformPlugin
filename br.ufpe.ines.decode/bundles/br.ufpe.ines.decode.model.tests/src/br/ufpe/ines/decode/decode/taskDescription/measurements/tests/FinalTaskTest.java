/**
 */
package br.ufpe.ines.decode.decode.taskDescription.measurements.tests;

import br.ufpe.ines.decode.decode.taskDescription.measurements.FinalTask;
import br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Final Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalTaskTest extends AutomaticMeasurementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinalTaskTest.class);
	}

	/**
	 * Constructs a new Final Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Final Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FinalTask getFixture() {
		return (FinalTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createFinalTask());
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

} //FinalTaskTest
