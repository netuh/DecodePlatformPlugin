/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire.tests;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.MultiChoice;
import br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnaireFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Choice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiChoiceTest extends ComposedQuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiChoiceTest.class);
	}

	/**
	 * Constructs a new Multi Choice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiChoiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Choice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiChoice getFixture() {
		return (MultiChoice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createMultiChoice());
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

} //MultiChoiceTest
