/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appendable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement#getDefaultQuantity <em>Default Quantity</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getAppendableElement()
 * @model
 * @generated
 */
public interface AppendableElement extends Restriction {
	/**
	 * Returns the value of the '<em><b>Default Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Quantity</em>' attribute.
	 * @see #setDefaultQuantity(Integer)
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#getAppendableElement_DefaultQuantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 * @generated
	 */
	Integer getDefaultQuantity();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement#getDefaultQuantity <em>Default Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Quantity</em>' attribute.
	 * @see #getDefaultQuantity()
	 * @generated
	 */
	void setDefaultQuantity(Integer value);

} // AppendableElement
