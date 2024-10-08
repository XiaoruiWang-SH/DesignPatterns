package org.example.abstractFactory;


public abstract class GUIFactory {
    static public GUIFactory factory(OSType osType) {
        switch (osType){
            case Windows -> {
                return new WindowsFactory();
            }
            case OSX -> {
                return new OSXFactory();
            }
        }
        return null;
    }

    public abstract GUIButton newButton();
}
