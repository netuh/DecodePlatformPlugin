package br.ufpe.ines.decode.plugin.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

import br.edu.ufpe.ines.decode.artifacts.JavaCompUnit;
import br.edu.ufpe.ines.decode.artifacts.JavaProject;
import br.edu.ufpe.ines.decode.artifacts.Library;
import br.edu.ufpe.ines.decode.artifacts.OtherFile;

public class JavaProjectCreator {

	static final Logger logger = Logger.getLogger(JavaProjectCreator.class);

	public IProject createProject(JavaProject javaProjectArtifact) throws CoreException, IOException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String projectName = EclipseUtil.getAvailableName(javaProjectArtifact.getProjectName());
		IProject project = root.getProject(projectName);
		project.create(null);
		project.open(null);

		IJavaProject javaProject = createJavaProject(project);
		createBin(project, javaProject);
		fixClasspath(javaProject, javaProjectArtifact.getRequiredLibrary());
		IFolder sourceFolder = createSrc(project, javaProject);
		for (JavaCompUnit javaCU : javaProjectArtifact.getClasses()) {
			addToSrc(javaProject, sourceFolder, javaCU);
		}
		for (OtherFile javaCU : javaProjectArtifact.getOtherFiles()) {
			addToProject(project, javaCU);
		}
		return project;
	}

	private void addToProject(IProject project, OtherFile javaCU) throws CoreException, IOException {
		File file2;
		String pathComplement = "";
		if (javaCU.getFolder() != null){
			for (String element : javaCU.getFolder().split("[.]")) {
				System.out.println("element="+element);
				pathComplement += File.separator + element;
			}
		}
		file2 = new File(project.getWorkspace().getRoot().getLocation() 
				+ project.getFullPath().toString() +pathComplement+ File.separator +javaCU.getName());
		file2.getParentFile().mkdirs();
		file2.createNewFile();
		Files.write(file2.toPath(), javaCU.getFile());
		project.refreshLocal(IProject.DEPTH_INFINITE, null);
	}

	private void addToSrc(IJavaProject javaProject, IFolder sourceFolder, JavaCompUnit javaCU) throws JavaModelException, UnsupportedEncodingException {
		IPackageFragment pack = null;
		if (javaCU.getPackage() != null){
			pack = javaProject
					.getPackageFragmentRoot(sourceFolder)
					.createPackageFragment(javaCU.getPackage(), true, null); 
		} else {
			pack = javaProject
					.getPackageFragmentRoot(sourceFolder).getPackageFragment("");
		}
		
		StringBuffer buffer = new StringBuffer();
		String decodedSource = new String(javaCU.getFile(), "UTF-8");
		buffer.append(decodedSource);

		pack.createCompilationUnit(javaCU.getName(), buffer.toString(), false, null);
	}

	private IJavaProject createJavaProject(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		project.setDescription(description, null);
		IJavaProject javaProject = JavaCore.create(project);
		return javaProject;
	}

	private void createBin(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException {
		IFolder binFolder = project.getFolder("bin");
		binFolder.create(false, true, new NullProgressMonitor());
		javaProject.setOutputLocation(binFolder.getFullPath(), new NullProgressMonitor());
	}

	private void fixClasspath(IJavaProject javaProject, EList<Library> eList) throws CoreException {
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]),
				new NullProgressMonitor());
		for (Library aLibrary : eList) {
			InputStream is = new ByteArrayInputStream(aLibrary.getFile());
			IFolder libFoulder = javaProject.getProject().getFolder("lib");
			if (!libFoulder.exists())
				libFoulder.create(false, true, null);
			IFile file = libFoulder.getFile(aLibrary.getName());
		    //IFile file = javaProject.getProject().getFile(aLibrary.getName());
		    file.create(is, false, null);

		    IPath path = file.getFullPath();
		    entries.add(JavaCore.newLibraryEntry(path, null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]),
				new NullProgressMonitor());
	}

	private IFolder createSrc(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException, IOException {
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		IPackageFragmentRoot root2 = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root2.getPath());
		javaProject.setRawClasspath(newEntries, null);
		return sourceFolder;
	}
}
