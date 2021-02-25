package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {
    Coffee coffee;

    @Override
    public Coffee getCoffeeByPrice(double price) {
        for (Coffee coffee : Coffee.values()) {
            if (coffee.getPrice() == price)
                break;
        }
        return coffee;
    }
}
