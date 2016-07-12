/**
 */
package br.edu.ufpe.ines.decode.aux;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.aux.AuxPackage
 * @generated
 */
public interface AuxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuxFactory eINSTANCE = br.edu.ufpe.ines.decode.aux.impl.AuxFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuxPackage getAuxPackage();

} //AuxFactory
