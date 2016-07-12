/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.OtherMeasurementImpl <em>Other Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.OtherMeasurementImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getOtherMeasurement()
	 * @generated
	 */
	int OTHER_MEASUREMENT = 0;

	/**
	 * The number of structural features of the '<em>Other Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MEASUREMENT_FEATURE_COUNT = TaskDescriptionPackage.MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Other Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_MEASUREMENT_OPERATION_COUNT = TaskDescriptionPackage.MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ObservingArtifactImpl <em>Observing Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ObservingArtifactImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getObservingArtifact()
	 * @generated
	 */
	int OBSERVING_ARTIFACT = 1;

	/**
	 * The number of structural features of the '<em>Observing Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT_FEATURE_COUNT = OTHER_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observing Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT_OPERATION_COUNT = OTHER_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TimeOnTaskImpl <em>Time On Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TimeOnTaskImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getTimeOnTask()
	 * @generated
	 */
	int TIME_ON_TASK = 2;

	/**
	 * The number of structural features of the '<em>Time On Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK_FEATURE_COUNT = OTHER_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time On Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK_OPERATION_COUNT = OTHER_MEASUREMENT_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.OtherMeasurement <em>Other Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Measurement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.OtherMeasurement
	 * @generated
	 */
	EClass getOtherMeasurement();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.ObservingArtifact <em>Observing Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observing Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.ObservingArtifact
	 * @generated
	 */
	EClass getObservingArtifact();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.TimeOnTask <em>Time On Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time On Task</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.TimeOnTask
	 * @generated
	 */
	EClass getTimeOnTask();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.OtherMeasurementImpl <em>Other Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.OtherMeasurementImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getOtherMeasurement()
		 * @generated
		 */
		EClass OTHER_MEASUREMENT = eINSTANCE.getOtherMeasurement();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ObservingArtifactImpl <em>Observing Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.ObservingArtifactImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getObservingArtifact()
		 * @generated
		 */
		EClass OBSERVING_ARTIFACT = eINSTANCE.getObservingArtifact();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TimeOnTaskImpl <em>Time On Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.TimeOnTaskImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl#getTimeOnTask()
		 * @generated
		 */
		EClass TIME_ON_TASK = eINSTANCE.getTimeOnTask();

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

	}

} //MeasurementsPackage
