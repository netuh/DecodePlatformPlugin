/**
 */
package be.edu.ufpe.ines.decode.model.decode.impl;

import be.edu.ufpe.ines.decode.model.decode.CodingExperiment;
import be.edu.ufpe.ines.decode.model.decode.DecodePackage;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact;

import be.edu.ufpe.ines.decode.model.decode.measurement.Measurements;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getTask <em>Task</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingExperimentImpl extends MinimalEObjectImpl.Container implements CodingExperiment {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected ModeledTask task;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedArtifact> artifacts;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected Measurements measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecodePackage.Literals.CODING_EXPERIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTask getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(ModeledTask newTask, NotificationChain msgs) {
		ModeledTask oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(ModeledTask newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedArtifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<ProvidedArtifact>(ProvidedArtifact.class, this, DecodePackage.CODING_EXPERIMENT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurements getMeasurements() {
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurements(Measurements newMeasurements, NotificationChain msgs) {
		Measurements oldMeasurements = measurements;
		measurements = newMeasurements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__MEASUREMENTS, oldMeasurements, newMeasurements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurements(Measurements newMeasurements) {
		if (newMeasurements != measurements) {
			NotificationChain msgs = null;
			if (measurements != null)
				msgs = ((InternalEObject)measurements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__MEASUREMENTS, null, msgs);
			if (newMeasurements != null)
				msgs = ((InternalEObject)newMeasurements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__MEASUREMENTS, null, msgs);
			msgs = basicSetMeasurements(newMeasurements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__MEASUREMENTS, newMeasurements, newMeasurements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecodePackage.CODING_EXPERIMENT__TASK:
				return basicSetTask(null, msgs);
			case DecodePackage.CODING_EXPERIMENT__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				return basicSetMeasurements(null, msgs);
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
			case DecodePackage.CODING_EXPERIMENT__TASK:
				return getTask();
			case DecodePackage.CODING_EXPERIMENT__ARTIFACTS:
				return getArtifacts();
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
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
			case DecodePackage.CODING_EXPERIMENT__TASK:
				setTask((ModeledTask)newValue);
				return;
			case DecodePackage.CODING_EXPERIMENT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends ProvidedArtifact>)newValue);
				return;
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				setMeasurements((Measurements)newValue);
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
			case DecodePackage.CODING_EXPERIMENT__TASK:
				setTask((ModeledTask)null);
				return;
			case DecodePackage.CODING_EXPERIMENT__ARTIFACTS:
				getArtifacts().clear();
				return;
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				setMeasurements((Measurements)null);
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
			case DecodePackage.CODING_EXPERIMENT__TASK:
				return task != null;
			case DecodePackage.CODING_EXPERIMENT__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				return measurements != null;
		}
		return super.eIsSet(featureID);
	}

} //CodingExperimentImpl
