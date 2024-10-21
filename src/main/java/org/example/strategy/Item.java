package org.example.strategy;

public class Item {
    private final double price;

    public Item(double price) {
        this.price = price;
    }

    public double listPrice() {
        return this.price;
    }
}
