/**
 */
package br.edu.ufpe.ines.decode.artifacts.questionnaire.impl;

import br.edu.ufpe.ines.decode.DecodePackage;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;

import br.edu.ufpe.ines.decode.artifacts.impl.ArtifactsPackageImpl;

import br.edu.ufpe.ines.decode.artifacts.questionnaire.AppendableElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Block;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Choice;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.ComposedQuestion;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Content;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.DependentElement;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.ElementaryComponent;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Labelable;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.MultiChoice;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Question;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnaireFactory;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.Restriction;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.SimpleChoice;
import br.edu.ufpe.ines.decode.artifacts.questionnaire.TextField;

import br.edu.ufpe.ines.decode.aux.AuxPackage;

import br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl;

import br.edu.ufpe.ines.decode.impl.DecodePackageImpl;

import br.edu.ufpe.ines.decode.measurement.MeasurementPackage;

import br.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import br.edu.ufpe.ines.decode.taskDescription.impl.TaskDescriptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.edu.ufpe.ines.decode.artifacts.questionnaire.QuestionnairePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionnairePackageImpl() {
		super(eNS_URI, QuestionnaireFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionnairePackage init() {
		if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

		// Obtain or create and register package
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DecodePackageImpl theDecodePackage = (DecodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) instanceof DecodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecodePackage.eNS_URI) : DecodePackage.eINSTANCE);
		TaskDescriptionPackageImpl theTaskDescriptionPackage = (TaskDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) instanceof TaskDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskDescriptionPackage.eNS_URI) : TaskDescriptionPackage.eINSTANCE);
		ArtifactsPackageImpl theArtifactsPackage = (ArtifactsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) instanceof ArtifactsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtifactsPackage.eNS_URI) : ArtifactsPackage.eINSTANCE);
		MeasurementPackageImpl theMeasurementPackage = (MeasurementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) instanceof MeasurementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementPackage.eNS_URI) : MeasurementPackage.eINSTANCE);
		AuxPackageImpl theAuxPackage = (AuxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) instanceof AuxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuxPackage.eNS_URI) : AuxPackage.eINSTANCE);

		// Create package meta-data objects
		theQuestionnairePackage.createPackageContents();
		theDecodePackage.createPackageContents();
		theTaskDescriptionPackage.createPackageContents();
		theArtifactsPackage.createPackageContents();
		theMeasurementPackage.createPackageContents();
		theAuxPackage.createPackageContents();

		// Initialize created meta-data
		theQuestionnairePackage.initializePackageContents();
		theDecodePackage.initializePackageContents();
		theTaskDescriptionPackage.initializePackageContents();
		theArtifactsPackage.initializePackageContents();
		theMeasurementPackage.initializePackageContents();
		theAuxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionnairePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
		return theQuestionnairePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryComponent() {
		return elementaryComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryComponent_Restriction() {
		return (EReference)elementaryComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Chidren() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedQuestion() {
		return composedQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedQuestion_Choice() {
		return (EReference)composedQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleChoice() {
		return simpleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiChoice() {
		return multiChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiChoice_Min() {
		return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiChoice_Max() {
		return (EAttribute)multiChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppendableElement() {
		return appendableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendableElement_DefaultQuantity() {
		return (EAttribute)appendableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentElement() {
		return dependentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentElement_Question() {
		return (EReference)dependentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentElement_ExpectedValue() {
		return (EAttribute)dependentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelable() {
		return labelableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelable_Content() {
		return (EReference)labelableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Text() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Language() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactory getQuestionnaireFactory() {
		return (QuestionnaireFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementaryComponentEClass = createEClass(ELEMENTARY_COMPONENT);
		createEReference(elementaryComponentEClass, ELEMENTARY_COMPONENT__RESTRICTION);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__CHIDREN);

		questionEClass = createEClass(QUESTION);

		textFieldEClass = createEClass(TEXT_FIELD);

		composedQuestionEClass = createEClass(COMPOSED_QUESTION);
		createEReference(composedQuestionEClass, COMPOSED_QUESTION__CHOICE);

		choiceEClass = createEClass(CHOICE);

		simpleChoiceEClass = createEClass(SIMPLE_CHOICE);

		multiChoiceEClass = createEClass(MULTI_CHOICE);
		createEAttribute(multiChoiceEClass, MULTI_CHOICE__MIN);
		createEAttribute(multiChoiceEClass, MULTI_CHOICE__MAX);

		restrictionEClass = createEClass(RESTRICTION);

		appendableElementEClass = createEClass(APPENDABLE_ELEMENT);
		createEAttribute(appendableElementEClass, APPENDABLE_ELEMENT__DEFAULT_QUANTITY);

		dependentElementEClass = createEClass(DEPENDENT_ELEMENT);
		createEReference(dependentElementEClass, DEPENDENT_ELEMENT__QUESTION);
		createEAttribute(dependentElementEClass, DEPENDENT_ELEMENT__EXPECTED_VALUE);

		labelableEClass = createEClass(LABELABLE);
		createEReference(labelableEClass, LABELABLE__CONTENT);

		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__TEXT);
		createEAttribute(contentEClass, CONTENT__LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementaryComponentEClass.getESuperTypes().add(this.getLabelable());
		blockEClass.getESuperTypes().add(this.getElementaryComponent());
		questionEClass.getESuperTypes().add(this.getElementaryComponent());
		textFieldEClass.getESuperTypes().add(this.getQuestion());
		composedQuestionEClass.getESuperTypes().add(this.getQuestion());
		choiceEClass.getESuperTypes().add(this.getLabelable());
		simpleChoiceEClass.getESuperTypes().add(this.getComposedQuestion());
		multiChoiceEClass.getESuperTypes().add(this.getComposedQuestion());
		appendableElementEClass.getESuperTypes().add(this.getRestriction());
		dependentElementEClass.getESuperTypes().add(this.getRestriction());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementaryComponentEClass, ElementaryComponent.class, "ElementaryComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryComponent_Restriction(), this.getRestriction(), null, "restriction", null, 0, 1, ElementaryComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Chidren(), this.getElementaryComponent(), null, "chidren", null, 1, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composedQuestionEClass, ComposedQuestion.class, "ComposedQuestion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedQuestion_Choice(), this.getChoice(), null, "choice", null, 2, -1, ComposedQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleChoiceEClass, SimpleChoice.class, "SimpleChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiChoiceEClass, MultiChoice.class, "MultiChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiChoice_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiChoice_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, MultiChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appendableElementEClass, AppendableElement.class, "AppendableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppendableElement_DefaultQuantity(), theXMLTypePackage.getIntObject(), "defaultQuantity", null, 0, 1, AppendableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentElementEClass, DependentElement.class, "DependentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentElement_Question(), this.getQuestion(), null, "question", null, 1, 1, DependentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependentElement_ExpectedValue(), theXMLTypePackage.getString(), "expectedValue", null, 0, 1, DependentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelableEClass, Labelable.class, "Labelable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelable_Content(), this.getContent(), null, "content", null, 1, -1, Labelable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Language(), theXMLTypePackage.getString(), "language", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //QuestionnairePackageImpl
