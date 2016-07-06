/**
 */
package be.edu.ufpe.ines.decode.measurement;

import be.edu.ufpe.ines.decode.artifacts.AtomicArtifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observing Provided Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact#getObservedArtifact <em>Observed Artifact</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage#getObservingProvidedArtifact()
 * @model
 * @generated
 */
public interface ObservingProvidedArtifact extends ObservingArtifact {
	/**
	 * Returns the value of the '<em><b>Observed Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Artifact</em>' reference.
	 * @see #setObservedArtifact(AtomicArtifact)
	 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage#getObservingProvidedArtifact_ObservedArtifact()
	 * @model required="true"
	 * @generated
	 */
	AtomicArtifact getObservedArtifact();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact#getObservedArtifact <em>Observed Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Artifact</em>' reference.
	 * @see #getObservedArtifact()
	 * @generated
	 */
	void setObservedArtifact(AtomicArtifact value);

} // ObservingProvidedArtifact
