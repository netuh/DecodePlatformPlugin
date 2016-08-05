/**
 */
package br.ufpe.ines.decode.decode.taskDescription.measurements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.measurements.TestExecution#isObservePassedTest <em>Observe Passed Test</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage#getTestExecution()
 * @model
 * @generated
 */
public interface TestExecution extends Execution {
	/**
	 * Returns the value of the '<em><b>Observe Passed Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observe Passed Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observe Passed Test</em>' attribute.
	 * @see #setObservePassedTest(boolean)
	 * @see br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage#getTestExecution_ObservePassedTest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isObservePassedTest();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.decode.taskDescription.measurements.TestExecution#isObservePassedTest <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe Passed Test</em>' attribute.
	 * @see #isObservePassedTest()
	 * @generated
	 */
	void setObservePassedTest(boolean value);

} // TestExecution
