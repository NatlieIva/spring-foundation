package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public enum Coffee {
    AMERICANO("Americano", 100.0),
    LATTE("Latte", 200.0),
    CAPPUCCINO("Cappuccino", 150.0),
    ESPRESSO("Espresso", 50.0);

    private final String name;
    private final double price;

}
