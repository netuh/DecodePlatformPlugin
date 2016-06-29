/**
 */
package be.edu.ufpe.ines.decode.model.decode;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact;

import be.edu.ufpe.ines.decode.model.decode.measurement.Measurements;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.CodingExperiment#getTask <em>Task</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.CodingExperiment#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.CodingExperiment#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.DecodePackage#getCodingExperiment()
 * @model
 * @generated
 */
public interface CodingExperiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(ModeledTask)
	 * @see be.edu.ufpe.ines.decode.model.decode.DecodePackage#getCodingExperiment_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeledTask getTask();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.CodingExperiment#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ModeledTask value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.DecodePackage#getCodingExperiment_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedArtifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference.
	 * @see #setMeasurements(Measurements)
	 * @see be.edu.ufpe.ines.decode.model.decode.DecodePackage#getCodingExperiment_Measurements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Measurements getMeasurements();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.CodingExperiment#getMeasurements <em>Measurements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurements</em>' containment reference.
	 * @see #getMeasurements()
	 * @generated
	 */
	void setMeasurements(Measurements value);

} // CodingExperiment
