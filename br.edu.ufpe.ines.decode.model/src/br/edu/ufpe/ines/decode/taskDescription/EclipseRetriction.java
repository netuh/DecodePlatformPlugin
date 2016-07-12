/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Retriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction#getForbiden <em>Forbiden</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getEclipseRetriction()
 * @model
 * @generated
 */
public interface EclipseRetriction extends SpecficRestriction {
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
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getEclipseRetriction_Forbiden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getForbiden();

} // EclipseRetriction
