package br.ufpe.ines.decode.plugin.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

public class EclipseUtil {

	public static String getAvailableName(String id) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String projectName = id;
		IProject project = root.getProject(projectName);
		int projectCounter = 1; 
		while (project.exists()){
			projectName = id+"-"+projectCounter++;
			project = root.getProject(id);
		}
		return projectName;
	}

}
