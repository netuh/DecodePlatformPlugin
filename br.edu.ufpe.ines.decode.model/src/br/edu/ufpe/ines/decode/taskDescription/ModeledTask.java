/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.aux.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeled Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask()
 * @model abstract="true"
 * @generated
 */
public interface ModeledTask extends Nameable {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(ModeledRestrictions)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	ModeledRestrictions getRestriction();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(ModeledRestrictions value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference.
	 * @see #setPlacement(PlacementQuestionnaire)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask_Placement()
	 * @model containment="true"
	 * @generated
	 */
	PlacementQuestionnaire getPlacement();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getPlacement <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' containment reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementQuestionnaire value);

} // ModeledTask
