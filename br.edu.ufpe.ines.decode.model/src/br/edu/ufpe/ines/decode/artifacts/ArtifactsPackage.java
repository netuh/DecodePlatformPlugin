/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsFactory
 * @model kind="package"
 * @generated
 */
public interface ArtifactsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "artifacts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "artifacts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "artifacts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtifactsPackage eINSTANCE = br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl <em>Provided Artefacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtefacts()
	 * @generated
	 */
	int PROVIDED_ARTEFACTS = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTEFACTS__ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Provided Artefacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTEFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provided Artefacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTEFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl <em>File Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getFileArtifact()
	 * @generated
	 */
	int FILE_ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__FILE = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__LOCAL_FILE_PATH = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl <em>Abstract Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAbstractArtifact()
	 * @generated
	 */
	int ABSTRACT_ARTIFACT = 2;

	/**
	 * The number of structural features of the '<em>Abstract Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireInnerImpl <em>Questionnaire Inner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireInnerImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getQuestionnaireInner()
	 * @generated
	 */
	int QUESTIONNAIRE_INNER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_INNER__NAME = ABSTRACT_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_INNER__ELEMENTS = ABSTRACT_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placementquestionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_INNER__PLACEMENTQUESTIONNAIRE = ABSTRACT_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Questionnaire Inner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_INNER_FEATURE_COUNT = ABSTRACT_ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Questionnaire Inner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_INNER_OPERATION_COUNT = ABSTRACT_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ProjectIDEImpl <em>Project IDE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ProjectIDEImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProjectIDE()
	 * @generated
	 */
	int PROJECT_IDE = 4;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_IDE__PROJECT_NAME = ABSTRACT_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project IDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_IDE_FEATURE_COUNT = ABSTRACT_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project IDE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_IDE_OPERATION_COUNT = ABSTRACT_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.CompilationUnitImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.PdfFIleImpl <em>Pdf FIle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.PdfFIleImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getPdfFIle()
	 * @generated
	 */
	int PDF_FILE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The number of structural features of the '<em>Pdf FIle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pdf FIle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDF_FILE_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl <em>Java Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getJavaProject()
	 * @generated
	 */
	int JAVA_PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__PROJECT_NAME = PROJECT_IDE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__CLASSES = PROJECT_IDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__OTHER_FILES = PROJECT_IDE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__REQUIRED_LIBRARY = PROJECT_IDE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT_FEATURE_COUNT = PROJECT_IDE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Java Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT_OPERATION_COUNT = PROJECT_IDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaCompUnitImpl <em>Java Comp Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.JavaCompUnitImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getJavaCompUnit()
	 * @generated
	 */
	int JAVA_COMP_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT__NAME = COMPILATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT__FILE = COMPILATION_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT__LOCAL_FILE_PATH = COMPILATION_UNIT__LOCAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT__PACKAGE = COMPILATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Comp Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Comp Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_COMP_UNIT_OPERATION_COUNT = COMPILATION_UNIT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.OtherFileImpl <em>Other File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.OtherFileImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getOtherFile()
	 * @generated
	 */
	int OTHER_FILE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE__FOLDER = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE__DESCRIPTION = FILE_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Other File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Other File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FILE_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.LibraryImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts <em>Provided Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Artefacts</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts
	 * @generated
	 */
	EClass getProvidedArtefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts#getArtifact()
	 * @see #getProvidedArtefacts()
	 * @generated
	 */
	EReference getProvidedArtefacts_Artifact();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact <em>File Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.FileArtifact
	 * @generated
	 */
	EClass getFileArtifact();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.FileArtifact#getFile()
	 * @see #getFileArtifact()
	 * @generated
	 */
	EAttribute getFileArtifact_File();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getLocalFilePath <em>Local File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local File Path</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.FileArtifact#getLocalFilePath()
	 * @see #getFileArtifact()
	 * @generated
	 */
	EAttribute getFileArtifact_LocalFilePath();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.AbstractArtifact <em>Abstract Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.AbstractArtifact
	 * @generated
	 */
	EClass getAbstractArtifact();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner <em>Questionnaire Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire Inner</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner
	 * @generated
	 */
	EClass getQuestionnaireInner();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getElements()
	 * @see #getQuestionnaireInner()
	 * @generated
	 */
	EReference getQuestionnaireInner_Elements();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire <em>Placementquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placementquestionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner#getPlacementquestionnaire()
	 * @see #getQuestionnaireInner()
	 * @generated
	 */
	EReference getQuestionnaireInner_Placementquestionnaire();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.ProjectIDE <em>Project IDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project IDE</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProjectIDE
	 * @generated
	 */
	EClass getProjectIDE();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.ProjectIDE#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProjectIDE#getProjectName()
	 * @see #getProjectIDE()
	 * @generated
	 */
	EAttribute getProjectIDE_ProjectName();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.PdfFIle <em>Pdf FIle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdf FIle</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.PdfFIle
	 * @generated
	 */
	EClass getPdfFIle();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Project</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaProject
	 * @generated
	 */
	EClass getJavaProject();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.JavaProject#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaProject#getClasses()
	 * @see #getJavaProject()
	 * @generated
	 */
	EReference getJavaProject_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.JavaProject#getOtherFiles <em>Other Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Files</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaProject#getOtherFiles()
	 * @see #getJavaProject()
	 * @generated
	 */
	EReference getJavaProject_OtherFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.JavaProject#getRequiredLibrary <em>Required Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Library</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaProject#getRequiredLibrary()
	 * @see #getJavaProject()
	 * @generated
	 */
	EReference getJavaProject_RequiredLibrary();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit <em>Java Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Comp Unit</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaCompUnit
	 * @generated
	 */
	EClass getJavaCompUnit();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaCompUnit#getPackage()
	 * @see #getJavaCompUnit()
	 * @generated
	 */
	EAttribute getJavaCompUnit_Package();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.OtherFile <em>Other File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other File</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.OtherFile
	 * @generated
	 */
	EClass getOtherFile();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.OtherFile#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.OtherFile#getFolder()
	 * @see #getOtherFile()
	 * @generated
	 */
	EAttribute getOtherFile_Folder();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.OtherFile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.OtherFile#getDescription()
	 * @see #getOtherFile()
	 * @generated
	 */
	EAttribute getOtherFile_Description();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArtifactsFactory getArtifactsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl <em>Provided Artefacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtefacts()
		 * @generated
		 */
		EClass PROVIDED_ARTEFACTS = eINSTANCE.getProvidedArtefacts();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ARTEFACTS__ARTIFACT = eINSTANCE.getProvidedArtefacts_Artifact();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl <em>File Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getFileArtifact()
		 * @generated
		 */
		EClass FILE_ARTIFACT = eINSTANCE.getFileArtifact();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ARTIFACT__FILE = eINSTANCE.getFileArtifact_File();

		/**
		 * The meta object literal for the '<em><b>Local File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ARTIFACT__LOCAL_FILE_PATH = eINSTANCE.getFileArtifact_LocalFilePath();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl <em>Abstract Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAbstractArtifact()
		 * @generated
		 */
		EClass ABSTRACT_ARTIFACT = eINSTANCE.getAbstractArtifact();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireInnerImpl <em>Questionnaire Inner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireInnerImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getQuestionnaireInner()
		 * @generated
		 */
		EClass QUESTIONNAIRE_INNER = eINSTANCE.getQuestionnaireInner();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_INNER__ELEMENTS = eINSTANCE.getQuestionnaireInner_Elements();

		/**
		 * The meta object literal for the '<em><b>Placementquestionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE_INNER__PLACEMENTQUESTIONNAIRE = eINSTANCE.getQuestionnaireInner_Placementquestionnaire();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ProjectIDEImpl <em>Project IDE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ProjectIDEImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProjectIDE()
		 * @generated
		 */
		EClass PROJECT_IDE = eINSTANCE.getProjectIDE();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_IDE__PROJECT_NAME = eINSTANCE.getProjectIDE_ProjectName();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.CompilationUnitImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.PdfFIleImpl <em>Pdf FIle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.PdfFIleImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getPdfFIle()
		 * @generated
		 */
		EClass PDF_FILE = eINSTANCE.getPdfFIle();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl <em>Java Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getJavaProject()
		 * @generated
		 */
		EClass JAVA_PROJECT = eINSTANCE.getJavaProject();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PROJECT__CLASSES = eINSTANCE.getJavaProject_Classes();

		/**
		 * The meta object literal for the '<em><b>Other Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PROJECT__OTHER_FILES = eINSTANCE.getJavaProject_OtherFiles();

		/**
		 * The meta object literal for the '<em><b>Required Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PROJECT__REQUIRED_LIBRARY = eINSTANCE.getJavaProject_RequiredLibrary();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaCompUnitImpl <em>Java Comp Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.JavaCompUnitImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getJavaCompUnit()
		 * @generated
		 */
		EClass JAVA_COMP_UNIT = eINSTANCE.getJavaCompUnit();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_COMP_UNIT__PACKAGE = eINSTANCE.getJavaCompUnit_Package();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.OtherFileImpl <em>Other File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.OtherFileImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getOtherFile()
		 * @generated
		 */
		EClass OTHER_FILE = eINSTANCE.getOtherFile();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_FILE__FOLDER = eINSTANCE.getOtherFile_Folder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_FILE__DESCRIPTION = eINSTANCE.getOtherFile_Description();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.LibraryImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

	}

} //ArtifactsPackage
