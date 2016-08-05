/**
 */
package br.ufpe.ines.decode.decode.taskDescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.GeneralParameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getGeneralParameter()
 * @model
 * @generated
 */
public interface GeneralParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getGeneralParameter_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.taskDescription.GeneralParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // GeneralParameter
