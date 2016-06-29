/**
 */
package be.edu.ufpe.ines.decode.model.decode.artifacts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsFactory
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
	ArtifactsPackage eINSTANCE = be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ProvidedArtifactImpl <em>Provided Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ProvidedArtifactImpl
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtifact()
	 * @generated
	 */
	int PROVIDED_ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTIFACT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Provided Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTIFACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Provided Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact <em>Provided Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact
	 * @generated
	 */
	EClass getProvidedArtifact();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact#getType()
	 * @see #getProvidedArtifact()
	 * @generated
	 */
	EAttribute getProvidedArtifact_Type();

	/**
	 * Returns the meta object for enum '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Type</em>'.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType
	 * @generated
	 */
	EEnum getArtifactType();

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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ProvidedArtifactImpl <em>Provided Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ProvidedArtifactImpl
		 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl#getProvidedArtifact()
		 * @generated
		 */
		EClass PROVIDED_ARTIFACT = eINSTANCE.getProvidedArtifact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_ARTIFACT__TYPE = eINSTANCE.getProvidedArtifact_Type();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType <em>Artifact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType
		 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.impl.ArtifactsPackageImpl#getArtifactType()
		 * @generated
		 */
		EEnum ARTIFACT_TYPE = eINSTANCE.getArtifactType();

	}

} //ArtifactsPackage
