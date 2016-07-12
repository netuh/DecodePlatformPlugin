/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage
 * @generated
 */
public interface MeasurementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementsFactory eINSTANCE = br.edu.ufpe.ines.decode.taskDescription.measurements.impl.MeasurementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time On Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time On Task</em>'.
	 * @generated
	 */
	TimeOnTask createTimeOnTask();

	/**
	 * Returns a new object of class '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edition</em>'.
	 * @generated
	 */
	Edition createEdition();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>Any Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Action</em>'.
	 * @generated
	 */
	AnyAction createAnyAction();

	/**
	 * Returns a new object of class '<em>Test Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Execution</em>'.
	 * @generated
	 */
	TestExecution createTestExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeasurementsPackage getMeasurementsPackage();

} //MeasurementsFactory
