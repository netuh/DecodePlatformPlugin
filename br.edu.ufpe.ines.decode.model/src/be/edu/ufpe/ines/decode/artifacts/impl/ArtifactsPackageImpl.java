/**
 */
package be.edu.ufpe.ines.decode.artifacts.impl;

import be.edu.ufpe.ines.decode.DecodePackage;

import be.edu.ufpe.ines.decode.artifacts.AbstractArtifact;
import be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage;
import be.edu.ufpe.ines.decode.artifacts.ArtifactType;
import be.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import be.edu.ufpe.ines.decode.artifacts.AtomicArtifact;
import be.edu.ufpe.ines.decode.artifacts.ComplexArtifact;
import be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType;
import be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts;

import be.edu.ufpe.ines.decode.aux.AuxPackage;

import be.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl;

import be.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import be.edu.ufpe.ines.decode.measurement.MeasurementPackage;

import be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl;

import be.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import be.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl;

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
public class ArtifactsPackageImpl extends EPackageImpl implements ArtifactsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedArtefactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complexArtifactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactLanguageEEnum = null;

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
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArtifactsPackageImpl() {
		super(eNS_URI, ArtifactsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArtifactsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArtifactsPackage init() {
		if (isInited) return (ArtifactsPackage)EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI);

		// Obtain or create and register package
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArtifactsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) : DecodePackage.eINSTANCE);
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) : TaskDescriptionPackage.eINSTANCE);
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theArtifactsPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theMeasurementPackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theArtifactsPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArtifactsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArtifactsPackage.eNS_URI, theArtifactsPackage);
		return theArtifactsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicArtifact() {
		return atomicArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicArtifact_Type() {
		return (EAttribute)atomicArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedArtefacts() {
		return providedArtefactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedArtefacts_Artifact() {
		return (EReference)providedArtefactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexArtifact() {
		return complexArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexArtifact_Type() {
		return (EAttribute)complexArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractArtifact() {
		return abstractArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractArtifact_ArtifactDomain() {
		return (EAttribute)abstractArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractArtifact_File() {
		return (EAttribute)abstractArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractArtifact_LocalFilePath() {
		return (EAttribute)abstractArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactType() {
		return artifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplexArtifactType() {
		return complexArtifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactLanguage() {
		return artifactLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactsFactory getArtifactsFactory() {
		return (ArtifactsFactory)getEFactoryInstance();
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
		atomicArtifactEClass = createEClass(ATOMIC_ARTIFACT);
		createEAttribute(atomicArtifactEClass, ATOMIC_ARTIFACT__TYPE);

		providedArtefactsEClass = createEClass(PROVIDED_ARTEFACTS);
		createEReference(providedArtefactsEClass, PROVIDED_ARTEFACTS__ARTIFACT);

		complexArtifactEClass = createEClass(COMPLEX_ARTIFACT);
		createEAttribute(complexArtifactEClass, COMPLEX_ARTIFACT__TYPE);

		abstractArtifactEClass = createEClass(ABSTRACT_ARTIFACT);
		createEAttribute(abstractArtifactEClass, ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN);
		createEAttribute(abstractArtifactEClass, ABSTRACT_ARTIFACT__FILE);
		createEAttribute(abstractArtifactEClass, ABSTRACT_ARTIFACT__LOCAL_FILE_PATH);

		// Create enums
		artifactTypeEEnum = createEEnum(ARTIFACT_TYPE);
		complexArtifactTypeEEnum = createEEnum(COMPLEX_ARTIFACT_TYPE);
		artifactLanguageEEnum = createEEnum(ARTIFACT_LANGUAGE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicArtifactEClass.getESuperTypes().add(this.getAbstractArtifact());
		complexArtifactEClass.getESuperTypes().add(this.getAbstractArtifact());
		abstractArtifactEClass.getESuperTypes().add(theAuxPackage.getNameable());

		// Initialize classes, features, and operations; add parameters
		initEClass(atomicArtifactEClass, AtomicArtifact.class, "AtomicArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicArtifact_Type(), this.getArtifactType(), "type", null, 0, 1, AtomicArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedArtefactsEClass, ProvidedArtefacts.class, "ProvidedArtefacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedArtefacts_Artifact(), this.getAbstractArtifact(), null, "artifact", null, 0, -1, ProvidedArtefacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexArtifactEClass, ComplexArtifact.class, "ComplexArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexArtifact_Type(), this.getComplexArtifactType(), "type", "Project", 0, 1, ComplexArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractArtifactEClass, AbstractArtifact.class, "AbstractArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractArtifact_ArtifactDomain(), this.getArtifactLanguage(), "artifactDomain", "Common", 0, 1, AbstractArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractArtifact_File(), theXMLTypePackage.getBase64Binary(), "file", null, 0, 1, AbstractArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractArtifact_LocalFilePath(), theXMLTypePackage.getString(), "localFilePath", null, 0, 1, AbstractArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(artifactTypeEEnum, ArtifactType.class, "ArtifactType");
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.CODE);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.TEST);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.DESCRIPTION);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.DESIGN);

		initEEnum(complexArtifactTypeEEnum, ComplexArtifactType.class, "ComplexArtifactType");
		addEEnumLiteral(complexArtifactTypeEEnum, ComplexArtifactType.PROJECT);

		initEEnum(artifactLanguageEEnum, ArtifactLanguage.class, "ArtifactLanguage");
		addEEnumLiteral(artifactLanguageEEnum, ArtifactLanguage.JAVA);
		addEEnumLiteral(artifactLanguageEEnum, ArtifactLanguage.COMMON);
	}

} //ArtifactsPackageImpl
