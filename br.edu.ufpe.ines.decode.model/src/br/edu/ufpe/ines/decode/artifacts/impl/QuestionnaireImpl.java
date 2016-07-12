/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.Questionnaire;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent;

import br.edu.ufpe.ines.decode.aux.AuxPackage;
import br.edu.ufpe.ines.decode.aux.Nameable;
import br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl#getPlacementquestionnaire <em>Placementquestionnaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends AbstractArtifactImpl implements Questionnaire {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryComponent> elements;

	/**
	 * The cached value of the '{@link #getPlacementquestionnaire() <em>Placementquestionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementquestionnaire()
	 * @generated
	 * @ordered
	 */
	protected PlacementQuestionnaire placementquestionnaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.QUESTIONNAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.QUESTIONNAIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryComponent> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementaryComponent>(ElementaryComponent.class, this, ArtifactsPackage.QUESTIONNAIRE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementQuestionnaire getPlacementquestionnaire() {
		if (placementquestionnaire != null && placementquestionnaire.eIsProxy()) {
			InternalEObject oldPlacementquestionnaire = (InternalEObject)placementquestionnaire;
			placementquestionnaire = (PlacementQuestionnaire)eResolveProxy(oldPlacementquestionnaire);
			if (placementquestionnaire != oldPlacementquestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, oldPlacementquestionnaire, placementquestionnaire));
			}
		}
		return placementquestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementQuestionnaire basicGetPlacementquestionnaire() {
		return placementquestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementquestionnaire(PlacementQuestionnaire newPlacementquestionnaire, NotificationChain msgs) {
		PlacementQuestionnaire oldPlacementquestionnaire = placementquestionnaire;
		placementquestionnaire = newPlacementquestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, oldPlacementquestionnaire, newPlacementquestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementquestionnaire(PlacementQuestionnaire newPlacementquestionnaire) {
		if (newPlacementquestionnaire != placementquestionnaire) {
			NotificationChain msgs = null;
			if (placementquestionnaire != null)
				msgs = ((InternalEObject)placementquestionnaire).eInverseRemove(this, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, PlacementQuestionnaire.class, msgs);
			if (newPlacementquestionnaire != null)
				msgs = ((InternalEObject)newPlacementquestionnaire).eInverseAdd(this, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, PlacementQuestionnaire.class, msgs);
			msgs = basicSetPlacementquestionnaire(newPlacementquestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE, newPlacementquestionnaire, newPlacementquestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				if (placementquestionnaire != null)
					msgs = ((InternalEObject)placementquestionnaire).eInverseRemove(this, TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE, PlacementQuestionnaire.class, msgs);
				return basicSetPlacementquestionnaire((PlacementQuestionnaire)otherEnd, msgs);
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
			case ArtifactsPackage.QUESTIONNAIRE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				return basicSetPlacementquestionnaire(null, msgs);
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
			case ArtifactsPackage.QUESTIONNAIRE__NAME:
				return getName();
			case ArtifactsPackage.QUESTIONNAIRE__ELEMENTS:
				return getElements();
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				if (resolve) return getPlacementquestionnaire();
				return basicGetPlacementquestionnaire();
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
			case ArtifactsPackage.QUESTIONNAIRE__NAME:
				setName((String)newValue);
				return;
			case ArtifactsPackage.QUESTIONNAIRE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ElementaryComponent>)newValue);
				return;
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				setPlacementquestionnaire((PlacementQuestionnaire)newValue);
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
			case ArtifactsPackage.QUESTIONNAIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArtifactsPackage.QUESTIONNAIRE__ELEMENTS:
				getElements().clear();
				return;
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				setPlacementquestionnaire((PlacementQuestionnaire)null);
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
			case ArtifactsPackage.QUESTIONNAIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArtifactsPackage.QUESTIONNAIRE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ArtifactsPackage.QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE:
				return placementquestionnaire != null;
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
				case ArtifactsPackage.QUESTIONNAIRE__NAME: return AuxPackage.NAMEABLE__NAME;
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
				case AuxPackage.NAMEABLE__NAME: return ArtifactsPackage.QUESTIONNAIRE__NAME;
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
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl
