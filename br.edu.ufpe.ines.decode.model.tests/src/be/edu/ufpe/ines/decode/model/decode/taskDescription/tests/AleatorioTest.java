/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription.tests;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.Aleatorio;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aleatorio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AleatorioTest extends ComposedTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AleatorioTest.class);
	}

	/**
	 * Constructs a new Aleatorio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AleatorioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aleatorio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Aleatorio getFixture() {
		return (Aleatorio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createAleatorio());
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

} //AleatorioTest
