package br.ufpe.ines.decode.plugin.model;

public class SourceCode {

	private String file;
	private String subPackage;
	
	public void setFile(String newFile) {
		file = newFile;
	}
	
	public String getFile() {
		return file;
	}

	public String getSubPackage() {
		return subPackage;
	}
	
	public void setSubPackage(String newSsubPackage) {
		subPackage = newSsubPackage;
	}

}
