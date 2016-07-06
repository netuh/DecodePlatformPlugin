/**
 */
package be.edu.ufpe.ines.decode.artifacts.tests;

import be.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import be.edu.ufpe.ines.decode.artifacts.ComplexArtifact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexArtifactTest extends AbstractArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexArtifactTest.class);
	}

	/**
	 * Constructs a new Complex Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexArtifact getFixture() {
		return (ComplexArtifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createComplexArtifact());
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

} //ComplexArtifactTest
