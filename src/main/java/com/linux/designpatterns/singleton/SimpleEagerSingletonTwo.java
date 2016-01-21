package com.linux.designpatterns.singleton;

public class SimpleEagerSingletonTwo {

	private static SimpleEagerSingletonTwo singleton = new SimpleEagerSingletonTwo();

	private SimpleEagerSingletonTwo() {

	}

	public static SimpleEagerSingletonTwo getInstance() {
		return singleton;
	}

}
