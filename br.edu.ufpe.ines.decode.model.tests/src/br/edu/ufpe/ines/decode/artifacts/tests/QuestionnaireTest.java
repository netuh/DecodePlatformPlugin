/**
 */
package br.edu.ufpe.ines.decode.artifacts.tests;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import br.edu.ufpe.ines.decode.artifacts.Questionnaire;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireTest extends AbstractArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionnaireTest.class);
	}

	/**
	 * Constructs a new Questionnaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Questionnaire getFixture() {
		return (Questionnaire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createQuestionnaire());
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

} //QuestionnaireTest
