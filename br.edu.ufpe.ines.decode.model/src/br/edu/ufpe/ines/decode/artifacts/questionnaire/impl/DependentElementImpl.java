/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.impl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Question;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependentElementImpl extends RestrictionImpl implements DependentElement {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * The default value of the '{@link #getExpectedValue() <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedValue() <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected String expectedValue = EXPECTED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.DEPENDENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		if (question != null && question.eIsProxy()) {
			InternalEObject oldQuestion = (InternalEObject)question;
			question = (Question)eResolveProxy(oldQuestion);
			if (question != oldQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION, oldQuestion, question));
			}
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(Question newQuestion) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectedValue() {
		return expectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedValue(String newExpectedValue) {
		String oldExpectedValue = expectedValue;
		expectedValue = newExpectedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEPENDENT_ELEMENT__EXPECTED_VALUE, oldExpectedValue, expectedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION:
				if (resolve) return getQuestion();
				return basicGetQuestion();
			case QuestionnairePackage.DEPENDENT_ELEMENT__EXPECTED_VALUE:
				return getExpectedValue();
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
			case QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION:
				setQuestion((Question)newValue);
				return;
			case QuestionnairePackage.DEPENDENT_ELEMENT__EXPECTED_VALUE:
				setExpectedValue((String)newValue);
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
			case QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION:
				setQuestion((Question)null);
				return;
			case QuestionnairePackage.DEPENDENT_ELEMENT__EXPECTED_VALUE:
				setExpectedValue(EXPECTED_VALUE_EDEFAULT);
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
			case QuestionnairePackage.DEPENDENT_ELEMENT__QUESTION:
				return question != null;
			case QuestionnairePackage.DEPENDENT_ELEMENT__EXPECTED_VALUE:
				return EXPECTED_VALUE_EDEFAULT == null ? expectedValue != null : !EXPECTED_VALUE_EDEFAULT.equals(expectedValue);
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
		result.append(" (expectedValue: ");
		result.append(expectedValue);
		result.append(')');
		return result.toString();
	}

} //DependentElementImpl
