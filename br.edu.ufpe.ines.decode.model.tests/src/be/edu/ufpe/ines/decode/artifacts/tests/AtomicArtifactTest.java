/**
 */
package be.edu.ufpe.ines.decode.artifacts.tests;

import be.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import be.edu.ufpe.ines.decode.artifacts.AtomicArtifact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicArtifactTest extends AbstractArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicArtifactTest.class);
	}

	/**
	 * Constructs a new Atomic Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicArtifact getFixture() {
		return (AtomicArtifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createAtomicArtifact());
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

} //AtomicArtifactTest
