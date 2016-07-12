/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

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
 * An implementation of the model object '<em><b>Execution Derivations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.ExecutionDerivationsImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionDerivationsImpl extends MinimalEObjectImpl.Container implements ExecutionDerivations {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeledTask> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionDerivationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.EXECUTION_DERIVATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModeledTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<ModeledTask>(ModeledTask.class, this, TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS:
				return getTasks();
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
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends ModeledTask>)newValue);
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
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS:
				getTasks().clear();
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
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionDerivationsImpl
