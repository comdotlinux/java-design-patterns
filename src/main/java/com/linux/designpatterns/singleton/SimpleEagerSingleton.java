package com.linux.designpatterns.singleton;

/**
 * Simple Singleton that is initialized eagerly.
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SimpleEagerSingleton {

    /**
     * Use this is instance within your code.
     */
    public static final SimpleEagerSingleton SINGLETON = new SimpleEagerSingleton();

	private SimpleEagerSingleton(){
		
	}
	
}
