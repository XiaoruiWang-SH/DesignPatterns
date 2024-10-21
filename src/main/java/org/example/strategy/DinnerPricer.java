package org.example.strategy;

public class DinnerPricer implements Pricer {
    @Override
    public double price(Item item) {
        return item.listPrice();
    }
}
