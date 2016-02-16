package com.linux.designpatterns.singleton;

/**
 * Using the {@code synchronized} keyword on the {@code getInstance()} method.
 * This way every thread is forced to wait it's turn before it can enter the method.
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SingletonLazySimpleMultithreaded {
    private static SingletonLazySimpleMultithreaded singleton;
    
    private SingletonLazySimpleMultithreaded(){
    }
    
    /**
     * Get the instance of this singleton.
     * @return instance of {@linkplain SingletonLazySimpleMultithreaded}
     */
    public static synchronized SingletonLazySimpleMultithreaded getInstance(){
        if(singleton == null){
            singleton = new SingletonLazySimpleMultithreaded();
        }
        
        return singleton;
    }
    
    
    
}
