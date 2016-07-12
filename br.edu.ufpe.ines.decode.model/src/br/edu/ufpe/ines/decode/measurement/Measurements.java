/**
 */
package br.edu.ufpe.ines.decode.measurement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.measurement.Measurements#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.measurement.MeasurementPackage#getMeasurements()
 * @model
 * @generated
 */
public interface Measurements extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.measurement.AbstractMeasurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.measurement.MeasurementPackage#getMeasurements_Measurements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractMeasurement> getMeasurements();

} // Measurements
