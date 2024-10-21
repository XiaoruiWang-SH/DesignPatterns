package org.example.visitor;

public interface Visitor {

    String output();

    void visit(Number element);

    void visit(Operator element);

    void visit(Variable element);
}
