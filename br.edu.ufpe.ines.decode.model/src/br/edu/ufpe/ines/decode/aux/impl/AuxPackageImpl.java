/**
 */
package br.edu.ufpe.ines.decode.aux.impl;

import br.edu.ufpe.ines.decode.DecodePackage;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;

import br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl;

import br.edu.ufpe.ines.decode.aux.AuxFactory;
import br.edu.ufpe.ines.decode.aux.AuxPackage;
import br.edu.ufpe.ines.decode.aux.Nameable;

import br.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import br.edu.ufpe.ines.decode.measurement.MeasurementPackage;

import br.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxPackageImpl extends EPackageImpl implements AuxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableEClass = null;

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
	 * @see br.edu.ufpe.ines.decode.aux.AuxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuxPackageImpl() {
		super(eNS_URI, AuxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuxPackage init() {
		if (isInited) return (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);

		// Obtain or create and register package
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) : DecodePackage.eINSTANCE);
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) : TaskDescriptionPackage.eINSTANCE);
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);

		// Create package meta-data objects
		theAuxPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theMeasurementPackage.createPackageContents();

		// Initialize created meta-data
		theAuxPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuxPackage.eNS_URI, theAuxPackage);
		return theAuxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameable() {
		return nameableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameable_Name() {
		return (EAttribute)nameableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxFactory getAuxFactory() {
		return (AuxFactory)getEFactoryInstance();
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
		nameableEClass = createEClass(NAMEABLE);
		createEAttribute(nameableEClass, NAMEABLE__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nameableEClass, Nameable.class, "Nameable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameable_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Nameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AuxPackageImpl
