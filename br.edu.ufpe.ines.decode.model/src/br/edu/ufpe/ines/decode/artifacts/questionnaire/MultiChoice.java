/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMin <em>Min</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getMultiChoice()
 * @model
 * @generated
 */
public interface MultiChoice extends ComposedQuestion {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getMultiChoice_Min()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getMultiChoice_Max()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // MultiChoice
