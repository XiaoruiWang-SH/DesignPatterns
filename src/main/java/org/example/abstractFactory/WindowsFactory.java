package org.example.abstractFactory;

public class WindowsFactory extends GUIFactory{

    @Override
    public GUIButton newButton() {
        return new WindowsButton();
    }
}
