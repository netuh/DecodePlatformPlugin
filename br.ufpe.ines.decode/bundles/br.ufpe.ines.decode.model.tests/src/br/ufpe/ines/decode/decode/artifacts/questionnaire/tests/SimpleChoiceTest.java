/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire.tests;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnaireFactory;
import br.ufpe.ines.decode.decode.artifacts.questionnaire.SimpleChoice;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Choice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleChoiceTest extends ComposedQuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleChoiceTest.class);
	}

	/**
	 * Constructs a new Simple Choice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleChoiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Choice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleChoice getFixture() {
		return (SimpleChoice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createSimpleChoice());
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

} //SimpleChoiceTest
