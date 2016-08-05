/**
 */
package br.ufpe.ines.decode.taskDescription.impl;

import br.ufpe.ines.decode.artifacts.AbstractArtifact;

import br.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentalTaskImpl extends ModeledTaskImpl implements ExperimentalTask {
	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentalTask> depends;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractArtifact> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.EXPERIMENTAL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentalTask> getDepends() {
		if (depends == null) {
			depends = new EObjectResolvingEList<ExperimentalTask>(ExperimentalTask.class, this, TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS);
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractArtifact> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<AbstractArtifact>(AbstractArtifact.class, this, TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				return getDepends();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRES:
				return getRequires();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends ExperimentalTask>)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends AbstractArtifact>)newValue);
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				getDepends().clear();
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRES:
				getRequires().clear();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				return depends != null && !depends.isEmpty();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentalTaskImpl
