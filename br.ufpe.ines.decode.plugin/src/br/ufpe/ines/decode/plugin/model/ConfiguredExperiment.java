package br.ufpe.ines.decode.plugin.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import br.ufpe.ines.decode.plugin.Activator;
import br.ufpe.ines.decode.plugin.control.ExperimentManager;

public class ConfiguredExperiment {

	private Experiment basicExperiment;
	private Map<String, String> defaultFileContents = new HashMap<String, String>();
	private ExperimentStatus currentStatus;
	protected static ExperimentManager manager = ExperimentManager.getInstance();
	//private static final Logger logger = Logger.getLogger(ConfiguredExperiment.class);
	
	public ConfiguredExperiment(Experiment exp){
		basicExperiment = exp;
		currentStatus = ExperimentStatus.INITIALIZED; 
	}
	
	public ConfiguredExperiment(Experiment exp1, Map<String, String> defaultFileContents) throws Exception {
		basicExperiment = exp1;
		currentStatus = ExperimentStatus.INITIALIZED;

		if((exp1.getSources().size() <= defaultFileContents.keySet().size()) && 
			exp1.getSources().stream()
				.allMatch(file -> defaultFileContents.keySet().contains(file.getFile()))){
			this.defaultFileContents = defaultFileContents;
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

	@Override
	public int hashCode(){
		return basicExperiment.hashCode();
	}

	public Experiment getBasicExperiment() {
		return basicExperiment;
	}

	public Set<String> getDefaultFileNames() {
		return defaultFileContents.keySet();		
	}

	public String getDefaultFileContent(String fileName) {
		return defaultFileContents.get(fileName);
	}
	
	public ExperimentStatus getStatus(){
		return currentStatus;
	}
	
	public void setStatus(ExperimentStatus newStatus){
		currentStatus = newStatus;
	}

	public Image getImage() {
		return currentStatus.getRelatedImage();
	}

	public enum ExperimentStatus {
		INITIALIZED {
	        @Override
	        public Image getRelatedImage() {
	            return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/ic_event_available.png"));
	        }
	    }, 
		IN_PROGRESS {
	        @Override
	        public Image getRelatedImage() {
	            return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/ic_event_note.png"));
	        }
	    },
		COMPLETE {
	        @Override
	        public Image getRelatedImage() {
	            return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/sample.gif"));
	        }
	    };


	    public abstract Image getRelatedImage();
	}

//	public void statusSelect() {
//		currentStatus = ExperimentStatus.IN_PROGRESS;
//		manager.setSelectedExperiment(this);
//	}
}
