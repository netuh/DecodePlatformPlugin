/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.artifacts.FileArtifact;

import br.edu.ufpe.ines.decode.aux.Nameable;

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
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getRequiredArtifacts <em>Required Artifacts</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask()
 * @model
 * @generated
 */
public interface ExperimentalTask extends ModeledTask, Nameable {
	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' attribute.
	 * @see #setNewAttribute(Boolean)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_NewAttribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getNewAttribute();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(Boolean value);

	/**
	 * Returns the value of the '<em><b>Required Artifacts</b></em>' reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.artifacts.FileArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Artifacts</em>' reference list.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_RequiredArtifacts()
	 * @model
	 * @generated
	 */
	EList<FileArtifact> getRequiredArtifacts();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_Depends()
	 * @model
	 * @generated
	 */
	EList<ExperimentalTask> getDepends();

} // ExperimentalTask
