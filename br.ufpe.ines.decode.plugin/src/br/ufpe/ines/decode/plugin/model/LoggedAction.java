package br.ufpe.ines.decode.plugin.model;

import java.time.Instant;

public class LoggedAction {

	private String file;
	private Instant timeStamp;
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Instant getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}
}
