package org.example.observer;

public class Window implements Observer {
    @Override
    public void notify_() {
        System.out.println("Close the window");
    }
}
