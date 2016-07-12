/**
 */
package br.edu.ufpe.ines.decode.taskDescription.tests;

import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Experimental Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentalTaskTest extends ModeledTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExperimentalTaskTest.class);
	}

	/**
	 * Constructs a new Experimental Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Experimental Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExperimentalTask getFixture() {
		return (ExperimentalTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createExperimentalTask());
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

} //ExperimentalTaskTest
