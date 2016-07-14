/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__RESTRICTION = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__MEASUREMENTS = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__MEASUREMENTS = MODELED_TASK__MEASUREMENTS;

	/**
	 * The number of structural features of the '<em>Composed Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK_FEATURE_COUNT = MODELED_TASK_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__RESTRICTION = COMPOSED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__MEASUREMENTS = COMPOSED_TASK__MEASUREMENTS;

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
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__RESTRICTION = COMPOSED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__MEASUREMENTS = COMPOSED_TASK__MEASUREMENTS;

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
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__MEASUREMENTS = MODELED_TASK__MEASUREMENTS;

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
	 * The number of operations of the '<em>Experimental Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK_OPERATION_COUNT = MODELED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 5;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl <em>Placement Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPlacementQuestionnaire()
	 * @generated
	 */
	int PLACEMENT_QUESTIONNAIRE = 6;

	/**
	 * The feature id for the '<em><b>Placement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_QUESTIONNAIRE__PLACEMENT = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Questionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placement Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_QUESTIONNAIRE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Placement Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_QUESTIONNAIRE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

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
	int TIME_RESTRICTION__TIME_FRAME = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION__DEADLINE = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RESTRICTION_OPERATION_COUNT = RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.SpecficRestrictionImpl <em>Specfic Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.SpecficRestrictionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSpecficRestriction()
	 * @generated
	 */
	int SPECFIC_RESTRICTION = 9;

	/**
	 * The number of structural features of the '<em>Specfic Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECFIC_RESTRICTION_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specfic Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECFIC_RESTRICTION_OPERATION_COUNT = RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.EclipseRetrictionImpl <em>Eclipse Retriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.EclipseRetrictionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getEclipseRetriction()
	 * @generated
	 */
	int ECLIPSE_RETRICTION = 10;

	/**
	 * The feature id for the '<em><b>Forbiden</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_RETRICTION__FORBIDEN = SPECFIC_RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eclipse Retriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_RETRICTION_FEATURE_COUNT = SPECFIC_RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eclipse Retriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_RETRICTION_OPERATION_COUNT = SPECFIC_RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.OtherRestrictionImpl <em>Other Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.OtherRestrictionImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getOtherRestriction()
	 * @generated
	 */
	int OTHER_RESTRICTION = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_RESTRICTION__DESCRIPTION = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_RESTRICTION_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Other Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_RESTRICTION_OPERATION_COUNT = RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledRestrictionsImpl <em>Modeled Restrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ModeledRestrictionsImpl
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledRestrictions()
	 * @generated
	 */
	int MODELED_RESTRICTIONS = 12;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_RESTRICTIONS__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Modeled Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_RESTRICTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modeled Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_RESTRICTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementType <em>Placement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementType
	 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPlacementType()
	 * @generated
	 */
	int PLACEMENT_TYPE = 14;


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
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask#getMeasurements()
	 * @see #getModeledTask()
	 * @generated
	 */
	EReference getModeledTask_Measurements();

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
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire <em>Placement Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement Questionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire
	 * @generated
	 */
	EClass getPlacementQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getPlacement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getPlacement()
	 * @see #getPlacementQuestionnaire()
	 * @generated
	 */
	EAttribute getPlacementQuestionnaire_Placement();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire#getQuestionnaire()
	 * @see #getPlacementQuestionnaire()
	 * @generated
	 */
	EReference getPlacementQuestionnaire_Questionnaire();

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
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.SpecficRestriction <em>Specfic Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specfic Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.SpecficRestriction
	 * @generated
	 */
	EClass getSpecficRestriction();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction <em>Eclipse Retriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Retriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction
	 * @generated
	 */
	EClass getEclipseRetriction();

	/**
	 * Returns the meta object for the attribute list '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction#getForbiden <em>Forbiden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Forbiden</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction#getForbiden()
	 * @see #getEclipseRetriction()
	 * @generated
	 */
	EAttribute getEclipseRetriction_Forbiden();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.OtherRestriction <em>Other Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.OtherRestriction
	 * @generated
	 */
	EClass getOtherRestriction();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.taskDescription.OtherRestriction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.OtherRestriction#getDescription()
	 * @see #getOtherRestriction()
	 * @generated
	 */
	EAttribute getOtherRestriction_Description();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions <em>Modeled Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeled Restrictions</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions
	 * @generated
	 */
	EClass getModeledRestrictions();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions#getChildren()
	 * @see #getModeledRestrictions()
	 * @generated
	 */
	EReference getModeledRestrictions_Children();

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
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELED_TASK__MEASUREMENTS = eINSTANCE.getModeledTask_Measurements();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl <em>Placement Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.PlacementQuestionnaireImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getPlacementQuestionnaire()
		 * @generated
		 */
		EClass PLACEMENT_QUESTIONNAIRE = eINSTANCE.getPlacementQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT_QUESTIONNAIRE__PLACEMENT = eINSTANCE.getPlacementQuestionnaire_Placement();

		/**
		 * The meta object literal for the '<em><b>Questionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE = eINSTANCE.getPlacementQuestionnaire_Questionnaire();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.SpecficRestrictionImpl <em>Specfic Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.SpecficRestrictionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSpecficRestriction()
		 * @generated
		 */
		EClass SPECFIC_RESTRICTION = eINSTANCE.getSpecficRestriction();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.EclipseRetrictionImpl <em>Eclipse Retriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.EclipseRetrictionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getEclipseRetriction()
		 * @generated
		 */
		EClass ECLIPSE_RETRICTION = eINSTANCE.getEclipseRetriction();

		/**
		 * The meta object literal for the '<em><b>Forbiden</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_RETRICTION__FORBIDEN = eINSTANCE.getEclipseRetriction_Forbiden();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.OtherRestrictionImpl <em>Other Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.OtherRestrictionImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getOtherRestriction()
		 * @generated
		 */
		EClass OTHER_RESTRICTION = eINSTANCE.getOtherRestriction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_RESTRICTION__DESCRIPTION = eINSTANCE.getOtherRestriction_Description();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.taskDescription.impl.ModeledRestrictionsImpl <em>Modeled Restrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.ModeledRestrictionsImpl
		 * @see br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledRestrictions()
		 * @generated
		 */
		EClass MODELED_RESTRICTIONS = eINSTANCE.getModeledRestrictions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELED_RESTRICTIONS__CHILDREN = eINSTANCE.getModeledRestrictions_Children();

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
