/**
 */
package br.ufpe.ines.decode.decode;

import br.ufpe.ines.decode.decode.artifacts.ProvidedArtefacts;

import br.ufpe.ines.decode.decode.aux.Identifiable;
import br.ufpe.ines.decode.decode.aux.Nameable;

import br.ufpe.ines.decode.decode.taskDescription.ExecutionDerivations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.CodingExperiment#getTask <em>Task</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.CodingExperiment#getProvidedArtefacts <em>Provided Artefacts</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.DecodePackage#getCodingExperiment()
 * @model
 * @generated
 */
public interface CodingExperiment extends Nameable, Identifiable {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(ExecutionDerivations)
	 * @see br.ufpe.ines.decode.decode.DecodePackage#getCodingExperiment_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionDerivations getTask();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.CodingExperiment#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ExecutionDerivations value);

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
	 * @see br.ufpe.ines.decode.decode.DecodePackage#getCodingExperiment_ProvidedArtefacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedArtefacts getProvidedArtefacts();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.CodingExperiment#getProvidedArtefacts <em>Provided Artefacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Artefacts</em>' containment reference.
	 * @see #getProvidedArtefacts()
	 * @generated
	 */
	void setProvidedArtefacts(ProvidedArtefacts value);

} // CodingExperiment
