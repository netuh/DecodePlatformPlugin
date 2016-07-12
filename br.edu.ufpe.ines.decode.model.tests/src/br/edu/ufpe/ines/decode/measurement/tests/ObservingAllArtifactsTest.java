/**
 */
package br.edu.ufpe.ines.decode.measurement.tests;

import br.edu.ufpe.ines.decode.measurement.MeasurementFactory;
import br.edu.ufpe.ines.decode.measurement.ObservingAllArtifacts;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Observing All Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObservingAllArtifactsTest extends ObservingArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObservingAllArtifactsTest.class);
	}

	/**
	 * Constructs a new Observing All Artifacts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingAllArtifactsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Observing All Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObservingAllArtifacts getFixture() {
		return (ObservingAllArtifacts)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementFactory.eINSTANCE.createObservingAllArtifacts());
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

} //ObservingAllArtifactsTest
