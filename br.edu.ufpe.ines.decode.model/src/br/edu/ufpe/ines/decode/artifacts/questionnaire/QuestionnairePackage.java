/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionnaire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "questionnaire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionnaire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnairePackage eINSTANCE = br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl.init();

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.LabelableImpl <em>Labelable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.LabelableImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getLabelable()
	 * @generated
	 */
	int LABELABLE = 11;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELABLE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Labelable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Labelable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ElementaryComponentImpl <em>Elementary Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ElementaryComponentImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getElementaryComponent()
	 * @generated
	 */
	int ELEMENTARY_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_COMPONENT__CONTENT = LABELABLE__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_COMPONENT__RESTRICTION = LABELABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elementary Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_COMPONENT_FEATURE_COUNT = LABELABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elementary Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_COMPONENT_OPERATION_COUNT = LABELABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.BlockImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTENT = ELEMENTARY_COMPONENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__RESTRICTION = ELEMENTARY_COMPONENT__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Chidren</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHIDREN = ELEMENTARY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ELEMENTARY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = ELEMENTARY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CONTENT = ELEMENTARY_COMPONENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RESTRICTION = ELEMENTARY_COMPONENT__RESTRICTION;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ELEMENTARY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = ELEMENTARY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.TextFieldImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CONTENT = QUESTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__RESTRICTION = QUESTION__RESTRICTION;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ComposedQuestionImpl <em>Composed Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ComposedQuestionImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getComposedQuestion()
	 * @generated
	 */
	int COMPOSED_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_QUESTION__CONTENT = QUESTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_QUESTION__RESTRICTION = QUESTION__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_QUESTION__CHOICE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composed Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ChoiceImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONTENT = LABELABLE__CONTENT;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = LABELABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = LABELABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.SimpleChoiceImpl <em>Simple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.SimpleChoiceImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getSimpleChoice()
	 * @generated
	 */
	int SIMPLE_CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHOICE__CONTENT = COMPOSED_QUESTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHOICE__RESTRICTION = COMPOSED_QUESTION__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHOICE__CHOICE = COMPOSED_QUESTION__CHOICE;

	/**
	 * The number of structural features of the '<em>Simple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHOICE_FEATURE_COUNT = COMPOSED_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHOICE_OPERATION_COUNT = COMPOSED_QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.MultiChoiceImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getMultiChoice()
	 * @generated
	 */
	int MULTI_CHOICE = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__CONTENT = COMPOSED_QUESTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__RESTRICTION = COMPOSED_QUESTION__RESTRICTION;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__CHOICE = COMPOSED_QUESTION__CHOICE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__MIN = COMPOSED_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__MAX = COMPOSED_QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_FEATURE_COUNT = COMPOSED_QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_OPERATION_COUNT = COMPOSED_QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.RestrictionImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 8;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.AppendableElementImpl <em>Appendable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.AppendableElementImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getAppendableElement()
	 * @generated
	 */
	int APPENDABLE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Default Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDABLE_ELEMENT__DEFAULT_QUANTITY = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Appendable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDABLE_ELEMENT_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Appendable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDABLE_ELEMENT_OPERATION_COUNT = RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl <em>Dependent Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getDependentElement()
	 * @generated
	 */
	int DEPENDENT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_ELEMENT__QUESTION = RESTRICTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_ELEMENT__EXPECTED_VALUE = RESTRICTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_ELEMENT_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dependent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_ELEMENT_OPERATION_COUNT = RESTRICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ContentImpl
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent <em>Elementary Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Component</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent
	 * @generated
	 */
	EClass getElementaryComponent();

	/**
	 * Returns the meta object for the containment reference '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent#getRestriction()
	 * @see #getElementaryComponent()
	 * @generated
	 */
	EReference getElementaryComponent_Restriction();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Block#getChidren <em>Chidren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chidren</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Block#getChidren()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Chidren();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion <em>Composed Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Question</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion
	 * @generated
	 */
	EClass getComposedQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion#getChoice()
	 * @see #getComposedQuestion()
	 * @generated
	 */
	EReference getComposedQuestion_Choice();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.SimpleChoice <em>Simple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Choice</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.SimpleChoice
	 * @generated
	 */
	EClass getSimpleChoice();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice
	 * @generated
	 */
	EClass getMultiChoice();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMin()
	 * @see #getMultiChoice()
	 * @generated
	 */
	EAttribute getMultiChoice_Min();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice#getMax()
	 * @see #getMultiChoice()
	 * @generated
	 */
	EAttribute getMultiChoice_Max();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement <em>Appendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appendable Element</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement
	 * @generated
	 */
	EClass getAppendableElement();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement#getDefaultQuantity <em>Default Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Quantity</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement#getDefaultQuantity()
	 * @see #getAppendableElement()
	 * @generated
	 */
	EAttribute getAppendableElement_DefaultQuantity();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement <em>Dependent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Element</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement
	 * @generated
	 */
	EClass getDependentElement();

	/**
	 * Returns the meta object for the reference '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement#getQuestion()
	 * @see #getDependentElement()
	 * @generated
	 */
	EReference getDependentElement_Question();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement#getExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Value</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement#getExpectedValue()
	 * @see #getDependentElement()
	 * @generated
	 */
	EAttribute getDependentElement_ExpectedValue();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Labelable <em>Labelable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labelable</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Labelable
	 * @generated
	 */
	EClass getLabelable();

	/**
	 * Returns the meta object for the containment reference list '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Labelable#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Labelable#getContent()
	 * @see #getLabelable()
	 * @generated
	 */
	EReference getLabelable_Content();

	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Content#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Content#getText()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Text();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.Content#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.Content#getLanguage()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Language();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionnaireFactory getQuestionnaireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ElementaryComponentImpl <em>Elementary Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ElementaryComponentImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getElementaryComponent()
		 * @generated
		 */
		EClass ELEMENTARY_COMPONENT = eINSTANCE.getElementaryComponent();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_COMPONENT__RESTRICTION = eINSTANCE.getElementaryComponent_Restriction();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.BlockImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Chidren</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CHIDREN = eINSTANCE.getBlock_Chidren();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.TextFieldImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ComposedQuestionImpl <em>Composed Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ComposedQuestionImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getComposedQuestion()
		 * @generated
		 */
		EClass COMPOSED_QUESTION = eINSTANCE.getComposedQuestion();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_QUESTION__CHOICE = eINSTANCE.getComposedQuestion_Choice();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ChoiceImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.SimpleChoiceImpl <em>Simple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.SimpleChoiceImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getSimpleChoice()
		 * @generated
		 */
		EClass SIMPLE_CHOICE = eINSTANCE.getSimpleChoice();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.MultiChoiceImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getMultiChoice()
		 * @generated
		 */
		EClass MULTI_CHOICE = eINSTANCE.getMultiChoice();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE__MIN = eINSTANCE.getMultiChoice_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CHOICE__MAX = eINSTANCE.getMultiChoice_Max();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.RestrictionImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.AppendableElementImpl <em>Appendable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.AppendableElementImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getAppendableElement()
		 * @generated
		 */
		EClass APPENDABLE_ELEMENT = eINSTANCE.getAppendableElement();

		/**
		 * The meta object literal for the '<em><b>Default Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENDABLE_ELEMENT__DEFAULT_QUANTITY = eINSTANCE.getAppendableElement_DefaultQuantity();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl <em>Dependent Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.DependentElementImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getDependentElement()
		 * @generated
		 */
		EClass DEPENDENT_ELEMENT = eINSTANCE.getDependentElement();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT_ELEMENT__QUESTION = eINSTANCE.getDependentElement_Question();

		/**
		 * The meta object literal for the '<em><b>Expected Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT_ELEMENT__EXPECTED_VALUE = eINSTANCE.getDependentElement_ExpectedValue();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.LabelableImpl <em>Labelable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.LabelableImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getLabelable()
		 * @generated
		 */
		EClass LABELABLE = eINSTANCE.getLabelable();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELABLE__CONTENT = eINSTANCE.getLabelable_Content();

		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.ContentImpl
		 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.impl.QuestionnairePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TEXT = eINSTANCE.getContent_Text();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__LANGUAGE = eINSTANCE.getContent_Language();

	}

} //QuestionnairePackage
