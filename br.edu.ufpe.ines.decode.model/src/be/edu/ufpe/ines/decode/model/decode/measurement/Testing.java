/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.measurement.Testing#getObservePassedTest <em>Observe Passed Test</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage#getTesting()
 * @model
 * @generated
 */
public interface Testing extends Execution {
	/**
	 * Returns the value of the '<em><b>Observe Passed Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observe Passed Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observe Passed Test</em>' attribute.
	 * @see #setObservePassedTest(Boolean)
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage#getTesting_ObservePassedTest()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getObservePassedTest();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Testing#getObservePassedTest <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observe Passed Test</em>' attribute.
	 * @see #getObservePassedTest()
	 * @generated
	 */
	void setObservePassedTest(Boolean value);

} // Testing
