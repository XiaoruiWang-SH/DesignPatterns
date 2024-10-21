package org.example.visitor;

public class HtmlVisitor extends AbstractVisitor {

    @Override
    public String output() {
        return output;
    }

    @Override
    public void visit(Number element) {
        output += element.text();
    }

    @Override
    public void visit(Operator element) {
        output += "\\" + element.text();
    }

    @Override
    public void visit(Variable element) {
        output += "<i>" + element.text() + "</i>";
    }
}
