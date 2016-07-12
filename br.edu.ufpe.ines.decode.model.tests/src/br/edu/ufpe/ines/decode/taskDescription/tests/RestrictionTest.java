/**
 */
package br.edu.ufpe.ines.decode.taskDescription.tests;

import br.edu.ufpe.ines.decode.taskDescription.Restriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionTest extends TestCase {

	/**
	 * The fixture for this Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Restriction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestrictionTest.class);
	}

	/**
	 * Constructs a new Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Restriction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Restriction getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createRestriction());
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

} //RestrictionTest
