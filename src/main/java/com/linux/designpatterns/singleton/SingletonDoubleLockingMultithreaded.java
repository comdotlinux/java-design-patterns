package com.linux.designpatterns.singleton;

/**
 * Using double locking to reduce use of synchronization.
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class SingletonDoubleLockingMultithreaded {
    private volatile static SingletonDoubleLockingMultithreaded singleton = null;
    
    private SingletonDoubleLockingMultithreaded(){
        
    }
    
    /**
     * Get the instance of this class
     * @return a Singleton instance of this class
     */
    public static SingletonDoubleLockingMultithreaded getInstance(){
        SingletonDoubleLockingMultithreaded sc = SingletonDoubleLockingMultithreaded.singleton;
        if(sc == null){
            synchronized(SingletonDoubleLockingMultithreaded.class){
                sc = SingletonDoubleLockingMultithreaded.singleton;
                if(sc == null){
                    SingletonDoubleLockingMultithreaded.singleton = sc = new SingletonDoubleLockingMultithreaded();
                }
            }
        }
        
        return sc;
    }
}
