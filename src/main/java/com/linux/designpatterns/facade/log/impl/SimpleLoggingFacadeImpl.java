package com.linux.designpatterns.facade.log.impl;

import java.util.Date;

import com.linux.designpatterns.facade.enums.LogLevel;
import com.linux.designpatterns.facade.log.Logger;
import com.linux.designpatterns.facade.log.SimpleLoggingFacade;

/**
 * Implementation of {@linkplain SimpleLoggingFacade}
 *
 *  @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SimpleLoggingFacadeImpl implements SimpleLoggingFacade {

	private final Logger logger;
	private Date logDate;
	private boolean useSystemDate = false;
	private String pattern;
	private String patternAppender;
	private char logSeperator;

	public SimpleLoggingFacadeImpl(Logger logger) {
		this.logger = logger;
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public void setDate(Date logDate) {
		this.logDate = logDate;

	}

	@Override
	public void useSystemDate() {
		this.useSystemDate = true;
	}

	@Override
	public void setDatePattern(String pattern) {
		this.pattern = pattern;

	}

	@Override
	public void setExtraInformation(String patternAppender) {
		this.patternAppender = patternAppender;

	}

	@Override
	public void setLogMessageSeperator(char logSeperator) {
		this.logSeperator = logSeperator;

	}

	@Override
	public void log(LogLevel logLevel, String logMessage) {
		this.logger.log(logLevel, useSystemDate ? new Date() : logDate, pattern, patternAppender, logSeperator,
				logMessage);
	}

	@Override
	public void log(LogLevel logLevel, String logMessage, Throwable throwable) {
		this.logger.log(logLevel, useSystemDate ? new Date() : logDate, pattern, patternAppender, logSeperator,
				throwable, logMessage);

	}

}
