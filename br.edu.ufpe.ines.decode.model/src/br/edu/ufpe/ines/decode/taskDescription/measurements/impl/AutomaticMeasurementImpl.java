/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.impl;

import br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementImpl;

import br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement;
import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automatic Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AutomaticMeasurementImpl#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AutomaticMeasurementImpl extends MeasurementImpl implements AutomaticMeasurement {
	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<LogType> log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomaticMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementsPackage.Literals.AUTOMATIC_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogType> getLog() {
		if (log == null) {
			log = new EDataTypeUniqueEList<LogType>(LogType.class, this, MeasurementsPackage.AUTOMATIC_MEASUREMENT__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementsPackage.AUTOMATIC_MEASUREMENT__LOG:
				return getLog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasurementsPackage.AUTOMATIC_MEASUREMENT__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MeasurementsPackage.AUTOMATIC_MEASUREMENT__LOG:
				getLog().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MeasurementsPackage.AUTOMATIC_MEASUREMENT__LOG:
				return log != null && !log.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}

} //AutomaticMeasurementImpl
