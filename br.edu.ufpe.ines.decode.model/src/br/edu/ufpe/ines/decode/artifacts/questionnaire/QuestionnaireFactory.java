/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage
 * @generated
 */
public interface QuestionnaireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnaireFactory eINSTANCE = br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnaireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Field</em>'.
	 * @generated
	 */
	TextField createTextField();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Simple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Choice</em>'.
	 * @generated
	 */
	SimpleChoice createSimpleChoice();

	/**
	 * Returns a new object of class '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Choice</em>'.
	 * @generated
	 */
	MultiChoice createMultiChoice();

	/**
	 * Returns a new object of class '<em>Appendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appendable Element</em>'.
	 * @generated
	 */
	AppendableElement createAppendableElement();

	/**
	 * Returns a new object of class '<em>Dependent Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent Element</em>'.
	 * @generated
	 */
	DependentElement createDependentElement();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	Content createContent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionnairePackage getQuestionnairePackage();

} //QuestionnaireFactory
