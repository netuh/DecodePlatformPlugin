/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.tests;

import br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Any Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyActionTest extends ActionsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnyActionTest.class);
	}

	/**
	 * Constructs a new Any Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Any Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnyAction getFixture() {
		return (AnyAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementsFactory.eINSTANCE.createAnyAction());
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

} //AnyActionTest
