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

import br.edu.ufpe.ines.decode.measurement.MeasurementPackage;

import br.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.ComposedTask;
import br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction;
import br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations;
import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.OtherRestriction;
import br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire;
import br.edu.ufpe.ines.decode.taskDescription.PlacementType;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.edu.ufpe.ines.decode.taskDescription.Restriction;
import br.edu.ufpe.ines.decode.taskDescription.Sequencial;
import br.edu.ufpe.ines.decode.taskDescription.SpecficRestriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import br.edu.ufpe.ines.decode.taskDescription.TimeRestriction;
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
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementQuestionnaireEClass = null;

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
	private EClass specficRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseRetrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeledRestrictionsEClass = null;

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
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theTaskDescriptionPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theMeasurementPackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theTaskDescriptionPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();
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
	public EReference getModeledTask_Placement() {
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
	public EReference getExperimentalTask_RequiredArtifacts() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalTask_Depends() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementQuestionnaire() {
		return placementQuestionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementQuestionnaire_Placement() {
		return (EAttribute)placementQuestionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlacementQuestionnaire_Questionnaire() {
		return (EReference)placementQuestionnaireEClass.getEStructuralFeatures().get(1);
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
	public EClass getSpecficRestriction() {
		return specficRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseRetriction() {
		return eclipseRetrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipseRetriction_Forbiden() {
		return (EAttribute)eclipseRetrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherRestriction() {
		return otherRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherRestriction_Description() {
		return (EAttribute)otherRestrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeledRestrictions() {
		return modeledRestrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeledRestrictions_Children() {
		return (EReference)modeledRestrictionsEClass.getEStructuralFeatures().get(0);
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
		createEReference(modeledTaskEClass, MODELED_TASK__PLACEMENT);

		sequencialEClass = createEClass(SEQUENCIAL);
		createEReference(sequencialEClass, SEQUENCIAL__TASKS);

		randomEClass = createEClass(RANDOM);
		createEReference(randomEClass, RANDOM__TASKS);

		composedTaskEClass = createEClass(COMPOSED_TASK);

		experimentalTaskEClass = createEClass(EXPERIMENTAL_TASK);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__REQUIRED_ARTIFACTS);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__DEPENDS);

		restrictionEClass = createEClass(RESTRICTION);

		placementQuestionnaireEClass = createEClass(PLACEMENT_QUESTIONNAIRE);
		createEAttribute(placementQuestionnaireEClass, PLACEMENT_QUESTIONNAIRE__PLACEMENT);
		createEReference(placementQuestionnaireEClass, PLACEMENT_QUESTIONNAIRE__QUESTIONNAIRE);

		executionDerivationsEClass = createEClass(EXECUTION_DERIVATIONS);
		createEReference(executionDerivationsEClass, EXECUTION_DERIVATIONS__TASKS);

		timeRestrictionEClass = createEClass(TIME_RESTRICTION);
		createEAttribute(timeRestrictionEClass, TIME_RESTRICTION__TIME_FRAME);
		createEAttribute(timeRestrictionEClass, TIME_RESTRICTION__DEADLINE);

		specficRestrictionEClass = createEClass(SPECFIC_RESTRICTION);

		eclipseRetrictionEClass = createEClass(ECLIPSE_RETRICTION);
		createEAttribute(eclipseRetrictionEClass, ECLIPSE_RETRICTION__FORBIDEN);

		otherRestrictionEClass = createEClass(OTHER_RESTRICTION);
		createEAttribute(otherRestrictionEClass, OTHER_RESTRICTION__DESCRIPTION);

		modeledRestrictionsEClass = createEClass(MODELED_RESTRICTIONS);
		createEReference(modeledRestrictionsEClass, MODELED_RESTRICTIONS__CHILDREN);

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
		AuxPackage theAuxPackage = (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);
		ArtifactsPackage theArtifactsPackage = (ArtifactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modeledTaskEClass.getESuperTypes().add(theAuxPackage.getNameable());
		sequencialEClass.getESuperTypes().add(this.getComposedTask());
		randomEClass.getESuperTypes().add(this.getComposedTask());
		composedTaskEClass.getESuperTypes().add(this.getModeledTask());
		experimentalTaskEClass.getESuperTypes().add(this.getModeledTask());
		timeRestrictionEClass.getESuperTypes().add(this.getRestriction());
		specficRestrictionEClass.getESuperTypes().add(this.getRestriction());
		eclipseRetrictionEClass.getESuperTypes().add(this.getSpecficRestriction());
		otherRestrictionEClass.getESuperTypes().add(this.getRestriction());

		// Initialize classes, features, and operations; add parameters
		initEClass(modeledTaskEClass, ModeledTask.class, "ModeledTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeledTask_Restriction(), this.getModeledRestrictions(), null, "restriction", null, 0, 1, ModeledTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeledTask_Placement(), this.getPlacementQuestionnaire(), null, "placement", null, 0, 1, ModeledTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequencialEClass, Sequencial.class, "Sequencial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequencial_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Sequencial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomEClass, Random.class, "Random", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandom_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Random.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(composedTaskEClass, ComposedTask.class, "ComposedTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimentalTaskEClass, ExperimentalTask.class, "ExperimentalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalTask_RequiredArtifacts(), theArtifactsPackage.getFileArtifact(), null, "requiredArtifacts", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalTask_Depends(), this.getExperimentalTask(), null, "depends", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placementQuestionnaireEClass, PlacementQuestionnaire.class, "PlacementQuestionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacementQuestionnaire_Placement(), this.getPlacementType(), "placement", "Before", 0, 1, PlacementQuestionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlacementQuestionnaire_Questionnaire(), theArtifactsPackage.getQuestionnaire(), theArtifactsPackage.getQuestionnaire_Placementquestionnaire(), "questionnaire", null, 0, 1, PlacementQuestionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionDerivationsEClass, ExecutionDerivations.class, "ExecutionDerivations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionDerivations_Tasks(), this.getModeledTask(), null, "tasks", null, 1, -1, ExecutionDerivations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeRestrictionEClass, TimeRestriction.class, "TimeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRestriction_TimeFrame(), theXMLTypePackage.getInteger(), "timeFrame", null, 0, 1, TimeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeRestriction_Deadline(), theXMLTypePackage.getDateTime(), "deadline", null, 0, 1, TimeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specficRestrictionEClass, SpecficRestriction.class, "SpecficRestriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eclipseRetrictionEClass, EclipseRetriction.class, "EclipseRetriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipseRetriction_Forbiden(), theXMLTypePackage.getString(), "forbiden", null, 0, -1, EclipseRetriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherRestrictionEClass, OtherRestriction.class, "OtherRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherRestriction_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, OtherRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeledRestrictionsEClass, ModeledRestrictions.class, "ModeledRestrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeledRestrictions_Children(), this.getRestriction(), null, "children", null, 1, -1, ModeledRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(placementTypeEEnum, PlacementType.class, "PlacementType");
		addEEnumLiteral(placementTypeEEnum, PlacementType.AFTER);
		addEEnumLiteral(placementTypeEEnum, PlacementType.BEFORE);
		addEEnumLiteral(placementTypeEEnum, PlacementType.DURING);
	}

} //TaskDescriptionPackageImpl
