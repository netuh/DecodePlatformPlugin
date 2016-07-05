/**
 */
package be.edu.ufpe.ines.decode.model.decode.tests;

import be.edu.ufpe.ines.decode.model.decode.CodingExperiment;
import be.edu.ufpe.ines.decode.model.decode.DecodeFactory;

import be.edu.ufpe.ines.decode.model.decode.aux.tests.NameableTest;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodingExperimentTest extends NameableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodingExperimentTest.class);
	}

	/**
	 * Constructs a new Coding Experiment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingExperimentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Coding Experiment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CodingExperiment getFixture() {
		return (CodingExperiment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DecodeFactory.eINSTANCE.createCodingExperiment());
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

} //CodingExperimentTest
