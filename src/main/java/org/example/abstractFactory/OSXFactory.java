package org.example.abstractFactory;

public class OSXFactory extends GUIFactory {
    @Override
    public GUIButton newButton() {
        return new OSXButton();
    }
}
