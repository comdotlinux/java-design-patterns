package com.linux.designpatterns.facade.log;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.linux.designpatterns.facade.enums.LogLevel;
import com.linux.designpatterns.facade.log.Logger;
/**
 * Implementation of {@linkplain Logger} interface
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SystemOutLogger implements Logger {

	@Override
	public void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender,char logSeperator, String logMessage) {
		StringBuilder builder = new StringBuilder(logLevel.getMessageName()).append(logSeperator);
		builder.append(new SimpleDateFormat(pattern).format(logDate)).append(logSeperator);
		builder.append(patternAppender).append(logSeperator);
		builder.append(logMessage);
		System.out.println(builder.toString());
	}

	@Override
	public void log(LogLevel logLevel, Date logDate, String pattern, String patternAppender,char logSeperator, Throwable throwable,
			String logMessage) {
		StringBuilder builder = new StringBuilder(logLevel.getMessageName()).append(logSeperator);
		builder.append(new SimpleDateFormat(pattern).format(logDate)).append(logSeperator);
		builder.append(patternAppender).append(logSeperator);
		builder.append(logMessage).append(logSeperator);
		builder.append(throwable.getMessage());
		System.out.println(builder.toString());

	}

}
