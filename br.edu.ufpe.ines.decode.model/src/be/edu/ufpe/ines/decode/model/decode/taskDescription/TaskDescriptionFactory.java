/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage
 * @generated
 */
public interface TaskDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDescriptionFactory eINSTANCE = be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequencial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequencial</em>'.
	 * @generated
	 */
	Sequencial createSequencial();

	/**
	 * Returns a new object of class '<em>Aleatorio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aleatorio</em>'.
	 * @generated
	 */
	Aleatorio createAleatorio();

	/**
	 * Returns a new object of class '<em>Experimental Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Task</em>'.
	 * @generated
	 */
	ExperimentalTask createExperimentalTask();

	/**
	 * Returns a new object of class '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction</em>'.
	 * @generated
	 */
	Restriction createRestriction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskDescriptionPackage getTaskDescriptionPackage();

} //TaskDescriptionFactory
