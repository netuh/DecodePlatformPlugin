/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.tests;

import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;
import br.edu.ufpe.ines.decode.taskDescription.measurements.TimeOnTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time On Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeOnTaskTest extends OtherMeasurementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeOnTaskTest.class);
	}

	/**
	 * Constructs a new Time On Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOnTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time On Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeOnTask getFixture() {
		return (TimeOnTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createTimeOnTask());
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

} //TimeOnTaskTest
