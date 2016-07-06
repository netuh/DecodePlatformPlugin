/**
 */
package be.edu.ufpe.ines.decode.measurement.tests;

import be.edu.ufpe.ines.decode.measurement.MeasurementFactory;
import be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Observing Provided Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObservingProvidedArtifactTest extends ObservingArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObservingProvidedArtifactTest.class);
	}

	/**
	 * Constructs a new Observing Provided Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingProvidedArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Observing Provided Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObservingProvidedArtifact getFixture() {
		return (ObservingProvidedArtifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementFactory.eINSTANCE.createObservingProvidedArtifact());
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

} //ObservingProvidedArtifactTest
