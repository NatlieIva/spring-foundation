package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {

    @Override
    public Coffee getCoffeeByPrice(double price) {
        for (Coffee coffee : Coffee.values()) {
            if (coffee.getPrice() == price)
                return coffee;
        }
        return null;
//        throw new NoSuchElementException("There is no coffee at this price");
    }
}
