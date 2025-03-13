package org.example.lab3;

import org.springframework.stereotype.Component;

@Component
public class Parrot extends Animal {
    @Override
    public String makeSound() {
        return "Chirp!";
    }
}