/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact;

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
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getDependency <em>Dependency</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getRequiredArtifact <em>Required Artifact</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask()
 * @model
 * @generated
 */
public interface ExperimentalTask extends ModeledTask {
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
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_NewAttribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getNewAttribute();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getNewAttribute <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' attribute.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExperimentalTask> getDependency();

	/**
	 * Returns the value of the '<em><b>Required Artifact</b></em>' reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Artifact</em>' reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_RequiredArtifact()
	 * @model
	 * @generated
	 */
	EList<ProvidedArtifact> getRequiredArtifact();

} // ExperimentalTask
