/**
 */
package be.edu.ufpe.ines.decode;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see be.edu.ufpe.ines.decode.DecodePackage
 * @generated
 */
public interface DecodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecodeFactory eINSTANCE = be.edu.ufpe.ines.decode.impl.DecodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coding Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding Experiment</em>'.
	 * @generated
	 */
	CodingExperiment createCodingExperiment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DecodePackage getDecodePackage();

} //DecodeFactory
