/**
 */
package br.ufpe.ines.decode.decode.taskDescription;

import br.ufpe.ines.decode.decode.artifacts.QuestionnaireInner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement#getPlacement <em>Placement</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getQuestionnaireMeasurement()
 * @model
 * @generated
 */
public interface QuestionnaireMeasurement extends Questionnairemeasure {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The default value is <code>"Before"</code>.
	 * The literals are from the enumeration {@link br.ufpe.ines.decode.decode.taskDescription.PlacementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see br.ufpe.ines.decode.decode.taskDescription.PlacementType
	 * @see #setPlacement(PlacementType)
	 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getQuestionnaireMeasurement_Placement()
	 * @model default="Before"
	 * @generated
	 */
	PlacementType getPlacement();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see br.ufpe.ines.decode.decode.taskDescription.PlacementType
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementType value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.ufpe.ines.decode.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire <em>Placementquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference.
	 * @see #setQuestionnaire(QuestionnaireInner)
	 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getQuestionnaireMeasurement_Questionnaire()
	 * @see br.ufpe.ines.decode.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire
	 * @model opposite="placementquestionnaire"
	 * @generated
	 */
	QuestionnaireInner getQuestionnaire();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(QuestionnaireInner value);

} // QuestionnaireMeasurement
