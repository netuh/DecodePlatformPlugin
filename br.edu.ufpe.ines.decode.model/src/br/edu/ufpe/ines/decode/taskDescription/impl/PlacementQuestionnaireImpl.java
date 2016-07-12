/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.Questionnaire;

import br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire;
import br.edu.ufpe.ines.decode.taskDescription.PlacementType;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacementQuestionnaireImpl extends MeasurementImpl implements PlacementQuestionnaire {
	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final PlacementType PLACEMENT_EDEFAULT = PlacementType.BEFORE;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected PlacementType placement = PLACEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementQuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.PLACEMENT_QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(PlacementType newPlacement) {
		PlacementType oldPlacement = placement;
		placement = newPlacement == null ? PLACEMENT_EDEFAULT : newPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__PLACEMENT, oldPlacement, placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		if (questionnaire != null && questionnaire.eIsProxy()) {
			InternalEObject oldQuestionnaire = (InternalEObject)questionnaire;
			questionnaire = (Questionnaire)eResolveProxy(oldQuestionnaire);
			if (questionnaire != oldQuestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
			}
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire basicGetQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, Questionnaire.class, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, Questionnaire.class, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				if (questionnaire != null)
					msgs = ((InternalEObject)questionnaire).eInverseRemove(this, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, Questionnaire.class, msgs);
				return basicSetQuestionnaire((Questionnaire)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
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
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__PLACEMENT:
				return getPlacement();
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				if (resolve) return getQuestionnaire();
				return basicGetQuestionnaire();
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
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__PLACEMENT:
				setPlacement((PlacementType)newValue);
				return;
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
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
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__PLACEMENT:
				setPlacement(PLACEMENT_EDEFAULT);
				return;
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
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
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__PLACEMENT:
				return placement != PLACEMENT_EDEFAULT;
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE:
				return questionnaire != null;
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
		result.append(" (placement: ");
		result.append(placement);
		result.append(')');
		return result.toString();
	}

} //PlacementQuestionnaireImpl
