/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Derivations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExecutionDerivations()
 * @model
 * @generated
 */
public interface ExecutionDerivations extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getExecutionDerivations_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModeledTask> getTasks();

} // ExecutionDerivations
