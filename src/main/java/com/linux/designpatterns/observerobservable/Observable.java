
package com.linux.designpatterns.observerobservable;

/**
 * The Observable Interface that maintains and notifies the pre-registered Observer.
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 * @param <T> Type of Data that the Observable observes.
 */
public interface Observable<T> {
    
    /**
     * Subscribe to this Observer to get notified 
     * @param observable instance of {@linkplain Observable}
     * @return {@Code this} for method chaining.
     */
    public Observable<T> subscribe(Observer<T> observable);

    /**
     * Un-subscribe from this Observer
     * @param observable instance of {@linkplain Observable}
     * @return {@Code this} for method chaining.
     */
    public Observable<T> unsubscribe(Observer<T> observable);

    /**
     * Notify all {@linkplain Observable} that the state has changed.
     * @param t The Data that need to be sent with Notification.
     */
    public void notifyObservervables(T t);

    /**
     * Get some information about this {@code Observer}
     * @return information about this {@code Observer}
     */
    public String getInformation();
}
