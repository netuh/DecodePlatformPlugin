/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getComposedQuestion()
 * @model abstract="true"
 * @generated
 */
public interface ComposedQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getComposedQuestion_Choice()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Choice> getChoice();

} // ComposedQuestion
