package com.linux.designpatterns.facade.enums;

/**
 * Enumeration for selecting different log levels
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public enum LogLevel {

	TRACE("TRACE_MESSAGE"),
	DEBUG("DEBUG_MESSAGE"),
	INFO("INFO_MESSAGE"),
	WARNING("WARNING_MESSAGE"),
	ERROR("ERROR_MESSAGE"),
	FATAL("FATAL_MESSAGE");
	
	private final String messageName;

	private LogLevel(String messageName){
		this.messageName = messageName;
	}

	public String getMessageName() {
		return messageName;
	}
	
}
