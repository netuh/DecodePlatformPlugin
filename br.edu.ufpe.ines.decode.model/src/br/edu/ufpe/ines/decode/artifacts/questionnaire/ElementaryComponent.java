/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent#getRestriction <em>Restriction</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getElementaryComponent()
 * @model abstract="true"
 * @generated
 */
public interface ElementaryComponent extends Labelable {
	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(Restriction)
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getElementaryComponent_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	Restriction getRestriction();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(Restriction value);

} // ElementaryComponent
