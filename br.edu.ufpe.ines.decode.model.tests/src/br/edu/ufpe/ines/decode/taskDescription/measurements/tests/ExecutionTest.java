/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.tests;

import br.edu.ufpe.ines.decode.taskDescription.measurements.Execution;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionTest extends ObservingArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutionTest.class);
	}

	/**
	 * Constructs a new Execution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Execution getFixture() {
		return (Execution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createExecution());
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

} //ExecutionTest
