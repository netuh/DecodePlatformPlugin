/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.impl;

import be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time On Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.measurement.impl.TimeOnTaskImpl#getRelatedTask <em>Related Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeOnTaskImpl extends AbstractMeasurementImpl implements TimeOnTask {
	/**
	 * The cached value of the '{@link #getRelatedTask() <em>Related Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTask()
	 * @generated
	 * @ordered
	 */
	protected ModeledTask relatedTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeOnTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementPackage.Literals.TIME_ON_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTask getRelatedTask() {
		if (relatedTask != null && relatedTask.eIsProxy()) {
			InternalEObject oldRelatedTask = (InternalEObject)relatedTask;
			relatedTask = (ModeledTask)eResolveProxy(oldRelatedTask);
			if (relatedTask != oldRelatedTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasurementPackage.TIME_ON_TASK__RELATED_TASK, oldRelatedTask, relatedTask));
			}
		}
		return relatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTask basicGetRelatedTask() {
		return relatedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedTask(ModeledTask newRelatedTask) {
		ModeledTask oldRelatedTask = relatedTask;
		relatedTask = newRelatedTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurementPackage.TIME_ON_TASK__RELATED_TASK, oldRelatedTask, relatedTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementPackage.TIME_ON_TASK__RELATED_TASK:
				if (resolve) return getRelatedTask();
				return basicGetRelatedTask();
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
			case MeasurementPackage.TIME_ON_TASK__RELATED_TASK:
				setRelatedTask((ModeledTask)newValue);
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
			case MeasurementPackage.TIME_ON_TASK__RELATED_TASK:
				setRelatedTask((ModeledTask)null);
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
			case MeasurementPackage.TIME_ON_TASK__RELATED_TASK:
				return relatedTask != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeOnTaskImpl
