/**
 */
package br.ufpe.ines.decode.artifacts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Artefacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.artifacts.ProvidedArtefacts#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getProvidedArtefacts()
 * @model
 * @generated
 */
public interface ProvidedArtefacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.artifacts.AbstractArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getProvidedArtefacts_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractArtifact> getArtifact();

} // ProvidedArtefacts
