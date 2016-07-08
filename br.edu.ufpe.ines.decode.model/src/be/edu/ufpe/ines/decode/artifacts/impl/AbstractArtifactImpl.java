/**
 */
package be.edu.ufpe.ines.decode.artifacts.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import be.edu.ufpe.ines.decode.artifacts.AbstractArtifact;
import be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage;
import be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import be.edu.ufpe.ines.decode.aux.impl.NameableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl#getArtifactDomain <em>Artifact Domain</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl#getFile <em>File</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.impl.AbstractArtifactImpl#getLocalFilePath <em>Local File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractArtifactImpl extends NameableImpl implements AbstractArtifact {
	/**
	 * The default value of the '{@link #getArtifactDomain() <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactDomain()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactLanguage ARTIFACT_DOMAIN_EDEFAULT = ArtifactLanguage.COMMON;

	/**
	 * The cached value of the '{@link #getArtifactDomain() <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactDomain()
	 * @generated
	 * @ordered
	 */
	protected ArtifactLanguage artifactDomain = ARTIFACT_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected byte[] file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFilePath() <em>Local File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalFilePath() <em>Local File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String localFilePath = LOCAL_FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.ABSTRACT_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLanguage getArtifactDomain() {
		return artifactDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactDomain(ArtifactLanguage newArtifactDomain) {
		ArtifactLanguage oldArtifactDomain = artifactDomain;
		artifactDomain = newArtifactDomain == null ? ARTIFACT_DOMAIN_EDEFAULT : newArtifactDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN, oldArtifactDomain, artifactDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(byte[] newFile) {
		byte[] oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.ABSTRACT_ARTIFACT__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalFilePath() {
		return localFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalFilePath(String newLocalFilePath) {
		System.out.println("pronto");
		String oldLocalFilePath = localFilePath;
		localFilePath = newLocalFilePath;
		
	    Path path = Paths.get(localFilePath);
	    System.out.println("pronto Começou");
	    if (path.toFile().exists()){
			try {
				byte[] file = Files.readAllBytes(path);
				setFile(file);
				System.out.println("pronto Terminou");
			} catch (IOException e) {
				file = null;
			}
	    }
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.ABSTRACT_ARTIFACT__LOCAL_FILE_PATH, oldLocalFilePath, localFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				return getArtifactDomain();
			case ArtifactsPackage.ABSTRACT_ARTIFACT__FILE:
				return getFile();
			case ArtifactsPackage.ABSTRACT_ARTIFACT__LOCAL_FILE_PATH:
				return getLocalFilePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				setArtifactDomain((ArtifactLanguage)newValue);
				return;
			case ArtifactsPackage.ABSTRACT_ARTIFACT__FILE:
				setFile((byte[])newValue);
				return;
			case ArtifactsPackage.ABSTRACT_ARTIFACT__LOCAL_FILE_PATH:
				setLocalFilePath((String)newValue);
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
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				setArtifactDomain(ARTIFACT_DOMAIN_EDEFAULT);
				return;
			case ArtifactsPackage.ABSTRACT_ARTIFACT__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ArtifactsPackage.ABSTRACT_ARTIFACT__LOCAL_FILE_PATH:
				setLocalFilePath(LOCAL_FILE_PATH_EDEFAULT);
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
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				return artifactDomain != ARTIFACT_DOMAIN_EDEFAULT;
			case ArtifactsPackage.ABSTRACT_ARTIFACT__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ArtifactsPackage.ABSTRACT_ARTIFACT__LOCAL_FILE_PATH:
				return LOCAL_FILE_PATH_EDEFAULT == null ? localFilePath != null : !LOCAL_FILE_PATH_EDEFAULT.equals(localFilePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifactDomain: ");
		result.append(artifactDomain);
		result.append(", file: ");
		result.append(file);
		result.append(", localFilePath: ");
		result.append(localFilePath);
		result.append(')');
		return result.toString();
	}

} //AbstractArtifactImpl