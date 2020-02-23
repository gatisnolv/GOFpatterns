package com.example.app;

interface Observable {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
}