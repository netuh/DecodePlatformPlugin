/**
 */
package br.ufpe.ines.decode.decode.taskDescription.tests;

import br.ufpe.ines.decode.decode.taskDescription.EclipseParameter;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Eclipse Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipseParameterTest extends IDEParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EclipseParameterTest.class);
	}

	/**
	 * Constructs a new Eclipse Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Eclipse Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EclipseParameter getFixture() {
		return (EclipseParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskDescriptionFactory.eINSTANCE.createEclipseParameter());
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

} //EclipseParameterTest
