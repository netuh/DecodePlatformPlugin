/**
 */
package br.edu.ufpe.ines.decode.taskDescription.tests;

import br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Eclipse Retriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseRetrictionTest extends SpecficRestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EclipseRetrictionTest.class);
	}

	/**
	 * Constructs a new Eclipse Retriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseRetrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Eclipse Retriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EclipseRetriction getFixture() {
		return (EclipseRetriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createEclipseRetriction());
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

} //EclipseRetrictionTest
