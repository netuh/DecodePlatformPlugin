/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.impl;

import be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getRelatedTask() <em>Related Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTask()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeledTask> relatedTask;

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
	public EList<ModeledTask> getRelatedTask() {
		if (relatedTask == null) {
			relatedTask = new EObjectResolvingEList<ModeledTask>(ModeledTask.class, this, MeasurementPackage.TIME_ON_TASK__RELATED_TASK);
		}
		return relatedTask;
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
				return getRelatedTask();
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
			case MeasurementPackage.TIME_ON_TASK__RELATED_TASK:
				getRelatedTask().clear();
				getRelatedTask().addAll((Collection<? extends ModeledTask>)newValue);
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
				getRelatedTask().clear();
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
				return relatedTask != null && !relatedTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeOnTaskImpl
