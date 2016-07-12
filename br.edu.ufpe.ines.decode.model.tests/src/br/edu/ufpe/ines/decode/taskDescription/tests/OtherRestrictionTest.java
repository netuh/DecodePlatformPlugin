/**
 */
package br.edu.ufpe.ines.decode.taskDescription.tests;

import br.edu.ufpe.ines.decode.taskDescription.OtherRestriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Other Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OtherRestrictionTest extends RestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OtherRestrictionTest.class);
	}

	/**
	 * Constructs a new Other Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherRestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Other Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OtherRestriction getFixture() {
		return (OtherRestriction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createOtherRestriction());
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

} //OtherRestrictionTest
