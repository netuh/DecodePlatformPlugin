/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.taskDescription.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case TaskDescriptionPackage.QUESTIONNAIRE_MEASUREMENT: return createQuestionnaireMeasurement();
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS: return createExecutionDerivations();
			case TaskDescriptionPackage.TIME_RESTRICTION: return createTimeRestriction();
			case TaskDescriptionPackage.ECLIPSE_PARAMETER: return createEclipseParameter();
			case TaskDescriptionPackage.GENERAL_PARAMETER: return createGeneralParameter();
			case TaskDescriptionPackage.OTHER_PARAMETERS: return createOtherParameters();
			case TaskDescriptionPackage.MEASUREMENTS: return createMeasurements();
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE: return createPenAndPaperQuestionnaire();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TaskDescriptionPackage.PLACEMENT_TYPE:
				return createPlacementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TaskDescriptionPackage.PLACEMENT_TYPE:
				return convertPlacementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public QuestionnaireMeasurement createQuestionnaireMeasurement() {
		QuestionnaireMeasurementImpl questionnaireMeasurement = new QuestionnaireMeasurementImpl();
		return questionnaireMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionDerivations createExecutionDerivations() {
		ExecutionDerivationsImpl executionDerivations = new ExecutionDerivationsImpl();
		return executionDerivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRestriction createTimeRestriction() {
		TimeRestrictionImpl timeRestriction = new TimeRestrictionImpl();
		return timeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseParameter createEclipseParameter() {
		EclipseParameterImpl eclipseParameter = new EclipseParameterImpl();
		return eclipseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralParameter createGeneralParameter() {
		GeneralParameterImpl generalParameter = new GeneralParameterImpl();
		return generalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherParameters createOtherParameters() {
		OtherParametersImpl otherParameters = new OtherParametersImpl();
		return otherParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurements createMeasurements() {
		MeasurementsImpl measurements = new MeasurementsImpl();
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenAndPaperQuestionnaire createPenAndPaperQuestionnaire() {
		PenAndPaperQuestionnaireImpl penAndPaperQuestionnaire = new PenAndPaperQuestionnaireImpl();
		return penAndPaperQuestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType createPlacementTypeFromString(EDataType eDataType, String initialValue) {
		PlacementType result = PlacementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
