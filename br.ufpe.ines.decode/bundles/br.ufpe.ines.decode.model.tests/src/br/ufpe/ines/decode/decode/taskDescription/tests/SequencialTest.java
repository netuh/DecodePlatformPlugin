/**
 */
package br.ufpe.ines.decode.decode.taskDescription.tests;

import br.ufpe.ines.decode.decode.taskDescription.Sequencial;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequencial</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencialTest extends ComposedTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequencialTest.class);
	}

	/**
	 * Constructs a new Sequencial test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencialTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequencial test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sequencial getFixture() {
		return (Sequencial)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createSequencial());
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

} //SequencialTest
