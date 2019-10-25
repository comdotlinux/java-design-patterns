package com.linux.designpatterns.observerobservable.impl;

import com.linux.designpatterns.observerobservable.Observable;
import com.linux.designpatterns.observerobservable.Observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable<T> implements Observable<T> {

	private final String name;
	private final List<Observer<T>> observers;

	public SimpleObservable(String name) {
		this(name, new ArrayList<>());
	}

	public SimpleObservable(String name, List<Observer<T>> observers) {
		this.name = name;
		this.observers = observers;
		System.out.println("com.linux.designpatterns.observerobservable.impl.SimpleObservable created in " + name);
	}


	@Override
	public Observable<T> subscribe(Observer<T> observer) {
		observers.add(observer);
		System.out.println("com.linux.designpatterns.observerobservable.impl.SimpleObservable observer added in " + name);
		return this;
	}

	@Override
	public Observable<T> unsubscribe(Observer<T> observable) {
		observers.remove(observable);
		return this;
	}

	@Override
	public void notifyObservervables(T t) {
		observers.forEach(observer -> observer.updated(t));
	}

	@Override
	public String getInformation() {
		return name;
	}
}
