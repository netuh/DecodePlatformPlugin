/**
 */
package br.edu.ufpe.ines.decode.aux;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.aux.AuxFactory
 * @model kind="package"
 * @generated
 */
public interface AuxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aux";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "aux";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aux";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuxPackage eINSTANCE = br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.edu.ufpe.ines.decode.aux.impl.NameableImpl <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.edu.ufpe.ines.decode.aux.impl.NameableImpl
	 * @see br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link br.edu.ufpe.ines.decode.aux.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see br.edu.ufpe.ines.decode.aux.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link br.edu.ufpe.ines.decode.aux.Nameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.edu.ufpe.ines.decode.aux.Nameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuxFactory getAuxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.edu.ufpe.ines.decode.aux.impl.NameableImpl <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.edu.ufpe.ines.decode.aux.impl.NameableImpl
		 * @see br.edu.ufpe.ines.decode.aux.impl.AuxPackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

	}

} //AuxPackage
