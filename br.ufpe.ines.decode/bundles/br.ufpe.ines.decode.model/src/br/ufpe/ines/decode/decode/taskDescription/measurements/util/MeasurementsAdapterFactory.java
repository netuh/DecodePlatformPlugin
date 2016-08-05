/**
 */
package br.ufpe.ines.decode.decode.taskDescription.measurements.util;

import br.ufpe.ines.decode.decode.taskDescription.Measurement;

import br.ufpe.ines.decode.decode.taskDescription.measurements.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage
 * @generated
 */
public class MeasurementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeasurementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MeasurementsPackage.eINSTANCE;
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
	protected MeasurementsSwitch<Adapter> modelSwitch =
		new MeasurementsSwitch<Adapter>() {
			@Override
			public Adapter caseAutomaticMeasurement(AutomaticMeasurement object) {
				return createAutomaticMeasurementAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter caseFinalTask(FinalTask object) {
				return createFinalTaskAdapter();
			}
			@Override
			public Adapter caseEdition(Edition object) {
				return createEditionAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseAnyAction(AnyAction object) {
				return createAnyActionAdapter();
			}
			@Override
			public Adapter caseTestExecution(TestExecution object) {
				return createTestExecutionAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.AutomaticMeasurement <em>Automatic Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.AutomaticMeasurement
	 * @generated
	 */
	public Adapter createAutomaticMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.FinalTask <em>Final Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.FinalTask
	 * @generated
	 */
	public Adapter createFinalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.Edition
	 * @generated
	 */
	public Adapter createEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.AnyAction <em>Any Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.AnyAction
	 * @generated
	 */
	public Adapter createAnyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.TestExecution <em>Test Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.TestExecution
	 * @generated
	 */
	public Adapter createTestExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.ufpe.ines.decode.decode.taskDescription.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.ufpe.ines.decode.decode.taskDescription.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
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

} //MeasurementsAdapterFactory
