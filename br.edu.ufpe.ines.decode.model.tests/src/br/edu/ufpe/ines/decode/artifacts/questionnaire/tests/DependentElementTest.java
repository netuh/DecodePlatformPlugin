/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.tests;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnaireFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependent Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependentElementTest extends RestrictionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependentElementTest.class);
	}

	/**
	 * Constructs a new Dependent Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependent Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DependentElement getFixture() {
		return (DependentElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createDependentElement());
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

} //DependentElementTest
