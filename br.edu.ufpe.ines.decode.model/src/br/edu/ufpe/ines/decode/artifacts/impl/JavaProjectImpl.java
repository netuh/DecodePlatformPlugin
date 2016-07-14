/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.JavaCompUnit;
import br.edu.ufpe.ines.decode.artifacts.JavaProject;

import br.edu.ufpe.ines.decode.artifacts.OtherFile;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.JavaProjectImpl#getOtherFiles <em>Other Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaProjectImpl extends ProjectIDEImpl implements JavaProject {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaCompUnit> classes;

	/**
	 * The cached value of the '{@link #getOtherFiles() <em>Other Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherFile> otherFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.JAVA_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaCompUnit> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<JavaCompUnit>(JavaCompUnit.class, this, ArtifactsPackage.JAVA_PROJECT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherFile> getOtherFiles() {
		if (otherFiles == null) {
			otherFiles = new EObjectContainmentEList<OtherFile>(OtherFile.class, this, ArtifactsPackage.JAVA_PROJECT__OTHER_FILES);
		}
		return otherFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactsPackage.JAVA_PROJECT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ArtifactsPackage.JAVA_PROJECT__OTHER_FILES:
				return ((InternalEList<?>)getOtherFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactsPackage.JAVA_PROJECT__CLASSES:
				return getClasses();
			case ArtifactsPackage.JAVA_PROJECT__OTHER_FILES:
				return getOtherFiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtifactsPackage.JAVA_PROJECT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends JavaCompUnit>)newValue);
				return;
			case ArtifactsPackage.JAVA_PROJECT__OTHER_FILES:
				getOtherFiles().clear();
				getOtherFiles().addAll((Collection<? extends OtherFile>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArtifactsPackage.JAVA_PROJECT__CLASSES:
				getClasses().clear();
				return;
			case ArtifactsPackage.JAVA_PROJECT__OTHER_FILES:
				getOtherFiles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArtifactsPackage.JAVA_PROJECT__CLASSES:
				return classes != null && !classes.isEmpty();
			case ArtifactsPackage.JAVA_PROJECT__OTHER_FILES:
				return otherFiles != null && !otherFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaProjectImpl
