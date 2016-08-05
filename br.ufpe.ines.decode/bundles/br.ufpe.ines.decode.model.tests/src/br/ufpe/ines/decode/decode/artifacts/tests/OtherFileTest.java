/**
 */
package br.ufpe.ines.decode.decode.artifacts.tests;

import br.ufpe.ines.decode.decode.artifacts.ArtifactsFactory;
import br.ufpe.ines.decode.decode.artifacts.OtherFile;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Other File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OtherFileTest extends FileArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OtherFileTest.class);
	}

	/**
	 * Constructs a new Other File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Other File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OtherFile getFixture() {
		return (OtherFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createOtherFile());
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

} //OtherFileTest
