/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.observerobservable;

import com.linux.designpatterns.observerobservable.impl.ObservableImpl;
import com.linux.designpatterns.observerobservable.impl.ObserverImpl;
import static org.easymock.EasyMock.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for Observer Observable Pattern
 *
 * @author Guruprasad Kulkarni <guru@linux.com>
 */
public class ObserverObservableTest {

    private Observable<String> observable;

    @Before
    public void setUp() {
        observable = new ObservableImpl("ObservableUnderTestOne");
    }

    /**
     * Just a run -- no asserts here check log output for details.
     */
    @Test
    public void runObserverObservable() {
        final ObserverImpl observerOne = new ObserverImpl("Observer One");
        final ObserverImpl observerTwo = new ObserverImpl("Observer Two");
        final ObserverImpl observerThree = new ObserverImpl("Observer Three");

        // Adding three Observers and notifying
        observable.subscribe(observerOne)
                .subscribe(observerTwo)
                .subscribe(observerThree)
                .subscribe(new ObserverImpl("Observer Four"))
                .notifyObservervables("First Update.");

        // Removing One observer and notifying
        observable.unsubscribe(observerOne)
                .notifyObservervables("Second Update.");
    }

    @Test
    public void testObserverNotifiedOnObservableChange() {
        //Arrange
        Observer<String> observerOne = createMock(Observer.class);
        observerOne.updated(anyString());// should get called
        replay(observerOne);
        //Act
        this.observable.subscribe(observerOne);
        this.observable.notifyObservervables("First Update");

        //Assert
        verify(observerOne);

    }

    @Test
    public void testObserverNOT_NotifiedOnObservableChangeAfterUnSubscribing() {
        //Arrange
        Observer<String> observerOne = createMock(Observer.class);
        // Setting expectation that this wshould get called.
        observerOne.updated(anyString());// should get called

        Observer<String> observerTwo = createMock(Observer.class);

        replay(observerOne, observerTwo);

        //Act
        this.observable.subscribe(observerOne).subscribe(observerTwo);

        this.observable.unsubscribe(observerTwo);

        this.observable.notifyObservervables("First Update");

        //Assert
        // One will throw Error if updated method is not called and two will throw error if updated method is called.
        verify(observerOne, observerTwo);

    }

}
