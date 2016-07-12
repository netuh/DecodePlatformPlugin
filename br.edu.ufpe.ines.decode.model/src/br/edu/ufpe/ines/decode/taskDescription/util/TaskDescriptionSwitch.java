/**
 */
package br.edu.ufpe.ines.decode.taskDescription.util;

import br.edu.ufpe.ines.decode.aux.Nameable;

import br.edu.ufpe.ines.decode.taskDescription.*;

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
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.SEQUENCIAL: {
				Sequencial sequencial = (Sequencial)theEObject;
				T result = caseSequencial(sequencial);
				if (result == null) result = caseComposedTask(sequencial);
				if (result == null) result = caseModeledTask(sequencial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.RANDOM: {
				Random random = (Random)theEObject;
				T result = caseRandom(random);
				if (result == null) result = caseComposedTask(random);
				if (result == null) result = caseModeledTask(random);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.COMPOSED_TASK: {
				ComposedTask composedTask = (ComposedTask)theEObject;
				T result = caseComposedTask(composedTask);
				if (result == null) result = caseModeledTask(composedTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.EXPERIMENTAL_TASK: {
				ExperimentalTask experimentalTask = (ExperimentalTask)theEObject;
				T result = caseExperimentalTask(experimentalTask);
				if (result == null) result = caseModeledTask(experimentalTask);
				if (result == null) result = caseNameable(experimentalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaskDescriptionPackage.PLACEMENT_QUESTIONNAIRE: {
				PlacementQuestionnaire placementQuestionnaire = (PlacementQuestionnaire)theEObject;
				T result = casePlacementQuestionnaire(placementQuestionnaire);
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
	 * Returns the result of interpreting the object as an instance of '<em>Placement Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementQuestionnaire(PlacementQuestionnaire object) {
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
