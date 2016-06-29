/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aleatorio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Aleatorio#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getAleatorio()
 * @model
 * @generated
 */
public interface Aleatorio extends ComposedTask {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#getAleatorio_Tasks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModeledTask> getTasks();

} // Aleatorio
