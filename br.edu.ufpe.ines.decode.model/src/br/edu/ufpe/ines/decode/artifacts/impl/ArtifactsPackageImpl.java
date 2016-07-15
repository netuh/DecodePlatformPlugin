/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.DecodePackage;

import br.edu.ufpe.ines.decode.artifacts.AbstractArtifact;
import br.edu.ufpe.ines.decode.artifacts.ArtifactsFactory;
import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.CompilationUnit;
import br.edu.ufpe.ines.decode.artifacts.FileArtifact;
import br.edu.ufpe.ines.decode.artifacts.JavaCompUnit;
import br.edu.ufpe.ines.decode.artifacts.JavaProject;
import br.edu.ufpe.ines.decode.artifacts.Library;
import br.edu.ufpe.ines.decode.artifacts.OtherFile;
import br.edu.ufpe.ines.decode.artifacts.PdfFIle;
import br.edu.ufpe.ines.decode.artifacts.ProjectIDE;
import br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts;
import br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl;

import br.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage;

import br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsPackageImpl;

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
public class ArtifactsPackageImpl extends EPackageImpl implements ArtifactsPackage {
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
	private EClass fileArtifactEClass = null;

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
	private EClass questionnaireInnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectIDEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdfFIleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCompUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

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
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#eNS_URI
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
		MeasurementsPackageImpl theMeasurementsPackage = (MeasurementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) instanceof MeasurementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementsPackage.eNS_URI) : MeasurementsPackage.eINSTANCE);
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI) : QuestionnairePackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theArtifactsPackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theMeasurementsPackage.createPackageContents();
		theQuestionnairePackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theArtifactsPackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theMeasurementsPackage.initializePackageContents();
		theQuestionnairePackage.initializePackageContents();
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
	public EClass getFileArtifact() {
		return fileArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileArtifact_File() {
		return (EAttribute)fileArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileArtifact_LocalFilePath() {
		return (EAttribute)fileArtifactEClass.getEStructuralFeatures().get(1);
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
	public EClass getQuestionnaireInner() {
		return questionnaireInnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireInner_Elements() {
		return (EReference)questionnaireInnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireInner_Placementquestionnaire() {
		return (EReference)questionnaireInnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectIDE() {
		return projectIDEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectIDE_ProjectName() {
		return (EAttribute)projectIDEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPdfFIle() {
		return pdfFIleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaProject() {
		return javaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaProject_Classes() {
		return (EReference)javaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaProject_OtherFiles() {
		return (EReference)javaProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaProject_RequiredLibrary() {
		return (EReference)javaProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaCompUnit() {
		return javaCompUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaCompUnit_Package() {
		return (EAttribute)javaCompUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherFile() {
		return otherFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherFile_Folder() {
		return (EAttribute)otherFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherFile_Description() {
		return (EAttribute)otherFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
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
		providedArtefactsEClass = createEClass(PROVIDED_ARTEFACTS);
		createEReference(providedArtefactsEClass, PROVIDED_ARTEFACTS__ARTIFACT);

		fileArtifactEClass = createEClass(FILE_ARTIFACT);
		createEAttribute(fileArtifactEClass, FILE_ARTIFACT__FILE);
		createEAttribute(fileArtifactEClass, FILE_ARTIFACT__LOCAL_FILE_PATH);

		abstractArtifactEClass = createEClass(ABSTRACT_ARTIFACT);

		questionnaireInnerEClass = createEClass(QUESTIONNAIRE_INNER);
		createEReference(questionnaireInnerEClass, QUESTIONNAIRE_INNER__ELEMENTS);
		createEReference(questionnaireInnerEClass, QUESTIONNAIRE_INNER__PLACEMENTQUESTIONNAIRE);

		projectIDEEClass = createEClass(PROJECT_IDE);
		createEAttribute(projectIDEEClass, PROJECT_IDE__PROJECT_NAME);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);

		pdfFIleEClass = createEClass(PDF_FILE);

		javaProjectEClass = createEClass(JAVA_PROJECT);
		createEReference(javaProjectEClass, JAVA_PROJECT__CLASSES);
		createEReference(javaProjectEClass, JAVA_PROJECT__OTHER_FILES);
		createEReference(javaProjectEClass, JAVA_PROJECT__REQUIRED_LIBRARY);

		javaCompUnitEClass = createEClass(JAVA_COMP_UNIT);
		createEAttribute(javaCompUnitEClass, JAVA_COMP_UNIT__PACKAGE);

		otherFileEClass = createEClass(OTHER_FILE);
		createEAttribute(otherFileEClass, OTHER_FILE__FOLDER);
		createEAttribute(otherFileEClass, OTHER_FILE__DESCRIPTION);

		libraryEClass = createEClass(LIBRARY);
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
		QuestionnairePackage theQuestionnairePackage = (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);
		AuxPackage theAuxPackage = (AuxPackage)EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		TaskDescriptionPackage theTaskDescriptionPackage = (TaskDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theQuestionnairePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fileArtifactEClass.getESuperTypes().add(theAuxPackage.getNameable());
		fileArtifactEClass.getESuperTypes().add(this.getAbstractArtifact());
		questionnaireInnerEClass.getESuperTypes().add(this.getAbstractArtifact());
		questionnaireInnerEClass.getESuperTypes().add(theAuxPackage.getNameable());
		projectIDEEClass.getESuperTypes().add(this.getAbstractArtifact());
		compilationUnitEClass.getESuperTypes().add(this.getFileArtifact());
		pdfFIleEClass.getESuperTypes().add(this.getFileArtifact());
		javaProjectEClass.getESuperTypes().add(this.getProjectIDE());
		javaCompUnitEClass.getESuperTypes().add(this.getCompilationUnit());
		otherFileEClass.getESuperTypes().add(this.getFileArtifact());
		libraryEClass.getESuperTypes().add(this.getFileArtifact());

		// Initialize classes, features, and operations; add parameters
		initEClass(providedArtefactsEClass, ProvidedArtefacts.class, "ProvidedArtefacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedArtefacts_Artifact(), this.getAbstractArtifact(), null, "artifact", null, 0, -1, ProvidedArtefacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileArtifactEClass, FileArtifact.class, "FileArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileArtifact_File(), theXMLTypePackage.getBase64Binary(), "file", null, 0, 1, FileArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileArtifact_LocalFilePath(), theXMLTypePackage.getString(), "localFilePath", null, 0, 1, FileArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractArtifactEClass, AbstractArtifact.class, "AbstractArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionnaireInnerEClass, QuestionnaireInner.class, "QuestionnaireInner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaireInner_Elements(), theQuestionnairePackage.getElementaryComponent(), null, "elements", null, 1, -1, QuestionnaireInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaireInner_Placementquestionnaire(), theTaskDescriptionPackage.getQuestionnaireMeasurement(), theTaskDescriptionPackage.getQuestionnaireMeasurement_Questionnaire(), "placementquestionnaire", null, 1, 1, QuestionnaireInner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectIDEEClass, ProjectIDE.class, "ProjectIDE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectIDE_ProjectName(), theXMLTypePackage.getString(), "projectName", null, 0, 1, ProjectIDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdfFIleEClass, PdfFIle.class, "PdfFIle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaProjectEClass, JavaProject.class, "JavaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaProject_Classes(), this.getJavaCompUnit(), null, "classes", null, 0, -1, JavaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaProject_OtherFiles(), this.getOtherFile(), null, "otherFiles", null, 0, -1, JavaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaProject_RequiredLibrary(), this.getLibrary(), null, "requiredLibrary", null, 0, -1, JavaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaCompUnitEClass, JavaCompUnit.class, "JavaCompUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaCompUnit_Package(), theXMLTypePackage.getString(), "package", null, 0, 1, JavaCompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherFileEClass, OtherFile.class, "OtherFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherFile_Folder(), theXMLTypePackage.getString(), "folder", null, 0, 1, OtherFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherFile_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, OtherFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ArtifactsPackageImpl
