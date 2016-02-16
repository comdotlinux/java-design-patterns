package com.linux.designpatterns.observerobservable;

/**
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 * @param <T> Type of Data that this Observer has.
 */
public interface Observer<T> {

    /**
     * The notification method that the Observable calls on change of the T
     * @param t the changed value of the Data.
     */
    public void updated(T t);
    
}
