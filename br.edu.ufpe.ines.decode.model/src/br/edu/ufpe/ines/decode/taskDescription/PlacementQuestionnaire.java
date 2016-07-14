/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getPlacement <em>Placement</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getPlacementQuestionnaire()
 * @model
 * @generated
 */
public interface PlacementQuestionnaire extends Measurement {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The default value is <code>"Before"</code>.
	 * The literals are from the enumeration {@link br.edu.ufpe.ines.decode.taskDescription.PlacementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
	 * @see #setPlacement(PlacementType)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getPlacementQuestionnaire_Placement()
	 * @model default="Before"
	 * @generated
	 */
	PlacementType getPlacement();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementType value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire <em>Placementquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionnaire</em>' reference.
	 * @see #setQuestionnaire(QuestionnaireInner)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getPlacementQuestionnaire_Questionnaire()
	 * @see br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire
	 * @model opposite="placementquestionnaire"
	 * @generated
	 */
	QuestionnaireInner getQuestionnaire();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(QuestionnaireInner value);

} // PlacementQuestionnaire
