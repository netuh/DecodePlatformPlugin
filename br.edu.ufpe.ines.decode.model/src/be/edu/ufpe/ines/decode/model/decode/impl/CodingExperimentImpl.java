/**
 */
package be.edu.ufpe.ines.decode.model.decode.impl;

import be.edu.ufpe.ines.decode.model.decode.CodingExperiment;
import be.edu.ufpe.ines.decode.model.decode.DecodePackage;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtefacts;
import be.edu.ufpe.ines.decode.model.decode.aux.impl.NameableImpl;
import be.edu.ufpe.ines.decode.model.decode.measurement.Measurements;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getTask <em>Task</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.impl.CodingExperimentImpl#getProvidedArtefacts <em>Provided Artefacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingExperimentImpl extends NameableImpl implements CodingExperiment {
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
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected Measurements measurements;

	/**
	 * The cached value of the '{@link #getProvidedArtefacts() <em>Provided Artefacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedArtefacts()
	 * @generated
	 * @ordered
	 */
	protected ProvidedArtefacts providedArtefacts;

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
	public ProvidedArtefacts getProvidedArtefacts() {
		return providedArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedArtefacts(ProvidedArtefacts newProvidedArtefacts, NotificationChain msgs) {
		ProvidedArtefacts oldProvidedArtefacts = providedArtefacts;
		providedArtefacts = newProvidedArtefacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS, oldProvidedArtefacts, newProvidedArtefacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedArtefacts(ProvidedArtefacts newProvidedArtefacts) {
		if (newProvidedArtefacts != providedArtefacts) {
			NotificationChain msgs = null;
			if (providedArtefacts != null)
				msgs = ((InternalEObject)providedArtefacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS, null, msgs);
			if (newProvidedArtefacts != null)
				msgs = ((InternalEObject)newProvidedArtefacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS, null, msgs);
			msgs = basicSetProvidedArtefacts(newProvidedArtefacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS, newProvidedArtefacts, newProvidedArtefacts));
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
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				return basicSetMeasurements(null, msgs);
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				return basicSetProvidedArtefacts(null, msgs);
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
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				return getMeasurements();
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				return getProvidedArtefacts();
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
			case DecodePackage.CODING_EXPERIMENT__TASK:
				setTask((ModeledTask)newValue);
				return;
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				setMeasurements((Measurements)newValue);
				return;
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				setProvidedArtefacts((ProvidedArtefacts)newValue);
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
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				setMeasurements((Measurements)null);
				return;
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				setProvidedArtefacts((ProvidedArtefacts)null);
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
			case DecodePackage.CODING_EXPERIMENT__MEASUREMENTS:
				return measurements != null;
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				return providedArtefacts != null;
		}
		return super.eIsSet(featureID);
	}

} //CodingExperimentImpl
