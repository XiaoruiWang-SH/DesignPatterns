package org.example.visitor;

public class Variable extends Element {
    Variable(String value) {
        super(value);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
