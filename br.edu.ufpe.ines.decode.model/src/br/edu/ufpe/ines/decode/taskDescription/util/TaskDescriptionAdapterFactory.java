/**
 */
package br.edu.ufpe.ines.decode.taskDescription.util;

import br.edu.ufpe.ines.decode.aux.Identifiable;
import br.edu.ufpe.ines.decode.aux.Nameable;

import br.edu.ufpe.ines.decode.taskDescription.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage
 * @generated
 */
public class TaskDescriptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaskDescriptionPackage.eINSTANCE;
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
	protected TaskDescriptionSwitch<Adapter> modelSwitch =
		new TaskDescriptionSwitch<Adapter>() {
			@Override
			public Adapter caseModeledTask(ModeledTask object) {
				return createModeledTaskAdapter();
			}
			@Override
			public Adapter caseSequencial(Sequencial object) {
				return createSequencialAdapter();
			}
			@Override
			public Adapter caseRandom(Random object) {
				return createRandomAdapter();
			}
			@Override
			public Adapter caseComposedTask(ComposedTask object) {
				return createComposedTaskAdapter();
			}
			@Override
			public Adapter caseExperimentalTask(ExperimentalTask object) {
				return createExperimentalTaskAdapter();
			}
			@Override
			public Adapter caseRestriction(Restriction object) {
				return createRestrictionAdapter();
			}
			@Override
			public Adapter caseQuestionnaireMeasurement(QuestionnaireMeasurement object) {
				return createQuestionnaireMeasurementAdapter();
			}
			@Override
			public Adapter caseExecutionDerivations(ExecutionDerivations object) {
				return createExecutionDerivationsAdapter();
			}
			@Override
			public Adapter caseTimeRestriction(TimeRestriction object) {
				return createTimeRestrictionAdapter();
			}
			@Override
			public Adapter caseSpecficRestriction(SpecficRestriction object) {
				return createSpecficRestrictionAdapter();
			}
			@Override
			public Adapter caseEclipseRetriction(EclipseRetriction object) {
				return createEclipseRetrictionAdapter();
			}
			@Override
			public Adapter caseOtherRestriction(OtherRestriction object) {
				return createOtherRestrictionAdapter();
			}
			@Override
			public Adapter caseModeledRestrictions(ModeledRestrictions object) {
				return createModeledRestrictionsAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask <em>Modeled Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledTask
	 * @generated
	 */
	public Adapter createModeledTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.Sequencial <em>Sequencial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Sequencial
	 * @generated
	 */
	public Adapter createSequencialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Random
	 * @generated
	 */
	public Adapter createRandomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.ComposedTask <em>Composed Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ComposedTask
	 * @generated
	 */
	public Adapter createComposedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask <em>Experimental Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask
	 * @generated
	 */
	public Adapter createExperimentalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement <em>Questionnaire Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.QuestionnaireMeasurement
	 * @generated
	 */
	public Adapter createQuestionnaireMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations <em>Execution Derivations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations
	 * @generated
	 */
	public Adapter createExecutionDerivationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction <em>Time Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.TimeRestriction
	 * @generated
	 */
	public Adapter createTimeRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.SpecficRestriction <em>Specfic Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.SpecficRestriction
	 * @generated
	 */
	public Adapter createSpecficRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction <em>Eclipse Retriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction
	 * @generated
	 */
	public Adapter createEclipseRetrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.OtherRestriction <em>Other Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.OtherRestriction
	 * @generated
	 */
	public Adapter createOtherRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions <em>Modeled Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions
	 * @generated
	 */
	public Adapter createModeledRestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.taskDescription.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.taskDescription.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.aux.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.aux.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.aux.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.aux.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
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

} //TaskDescriptionAdapterFactory
