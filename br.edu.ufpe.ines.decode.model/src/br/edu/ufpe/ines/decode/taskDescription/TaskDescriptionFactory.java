/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage
 * @generated
 */
public interface TaskDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDescriptionFactory eINSTANCE = br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequencial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequencial</em>'.
	 * @generated
	 */
	Sequencial createSequencial();

	/**
	 * Returns a new object of class '<em>Random</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random</em>'.
	 * @generated
	 */
	Random createRandom();

	/**
	 * Returns a new object of class '<em>Experimental Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimental Task</em>'.
	 * @generated
	 */
	ExperimentalTask createExperimentalTask();

	/**
	 * Returns a new object of class '<em>Placement Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placement Questionnaire</em>'.
	 * @generated
	 */
	PlacementQuestionnaire createPlacementQuestionnaire();

	/**
	 * Returns a new object of class '<em>Execution Derivations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Derivations</em>'.
	 * @generated
	 */
	ExecutionDerivations createExecutionDerivations();

	/**
	 * Returns a new object of class '<em>Time Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Restriction</em>'.
	 * @generated
	 */
	TimeRestriction createTimeRestriction();

	/**
	 * Returns a new object of class '<em>Eclipse Retriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Retriction</em>'.
	 * @generated
	 */
	EclipseRetriction createEclipseRetriction();

	/**
	 * Returns a new object of class '<em>Other Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Restriction</em>'.
	 * @generated
	 */
	OtherRestriction createOtherRestriction();

	/**
	 * Returns a new object of class '<em>Modeled Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeled Restrictions</em>'.
	 * @generated
	 */
	ModeledRestrictions createModeledRestrictions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskDescriptionPackage getTaskDescriptionPackage();

} //TaskDescriptionFactory