package org.example.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    protected Set<Observer> subscribers = new HashSet<>();

    public void register(Observer observer) {
        subscribers.add(observer);
    }

    public void deregister(Observer observer) {
        subscribers.remove(observer);
    }

    public void onStateUpdate() {
        for (Observer observer: subscribers) {
            observer.notify_();
        }
    }
}
