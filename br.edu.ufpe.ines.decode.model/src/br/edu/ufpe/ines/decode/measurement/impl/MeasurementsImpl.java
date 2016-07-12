/**
 */
package br.edu.ufpe.ines.decode.measurement.impl;

import br.edu.ufpe.ines.decode.measurement.AbstractMeasurement;
import br.edu.ufpe.ines.decode.measurement.MeasurementPackage;
import br.edu.ufpe.ines.decode.measurement.Measurements;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.measurement.impl.MeasurementsImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementsImpl extends MinimalEObjectImpl.Container implements Measurements {
	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMeasurement> measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementPackage.Literals.MEASUREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMeasurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectContainmentEList<AbstractMeasurement>(AbstractMeasurement.class, this, MeasurementPackage.MEASUREMENTS__MEASUREMENTS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasurementPackage.MEASUREMENTS__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementPackage.MEASUREMENTS__MEASUREMENTS:
				return getMeasurements();
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
			case MeasurementPackage.MEASUREMENTS__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends AbstractMeasurement>)newValue);
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
			case MeasurementPackage.MEASUREMENTS__MEASUREMENTS:
				getMeasurements().clear();
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
			case MeasurementPackage.MEASUREMENTS__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementsImpl
