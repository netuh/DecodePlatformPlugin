/**
 */
package br.ufpe.ines.decode.decode.taskDescription.util;

import br.ufpe.ines.decode.decode.aux.Identifiable;
import br.ufpe.ines.decode.decode.aux.Nameable;

import br.ufpe.ines.decode.decode.taskDescription.*;

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
 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage
 * @generated
 */
public class TaskDescriptionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionSwitch() {
		if (modelPackage == null) {
			modelPackage = TaskDescriptionPackage.eINSTANCE;
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
			case TaskDescriptionPackage.MODELED_TASK: {
				ModeledTask modeledTask = (ModeledTask)theEObject;
				T result = caseModeledTask(modeledTask);
				if (result == null) result = caseNameable(modeledTask);
				if (result == null) result = caseIdentifiable(modeledTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.SEQUENCIAL: {
				Sequencial sequencial = (Sequencial)theEObject;
				T result = caseSequencial(sequencial);
				if (result == null) result = caseComposedTask(sequencial);
				if (result == null) result = caseModeledTask(sequencial);
				if (result == null) result = caseNameable(sequencial);
				if (result == null) result = caseIdentifiable(sequencial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.RANDOM: {
				Random random = (Random)theEObject;
				T result = caseRandom(random);
				if (result == null) result = caseComposedTask(random);
				if (result == null) result = caseModeledTask(random);
				if (result == null) result = caseNameable(random);
				if (result == null) result = caseIdentifiable(random);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.COMPOSED_TASK: {
				ComposedTask composedTask = (ComposedTask)theEObject;
				T result = caseComposedTask(composedTask);
				if (result == null) result = caseModeledTask(composedTask);
				if (result == null) result = caseNameable(composedTask);
				if (result == null) result = caseIdentifiable(composedTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.EXPERIMENTAL_TASK: {
				ExperimentalTask experimentalTask = (ExperimentalTask)theEObject;
				T result = caseExperimentalTask(experimentalTask);
				if (result == null) result = caseModeledTask(experimentalTask);
				if (result == null) result = caseNameable(experimentalTask);
				if (result == null) result = caseIdentifiable(experimentalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.QUESTIONNAIRE_MEASUREMENT: {
				QuestionnaireMeasurement questionnaireMeasurement = (QuestionnaireMeasurement)theEObject;
				T result = caseQuestionnaireMeasurement(questionnaireMeasurement);
				if (result == null) result = caseQuestionnairemeasure(questionnaireMeasurement);
				if (result == null) result = caseMeasurement(questionnaireMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.EXECUTION_DERIVATIONS: {
				ExecutionDerivations executionDerivations = (ExecutionDerivations)theEObject;
				T result = caseExecutionDerivations(executionDerivations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.TIME_RESTRICTION: {
				TimeRestriction timeRestriction = (TimeRestriction)theEObject;
				T result = caseTimeRestriction(timeRestriction);
				if (result == null) result = caseParameter(timeRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.IDE_PARAMETER: {
				IDEParameter ideParameter = (IDEParameter)theEObject;
				T result = caseIDEParameter(ideParameter);
				if (result == null) result = caseParameter(ideParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.ECLIPSE_PARAMETER: {
				EclipseParameter eclipseParameter = (EclipseParameter)theEObject;
				T result = caseEclipseParameter(eclipseParameter);
				if (result == null) result = caseIDEParameter(eclipseParameter);
				if (result == null) result = caseParameter(eclipseParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.GENERAL_PARAMETER: {
				GeneralParameter generalParameter = (GeneralParameter)theEObject;
				T result = caseGeneralParameter(generalParameter);
				if (result == null) result = caseParameter(generalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.OTHER_PARAMETERS: {
				OtherParameters otherParameters = (OtherParameters)theEObject;
				T result = caseOtherParameters(otherParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.MEASUREMENTS: {
				Measurements measurements = (Measurements)theEObject;
				T result = caseMeasurements(measurements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE: {
				PenAndPaperQuestionnaire penAndPaperQuestionnaire = (PenAndPaperQuestionnaire)theEObject;
				T result = casePenAndPaperQuestionnaire(penAndPaperQuestionnaire);
				if (result == null) result = caseQuestionnairemeasure(penAndPaperQuestionnaire);
				if (result == null) result = caseMeasurement(penAndPaperQuestionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.QUESTIONNAIREMEASURE: {
				Questionnairemeasure questionnairemeasure = (Questionnairemeasure)theEObject;
				T result = caseQuestionnairemeasure(questionnairemeasure);
				if (result == null) result = caseMeasurement(questionnairemeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeled Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeled Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeledTask(ModeledTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequencial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequencial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencial(Sequencial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandom(Random object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedTask(ComposedTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalTask(ExperimentalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireMeasurement(QuestionnaireMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Derivations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Derivations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionDerivations(ExecutionDerivations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRestriction(TimeRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDE Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDE Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDEParameter(IDEParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eclipse Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eclipse Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclipseParameter(EclipseParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralParameter(GeneralParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherParameters(OtherParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurements(Measurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pen And Paper Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pen And Paper Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePenAndPaperQuestionnaire(PenAndPaperQuestionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnairemeasure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnairemeasure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnairemeasure(Questionnairemeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
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

} //TaskDescriptionSwitch
