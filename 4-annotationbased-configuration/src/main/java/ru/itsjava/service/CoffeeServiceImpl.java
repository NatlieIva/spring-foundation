package ru.itsjava.service;

import org.springframework.stereotype.Service;
import ru.itsjava.domain.Coffee;

import java.util.NoSuchElementException;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Override
    public Coffee getCoffeeByPrice(double price) {
        for (Coffee coffee : Coffee.values()) {
            if (coffee.getPrice() == price)
                return coffee;
        }
        throw new NoSuchElementException("There is no coffee at this price");
    }
}
