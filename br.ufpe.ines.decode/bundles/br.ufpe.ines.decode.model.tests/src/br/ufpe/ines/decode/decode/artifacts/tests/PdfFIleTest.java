/**
 */
package br.ufpe.ines.decode.decode.artifacts.tests;

import br.ufpe.ines.decode.decode.artifacts.ArtifactsFactory;
import br.ufpe.ines.decode.decode.artifacts.PdfFIle;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pdf FIle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PdfFIleTest extends FileArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PdfFIleTest.class);
	}

	/**
	 * Constructs a new Pdf FIle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PdfFIleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pdf FIle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PdfFIle getFixture() {
		return (PdfFIle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArtifactsFactory.eINSTANCE.createPdfFIle());
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

} //PdfFIleTest
