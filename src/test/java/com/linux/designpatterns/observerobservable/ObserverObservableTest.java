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
        observable.subscribe(new ObserverImpl("Observer One"));
    }

   
}
