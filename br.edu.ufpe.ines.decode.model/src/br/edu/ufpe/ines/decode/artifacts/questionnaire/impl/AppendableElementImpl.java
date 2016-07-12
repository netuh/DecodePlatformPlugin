/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.impl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appendable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.AppendableElementImpl#getDefaultQuantity <em>Default Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppendableElementImpl extends RestrictionImpl implements AppendableElement {
	/**
	 * The default value of the '{@link #getDefaultQuantity() <em>Default Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultQuantity() <em>Default Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultQuantity = DEFAULT_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppendableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.APPENDABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultQuantity() {
		return defaultQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultQuantity(Integer newDefaultQuantity) {
		Integer oldDefaultQuantity = defaultQuantity;
		defaultQuantity = newDefaultQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.APPENDABLE_ELEMENT__DEFAULT_QUANTITY, oldDefaultQuantity, defaultQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.APPENDABLE_ELEMENT__DEFAULT_QUANTITY:
				return getDefaultQuantity();
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
			case QuestionnairePackage.APPENDABLE_ELEMENT__DEFAULT_QUANTITY:
				setDefaultQuantity((Integer)newValue);
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
			case QuestionnairePackage.APPENDABLE_ELEMENT__DEFAULT_QUANTITY:
				setDefaultQuantity(DEFAULT_QUANTITY_EDEFAULT);
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
			case QuestionnairePackage.APPENDABLE_ELEMENT__DEFAULT_QUANTITY:
				return DEFAULT_QUANTITY_EDEFAULT == null ? defaultQuantity != null : !DEFAULT_QUANTITY_EDEFAULT.equals(defaultQuantity);
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
		result.append(" (defaultQuantity: ");
		result.append(defaultQuantity);
		result.append(')');
		return result.toString();
	}

} //AppendableElementImpl
