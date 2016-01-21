package com.linux.designpatterns.facade.log;

import java.util.Date;

import com.linux.designpatterns.facade.enums.LogLevel;

public interface SimpleLoggingFacade {

	Logger getLogger();

	void setDate(Date logDate);

	void useSystemDate();

	void setDatePattern(String pattern);

	void setExtraInformation(String patternAppender);

	void setLogMessageSeperator(char logSeperator);

	void log(LogLevel logLevel, String logMessage);

	void log(LogLevel logLevel, String logMessage, Throwable throwable);
}
