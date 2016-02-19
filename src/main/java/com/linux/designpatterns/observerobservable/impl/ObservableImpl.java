package com.linux.designpatterns.observerobservable.impl;

import com.linux.designpatterns.observerobservable.Observable;
import java.util.ArrayList;
import java.util.List;
import com.linux.designpatterns.observerobservable.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the {@linkplain Observable}
 * @author guru.a.kulkarni
 */
public class ObservableImpl implements Observable<String> {

    private final String name;

    public ObservableImpl(String name){
        this.name = name;
    }
    
    private final List<Observer<String>> observers = new ArrayList<>();
    
    private static final Logger LOG = LoggerFactory.getLogger(ObservableImpl.class);
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Observable<String> subscribe(Observer<String> observable) {
        LOG.info("Adding observable {} to {}", observable, name);
        boolean added = this.observers.add(observable);
        LOG.info("Added observable to {} ? {}", name, added);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Observable<String> unsubscribe(Observer<String> observable) {
        LOG.info("Removing observable {} from name", observable, name);
        boolean removed = this.observers.remove(observable);
         LOG.info("Removed observable from {}? {}", name, removed);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyObservervables(String t) {
        LOG.info("{} :: Notifying observers... that observed value is updated to {}", name, t);
        for (Observer<String> observer : observers) {
            observer.updated(t);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getInformation() {
        return "This Obeservable uses String as the data to notify the observers";
    }

}
