/**
 */
package br.edu.ufpe.ines.decode.artifacts.tests;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Questionnaire Inner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireInnerTest extends AbstractArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionnaireInnerTest.class);
	}

	/**
	 * Constructs a new Questionnaire Inner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireInnerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Questionnaire Inner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuestionnaireInner getFixture() {
		return (QuestionnaireInner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createQuestionnaireInner());
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

} //QuestionnaireInnerTest
