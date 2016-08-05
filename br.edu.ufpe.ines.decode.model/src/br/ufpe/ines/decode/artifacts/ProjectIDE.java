/**
 */
package br.ufpe.ines.decode.artifacts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project IDE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.artifacts.ProjectIDE#getProjectName <em>Project Name</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getProjectIDE()
 * @model abstract="true"
 * @generated
 */
public interface ProjectIDE extends AbstractArtifact {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getProjectIDE_ProjectName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.artifacts.ProjectIDE#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

} // ProjectIDE
