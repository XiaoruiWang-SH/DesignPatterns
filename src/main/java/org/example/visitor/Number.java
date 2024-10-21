package org.example.visitor;

public class Number extends Element {

    Number(String value) {
        super(value);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
