/**
 */
package br.ufpe.ines.decode.taskDescription;

import br.ufpe.ines.decode.artifacts.AbstractArtifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimental Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.ExperimentalTask#getDepends <em>Depends</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.ExperimentalTask#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask()
 * @model
 * @generated
 */
public interface ExperimentalTask extends ModeledTask {
	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.taskDescription.ExperimentalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_Depends()
	 * @model
	 * @generated
	 */
	EList<ExperimentalTask> getDepends();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.artifacts.AbstractArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_Requires()
	 * @model
	 * @generated
	 */
	EList<AbstractArtifact> getRequires();

} // ExperimentalTask
