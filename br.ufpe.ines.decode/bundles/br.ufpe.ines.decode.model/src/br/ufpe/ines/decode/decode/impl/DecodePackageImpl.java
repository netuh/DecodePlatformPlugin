/**
 */
package br.ufpe.ines.decode.decode.impl;

import br.ufpe.ines.decode.decode.CodingExperiment;
import br.ufpe.ines.decode.decode.DecodeFactory;
import br.ufpe.ines.decode.decode.DecodePackage;

import br.ufpe.ines.decode.decode.artifacts.ArtifactsPackage;

import br.ufpe.ines.decode.decode.artifacts.impl.ArtifactsPackageImpl;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl;

import br.ufpe.ines.decode.decode.aux.AuxPackage;

import br.ufpe.ines.decode.decode.aux.impl.AuxPackageImpl;

import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage;

import br.ufpe.ines.decode.decode.taskDescription.impl.TaskDescriptionPackageImpl;

import br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage;

import br.ufpe.ines.decode.decode.taskDescription.measurements.impl.MeasurementsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecodePackageImpl extends EPackageImpl implements DecodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingExperimentEClass = null;

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
	 * @see br.ufpe.ines.decode.decode.DecodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DecodePackageImpl() {
		super(eNS_URI, DecodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DecodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DecodePackage init() {
		if (isInited) return (DecodePackage)EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI);

		// Obtain or create and register package
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) : TaskDescriptionPackage.eINSTANCE);
		MeasurementsPackageImpl theMeasurementsPackage = (MeasurementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) instanceof MeasurementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) : MeasurementsPackage.eINSTANCE);
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theMeasurementsPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theMeasurementsPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDecodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DecodePackage.eNS_URI, theDecodePackage);
		return theDecodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodingExperiment() {
		return codingExperimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodingExperiment_Task() {
		return (EReference)codingExperimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodingExperiment_ProvidedArtefacts() {
		return (EReference)codingExperimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecodeFactory getDecodeFactory() {
		return (DecodeFactory)getEFactoryInstance();
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
		codingExperimentEClass = createEClass(CODING_EXPERIMENT);
		createEReference(codingExperimentEClass, CODING_EXPERIMENT__TASK);
		createEReference(codingExperimentEClass, CODING_EXPERIMENT__PROVIDED_ARTEFACTS);
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
		AuxPackage theAuxPackage = (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTaskDescriptionPackage);
		getESubpackages().add(theArtifactsPackage);
		getESubpackages().add(theAuxPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codingExperimentEClass.getESuperTypes().add(theAuxPackage.getNameable());
		codingExperimentEClass.getESuperTypes().add(theAuxPackage.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(codingExperimentEClass, CodingExperiment.class, "CodingExperiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodingExperiment_Task(), theTaskDescriptionPackage.getExecutionDerivations(), null, "task", null, 1, 1, CodingExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodingExperiment_ProvidedArtefacts(), theArtifactsPackage.getProvidedArtefacts(), null, "providedArtefacts", null, 1, 1, CodingExperiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DecodePackageImpl
