package ru.itsjava.domain;

public enum Coffee {
    AMERICANO("Americano", 100.0),
    LATTE("Latte", 200.0),
    CAPPUCCINO("Cappuccino", 150.0),
    ESPRESSO("Espresso", 50.0);

    private final String name;
    private final double price;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    Coffee(String name, double price) {
        this.name = name;
        this.price = price;


    }
}
