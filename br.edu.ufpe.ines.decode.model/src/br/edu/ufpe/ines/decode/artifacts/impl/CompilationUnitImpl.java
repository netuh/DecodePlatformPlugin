/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.CompilationUnit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CompilationUnitImpl extends FileArtifactImpl implements CompilationUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.COMPILATION_UNIT;
	}

} //CompilationUnitImpl
