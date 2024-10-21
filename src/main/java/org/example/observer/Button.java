package org.example.observer;

public class Button extends Subject {

    public void onClick() {
        onStateUpdate();
    }
}
