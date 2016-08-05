/**
 */
package br.ufpe.ines.decode.artifacts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.artifacts.JavaProject#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.artifacts.JavaProject#getOtherFiles <em>Other Files</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.artifacts.JavaProject#getRequiredLibrary <em>Required Library</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject()
 * @model
 * @generated
 */
public interface JavaProject extends ProjectIDE {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.artifacts.JavaCompUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaCompUnit> getClasses();

	/**
	 * Returns the value of the '<em><b>Other Files</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.artifacts.OtherFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Files</em>' containment reference list.
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject_OtherFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherFile> getOtherFiles();

	/**
	 * Returns the value of the '<em><b>Required Library</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.artifacts.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Library</em>' containment reference list.
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject_RequiredLibrary()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getRequiredLibrary();

} // JavaProject
