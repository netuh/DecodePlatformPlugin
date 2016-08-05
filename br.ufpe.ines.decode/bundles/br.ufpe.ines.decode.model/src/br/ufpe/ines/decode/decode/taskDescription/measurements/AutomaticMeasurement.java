/**
 */
package br.ufpe.ines.decode.decode.taskDescription.measurements;

import br.ufpe.ines.decode.decode.taskDescription.Measurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.measurements.AutomaticMeasurement#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage#getAutomaticMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface AutomaticMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute list.
	 * The list contents are of type {@link br.ufpe.ines.decode.decode.taskDescription.measurements.LogType}.
	 * The literals are from the enumeration {@link br.ufpe.ines.decode.decode.taskDescription.measurements.LogType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute list.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.LogType
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage#getAutomaticMeasurement_Log()
	 * @model upper="2"
	 * @generated
	 */
	EList<LogType> getLog();

} // AutomaticMeasurement
