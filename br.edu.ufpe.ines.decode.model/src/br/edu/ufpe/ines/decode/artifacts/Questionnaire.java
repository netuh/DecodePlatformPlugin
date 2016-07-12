/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent;

import br.edu.ufpe.ines.decode.aux.Nameable;
import br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire#getElements <em>Elements</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire#getPlacementquestionnaire <em>Placementquestionnaire</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends AbstractArtifact, Nameable {
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
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaire_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementaryComponent> getElements();

	/**
	 * Returns the value of the '<em><b>Placementquestionnaire</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placementquestionnaire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placementquestionnaire</em>' reference.
	 * @see #setPlacementquestionnaire(PlacementQuestionnaire)
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getQuestionnaire_Placementquestionnaire()
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire
	 * @model opposite="questionnaire" required="true"
	 * @generated
	 */
	PlacementQuestionnaire getPlacementquestionnaire();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire#getPlacementquestionnaire <em>Placementquestionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placementquestionnaire</em>' reference.
	 * @see #getPlacementquestionnaire()
	 * @generated
	 */
	void setPlacementquestionnaire(PlacementQuestionnaire value);

} // Questionnaire
