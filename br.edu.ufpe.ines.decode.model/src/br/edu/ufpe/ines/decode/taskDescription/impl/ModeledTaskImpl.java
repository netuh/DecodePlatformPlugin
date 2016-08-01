/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import br.edu.ufpe.ines.decode.aux.AuxPackage;
import br.edu.ufpe.ines.decode.aux.Identifiable;
import br.edu.ufpe.ines.decode.aux.impl.NameableImpl;
import br.edu.ufpe.ines.decode.taskDescription.Measurements;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.OtherParameters;
import br.edu.ufpe.ines.decode.taskDescription.Parameter;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeled Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModeledTaskImpl extends NameableImpl implements ModeledTask {
	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected OtherParameters restriction;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ModeledTask parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeledTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.MODELED_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getElementId() {
		if (elementId == null)
			elementId = UUID.randomUUID().toString();
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherParameters getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(OtherParameters newRestriction, NotificationChain msgs) {
		OtherParameters oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(OtherParameters newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskDescriptionPackage.MODELED_TASK__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskDescriptionPackage.MODELED_TASK__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__RESTRICTION, newRestriction, newRestriction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS, oldMeasurements, newMeasurements);
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
				msgs = ((InternalEObject)measurements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS, null, msgs);
			if (newMeasurements != null)
				msgs = ((InternalEObject)newMeasurements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS, null, msgs);
			msgs = basicSetMeasurements(newMeasurements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS, newMeasurements, newMeasurements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTask getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ModeledTask)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskDescriptionPackage.MODELED_TASK__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTask basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModeledTask newParent) {
		ModeledTask oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.MODELED_TASK__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Parameter> getParameters2() {
		List<Parameter> task = new ArrayList<Parameter>();
		if (restriction != null){
			restriction.getChildren().forEach(elemt -> task.add(elemt));
			task.addAll(restriction.getChildren());
		}
		ModeledTask parent = getParent(); 
		if (parent != null){
			task.addAll(parent.getParameters2());
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
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
			case TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID:
				return getElementId();
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
				return getRestriction();
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
				return getMeasurements();
			case TaskDescriptionPackage.MODELED_TASK__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
				setRestriction((OtherParameters)newValue);
				return;
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
				setMeasurements((Measurements)newValue);
				return;
			case TaskDescriptionPackage.MODELED_TASK__PARENT:
				setParent((ModeledTask)newValue);
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
			case TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
				setRestriction((OtherParameters)null);
				return;
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
				setMeasurements((Measurements)null);
				return;
			case TaskDescriptionPackage.MODELED_TASK__PARENT:
				setParent((ModeledTask)null);
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
			case TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
				return restriction != null;
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
				return measurements != null;
			case TaskDescriptionPackage.MODELED_TASK__PARENT:
				return parent != null;
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
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
				case TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID: return AuxPackage.IDENTIFIABLE__ELEMENT_ID;
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
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
				case AuxPackage.IDENTIFIABLE__ELEMENT_ID: return TaskDescriptionPackage.MODELED_TASK__ELEMENT_ID;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TaskDescriptionPackage.MODELED_TASK___GET_PARAMETERS2:
				return getParameters2();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (elementId: ");
		result.append(elementId);
		result.append(')');
		return result.toString();
	}

} //ModeledTaskImpl
