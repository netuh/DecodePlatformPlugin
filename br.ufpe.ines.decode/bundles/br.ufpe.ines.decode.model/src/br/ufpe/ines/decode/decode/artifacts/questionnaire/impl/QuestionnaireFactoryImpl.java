/**
 */
package br.ufpe.ines.decode.decode.artifacts.questionnaire.impl;

import br.ufpe.ines.decode.decode.artifacts.questionnaire.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireFactoryImpl extends EFactoryImpl implements QuestionnaireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionnaireFactory init() {
		try {
			QuestionnaireFactory theQuestionnaireFactory = (QuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnairePackage.eNS_URI);
			if (theQuestionnaireFactory != null) {
				return theQuestionnaireFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionnaireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionnairePackage.BLOCK: return createBlock();
			case QuestionnairePackage.TEXT_FIELD: return createTextField();
			case QuestionnairePackage.CHOICE: return createChoice();
			case QuestionnairePackage.SIMPLE_CHOICE: return createSimpleChoice();
			case QuestionnairePackage.MULTI_CHOICE: return createMultiChoice();
			case QuestionnairePackage.APPENDABLE_ELEMENT: return createAppendableElement();
			case QuestionnairePackage.DEPENDENT_ELEMENT: return createDependentElement();
			case QuestionnairePackage.CONTENT: return createContent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleChoice createSimpleChoice() {
		SimpleChoiceImpl simpleChoice = new SimpleChoiceImpl();
		return simpleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiChoice createMultiChoice() {
		MultiChoiceImpl multiChoice = new MultiChoiceImpl();
		return multiChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppendableElement createAppendableElement() {
		AppendableElementImpl appendableElement = new AppendableElementImpl();
		return appendableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentElement createDependentElement() {
		DependentElementImpl dependentElement = new DependentElementImpl();
		return dependentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnairePackage getQuestionnairePackage() {
		return (QuestionnairePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionnairePackage getPackage() {
		return QuestionnairePackage.eINSTANCE;
	}

} //QuestionnaireFactoryImpl
