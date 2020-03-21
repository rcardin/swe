package it.unipd.math.swe.patterns.mv.mvc;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private final List<Observer> observers;

    protected Subject() {
        this.observers = new ArrayList<>();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    protected void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
