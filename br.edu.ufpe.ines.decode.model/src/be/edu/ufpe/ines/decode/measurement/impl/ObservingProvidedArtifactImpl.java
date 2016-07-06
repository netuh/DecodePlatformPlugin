/**
 */
package be.edu.ufpe.ines.decode.measurement.impl;

import be.edu.ufpe.ines.decode.artifacts.AtomicArtifact;

import be.edu.ufpe.ines.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observing Provided Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingProvidedArtifactImpl#getObservedArtifact <em>Observed Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservingProvidedArtifactImpl extends ObservingArtifactImpl implements ObservingProvidedArtifact {
	/**
	 * The cached value of the '{@link #getObservedArtifact() <em>Observed Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedArtifact()
	 * @generated
	 * @ordered
	 */
	protected AtomicArtifact observedArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservingProvidedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementPackage.Literals.OBSERVING_PROVIDED_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicArtifact getObservedArtifact() {
		if (observedArtifact != null && observedArtifact.eIsProxy()) {
			InternalEObject oldObservedArtifact = (InternalEObject)observedArtifact;
			observedArtifact = (AtomicArtifact)eResolveProxy(oldObservedArtifact);
			if (observedArtifact != oldObservedArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT, oldObservedArtifact, observedArtifact));
			}
		}
		return observedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicArtifact basicGetObservedArtifact() {
		return observedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedArtifact(AtomicArtifact newObservedArtifact) {
		AtomicArtifact oldObservedArtifact = observedArtifact;
		observedArtifact = newObservedArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT, oldObservedArtifact, observedArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT:
				if (resolve) return getObservedArtifact();
				return basicGetObservedArtifact();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT:
				setObservedArtifact((AtomicArtifact)newValue);
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
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT:
				setObservedArtifact((AtomicArtifact)null);
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
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT:
				return observedArtifact != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservingProvidedArtifactImpl
