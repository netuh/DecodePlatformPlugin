/**
 */
package be.edu.ufpe.ines.decode.model.decode.taskDescription.impl;

import be.edu.ufpe.ines.decode.model.decode.DecodePackage;

import be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage;

import be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl;

import be.edu.ufpe.ines.decode.model.decode.impl.DecodePackageImpl;

import be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage;

import be.edu.ufpe.ines.decode.model.decode.measurement.impl.MeasurementPackageImpl;

import be.edu.ufpe.ines.decode.model.decode.taskDescription.Aleatorio;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.ComposedTask;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.ExperimentalTask;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.ModeledTask;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.Restriction;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.Sequencial;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionFactory;
import be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage;

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
	private EClass aleatorioEClass = null;

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
	 * @see be.edu.ufpe.ines.decode.model.decode.taskDescription.TaskDescriptionPackage#eNS_URI
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
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);

		// Create package meta-data objects
		theTaskDescriptionPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theMeasurementPackage.createPackageContents();

		// Initialize created meta-data
		theTaskDescriptionPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();

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
	public EClass getAleatorio() {
		return aleatorioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAleatorio_Tasks() {
		return (EReference)aleatorioEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getExperimentalTask_NewAttribute() {
		return (EAttribute)experimentalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalTask_Dependency() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalTask_RequiredArtifact() {
		return (EReference)experimentalTaskEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getRestriction_Deadline() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestriction_TimeFrame() {
		return (EAttribute)restrictionEClass.getEStructuralFeatures().get(1);
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

		sequencialEClass = createEClass(SEQUENCIAL);
		createEReference(sequencialEClass, SEQUENCIAL__TASKS);

		aleatorioEClass = createEClass(ALEATORIO);
		createEReference(aleatorioEClass, ALEATORIO__TASKS);

		composedTaskEClass = createEClass(COMPOSED_TASK);

		experimentalTaskEClass = createEClass(EXPERIMENTAL_TASK);
		createEAttribute(experimentalTaskEClass, EXPERIMENTAL_TASK__NEW_ATTRIBUTE);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__DEPENDENCY);
		createEReference(experimentalTaskEClass, EXPERIMENTAL_TASK__REQUIRED_ARTIFACT);

		restrictionEClass = createEClass(RESTRICTION);
		createEAttribute(restrictionEClass, RESTRICTION__DEADLINE);
		createEAttribute(restrictionEClass, RESTRICTION__TIME_FRAME);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ArtifactsPackage theArtifactsPackage = (ArtifactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequencialEClass.getESuperTypes().add(this.getComposedTask());
		aleatorioEClass.getESuperTypes().add(this.getComposedTask());
		composedTaskEClass.getESuperTypes().add(this.getModeledTask());
		experimentalTaskEClass.getESuperTypes().add(this.getModeledTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(modeledTaskEClass, ModeledTask.class, "ModeledTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeledTask_Restriction(), this.getRestriction(), null, "restriction", null, 0, 1, ModeledTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequencialEClass, Sequencial.class, "Sequencial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequencial_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Sequencial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aleatorioEClass, Aleatorio.class, "Aleatorio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAleatorio_Tasks(), this.getModeledTask(), null, "tasks", null, 0, -1, Aleatorio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(composedTaskEClass, ComposedTask.class, "ComposedTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimentalTaskEClass, ExperimentalTask.class, "ExperimentalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperimentalTask_NewAttribute(), theXMLTypePackage.getBooleanObject(), "newAttribute", null, 0, 1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalTask_Dependency(), this.getExperimentalTask(), null, "dependency", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalTask_RequiredArtifact(), theArtifactsPackage.getProvidedArtifact(), null, "requiredArtifact", null, 0, -1, ExperimentalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestriction_Deadline(), theXMLTypePackage.getDateTime(), "deadline", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestriction_TimeFrame(), theXMLTypePackage.getInteger(), "timeFrame", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TaskDescriptionPackageImpl
