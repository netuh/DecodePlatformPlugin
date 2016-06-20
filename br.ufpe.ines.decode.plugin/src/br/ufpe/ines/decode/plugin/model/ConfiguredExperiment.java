package br.ufpe.ines.decode.plugin.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConfiguredExperiment {

	private Experiment basicExperiment;
	private Map<String, String> fileContents = new HashMap<String, String>();
	
	public ConfiguredExperiment(Experiment exp){
		basicExperiment = exp;
	}
	
	public ConfiguredExperiment(Experiment exp1, Map<String, String> fileContent) throws Exception {
		basicExperiment = exp1;
		if((exp1.getSources().size() == fileContent.keySet().size()) && 
			exp1.getSources().stream()
				.allMatch(file -> fileContent.keySet().contains(file.getFile()))){
			this.fileContents = fileContent;
		} else {
			throw new Exception("all contens are not supported");
		}
	}

	@Override
	public boolean equals(Object obj){
		if (obj == null || !(obj instanceof ConfiguredExperiment))
			return false;
		ConfiguredExperiment ce = (ConfiguredExperiment)obj; 
 		return basicExperiment.equals(ce.getBasicExperiment());
	}

	private Experiment getBasicExperiment() {
		return basicExperiment;
	}

	public Set<String> getDefaultFiles() {
		return fileContents.keySet();		
	}
}
