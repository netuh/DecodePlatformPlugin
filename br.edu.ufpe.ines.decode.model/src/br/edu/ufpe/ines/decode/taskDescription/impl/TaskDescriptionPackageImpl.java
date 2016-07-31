/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.DecodePackage;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;

import br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl;

import br.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.ComposedTask;
import br.edu.ufpe.ines.decode.taskDescription.EclipseParameter;
import br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations;
import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.GeneralParameter;
import br.edu.ufpe.ines.decode.taskDescription.IDEParameter;
import br.edu.ufpe.ines.decode.taskDescription.Measurement;
import br.edu.ufpe.ines.decode.taskDescription.Measurements;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.OtherParameters;
import br.edu.ufpe.ines.decode.taskDescription.Parameter;
import br.edu.ufpe.ines.decode.taskDescription.PenAndPaperQuestionnaire;
import br.edu.ufpe.ines.decode.taskDescription.PlacementType;
import br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement;
import br.edu.ufpe.ines.decode.taskDescription.Questionnairemeasure;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.edu.ufpe.ines.decode.taskDescription.Sequencial;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;
import br.edu.ufpe.ines.decode.taskDescription.TimeRestriction;

import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage;

import br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptionPackageImpl extends EPackageImpl implements TaskDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeledTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionDerivationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ideParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penAndPaperQuestionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnairemeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskDescriptionPackageImpl() {
		super(eNS_URI, TaskDescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TaskDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskDescriptionPackage init() {
		if (isInited) return (TaskDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaskDescriptionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) : DecodePackage.eINSTANCE);
		MeasurementsPackageImpl theMeasurementsPackage = (MeasurementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) instanceof MeasurementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) : MeasurementsPackage.eINSTANCE);
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theTaskDescriptionPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theMeasurementsPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theTaskDescriptionPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theMeasurementsPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskDescriptionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskDescriptionPackage.eNS_URI, theTaskDescriptionPackage);
		return theTaskDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeledTask() {
		return modeledTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeledTask_Restriction() {
		return (EReference)modeledTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeledTask_Measurements() {
		return (EReference)modeledTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequencial() {
		return sequencialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencial_Tasks() {
		return (EReference)sequencialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandom() {
		return randomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandom_Tasks() {
		return (EReference)randomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedTask() {
		return composedTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentalTask() {
		return experimentalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalTask_Depends() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalTask_Requires() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireMeasurement() {
		return questionnaireMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaireMeasurement_Placement() {
		return (EAttribute)questionnaireMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireMeasurement_Questionnaire() {
		return (EReference)questionnaireMeasurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionDerivations() {
		return executionDerivationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionDerivations_Tasks() {
		return (EReference)executionDerivationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRestriction() {
		return timeRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRestriction_TimeFrame() {
		return (EAttribute)timeRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRestriction_Deadline() {
		return (EAttribute)timeRestrictionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDEParameter() {
		return ideParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseParameter() {
		return eclipseParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseParameter_Forbiden() {
		return (EAttribute)eclipseParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseParameter_Required() {
		return (EAttribute)eclipseParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralParameter() {
		return generalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralParameter_Description() {
		return (EAttribute)generalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherParameters() {
		return otherParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherParameters_Children() {
		return (EReference)otherParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurements() {
		return measurementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurements_Content() {
		return (EReference)measurementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenAndPaperQuestionnaire() {
		return penAndPaperQuestionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPenAndPaperQuestionnaire_FilePDF() {
		return (EReference)penAndPaperQuestionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnairemeasure() {
		return questionnairemeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlacementType() {
		return placementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionFactory getTaskDescriptionFactory() {
		return (TaskDescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modeledTaskEClass = createEClass(MODELED_TASK);
		createEReference(modeledTaskEClass, MODELED_TASK__RESTRICTION);
		createEReference(modeledTaskEClass, MODELED_TASK__MEASUREMENTS);

		sequencialEClass = createEClass(SEQUENCIAL);
		createEReference(sequencialEClass, SEQUENCIAL__TASKS);

		randomEClass = createEClass(RANDOM);
		createEReference(randomEClass, RANDOM__TASKS);

		composedTaskEClass = createEClass(COMPOSED_TASK);

		experimentalTaskEClass = createEClass(EXPERIMENTAL_TASK);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__DEPENDS);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__REQUIRES);

		parameterEClass = createEClass(PARAMETER);

		questionnaireMeasurementEClass = createEClass(QUESTIONNAIRE_MEASUREMENT);
		createEAttribute(questionnaireMeasurementEClass, QUESTIONNAIRE_MEASUREMENT__PLACEMENT);
		createEReference(questionnaireMeasurementEClass, QUESTIONNAIRE_MEASUREMENT__QUESTIONNAIRE);

		executionDerivationsEClass = createEClass(EXECUTION_DERIVATIONS);
		createEReference(executionDerivationsEClass, EXECUTION_DERIVATIONS__TASKS);

		timeRestrictionEClass = createEClass(TIME_RESTRICTION);
		createEAttribute(timeRestrictionEClass, TIME_RESTRICTION__TIME_FRAME);
		createEAttribute(timeRestrictionEClass, TIME_RESTRICTION__DEADLINE);

		ideParameterEClass = createEClass(IDE_PARAMETER);

		eclipseParameterEClass = createEClass(ECLIPSE_PARAMETER);
		createEAttribute(eclipseParameterEClass, ECLIPSE_PARAMETER__FORBIDEN);
		createEAttribute(eclipseParameterEClass, ECLIPSE_PARAMETER__REQUIRED);

		generalParameterEClass = createEClass(GENERAL_PARAMETER);
		createEAttribute(generalParameterEClass, GENERAL_PARAMETER__DESCRIPTION);

		otherParametersEClass = createEClass(OTHER_PARAMETERS);
		createEReference(otherParametersEClass, OTHER_PARAMETERS__CHILDREN);

		measurementEClass = createEClass(MEASUREMENT);

		measurementsEClass = createEClass(MEASUREMENTS);
		createEReference(measurementsEClass, MEASUREMENTS__CONTENT);

		penAndPaperQuestionnaireEClass = createEClass(PEN_AND_PAPER_QUESTIONNAIRE);
		createEReference(penAndPaperQuestionnaireEClass, PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF);

		questionnairemeasureEClass = createEClass(QUESTIONNAIREMEASURE);

		// Create enums
		placementTypeEEnum = createEEnum(PLACEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MeasurementsPackage theMeasurementsPackage = (MeasurementsPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI);
		AuxPackage theAuxPackage = (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);
		ArtifactsPackage theArtifactsPackage = (ArtifactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMeasurementsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modeledTaskEClass.getESuperTypes().add(theAuxPackage.getNameable());
		modeledTaskEClass.getESuperTypes().add(theAuxPackage.getIdentifiable());
		sequencialEClass.getESuperTypes().add(this.getComposedTask());
		randomEClass.getESuperTypes().add(this.getComposedTask());
		composedTaskEClass.getESuperTypes().add(this.getModeledTask());
		experimentalTaskEClass.getESuperTypes().add(this.getModeledTask());
		questionnaireMeasurementEClass.getESuperTypes().add(this.getQuestionnairemeasure());
		timeRestrictionEClass.getESuperTypes().add(this.getParameter());
		ideParameterEClass.getESuperTypes().add(this.getParameter());
		eclipseParameterEClass.getESuperTypes().add(this.getIDEParameter());
		generalParameterEClass.getESuperTypes().add(this.getParameter());
		penAndPaperQuestionnaireEClass.getESuperTypes().add(this.getQuestionnairemeasure());
		questionnairemeasureEClass.getESuperTypes().add(this.getMeasurement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modeledTaskEClass, ModeledTask.class, "ModeledTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeledTask_Restriction(), this.getOtherParameters(), null, "restriction", null, 0, 1, ModeledTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeledTask_Measurements(), this.getMeasurements(), null, "measurements", null, 0, 1, ModeledTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sequencialEClass, Sequencial.class, "Sequencial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequencial_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Sequencial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomEClass, Random.class, "Random", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandom_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Random.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(composedTaskEClass, ComposedTask.class, "ComposedTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimentalTaskEClass, ExperimentalTask.class, "ExperimentalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalTask_Depends(), this.getExperimentalTask(), null, "depends", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalTask_Requires(), theArtifactsPackage.getAbstractArtifact(), null, "requires", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionnaireMeasurementEClass, QuestionnaireMeasurement.class, "QuestionnaireMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnaireMeasurement_Placement(), this.getPlacementType(), "placement", "Before", 0, 1, QuestionnaireMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaireMeasurement_Questionnaire(), theArtifactsPackage.getQuestionnaireInner(), theArtifactsPackage.getQuestionnaireInner_Placementquestionnaire(), "questionnaire", null, 0, 1, QuestionnaireMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionDerivationsEClass, ExecutionDerivations.class, "ExecutionDerivations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionDerivations_Tasks(), this.getModeledTask(), null, "tasks", null, 1, -1, ExecutionDerivations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRestrictionEClass, TimeRestriction.class, "TimeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRestriction_TimeFrame(), theXMLTypePackage.getInteger(), "timeFrame", null, 0, 1, TimeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRestriction_Deadline(), theXMLTypePackage.getDateTime(), "deadline", null, 0, 1, TimeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ideParameterEClass, IDEParameter.class, "IDEParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eclipseParameterEClass, EclipseParameter.class, "EclipseParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipseParameter_Forbiden(), theXMLTypePackage.getString(), "forbiden", null, 0, -1, EclipseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipseParameter_Required(), theXMLTypePackage.getString(), "required", null, 0, -1, EclipseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalParameterEClass, GeneralParameter.class, "GeneralParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralParameter_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, GeneralParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherParametersEClass, OtherParameters.class, "OtherParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtherParameters_Children(), this.getParameter(), null, "children", null, 1, -1, OtherParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementsEClass, Measurements.class, "Measurements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurements_Content(), this.getMeasurement(), null, "content", null, 0, -1, Measurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(penAndPaperQuestionnaireEClass, PenAndPaperQuestionnaire.class, "PenAndPaperQuestionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPenAndPaperQuestionnaire_FilePDF(), theArtifactsPackage.getOtherFile(), null, "FilePDF", null, 1, -1, PenAndPaperQuestionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnairemeasureEClass, Questionnairemeasure.class, "Questionnairemeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(placementTypeEEnum, PlacementType.class, "PlacementType");
		addEEnumLiteral(placementTypeEEnum, PlacementType.AFTER);
		addEEnumLiteral(placementTypeEEnum, PlacementType.BEFORE);
		addEEnumLiteral(placementTypeEEnum, PlacementType.DURING);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getExecutionDerivations_Tasks(), 
		   source, 
		   new String[] {
			 "wildcards", "",
			 "name", ""
		   });
	}

} //TaskDescriptionPackageImpl
