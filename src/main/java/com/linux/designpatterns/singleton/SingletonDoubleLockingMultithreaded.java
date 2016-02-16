package com.linux.designpatterns.singleton;

/**
 * Using double locking to reduce use of synchronization.
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SingletonDoubleLockingMultithreaded {
    private volatile static SingletonDoubleLockingMultithreaded singleton = null;
    
    private SingletonDoubleLockingMultithreaded(){
        
    }
    
    public static SingletonDoubleLockingMultithreaded getInstance(){
        if(singleton == null){
            synchronized(SingletonDoubleLockingMultithreaded.class){
                if(singleton == null){
                    singleton = new SingletonDoubleLockingMultithreaded();
                }
            }
        }
        
        return singleton;
    }
}
