/**
 */
package br.ufpe.ines.decode.decode.artifacts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufpe.ines.decode.decode.artifacts.ArtifactsPackage
 * @generated
 */
public interface ArtifactsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArtifactsFactory eINSTANCE = br.ufpe.ines.decode.decode.artifacts.impl.ArtifactsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Provided Artefacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Artefacts</em>'.
	 * @generated
	 */
	ProvidedArtefacts createProvidedArtefacts();

	/**
	 * Returns a new object of class '<em>Questionnaire Inner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Inner</em>'.
	 * @generated
	 */
	QuestionnaireInner createQuestionnaireInner();

	/**
	 * Returns a new object of class '<em>Pdf FIle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pdf FIle</em>'.
	 * @generated
	 */
	PdfFIle createPdfFIle();

	/**
	 * Returns a new object of class '<em>Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Project</em>'.
	 * @generated
	 */
	JavaProject createJavaProject();

	/**
	 * Returns a new object of class '<em>Java Comp Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Comp Unit</em>'.
	 * @generated
	 */
	JavaCompUnit createJavaCompUnit();

	/**
	 * Returns a new object of class '<em>Other File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other File</em>'.
	 * @generated
	 */
	OtherFile createOtherFile();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArtifactsPackage getArtifactsPackage();

} //ArtifactsFactory
