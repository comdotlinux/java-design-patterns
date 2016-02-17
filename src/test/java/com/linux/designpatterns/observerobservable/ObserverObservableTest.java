/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.designpatterns.observerobservable;

import com.linux.designpatterns.observerobservable.impl.ObservableImpl;
import com.linux.designpatterns.observerobservable.impl.ObserverImpl;
import org.junit.After;
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

    @Test
    public void testObserverObservable() {
        final ObserverImpl observerOne = new ObserverImpl("Observer One");
        final ObserverImpl observerTwo = new ObserverImpl("Observer Two");
        final ObserverImpl observerThree = new ObserverImpl("Observer Three");
        observable.subscribe(observerOne)
                    .subscribe(observerTwo)
                    .subscribe(observerThree)
                    .subscribe(new ObserverImpl("Observer Four"))
                    .notifyObservervables("Update One");
    }

}
