/**
 */
package br.edu.ufpe.ines.decode.artifacts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaCompUnit()
 * @model
 * @generated
 */
public interface JavaCompUnit extends CompilationUnit {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getJavaCompUnit_Package()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

} // JavaCompUnit
