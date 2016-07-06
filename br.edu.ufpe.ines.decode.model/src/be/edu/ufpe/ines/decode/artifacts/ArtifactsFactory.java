/**
 */
package be.edu.ufpe.ines.decode.artifacts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage
 * @generated
 */
public interface ArtifactsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtifactsFactory eINSTANCE = be.edu.ufpe.ines.decode.artifacts.impl.ArtifactsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Artifact</em>'.
	 * @generated
	 */
	AtomicArtifact createAtomicArtifact();

	/**
	 * Returns a new object of class '<em>Provided Artefacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Artefacts</em>'.
	 * @generated
	 */
	ProvidedArtefacts createProvidedArtefacts();

	/**
	 * Returns a new object of class '<em>Complex Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Artifact</em>'.
	 * @generated
	 */
	ComplexArtifact createComplexArtifact();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArtifactsPackage getArtifactsPackage();

} //ArtifactsFactory
