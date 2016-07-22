/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent;

import br.edu.ufpe.ines.decode.aux.Nameable;

import br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Inner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getElements <em>Elements</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire <em>Placementquestionnaire</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaireInner()
 * @model
 * @generated
 */
public interface QuestionnaireInner extends AbstractArtifact, Nameable {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaireInner_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementaryComponent> getElements();

	/**
	 * Returns the value of the '<em><b>Placementquestionnaire</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placementquestionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placementquestionnaire</em>' reference.
	 * @see #setPlacementquestionnaire(QuestionnaireMeasurement)
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaireInner_Placementquestionnaire()
	 * @see br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire
	 * @model opposite="questionnaire" required="true"
	 * @generated
	 */
	QuestionnaireMeasurement getPlacementquestionnaire();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire <em>Placementquestionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placementquestionnaire</em>' reference.
	 * @see #getPlacementquestionnaire()
	 * @generated
	 */
	void setPlacementquestionnaire(QuestionnaireMeasurement value);

} // QuestionnaireInner
