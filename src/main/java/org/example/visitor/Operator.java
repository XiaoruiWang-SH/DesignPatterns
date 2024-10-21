package org.example.visitor;

public class Operator extends Element {
    Operator(String value) {
        super(value);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
