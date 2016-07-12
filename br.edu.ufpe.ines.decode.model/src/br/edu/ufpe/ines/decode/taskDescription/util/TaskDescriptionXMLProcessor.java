/**
 */
package br.edu.ufpe.ines.decode.taskDescription.util;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TaskDescriptionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TaskDescriptionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TaskDescriptionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TaskDescriptionResourceFactoryImpl());
		}
		return registrations;
	}

} //TaskDescriptionXMLProcessor
