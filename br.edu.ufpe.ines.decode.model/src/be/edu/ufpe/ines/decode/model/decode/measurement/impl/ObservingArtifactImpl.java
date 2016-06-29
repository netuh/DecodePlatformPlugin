/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.impl;

import be.edu.ufpe.ines.decode.model.decode.measurement.AspectObserved;
import be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.model.decode.measurement.ObservingArtifact;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observing Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.measurement.impl.ObservingArtifactImpl#getAspect <em>Aspect</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObservingArtifactImpl extends AbstractMeasurementImpl implements ObservingArtifact {
	/**
	 * The cached value of the '{@link #getAspect() <em>Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected AspectObserved aspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservingArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementPackage.Literals.OBSERVING_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectObserved getAspect() {
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspect(AspectObserved newAspect, NotificationChain msgs) {
		AspectObserved oldAspect = aspect;
		aspect = newAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasurementPackage.OBSERVING_ARTIFACT__ASPECT, oldAspect, newAspect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(AspectObserved newAspect) {
		if (newAspect != aspect) {
			NotificationChain msgs = null;
			if (aspect != null)
				msgs = ((InternalEObject)aspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeasurementPackage.OBSERVING_ARTIFACT__ASPECT, null, msgs);
			if (newAspect != null)
				msgs = ((InternalEObject)newAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeasurementPackage.OBSERVING_ARTIFACT__ASPECT, null, msgs);
			msgs = basicSetAspect(newAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurementPackage.OBSERVING_ARTIFACT__ASPECT, newAspect, newAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasurementPackage.OBSERVING_ARTIFACT__ASPECT:
				return basicSetAspect(null, msgs);
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
			case MeasurementPackage.OBSERVING_ARTIFACT__ASPECT:
				return getAspect();
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
			case MeasurementPackage.OBSERVING_ARTIFACT__ASPECT:
				setAspect((AspectObserved)newValue);
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
			case MeasurementPackage.OBSERVING_ARTIFACT__ASPECT:
				setAspect((AspectObserved)null);
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
			case MeasurementPackage.OBSERVING_ARTIFACT__ASPECT:
				return aspect != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservingArtifactImpl
