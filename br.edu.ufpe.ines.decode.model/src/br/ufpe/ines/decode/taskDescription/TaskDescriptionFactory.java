/**
 */
package br.ufpe.ines.decode.taskDescription;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage
 * @generated
 */
public interface TaskDescriptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDescriptionFactory eINSTANCE = br.ufpe.ines.decode.taskDescription.impl.TaskDescriptionFactoryImpl.init();

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
	 * Returns a new object of class '<em>Questionnaire Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Measurement</em>'.
	 * @generated
	 */
	QuestionnaireMeasurement createQuestionnaireMeasurement();

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
	 * Returns a new object of class '<em>Eclipse Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Parameter</em>'.
	 * @generated
	 */
	EclipseParameter createEclipseParameter();

	/**
	 * Returns a new object of class '<em>General Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Parameter</em>'.
	 * @generated
	 */
	GeneralParameter createGeneralParameter();

	/**
	 * Returns a new object of class '<em>Other Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Parameters</em>'.
	 * @generated
	 */
	OtherParameters createOtherParameters();

	/**
	 * Returns a new object of class '<em>Measurements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurements</em>'.
	 * @generated
	 */
	Measurements createMeasurements();

	/**
	 * Returns a new object of class '<em>Pen And Paper Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pen And Paper Questionnaire</em>'.
	 * @generated
	 */
	PenAndPaperQuestionnaire createPenAndPaperQuestionnaire();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskDescriptionPackage getTaskDescriptionPackage();

} //TaskDescriptionFactory
