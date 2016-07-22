/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "measurements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "measurements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measurements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementsPackage eINSTANCE = br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AutomaticMeasurementImpl <em>Automatic Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AutomaticMeasurementImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getAutomaticMeasurement()
	 * @generated
	 */
	int AUTOMATIC_MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_MEASUREMENT__LOG = TaskDescriptionPackage.MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automatic Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_MEASUREMENT_FEATURE_COUNT = TaskDescriptionPackage.MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Automatic Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_MEASUREMENT_OPERATION_COUNT = TaskDescriptionPackage.MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ActionsImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__LOG = AUTOMATIC_MEASUREMENT__LOG;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = AUTOMATIC_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_OPERATION_COUNT = AUTOMATIC_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.FinalTaskImpl <em>Final Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.FinalTaskImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getFinalTask()
	 * @generated
	 */
	int FINAL_TASK = 2;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK__LOG = AUTOMATIC_MEASUREMENT__LOG;

	/**
	 * The number of structural features of the '<em>Final Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK_FEATURE_COUNT = AUTOMATIC_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK_OPERATION_COUNT = AUTOMATIC_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.EditionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__LOG = ACTIONS__LOG;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ExecutionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__LOG = ACTIONS__LOG;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AnyActionImpl <em>Any Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AnyActionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getAnyAction()
	 * @generated
	 */
	int ANY_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION__LOG = ACTIONS__LOG;

	/**
	 * The number of structural features of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_FEATURE_COUNT = ACTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_OPERATION_COUNT = ACTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TestExecutionImpl <em>Test Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TestExecutionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getTestExecution()
	 * @generated
	 */
	int TEST_EXECUTION = 6;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__LOG = EXECUTION__LOG;

	/**
	 * The feature id for the '<em><b>Observe Passed Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__OBSERVE_PASSED_TEST = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.LogType <em>Log Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.LogType
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getLogType()
	 * @generated
	 */
	int LOG_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement <em>Automatic Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Measurement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement
	 * @generated
	 */
	EClass getAutomaticMeasurement();

	/**
	 * Returns the meta object for the attribute list '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement#getLog()
	 * @see #getAutomaticMeasurement()
	 * @generated
	 */
	EAttribute getAutomaticMeasurement_Log();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.FinalTask <em>Final Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Task</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.FinalTask
	 * @generated
	 */
	EClass getFinalTask();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction <em>Any Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Action</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction
	 * @generated
	 */
	EClass getAnyAction();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution <em>Test Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Execution</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution
	 * @generated
	 */
	EClass getTestExecution();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution#isObservePassedTest <em>Observe Passed Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe Passed Test</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution#isObservePassedTest()
	 * @see #getTestExecution()
	 * @generated
	 */
	EAttribute getTestExecution_ObservePassedTest();

	/**
	 * Returns the meta object for enum '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.LogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Type</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.LogType
	 * @generated
	 */
	EEnum getLogType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasurementsFactory getMeasurementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AutomaticMeasurementImpl <em>Automatic Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AutomaticMeasurementImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getAutomaticMeasurement()
		 * @generated
		 */
		EClass AUTOMATIC_MEASUREMENT = eINSTANCE.getAutomaticMeasurement();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_MEASUREMENT__LOG = eINSTANCE.getAutomaticMeasurement_Log();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ActionsImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.FinalTaskImpl <em>Final Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.FinalTaskImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getFinalTask()
		 * @generated
		 */
		EClass FINAL_TASK = eINSTANCE.getFinalTask();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.EditionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ExecutionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AnyActionImpl <em>Any Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.AnyActionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getAnyAction()
		 * @generated
		 */
		EClass ANY_ACTION = eINSTANCE.getAnyAction();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TestExecutionImpl <em>Test Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TestExecutionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getTestExecution()
		 * @generated
		 */
		EClass TEST_EXECUTION = eINSTANCE.getTestExecution();

		/**
		 * The meta object literal for the '<em><b>Observe Passed Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_EXECUTION__OBSERVE_PASSED_TEST = eINSTANCE.getTestExecution_ObservePassedTest();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.LogType <em>Log Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.LogType
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getLogType()
		 * @generated
		 */
		EEnum LOG_TYPE = eINSTANCE.getLogType();

	}

} //MeasurementsPackage
