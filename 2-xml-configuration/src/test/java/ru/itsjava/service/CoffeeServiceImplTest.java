package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Coffee;

@DisplayName("Класс CoffeeServiceImpl должен: ")
public class CoffeeServiceImplTest {
    @DisplayName("Корректно выдавать кофе по заданной цене")
    @Test
    public void getCoffee() {
        CoffeeServiceImpl coffeeService = new CoffeeServiceImpl();
        double price = 100.0;
        Assertions.assertEquals(Coffee.AMERICANO, coffeeService.getCoffeeByPrice(price));
    }
}
