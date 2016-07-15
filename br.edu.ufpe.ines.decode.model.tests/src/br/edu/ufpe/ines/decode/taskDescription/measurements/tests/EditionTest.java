/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.tests;

import br.edu.ufpe.ines.decode.taskDescription.measurements.Edition;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditionTest extends ActionsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EditionTest.class);
	}

	/**
	 * Constructs a new Edition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Edition getFixture() {
		return (Edition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createEdition());
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

} //EditionTest
