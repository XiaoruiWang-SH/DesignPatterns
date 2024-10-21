package org.example.visitor;

import java.security.PublicKey;

public abstract class Element {
    String value;
    Element(String value) {
        this.value = value;
    }

    abstract void accept(Visitor visitor);
    public String text() {
        return value;
    }
}
