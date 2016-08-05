/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Block#getChidren <em>Chidren</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends ElementaryComponent {
	/**
	 * Returns the value of the '<em><b>Chidren</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.decode.artifacts.questionnaire.ElementaryComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chidren</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chidren</em>' containment reference list.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage#getBlock_Chidren()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementaryComponent> getChidren();

} // Block
