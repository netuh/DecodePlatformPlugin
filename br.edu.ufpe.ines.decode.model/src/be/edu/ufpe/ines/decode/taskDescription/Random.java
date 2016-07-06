/**
 */
package be.edu.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.taskDescription.Random#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getRandom()
 * @model
 * @generated
 */
public interface Random extends ComposedTask {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see be.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getRandom_Tasks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModeledTask> getTasks();

} // Random
