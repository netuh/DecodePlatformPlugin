/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements.impl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl;
import br.edu.ufpe.ines.decode.taskDescription.measurements.Actions;
import br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction;
import br.edu.ufpe.ines.decode.taskDescription.measurements.AutomaticMeasurement;
import br.edu.ufpe.ines.decode.taskDescription.measurements.Edition;
import br.edu.ufpe.ines.decode.taskDescription.measurements.Execution;
import br.edu.ufpe.ines.decode.taskDescription.measurements.FinalTask;
import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;
import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage;
import br.edu.ufpe.ines.decode.taskDescription.measurements.TestExecution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementsPackageImpl extends EPackageImpl implements MeasurementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logTypeEEnum = null;

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
	 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasurementsPackageImpl() {
		super(eNS_URI, MeasurementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasurementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasurementsPackage init() {
		if (isInited) return (MeasurementsPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI);

		// Obtain or create and register package
		MeasurementsPackageImpl theMeasurementsPackage = (MeasurementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasurementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasurementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		br.ufpe.ines.decode.impl.DecodePackageImpl theDecodePackage = (br.ufpe.ines.decode.impl.DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.DecodePackage.eNS_URI) instanceof br.ufpe.ines.decode.impl.DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.DecodePackage.eNS_URI) : br.ufpe.ines.decode.DecodePackage.eINSTANCE);
		br.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl theTaskDescriptionPackage = (br.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage.eNS_URI) instanceof br.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage.eNS_URI) : br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage.eINSTANCE);
		br.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl theArtifactsPackage = (br.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.artifacts.ArtifactsPackage.eNS_URI) instanceof br.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.artifacts.ArtifactsPackage.eNS_URI) : br.ufpe.ines.decode.artifacts.ArtifactsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		br.ufpe.ines.decode.aux.impl.AuxPackageImpl theAuxPackage = (br.ufpe.ines.decode.aux.impl.AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.aux.AuxPackage.eNS_URI) instanceof br.ufpe.ines.decode.aux.impl.AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.aux.AuxPackage.eNS_URI) : br.ufpe.ines.decode.aux.AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theMeasurementsPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theMeasurementsPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasurementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasurementsPackage.eNS_URI, theMeasurementsPackage);
		return theMeasurementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticMeasurement() {
		return automaticMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticMeasurement_Log() {
		return (EAttribute)automaticMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActions() {
		return actionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalTask() {
		return finalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdition() {
		return editionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyAction() {
		return anyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestExecution() {
		return testExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestExecution_ObservePassedTest() {
		return (EAttribute)testExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogType() {
		return logTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementsFactory getMeasurementsFactory() {
		return (MeasurementsFactory)getEFactoryInstance();
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
		automaticMeasurementEClass = createEClass(AUTOMATIC_MEASUREMENT);
		createEAttribute(automaticMeasurementEClass, AUTOMATIC_MEASUREMENT__LOG);

		actionsEClass = createEClass(ACTIONS);

		finalTaskEClass = createEClass(FINAL_TASK);

		editionEClass = createEClass(EDITION);

		executionEClass = createEClass(EXECUTION);

		anyActionEClass = createEClass(ANY_ACTION);

		testExecutionEClass = createEClass(TEST_EXECUTION);
		createEAttribute(testExecutionEClass, TEST_EXECUTION__OBSERVE_PASSED_TEST);

		// Create enums
		logTypeEEnum = createEEnum(LOG_TYPE);
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
		br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage theTaskDescriptionPackage = (br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(br.ufpe.ines.decode.taskDescription.TaskDescriptionPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		automaticMeasurementEClass.getESuperTypes().add(theTaskDescriptionPackage.getMeasurement());
		actionsEClass.getESuperTypes().add(this.getAutomaticMeasurement());
		finalTaskEClass.getESuperTypes().add(this.getAutomaticMeasurement());
		editionEClass.getESuperTypes().add(this.getActions());
		executionEClass.getESuperTypes().add(this.getActions());
		anyActionEClass.getESuperTypes().add(this.getActions());
		testExecutionEClass.getESuperTypes().add(this.getExecution());

		// Initialize classes, features, and operations; add parameters
		initEClass(automaticMeasurementEClass, AutomaticMeasurement.class, "AutomaticMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomaticMeasurement_Log(), this.getLogType(), "log", null, 0, 2, AutomaticMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionsEClass, Actions.class, "Actions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalTaskEClass, FinalTask.class, "FinalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyActionEClass, AnyAction.class, "AnyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testExecutionEClass, TestExecution.class, "TestExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestExecution_ObservePassedTest(), theXMLTypePackage.getBoolean(), "observePassedTest", null, 0, 1, TestExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logTypeEEnum, LogType.class, "LogType");
		addEEnumLiteral(logTypeEEnum, LogType.LOG_TIME);
		addEEnumLiteral(logTypeEEnum, LogType.LOG_ARTIFACT);
	}

} //MeasurementsPackageImpl
