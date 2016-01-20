package com.linux.designpatterns.facade.log.impl;

import java.util.Date;

import com.linux.designpatterns.facade.enums.LogLevel;
import com.linux.designpatterns.facade.log.Logger;

public class LoggerImpl implements Logger {

	@Override
	public void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender, String logMessage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender, Throwable throwable,
			String logMessage) {
		// TODO Auto-generated method stub

	}

}
