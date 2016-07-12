/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.util;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireSwitch() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuestionnairePackage.ELEMENTARY_COMPONENT: {
				ElementaryComponent elementaryComponent = (ElementaryComponent)theEObject;
				T result = caseElementaryComponent(elementaryComponent);
				if (result == null) result = caseLabelable(elementaryComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseElementaryComponent(block);
				if (result == null) result = caseLabelable(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseElementaryComponent(question);
				if (result == null) result = caseLabelable(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEXT_FIELD: {
				TextField textField = (TextField)theEObject;
				T result = caseTextField(textField);
				if (result == null) result = caseQuestion(textField);
				if (result == null) result = caseElementaryComponent(textField);
				if (result == null) result = caseLabelable(textField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.COMPOSED_QUESTION: {
				ComposedQuestion composedQuestion = (ComposedQuestion)theEObject;
				T result = caseComposedQuestion(composedQuestion);
				if (result == null) result = caseQuestion(composedQuestion);
				if (result == null) result = caseElementaryComponent(composedQuestion);
				if (result == null) result = caseLabelable(composedQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseLabelable(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.SIMPLE_CHOICE: {
				SimpleChoice simpleChoice = (SimpleChoice)theEObject;
				T result = caseSimpleChoice(simpleChoice);
				if (result == null) result = caseComposedQuestion(simpleChoice);
				if (result == null) result = caseQuestion(simpleChoice);
				if (result == null) result = caseElementaryComponent(simpleChoice);
				if (result == null) result = caseLabelable(simpleChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.MULTI_CHOICE: {
				MultiChoice multiChoice = (MultiChoice)theEObject;
				T result = caseMultiChoice(multiChoice);
				if (result == null) result = caseComposedQuestion(multiChoice);
				if (result == null) result = caseQuestion(multiChoice);
				if (result == null) result = caseElementaryComponent(multiChoice);
				if (result == null) result = caseLabelable(multiChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.APPENDABLE_ELEMENT: {
				AppendableElement appendableElement = (AppendableElement)theEObject;
				T result = caseAppendableElement(appendableElement);
				if (result == null) result = caseRestriction(appendableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.DEPENDENT_ELEMENT: {
				DependentElement dependentElement = (DependentElement)theEObject;
				T result = caseDependentElement(dependentElement);
				if (result == null) result = caseRestriction(dependentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.LABELABLE: {
				Labelable labelable = (Labelable)theEObject;
				T result = caseLabelable(labelable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryComponent(ElementaryComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextField(TextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedQuestion(ComposedQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleChoice(SimpleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiChoice(MultiChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendableElement(AppendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentElement(DependentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labelable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labelable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelable(Labelable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuestionnaireSwitch
