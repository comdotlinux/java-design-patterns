package com.linux.designpatterns.singleton;

public class SimpleLazySingelton {

	private static SimpleLazySingelton singleton = null;
	private SimpleLazySingelton(){
		
	}
	
	public static SimpleLazySingelton getInstance(){
		if(singleton == null){
			singleton = new SimpleLazySingelton();
		}
		
		return singleton;
	}
	
}
