/**
 */
package br.ufpe.ines.decode.decode.impl;

import br.ufpe.ines.decode.decode.CodingExperiment;
import br.ufpe.ines.decode.decode.DecodePackage;

import br.ufpe.ines.decode.decode.artifacts.ProvidedArtefacts;

import br.ufpe.ines.decode.decode.aux.AuxPackage;
import br.ufpe.ines.decode.decode.aux.Identifiable;

import br.ufpe.ines.decode.decode.aux.impl.NameableImpl;

import br.ufpe.ines.decode.decode.taskDescription.ExecutionDerivations;

import java.util.UUID;

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
 *   <li>{@link br.ufpe.ines.decode.decode.impl.CodingExperimentImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.impl.CodingExperimentImpl#getTask <em>Task</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.impl.CodingExperimentImpl#getProvidedArtefacts <em>Provided Artefacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingExperimentImpl extends NameableImpl implements CodingExperiment {
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
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected ExecutionDerivations task;

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
			eNotify(new ENotificationImpl(this, Notification.SET, DecodePackage.CODING_EXPERIMENT__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionDerivations getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(ExecutionDerivations newTask, NotificationChain msgs) {
		ExecutionDerivations oldTask = task;
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
	public void setTask(ExecutionDerivations newTask) {
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
			case DecodePackage.CODING_EXPERIMENT__ELEMENT_ID:
				return getElementId();
			case DecodePackage.CODING_EXPERIMENT__TASK:
				return getTask();
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
			case DecodePackage.CODING_EXPERIMENT__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case DecodePackage.CODING_EXPERIMENT__TASK:
				setTask((ExecutionDerivations)newValue);
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
			case DecodePackage.CODING_EXPERIMENT__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case DecodePackage.CODING_EXPERIMENT__TASK:
				setTask((ExecutionDerivations)null);
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
			case DecodePackage.CODING_EXPERIMENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case DecodePackage.CODING_EXPERIMENT__TASK:
				return task != null;
			case DecodePackage.CODING_EXPERIMENT__PROVIDED_ARTEFACTS:
				return providedArtefacts != null;
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
				case DecodePackage.CODING_EXPERIMENT__ELEMENT_ID: return AuxPackage.IDENTIFIABLE__ELEMENT_ID;
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
				case AuxPackage.IDENTIFIABLE__ELEMENT_ID: return DecodePackage.CODING_EXPERIMENT__ELEMENT_ID;
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
		result.append(" (elementId: ");
		result.append(elementId);
		result.append(')');
		return result.toString();
	}

} //CodingExperimentImpl
