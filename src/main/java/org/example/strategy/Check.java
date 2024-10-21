package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class Check {
    private final ArrayList<Double> entries = new ArrayList<>();
    private Pricer pricer;

    public Check(Pricer pricer) {
        this.pricer = pricer;
    }

    public void use(Pricer pricer) {
        this.pricer = pricer;
    }

    public void charge(Item item) {
        entries.add(pricer.price(item));
    }

    public double total() {
        double total = 0;
        for (double price: entries) {
            total += price;
        }
        return total;
    }
}
