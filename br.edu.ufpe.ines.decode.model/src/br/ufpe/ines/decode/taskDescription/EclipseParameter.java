/**
 */
package br.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.EclipseParameter#getForbiden <em>Forbiden</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.EclipseParameter#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getEclipseParameter()
 * @model
 * @generated
 */
public interface EclipseParameter extends IDEParameter {
	/**
	 * Returns the value of the '<em><b>Forbiden</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbiden</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbiden</em>' attribute list.
	 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getEclipseParameter_Forbiden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getForbiden();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute list.
	 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getEclipseParameter_Required()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getRequired();

} // EclipseParameter
