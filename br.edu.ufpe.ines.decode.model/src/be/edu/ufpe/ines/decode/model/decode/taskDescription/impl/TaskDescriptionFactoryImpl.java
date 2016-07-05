/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription.impl;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptionFactoryImpl extends EFactoryImpl implements TaskDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskDescriptionFactory init() {
		try {
			TaskDescriptionFactory theTaskDescriptionFactory = (TaskDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(TaskDescriptionPackage.eNS_URI);
			if (theTaskDescriptionFactory != null) {
				return theTaskDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaskDescriptionPackage.SEQUENCIAL: return createSequencial();
			case TaskDescriptionPackage.RANDOM: return createRandom();
			case TaskDescriptionPackage.EXPERIMENTAL_TASK: return createExperimentalTask();
			case TaskDescriptionPackage.RESTRICTION: return createRestriction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequencial createSequencial() {
		SequencialImpl sequencial = new SequencialImpl();
		return sequencial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random createRandom() {
		RandomImpl random = new RandomImpl();
		return random;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalTask createExperimentalTask() {
		ExperimentalTaskImpl experimentalTask = new ExperimentalTaskImpl();
		return experimentalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionPackage getTaskDescriptionPackage() {
		return (TaskDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskDescriptionPackage getPackage() {
		return TaskDescriptionPackage.eINSTANCE;
	}

} //TaskDescriptionFactoryImpl
