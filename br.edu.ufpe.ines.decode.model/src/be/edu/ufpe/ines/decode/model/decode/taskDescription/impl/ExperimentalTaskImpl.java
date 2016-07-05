/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription.impl;

import be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact;
import be.edu.ufpe.ines.decode.model.decode.aux.Nameable;
import be.edu.ufpe.ines.decode.model.decode.aux.NewPackage4Package;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimental Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getRequiredArtifacts <em>Required Artifacts</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentalTaskImpl extends ModeledTaskImpl implements ExperimentalTask {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getRequiredArtifacts() <em>Required Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractArtifact> requiredArtifacts;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME, oldName, name));
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
	public EList<AbstractArtifact> getRequiredArtifacts() {
		if (requiredArtifacts == null) {
			requiredArtifacts = new EObjectResolvingEList<AbstractArtifact>(AbstractArtifact.class, this, TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS);
		}
		return requiredArtifacts;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME:
				return getName();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				return getNewAttribute();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS:
				return getRequiredArtifacts();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				return getDepends();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME:
				setName((String)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				setNewAttribute((Boolean)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS:
				getRequiredArtifacts().clear();
				getRequiredArtifacts().addAll((Collection<? extends AbstractArtifact>)newValue);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				getDepends().clear();
				getDepends().addAll((Collection<? extends ExperimentalTask>)newValue);
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS:
				getRequiredArtifacts().clear();
				return;
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				getDepends().clear();
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
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__NEW_ATTRIBUTE:
				return NEW_ATTRIBUTE_EDEFAULT == null ? newAttribute != null : !NEW_ATTRIBUTE_EDEFAULT.equals(newAttribute);
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS:
				return requiredArtifacts != null && !requiredArtifacts.isEmpty();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK__DEPENDS:
				return depends != null && !depends.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Nameable.class) {
			switch (derivedFeatureID) {
				case TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME: return NewPackage4Package.NAMEABLE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Nameable.class) {
			switch (baseFeatureID) {
				case NewPackage4Package.NAMEABLE__NAME: return TaskDescriptionPackage.EXPERIMENTAL_TASK__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", newAttribute: ");
		result.append(newAttribute);
		result.append(')');
		return result.toString();
	}

} //ExperimentalTaskImpl
