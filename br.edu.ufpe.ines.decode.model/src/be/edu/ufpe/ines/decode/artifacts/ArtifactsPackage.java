/**
 */
package be.edu.ufpe.ines.decode.artifacts;

import be.edu.ufpe.ines.decode.aux.AuxPackage;

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
 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsFactory
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
	ArtifactsPackage eINSTANCE = be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl <em>Abstract Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAbstractArtifact()
	 * @generated
	 */
	int ABSTRACT_ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT__FILE = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ARTIFACT_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl <em>Atomic Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAtomicArtifact()
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
	int ATOMIC_ARTIFACT__NAME = ABSTRACT_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__ARTIFACT_DOMAIN = ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__FILE = ABSTRACT_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT__TYPE = ABSTRACT_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT_FEATURE_COUNT = ABSTRACT_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ARTIFACT_OPERATION_COUNT = ABSTRACT_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl <em>Provided Artefacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtefacts()
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
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl <em>Complex Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifact()
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
	int COMPLEX_ARTIFACT__NAME = ABSTRACT_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Artifact Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__ARTIFACT_DOMAIN = ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__FILE = ABSTRACT_ARTIFACT__FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT__TYPE = ABSTRACT_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT_FEATURE_COUNT = ABSTRACT_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ARTIFACT_OPERATION_COUNT = ABSTRACT_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 4;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifactType()
	 * @generated
	 */
	int COMPLEX_ARTIFACT_TYPE = 5;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
	 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactLanguage()
	 * @generated
	 */
	int ARTIFACT_LANGUAGE = 6;


	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.artifacts.AtomicArtifact <em>Atomic Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.AtomicArtifact
	 * @generated
	 */
	EClass getAtomicArtifact();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType()
	 * @see #getAtomicArtifact()
	 * @generated
	 */
	EAttribute getAtomicArtifact_Type();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts <em>Provided Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Artefacts</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts
	 * @generated
	 */
	EClass getProvidedArtefacts();

	/**
	 * Returns the meta object for the containment reference list '{@link be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts#getArtifact()
	 * @see #getProvidedArtefacts()
	 * @generated
	 */
	EReference getProvidedArtefacts_Artifact();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifact <em>Complex Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifact
	 * @generated
	 */
	EClass getComplexArtifact();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType()
	 * @see #getComplexArtifact()
	 * @generated
	 */
	EAttribute getComplexArtifact_Type();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact <em>Abstract Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.AbstractArtifact
	 * @generated
	 */
	EClass getAbstractArtifact();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getArtifactDomain <em>Artifact Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Domain</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getArtifactDomain()
	 * @see #getAbstractArtifact()
	 * @generated
	 */
	EAttribute getAbstractArtifact_ArtifactDomain();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getFile()
	 * @see #getAbstractArtifact()
	 * @generated
	 */
	EAttribute getAbstractArtifact_File();

	/**
	 * Returns the meta object for enum '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

	/**
	 * Returns the meta object for enum '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complex Artifact Type</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @generated
	 */
	EEnum getComplexArtifactType();

	/**
	 * Returns the meta object for enum '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Language</em>'.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl <em>Atomic Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.AtomicArtifactImpl
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAtomicArtifact()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl <em>Provided Artefacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtefacts()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl <em>Complex Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ComplexArtifactImpl
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifact()
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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl <em>Abstract Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getAbstractArtifact()
		 * @generated
		 */
		EClass ABSTRACT_ARTIFACT = eINSTANCE.getAbstractArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN = eINSTANCE.getAbstractArtifact_ArtifactDomain();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ARTIFACT__FILE = eINSTANCE.getAbstractArtifact_File();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactType
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType <em>Complex Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getComplexArtifactType()
		 * @generated
		 */
		EEnum COMPLEX_ARTIFACT_TYPE = eINSTANCE.getComplexArtifactType();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage <em>Artifact Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
		 * @see be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactLanguage()
		 * @generated
		 */
		EEnum ARTIFACT_LANGUAGE = eINSTANCE.getArtifactLanguage();

	}

} //ArtifactsPackage
