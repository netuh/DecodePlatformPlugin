/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;
import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Related Task</b></em>' reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage#getTimeOnTask_RelatedTask()
	 * @model
	 * @generated
	 */
	EList<ModeledTask> getRelatedTask();

} // TimeOnTask
