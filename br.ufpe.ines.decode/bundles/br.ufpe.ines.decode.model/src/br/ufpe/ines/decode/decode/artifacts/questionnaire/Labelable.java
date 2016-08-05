/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labelable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Labelable#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getLabelable()
 * @model abstract="true"
 * @generated
 */
public interface Labelable extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getLabelable_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Content> getContent();

} // Labelable
