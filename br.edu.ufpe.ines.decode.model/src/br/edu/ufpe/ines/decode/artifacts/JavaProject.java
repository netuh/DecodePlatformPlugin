/**
 */
package br.edu.ufpe.ines.decode.artifacts;

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
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.JavaProject#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.JavaProject#getOtherFiles <em>Other Files</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject()
 * @model
 * @generated
 */
public interface JavaProject extends ProjectIDE {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaCompUnit> getClasses();

	/**
	 * Returns the value of the '<em><b>Other Files</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.ufpe.ines.decode.artifacts.OtherFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Files</em>' containment reference list.
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaProject_OtherFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherFile> getOtherFiles();

} // JavaProject
