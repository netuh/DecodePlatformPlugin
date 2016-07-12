/**
 */
package br.edu.ufpe.ines.decode.measurement;

import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;

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
 *   <li>{@link br.edu.ufpe.ines.decode.measurement.TimeOnTask#getRelatedTask <em>Related Task</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.measurement.MeasurementPackage#getTimeOnTask()
 * @model
 * @generated
 */
public interface TimeOnTask extends AbstractMeasurement {
	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Task</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' reference list.
	 * @see br.edu.ufpe.ines.decode.measurement.MeasurementPackage#getTimeOnTask_RelatedTask()
	 * @model
	 * @generated
	 */
	EList<ModeledTask> getRelatedTask();

} // TimeOnTask
