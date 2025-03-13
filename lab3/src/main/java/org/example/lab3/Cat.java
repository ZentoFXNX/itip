package org.example.lab3;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}