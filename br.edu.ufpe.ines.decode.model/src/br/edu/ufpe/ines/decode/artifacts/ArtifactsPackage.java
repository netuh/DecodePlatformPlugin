/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl <em>File Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.FileArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getFileArtifact()
	 * @generated
	 */
	int FILE_ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__ARTIFACT_DOMAIN = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__FILE = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT__LOCAL_FILE_PATH = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>File Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ARTIFACT_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl <em>Atomic Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAtomicArtifact()
	 * @generated
	 */
	int ATOMIC_ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__ARTIFACT_DOMAIN = FILE_ARTIFACT__ARTIFACT_DOMAIN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__TYPE = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl <em>Provided Artefacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtefacts()
	 * @generated
	 */
	int PROVIDED_ARTEFACTS = 1;

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
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl <em>Complex Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifact()
	 * @generated
	 */
	int COMPLEX_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__NAME = FILE_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__ARTIFACT_DOMAIN = FILE_ARTIFACT__ARTIFACT_DOMAIN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__FILE = FILE_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__LOCAL_FILE_PATH = FILE_ARTIFACT__LOCAL_FILE_PATH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__TYPE = FILE_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT_FEATURE_COUNT = FILE_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT_OPERATION_COUNT = FILE_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl <em>Abstract Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAbstractArtifact()
	 * @generated
	 */
	int ABSTRACT_ARTIFACT = 4;

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
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__ELEMENTS = ABSTRACT_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placementquestionnaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE = ABSTRACT_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = ABSTRACT_ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = ABSTRACT_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 6;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifactType()
	 * @generated
	 */
	int COMPLEX_ARTIFACT_TYPE = 7;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
	 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactLanguage()
	 * @generated
	 */
	int ARTIFACT_LANGUAGE = 8;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.AtomicArtifact <em>Atomic Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.AtomicArtifact
	 * @generated
	 */
	EClass getAtomicArtifact();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType()
	 * @see #getAtomicArtifact()
	 * @generated
	 */
	EAttribute getAtomicArtifact_Type();

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
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.ComplexArtifact <em>Complex Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Artifact</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ComplexArtifact
	 * @generated
	 */
	EClass getComplexArtifact();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType()
	 * @see #getComplexArtifact()
	 * @generated
	 */
	EAttribute getComplexArtifact_Type();

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
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getArtifactDomain <em>Artifact Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Domain</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.FileArtifact#getArtifactDomain()
	 * @see #getFileArtifact()
	 * @generated
	 */
	EAttribute getFileArtifact_ArtifactDomain();

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
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.Questionnaire#getElements()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Elements();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.artifacts.Questionnaire#getPlacementquestionnaire <em>Placementquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Placementquestionnaire</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.Questionnaire#getPlacementquestionnaire()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Placementquestionnaire();

	/**
	 * Returns the meta object for enum '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

	/**
	 * Returns the meta object for enum '{@link br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Artifact Type</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @generated
	 */
	EEnum getComplexArtifactType();

	/**
	 * Returns the meta object for enum '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Language</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
	 * @generated
	 */
	EEnum getArtifactLanguage();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl <em>Atomic Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAtomicArtifact()
		 * @generated
		 */
		EClass ATOMIC_ARTIFACT = eINSTANCE.getAtomicArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_ARTIFACT__TYPE = eINSTANCE.getAtomicArtifact_Type();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl <em>Complex Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifact()
		 * @generated
		 */
		EClass COMPLEX_ARTIFACT = eINSTANCE.getComplexArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_ARTIFACT__TYPE = eINSTANCE.getComplexArtifact_Type();

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
		 * The meta object literal for the '<em><b>Artifact Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ARTIFACT__ARTIFACT_DOMAIN = eINSTANCE.getFileArtifact_ArtifactDomain();

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
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.QuestionnaireImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__ELEMENTS = eINSTANCE.getQuestionnaire_Elements();

		/**
		 * The meta object literal for the '<em><b>Placementquestionnaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__PLACEMENTQUESTIONNAIRE = eINSTANCE.getQuestionnaire_Placementquestionnaire();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactType
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifactType()
		 * @generated
		 */
		EEnum COMPLEX_ARTIFACT_TYPE = eINSTANCE.getComplexArtifactType();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
		 * @see br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactLanguage()
		 * @generated
		 */
		EEnum ARTIFACT_LANGUAGE = eINSTANCE.getArtifactLanguage();

	}

} //ArtifactsPackage
