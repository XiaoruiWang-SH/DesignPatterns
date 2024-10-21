package org.example.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Expression {
    private ArrayList<Element> elements = new ArrayList<>();
    private String exp;

    public Expression(String s) {
        exp = s;
        Arrays.stream(s.split("")).forEach(c -> elements.add(classify(c)));
    }

    private Element classify(String c) {
        if (isInteger(c)) {
            return new Number(c);
        }
        if (Objects.equals(c, "+") || Objects.equals(c, "-") || Objects.equals(c, "*") || Objects.equals(c, "/")) {
            return new Operator(c);
        }
        return new Variable(c);
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public void accept(Visitor visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
    }
}
