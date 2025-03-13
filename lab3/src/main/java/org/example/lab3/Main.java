package org.example.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        // Получаем всех животных из контекста
        Map<String, Animal> animals = context.getBeansOfType(Animal.class);

        // Выводим звуки всех животных
        animals.forEach((name, animal) -> System.out.println(name + ": " + animal.makeSound()));
    }
}