package com.linux.designpatterns.adapter.cc.impl;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linux.designpatterns.facade.enums.LogLevel;
import com.linux.designpatterns.facade.log.Logger;
import com.linux.designpatterns.facade.log.SimpleLoggingFacade;
import com.linux.designpatterns.facade.log.impl.LoggerImpl;
import com.linux.designpatterns.facade.log.impl.SimpleLoggingFacadeImpl;

public class FacadePatternTest {

	private Logger logger; 
	
	SimpleLoggingFacade slf;
	
	@Before
	public void setUp() throws Exception {
		logger = new LoggerImpl();
		slf = new SimpleLoggingFacadeImpl(logger);
		slf.useSystemDate();
		slf.setDatePattern("DD-mm-yyyy");
		slf.setExtraInformation("My Application");
		slf.setLogMessageSeperator('-');
	}
	
	@After
	public void tearDown(){
		System.out.println("--");
	}

	/**
	 * Using Direct Logger WITHOUT Facade
	 */
	@Test
	public void testLog() {
		System.out.println("Using Direct Logger Without Facade");
		logger.log(LogLevel.DEBUG, new Date(), "DD-mm-yyyy", "My Application",'-', "First Log Message");
	}

	/**
	 * Using Direct Logger WITHOUT Facade
	 */
	@Test
	public void testLogWithThrowable() {
		System.out.println("Using Direct Logger With Exception Without Facade");
		logger.log(LogLevel.ERROR, new Date(), "DD-mm-yyyy", "My Application",'-', new Exception("Exception"),"First Log Message");
	}
	
	/**
	 * Using Direct Logger WITHOUT Facade
	 */
	@Test
	public void testLogFacade() {
		System.out.println("Using Direct Logger WITH Facade");
		slf.log(LogLevel.DEBUG, "First Log Message");
	}

	/**
	 * Using Direct Logger WITHOUT Facade
	 */
	@Test
	public void testLogFacadeWithThrowable() {
		System.out.println("Using Direct Logger with Exception WITH Facade");
		slf.log(LogLevel.ERROR, "First Log Message", new Exception("Exception"));
		
	}

}
