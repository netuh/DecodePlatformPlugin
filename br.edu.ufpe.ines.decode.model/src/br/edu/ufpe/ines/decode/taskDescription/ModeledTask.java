/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.aux.Identifiable;
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
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask()
 * @model abstract="true"
 * @generated
 */
public interface ModeledTask extends Nameable, Identifiable {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(OtherParameters)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	OtherParameters getRestriction();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(OtherParameters value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference.
	 * @see #setMeasurements(Measurements)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getModeledTask_Measurements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Measurements getMeasurements();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements <em>Measurements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurements</em>' containment reference.
	 * @see #getMeasurements()
	 * @generated
	 */
	void setMeasurements(Measurements value);

} // ModeledTask
