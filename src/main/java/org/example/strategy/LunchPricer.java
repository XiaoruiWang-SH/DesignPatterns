package org.example.strategy;

public class LunchPricer implements Pricer{
    @Override
    public double price(Item item) {
        return 0.8 * item.listPrice();
    }
}
