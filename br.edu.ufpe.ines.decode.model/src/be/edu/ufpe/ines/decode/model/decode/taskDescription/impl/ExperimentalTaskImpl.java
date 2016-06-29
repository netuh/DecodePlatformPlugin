/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription.impl;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getRequiredArtifact <em>Required Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentalTaskImpl extends ModeledTaskImpl implements ExperimentalTask {
	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected Boolean newAttribute = NEW_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentalTask> dependency;

	/**
	 * The cached value of the '{@link #getRequiredArtifact() <em>Required Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedArtifact> requiredArtifact;

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
	public Boolean getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(Boolean newNewAttribute) {
		Boolean oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentalTask> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<ExperimentalTask>(ExperimentalTask.class, this, TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedArtifact> getRequiredArtifact() {
		if (requiredArtifact == null) {
			requiredArtifact = new EObjectResolvingEList<ProvidedArtifact>(ProvidedArtifact.class, this, TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACT);
		}
		return requiredArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				return getNewAttribute();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY:
				return getDependency();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACT:
				return getRequiredArtifact();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				setNewAttribute((Boolean)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends ExperimentalTask>)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACT:
				getRequiredArtifact().clear();
				getRequiredArtifact().addAll((Collection<? extends ProvidedArtifact>)newValue);
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY:
				getDependency().clear();
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACT:
				getRequiredArtifact().clear();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				return NEW_ATTRIBUTE_EDEFAULT == null ? newAttribute != null : !NEW_ATTRIBUTE_EDEFAULT.equals(newAttribute);
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACT:
				return requiredArtifact != null && !requiredArtifact.isEmpty();
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
		result.append(" (newAttribute: ");
		result.append(newAttribute);
		result.append(')');
		return result.toString();
	}

} //ExperimentalTaskImpl
