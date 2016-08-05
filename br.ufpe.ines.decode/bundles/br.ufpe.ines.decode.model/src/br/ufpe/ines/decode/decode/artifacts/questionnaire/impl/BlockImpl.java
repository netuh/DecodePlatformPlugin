/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire.impl;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.Block;
import br.ufpe.ines.decode.decode.artifacts.questionnaire.ElementaryComponent;
import br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.impl.BlockImpl#getChidren <em>Chidren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends ElementaryComponentImpl implements Block {
	/**
	 * The cached value of the '{@link #getChidren() <em>Chidren</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChidren()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementaryComponent> chidren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementaryComponent> getChidren() {
		if (chidren == null) {
			chidren = new EObjectContainmentEList<ElementaryComponent>(ElementaryComponent.class, this, QuestionnairePackage.BLOCK__CHIDREN);
		}
		return chidren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.BLOCK__CHIDREN:
				return ((InternalEList<?>)getChidren()).basicRemove(otherEnd, msgs);
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
			case QuestionnairePackage.BLOCK__CHIDREN:
				return getChidren();
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
			case QuestionnairePackage.BLOCK__CHIDREN:
				getChidren().clear();
				getChidren().addAll((Collection<? extends ElementaryComponent>)newValue);
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
			case QuestionnairePackage.BLOCK__CHIDREN:
				getChidren().clear();
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
			case QuestionnairePackage.BLOCK__CHIDREN:
				return chidren != null && !chidren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
