/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.tests;

import be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementFactory;
import be.edu.ufpe.ines.decode.model.decode.measurement.ObservingProducedArtifact;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Observing Produced Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObservingProducedArtifactTest extends ObservingArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObservingProducedArtifactTest.class);
	}

	/**
	 * Constructs a new Observing Produced Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingProducedArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Observing Produced Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObservingProducedArtifact getFixture() {
		return (ObservingProducedArtifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MeasurementFactory.eINSTANCE.createObservingProducedArtifact());
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

} //ObservingProducedArtifactTest
