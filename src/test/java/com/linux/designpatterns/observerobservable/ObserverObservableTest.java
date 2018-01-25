/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.observerobservable;

import com.linux.designpatterns.observerobservable.impl.SimpleObservable;
import com.linux.designpatterns.observerobservable.impl.SimpleObserver;
import static org.easymock.EasyMock.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
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
        observable = new SimpleObservable("Observable Under Test");
    }

    /**
     * Just a run -- no useful asserts here check log output for details.
     */
    @Test
    public void runObserverObservable() {
        System.out.println("com.linux.designpatterns.observerobservable.ObserverObservableTest.runObserverObservable()");
        final SimpleObserver observerOne = new SimpleObserver("Observer One");
        final SimpleObserver observerTwo = new SimpleObserver("Observer Two");
        final SimpleObserver observerThree = new SimpleObserver("Observer Three");

        // Adding three Observers and notifying
        observable.subscribe(observerOne)
                .subscribe(observerTwo)
                .subscribe(observerThree)
                .subscribe(new SimpleObserver("Observer Four"))
                .notifyObservervables("First Update.");

        // Removing One observer and notifying
        observable.unsubscribe(observerOne)
                .notifyObservervables("Second Update.");
        
        //Adding fourth and notifying
        final SimpleObserver observerFour = new SimpleObserver("Observer Four");
        observable.subscribe(observerFour)
                .notifyObservervables("Third Update");
        
        //Displaying Status
        assertThat(observable.getInformation(), containsString("Obeservable"));
        System.out.println("ending com.linux.designpatterns.observerobservable.ObserverObservableTest.runObserverObservable()");
    }

    @Test
    public void testObserverNotifiedOnObservableChange() {
        System.out.println("com.linux.designpatterns.observerobservable.ObserverObservableTest.testObserverNotifiedOnObservableChange()");
        //Arrange
        Observer<String> observerOne = createMock(Observer.class);
        observerOne.updated(anyString());// should get called
        replay(observerOne);
        //Act
        this.observable.subscribe(observerOne);
        this.observable.notifyObservervables("First Update");

        //Assert
        verify(observerOne);
        System.out.println("ending com.linux.designpatterns.observerobservable.ObserverObservableTest.testObserverNotifiedOnObservableChange()");
    }

    @Test
    public void testObserverNOT_NotifiedOnObservableChangeAfterUnSubscribing() {
        System.out.println("com.linux.designpatterns.observerobservable.ObserverObservableTest.testObserverNOT_NotifiedOnObservableChangeAfterUnSubscribing()");
        
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

        System.out.println("ending com.linux.designpatterns.observerobservable.ObserverObservableTest.testObserverNOT_NotifiedOnObservableChangeAfterUnSubscribing()");
    }

}
