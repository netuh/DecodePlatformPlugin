/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.tests;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.Content;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnaireFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentTest extends TestCase {

	/**
	 * The fixture for this Content test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Content fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContentTest.class);
	}

	/**
	 * Constructs a new Content test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Content test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Content fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Content test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Content getFixture() {
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
		setFixture(QuestionnaireFactory.eINSTANCE.createContent());
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

} //ContentTest
