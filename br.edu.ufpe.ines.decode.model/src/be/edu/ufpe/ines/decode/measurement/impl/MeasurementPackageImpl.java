/**
 */
package be.edu.ufpe.ines.decode.measurement.impl;

import be.edu.ufpe.ines.decode.DecodePackage;

import be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;

import be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl;

import be.edu.ufpe.ines.decode.aux.AuxPackage;

import be.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl;

import be.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import be.edu.ufpe.ines.decode.measurement.AbstractMeasurement;
import be.edu.ufpe.ines.decode.measurement.AnyAction;
import be.edu.ufpe.ines.decode.measurement.AspectObserved;
import be.edu.ufpe.ines.decode.measurement.Edition;
import be.edu.ufpe.ines.decode.measurement.Execution;
import be.edu.ufpe.ines.decode.measurement.MeasurementFactory;
import be.edu.ufpe.ines.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.measurement.Measurements;
import be.edu.ufpe.ines.decode.measurement.ObservingAllArtifacts;
import be.edu.ufpe.ines.decode.measurement.ObservingArtifact;
import be.edu.ufpe.ines.decode.measurement.ObservingProducedArtifact;
import be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact;
import be.edu.ufpe.ines.decode.measurement.Survey;
import be.edu.ufpe.ines.decode.measurement.Testing;
import be.edu.ufpe.ines.decode.measurement.TimeOnTask;

import be.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import be.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class MeasurementPackageImpl extends EPackageImpl implements MeasurementPackage {
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
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOnTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observingArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observingProvidedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observingProducedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observingAllArtifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectObservedEClass = null;

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
	private EClass testingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyActionEClass = null;

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
	 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasurementPackageImpl() {
		super(eNS_URI, MeasurementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasurementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasurementPackage init() {
		if (isInited) return (MeasurementPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI);

		// Obtain or create and register package
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasurementPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) : DecodePackage.eINSTANCE);
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) : TaskDescriptionPackage.eINSTANCE);
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theMeasurementPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theMeasurementPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasurementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasurementPackage.eNS_URI, theMeasurementPackage);
		return theMeasurementPackage;
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
	public EReference getMeasurements_Measurements() {
		return (EReference)measurementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOnTask() {
		return timeOnTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOnTask_RelatedTask() {
		return (EReference)timeOnTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservingArtifact() {
		return observingArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservingArtifact_Aspect() {
		return (EReference)observingArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservingProvidedArtifact() {
		return observingProvidedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservingProvidedArtifact_ObservedArtifact() {
		return (EReference)observingProvidedArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservingProducedArtifact() {
		return observingProducedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservingAllArtifacts() {
		return observingAllArtifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectObserved() {
		return aspectObservedEClass;
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
	public EClass getTesting() {
		return testingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTesting_ObservePassedTest() {
		return (EAttribute)testingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMeasurement() {
		return abstractMeasurementEClass;
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
	public MeasurementFactory getMeasurementFactory() {
		return (MeasurementFactory)getEFactoryInstance();
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
		measurementsEClass = createEClass(MEASUREMENTS);
		createEReference(measurementsEClass, MEASUREMENTS__MEASUREMENTS);

		surveyEClass = createEClass(SURVEY);

		timeOnTaskEClass = createEClass(TIME_ON_TASK);
		createEReference(timeOnTaskEClass, TIME_ON_TASK__RELATED_TASK);

		observingArtifactEClass = createEClass(OBSERVING_ARTIFACT);
		createEReference(observingArtifactEClass, OBSERVING_ARTIFACT__ASPECT);

		observingProvidedArtifactEClass = createEClass(OBSERVING_PROVIDED_ARTIFACT);
		createEReference(observingProvidedArtifactEClass, OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT);

		observingProducedArtifactEClass = createEClass(OBSERVING_PRODUCED_ARTIFACT);

		observingAllArtifactsEClass = createEClass(OBSERVING_ALL_ARTIFACTS);

		aspectObservedEClass = createEClass(ASPECT_OBSERVED);

		editionEClass = createEClass(EDITION);

		executionEClass = createEClass(EXECUTION);

		testingEClass = createEClass(TESTING);
		createEAttribute(testingEClass, TESTING__OBSERVE_PASSED_TEST);

		abstractMeasurementEClass = createEClass(ABSTRACT_MEASUREMENT);

		anyActionEClass = createEClass(ANY_ACTION);
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
		TaskDescriptionPackage theTaskDescriptionPackage = (TaskDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI);
		ArtifactsPackage theArtifactsPackage = (ArtifactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AuxPackage theAuxPackage = (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		surveyEClass.getESuperTypes().add(this.getAbstractMeasurement());
		timeOnTaskEClass.getESuperTypes().add(this.getAbstractMeasurement());
		observingArtifactEClass.getESuperTypes().add(this.getAbstractMeasurement());
		observingProvidedArtifactEClass.getESuperTypes().add(this.getObservingArtifact());
		observingProducedArtifactEClass.getESuperTypes().add(this.getObservingArtifact());
		observingAllArtifactsEClass.getESuperTypes().add(this.getObservingArtifact());
		editionEClass.getESuperTypes().add(this.getAspectObserved());
		executionEClass.getESuperTypes().add(this.getAspectObserved());
		testingEClass.getESuperTypes().add(this.getExecution());
		abstractMeasurementEClass.getESuperTypes().add(theAuxPackage.getNameable());
		anyActionEClass.getESuperTypes().add(this.getAspectObserved());

		// Initialize classes, features, and operations; add parameters
		initEClass(measurementsEClass, Measurements.class, "Measurements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurements_Measurements(), this.getAbstractMeasurement(), null, "measurements", null, 1, -1, Measurements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeOnTaskEClass, TimeOnTask.class, "TimeOnTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeOnTask_RelatedTask(), theTaskDescriptionPackage.getModeledTask(), null, "relatedTask", null, 0, -1, TimeOnTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observingArtifactEClass, ObservingArtifact.class, "ObservingArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservingArtifact_Aspect(), this.getAspectObserved(), null, "aspect", null, 1, 1, ObservingArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observingProvidedArtifactEClass, ObservingProvidedArtifact.class, "ObservingProvidedArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObservingProvidedArtifact_ObservedArtifact(), theArtifactsPackage.getAtomicArtifact(), null, "observedArtifact", null, 1, 1, ObservingProvidedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observingProducedArtifactEClass, ObservingProducedArtifact.class, "ObservingProducedArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(observingAllArtifactsEClass, ObservingAllArtifacts.class, "ObservingAllArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aspectObservedEClass, AspectObserved.class, "AspectObserved", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testingEClass, Testing.class, "Testing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTesting_ObservePassedTest(), theXMLTypePackage.getBooleanObject(), "ObservePassedTest", null, 0, 1, Testing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMeasurementEClass, AbstractMeasurement.class, "AbstractMeasurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyActionEClass, AnyAction.class, "AnyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //MeasurementPackageImpl
