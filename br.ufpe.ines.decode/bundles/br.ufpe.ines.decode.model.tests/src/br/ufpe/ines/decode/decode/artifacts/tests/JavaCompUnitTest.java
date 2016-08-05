/**
 */
package br.ufpe.ines.decode.decode.artifacts.tests;

import br.ufpe.ines.decode.decode.artifacts.ArtifactsFactory;
import br.ufpe.ines.decode.decode.artifacts.JavaCompUnit;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaCompUnitTest extends CompilationUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaCompUnitTest.class);
	}

	/**
	 * Constructs a new Java Comp Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaCompUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java Comp Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaCompUnit getFixture() {
		return (JavaCompUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createJavaCompUnit());
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

} //JavaCompUnitTest
