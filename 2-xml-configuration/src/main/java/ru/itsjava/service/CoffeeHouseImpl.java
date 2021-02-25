package ru.itsjava.service;

import java.util.Scanner;


public class CoffeeHouseImpl implements CoffeeHouse {
    private final CoffeeService coffeeService;

    public CoffeeHouseImpl(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @Override
    public void coffeeSale() {
        double order;
        System.out.println("Hello! What price do you want coffee?");
        try (
        Scanner console = new Scanner( System.in)) {
        order = console.nextDouble();
        }
        System.out.println(
                coffeeService.getCoffeeByPrice(order).getName() + " for you");
    }
}
