/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement#getQuestion <em>Question</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getDependentElement()
 * @model
 * @generated
 */
public interface DependentElement extends Restriction {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getDependentElement_Question()
	 * @model required="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Value</em>' attribute.
	 * @see #setExpectedValue(String)
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getDependentElement_ExpectedValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getExpectedValue();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement#getExpectedValue <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Value</em>' attribute.
	 * @see #getExpectedValue()
	 * @generated
	 */
	void setExpectedValue(String value);

} // DependentElement
