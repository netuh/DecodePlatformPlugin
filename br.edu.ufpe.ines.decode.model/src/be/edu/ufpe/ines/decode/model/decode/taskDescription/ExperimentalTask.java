/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact;
import be.edu.ufpe.ines.decode.model.decode.aux.Nameable;
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
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getRequiredArtifacts <em>Required Artifacts</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask()
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
	 * Returns the value of the '<em><b>Required Artifacts</b></em>' reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Artifacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Artifacts</em>' reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_RequiredArtifacts()
	 * @model
	 * @generated
	 */
	EList<AbstractArtifact> getRequiredArtifacts();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getExperimentalTask_Depends()
	 * @model
	 * @generated
	 */
	EList<ExperimentalTask> getDepends();

} // ExperimentalTask
