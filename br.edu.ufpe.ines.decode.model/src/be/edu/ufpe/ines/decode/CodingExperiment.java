/**
 */
package be.edu.ufpe.ines.decode;

import be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts;

import be.edu.ufpe.ines.decode.aux.Nameable;

import be.edu.ufpe.ines.decode.measurement.Measurements;

import be.edu.ufpe.ines.decode.taskDescription.ModeledTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.CodingExperiment#getTask <em>Task</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.CodingExperiment#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.CodingExperiment#getProvidedArtefacts <em>Provided Artefacts</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.DecodePackage#getCodingExperiment()
 * @model
 * @generated
 */
public interface CodingExperiment extends Nameable {
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
	 * @see be.edu.ufpe.ines.decode.DecodePackage#getCodingExperiment_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeledTask getTask();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.CodingExperiment#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ModeledTask value);

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
	 * @see be.edu.ufpe.ines.decode.DecodePackage#getCodingExperiment_Measurements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Measurements getMeasurements();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.CodingExperiment#getMeasurements <em>Measurements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurements</em>' containment reference.
	 * @see #getMeasurements()
	 * @generated
	 */
	void setMeasurements(Measurements value);

	/**
	 * Returns the value of the '<em><b>Provided Artefacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Artefacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Artefacts</em>' containment reference.
	 * @see #setProvidedArtefacts(ProvidedArtefacts)
	 * @see be.edu.ufpe.ines.decode.DecodePackage#getCodingExperiment_ProvidedArtefacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedArtefacts getProvidedArtefacts();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.CodingExperiment#getProvidedArtefacts <em>Provided Artefacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Artefacts</em>' containment reference.
	 * @see #getProvidedArtefacts()
	 * @generated
	 */
	void setProvidedArtefacts(ProvidedArtefacts value);

} // CodingExperiment
