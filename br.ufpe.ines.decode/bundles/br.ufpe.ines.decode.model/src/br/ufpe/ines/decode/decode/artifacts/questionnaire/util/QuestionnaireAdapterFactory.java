/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire.util;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireSwitch<Adapter> modelSwitch =
		new QuestionnaireSwitch<Adapter>() {
			@Override
			public Adapter caseElementaryComponent(ElementaryComponent object) {
				return createElementaryComponentAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseTextField(TextField object) {
				return createTextFieldAdapter();
			}
			@Override
			public Adapter caseComposedQuestion(ComposedQuestion object) {
				return createComposedQuestionAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseSimpleChoice(SimpleChoice object) {
				return createSimpleChoiceAdapter();
			}
			@Override
			public Adapter caseMultiChoice(MultiChoice object) {
				return createMultiChoiceAdapter();
			}
			@Override
			public Adapter caseRestriction(Restriction object) {
				return createRestrictionAdapter();
			}
			@Override
			public Adapter caseAppendableElement(AppendableElement object) {
				return createAppendableElementAdapter();
			}
			@Override
			public Adapter caseDependentElement(DependentElement object) {
				return createDependentElementAdapter();
			}
			@Override
			public Adapter caseLabelable(Labelable object) {
				return createLabelableAdapter();
			}
			@Override
			public Adapter caseContent(Content object) {
				return createContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.ElementaryComponent <em>Elementary Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.ElementaryComponent
	 * @generated
	 */
	public Adapter createElementaryComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.TextField
	 * @generated
	 */
	public Adapter createTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.ComposedQuestion <em>Composed Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.ComposedQuestion
	 * @generated
	 */
	public Adapter createComposedQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.SimpleChoice <em>Simple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.SimpleChoice
	 * @generated
	 */
	public Adapter createSimpleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.MultiChoice
	 * @generated
	 */
	public Adapter createMultiChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.AppendableElement <em>Appendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.AppendableElement
	 * @generated
	 */
	public Adapter createAppendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement <em>Dependent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.DependentElement
	 * @generated
	 */
	public Adapter createDependentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Labelable <em>Labelable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Labelable
	 * @generated
	 */
	public Adapter createLabelableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.artifacts.questionnaire.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.artifacts.questionnaire.Content
	 * @generated
	 */
	public Adapter createContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuestionnaireAdapterFactory
