package br.ufpe.ines.decode.plugin.model;

import java.time.LocalDateTime;

public class LoggedAction {

	private String file;
	private LocalDateTime timeStamp;
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
}
