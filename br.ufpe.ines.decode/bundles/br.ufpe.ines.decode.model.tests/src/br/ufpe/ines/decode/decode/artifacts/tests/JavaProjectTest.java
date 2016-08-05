/**
 */
package br.ufpe.ines.decode.decode.artifacts.tests;

import br.ufpe.ines.decode.decode.artifacts.ArtifactsFactory;
import br.ufpe.ines.decode.decode.artifacts.JavaProject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaProjectTest extends ProjectIDETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaProjectTest.class);
	}

	/**
	 * Constructs a new Java Project test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaProjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaProject getFixture() {
		return (JavaProject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createJavaProject());
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

} //JavaProjectTest
