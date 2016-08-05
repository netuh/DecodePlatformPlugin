/**
 */
package br.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.taskDescription.OtherParameters#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getOtherParameters()
 * @model
 * @generated
 */
public interface OtherParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.taskDescription.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getOtherParameters_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getChildren();

} // OtherParameters
