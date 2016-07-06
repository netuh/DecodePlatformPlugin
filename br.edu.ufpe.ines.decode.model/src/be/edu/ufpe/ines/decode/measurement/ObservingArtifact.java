/**
 */
package be.edu.ufpe.ines.decode.measurement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observing Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.measurement.ObservingArtifact#getAspect <em>Aspect</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage#getObservingArtifact()
 * @model abstract="true"
 * @generated
 */
public interface ObservingArtifact extends AbstractMeasurement {
	/**
	 * Returns the value of the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect</em>' containment reference.
	 * @see #setAspect(AspectObserved)
	 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage#getObservingArtifact_Aspect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AspectObserved getAspect();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.measurement.ObservingArtifact#getAspect <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect</em>' containment reference.
	 * @see #getAspect()
	 * @generated
	 */
	void setAspect(AspectObserved value);

} // ObservingArtifact
