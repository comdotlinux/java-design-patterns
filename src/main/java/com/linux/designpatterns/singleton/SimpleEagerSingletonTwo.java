package com.linux.designpatterns.singleton;

/**
 * A different take on simple singleton with get Instance method.
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SimpleEagerSingletonTwo {

	private static final SimpleEagerSingletonTwo SINGLETON = new SimpleEagerSingletonTwo();

	private SimpleEagerSingletonTwo() {

	}

	public static SimpleEagerSingletonTwo getInstance() {
		return SINGLETON;
	}

}
