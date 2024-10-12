package org.example.composite;

import java.util.ArrayList;

public class Window extends Composite{

    ArrayList<Component> components = new ArrayList<>();

    @Override
    public void resize() {
        for (Component component: components) {
            component.resize();
        }
    }

    @Override
    public void draw() {
        for (Component component: components) {
            component.draw();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }
}