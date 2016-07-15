package br.ufpe.ines.decode.plugin.sandbox;

public class SandBoxService {

	public void recordEvent(String what, String kind, String description,
			String bundleId, String bundleVersion) {
		System.out.println("=recordEvent 1=");
		System.out.println("what="+what);
		System.out.println("kind="+kind);
		System.out.println("description="+description);
		System.out.println("bundleVersion="+bundleVersion);
		
	}

	public void recordEvent(String what, String command, String commandId, String bundleId) {
		System.out.println("=recordEvent 2=");
		System.out.println("what="+what);
		System.out.println("command="+command);
		System.out.println("commandId="+commandId);
		System.out.println("bundleId="+bundleId);
	}
	
	public void recordEvent(ActionInterface actionType, String commandId, String bundleId) {
		System.out.println("=recordEvent 2=");
		System.out.println("what="+actionType.getKind());
		System.out.println("command="+actionType.getDescription());
		System.out.println("commandId="+commandId);
		System.out.println("bundleId="+bundleId);
	}

}
