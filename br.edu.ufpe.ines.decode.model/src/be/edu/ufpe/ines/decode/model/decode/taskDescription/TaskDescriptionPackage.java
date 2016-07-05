/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionFactory
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
	TaskDescriptionPackage eINSTANCE = be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ModeledTaskImpl <em>Modeled Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ModeledTaskImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledTask()
	 * @generated
	 */
	int MODELED_TASK = 0;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK__RESTRICTION = 0;

	/**
	 * The number of structural features of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modeled Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELED_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ComposedTaskImpl <em>Composed Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ComposedTaskImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getComposedTask()
	 * @generated
	 */
	int COMPOSED_TASK = 3;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

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
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.SequencialImpl <em>Sequencial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.SequencialImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSequencial()
	 * @generated
	 */
	int SEQUENCIAL = 1;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCIAL__RESTRICTION = COMPOSED_TASK__RESTRICTION;

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
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RandomImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 2;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__RESTRICTION = COMPOSED_TASK__RESTRICTION;

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
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl <em>Experimental Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExperimentalTask()
	 * @generated
	 */
	int EXPERIMENTAL_TASK = 4;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__RESTRICTION = MODELED_TASK__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__NAME = MODELED_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__NEW_ATTRIBUTE = MODELED_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Artifacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS = MODELED_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK__DEPENDS = MODELED_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Experimental Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK_FEATURE_COUNT = MODELED_TASK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Experimental Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASK_OPERATION_COUNT = MODELED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RestrictionImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 5;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__DEADLINE = 0;

	/**
	 * The feature id for the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TIME_FRAME = 1;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask <em>Modeled Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeled Task</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask
	 * @generated
	 */
	EClass getModeledTask();

	/**
	 * Returns the meta object for the containment reference '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask#getRestriction()
	 * @see #getModeledTask()
	 * @generated
	 */
	EReference getModeledTask_Restriction();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Sequencial <em>Sequencial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequencial</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Sequencial
	 * @generated
	 */
	EClass getSequencial();

	/**
	 * Returns the meta object for the containment reference list '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Sequencial#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Sequencial#getTasks()
	 * @see #getSequencial()
	 * @generated
	 */
	EReference getSequencial_Tasks();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for the containment reference list '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Random#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Random#getTasks()
	 * @see #getRandom()
	 * @generated
	 */
	EReference getRandom_Tasks();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ComposedTask <em>Composed Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Task</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ComposedTask
	 * @generated
	 */
	EClass getComposedTask();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask <em>Experimental Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Task</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask
	 * @generated
	 */
	EClass getExperimentalTask();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getNewAttribute()
	 * @see #getExperimentalTask()
	 * @generated
	 */
	EAttribute getExperimentalTask_NewAttribute();

	/**
	 * Returns the meta object for the reference list '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getRequiredArtifacts <em>Required Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Artifacts</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getRequiredArtifacts()
	 * @see #getExperimentalTask()
	 * @generated
	 */
	EReference getExperimentalTask_RequiredArtifacts();

	/**
	 * Returns the meta object for the reference list '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask#getDepends()
	 * @see #getExperimentalTask()
	 * @generated
	 */
	EReference getExperimentalTask_Depends();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction#getDeadline()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction#getTimeFrame <em>Time Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Frame</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction#getTimeFrame()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_TimeFrame();

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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ModeledTaskImpl <em>Modeled Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ModeledTaskImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getModeledTask()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.SequencialImpl <em>Sequencial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.SequencialImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getSequencial()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RandomImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRandom()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ComposedTaskImpl <em>Composed Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ComposedTaskImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getComposedTask()
		 * @generated
		 */
		EClass COMPOSED_TASK = eINSTANCE.getComposedTask();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl <em>Experimental Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.ExperimentalTaskImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getExperimentalTask()
		 * @generated
		 */
		EClass EXPERIMENTAL_TASK = eINSTANCE.getExperimentalTask();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENTAL_TASK__NEW_ATTRIBUTE = eINSTANCE.getExperimentalTask_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Required Artifacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS = eINSTANCE.getExperimentalTask_RequiredArtifacts();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_TASK__DEPENDS = eINSTANCE.getExperimentalTask_Depends();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.RestrictionImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.impl.TaskDescriptionPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__DEADLINE = eINSTANCE.getRestriction_Deadline();

		/**
		 * The meta object literal for the '<em><b>Time Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION__TIME_FRAME = eINSTANCE.getRestriction_TimeFrame();

	}

} //TaskDescriptionPackage
