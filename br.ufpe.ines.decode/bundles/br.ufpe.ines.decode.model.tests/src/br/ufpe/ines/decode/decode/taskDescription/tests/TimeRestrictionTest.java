/**
 */
package br.ufpe.ines.decode.decode.taskDescription.tests;

import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionFactory;
import br.ufpe.ines.decode.decode.taskDescription.TimeRestriction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeRestrictionTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeRestrictionTest.class);
	}

	/**
	 * Constructs a new Time Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeRestriction getFixture() {
		return (TimeRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createTimeRestriction());
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

} //TimeRestrictionTest
