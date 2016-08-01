/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface TaskDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "taskDescription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDescriptionPackage eINSTANCE = br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl <em>Modeled Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledTask()
	 * @generated
	 */
	int MODELED_TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__ELEMENT_ID = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__RESTRICTION = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__MEASUREMENTS = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__PARENT = AuxPackage.NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK___GET_ALL_PARAMETERS = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Measument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK___GET_ALL_MEASUMENT = AuxPackage.NAMEABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ComposedTaskImpl <em>Composed Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ComposedTaskImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getComposedTask()
	 * @generated
	 */
	int COMPOSED_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__NAME = MODELED_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__ELEMENT_ID = MODELED_TASK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__MEASUREMENTS = MODELED_TASK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__PARENT = MODELED_TASK__PARENT;

	/**
	 * The number of structural features of the '<em>Composed Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK_FEATURE_COUNT = MODELED_TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK___GET_ALL_PARAMETERS = MODELED_TASK___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Get All Measument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK___GET_ALL_MEASUMENT = MODELED_TASK___GET_ALL_MEASUMENT;

	/**
	 * The number of operations of the '<em>Composed Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK_OPERATION_COUNT = MODELED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.SequencialImpl <em>Sequencial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.SequencialImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSequencial()
	 * @generated
	 */
	int SEQUENCIAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__NAME = COMPOSED_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__ELEMENT_ID = COMPOSED_TASK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__RESTRICTION = COMPOSED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__MEASUREMENTS = COMPOSED_TASK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__PARENT = COMPOSED_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__TASKS = COMPOSED_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequencial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL_FEATURE_COUNT = COMPOSED_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL___GET_ALL_PARAMETERS = COMPOSED_TASK___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Get All Measument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL___GET_ALL_MEASUMENT = COMPOSED_TASK___GET_ALL_MEASUMENT;

	/**
	 * The number of operations of the '<em>Sequencial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL_OPERATION_COUNT = COMPOSED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.RandomImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__NAME = COMPOSED_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__ELEMENT_ID = COMPOSED_TASK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__RESTRICTION = COMPOSED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__MEASUREMENTS = COMPOSED_TASK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__PARENT = COMPOSED_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__TASKS = COMPOSED_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FEATURE_COUNT = COMPOSED_TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM___GET_ALL_PARAMETERS = COMPOSED_TASK___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Get All Measument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM___GET_ALL_MEASUMENT = COMPOSED_TASK___GET_ALL_MEASUMENT;

	/**
	 * The number of operations of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_OPERATION_COUNT = COMPOSED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl <em>Experimental Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExperimentalTask()
	 * @generated
	 */
	int EXPERIMENTAL_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__NAME = MODELED_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__ELEMENT_ID = MODELED_TASK__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__MEASUREMENTS = MODELED_TASK__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__PARENT = MODELED_TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__DEPENDS = MODELED_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__REQUIRES = MODELED_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Experimental Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK_FEATURE_COUNT = MODELED_TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK___GET_ALL_PARAMETERS = MODELED_TASK___GET_ALL_PARAMETERS;

	/**
	 * The operation id for the '<em>Get All Measument</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK___GET_ALL_MEASUMENT = MODELED_TASK___GET_ALL_MEASUMENT;

	/**
	 * The number of operations of the '<em>Experimental Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK_OPERATION_COUNT = MODELED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ParameterImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 13;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnairemeasureImpl <em>Questionnairemeasure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnairemeasureImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getQuestionnairemeasure()
	 * @generated
	 */
	int QUESTIONNAIREMEASURE = 16;

	/**
	 * The number of structural features of the '<em>Questionnairemeasure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIREMEASURE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Questionnairemeasure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIREMEASURE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnaireMeasurementImpl <em>Questionnaire Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnaireMeasurementImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getQuestionnaireMeasurement()
	 * @generated
	 */
	int QUESTIONNAIRE_MEASUREMENT = 6;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_MEASUREMENT__PLACEMENT = QUESTIONNAIREMEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_MEASUREMENT__QUESTIONNAIRE = QUESTIONNAIREMEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Questionnaire Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_MEASUREMENT_FEATURE_COUNT = QUESTIONNAIREMEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Questionnaire Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_MEASUREMENT_OPERATION_COUNT = QUESTIONNAIREMEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ExecutionDerivationsImpl <em>Execution Derivations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ExecutionDerivationsImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExecutionDerivations()
	 * @generated
	 */
	int EXECUTION_DERIVATIONS = 7;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DERIVATIONS__TASKS = 0;

	/**
	 * The number of structural features of the '<em>Execution Derivations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DERIVATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution Derivations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DERIVATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl <em>Time Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getTimeRestriction()
	 * @generated
	 */
	int TIME_RESTRICTION = 8;

	/**
	 * The feature id for the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION__TIME_FRAME = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION__DEADLINE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.IDEParameterImpl <em>IDE Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.IDEParameterImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getIDEParameter()
	 * @generated
	 */
	int IDE_PARAMETER = 9;

	/**
	 * The number of structural features of the '<em>IDE Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDE Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.EclipseParameterImpl <em>Eclipse Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.EclipseParameterImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getEclipseParameter()
	 * @generated
	 */
	int ECLIPSE_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Forbiden</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PARAMETER__FORBIDEN = IDE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PARAMETER__REQUIRED = IDE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eclipse Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PARAMETER_FEATURE_COUNT = IDE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eclipse Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PARAMETER_OPERATION_COUNT = IDE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.GeneralParameterImpl <em>General Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.GeneralParameterImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getGeneralParameter()
	 * @generated
	 */
	int GENERAL_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PARAMETER__DESCRIPTION = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>General Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.OtherParametersImpl <em>Other Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.OtherParametersImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getOtherParameters()
	 * @generated
	 */
	int OTHER_PARAMETERS = 12;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PARAMETERS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Other Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Other Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementsImpl <em>Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementsImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getMeasurements()
	 * @generated
	 */
	int MEASUREMENTS = 14;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.PenAndPaperQuestionnaireImpl <em>Pen And Paper Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.PenAndPaperQuestionnaireImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPenAndPaperQuestionnaire()
	 * @generated
	 */
	int PEN_AND_PAPER_QUESTIONNAIRE = 15;

	/**
	 * The feature id for the '<em><b>File PDF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF = QUESTIONNAIREMEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pen And Paper Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_AND_PAPER_QUESTIONNAIRE_FEATURE_COUNT = QUESTIONNAIREMEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pen And Paper Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_AND_PAPER_QUESTIONNAIRE_OPERATION_COUNT = QUESTIONNAIREMEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementType <em>Placement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPlacementType()
	 * @generated
	 */
	int PLACEMENT_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask <em>Modeled Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeled Task</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask
	 * @generated
	 */
	EClass getModeledTask();

	/**
	 * Returns the meta object for the containment reference '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getRestriction()
	 * @see #getModeledTask()
	 * @generated
	 */
	EReference getModeledTask_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measurements</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements()
	 * @see #getModeledTask()
	 * @generated
	 */
	EReference getModeledTask_Measurements();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getParent()
	 * @see #getModeledTask()
	 * @generated
	 */
	EReference getModeledTask_Parent();

	/**
	 * Returns the meta object for the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Parameters</em>' operation.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getAllParameters()
	 * @generated
	 */
	EOperation getModeledTask__GetAllParameters();

	/**
	 * Returns the meta object for the '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getAllMeasument() <em>Get All Measument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Measument</em>' operation.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getAllMeasument()
	 * @generated
	 */
	EOperation getModeledTask__GetAllMeasument();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Sequencial <em>Sequencial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequencial</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Sequencial
	 * @generated
	 */
	EClass getSequencial();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.Sequencial#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Sequencial#getTasks()
	 * @see #getSequencial()
	 * @generated
	 */
	EReference getSequencial_Tasks();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.Random#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Random#getTasks()
	 * @see #getRandom()
	 * @generated
	 */
	EReference getRandom_Tasks();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.ComposedTask <em>Composed Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Task</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ComposedTask
	 * @generated
	 */
	EClass getComposedTask();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask <em>Experimental Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Task</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask
	 * @generated
	 */
	EClass getExperimentalTask();

	/**
	 * Returns the meta object for the reference list '{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getDepends()
	 * @see #getExperimentalTask()
	 * @generated
	 */
	EReference getExperimentalTask_Depends();

	/**
	 * Returns the meta object for the reference list '{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask#getRequires()
	 * @see #getExperimentalTask()
	 * @generated
	 */
	EReference getExperimentalTask_Requires();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement <em>Questionnaire Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire Measurement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement
	 * @generated
	 */
	EClass getQuestionnaireMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getPlacement()
	 * @see #getQuestionnaireMeasurement()
	 * @generated
	 */
	EAttribute getQuestionnaireMeasurement_Placement();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement#getQuestionnaire()
	 * @see #getQuestionnaireMeasurement()
	 * @generated
	 */
	EReference getQuestionnaireMeasurement_Questionnaire();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations <em>Execution Derivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Derivations</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations
	 * @generated
	 */
	EClass getExecutionDerivations();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations#getTasks()
	 * @see #getExecutionDerivations()
	 * @generated
	 */
	EReference getExecutionDerivations_Tasks();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction <em>Time Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TimeRestriction
	 * @generated
	 */
	EClass getTimeRestriction();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getTimeFrame <em>Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Frame</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getTimeFrame()
	 * @see #getTimeRestriction()
	 * @generated
	 */
	EAttribute getTimeRestriction_TimeFrame();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getDeadline()
	 * @see #getTimeRestriction()
	 * @generated
	 */
	EAttribute getTimeRestriction_Deadline();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.IDEParameter <em>IDE Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDE Parameter</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.IDEParameter
	 * @generated
	 */
	EClass getIDEParameter();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseParameter <em>Eclipse Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Parameter</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseParameter
	 * @generated
	 */
	EClass getEclipseParameter();

	/**
	 * Returns the meta object for the attribute list '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseParameter#getForbiden <em>Forbiden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Forbiden</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseParameter#getForbiden()
	 * @see #getEclipseParameter()
	 * @generated
	 */
	EAttribute getEclipseParameter_Forbiden();

	/**
	 * Returns the meta object for the attribute list '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseParameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseParameter#getRequired()
	 * @see #getEclipseParameter()
	 * @generated
	 */
	EAttribute getEclipseParameter_Required();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.GeneralParameter <em>General Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Parameter</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.GeneralParameter
	 * @generated
	 */
	EClass getGeneralParameter();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.GeneralParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.GeneralParameter#getDescription()
	 * @see #getGeneralParameter()
	 * @generated
	 */
	EAttribute getGeneralParameter_Description();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.OtherParameters <em>Other Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Parameters</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.OtherParameters
	 * @generated
	 */
	EClass getOtherParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.OtherParameters#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.OtherParameters#getChildren()
	 * @see #getOtherParameters()
	 * @generated
	 */
	EReference getOtherParameters_Children();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Measurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurements</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Measurements
	 * @generated
	 */
	EClass getMeasurements();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.Measurements#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Measurements#getContent()
	 * @see #getMeasurements()
	 * @generated
	 */
	EReference getMeasurements_Content();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.PenAndPaperQuestionnaire <em>Pen And Paper Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen And Paper Questionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PenAndPaperQuestionnaire
	 * @generated
	 */
	EClass getPenAndPaperQuestionnaire();

	/**
	 * Returns the meta object for the reference list '{@link br.edu.ufpe.ines.decode.taskDescription.PenAndPaperQuestionnaire#getFilePDF <em>File PDF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File PDF</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PenAndPaperQuestionnaire#getFilePDF()
	 * @see #getPenAndPaperQuestionnaire()
	 * @generated
	 */
	EReference getPenAndPaperQuestionnaire_FilePDF();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Questionnairemeasure <em>Questionnairemeasure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnairemeasure</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Questionnairemeasure
	 * @generated
	 */
	EClass getQuestionnairemeasure();

	/**
	 * Returns the meta object for enum '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementType <em>Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement Type</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
	 * @generated
	 */
	EEnum getPlacementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskDescriptionFactory getTaskDescriptionFactory();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl <em>Modeled Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ModeledTaskImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledTask()
		 * @generated
		 */
		EClass MODELED_TASK = eINSTANCE.getModeledTask();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELED_TASK__RESTRICTION = eINSTANCE.getModeledTask_Restriction();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELED_TASK__MEASUREMENTS = eINSTANCE.getModeledTask_Measurements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELED_TASK__PARENT = eINSTANCE.getModeledTask_Parent();

		/**
		 * The meta object literal for the '<em><b>Get All Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELED_TASK___GET_ALL_PARAMETERS = eINSTANCE.getModeledTask__GetAllParameters();

		/**
		 * The meta object literal for the '<em><b>Get All Measument</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODELED_TASK___GET_ALL_MEASUMENT = eINSTANCE.getModeledTask__GetAllMeasument();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.SequencialImpl <em>Sequencial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.SequencialImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSequencial()
		 * @generated
		 */
		EClass SEQUENCIAL = eINSTANCE.getSequencial();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCIAL__TASKS = eINSTANCE.getSequencial_Tasks();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.RandomImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRandom()
		 * @generated
		 */
		EClass RANDOM = eINSTANCE.getRandom();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM__TASKS = eINSTANCE.getRandom_Tasks();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ComposedTaskImpl <em>Composed Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ComposedTaskImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getComposedTask()
		 * @generated
		 */
		EClass COMPOSED_TASK = eINSTANCE.getComposedTask();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl <em>Experimental Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ExperimentalTaskImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExperimentalTask()
		 * @generated
		 */
		EClass EXPERIMENTAL_TASK = eINSTANCE.getExperimentalTask();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_TASK__DEPENDS = eINSTANCE.getExperimentalTask_Depends();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_TASK__REQUIRES = eINSTANCE.getExperimentalTask_Requires();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ParameterImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnaireMeasurementImpl <em>Questionnaire Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnaireMeasurementImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getQuestionnaireMeasurement()
		 * @generated
		 */
		EClass QUESTIONNAIRE_MEASUREMENT = eINSTANCE.getQuestionnaireMeasurement();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE_MEASUREMENT__PLACEMENT = eINSTANCE.getQuestionnaireMeasurement_Placement();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_MEASUREMENT__QUESTIONNAIRE = eINSTANCE.getQuestionnaireMeasurement_Questionnaire();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ExecutionDerivationsImpl <em>Execution Derivations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ExecutionDerivationsImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExecutionDerivations()
		 * @generated
		 */
		EClass EXECUTION_DERIVATIONS = eINSTANCE.getExecutionDerivations();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_DERIVATIONS__TASKS = eINSTANCE.getExecutionDerivations_Tasks();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl <em>Time Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getTimeRestriction()
		 * @generated
		 */
		EClass TIME_RESTRICTION = eINSTANCE.getTimeRestriction();

		/**
		 * The meta object literal for the '<em><b>Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RESTRICTION__TIME_FRAME = eINSTANCE.getTimeRestriction_TimeFrame();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RESTRICTION__DEADLINE = eINSTANCE.getTimeRestriction_Deadline();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.IDEParameterImpl <em>IDE Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.IDEParameterImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getIDEParameter()
		 * @generated
		 */
		EClass IDE_PARAMETER = eINSTANCE.getIDEParameter();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.EclipseParameterImpl <em>Eclipse Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.EclipseParameterImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getEclipseParameter()
		 * @generated
		 */
		EClass ECLIPSE_PARAMETER = eINSTANCE.getEclipseParameter();

		/**
		 * The meta object literal for the '<em><b>Forbiden</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_PARAMETER__FORBIDEN = eINSTANCE.getEclipseParameter_Forbiden();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_PARAMETER__REQUIRED = eINSTANCE.getEclipseParameter_Required();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.GeneralParameterImpl <em>General Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.GeneralParameterImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getGeneralParameter()
		 * @generated
		 */
		EClass GENERAL_PARAMETER = eINSTANCE.getGeneralParameter();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_PARAMETER__DESCRIPTION = eINSTANCE.getGeneralParameter_Description();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.OtherParametersImpl <em>Other Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.OtherParametersImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getOtherParameters()
		 * @generated
		 */
		EClass OTHER_PARAMETERS = eINSTANCE.getOtherParameters();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_PARAMETERS__CHILDREN = eINSTANCE.getOtherParameters_Children();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementsImpl <em>Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.MeasurementsImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getMeasurements()
		 * @generated
		 */
		EClass MEASUREMENTS = eINSTANCE.getMeasurements();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS__CONTENT = eINSTANCE.getMeasurements_Content();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.PenAndPaperQuestionnaireImpl <em>Pen And Paper Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.PenAndPaperQuestionnaireImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPenAndPaperQuestionnaire()
		 * @generated
		 */
		EClass PEN_AND_PAPER_QUESTIONNAIRE = eINSTANCE.getPenAndPaperQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>File PDF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF = eINSTANCE.getPenAndPaperQuestionnaire_FilePDF();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnairemeasureImpl <em>Questionnairemeasure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.QuestionnairemeasureImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getQuestionnairemeasure()
		 * @generated
		 */
		EClass QUESTIONNAIREMEASURE = eINSTANCE.getQuestionnairemeasure();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementType <em>Placement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPlacementType()
		 * @generated
		 */
		EEnum PLACEMENT_TYPE = eINSTANCE.getPlacementType();

	}

} //TaskDescriptionPackage
