/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeled Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getModeledTask()
 * @model abstract="true"
 * @generated
 */
public interface ModeledTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(Restriction)
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getModeledTask_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	Restriction getRestriction();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(Restriction value);

} // ModeledTask
