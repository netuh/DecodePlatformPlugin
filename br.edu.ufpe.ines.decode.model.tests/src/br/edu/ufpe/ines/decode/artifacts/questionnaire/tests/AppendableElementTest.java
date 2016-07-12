/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.tests;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnaireFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Appendable Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppendableElementTest extends RestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AppendableElementTest.class);
	}

	/**
	 * Constructs a new Appendable Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppendableElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Appendable Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AppendableElement getFixture() {
		return (AppendableElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createAppendableElement());
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

} //AppendableElementTest
