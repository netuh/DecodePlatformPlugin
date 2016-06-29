/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time On Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask#getRelatedTask <em>Related Task</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage#getTimeOnTask()
 * @model
 * @generated
 */
public interface TimeOnTask extends AbstractMeasurement {
	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' reference.
	 * @see #setRelatedTask(ModeledTask)
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage#getTimeOnTask_RelatedTask()
	 * @model
	 * @generated
	 */
	ModeledTask getRelatedTask();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask#getRelatedTask <em>Related Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Task</em>' reference.
	 * @see #getRelatedTask()
	 * @generated
	 */
	void setRelatedTask(ModeledTask value);

} // TimeOnTask
