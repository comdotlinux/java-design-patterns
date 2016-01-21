package com.linux.designpatterns.facade.log;

import java.util.Date;

import com.linux.designpatterns.facade.enums.LogLevel;

public interface Logger {

	void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender, char logSeperator,
			String logMessage);

	void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender, char logSeperator,
			Throwable throwable, String logMessage);

}
