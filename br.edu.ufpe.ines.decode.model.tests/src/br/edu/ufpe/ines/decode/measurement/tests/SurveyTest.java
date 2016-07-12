/**
 */
package br.edu.ufpe.ines.decode.measurement.tests;

import br.edu.ufpe.ines.decode.measurement.MeasurementFactory;
import br.edu.ufpe.ines.decode.measurement.Survey;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyTest extends AbstractMeasurementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SurveyTest.class);
	}

	/**
	 * Constructs a new Survey test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Survey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Survey getFixture() {
		return (Survey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementFactory.eINSTANCE.createSurvey());
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

} //SurveyTest
