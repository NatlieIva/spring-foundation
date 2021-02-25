package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {
    Coffee order;

    @Override
    public Coffee getCoffeeByPrice(double price) {
        for (Coffee coffee : Coffee.values()) {
            if (coffee.getPrice() == price) {
                order = coffee;
                break;
            }
        }
        return order;
    }
}
