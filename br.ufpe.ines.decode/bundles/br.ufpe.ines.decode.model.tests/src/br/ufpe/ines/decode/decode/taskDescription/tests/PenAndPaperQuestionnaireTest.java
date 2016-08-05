/**
 */
package br.ufpe.ines.decode.decode.taskDescription.tests;

import br.ufpe.ines.decode.decode.taskDescription.PenAndPaperQuestionnaire;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pen And Paper Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PenAndPaperQuestionnaireTest extends QuestionnairemeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PenAndPaperQuestionnaireTest.class);
	}

	/**
	 * Constructs a new Pen And Paper Questionnaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenAndPaperQuestionnaireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pen And Paper Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PenAndPaperQuestionnaire getFixture() {
		return (PenAndPaperQuestionnaire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createPenAndPaperQuestionnaire());
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

} //PenAndPaperQuestionnaireTest
