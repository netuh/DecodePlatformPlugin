package br.ufpe.ines.decode.plugin.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class ConfiguredExperiment {

	private Experiment basicExperiment;
	private Map<String, String> fileContents = new HashMap<String, String>();
	private static final Logger logger = Logger.getLogger(ConfiguredExperiment.class);
	
	public ConfiguredExperiment(Experiment exp){
		basicExperiment = exp;
	}
	
	public ConfiguredExperiment(Experiment exp1, Map<String, String> fileContent) throws Exception {
		basicExperiment = exp1;
		if((exp1.getSources().size() <= fileContent.keySet().size()) && 
			exp1.getSources().stream()
				.allMatch(file -> fileContent.keySet().contains(file.getFile()))){
			this.fileContents = fileContent;
		} else {
			for (String fileName : fileContent.keySet()) {
				logger.debug("file content name="+fileName);
			}
			
			for (SourceCode source : exp1.getSources()) {
				logger.debug("source name="+source.getFile());
			}
			logger.debug("contents="+exp1.getSources().stream()
					.allMatch(file -> fileContent.keySet().contains(file.getFile())));
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

	@Override
	public int hashCode(){
		return basicExperiment.hashCode();
	}

	public Experiment getBasicExperiment() {
		return basicExperiment;
	}

	public Set<String> getDefaultFileNames() {
		return fileContents.keySet();		
	}

	public String getDefaultFileContent(String file) {
		return fileContents.get(file);
	}
}
