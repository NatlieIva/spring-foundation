package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.service.CoffeeHouse;

@ComponentScan("ru.itsjava")
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        context.getBean("MainBean", CoffeeHouse.class).coffeeSale();
    }
}
