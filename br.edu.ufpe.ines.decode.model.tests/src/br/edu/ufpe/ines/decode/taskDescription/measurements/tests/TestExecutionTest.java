/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.tests;

import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;
import br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Execution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestExecutionTest extends ExecutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestExecutionTest.class);
	}

	/**
	 * Constructs a new Test Execution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestExecutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestExecution getFixture() {
		return (TestExecution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createTestExecution());
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

} //TestExecutionTest
