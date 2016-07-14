/**
 */
package br.edu.ufpe.ines.decode.taskDescription.tests;

import br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Placement Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementQuestionnaireTest extends MeasurementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlacementQuestionnaireTest.class);
	}

	/**
	 * Constructs a new Placement Questionnaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementQuestionnaireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Placement Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlacementQuestionnaire getFixture() {
		return (PlacementQuestionnaire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createPlacementQuestionnaire());
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

} //PlacementQuestionnaireTest
