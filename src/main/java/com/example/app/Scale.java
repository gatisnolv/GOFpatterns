package com.example.app;

import java.util.ArrayList;
import java.util.List;

class Scale implements Observable {
    private List<Observer> observers;

    Scale() {
        observers = new ArrayList<Observer>();
    }

    public void setScale(int scale) {
        observers.stream().forEach(o -> o.update(scale));
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}