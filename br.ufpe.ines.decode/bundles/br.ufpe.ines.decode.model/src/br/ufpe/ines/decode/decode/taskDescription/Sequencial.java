/**
 */
package br.ufpe.ines.decode.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequencial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.Sequencial#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getSequencial()
 * @model
 * @generated
 */
public interface Sequencial extends ComposedTask {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getSequencial_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeledTask> getTasks();

} // Sequencial
